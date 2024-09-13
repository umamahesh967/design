package SystemDesign.microservice.APIGatewayVSProxyServerVSLoadBalancer.ApIGateway;

/**
 * API Gateway can act as load balancer.
 * When we have horizontally scaled a single microservice. When API Gateway has to route to single instance of
 * mirco service which is horizontally scaled then based on each instance load it routes.
 * So it is acting as load balancer.
 *
 * In below video at 13:55 min
 * https://www.youtube.com/watch?v=5OMx4R9VT-0
 *
 * Usually a much better approach is to use what is known as an API Gateway. An API Gateway is a server
 * that is the single entry point into the system. It is similar to the Facade pattern from object-oriented design.
 * The API Gateway encapsulates the internal system architecture and provides an API that is tailored to each client.
 * It might have other responsibilities such as authentication, monitoring, load balancing, caching,
 * request shaping and management, and static response handling.
 *
 *
 * https://dzone.com/articles/building-microservices-using
 *
 * ****Good****
 * https://www.youtube.com/watch?v=vHQqQBYJtLI
 *
 *
 * 1. Ensure request are https using the SSL Certificate (Certificate rotation required for every n days)
 * 2. Ensure user is Authenticated
 * 3. Ensure user has right role based of Api he is trying to access.
 * 4. Routing traffic to different microservices based on the haeder, param or path(URL).
 * 5. DDos Protection/Throttling
 * 6. If client need to make call to multiple service to show response in UI. Instead Api Gateway makes call to all microservices
 *      Consolidate all the responses and send it to ui.
 * 7. Serving static content
 * 8. Caching responses
 * 9. Can act as load balancer
 *      i. Routing based on the A/B Testing
 *      ii. Canary Release
 * 10. Since all request go through the api gateway, we can log and calculate latencies or metrics at API Gateway.
 *
 *
 * Self Managed API Gateways are 1. Apache  2. HAProxy 3. NGINX 4. Spring Cloud Gateway
 * Cloud Services 1. AWS API Gateway 2. Azure API Gateway 3. Google Cloud Endpoints 4. Apigee
 *
 * https://microservices.io/patterns/apigateway.html
 */
public class APIGatewayVsLoadBalancer
{

}
