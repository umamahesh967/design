package SystemDesign.microservice;

/**
 * @ServiceRegistry/ServiceDiscovery
 *  It is pattern to identify the network address of all of the instance of microservices.
 *
 *  When client send request to Api Gateway, then gateway ask service registry for the ipaddress of instances of
 *  that component.Using this ipaddress, gateway send request to that component and gets response.
 *
 *  There are two ways to register our components with service registry.
 *
 *  1.Self
 *  When we are bringing up a particular microservice, that service automatically registers with service registry by
 *  giving it ipaddress and port number.
 *  Each microservice after x seconds pings and let service registry know that it is alive. If it fails to ping then
 *  service registry removes the old instance which are dead.
 *
 *  2.ThirdParty
 *  We can use 3rd party tools, which know what instance are up and what are ipaddress by listening to events in cluster.
 *  Her service registry pings each service and finds whether service is up or down.
 *
 * @Discovery
 *
 * @ClientSideDiscovery
 * It is counter part of registration, in registration we used to update the registry by knowing what service are up
 * and down.
 * In discovery we access all of the information of registry.
 *
 * APIGatewau or client or any microservice wants to talk to another service they can get all the information of
 * that service from the service registry. After getting the information they can do the load balancing on the client side.
 *
 * We can't ask for information from service registry for each request, there has to be certain threshold like
 * if certain n request are failed fetch latest information or for each x seconds get latest information.
 *
 * @ServerSideDiscovery
 *
 *
 * //Go through the narendra Microservice videos. You will video of this Service Registry.
 */
public class ServiceRegistry {
}
