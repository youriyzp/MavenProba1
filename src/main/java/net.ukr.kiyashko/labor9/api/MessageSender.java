package net.ukr.kiyashko.labor9.api;

/**
 * Interface for the ability to send messages
 */
public interface MessageSender {

    /**
     * Send message.
     * @param message message text.
     */
    void sendMessage(String message);
}
