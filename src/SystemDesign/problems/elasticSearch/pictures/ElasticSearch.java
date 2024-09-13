package SystemDesign.problems.elasticSearch.pictures;

/**
 *
 * ******Good*****
 * https://www.youtube.com/watch?v=YsYUgZu9-Y4
 *
 * https://www.youtube.com/watch?v=CeGtqouT8eA
 *
 * How we create alias for scaling purpose.
 * https://www.youtube.com/watch?v=vkdjpdwpul8
 * https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-aliases.html
 *
 * As mentioned, the number of primary shards is a Static Setting and therefore cannot be changed on the fly,
 * since it would impact the structure of the master data. However, in contrast to primary shards,
 * the number of replica shards can be changed after the index is created since it doesn't affect the master data.
 *
 * Whenever we do reindex there will be downtime. So if you don't want downtime we can create new index and write data
 * into new index keeping the old index intact.
 * https://stackoverflow.com/questions/30184630/how-to-add-additional-primary-shards-to-elasticsearch-cluster
 *
 * How to search from multiple index https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multiple-indices.html.
 *
 * Any search system has to fill two important criteria.
 * 1. Low Latency
 * 2. Throughput(The system should be able to answer lot of queries)
 *
 *
 * Pre Processing - Remove stop words.
 *
 */
public class ElasticSearch
{

}
