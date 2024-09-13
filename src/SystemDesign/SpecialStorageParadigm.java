package SystemDesign;

/**
 *
 * @BlobStore (BLOB - Binary Large Object)
 * When someone use blob they're really referring to just some arbitrary piece of unstructured data.
 * The canonical example for a blob is gonna be a video file or an image file, maybe a large text file,
 * or maybe a large binary meaning compiled code that's ready to be shipped out to production.
 * And so a Blobstore as its name suggests is a storage solution for blobs.
 *
 * A blob, like I just said, is unstructured data. It's not the type of data that makes sense. And oftentimes blobs are very large.
 * A Blobstore specializes in storing massive amounts of unstructured data.
 * In fact, this line storing and retrieving massive amounts of unstructured data is often the classic line that Blobstore products
 * actually use to describe themselves. Below are common examples
 * 1.GCS (Google Cloud Storage)
 * 2.S3
 * 3.Azure Blob Storage
 *
 * Also one last thing to note about Blobstores is that they sort of behave like key-value stores in the sense that usually
 * when you're accessing a blob in a Blobstore, you're accessing it through some key, whether that's the blobs ID or the blobs name,
 * whatever you wanna call it, you are accessing it through some key. So that's kind of like a key-value store,
 * but you shouldn't mistake or confuse Blobstores and key-value stores. Because ultimately they are optimized for
 * different functionalities or use cases.
 *
 * A Blobstore, like I said, multiple times now is optimized for storing and retrieving massive amounts of unstructured data.
 *
 * A key-value store might not be able to store the same amounts of data as blobstore or perhaps the key-value store is gonna be
 * more optimized for let's say latency rather than availability and durability.
 *
 * Point is BlobStore and key-value are different things and you shouldn't confuse the two.
 *
 * @TimeSeriesDB
 * A time series database as its name suggests is a database that is specialized for storing time series data.
 * So when you've got large amounts of data that are all relevant to time, in other words,
 * they are let's say maybe events that happen at a given time. Let's say every second or every millisecond.
 * When you've got that type of data and when you're gonna be likely to have to perform very time series like computations on this data,
 * things like computing rolling averages, or computing local maximize and minimize or aggregating data in between two time periods.
 * When you've got that time type of data or that type of requirement or use case you're likely gonna wanna use a time series database.
 *
 * So some of the very common use cases for time series databases are like, I just said, monitoring,
 * if you're monitoring parts of your system, for example, you've got a bunch of events that all occur at a given timestamp.
 * You might wanna use a time series database to store them.
 * Or for example, if you're designing an IOT system, an internet of things system where you've got millions of devices that are constantly,
 * sending telemetry data or capturing certain data in their environments, when you've got that type of system,
 * a time series database is likely gonna be useful.
 *
 * If you're dealing with stock prices maybe that change every second or cryptocurrency prices, you might need a time series database.
 *
 * 1.InfluxData
 * 2.Prometheus
 *
 *
 * @GraphDataBase
 * Neo4j
 *
 * But so a graph database is a database that is built  on top of the graph data model.
 * So what that means is that in a graph database, the concept of a relationship between data points is a primary concept.
 * It is something core to a graph database.
 *
 * And so what that means for graph databases is that when you have graph like data, when you have data that lends itself really well
 * to being stored in a graph, meaning data, where there a lot of relationships and here you can think of social networks like Facebook,
 * where people have a lot of friends. And there are a lot of links between people. When you've got that type of dataset, a graph database allows you
 * to rely on the natural data model which is the graph that this data set lends itself really well to, for all of your querying functionality
 * and all of your storage functionality.
 *
 * Systems that really lend themselves well to having a graph database, our social networks, Facebook, Twitter, YouTube, LinkedIn,
 * all of these systems where you've got a lot of connections between the data, a lot of relationships between the data,
 * all of these systems would likely do well to rely on a graph database.
 *
 * @SpatialDatabase
 * The spatial database is a special type of database that is optimized for storing spatial data. What do we mean by spatial data?
 * Really anything that has to do with geometric space.
 * Canonical example in systems design or in the context of systems design interviews is gonna be locations on a map.
 * Let's say that you're storing hotels in the world or restaurants in a country.
 * Maybe you're designing Google maps. You might very well, want to rely on a spatial database to store all of this data.
 *
 * Now, how does a spatial database work exactly?
 * We're specifically gonna focus on the concept of a quadtree and actually relatively common.
 *
 * But when you're dealing with spatial data. So for example, let's say you're storing latitudes and longitudes.
 * And so you're relying on two different attributes and you might be performing spatial related queries, like finding all locations in the vicinity
 * of a specific location or finding the distance between two locations or multiple locations.
 *
 * And so spatial databases, what they do is they rely on spatial indices.
 * So instead of having a classic database index, you have a spatial index.
 *
 * And here there are a lot of different types of spatial indices out there. The one that I wanna touch on is the quadtree.
 * A lot of spatial indices are based on trees. So there are R-trees, K-D trees, M-trees,quadtree.
 * The one that we're gonna cover is the quadtree, because it's fairly straightforward to understand conceptually and it's pretty common.
 *
 * A quadtree is a tree except that every node has four children nodes instead of two.
 *
 * Go through system expert(Specialized Storage Paradigms Video to understand quadtree)
 *
 */
public class SpecialStorageParadigm
{
}
