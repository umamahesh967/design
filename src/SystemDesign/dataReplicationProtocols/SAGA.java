package SystemDesign.dataReplicationProtocols;

/**
 *
 * Two phase and three phase as synchronous consistency process.
 *
 * In case if we want to asynchronous process of achieving strong consistency then we should go for SAGA Pattern.
 *
 * Types of SAGA Implementation
 * 1.Choreography - Event Based
 * 2.Orchestration - Command Based  (There is central orchestrator who takes care of delegating the requests to different microservices)
 *
 *
 * @Choreography (Asynchronous)
 * Your microservice perform action or transaction based on an event(message published to queue),
 * and these are all completely event based.
 * Here every microservice that is involved in transaction register themselves for events.
 *
 * @Orchestration
 * You have central orchestrator service, this control the whole flow of calls to different microservices.
 *
 * https://www.youtube.com/watch?v=WnZ7IcaN_JA
 * https://www.youtube.com/watch?v=S4FnmSeRpAY
 *
 */
public class SAGA {
}
