package pl.coderslab.onljees02sb.admin;

public interface UserService {

    User findByUserName(String name);

    void saveUser(User user);
}
