// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: my_upstream.proto

package com.adobe.acp.myupstream;

public final class MyUpstreamProto {
  private MyUpstreamProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_Limit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_Limit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_AssetId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_AssetId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_AssetInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_AssetInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_NodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_NodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_NodeInfo_System_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_NodeInfo_System_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_NodeInfo_Owner_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_NodeInfo_Owner_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_NodeInfo_Generations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_NodeInfo_Generations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_NodeInfo__modificationinfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_NodeInfo__modificationinfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_PageInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_PageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_PageInfo_System_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_PageInfo_System_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_PageInfo_Owner_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_PageInfo_Owner_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_PageInfo_Generations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_PageInfo_Generations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_PageInfo__modificationinfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_PageInfo__modificationinfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_PageInfo_Child_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_PageInfo_Child_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myupstream_PageInfo__pagE_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myupstream_PageInfo__pagE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021my_upstream.proto\022\nmyupstream\032\037google/" +
      "protobuf/timestamp.proto\032\031google/protobu" +
      "f/any.proto\"\036\n\005Limit\022\025\n\rnumOfChildren\030\001 " +
      "\001(\004\"\025\n\007AssetId\022\n\n\002id\030\001 \001(\004\"%\n\tAssetInfo\022" +
      "\n\n\002id\030\001 \001(\004\022\014\n\004name\030\002 \001(\t\"\267\007\n\010NodeInfo\022\024" +
      "\n\014repositoryId\030\001 \001(\t\022\027\n\017partitionPrefix\030" +
      "\002 \001(\t\022\027\n\017baseDirectoryId\030\003 \001(\t\022\014\n\004path\030\004" +
      " \001(\t\022+\n\006system\030\005 \001(\0132\033.myupstream.NodeIn" +
      "fo.System\022\016\n\006region\030\006 \001(\t\022)\n\005owner\030\007 \001(\013" +
      "2\032.myupstream.NodeInfo.Owner\022\016\n\006nodeId\030\010" +
      " \001(\t\022\014\n\004name\030\t \001(\t\022\017\n\007assetId\030\n \001(\t\022\021\n\tm" +
      "ediaType\030\013 \001(\t\022\014\n\004etag\030\014 \001(\t\022.\n\ncreateDa" +
      "te\030\r \001(\0132\032.google.protobuf.Timestamp\022\021\n\t" +
      "createdBy\030\016 \001(\t\022.\n\nmodifyDate\030\017 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\022\022\n\nmodifiedBy\030\020 " +
      "\001(\t\0224\n\020deviceCreateDate\030\021 \001(\0132\032.google.p" +
      "rotobuf.Timestamp\0224\n\020deviceModifyDate\030\022 " +
      "\001(\0132\032.google.protobuf.Timestamp\022\r\n\005state" +
      "\030\023 \001(\t\0225\n\013generations\030\024 \001(\0132 .myupstream" +
      ".NodeInfo.Generations\022\026\n\016repoAssetClass\030" +
      "\025 \001(\t\022\020\n\010nodeType\030\026 \001(\t\022A\n\021_modification" +
      "Info\030\027 \001(\0132&.myupstream.NodeInfo._modifi" +
      "cationinfo\032\210\001\n\006System\022\016\n\006idPath\030\001 \001(\t\022\023\n" +
      "\013acpGuidPath\030\002 \001(\t\022\037\n\027scRootCollectionAs" +
      "setId\030\003 \001(\t\022\024\n\014fullNamePath\030\004 \001(\t\022\020\n\010orp" +
      "haned\030\005 \001(\010\022\020\n\010clientId\030\006 \001(\t\032!\n\005Owner\022\n" +
      "\n\002id\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\0324\n\013Generations\022" +
      "\024\n\014repoMetadata\030\001 \001(\r\022\017\n\007primary\030\002 \001(\r\032\023" +
      "\n\021_modificationinfo\"\227\014\n\010PageInfo\022\016\n\006node" +
      "Id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\017\n\007assetId\030\003 \001(\t\022" +
      "\021\n\tmediaType\030\004 \001(\t\022\014\n\004etag\030\005 \001(\t\022.\n\ncrea" +
      "teDate\030\006 \001(\0132\032.google.protobuf.Timestamp" +
      "\022\021\n\tcreatedBy\030\007 \001(\t\022.\n\nmodifyDate\030\010 \001(\0132" +
      "\032.google.protobuf.Timestamp\022\022\n\nmodifiedB" +
      "y\030\t \001(\t\0224\n\020deviceCreateDate\030\n \001(\0132\032.goog" +
      "le.protobuf.Timestamp\0224\n\020deviceModifyDat" +
      "e\030\013 \001(\0132\032.google.protobuf.Timestamp\022\r\n\005s" +
      "tate\030\014 \001(\t\0225\n\013generations\030\r \001(\0132 .myupst" +
      "ream.PageInfo.Generations\022\026\n\016repoAssetCl" +
      "ass\030\016 \001(\t\022\020\n\010nodeType\030\017 \001(\t\022\024\n\014repositor" +
      "yId\030\020 \001(\t\022\027\n\017partitionPrefix\030\021 \001(\t\022\027\n\017ba" +
      "seDirectoryId\030\022 \001(\t\022\014\n\004path\030\023 \001(\t\022+\n\006sys" +
      "tem\030\024 \001(\0132\033.myupstream.PageInfo.System\022\016" +
      "\n\006region\030\025 \001(\t\022)\n\005owner\030\026 \001(\0132\032.myupstre" +
      "am.PageInfo.Owner\022,\n\010children\030\027 \003(\0132\032.my" +
      "upstream.PageInfo.Child\022\"\n\004tags\030\030 \003(\0132\024." +
      "google.protobuf.Any\022)\n\005_page\030\031 \001(\0132\032.myu" +
      "pstream.PageInfo._pagE\022A\n\021_modificationI" +
      "nfo\030\032 \001(\0132&.myupstream.PageInfo._modific" +
      "ationinfo\032\210\001\n\006System\022\016\n\006idPath\030\001 \001(\t\022\023\n\013" +
      "acpGuidPath\030\002 \001(\t\022\037\n\027scRootCollectionAss" +
      "etId\030\003 \001(\t\022\024\n\014fullNamePath\030\004 \001(\t\022\020\n\010orph" +
      "aned\030\005 \001(\010\022\020\n\010clientId\030\006 \001(\t\032!\n\005Owner\022\n\n" +
      "\002id\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\0324\n\013Generations\022\024" +
      "\n\014repoMetadata\030\001 \001(\r\022\017\n\007primary\030\002 \001(\r\032\023\n" +
      "\021_modificationinfo\032\272\003\n\005Child\022\016\n\006nodeId\030\001" +
      " \001(\t\022\014\n\004name\030\002 \001(\t\022\017\n\007assetId\030\003 \001(\t\022\021\n\tm" +
      "ediaType\030\004 \001(\t\022\014\n\004etag\030\005 \001(\t\022.\n\ncreateDa" +
      "te\030\006 \001(\0132\032.google.protobuf.Timestamp\022\021\n\t" +
      "createdBy\030\007 \001(\t\022.\n\nmodifyDate\030\010 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\022\022\n\nmodifiedBy\030\t " +
      "\001(\t\0224\n\020deviceCreateDate\030\n \001(\0132\032.google.p" +
      "rotobuf.Timestamp\0224\n\020deviceModifyDate\030\013 " +
      "\001(\0132\032.google.protobuf.Timestamp\022\r\n\005state" +
      "\030\014 \001(\t\0225\n\013generations\030\r \001(\0132 .myupstream" +
      ".PageInfo.Generations\022\026\n\016repoAssetClass\030" +
      "\016 \001(\t\022\020\n\010nodeType\030\017 \001(\t\032$\n\005_pagE\022\033\n\023page" +
      "BoundaryReached\030\001 \001(\0102\267\001\n\nMyUpstream\0227\n\007" +
      "GetInfo\022\023.myupstream.AssetId\032\025.myupstrea" +
      "m.AssetInfo\"\000\022:\n\013GetNodeInfo\022\023.myupstrea" +
      "m.AssetId\032\024.myupstream.NodeInfo\"\000\0224\n\007Get" +
      "Page\022\021.myupstream.Limit\032\024.myupstream.Pag" +
      "eInfo\"\000B3\n\030com.adobe.acp.myupstreamB\017MyU" +
      "pstreamProtoP\001\242\002\003RTGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_myupstream_Limit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_myupstream_Limit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_Limit_descriptor,
        new java.lang.String[] { "NumOfChildren", });
    internal_static_myupstream_AssetId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_myupstream_AssetId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_AssetId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_myupstream_AssetInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_myupstream_AssetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_AssetInfo_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_myupstream_NodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_myupstream_NodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_NodeInfo_descriptor,
        new java.lang.String[] { "RepositoryId", "PartitionPrefix", "BaseDirectoryId", "Path", "System", "Region", "Owner", "NodeId", "Name", "AssetId", "MediaType", "Etag", "CreateDate", "CreatedBy", "ModifyDate", "ModifiedBy", "DeviceCreateDate", "DeviceModifyDate", "State", "Generations", "RepoAssetClass", "NodeType", "ModificationInfo", });
    internal_static_myupstream_NodeInfo_System_descriptor =
      internal_static_myupstream_NodeInfo_descriptor.getNestedTypes().get(0);
    internal_static_myupstream_NodeInfo_System_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_NodeInfo_System_descriptor,
        new java.lang.String[] { "IdPath", "AcpGuidPath", "ScRootCollectionAssetId", "FullNamePath", "Orphaned", "ClientId", });
    internal_static_myupstream_NodeInfo_Owner_descriptor =
      internal_static_myupstream_NodeInfo_descriptor.getNestedTypes().get(1);
    internal_static_myupstream_NodeInfo_Owner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_NodeInfo_Owner_descriptor,
        new java.lang.String[] { "Id", "Type", });
    internal_static_myupstream_NodeInfo_Generations_descriptor =
      internal_static_myupstream_NodeInfo_descriptor.getNestedTypes().get(2);
    internal_static_myupstream_NodeInfo_Generations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_NodeInfo_Generations_descriptor,
        new java.lang.String[] { "RepoMetadata", "Primary", });
    internal_static_myupstream_NodeInfo__modificationinfo_descriptor =
      internal_static_myupstream_NodeInfo_descriptor.getNestedTypes().get(3);
    internal_static_myupstream_NodeInfo__modificationinfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_NodeInfo__modificationinfo_descriptor,
        new java.lang.String[] { });
    internal_static_myupstream_PageInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_myupstream_PageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_PageInfo_descriptor,
        new java.lang.String[] { "NodeId", "Name", "AssetId", "MediaType", "Etag", "CreateDate", "CreatedBy", "ModifyDate", "ModifiedBy", "DeviceCreateDate", "DeviceModifyDate", "State", "Generations", "RepoAssetClass", "NodeType", "RepositoryId", "PartitionPrefix", "BaseDirectoryId", "Path", "System", "Region", "Owner", "Children", "Tags", "Page", "ModificationInfo", });
    internal_static_myupstream_PageInfo_System_descriptor =
      internal_static_myupstream_PageInfo_descriptor.getNestedTypes().get(0);
    internal_static_myupstream_PageInfo_System_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_PageInfo_System_descriptor,
        new java.lang.String[] { "IdPath", "AcpGuidPath", "ScRootCollectionAssetId", "FullNamePath", "Orphaned", "ClientId", });
    internal_static_myupstream_PageInfo_Owner_descriptor =
      internal_static_myupstream_PageInfo_descriptor.getNestedTypes().get(1);
    internal_static_myupstream_PageInfo_Owner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_PageInfo_Owner_descriptor,
        new java.lang.String[] { "Id", "Type", });
    internal_static_myupstream_PageInfo_Generations_descriptor =
      internal_static_myupstream_PageInfo_descriptor.getNestedTypes().get(2);
    internal_static_myupstream_PageInfo_Generations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_PageInfo_Generations_descriptor,
        new java.lang.String[] { "RepoMetadata", "Primary", });
    internal_static_myupstream_PageInfo__modificationinfo_descriptor =
      internal_static_myupstream_PageInfo_descriptor.getNestedTypes().get(3);
    internal_static_myupstream_PageInfo__modificationinfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_PageInfo__modificationinfo_descriptor,
        new java.lang.String[] { });
    internal_static_myupstream_PageInfo_Child_descriptor =
      internal_static_myupstream_PageInfo_descriptor.getNestedTypes().get(4);
    internal_static_myupstream_PageInfo_Child_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_PageInfo_Child_descriptor,
        new java.lang.String[] { "NodeId", "Name", "AssetId", "MediaType", "Etag", "CreateDate", "CreatedBy", "ModifyDate", "ModifiedBy", "DeviceCreateDate", "DeviceModifyDate", "State", "Generations", "RepoAssetClass", "NodeType", });
    internal_static_myupstream_PageInfo__pagE_descriptor =
      internal_static_myupstream_PageInfo_descriptor.getNestedTypes().get(5);
    internal_static_myupstream_PageInfo__pagE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myupstream_PageInfo__pagE_descriptor,
        new java.lang.String[] { "PageBoundaryReached", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
