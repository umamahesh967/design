package com.designPatterns.creationalDesignPattern.cpc.dp.builder2;

//import com.cpc.dp.builder2.UserDTO.UserDTOBuilder;
import com.designPatterns.creationalDesignPattern.cpc.dp.builder.Address;
import com.designPatterns.creationalDesignPattern.cpc.dp.builder.User;

import java.time.LocalDate;
import java.util.Calendar;

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
 * @Pitfall is
 * The  issue that you can face is that there is a chance that you can run in this scenario where you have a
 * partially initialized object so in this scenario what can happen is that the client code or the user who is
 * using a builder can set only a few or none of the properties on our builder and it can directly call the
 * build method. And if the required properties are missing then build method needs to explicitly handle that
 * particular scenario. So you can either provide some sensible defaults or you can throw an exception.
 *
 * {@link Calendar.Builder#build()} is an example of Builder Pattern
 * Based on the locale, Timezone, Country it create calender in above builder
 */
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		// Client has to provide director with concrete builder
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		System.out.println(dto);
	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
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
