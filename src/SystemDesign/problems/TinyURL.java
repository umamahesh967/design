package SystemDesign.problems;

import java.util.Base64;

/**
 *
 * https://www.youtube.com/watch?v=JQDHz72OA3c
 * https://www.educative.io/courses/grokking-the-system-design-interview/m2ygV4E81AR
 *
 * Base64 encoding video.
 * https://www.youtube.com/watch?v=8qkxeZmKmOY
 * https://stackoverflow.com/questions/4080988/why-does-base64-encoding-require-padding-if-the-input-length-is-not-divisible-by/18518605#18518605
 * "and" = 65 110 100 =>  01000001 01101110 01100100 => 010000 010110 111001 100100 => 16 22 57 36 => QW5K
 *
 *  A-Za-z0-9+/ -- are 64 characters, above 16(Q) 22(W) 57(5) 36(K)
 *
 *  "1" = 49 => 49 0 0 => 00110001 00000000 00000000=> 001100 010000 000000 000000 =>12 16 0 0 => MQ==
 *
 *  In above scenario since for base 64 we require minimum 3 characters since we have only one character we
 *  add additional 2 characters 0 0. Since these are additionally added characters we represent them by
 *  adding special characters 0(=) 0(=) not by normal base64 character 0(A) 0(A).
 *
 *  While decoding MQ==  > Additional characters will be removed and we get "1"
 *
 *
 * @TinyURL
 * We can use range based Counter solution to solve the problem.
 * If we use range based solution we can guess the encoded string. To overcome this we add additional bits.
 * We can take the additional bits from the encoded string itself. Since encoded string is always unique.
 * Even if we add additional bits it will be unique. Since we are picking these additional bits from the already
 * encoded string even if there is URL present we will get the same encoded string even with additional characters.
 *
 * https://www.youtube.com/watch?v=fMZMm_0ZhK4
 */
public class TinyURL
{
    public static void main(String[] args)
    {
        byte[] bytes = Base64.getEncoder().encode("1".getBytes());
        System.out.println(new String(bytes)); //MQ==

    }
}
