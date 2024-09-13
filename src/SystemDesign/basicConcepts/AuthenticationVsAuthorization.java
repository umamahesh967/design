package SystemDesign.basicConcepts;

/**
 *
 * https://medium.com/@allwindicaprio/session-vs-token-based-authentication-b1f862dd7ed8#:~:text=However%2C%20it%20is%20worth%20noting,using%20the%20system%20at%20once.
 *
 * https://www.loginradius.com/engineering/blog/everything-you-want-to-know-about-authorization-headers/
 *
 * https://www.youtube.com/watch?v=I0poT4UxFxE
 *
 *
 * https://www.youtube.com/watch?v=SLc3cTlypwM
 *
 *
 * ** Very Good ****
 * https://www.youtube.com/watch?v=7Q17ubqLfaM
 * https://www.youtube.com/watch?v=I0poT4UxFxE
 *
 *
 * Authentication
 * Based on the username and password provided we generated the JWT Token.
 * JWT Token will have the roles in the payload.
 *
 * Authorization
 * Based on the token/JWT we verify whether it is valid or not?
 * Validations (Whether signature is correct or not, whether it expired or not )
 * Since we verified the JWT Token signature is valid or not. We can assume the roles present in the payload are correct.
 * Now we have to check whether so and so role can access the API/Resource or not.
 *
 *
 * OAuth 2.0
 * https://www.youtube.com/watch?v=VZH_lGxqFYU
 * https://www.youtube.com/watch?v=ZDuRmhLSLOY
 *
 *
 */
public class AuthenticationVsAuthorization {
}
