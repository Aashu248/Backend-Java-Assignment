package ConsoleLogin;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {
    String email,password;
    Login(String email, String password) {
        this.email=email;
        this.password=password;
    }

    static void main(String[] args) {
        String em,pwd;
        String symbol="@";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter email address:");
        em= in.nextLine();
        System.out.println("Enter password:");
        pwd=in.nextLine();
        if(em.contains(symbol) && em.endsWith(".com")) {
            if (pwd.length()>=6) {
                System.out.println("Login Successful");
                System.out.println("\n========LIST OF PRODUCTS========");
                System.out.println("1    Pen      10");
                System.out.println("2    Book     15");
                System.out.println("3    Pencil   20");
            } else {

                System.out.println("Password has less than 6 character, Enter a valid password");
            }
        }
        else {
            System.out.println("Enter a valid email address");
        }
        Login l=new Login(em,pwd);
    }
}