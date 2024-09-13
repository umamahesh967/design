package SystemDesign.basicConcepts;


/**
 * ZooKeeper: Because Coordinating Distributed Systems is a Zoo
 * ZooKeeper is a high-performance coordination service for distributed applications.
 * It exposes common services - such as naming, configuration management, synchronization, and group services - in a simple interface
 * so you don't have to write them from scratch. You can use it off-the-shelf to implement consensus, group management,
 * leader election, and presence protocols
 *
 *
 * @ZooKeeper is used for providing coordination service for distributed system.
 *
 * Apache ZooKeeper is a distributed coordination service which eases the development of distributed applications.
 *
 * https://zookeeper.apache.org/
 * https://cwiki.apache.org/confluence/display/ZOOKEEPER/Index
 *
 * In apache kafka zookeeper is used for coordination between multiple Brokers.
 *
 * https://www.youtube.com/watch?v=Fx46yDDjaWY
 *
 *
 * ZooKeeper has concept of
 *
 * @Sequential ZNode
 * It will have sequence of services like below, 1st service will act as primary/active instance. If 1st service goes down
 * than 2nd service becomes primary/master.
 * [1st service, 2nd service]
 *
 * @Ephimeral ZNode
 * It will have entries for all the services that are active.
 *
 */
public class ZooKeeper
{
}
