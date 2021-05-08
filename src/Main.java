import business.concretes.UserManager;
import core.GoogleLoggerManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.AdaptorDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;
import googleLogger.GoogleLoggerManager;

public class Main {

    public static void main(String[] args) {

        User user1= new User(1,"Engin","sad","engin@gmail.com","123456");
        UserManager userManager= new UserManager(new HibernateUserDao()) ;
        userManager.register(user1);
    }
}
