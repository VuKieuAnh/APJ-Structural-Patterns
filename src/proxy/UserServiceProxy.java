package proxy;

public class UserServiceProxy implements UserService {

    private String role;
    private UserService userService;

    public UserServiceProxy(String role, String name) {
        this.role = role;
        userService = new UserServiceImpl(name);
    }

    @Override
    public void load() {
        userService.load();
    }

    @Override
    public void insert() {
        if (role=="TK")
        {
            userService.insert();
        }
        else {
            throw new IllegalAccessError("Khong co quyen");
        }
    }
}