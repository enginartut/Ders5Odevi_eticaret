package core;

import entities.concretes.User;

public interface LoggerAdapter {
    void log(User user);
    void register(User user);
}
