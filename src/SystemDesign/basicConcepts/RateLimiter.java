package SystemDesign.basicConcepts;

/**
 * https://www.youtube.com/watch?v=mhUQe4BKZXs
 *
 *https://www.youtube.com/watch?v=FU4WlwfS3G0
 *
 * https://dev.to/arpit_bhayani/system-design-sliding-window-based-rate-limiter-1p80
 *
 * https://www.figma.com/blog/an-alternative-approach-to-rate-limiting/
 *
 * https://medium.com/@saisandeepmopuri/system-design-rate-limiter-and-data-modelling-9304b0d18250
 *
 *
 * @Best
 * https://www.educative.io/courses/grokking-the-system-design-interview/3jYKmrVAPGQ
 *
 * @TokenBucket
 * For each unique user, we would record their last request’s Unix timestamp and available token count
 * within a hash in Redis.
 *
 * "user_1":{"token":3, "ts":1490868000}
 * this timestamp belongs to particular window, based on this timestamp we can find to which window it belongs to.
 * If request comes now we get the user_1 from redis and check the existing timestamp of user
 *      1. If timestamp belongs to previous window we refill the tokens and set the current timestamp.
 *      2. If timestamp belongs to current window we decrement the token and set the current timestamp.
 *      3. If token available are 0 the we reject the request.
 *
 *
 * Despite the token bucket algorithm’s elegance and tiny memory footprint, its Redis operations aren’t atomic.
 * In a distributed environment, the “read-and-then-write” behavior creates a race condition, which
 * means the rate limiter can at times be too lenient
 *
 * Our token bucket implementation could achieve atomicity if each process were to fetch a Redis lock for
 * the duration of its Redis operations. This, however, would come at the expense of slowing down
 * concurrent requests from the same user and introducing another layer of complexity.
 *
 *
 * Available in educative.io below three are the main
 *
 * @FixedWindowCounters
 * @FixedSlidingWindow
 * @FixedSlidingCounter
 *
 * *****For understanding the distributed locking go through the below article *****
 * https://konghq.com/blog/how-to-design-a-scalable-rate-limiting-algorithm/
 *
 * We can solve distributed problem by
 * 1.Sticky Session
 * 2.By Holding locks in distributed data store like redis.
 *
 * examples of https://redis.io/commands/incr
 *
 * Redis Compiler
 * https://try.redis.io/
 *
 *
 * Throttle :- Will not allow request
 */
public class RateLimiter {
}
