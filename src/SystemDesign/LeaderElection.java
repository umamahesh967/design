package SystemDesign;

/**
 * @Leader Election
 * If you have a group of machines or a group of servers that are in charge of doing the same thing,
 * instead of having all of them doing that same thing, which might not be something that you want to do multiple times,
 * you definitely don't want to make a request for a given user multiple times.
 * Leader election has the servers in question elect one of themselves as the leader, the so-called leader.
 * And that server, and that server alone, is gonna be the one responsible for doing the actions that all of the
 * servers are kind of meant to do.
 *
 * And if something happens to the leader, then one of the other servers is gonna become the new leader.
 * A new leader is gonna be elected, and one of these other servers is gonna become that leader, and is gonna take over.
 *
 * It's not so much the act of electing a leader. It's more the act of having multiple machines gain consensus,
 * or agree upon something together. That's the real difficulty.
 *
 * In order to actually do what we're describing, we can use what's called a consensus algorithm.
 *
 * These consensus algorithms are very complicated algorithms that are very mathematical, very math heavy,
 * that allow multiple servers in a group, or more broadly speaking, multiple nodes in a cluster, to reach consensus,
 * or to agree on some single data value. And again, in the case of leader election, that single data value is gonna be
 * who the leader is in a given group of machines or given group of servers or a cluster of nodes.
 *
 * A couple of really popular consensus algorithms are Paxos and Raft.
 *
 * Well it turns out that in the industry, typically you use some other third party service that itself
 * might use Paxos or Raft under the hood to achieve leader election.
 *
 * There are these two tools called Zookeeper and Etcd.
 * Zookeeper and Etcd are these two tools that aren't necessarily primarily meant to be used for leader election,
 * but that happen to allow you to implement your own leader election in a very easy way. And they're very often used in the industry.
 *
 * We're actually gonna cover an example of how to implement leader election using Etcd.
 * Etcd is a key-value store. So literally a database that allows you to store key-value pairs.
 * You can think of it as a hashtable that allows you to map keys to values.
 * But Etcd is highly available and strongly consistent.
 *
 * Strong consistency means that if you've got multiple machines, or even just one machine, reading and writing to the same key-value pair
 * in the key-value store in Etcd at any given point in time, you're always guaranteed to be returned the correct/same value.
 * You're never gonna be returned different values.
 *
 * And there aren't that many databases, let alone key-value stores, that are both highly available and strongly consistent.
 *
 * How does Etcd achieve high availability and strong consistency?
 * They do so using leader election, and more precisely, by implementing a concusses algorithm and it turns out that Etcd implements the Raft concusses algorithm.
 *
 * And here, like I said, we're not gonna get into the details of how that works exactly,
 * but you could imagine that simply put, there is going to be multiple machines that can read and write to the main key-value store that Etcd supports,
 * because they need that high availability in case one machine dies, but they also need to make sure that they always
 * have a single source of truth for the key-value pairs in the key-value store to achieve that strong consistency.
 * And so basically it's the same problem that we had here with our multiple servers, where we never wanted to have this request be duplicated,
 * so the nodes under the hood in Etcd probably need to have one leader that's elected to take care of the writes in the key-value store,
 * so they have to implement leader election, and they have to use a concusses algorithm to do so. And this allows them to have a highly available and
 * strongly consistent key-value store.
 *
 * We can then take advantage of that high availability and of that strong consistency to implement our own leader election in our system in a much simpler way.
 *
 * Is that you would basically have your multiple servers communicating with Etcd with the key-value store. And at any given point in time,
 * you would have one special key-value pair in the Etcd key-value store. And that key-value pair would represent who the leader amongst your servers is.
 * And that could just be a key-value pair where the key is leader, or some special key that represents the leader.
 * And the value is the name of your server, or the IP address of your server.
 *
 * You know that the value of the leader in that key-value pair at any given point in time is correct for any machine that's reading from it.
 * And just like that, you've got leader election implemented.
 *
 * you've got leader election implemented. And while we didn't implement our own consensus algorithm, which would have been very, very complicated,
 * to achieve this leader election, we used a third party tool, Etcd. Which itself implements a consensus algorithm. Raft in the case of Etcd.
 * But we used this third party tool, we used the things that it gets from it's own leader election, in this case high availability and strong consistency.
 * We used these properties of Etcd to implement our own leader election.
 */
public class LeaderElection
{

}
