package SystemDesign.nosql.cassandra;

/**
 * Cassandra is a peer-to-peer, read/write anywhere architecture
 * It is columnar(column oriented) database. We can do index on columns similar to sql.
 *
 * In cassandra all nodes are same/similar, there is no master or slave node or name node.
 * There is no single point of failure because of all nodes are same.
 * Can replicate data among different physical data center racks.
 *
 * Cassandra automatically partitions the data that you write to database across all the nodes in the cluster and
 *  you control the data replication within cassandra to ensure fault-tolerance(no single point of failure).
 *
 * Each node communicates with each other through the gossip protocol. Which exchanges the information across the
 *  Cluster every second. To find which node is up and which node is down.
 *
 * A commit log is used on each node to capture the write activity
 * When you write data to cassandra it's first written to commit log. Which ensures the data durability and data is written to
 *  an in-memory structure called memtable. once the memetable becomes full it's then pushed to disk to another structure
 *  called SSTable (Sorted String Table).
 *
 * Cassandra provides tunable data consistency. Meaning we can choose between strong and eventual consistency.
 *  If we choose strong consistency it has to write data not only to primary but also replicate across secondary nodes which
 *  increases latency.
 *
 *  Flexible schema:- No offline/downtime for schema changes.
 *
 *  Cassandra store data compression by compression as it is column oriented database. Go through column oriented
 *   database if you want to understand how data is compressed.
 *
 * @Reading
 * 1.While reading data, if two nodes have different data then cassandra uses last write win policy i.e latest write will be returned.
 *
 * Difference between MongoDB vs Cassandra is
 * .In MongoDB, it partition replicaSets is if you put one replica set in west coast data center and one replica set in east coast data center each
 *      of them is going to serve half the data. So client in east to need to communicate with both east and west to get data.
 *
 * .Whereas in cassandra each data center will hold the complete set of data(i.e complete ring.) So if you are in east cost you can communicate
 *      to east coast data center which decreases the latency. If we make change in one data center it will be replicated to another
 *      data center.
 *
 * @Writing
 * 1. In we have replication factor as 3, meaning there will be 3 nodes that can accept write.
 * It doesn't have primary node concept. So any of the 3 nodes can accept the write request. So after writing we will try to replicate
 * among other nodes. In case Before replicating the data to other 2 nodes, if have an update happened on the 2 nodes then will try to
 * synchronize the data by last write policy
 *
 *
 * We can achieve read consistency by setting consistency level go through below video.
 * 1st 30 min will suffice in below video.
 * https://www.youtube.com/watch?v=oawc4doC76U
 *
 * Columnar Database Vs Row Database
 * https://www.youtube.com/watch?v=02n-fzzbKyo
 *
 * ******  Cassandra is best used when we have Online analytical processing (OLAP) *** Watch above video to understand more about these.
 * Since Cassandra stores all the data related to column in single block easy to perform the aggregations.
 *
 */
public class Cassandra {
}
