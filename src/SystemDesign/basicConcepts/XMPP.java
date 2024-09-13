package SystemDesign.basicConcepts;

/**
 *
 * XMPP is a short form for Extensible Messaging Presence Protocol.
 * It's protocol for streaming XML elements over a network in order to exchange messages and presence
 * information in close to real time. This protocol is mostly used by instant messaging applications like WhatsApp.
 *
 * https://www.geeksforgeeks.org/xmpp-protocol/
 *
 * XMPP is a application layer protocol similar to HTTP, HTTPS.
 * It uses TCP in transport layer to send data.
 *
 * XMPP is a peer-to-peer protocol naturally allowing communication with applications.
 * XMPP includes advanced user authentication and authorization which makes it easier to make sure
 * unauthorized access to private content is prevented.
 *
 * https://stackoverflow.com/questions/26549010/xmpp-vs-websocket.
 *
 * The XMPP protocol: Extensible Messaging and Presence Protocol (abbreviated as XMPP) is an open source
 * and extensible protocol that was originally referred as Jabber. XMPP protocol supports the transmission of
 * current information such as data. As a messaging protocol, it can only be applied effectively by moving
 * through an appropriate transport binding such as TCP/IP, HTTP, or WebSocket.
 * https://medium.com/@thinkwik/web-sockets-vs-xmpp-which-is-better-for-chat-application-113e3520b327
 *
 * XMPP is going to take websocket connection in chat application.
 *
 * Direct Messaging or chatting with matches can be done using the XMPP protocol, which uses web sockets to
 * have peer to peer communications between client and server. Each connection is built over TCP,
 * ensuring that the connection is maintained.
 */
public class XMPP {
}
