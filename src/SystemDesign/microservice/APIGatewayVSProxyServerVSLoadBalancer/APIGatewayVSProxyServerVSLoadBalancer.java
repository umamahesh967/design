package SystemDesign.microservice.APIGatewayVSProxyServerVSLoadBalancer;

/**
 *
 * API gateway acts as a reverse proxy to accept all application programming interface (API) calls,
 * aggregate the various services required to fulfill them, and return the appropriate result.
 *
 * An API gateway has a more robust set of features — especially around security and monitoring — than an API proxy.
 * I would say API gateway pattern also called as Backend for frontend (BFF) is widely used in Microservices development.
 * Checkout the article for the benefits and features of API Gateway pattern in Microservice world.
 *
 * On the other hand API proxy is basically a lightweight API gateway.
 * It includes some basic security and monitoring capabilities.
 * So, if you already have an API and your needs are simple, an API proxy will work fine.
 *
 * Think of an API gateway as a specific type reverse proxy implementation.
 * API Gateway = Provides all features of Reverse proxy + Some Additional Features (Load Balancing, Caching, Throttling, ...)
 * See attached image.
 *
 * https://stackoverflow.com/questions/35756663/api-gateway-vs-reverse-proxy
 *
 *
 *
 *  @APIGatewayFunctionalities
 *  The API gateway can provide many functions. Here are a few of the main ones:
 *
 *  1. Authentication – Authenticates incoming requests and verifies if the user has access to those resources.
 *  2. Authorization - Controls what data or services the user is allowed to access.
 *  3. Rate Limiting - Limits the number of requests that can be made within a certain time frame.
 *  4. Logging - Logs requests and responses to help with troubleshooting, debugging, and auditing.
 *
 *
 *
 * @What is the difference between Load Balancer and Reverse Proxy?
 *
 * Your confusion is reasonable - they are often the same thing. But not always. When you refer
 * to a load balancer you are referring to a very specific thing - a server or device that balances
 * inbound requests across two or more web servers to spread the load.
 * A reverse proxy, however, typically has any number of features: Below are proxy features
 *
 * @1. @load balancing: as discussed above
 * @2. @Caching: it can cache content from the web server(s) behind it and thereby reduce the load on the web server(s)
 * and return some static content back to the requester without having to get the data from the web server(s)
 * @3. Increased security – No information about your backend servers is visible outside your internal network,
 * so malicious clients cannot access them directly to exploit any vulnerabilities.
 * Many reverse proxy servers include features that help protect backend servers from distributed denial-of-service (DDoS) attacks,
 * for example by rejecting traffic from particular client IP addresses (denylisting), or limiting the
 * number of connections accepted from each client.
 * @4. @SSL acceleration: when SSL is used; it may serve as a termination point for those SSL sessions
 * so that the workload of dealing with the encryption is offloaded from the web server(s)
 * @5. @Compression – Compressing server responses before returning them to the client (for instance, with gzip)
 * reduces the amount of bandwidth they require, which speeds their transit over the network.
 *
 * I think this covers most of it but there are probably a few other features I've missed. Certainly
 * it isn't uncommon to see a device or piece of software marketed as a load balancer/reverse proxy because
 * the features are so commonly bundled together.
 *
 *
 *  https://www.nginx.com/resources/glossary/reverse-proxy-vs-load-balancer/
 *  https://serverfault.com/questions/127021/what-is-the-difference-between-load-balancer-and-reverse-proxy
 *
 * Also, a reverse proxy is specific to web servers.
 * A load balancer can balance traffic from layer 3 upwards to layer 7, but a reverse proxy is HTTP specific.
 *
 * Load balancers however can deal with a lot of other protocols.
 * While the web (HTTP) is the big idea nowadays, things like DNS, mail (SMTP, IMAP), etc. can be load balanced as well.
 * It's just nowadays when most people think "Internet" or "IP network" they think of the web.
 * There's a bunch more stuff out there that may be more obscure, or more of a niche.
 *
 * LB Types:
 * (1) Level 7 Load Balancer == Reverse Proxy (Application Load Balancer)
 * (2) Level 4 Load Balancer (Network Load Balancer)
 * https://docs.aws.amazon.com/AmazonECS/latest/developerguide/load-balancer-types.html
 * https://www.cloudflare.com/en-gb/learning/performance/types-of-load-balancing-algorithms/
 *
 *  ***** VeryGood ******
 * https://cloudinfrastructureservices.co.uk/reverse-proxy-vs-api-gateway-whats-the-difference/
 *
 */
public class APIGatewayVSProxyServerVSLoadBalancer {
}
