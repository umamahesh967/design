package SystemDesign.microservice;

/**
 *@Monolith
 * @Advantage:
 * 1.Simple deployment.
 * 2.Simple to scale(whole application not module)
 *
 *
 * @CONS:-
 * 1.Technology Dependency(Total application has to use/depend on single language)
 * 2.Engineering Focus(cannot focus on single module we need to have complete knowledge on whole application.)
 * 3.Scaling Data Layer
 * 4.Overloaded VM/Containers
 * 5.CI/CD tests, Build & Conflict.
 * 6.Difficult to understand as each module is tightly coupled with another module.
 * 7.We have to scale the whole application we cannot scale single module.
 *
 *@Microservices
 * Above cons are advantages of microservice.
 * Additionally provides high availability.
 *
 * @Disadvantages
 * 1.InterProcess Communication
 * 2.Distributed Transactions
 * 3.More Resources
 */
public class MonolithVsMicroservices {
}
