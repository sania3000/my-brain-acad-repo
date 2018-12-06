package ua.zp.braincad.sania3000.lab9.api;

/**
 * Interface for the ability to send messages
 */
public interface MessageSender {

    /**
     * Send message.
     * @param message message text.
     */
    void sendMessage(String message);

    default  void method(String sms){
        System.out.println("''"+sms+"''");

    }
}
