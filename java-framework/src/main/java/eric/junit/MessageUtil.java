package eric.junit;

/**
 * Created by root on 1/15/16.
 */
public class MessageUtil {
    private String message;

    //@param message to be printed
    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public String salutationMessage() {
        message = "Hi! " + message;
        System.out.println(message);
        return message;
    }
}
