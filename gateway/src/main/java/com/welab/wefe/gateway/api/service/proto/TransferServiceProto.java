// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway-service.proto

package com.welab.wefe.gateway.api.service.proto;

public final class TransferServiceProto {
    private TransferServiceProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\025gateway-service.proto\022(com.welab.wefe." +
                        "gateway.api.service.proto\032\020basic-meta.pr" +
                        "oto\032\022gateway-meta.proto2\361\002\n\017TransferServ" +
                        "ice\022p\n\004send\0223.com.welab.wefe.gateway.api" +
                        ".meta.basic.TransferMeta\0323.com.welab.wef" +
                        "e.gateway.api.meta.basic.ReturnStatus\022p\n" +
                        "\004recv\0223.com.welab.wefe.gateway.api.meta." +
                        "basic.TransferMeta\0323.com.welab.wefe.gate" +
                        "way.api.meta.basic.TransferMeta\022z\n\016check" +
                        "StatusNow\0223.com.welab.wefe.gateway.api.m" +
                        "eta.basic.TransferMeta\0323.com.welab.wefe." +
                        "gateway.api.meta.basic.TransferMeta2\215\002\n\037" +
                        "NetworkDataTransferProxyService\022p\n\004push\022" +
                        "3.com.welab.wefe.gateway.api.meta.basic." +
                        "TransferMeta\0323.com.welab.wefe.gateway.ap" +
                        "i.meta.basic.ReturnStatus\022x\n\010pushData\0223." +
                        "com.welab.wefe.gateway.api.meta.basic.Tr" +
                        "ansferMeta\0323.com.welab.wefe.gateway.api." +
                        "meta.basic.TransferMeta(\0010\001B\026B\024TransferS" +
                        "erviceProtob\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.welab.wefe.gateway.api.meta.basic.BasicMetaProto.getDescriptor(),
                                com.welab.wefe.gateway.api.meta.basic.GatewayMetaProto.getDescriptor(),
                        });
        com.welab.wefe.gateway.api.meta.basic.BasicMetaProto.getDescriptor();
        com.welab.wefe.gateway.api.meta.basic.GatewayMetaProto.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}