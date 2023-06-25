import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HDFCAccount h1=new HDFCAccount("atul", 1000, "12345");

        System.out.println(h1.addMoney(500));
        System.out.println(h1.windrawMoney("1234", 500));
        System.out.println(h1.windrawMoney("12345", 5000));;
        System.out.println(h1.windrawMoney("12345", 500));
        System.out.println(h1.fetchBalance("12345"));
        System.out.println(h1.clculateInterest(sc.nextInt()));


        System.out.println(h1.changeChange("2222","3333"));
        System.out.println(h1.fetchBalance("2222"));

    }
}