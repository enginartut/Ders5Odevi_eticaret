package dataAccess.concretes;

import core.LoggerAdapter;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class AdaptorDao implements UserDao {

    private LoggerAdapter loggerAdapter;

    public AdaptorDao(LoggerAdapter loggerAdapter) {
        this.loggerAdapter = loggerAdapter;
    }

    @Override
    public void register(User user) {
        loggerAdapter.register(user);
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void login(User user) {
        loggerAdapter.log(user);
    }
}
