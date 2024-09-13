package SystemDesign.basicConcepts;

/**
 *
 * How does Cassandra work?
 * Cassandra is a peer-to-peer distributed system made up of a cluster of nodes in which any node can
 * accept a read or write request. Similar to Amazon’s Dynamo DB, every node in the cluster communicates
 * state information about itself and other nodes using the peer-to-peer gossip communication protocol.
 *
 *
 * It is a AP(CAP Theorem) database.
 *
 * https://www.geeksforgeeks.org/consistency-levels-in-cassandra/#:~:text=THREE%20%3A,the%20ANY%20DC%20to%20succeed.
 *
 * Apache cassandra uses consistent hashing(kind of load balancing) internally for data partitioning.
 *
 * Learn how to achieve consistency in Cassandra.
 *
 * https://www.youtube.com/watch?v=8KGVFB3kVHQ
 */
public class Cassandra
{
    
}
