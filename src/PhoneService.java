public class PhoneService implements MessageService {
    @Override
    public void sendEmail(String mess) {
        System.out.println("Phone: " + mess);
    }
}