package SystemDesign.microservice;

/**
 *
 * @Aggregator
 * This pattern is used when we want to combine data from multiple services.
 *
 * Reduces chattiness and communication overhead between the client and services, especially in the
 * case of mobile clients that may be limited in bandwidth or number of connections.
 *
 * https://akfpartners.com/growth-blog/microservice-aggregator-pattern#:~:text=The%20aggregator%20design%20pattern%20is,Benefits%20of%20the%20Aggregator%20Pattern
 *
 * @APIGateway
 *
 *
 * @AsynchonousMessaging
 *
 *
 * @DatabasePerService
 *
 *
 * @EventSourcing:-
 * Creates events regarding the changes in the application state.
 *
 * @Branch:
 * Simultaneously process the request and response from two or more independent microservices.
 *
 * @Command Query Responsibility Segreagtor(CQRS)
 *
 *
 * @CircuitBreaker
 * Used to stop he process the requests and response if a service is not working.
 *
 * @Decomposisition
 *
 */
public class Patterns {
}
