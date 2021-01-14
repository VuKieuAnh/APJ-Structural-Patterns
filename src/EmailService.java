public class EmailService implements MessageService {
    public void sendEmail(String mess){
        System.out.println("Email Service: " + mess);
    }
}