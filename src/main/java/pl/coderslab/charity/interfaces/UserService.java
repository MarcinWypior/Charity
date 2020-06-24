package pl.coderslab.charity.interfaces;

import pl.coderslab.charity.entities.User;

public interface UserService {

    User findByUserName(String name);

    void saveUser(User user);
}