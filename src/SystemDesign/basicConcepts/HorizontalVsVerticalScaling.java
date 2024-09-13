package SystemDesign.basicConcepts;

/**
 * @VerticalScaling - (Bigger Machine)
 * 1.Load Balancing not required as we have single machine.
 * 2.Single Point of Failure.
 * 3.Inter process communication.
 * 4.Data consistency
 * 5.Hardware limit.
 * 6.Good example is MySQL as it allows for an easy way to scale vertically by switching from smaller
 *   to bigger machines. However, this process often involves downtime.
 *
 * @HorizontalScaling - (More machines)
 * 1.Load Balancing required as we have multiple machine.
 * 2.Resilient - (able to withstand or recover quickly from difficult conditions).
 * 3.Network Calls.
 * 4.Data Inconsistency
 * 5.Scales well as users increases.
 * 6.Good examples are Cassandra and MongoDB as they both provide an easy way to scale horizontally
 *   by adding more machines to meet growing needs
 */
public class HorizontalVsVerticalScaling
{
}
