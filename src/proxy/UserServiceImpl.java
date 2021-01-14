package proxy;

public class UserServiceImpl implements UserService {
    private String name;

    public UserServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void load() {
        System.out.println(name + " đang đc tải");
    }

    @Override
    public void insert() {
        System.out.println(name + " đã đc thêm mới");
    }
}