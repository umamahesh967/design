package SystemDesign.basicConcepts;

/**
 *
 * @Key-Value Stores:
 * Data is stored in an array of key-value pairs. The ‘key’ is an attribute name which is linked to a ‘value’.
 * Well-known key-value stores include Redis, Voldemort, and Dynamo.
 *
 * @Document Databases: In these databases, data is stored in documents (instead of rows and columns in a table) and
 * these documents are grouped together in collections. Each document can have an entirely different structure.
 * Document databases include the CouchDB and MongoDB.
 *
 * @Wide-Column Databases: Instead of ‘tables,’ in columnar databases we have column families, which are
 * containers for rows. Unlike relational databases, we don’t need to know all the columns up front and each
 * row doesn’t have to have the same number of columns. Columnar databases are best suited for
 * analyzing large datasets -
 * big names include Cassandra and HBase.
 *
 * @Graph Databases: These databases are used to store data whose relations are best represented in a graph.
 * Data is saved in graph structures with nodes (entities), properties (information about the entities), and
 * lines (connections between the entities).
 * Examples of graph database include Neo4J and InfiniteGraph.
 *
 *
 *
 *
 * @Amazon S3
 * Simple Storage Service is storage for the Internet. It is designed to make web-scale computing
 * easier for developers. Amazon S3 has a simple web services interface that you can use to store and
 * retrieve any amount of data, at any time, from anywhere on the web.
 *
 * It is a very large Key-Value store. The Key is the filename, the Value is the contents of the file.
 * If your needs are simply "Store a value with this key" and "Retrieve a value with this key",
 * then it would work just fine!.
 *
 * Amazon S3 is a simple key-value store designed to store as many objects as you want.
 * You store these objects in one or more buckets, and each object can be up to 5 TB in size.
 * In short Amazon S3 is like file system that store keyname as filename and content of the file is value.
 *
 * We can search by filepath/keyname in Amazon s3.
 *
 * https://docs.aws.amazon.com/AmazonS3/latest/user-guide/create-configure-bucket.html
 * https://stackoverflow.com/questions/4979218/how-do-you-search-an-amazon-s3-bucket#
 * https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html
 *
 * @Amazon-S3 vs Dynamo Db
 * Amazon S3 is an object storage capable of storing very large objects.
 * S3 is typically used for storing files like images,logs etc.
 *
 * DynamoDB is a NoSQL database that can be used as a key value (schema less record) store.
 * Dynamo db is extremely fast when you are searching based on key as internally it is using hashing in
 * order to find the item in collection(Table).
 *
 *
 * As a general rule of thumb, if you want to store potentially huge objects and only need to process
 * individual objects at a time, choose S3.
 *
 * If you need to store small bits of structured data, with minimal latency, and potentially need to process
 * groups of objects in atomic transactions, choose DynamoDB.
 *
 */
public class TypesOfNOSQL {
}
