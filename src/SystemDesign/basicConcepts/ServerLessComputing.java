package SystemDesign.basicConcepts;

/**
 * Serverless computing is an execution model in which applications are developed and distributed based on
 * microservice units without the need to build a separate infrastructure in a cloud environment [1].
 * Currently, major cloud companies are providing serverless computing technologies,
 * such as Amazon AWS Lambda [2], Microsoft Azure Functions [3], and Google Cloud Functions [4], to their services.
 *
 * @Monolithic
 * Scaling the application can be difficult - a monolithic architecture is that it can only scale in one dimension.
 * On the one hand, it can scale with an increasing transaction volume by running more copies of the application.
 * Some clouds can even adjust the number of instances dynamically based on load.
 * But on the other hand, this architecture can’t scale with an increasing data volume.
 * Each copy of application instance will access all of the data, which makes caching less effective and
 * increases memory consumption and I/O traffic. Also, different application components have different resource
 * requirements - one might be CPU intensive while another might memory intensive.
 * With a monolithic architecture we cannot scale each component independently
 *
 * Monolithic architecture also we can deploy in cloud and adjust the number of instances dynamically based on load.
 * But, here the problem is whole application is combined, when we want to increase copies(Instances) we have to
 * increase at whole application level not at individual component(Module) level.
 *
 * Where are in Micro service architecture we can adjust the instance at individual component level.
 *
 * @Problems-of-Monolithic-Architecture
 * https://microservices.io/patterns/monolithic.html#
 *
 *
 *
 *
 */
public class ServerLessComputing {
}
