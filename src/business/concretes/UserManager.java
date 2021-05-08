package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import utilities.concrete.Utility;

public class UserManager implements UserService {

    UserDao userDao;

    public UserManager(UserDao userDao) {

        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        if(Utility.isValidateRegitration(user)){
            this.userDao.register(user);
        }
       else
        {
            System.out.println("Kayıt işlemi başarızdır.");
        }
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void login(User user) {
      if(user.getEmail().isEmpty() || user.getPassword().isEmpty()){
          System.out.println("email veya şifrenizi girmediniz");
          return;
      }else
      {
          this.userDao.login(user);
      }

    }
}

