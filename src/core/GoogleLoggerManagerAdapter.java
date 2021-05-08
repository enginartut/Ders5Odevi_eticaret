package core;

import entities.concretes.User;
import googleLogger.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements LoggerAdapter {

   GoogleLoggerManager googleLoggerManager= new GoogleLoggerManager();

    @Override
    public void log(User user) {

        googleLoggerManager.googleLog(user);
    }

    @Override
    public void register(User user) {
        googleLoggerManager.googleRegister(user);
    }
}
