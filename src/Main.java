import service.MessageService;
import service.PhoneService;

public class Main {
    public MessageService emailService = new PhoneService();
    public void send(){
        emailService.sendEmail("Kieu Anh");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.send();
        System.out.println(main.emailService instanceof MessageService);
    }
}