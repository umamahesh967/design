package SystemDesign.DistributedLogCollection;

/**
 * @Beats:-
 * They are lightweight agents with a single purpose that you install on servers
 * Beats is a free and open platform for single-purpose data shippers. They send data from hundreds or thousands of machines and systems to Logstash or Elasticsearch.
 *
 *
 * @FilBeats:-
 * There is beat called filebeat which is used for collecting log files and sending the log entries off to either logstash
 * This is very useful for collecting log files such as access logs or error logs.
 *
 *
 * @Logstash
 * This sits between data and where you want to store it, commonly that will be between a log file that is
 * commonly generated on a web server somewhere and a elasticsearch.
 *
 * Logstash is actually much more flexible than that. It can import data from pretty much anywhere it doesn't have to be
 * local files it could be coming from some other system entirely like kafka/S3/HDFS it can put not just in elasticsearch but other
 * places like Hadoop, mongodb or aws.
 *
 * It can actually import things from more than one source at a time and output to more than one destination at a time.
 * So it's a powerful tool for ingesting data from some distributed fleet of things that are generating lots and lots of data
 * funneling it into some system where will be archived and analysed later on.
 *
 * Other than collecting data and sending it to some place it can do other things like
 * 1. Logstash parses, transforms and filters data as it passes through. (Derive structure data from unstructured data)
 * 2. It can derive structure from unstructured data.
 * 3. It can anonymize personal data or exclude it entirely
 * 4. It can do geo-location lookups.
 * 5. it can scale across many nodes
 * 6. it guarantees at-least once delivery.
 *
 *
 * Typical usage in the context of elasticsearch will look something like this
 * So the modern way of doing things if you are going to be doing something like publishing weblogs into elasticsearch
 * for visualization later on would be to install a lightweight client called filebeat on the individual web server
 * hosts and then file beat would send data to your logstash cluster which would then buffer those up and parse things out
 * and then send things into elasticsearch to be indexed.
 *
 * Legacy way(No one uses now)
 * we can directly use logstash on your actual webservers and actually do all the parsing and imparting os structure and
 * geolocation actually on the webservers hosts themselves obviously that's not quite as resilient of a system but
 * that's kind of the old-fashioned way of doing it where you just have logstash listening to local files actually listening
 * directly to your access log or your errorlog or both on each individual host and than publishing the data into elasticsearch cluster.
 *
 * https://logz.io/learn/complete-guide-elk-stack/#logstash
 *
 *
 *
 */
public class DistributedLogCollection {
}
