# Check your understanding

Think through these questions to recollect the different concepts

To review the notes refer the doc links

## Doc links

[gRPC Overview](docs/grpc_overview.md)

## gRPC foundations

- What is gRPC?
- How has the interservice communication evolved?
- gRPC overview, key features?
- What are the key differences between HTTP/1 and HTTP/2? How is HTTP/2 better than HTTP/1?
- How does gRPC differ from REST?

## gRPC basics

- gRPC building blocks
- gRPC utilities and steps to develop a project

## gRPC components
- Why do you need metadata ?
- How does channel help in gRPC ?
- Types of gRPC calls, and use cases how it can be applied

## gRPC set up

- Download & Unzip :  https://github.com/google/protobuf/releases
- Make sure you download the protoc executable, not protoc-all.zip
- Add the protoc path to the PATH
- The .proto file should be placed in src/main/proto for this specific plugin  
- The general best practice is to keep the code-generation tight to the source code, hence I have
opted to use the maven plugin over the painful process of using the raw compiler (on my Mac, its harder)
 
There are two portions to this set up 
- Compiler - auto-generates the messages and objects.
- protoc-grpc-gen-java plugin - This generates the GRPC Service code with RPC methods.

