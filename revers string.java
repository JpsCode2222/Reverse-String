import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Name : ");
        String name = sc.nextLine();
        int L = name.length();
        String rev = "";
        for (int i = L-1; i >= 0 ; i--) {
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);

    }
}