package SystemDesign.messagingQueues;

/**
 * @Kafka - Based on PubSub Architecture
 * 1.Exchange
 * 2.Message retention is based on policy.Every message will be stored at your disk up to certain time period that
 *   you can set. After that it will become unavailable. With such policy when kafka consumer process M1, M2 messages
 *   all of them will remain on disk for time period that you set. Another consumer from different consumer group
 *   can process those messages once again if needed.
 * 3.Kafka doesn't have routing mechanism for message.
 * 4.Publisher tells which topic to write(and optionally which partition), and kafka will publish the message to that
 *   specified topic.
 * 5.Kafka achieve multiple consumers by using partitioning. Each topic in kafka can have multiple partitions.
 *   Each partition has one consumer per consumer group, so message order in kafka is guaranteed per partition.
 * 6.Kafka consumer pull message from kafka topic and partition. So active part is the consumer. This pull model also
 *   guarantees message ordering per partition, since one partition can be accessed by maximum one consumer.
 *
 * Ordering guarantee of message will be achieved only if we have single partition. In single partition messages will
 * be order manner. If we have multiple partitions, messages will be divided across partitions and there will not be order
 * guarantee. Below video at 8:20
 *
 * To understand above concepts you can go through below video.
 * https://www.youtube.com/watch?v=udnX21__SuU
 * https://www.youtube.com/watch?v=JalUUBKdcA0
 *
 * Producer:- An application that sends data to kafka server.
 * Consumer:- An application that reads data from kafka server.
 * Broker:- Is a kafka server. That is used to exchange data between producer and consumer.
 * Kafka Cluster:- Group of brokers.
 * Topic:- Is unique name for data stream. Broker would store the data for topic.
 * Partition:- Data is stored in partitions(similar to sharding). Each topic is split into multiple partitions.
 *             When we create topic we have to give how many partitions we want to create for topic.
 *             All messages within a partition is are ordered and immutable.
 * Consumer Group:- A group of consumers acting as a single logical unit.
 * Replica and Replication:- Replicas are backup of partition. Replicas are ever read or write data.
 *                          They are used to prevent data loss (fault-tolerance).
 * Offset, Committed Offset:- https://www.youtube.com/watch?v=kZT8v2_b2XE
 *
 * Kafka by default provides atleast once processing/delivery guaranty. We have to make some configuration/code changes
 * to make it exactly once processing.
 * https://www.youtube.com/watch?v=AshMNCxSp3c
 *
 * How Kafka enables scalability?
 * Being able to split single topic into multiple partitions so that each partition can be read by a separate consumer.
 *
 *
 *
 * @Producer
 * Producer are application which write publish/write data o the topics within a cluster using the producing APIs.
 * Producers can write data either on the topic level(then based on round robin fashion it will publish to partitions) or specific partitions of the topic.
 *
 * @Consumer
 * Consumers are applications which read/consume data from the topics within a cluster using the consuming APIs.
 * Consumers can read data at topic level(All partitions of topic) or from specific partition of a topic.
 * Consumers are always associated with exactly one consumer group.
 * A consumer group sa group of consumers that performs a specific task.
 *
 * Apache Kafka® Consumers and Consumer Group Protocol
 * **** https://www.youtube.com/watch?v=ovdSOIXSyzI *****
 *
 *
 * ******Go through the below video which is good*****
 * https://www.youtube.com/watch?v=Y2coybua2A0&list=PLxv3SnR5bZE82Cv4wozg2uZvaOlDEbO67&index=4
 *
 * Once topic is created in kafka with fixed number of partitions, we can increase the number of partitions later.
 * But whatever data was present in the partitions before that data will not be reshuffled.
 * https://stackoverflow.com/questions/33677871/is-it-possible-to-add-partitions-to-an-existing-topic-in-kafka-0-8-2
 *
 * Does Kafka guarantee order across partitions?
 * First of all, Kafka only guarantees message ordering within a partition, not across partitions.
 * This places a burden on the producers and consumers to follow certain Kafka design patterns to ensure ordering.
 * For example, the ability to partition data by key and one consumer per partition.
 *
 * @RabbitMQ(AMQP - Asynchronous Messaging Queue Protocol) - Messaging Queue Architecture
 * 1.Partition
 * 2.RabbitMQ stores the messages in memory or disk based on your choice. Message will be stored until consumer gives
 *   acknowledge, that is on consumer confirming that the message has been processed successfully.
 *   So one message, one successful process from one consumer and the message is gone.
 *   If we need to process the same exact message again, publisher must republish the message once again.
 * 3.RabbitMQ has routing mechanism using exchange, which routes the messages into one or more queue.
 * 4.RabbitMQ can route the message based on routing key. There are several exchange available:
 *    Fanout - Ignores the RoutingKey and send message to all Queues it knows.
 *    Direct - Send message to queue if RoutingKey = BindingKey
 *    Topic - Partial match of Keys
 *    Header - Uses message header instead of routing Key.
 *    Default(nameless) - send message to queue if RoutingKey = QueueName
 *
 *    The publisher can attach the routing key and RabbitMQ will route the message to one or more queue to be consumed.
 * 5.In RabbitMQ one queue has multiple consumers. This might be useful if we have fast producers and slow consumers.
 *   Drawback with RabbitMQ approach is multiple consumers can cause a pattern called "Competing Consumers" where message in
 *   queues might not be processed in order
 * 6.RabbitMq will push message into each registered consumer. To avoid the flooding the consumer, in case publisher
 *   works on faster rate then consumer can handle, consumer can set the prefetch limit, which is basically the number of
 *   unprocessed message that can be accepted on consumer. This push model ensures that message workload is distributed
 *   fairly even, among consumers.
 *
 *   RabbitMQ / AMQP: single queue, multiple consumers for same message?
 *   No it's not, single queue/multiple consumers with each consumer handling the same message ID isn't possible.
 *   Having the exchange route the message onto into two separate queues is indeed better.
 *   A single message can be only be delivered to one consumer at a time. It is possible to a single published message to
 *   be routed to more than one queue and eventually delivered to more than one consumer.
 *
 *   RabbitMQ can have multiple consumers, but each message can be consumed by only single consumer out of consumers.
 *
 *   https://www.youtube.com/watch?v=deG25y_r6OY
 *
 *   @Publishing
 *   Producer -> Exchange -> Queue
 *
 *   Exchange is connected to multiple queues. Exchange is connected to queue using binding and BindingKey.
 *   To send a message, producer needs to send a RoutingKey. RoutingKey and BindingKey are compared on Exchange.
 *
 *   @Consuming
 *   Queue -> Consumer
 *
 *
 *
 *  Excellent article for understanding Kafka and RabbitMQ
 *  https://medium.com/better-programming/rabbitmq-vs-kafka-1ef22a041793
 *
 *  Excellent article for understanding Kafka VS RabbitMQ
 *  https://medium.com/better-programming/rabbitmq-vs-kafka-1779b5b70c41
 *
 *  https://www.youtube.com/watch?v=GsZ3ihu7nlc
 *  
 *  @RabbitMQ is preferable when we need:
 *  Advanced and flexible routing rules.
 *  Message timing control (controlling either message expiry or message delay).
 *  Advanced fault handling capabilities, in cases when consumers are more likely to fail to process messages (either temporarily or permanently).
 *  Simpler consumer implementations.
 *
 *  @Kafka is preferable when we require:
 *  Strict message ordering for single partition.
 *  Message retention for extended periods, including the possibility of replaying past messages.
 *  The ability to reach a high scale when traditional solutions do not suffice.
 *
 *
 * For delivery guarantee go through below article
 * https://www.youtube.com/watch?v=JalUUBKdcA0
 *
 *   Fast transaction companies like e-commerce use kafka as their core messaging.
 *   Less transaction rate companies use RabbitMQ.
 *
 *   RabbitMQ is easier to manage.
 *   With kafka there are several things to be managed, like cluster replication ,producer and consumer config.But Kafka is
 *   good for scalability, and usually a choice for a big data streaming. Like in bank, the transaction from ATM credit card
 *   and other channels can be streamed to kafka and analyzed for fraud possibility.
 *
 * @How Kafka scales well compared to RabbitMQ (In simple in rabbitMq most of the work is done by broker, in kafka consumer does most of the work).
 * 1.You can dig into all of the technical details of how Kafka works and why it scales,
 *   but to me the true distinction is that the Kafka broker is very simplistic compared to
 *   most other messaging bus brokers. This in turn forces you to spend more time at the beginning understanding and
 *   designing your consumer app to truly achieve maximum scalability
 *
 * 2.RabbitMQ is a great broker with lots of features - easy to get started using and to grow your product with.
 *   If you want to add more consumer threads, it is stupid easy to do so - all of the complexity managing message state
 *   is handled by the broker. This is great and makes things easy to work with and it scales just fine… to a point.
 *   As the RMQ broker manages more and more outstanding messages, it will eventually start to get overloaded and performance suffers.
 *
 * 3.Kafka on the other hand is a much simpler broker that forces more of the complexity on the consumer side of things.
 *   If you want Kafka to work well, you must spend significantly more time up front understanding your data profile and designing
 *   your consumer app. But, if you plan things up front correctly, the broker (since it is so simple) will have
 *   very few issues with increasing scalability.
 *
 *
 *   Main Diff
 *   1. Pull(Kafka) vs Push Model(RabbitMq)
 *   2. Scalability(Kafka is good)
 *   3. Retention Policy(Kafka is good).
 *   4. Routing key(RabbitMq) vs Topic(Kafka)
 *   5. Failure Mechanism.(RabbitMq)
 *   6. Kafka make sure Order of message is sequential at partition level, not at topic level. rabbitMq doesn't gaurentee order of message.
 *
 *
 */
public class KafkaVsRabbitMQ {
}
