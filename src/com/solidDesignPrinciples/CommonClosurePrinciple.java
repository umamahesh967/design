package com.solidDesignPrinciples;

/**
 * https://ericbackhage.net/clean-code/the-common-closure-principle/
 *
 * https://link.springer.com/chapter/10.1007/978-1-4842-4119-6_8#:~:text=The%20principle%20says%20that1,the%20same%20kinds%20of%20changes.
 *
 * This principle basically states that we have to group all classes that are related.
 *
 * Definition:-
 * 1.The classes in a component should be closed together against the same kind of changes
 * 2.A change that affects a component affects all the classes in that component and no other components
 *
 * Definition 1 means:- All similar kind of changes should be incorporated in single component/Package/Class/Method,
 *                      and that component/Package/Class/Method should be closed for making any other kind of changes.
 *                      Basically it is Single Responsibility Principle at higher level.
 *
 * To put it in other words, a component should not have multiple reasons to change.
 * This is the Single Responsibility Principle (SRP) from SOLID restated for components.
 * As with SRP, full closure is not possible. There will always be changes that requires
 * multiple components to be changed. The aim should be to be strategic and place classes that we,
 * from experience, know often changes together into the same component.
 *
 * Cohesion is about grouping related things together.
 *
 * Common Closure Principle comes under cohesion principles.
 * https://adriancitu.com/tag/the-common-closure-principle/
 */
public class CommonClosurePrinciple {
}
