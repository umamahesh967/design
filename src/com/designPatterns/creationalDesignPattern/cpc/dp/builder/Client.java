package com.designPatterns.creationalDesignPattern.cpc.dp.builder;

import java.time.LocalDate;

/**
 * When we need to create Builder Design Pattern?
 * When there is need to create immutable object we need to pass all the parameters for that object
 * during construction of that object meaning in Constructor itself. Then Object invocation becomes difficult.
 *
 * So we really use builder design pattern whenever we have a complex process to create an object and the
 * complexity could be because of the number of arguments that a constructor needs or the complexity maybe
 * because of the steps that are needed in order to create the object.
 *
 *
 * You can easily create any Immutable class if you implement your builder as an inner static class. Because that way
 * you can declare all the setter methods declared as private and avoid writing a bad constructor which needs
 * all of the objects state in the constructor itself.
 *
 * You will find this type of implementation used quite frequently even if immutability is not a main concern.
 *
 * For example you're designing your classes and you have a class which whose constructor needs a lot of
 * information then that is a good indication that a builder design pattern can be used.
 *
 */

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		//Client has to provide director with concrete builder
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
			   .withAddress(user.getAddress())
			   .withBirthday(user.getBirthday())
			   .build();
	}

	/**
	 * Returns a sample user.
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
