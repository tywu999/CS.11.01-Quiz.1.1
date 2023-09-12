import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner;
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age:");
        scanner = new Scanner(System.in);
        age = scanner.nextInt();
        System.out.println("Please enter your first name:");
        scanner = new Scanner(System.in);
        firstName = scanner.next();
        System.out.println("Please enter your favourite food:");
        scanner = new Scanner(System.in);
        favouriteFood = scanner.next();
        System.out.println("First Name: " + firstName + "\n" + "\n" + "Age: " + age + "\n" + "\n" + "Favourite Food: " + favouriteFood );


    }

}