package SystemDesign.problems;

/**
 *
 * Whenever some asks us to improve the performance of the system it is more often than increasing the
 * performance of database. To do that the most efficient solution is to Index the the retrieved column in Database.
 *
 * Most NOSQL databases uses consistent hashing(Load balancing) for partitioning the data.
 *
 * When we are horizontal scaling in NOSQL what we do, is to add additional node to the existing servers.
 *
 * When we are trying to add/remove node in horizontal scaling there is always going to be some amount of data to remap.
 * What we are trying to achieve is minimize the amount of data to remap to new node.
 * This minimized data is also should be distributed equally to all servers, so that when we add or remove the node load
 * will be uniform on all servers(Consistent Hashing).
 *
 *
 * We can't store huge files in Cache which internally uses RAM. RAM is too costly. So to cache files/images we
 * can store first 100KB or some minimum content in cache. So we can show this as preview to user and
 * in the background we download the content.
 *
 * 1. Distributed refers to splitting a business into different sub-services and distributing them on different machines.
 * 2. Cluster refers to a group of servers that are grouped together to achieve the same business and can be considered as one computer.
 *
 * 
 *
 */
public class PrinciplesForSystemDesign
{
}
