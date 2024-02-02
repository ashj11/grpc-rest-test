package service;

import org.springframework.web.bind.annotation.PostMapping;
import service.restentity.NodeInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.restentity.PageInfo;

import java.sql.Timestamp;
import java.time.Instant;

import static service.InputConstants.NUM_OF_CHILDREN;

@RestController
public class MyRestUpstreamImpl {

    private static final NodeInfo NODE_INFO = getNodeInfoSample();
    private static PageInfo PAGE_INFO = getPageInfoSample(NUM_OF_CHILDREN);

    public static void setChildCountAndInit(int numOfChildren) {
        PAGE_INFO = getPageInfoSample(numOfChildren);
    }

    @PostMapping("/setChildCount")
    public void setChildCount(@RequestParam(value = "count") int count) {
        MyRestUpstreamImpl.setChildCountAndInit(count);
        MyGRPCUpstreamImpl.setChildCountAndInit(count);
    }

    @GetMapping("/nodeInfo")
    public NodeInfo getNodeInfo(@RequestParam(value = "assetid", defaultValue = "1") String assetid) {
        return NODE_INFO;
    }

    @GetMapping("/pageInfo")
    public PageInfo getPageInfo() {
        return PAGE_INFO;
    }

    private static NodeInfo getNodeInfoSample() {
        return NodeInfo.builder()
                .repositoryId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .partitionPrefix("29AC58C95DE604990A494213@domain10.us")
                .baseDirectoryId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .path("/")
                .system(NodeInfo.System.builder()
                        .idPath("/urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .acpGuidPath("/1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .scRootCollectionAssetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .fullNamePath("/")
                        .orphaned(true)
                        .clientId("cloud_platform")
                        .build())
                .region("AP")
                .owner(NodeInfo.Owner.builder()
                        .id("29AC58C95DE604990A494213@domain10.us")
                        .type("user")
                        .build())
                .nodeId("1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .name("root")
                .assetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .mediaType("application/vnd.adobesc.directory+json")
                .etag("W/\"e68362bde05b727c8a230d8ac5ed9967\"")
                .createDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .createdBy("29AC58C95DE604990A494213@domain10.us")
                .modifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .modifiedBy("29AC58C95DE604990A494213@domain10.us")
                .deviceCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .deviceModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .state("active")
                .generations(NodeInfo.Generations.builder()
                        .repoMetadata(9)
                        .primary(9)
                        .build())
                .repoAssetClass("directory")
                .nodeType("directory")
                ._modificationInfo(NodeInfo.ModificationInfo.builder()
                        .build())
                .build();
    }

    private static PageInfo getPageInfoSample(int numOfChildren) {
        var builder = PageInfo.builder()
                .repositoryId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .partitionPrefix("29AC58C95DE604990A494213@domain10.us")
                .baseDirectoryId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .path("/")
                .system(PageInfo.System.builder()
                        .idPath("/urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .acpGuidPath("/1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .scRootCollectionAssetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                        .fullNamePath("/")
                        .orphaned(true)
                        .clientId("cloud_platform")
                        .build())
                .region("AP")
                .owner(PageInfo.Owner.builder()
                        .id("29AC58C95DE604990A494213@domain10.us")
                        .type("user")
                        .build())
                .nodeId("1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .name("root")
                .assetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .mediaType("application/vnd.adobesc.directory+json")
                .etag("W/\"e68362bde05b727c8a230d8ac5ed9967\"")
                .createDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .createdBy("29AC58C95DE604990A494213@domain10.us")
                .modifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .modifiedBy("29AC58C95DE604990A494213@domain10.us")
                .deviceCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .deviceModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .state("active")
                .generations(PageInfo.Generations.builder()
                        .repoMetadata(9)
                        .primary(9)
                        .build())
                .repoAssetClass("directory")
                .nodeType("directory")
                ._modificationInfo(PageInfo.ModificationInfo.builder().build())
                ._page(PageInfo.Page.builder().pageBoundaryReached(true).build());
        PageInfo.Child[] children = new PageInfo.Child[numOfChildren];
        for( int i=0; i < numOfChildren; i++){
            children[i] = getChildNodeInfo(i+1);
        }
        builder.children(children);
        return builder.build();
    }

    private static PageInfo.Child getChildNodeInfo(int num) {
        return PageInfo.Child.builder()
                .nodeId("1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .name("child-"+ num)
                .assetId("urn:aaid:sc:AP:1f5ea78e-5e8c-5484-8f6c-1d236d8e92be")
                .mediaType("application/vnd.adobesc.directory+json")
                .etag("W/\"e68362bde05b727c8a230d8ac5ed9967\"")
                .createDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .createdBy("29AC58C95DE604990A494213@domain10.us")
                .modifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .modifiedBy("29AC58C95DE604990A494213@domain10.us")
                .deviceCreateDate(timestampFromString("2022-03-22T13:21:23.791Z"))
                .deviceModifyDate(timestampFromString("2022-08-29T15:19:42.97Z"))
                .state("active")
                .generations(PageInfo.Generations.builder()
                        .repoMetadata(9)
                        .primary(9)
                        .build())
                .repoAssetClass("directory")
                .nodeType("directory")
                .build();
    }

    private static Timestamp timestampFromString(String stringDate) {
        try
        {
            return Timestamp.from(Instant.parse ( stringDate ));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }


}
