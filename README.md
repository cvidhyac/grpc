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
- Text sent by app is converted to Binary and Binary conversion from REST protocol to Text accepted by app adds to application overhead
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

| REST      | gRPC        |
| No support for protocol buffers | Implemented using protocol buffers, which is very efficient |
| No defined interfaces | Strictly defined interfaces |
| No support for typing | Strongly typed  |
| Not polyglot          | polyglot services |

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


