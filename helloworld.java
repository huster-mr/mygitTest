import java.io.Console;
import java.lang.StringBuilder;
import java.util.Date;
import java.util.Scanner;


public class helloworld {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        Console cons = System.console();
        String name1 = cons.readLine("user name:");
        char[] passwd = cons.readPassword("password:");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(passwd);
        System.out.printf("%tc", new Date());
        hi tmp = new hi();
       tmp.fun();
    }
}

class hi{
	public void fun(){System.out.println("hi");}
}