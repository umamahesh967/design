package SystemDesign.problems.Pastebin;


/**
 * What is pastebin and how it works?
 * PasteBin is great tool to use for sharing programming language.
 * We paste the content in the PasteBin and generate url and we can share URL to other people.
 * https://www.youtube.com/watch?v=oCS0kU5VFA4
 *
 * Distribution key generation Service
 * Two threads- One thread for providing keys, Other thread for key generation and storing the keys in redis.
 *
 *
 * @KGS(Key Generation Service)
 * We generate key and store it in In Memory(Redis).
 * We can multi threads to create and store it in
 */
public class Pastebin
{

}
