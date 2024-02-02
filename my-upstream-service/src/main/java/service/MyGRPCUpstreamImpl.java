package service;

import com.adobe.acp.myupstream.*;
import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.Instant;
import java.time.OffsetDateTime;

import static service.InputConstants.NUM_OF_CHILDREN;

@GrpcService
public class MyGRPCUpstreamImpl extends MyUpstreamGrpc.MyUpstreamImplBase {

    private static final NodeInfo NODE_INFO = getNodeInfoSample();
    private static PageInfo PAGE_INFO = getPageInfoSample(NUM_OF_CHILDREN);

    public static void setChildCountAndInit(int numOfChildren) {
        PAGE_INFO = getPageInfoSample(numOfChildren);
    }

    @Override
    public void getInfo(AssetId request, StreamObserver<AssetInfo> responseObserver) {
        responseObserver.onNext(getAssetInfoForId(request));
        responseObserver.onCompleted();
    }

    private AssetInfo getAssetInfoForId(AssetId request) {
        return AssetInfo.newBuilder()
                .setId(request.getId())
                .setName("TheBigAsset")
                .build();
    }

    @Override
    public void getNodeInfo(AssetId request, StreamObserver<NodeInfo> responseObserver) {
        responseObserver.onNext(NODE_INFO);
        responseObserver.onCompleted();
    }

    @Override
    public void getPage(Limit request, StreamObserver<PageInfo> responseObserver) {
        responseObserver.onNext(PAGE_INFO);
        responseObserver.onCompleted();
    }

    private static NodeInfo getNodeInfoSample() {

        return NodeInfo.newBuilder()
                .setRepositoryId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setPartitionPrefix("29AC58C95DE604990A494213@domain10.us")
                .setBaseDirectoryId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setPath("/")
                .setSystem(NodeInfo.System.newBuilder()
                        .setIdPath("/urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .setAcpGuidPath("/1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .setScRootCollectionAssetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .setFullNamePath("/")
                        .setOrphaned(true)
                        .setClientId("cloud_platform")
                        .build())
                .setRegion("AP")
                .setOwner(NodeInfo.Owner.newBuilder()
                        .setId("29AC58C95DE604990A494213@domain10.us")
                        .setType("user")
                        .build())
                .setNodeId("1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setName("root")
                .setAssetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setMediaType("application/vnd.adobesc.directory+json")
                .setEtag("W/\"e68362bde05b727c8a230d8ac5ed9967\"")
                .setCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .setCreatedBy("29AC58C95DE604990A494213@domain10.us")
                .setModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .setModifiedBy("29AC58C95DE604990A494213@domain10.us")
                .setDeviceCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .setDeviceModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .setState("active")
                .setGenerations(NodeInfo.Generations.newBuilder()
                        .setRepoMetadata(9)
                        .setPrimary(9)
                        .build())
                .setRepoAssetClass("directory")
                .setNodeType("directory")
                .setModificationInfo(NodeInfo._modificationinfo.newBuilder().build())
                .build();
    }

    private static PageInfo getPageInfoSample(int noOfChildren) {

        var builder = PageInfo.newBuilder()
                .setRepositoryId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setPartitionPrefix("29AC58C95DE604990A494213@domain10.us")
                .setBaseDirectoryId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setPath("/")
                .setSystem(PageInfo.System.newBuilder()
                        .setIdPath("/urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .setAcpGuidPath("/1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .setScRootCollectionAssetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .setFullNamePath("/")
                        .setOrphaned(true)
                        .setClientId("cloud_platform")
                        .build())
                .setRegion("AP")
                .setOwner(PageInfo.Owner.newBuilder()
                        .setId("29AC58C95DE604990A494213@domain10.us")
                        .setType("user")
                        .build())
                .setNodeId("1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setName("root")
                .setAssetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setMediaType("application/vnd.adobesc.directory+json")
                .setEtag("W/\"e68362bde05b727c8a230d8ac5ed9967\"")
                .setCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .setCreatedBy("29AC58C95DE604990A494213@domain10.us")
                .setModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .setModifiedBy("29AC58C95DE604990A494213@domain10.us")
                .setDeviceCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .setDeviceModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .setState("active")
                .setGenerations(PageInfo.Generations.newBuilder()
                        .setRepoMetadata(9)
                        .setPrimary(9)
                        .build())
                .setRepoAssetClass("directory")
                .setNodeType("directory")
                .setModificationInfo(PageInfo._modificationinfo.newBuilder().build())
                .setPage(PageInfo._pagE.newBuilder().setPageBoundaryReached(true).build());
        for( int i=0; i < noOfChildren; i++){
            builder.addChildren(getChildNodeInfo(i+1));
        }
        return builder.build();
    }

    private static PageInfo.Child getChildNodeInfo(int num) {
        return PageInfo.Child.newBuilder()
                .setNodeId("1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setName("child-" + num)
                .setAssetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .setMediaType("application/vnd.adobesc.directory+json")
                .setEtag("W/\"e68362bde05b727c8a230d8ac5ed9967\"")
                .setCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .setCreatedBy("29AC58C95DE604990A494213@domain10.us")
                .setModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .setModifiedBy("29AC58C95DE604990A494213@domain10.us")
                .setDeviceCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .setDeviceModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .setState("active")
                .setGenerations(PageInfo.Generations.newBuilder()
                        .setRepoMetadata(9)
                        .setPrimary(9)
                        .build())
                .setRepoAssetClass("directory")
                .setNodeType("directory")
                .build();
    }


    private static Timestamp timestampFromString(String timeString) {
        Instant javaTimeInstant = OffsetDateTime.parse(timeString).toInstant();
        return Timestamp.newBuilder()
                .setSeconds(javaTimeInstant.getEpochSecond())
                .setNanos(javaTimeInstant.getNano())
                .build();
    }

}
