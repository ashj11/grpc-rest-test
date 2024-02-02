from grpc_requests import Client
import time
import numpy as np
import datetime
import requests
import logging
import json
requests_log = logging.getLogger("Client")
requests_log.setLevel(logging.CRITICAL)
logging.getLogger("Client").propagate = False

numberOfIterations = 100

def grpc() :
	endpoint = "127.0.0.1:9090"

	client = Client.get_by_endpoint(endpoint)
	print(client.service_names) # ["helloworld.Greeter"]

	service = "myupstream.MyUpstream"
	method = 'GetPage'
	timeTaken = [];
	for i in range(numberOfIterations) :
		start = time.time()
		result = client.request(service, method, {})
		end = time.time()
		#print(type(result)) # result is dict Type!!! not Stub Object!
		print(len(json.dumps(result)))
		# get difference
		t1 =  datetime.datetime.fromtimestamp(end)
		t2 = datetime.datetime.fromtimestamp(start)
		diff = t1 - t2
		timeTaken.append(diff.total_seconds() * 1000)
		print("GRPC iteration " + str(i) + " completed")

	p = np.percentile(timeTaken, 95)
	print("GRPC p95 : " + str(p))

def rest() :

	url = "http://localhost.charlesproxy.com:8081/pageInfo"

	timeTaken = [];
	for i in range(numberOfIterations) :
		start = time.time()
		#result = requests.get(url, headers={"Accept-Encoding":"gzip"})
		result = requests.get(url, headers={"Accept-Encoding":""})
		end = time.time()
		#print(type(result)) # result is dict Type!!! not Stub Object!
		print(len(json.dumps(result.json())))
		# get difference
		t1 =  datetime.datetime.fromtimestamp(end)
		t2 = datetime.datetime.fromtimestamp(start)
		diff = t1 - t2
		timeTaken.append(diff.total_seconds() * 1000)
		print("Rest iteration " + str(i) + " completed")


	p = np.percentile(timeTaken, 95)
	print("Rest p95 : " + str(p))

rest()
grpc()
