package com.designPatterns.behaviourDesignPattern.chainofresponsibility;


import java.time.LocalDate;

/**
 * @javax.servlet.Filter Here Multiple class implement Filter which process the request.
 *
 * But the difference is that here one Filter doesn't handle request  to another Filter.
 *
 * Instead Filter invokes FilterChain to process the request.
 *
 * Filter has FilterChain.
 *
 * FilterChain object has instance same FilterChain.
 *
 * Filter
 * ---FilterChain
 *
 * FilterChain
 * ---FilterChain
 *
 * When we invoke doFilter on Filter. Inside doFilter of Filter we call filterchain1.doFilter which
 * calls on doFilter method inside filterChain1 object.
 * filterChain1 has filterChain2 which in turn calls filterChain2.doFilter inside filterChain1.doFilter method.
 * This process continues till the end of FilterChain.
 */
public class Client
{

	public static void main(String[] args) {
	   LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.LOP.Sick)
			   	                      .from(LocalDate.now()).to(LocalDate.of(2018, 2, 28))
			   	                      .build();
	   System.out.println(application);
	   System.out.println("**************************************************");
	   LeaveApprover approver = createChain();
	   approver.processLeaveApplication(application);
	   System.out.println(application);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
	
}
