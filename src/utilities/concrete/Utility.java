package utilities.concrete;

import entities.concretes.User;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility  {


    public static boolean isValidateRegitration(User user) {

        if(user.getFirstName().isEmpty() ||
                user.getLastName().isEmpty() ||
                user.getEmail().isEmpty() ||
                user.getPassword().isEmpty()){
            System.out.println("ad,soyad,eposta ve parola bilgileri bos gecilemez!!!");
            return false;
        }

        if(user.getFirstName().length()<2 || user.getLastName().length()<2){
            System.out.println("Ad ve soyad bilgileri en az iki karakter olmalidir!!!");
            return false;
        }

        if(user.getPassword().length()<6){
            System.out.println("Parolaniz en az alti karakter olmalidir!!!");
            return false;
        }

        if(Utility.isValidEmailFormat(user)){
            System.out.println("Girmis oldugunuz e-posta formati yanlisdir!!!");
            return false;
        }

        return true;
    }


    public static boolean isValidEmailFormat(User user) {
        String regex ="[_a-zA-Z1-9]+(\\.[A-Za-z0-9]*)*@[A-Za-z0-9]+\\.[A-Za-z0-9]+(\\.[A-Za-z0-9]*)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(user.getEmail());
        return matcher.matches();

    }
}
