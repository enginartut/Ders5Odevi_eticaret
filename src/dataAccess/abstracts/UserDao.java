package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
    void register(User user);

    void delete(User user);

    void update(User user);

    void login(User user);

}
