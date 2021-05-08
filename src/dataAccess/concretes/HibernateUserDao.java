package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class HibernateUserDao implements UserDao {

    @Override
    public void register(User user) {

        System.out.println("kullanıcı sisteme Hibernate ile başarıyla kaydedildi :"+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("kullanıcı sistemden  Hibernate ile silindi :"+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public void update(User user) {
        System.out.println("kullanıcı bilgileeri  Hibernate ile güncellendi :"+user.getFirstName()+" "+user.getLastName());
    }



    @Override
    public void login(User user) {
        System.out.println("kullanıcı bilgileeri  Hibernate ile " +
                " sisteme login oldu :"+user.getFirstName()+" "+user.getLastName());
    }
}
