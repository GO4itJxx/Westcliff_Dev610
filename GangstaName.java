import java.util.*;

public class GangstaName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your name, Playa: ");
        String name = scan.nextLine();

        String first = name.substring(0 , name.indexOf(" "));
        String last = name.substring(name.indexOf(" ") + 1);
        last = last.toUpperCase();
        String firstInital = name.substring(0 , 1);

        System.out.print("Your gangsta name is \"" + firstInital + ". Diddy " + last + " " + first + "-izzle\"" );
        scan.close();
    }
}