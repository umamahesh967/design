package SystemDesign.microservice.APIGatewayVSProxyServerVSLoadBalancer;

/**
 * Load Balancing
 * https://www.youtube.com/watch?v=K0Ta65OqQkY&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=3
 *
 * Consistent Hashing
 * https://www.youtube.com/watch?v=zaRkONvyGr8&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=4
 *
 * https://www.cloudflare.com/en-gb/learning/performance/types-of-load-balancing-algorithms/
 *
 * @Watch above consistent hashing video to understand the below terminally if you don't understand.
 * Request is passed to hash function and gets hashcode, and hashcode % N value is always in the range of N.
 *
 * Each server id is passed to K no of hash functions and we get K hash value.
 * Each server K hash values are mapped uniformly in the N values.
 * So if we have M servers then we have M*K hash values which are distributed evenly in the N values.
 * So even if we lose a single server, the load on the particular server will be distributed uniformly
 * on to all other severs.
 *
 * Client Side vs Server Side Load Balancing
 * https://www.youtube.com/watch?v=q3717mJCRnk
 *
 * @Microservice Load Balancing
 * https://www.youtube.com/watch?v=0j0R9MNjRU4
 *
 *
 * DNS LoadBalancing
 *
 */
class LoadBalancing
{

}