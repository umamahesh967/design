package SystemDesign.basicConcepts;

/**
 * Column wide(Columnar) database
 * https://www.youtube.com/watch?v=YQR2RLW3R5s
 *
 * @Cassandra is typically classified as an AP system, meaning that availability and
 * partition tolerance are generally considered to be more important than consistency.
 *
 * Cassandra is based on distributed system architecture. In its simplest form,
 * Cassandra can be installed on a single machine or in a docker container, and it works well
 * for basic testing. A single Cassandra instance is called a node.
 *
 * The design goal of Cassandra is to handle big data workloads across multiple nodes without
 * any single point of failure. Cassandra has peer-to-peer distributed system across its nodes,
 * and data is distributed among all the nodes in a cluster.
 *
 * https://www.geeksforgeeks.org/features-of-cassandra/
 *
 * @MongoDB is a CP data store—it resolves network partitions by maintaining consistency,
 * while compromising on availability.
 * MongoDb uses master slave architecture.
 *
 * How does MongoDB ensure consistency?
 * MongoDB is consistent by default: reads and writes are issued to the primary member of a replica set.
 * Applications can optionally read from secondary replicas, where data is eventually consistent by default.
 *
 * https://www.quora.com/Why-doesnt-MongoDB-have-availability-in-the-CAP-theorem
 *
 * @MongodbVsCassandra
 * https://www.youtube.com/watch?v=QlqylUeqeis
 *
 * https://medium.com/@bikas.katwal10/mongodb-vs-cassandra-vs-rdbms-where-do-they-stand-in-the-cap-theorem-1bae779a7a15
 *
 * https://www.ibm.com/cloud/learn/cap-theorem#:~:text=MongoDB%20and%20the%20CAP%20theorem%20(CP),-MongoDB%20is%20a&text=Relative%20to%20the%20CAP%20theorem,receives%20all%20the%20write%20operations.
 *
 */
public class SQLvsNOSQL
{

}
