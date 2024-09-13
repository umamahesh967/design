package SystemDesign.basicConcepts;

/**
 * https://www.quora.com/What-is-the-relation-between-SQL-NoSQL-the-CAP-theorem-and-ACID
 *
 * Keep in mind consistent meaning Transaction should not always be successful, it can be failure also.
 *
 * By default MongoDB is CP. That is reads and writes from leader database. In case of partition tolerance it
 * takes to elect new leader. So we lost availability.
 *
 * The "P" is not something you have a choice of trading off. Network partitions occur -- live with it.
 * Hence, you can pick between AP and CP systems. Cassandra is an AP system. HBase is CP
 *
 * CA - RDBMS
 * AP - Cassandra, CouchDB, DynamoDB, Riak
 * CP - MongoDB, HBase, Redis
 * Read below article very nicely.
 *
 * https://medium.com/@bikas.katwal10/mongodb-vs-cassandra-vs-rdbms-where-do-they-stand-in-the-cap-theorem-1bae779a7a15
 */
public class CAPTheorem {
}
