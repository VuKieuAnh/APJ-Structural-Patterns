package proxy;

public class Main {
    public static void main(String[] args) {
        UserService thuki = new UserServiceProxy("TK", "Kieu Anh");
        thuki.load();
        thuki.insert();
        UserService thuki1 = new UserServiceProxy("US", "Kieu Anh 1");
        thuki1.load();
        thuki1.insert();

    }
}