package SystemDesign.nosql;

/**
 * MongoDB - Master Slave Architecture
 * Default behaviour is both read and writes go through Primary.
 * In CAP theorem- It achieves CP.
 *
 * Replica Set Members(Primary + Secondary) - Replica set include primary also.
 * A replica set in MongoDB is a group of mongod processes that maintain the same data set.
 * Replica sets provide redundancy and high availability, and are the basis for all production deployments.
 *
 * Replication provides redundancy and increases data availability. With multiple copies of data
 * on different database servers, replication provides a level of fault tolerance against the loss
 * of a single database server.
 *
 * In some cases, replication can provide increased read capacity as clients can send read
 * operations to different servers. Maintaining copies of data in different data centers can
 * increase data locality and availability for distributed applications. You can also maintain
 * additional copies for dedicated purposes, such as disaster recovery, reporting, or backup.
 *
 * @Primary
 * @WriteOperations
 * The primary is the only member in the replica set that receives write operations.
 * MongoDB applies write operations on the primary and then records the operations on the primary’s oplog.
 * Secondary members replicate this log and apply the operations to their data sets.
 *
 * @ReadOpeartions(Default)
 * All read operations use only the current replica set primary. This is the default read mode.
 * If the primary is unavailable, read operations produce an error or throw an exception.(default behaviour).
 * All members of the replica set can accept read operations. However, by default, an application
 * directs its read operations to the primary member.
 *
 * 1.If we want we can change the read preference modes, based on the mode we can read
 *   from primary or secondary(Below article).
 *   https://docs.mongodb.com/manual/core/read-preference/
 *
 * *******Important Points****
 * @What happens when primary fails which has some data which is not replicated to secondary nodes. Below 1,2,3 occurs
 *
 * 1.A rollback reverts write operations on a former primary when the member rejoins its replica set after
 *   a failover. A rollback is necessary only if the primary had accepted write operations that the secondaries
 *   had not successfully replicated before the primary stepped down. When the primary rejoins the set as a
 *   secondary, it reverts, or “rolls back,” its write operations to maintain database consistency with
 *   the other members.
 *
 * 2.MongoDB attempts to avoid rollbacks, which should be rare. When a rollback does occur, it is often the
 *   result of a network partition. Secondaries that can not keep up with the throughput of operations on the
 *   former primary, increase the size and impact of the rollback.
 *
 * 3.A rollback does not occur if the write operations replicate to another member of the replica set
 *   before the primary steps down and if that member remains available and accessible to a majority
 *   of the replica set.
 *
 *  @more about above three points in below article.
 *  https://docs.mongodb.com/manual/core/replica-set-rollbacks/
 *
 *  How To Achieve consistency even when we read from secondary? Go through below article.
 *  https://dba.stackexchange.com/questions/80058/mongodbread-from-slave-dirctly-how-to-guarantee-that-the-data-is-just-up-to-dat
 *
 *  Replica Set Members
 *  https://docs.mongodb.com/manual/core/replica-set-members/
 *
 *  Some of the basic terminology for understanding the DB terms
 *  https://docs.mongodb.com/manual/reference/glossary/#term-failover
 *
 * @Sharding in mongodb?
 * https://docs.mongodb.com/manual/sharding/
 *
 * Indexes in MongoDB
 * https://www.mongodb.com/docs/manual/indexes/
 *
 *
 * Supports transactions at Document Level
 * https://www.mongodb.com/docs/v5.3/core/read-isolation-consistency-recency/#:~:text=MongoDB%20cursors%20can%20return%20the,same%20document%20more%20than%20once.
 *
 * MongoDB does lock a document that is being modified by a transaction.
 * However, other sessions that attempt to modify that document do not block.
 * Rather, their transaction is aborted, and they are required to retry the transaction
 *
 * https://www.mongodb.com/docs/manual/faq/concurrency/#:~:text=MongoDB%20uses%20multi%2Dgranularity%20locking,document%2Dlevel%20in%20WiredTiger).
 *
 *
 */
public class MongoDB {
}
