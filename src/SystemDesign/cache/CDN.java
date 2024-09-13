package SystemDesign.cache;

/**
 * A content delivery network, or content distribution network, is a geographically distributed
 * network of proxy servers and their data centers. The goal is to provide high availability and
 * performance by distributing the service spatially relative to end users.
 *
 *
 * https://www.cdnetworks.com/web-performance-blog/how-content-delivery-networks-work/
 *
 * How to use CDN?
 * There are two ways you can serve data from most CDNs:
 * Using a pull zone:
 *      This pulls existing content from your origin server(like s3 or GCS) and caches it on the CDN's PoPs.
 *
 * Using a push zone:
 *      You manually upload content to the CDNs storage cluster and from there the
 *      content gets distributed to the CDN's PoPs.
 *
 *
 *  *****************
 *
 *  We can store Assets, CSS and JavaScript in CDN.
 *
 *  https://www.youtube.com/watch?v=CiphZWq3ST4
 *  https://www.youtube.com/watch?v=dB9k1YBYXUU
 *
 * https://www.youtube.com/watch?v=RI9np1LWzqw
 *
 *  ** Good link to understand we serve java script from CDN ***.
 * https://blog.bitsrc.io/boost-frontend-load-speed-using-cdn-7ae02cbbf492
 *  Use CDN as a Proxy and Entry Point to the Web Application
 * Another strategy you can employ is to serve the entire web application via the CDN service.
 * Here the CDN also acts as a proxy and the entry point to the web application.
 * For this to work, the CDN should be able to caches the frontend static content (HTML, CSS, and JavaScript)
 * and bypass the dynamic content (API Calls) to the origin.
 *
 * You can use this approach with AWS CloudFront, where you don’t need to define CDN URLs in your index.html explicitly.
 * However, you need to determine the caching rules (TTL) to instruct the CDN proxy for the static and
 * dynamic content based on path-based routing.
 *
 *
 *
 * How CDN serves JS, Images using CDN
 * https://www.youtube.com/watch?v=MgjkRt0xHZg
 */
public class CDN {
}
