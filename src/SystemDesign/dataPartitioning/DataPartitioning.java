package SystemDesign.dataPartitioning;

/**
 * Database node = database server
 *
 * A database shard is a horizontal partition of data in a database or search engine.
 * Each individual partition is referred to as a shard or database shard. Each shard is
 * held on a separate database server instance, to spread load.
 * Shard is equal to Horizontal Partitioning.
 *
 * @1.HorizontalPartitioning (Sharding)
 * In Horizontal partitioning we split single table which was stored in single database into multiple partitions
 * called shards. Here we split table at row level.
 * In a particular shard if again data increase we can again do for hierarchical sharding. Meaning divide that
 * single shard into multiple shards.
 *
 * Algorithmic Sharding
 * Memchache is great example of using algorithmic sharding strategy where the routing is done at application level.
 *
 * Dynamic Sharding
 * In Dynamic sharding you have a lookup service which holds the locations of all your entities. So all request would
 * needs to go to his lookup service first and then use the partition key. The lookup service will be able to identify
 * which database wll hold your data. Major problem with this approach is that you will be introducing a single point of failure.
 * Fortunately though there are various high consistency solutions out there.
 * MongoDB use this strategy which uses config server to store this information
 * HDFS uses the name node to store the filesystem metadata.
 *
 *
 * @2.VerticalPartitioning
 * Vertical partitioning involves creating tables with fewer columns and using additional tables to store the
 * remaining columns. Normalization also involves this splitting of columns across tables, but vertical partitioning
 * goes beyond that and partitions columns even when already normalized.
 *
 * In this case we split single table into multiple tables. Here we splitting of table can occurs at column level or
 * feature level. Each feature is stored in separate node.
 *
 * @DirectoryBasedPartitioning:
 * create a lookup service which knows your current partitioning.So, to find out where a particular data entity
 * resides, we query the directory server that holds the mapping between each tuple key to its DB server
 *
 * https://www.youtube.com/watch?v=RynPj8C0BXA
 * https://www.youtube.com/watch?v=5faMjKuB9bc
 * https://www.youtube.com/watch?v=QA25cMWp9Tk
 * https://en.wikipedia.org/wiki/Partition_%28database%29
 * https://en.wikipedia.org/wiki/Referential_integrity
 *
 * Data Partition Problems/Complexities
 * 1. Shard Allocation Imbalance - Where data is not evenly spread across all shards.
 * 2. Hot Key - Where one shard/partition is getting more number of requests which would overload that shard.
 * 3. Redistribution of data(adding/removing of servers) or because of changing sharding criteria would require downtime
 *    of system and could be risky operation.
 * 4. May require data denormalization:- With a single database server queries that require joins can easily be done.
 *    As soon as you shard you sacrifices the ease of performing joins on your dataset. So you have to denormalize the datasets
 *    before sharding which in turn increases redundant data.
 *
 */
public class DataPartitioning
{
}
