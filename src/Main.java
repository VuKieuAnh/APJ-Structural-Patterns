import service.Injector;
import service.MessageService;
import service.PhoneService;

import javax.management.InstanceNotFoundException;

public class Main {
    public MessageService emailService = (MessageService) Injector.getInstance("messageService");

    public Main() throws InstanceNotFoundException {
    }

    public void send(){
        emailService.sendEmail("Kieu Anh");
    }

    public static void main(String[] args) throws InstanceNotFoundException {

        Main main = new Main();
        main.send();
        System.out.println(main.emailService instanceof MessageService);
    }
}