package SystemDesign.dataReplicationProtocols;

/**
 *
 * @2PhaseCommit:-
 * This is synchronous process.
 *
 * It has two phases to do it.
 * 1.Prepare
 * 2.Commit
 *
 * Coordinator can be any microservice that is (involved/not involved) in the transaction.
 *
 * @Preapre
 * In prepare stage coordinator will make call to different microservices which are involved in transaction.
 * Then the microservices responds success/failure depending on the criteria met in that microservice.
 * The criteria can either for sufficient balance/Products .... anything. If it responds success then those records in
 * that particular microservice will be locked and will not available for another transaction.
 * If anything fails in then those transactions will be reverted in prepare stage itself.
 *
 * If coordinator receives success from all the microservices in prepare stage then it goes for commit stage. If any one of
 * request fails in prepare stage then it ask for all the other microservices to revert back locked resources.
 *
 * We should even set timeout for requests which are sent from coordinator to microservices so they will fail after
 * certain period and we can abort the transaction.
 *
 *
 * @Commit
 * In everything goes well in prepare stage then we will go for commit stage.
 * Since we are holding lock on records in microservices in prepare stage our commit stage will be always successful, even if there
 * is something goes wrong in the commit stage we can still revert all the transactions in all other microservices.
 *
 * @Advantages
 * 1.It achieves strong consistency.
 *
 * @DisAdvantages
 * 1.What if the coordinator fails?
 * 2.In prepare stage we are holding locks on the records and we will not release lock until the commit stage that is bad.
 *   That impacts other transactions i.e High Latency.
 *
 * 3.What happens if one of the microservices fails to reply during the phase1(prepare stage). Coordinator doesn't know the
 *   state of the failed microservices.
 * 4.What if the microservices fails during the commit phase.
 *
 * In above all 4 disadvantages, resources are blocked and no others can use that resources.
 *
 * https://www.youtube.com/watch?v=S4FnmSeRpAY
 * https://www.youtube.com/watch?v=ZcHXyoEay1o
 */
public class TwoPhaseCommit
{
}
