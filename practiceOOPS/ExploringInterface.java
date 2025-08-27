package practiceOOPS;

interface Message{
    void send(String text);
    // public and abstract is used in it implicitely

    static boolean validate(String text) {
        return text != null && !text.isBlank();
    }

    default void previewFormatted(String text) {
        System.out.println("Preview: " + format(text)); // ✅ using private method
    }

    private  String format(String msg){
        return msg.trim().toUpperCase();
    }
}

// EmailMessage class should be outside the interface
class EmailMessage implements Message {
    @Override
    public void send(String text) {
        if (Message.validate(text)) {
            System.out.println("Sending Email: " + text);
        } else {
            System.out.println("Invalid email content.");
        }
    }
}

public class ExploringInterface {
    public static void main(String[] args) {
        EmailMessage message = new EmailMessage();
        message.send("This is a Message going to send");

        message.previewFormatted("   Formated text    ");
    }
}
