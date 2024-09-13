package SystemDesign.basicConcepts.network;

/**
 * @HTTP - HyperText Transfer Protocol
 * In standard http, all information is sent in clear text.
 *
 * Since data is sent in clear text, it is vulnerable to hackers.
 *
 * @HTTPS - Secure HyperText Transfer Protocol
 * Encrypts the data that is being retrieved by http.
 * Uses the encryption algorithms to encrypt the data that is being transferred.
 * Https uses one of two protocols to protect the data, SSL or TLS
 *
 * @SSL - Secure Socket Layer - It is protocol that is used to ensure security on the internet.
 * It uses public key encryption to secure the data.
 *
 * Basically this is how SSL works. So when computer connects to website that's using SSL the computer
 * web browser will ask the website to identify itself. Then the web server will send the copy of it's
 * SSL certificate. A SSL Certificate is a small digital certificate that is used to authenticate the
 * identity of the website. Basically it will let your computer know that the website you are visiting is
 * trustworthy. The computer web browser checks to make sure that it trusts the certificate and if it does
 * it will send a message to webserver, then after that webserver will respond back with an acknowledgement.
 * After all these steps encrypted data can be exchanged between computer and webserver.
 *
 *
 * @TLS - Transport Layer Security
 * It is the latest industry standard cryptographic protocol. It is the successor to SSL and based on same specifications.
 * Like SSL it also authenticates the server, client and encrypts the data.
 *
 *
 * @SessionKey
 * A relatively short-lived cryptographic key, often negotiated by a client and a server based on a
 * shared secret. A session key's lifespan is bounded by the session to which it is associated.
 * A session key should be strong enough to withstand cryptanalysis for the lifespan of the session.
 * When session keys are transmitted, they are generally protected with key exchange keys (which are
 * usually asymmetric keys) so that only the intended recipient can access them.
 * Session keys can be derived from hash values by calling the CryptDeriveKey function.
 *
 *
 * @SymmetricEncryption
 * Encryption that uses a single key for both encryption and decryption.
 * Symmetric encryption is preferred when encrypting large amounts of data.
 * Some of the more common symmetric encryption algorithms are RC2, RC4, and Data Encryption Standard (DES).
 *
 *
 * https://www.youtube.com/watch?v=hExRDVZHhig
 * https://www.youtube.com/watch?v=sEkw8ZcxtFk
 *
 * Below two articles are good.
 * https://docs.microsoft.com/en-us/windows/win32/secauthn/tls-handshake-protocol#:~:text=Key%20Exchange,-The%20client%20and&text=The%20Master%20Secret%20is%20used,session%20key%20used%20for%20encryption.
 *
 * //Breaking Down the TLS Handshake ***Good***
 * https://www.youtube.com/watch?v=cuR05y_2Gxc
 */
public class HttpVsHttps {
}
