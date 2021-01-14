public class Main {
    private SmsService emailService = new SmsService();
    public void send(){
        emailService.sendEmail("Kieu Anh");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.send();
    }
}