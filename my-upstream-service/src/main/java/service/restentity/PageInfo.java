package service.restentity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@Builder
@Getter
@AllArgsConstructor
@ToString
public class PageInfo {

    private String nodeId;
    private String name;
    private String assetId;
    private String mediaType;
    private String etag;
    private Timestamp createDate;
    private String createdBy;
    private Timestamp modifyDate;
    private String modifiedBy;
    private Timestamp deviceCreateDate;
    private Timestamp deviceModifyDate;
    private String state;
    private Generations generations;
    private String repoAssetClass;
    private String nodeType;
    private String repositoryId;
    private String partitionPrefix;
    private String baseDirectoryId;
    private String path;
    private System system;
    private String region;
    private Owner owner;
    private Child[] children;
    private Page _page;
    private ModificationInfo _modificationInfo;

    @Builder
    @Getter
    @AllArgsConstructor
    @ToString
    public static final class Child {
        private String nodeId;
        private String name;
        private String assetId;
        private String mediaType;
        private String etag;
        private Timestamp createDate;
        private String createdBy;
        private Timestamp modifyDate;
        private String modifiedBy;
        private Timestamp deviceCreateDate;
        private Timestamp deviceModifyDate;
        private String state;
        private Generations generations;
        private String repoAssetClass;
        private String nodeType;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @ToString
    public static final class Tags {
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @ToString
    public static final class Page {
        boolean pageBoundaryReached;
    }


    @Builder
    @Getter
    @AllArgsConstructor
    @ToString
    public static final class System {
        String idPath;
        String acpGuidPath;
        String scRootCollectionAssetId;
        String fullNamePath;
        boolean orphaned;
        String clientId;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @ToString
    public static final class Owner {
        String id;
        String type;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @ToString
    public static final class Generations {
        int repoMetadata;
        int primary;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @ToString
    public static final class ModificationInfo {
    }

}
