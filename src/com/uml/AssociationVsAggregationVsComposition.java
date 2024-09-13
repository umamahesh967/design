package com.uml;

/**
 * ****Very Good******
 * https://www.youtube.com/watch?v=87Ty18RNr-c
 *
 *
 * Association is superset of Aggregation and Composition.
 *
 * Every Aggregation or Composition is Association.
 *
 */
public class AssociationVsAggregationVsComposition
{

}

/* @Association
 * Let say we have class A and Class B.
 * They are not dependent on each other.
 * Both can exist independently. Lifetime of A is not dependent on B and lifetime of B is not dependent on A. But there can be some
 * communication between them, then this type of relation is called Association.
 *
 * Ex:
 * 1. Doctor and Patient. (both can exist independently but they communicate with each other).
 * 2. Teacher and Student. same as above
 * 3. Driver and Car
 *
 * class Driver
 * {
 *      void drive(Car car)
 *      {
 *
 *      }
 * }
 *
 * class Car
 * {
 *
 * }
 *
 * int main(){
 *     Driver d1, d2,....;
 *     Car c1, c2, c3,...;
 *
 *     d1.drive(c1);
 *     d1.drive(c2);
 *     d2.drive(c1);
 *     .
 *     .
 *     .
 * }
 */
class Association
{

}


/**
 *
 * Let say we have class A and Class B.
 *
 * A own B. But lifetime of B doesn't depend on A. i.e B class object is not created inside A.
 * it is also called Has-A relation.
 *
 * Ex:
 * 1.Department and Teacher.
 * 2.Person and Address.
 *
 * class Person
 * {
 *     String name;
 *     Address address;
 *     Person(Address address) // hear person has address.
 *     {
 *         this.address = address;
 *     }
 * }
 *
 * class Address{
 *     string hno;
 *     string colony;
 *     .
 *     .
 *     .
 * }
 *
 * int main()
 * {
 *     Address address1 = new Address(104, "Housing Colony", ...);
 *     person person = new Person(address1);// but even if we destroy person, address can exist independently.
 * }
 *
 */
class Aggregation
{

}


/**
 * Let say we have class A and Class B.
 *
 * A own B. But lifetime of B depends on A. i.e B class object is created inside A.
 * it is also called Has-A relation.
 * Ex:
 * 1. House and Room
 * 2. Question and Option.
 *
 * class Question
 * {
 *      int questionNo;
 *      Option a,b,c,d; // here when we destroy Question Object it will also destroy Option objects.
 *
 *      public Question()
 *      {
 *          a = new Option();
 *          b = new Option();
 *          c = new Option();
 *          d = new Option();
 *      }
 *
 * }
 *
 * class Option
 * {
 *
 * }
 *
 * int main()
 * {
 *     Question question = new Question();
 *
 * }
 */
class Composition
{

}





