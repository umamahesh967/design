package SystemDesign.microservice.APIGatewayVSProxyServerVSLoadBalancer;

/**
 *
 * 1.Api Gateway can make calls to different microservices and send a aggregated response to client. Instead of client
 *  making many calls.
 * 2.We can have many API Gateways, based on client device we can use particular api gateway and
 * customize the response or limit the resources of that device.
 * 3.Also we can track and rate limit the 3rd party API Usages.
 *
 *
 * @Advantages
 * 1.Authentication - we can authentication mechanism in api gateway instead of placing at all services.
 * 2.SSL Termination - To access API Gateway we can use HTTPS, and from gateway to communicates to other
 *      services we can use other protocol like http.
 *
 * 3.Load Balancing:- If we scale a particular service then API Gateway acts as LB
 * 4.Insulation:- Client cannot directly access microservice they have to go through gateway.
 *
 *
 * @Disadvantages
 * 1.Instead of direct call to microservice, now we have a additional component to which every request passes through
 *      this could add additional latency.
 * 2.Api Gateway has to highly available because all calls goes through it.
 *
 */
public class APIGateway {
}
