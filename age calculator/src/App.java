import java.util.Scanner ;
public class App {
    public static void main(String[] args){
        System.out.println("AGE CALCULATOR!");
        Integer birthyear;
        Integer currentyear;
        Integer age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        birthyear=scanner.nextInt();
        System.out.print("Enter Current year: ");
        currentyear=scanner.nextInt();
        age = currentyear - birthyear;
        System.out.println("Your age is: "+ age);
        scanner.close();


    }
}