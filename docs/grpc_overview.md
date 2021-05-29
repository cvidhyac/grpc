# grpc

GRPC microservices with Java

## Evolution of inter-service communication

RPC -> SOAP -> REST

### Disadvantages of RPC

- Uses TCP, inherently very complex
- Prone to vulnerabilities

### Disadvantages of SOAP

- XML based contracts
- Reading, parsing XML has additional overheads
- Heavy payloads and distributed apps are a problem.

### Disadvantages of REST

- Text sent by app is converted to Binary and Binary conversion from REST protocol to Text accepted
  by app adds to application overhead
- Exposes only CRUD behaviours
- Stateless, so incompatibility and inconsistency when API is upgraded.

## Why gRPC?

- Uses HTTP/2 protocol, high performance framework.
- More efficient for inter-service communication.

### What is the difference between HTTP/1 and HTTP/2 protocol?

| HTTP 1        | HTTP/2        |
|-------------- |---------------|
| Text Based | Binary protocol |
| Needs text -> binary and binary -> REST conversion | Text -> Binary and Binary -> Text not necessary  |

| REST | gRPC | | No support for protocol buffers | Implemented using protocol buffers, which is
very efficient | | No defined interfaces | Strictly defined interfaces | | No support for typing |
Strongly typed | | Not polyglot | polyglot services |

### Features of gRPC

- HTTP/2
- Uses protocol buffers as IDL (Interface Definition Language)
- Support for bidirectional streaming
- Support for cross-cutting concerns such as authentication and error handling out of the box.
- Integrates well with cloud-native platforms

### Disadvantages of gRPC

- Limited browser support, specially designed for backend
- Request and response data is binary, so not human readable anymore.
- Service definition changes will need to regenerate client stubs similar to SOAP.

## HTTP/1.1 problems

- Limits in number of TCP connections.
- Requests and responses should come in the same order before being sent to the client.
- Pipelining connections - it means multiple requests can be sent together in one call, so if one
  request is blocked, lets say because of database call, then the rest of the execution is blocked.
  This is what is the Head of Line blocking (HOL) I/O problem.

## How does HTTP/2 work?

### Key terms

- Streams - Set of messages
- Message - Sequence of frames - Http message
- Frames - Smallest unit - Frame header and body. Frame header indicates which stream it belongs to

Frames are interleaved or mixed when transported via HTTP/2. They are reassembled at the end of the
stream. Streams are fully multiplexed in a single TCP connection.

## How is HTTP/2 better?

- binary protocol, so no additional overhead for the service communication to perform addition text
  -> binary and binary -> text

## Understand protocol buffers

- .proto file, similar to a mainframe copy book where you would define the spec
- the protocol buffer is used as the IDL (Interface definition language) for gRPC
- spec defines the service, the rpc methods, and the message format
- each field has an allocated tag to determine its binary position in the service.

## Metadata and channels

- Request metadata from request, response sends trailing metadata
- This is a key-value pair similar to REST header attributes
- Channels store connection information for the gRPC call - the connection url and port

## gRPC call types

### Unary gRPC call

- Client sends one request, server replies with one response.

- Use case : Let's say user wants to search for a profile by username, the server responds by
  sending one profile information back.

### Client Streaming RPC

- The client sends a huge chunk of data in multiple sequential stream of messages, the server
  responds by sending a single response that it has received all the messages. Then the connection
  terminates.

- Use case - Client wants to upload a huge file, the server sends a OK when all the bytes are
  received.

## Server Streaming RPC

- The client is requesting for a huge chunk of data. The server sends the response in multiple
  sequential stream of messages, and when all the data is sent it sends a trailing metadata to hint
  the connection needs to be terminated.

- Usecase: A client wants to search by keyword and retrieve a list of results matching the keyword.

## Bidirectional RPC

- The client and the server can both send a stream of messages in parallel. When the communication
  needs to end, the client sends a end-of-stream flag, and the server terminates the connection
  after sending trailing metadata.

- Usecase: Display matching results for the user as the user is typing the product name, chat
  servers.



