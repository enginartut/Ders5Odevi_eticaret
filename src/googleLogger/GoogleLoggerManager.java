package googleLogger;

import entities.concretes.User;

public class GoogleLoggerManager {
    public  void googleLog(User user){
        System.out.println("google hesabı ile sisteme login olundu "+user.getFirstName()+" "+user.getLastName());
    }
    public  void googleRegister(User user){
        System.out.println("google hesabı ile sisteme kaydolundu "+user.getFirstName()+" "+user.getLastName());
    }
}
