package com.jeeDesignPatterns.mvc;

/**
 * https://www.youtube.com/watch?v=mtZdybMV4Bw
 *
 * V is purely presentation.
 * C is glue between presentation and model.
 * (In fact, the "VC" are often thought of together as being the presentation layer, and popular
 * variations of MVC like MVVM -- Model View Viewmodel -- make that even clearer.)
 * The M is everything else: all the data and logic of your application.
 *
 *
 * MVC is both design pattern and Architecture pattern
 *
 * @Model
 * The Model contains only the pure application data, it contains no logic describing how to present
 * the data to a user.
 *
 * If MVC is design pattern then model is just like entity and if MVC is architecture pattern then
 * model can also contain business logic also.
 * https://stackoverflow.com/questions/4415904/business-logic-in-mvc#:~:text=A1%3A%20Business%20Logic%20goes%20to,is%20part%20of%20Business%20Logic%20.
 *
 * Go through comments also in above article.
 *
 * @View
 * The View presents the model’s data to the user. The view knows how to access the model’s data,
 * but it does not know what this data means or what the user can do to manipulate it.
 *
 * @Controller
 * The Controller exists between the view and the model. It listens to events triggered by the
 * view (or another external source) and executes the appropriate reaction to these events.
 * In most cases, the reaction is to call a method on the model. Since the view and the model are
 * connected through a notification mechanism, the result of this action is then automatically reflected
 * in the view.
 */
public class MVC {
}
