package SystemDesign;

/**
 * In master slave architecture put method is handled by only master.
 * Where as get can handled by both master and replicas.
 *
 * Role of MySQL master-slave synchronization:
 *
 * 1.Data distribution
 * 2.Load balancing
 * 3.Copy
 * 4.High availability and error tolerance
 *
 * The process of master-slave synchronization is as follows:
 *
 * 1.The master server verifies the connection.
 * 2.The master server opens a thread for the slave server.
 * 3.The slave server notifies the master server of the master server log's offset bit.
 * 4.The master server checks whether the value is smaller than the offset bit of the current binary log.
 * 5.If so, it notifies the slave server to fetch the data.
 * 6.The slave server keeps fetching data from the master server until all the data has been obtained.
 *  Then the slave server and master server thread enter sleep mode simultaneously.
 * 7.When there is an update to the master server, the master server thread is activated and pushes the
 *  binary log to the slave server, signaling the slave server thread to run.
 * 8.The slave server SQL thread executes the binary log and then sleeps.
 *
 * https://www.alibabacloud.com/blog/master-slave-data-synchronization-for-mysql_241374#:~:text=The%20synchronization%20of%20master%20and,of%20said%20synchronization%20very%20important.&text=RDS%20for%20MySQL%205.1%20synchronizes,primary%20and%20standby%20databases%20asynchronously.
 */
public class MasterSlaveArchitecture {
}
