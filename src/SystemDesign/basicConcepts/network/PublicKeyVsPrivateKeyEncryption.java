package SystemDesign.basicConcepts.network;

/**
 * @PublicKey
 * Both sender and receiver uses same key to encrypt and decrypt the message
 *
 * @PriavateKey
 * uses a separate key for encryption and decryption.
 * Anyone can use the encryption key (public key) to encrypt a message.
 * However, decryption keys (private keys) are secret. This way only the intended receiver
 * can decrypt the message.
 *
 *
 * https://www.digicert.com/ssl-cryptography.htm#:~:text=PKI%20uses%20a%20hybrid%20cryptosystem,the%20SSL%20Handshake%20is%20symmetric.&text=Then%20sends%20it%20to%20the%20server.
 */
public class PublicKeyVsPrivateKeyEncryption
{
}
