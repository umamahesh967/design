package SystemDesign.basicConcepts;

/**
 * @StateFul
 * In stateful application when we send request, it is first sent to load balancer and from there to any single instance
 * of application. In that Application instance we create session object and send the SessionId in response to LoadBalancer.
 * Here application server has the session object. It is not stored in centralized place or database.
 * LoadBalancer maps session object with user IPAddress, and maps all the request for that particular user to the same application instance/server.
 * Here even though we have multiple instance load might not be uniformly distributed.
 * session makes use of the server memory so it might become an issue when there is a large number of users using the system at once.
 *
 * @StateLess
 * In StateLess application when we send request, it is first sent to load balancer and from there to any single instance
 * of application. Here they Authenticate the user and generate the tokenId. This tokenId is stored in some centralized place to authorize every
 * request from there on. This tokenId is sent to client in response.
 * From there on client attaches the tokenId in every request header that sends to access resource.
 * In stateless when second request is sent to load balancer(LB), LB can send this request to any application instance doesn't
 * need to send to same application instance.
 * This can scale well because tokenId is not tied to any application instance.
 *
 * https://medium.com/@sherryhsu/session-vs-token-based-authentication-11a6c5ac45e4
 * https://dev.to/thecodearcher/what-really-is-the-difference-between-session-and-token-based-authentication-2o39
 *
 * However, it is worth noting that token-based authentication scales better than that of a session because
 * tokens are stored on the client-side while the session makes use of the server memory so it might become an
 * issue when there is a large number of users using the system at once.
 *
 * https://www.youtube.com/watch?v=ZitHpnoWYHQ
 * https://www.youtube.com/watch?v=nFPzI_Qg3FU
 */
public class StateFulVsStateLess
{
}
