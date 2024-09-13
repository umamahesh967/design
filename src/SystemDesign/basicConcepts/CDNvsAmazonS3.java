package SystemDesign.basicConcepts;

/**
 * CDN is used when files or images are common for all most of the users.
 * CDN caches web data at edge locations as close to users as possible.
 *
 * Amazon S3 is designed for large-capacity, low-cost file storage in one specific geographical region.
 * S3 is an Object store - meaning all data in S3 is stored as Object entities with Object Key (Document name) associated with it.
 *
 * https://www.quora.com/How-exactly-S3-is-different-from-HDFS-and-how-S3-data-will-be-processed-in-Hadoop-cluster
 * https://www.xplenty.com/blog/storing-apache-hadoop-data-cloud-hdfs-vs-s3/
 *
 * So generally S3 is used store files and CDN as cache for retrieving the files faster.
 *
 * To put it simply, S3 is a centralized storage location, and CloudFront(CDN) is a distributed cache of your files
 * all around the world so that it can load for every user around the world almost just as fast, rather than
 * loading your files from one central “hard disk” stored at one geo-location.
 *
 * ****Below URL is Good**********
 * https://www.quora.com/Should-I-store-images-and-videos-of-my-mobile-app-in-S3-or-CloudFront#:~:text=If%20your%20application%20is%20running,store%20your%20images%20and%20video.&text=you%20use%20S3%3F-,If%20your%20application%20is%20running%20in%20the%20AWS%20cloud%20it,highly%20scalable%20and%20available%20fashion.
 *
 */
public class CDNvsAmazonS3 {
}
