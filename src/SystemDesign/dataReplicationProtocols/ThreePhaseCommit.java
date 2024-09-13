package SystemDesign.dataReplicationProtocols;

/**
 * 3Phase commit
 *
 * This is synchronous process.
 * It has 3 stages.
 * 1.Can Commit
 * 2.Pre commit.
 * 3.Do commit.
 *
 * It is the extension of the 2 phase commit. It has one extra step included that is pre commit. Having this extra step
 * will help us to basically recover in case if we have failure in Coordinator or participator or both.
 *
 *
 * @CanCommit
 * Here coordinator sends request to all the participants, here participant can check and reply yes or no to coordinator
 * to proceed further. In this stage nothing is locked. If any of the participant says no we can abort the transaction easily
 * since we are not holding locks on any of the participant resources/records.
 *
 * If all of the participants says the we proceed to next stage that is Pre Commit stage.
 *
 * @PreCommit
 * In this stage we ask participants to hold lock on resources. Once participants responds to coordinator by either
 * success or failure we proceed to next stage i.e Do Commit.
 *
 * @DoCommit
 * We go to next stage if we get success from all the participants in pre commit. In this stage we commit all of
 * the transaction and release locks in that we hold in pre commit.
 *
 * Go through the below video at 25th minute to understand if either coordinator or participants fails.
 * we can proceed from there on.
 * https://www.youtube.com/watch?v=S4FnmSeRpAY
 */
public class ThreePhaseCommit
{
}
