package SystemDesign.awsServices.S3;

/**
 * https://cloudian.com/blog/object-storage-vs-file-storage/
 *
 * https://youtu.be/zfA7EeblmZI
 *
 *
 * s3 => Simple Storage System
 * Object Storage(image, text, blob, videos, etc) anything you really want.
 *
 * Folder structure is typically what you see in windows or macOS.
 * Cost effective for storage.
 * Built in redundancy with 99.999999999% durability.
 * S3 is replicating your bucket and all its contents across three availability zones by default.
 *
 * s3 is cheap and reliable ay to store objects.
 * Low latency and high throughput access.
 * Can be easily used to host static websites(you can store html, javascript and CSS all in a bucket in S3).
 *
 * We can shift old data into S3 for long term storage for cost reduction.
 *
 * NameSpace == Bucket
 *
 * https://www.youtube.com/watch?v=L3dYocCSU-E
 *
 * Amazon S3 uses Flat structure to store/organise objects rather than a folder structure. It does use
 * naming prefixes though to simulate the concept of folders and help us things organise. To understand go through below
 * articles.
 *
 * https://www.youtube.com/watch?v=e6w9LwZJFIA
 * https://docs.aws.amazon.com/AmazonS3/latest/user-guide/using-folders.html
 *
 * It achieves eventual consistency
 * Operations are not atomic.
 *
 * https://hadoop.apache.org/docs/stable2/hadoop-project-dist/hadoop-common/filesystem/introduction.html#Object_Stores_vs._Filesystems
 *
 * https://www.youtube.com/watch?v=77lMCiiMilo
 */
public class AmazonS3 {
}
