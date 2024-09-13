package SystemDesign.cache;

/**
 * Cache or In Memory means same.
 *
 *  * Usages
 *  * 1.Reduce network calls.
 *  * 2.Avoid repeated computations.
 *  * 3.Reduce DB load.
 *
 * Types of Cache ********Below three articles are excellent********
 * https://hazelcast.com/blog/architectural-patterns-for-caching-microservices/
 * https://www.youtube.com/watch?v=iuqZvajTOyA
 * https://dzone.com/articles/process-caching-vs-distributed#
 * https://techblog.bozho.net/distributed-cache-overview/#:~:text=To%20list%20a%20few%3A%20Infinispan,be%20used%20in%20any%20setup.
 *
 * @LocalCache(EmbeddedCache) example :- Google's Guava cache, Caffeine cache, ehcache
 *              (Redis or Memcached cannot be used for local cache out of the box).
 *              We achieve local cache with redis with third-party Redis Java client such as Redisson.
 *
 * @DistributedCache:- Terracotta/Ehcache, Hazelcast, Memcached, Redis, Cassandra, Elasticache(by Amazon).
 * The former three are Java-specific (both JCache compliant), but the rest can be used in any setup.
 * Cassandra wasn’t initially meant to be cache solution, but it can easily be used as such.
 *
 * How Redis support local cache with third party libraries
 * https://dzone.com/articles/how-to-boost-redis-with-local-caching-in-java#
 *
 * Redis, Hazelcast, Aerospike, MemSQL, and SAP HANA are the most popular tools in the category "In-Memory Databases".
 * "Performance" is the primary reason developers pick Redis over its competitors,
 * while "High Availability" is the reason why Hazelcast was chosen.
 *
 *
 * Locality of reference:-
 * https://www.youtube.com/watch?v=v6GAir9cphk
 *
 * https://www.linkedin.com/pulse/memcached-vs-redis-which-one-pick-ranjeet-vimal/
 *
 * @REDIS
 * It is single threaded.
 * It supports various datatypes(List string). In addition to strings, Redis supports lists, sets, sorted sets, hashes, bit arrays, and hyperloglogs.
 * Supports replication.
 *
 *
 *
 * @Memcache
 * It is multi threaded.  https://stackoverflow.com/questions/2927505/can-memcached-make-full-use-of-multi-core
 * It supports only string.
 * It doesn't support replication. https://stackoverflow.com/questions/45474816/does-memcache-use-replica#:~:text=No.,Everything%20is%20stored%20on%20memory.
 * Memcache doesn't support for keys larger than 250 chars.
 * Memcache doesn't support persistence.  Or, a database.
 * Memcache doesn't support having objects/values larger than 1MB.
 *   * Memcached is not for large media and streaming huge blobs.
 *
 *
 *   **********Very Good*****
 *   https://aws.amazon.com/elasticache/redis-vs-memcached/
 *
 *  * When not to use memchache
 *  https://github.com/steveyen/community-site/blob/master/db_doc/main/WhyNotMemcached.wiki
 *
 *  System Design: Why is single-threaded Redis so fast?
 *  https://www.youtube.com/watch?v=5TRFpFBccQM&list=PLCRMIe5FDPsdnSszazqVIQFh99t1ExH19&index=3
 *
 *
 * https://stackoverflow.com/questions/10558465/memcached-vs-redis
 *
 * https://aws.amazon.com/elasticache/redis-vs-memcached/
 *
 */
public class Cache {
}
