import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double fahrenheit = number.nextInt();
        double celsius = (fahrenheit - 32.0) * (5/9.0);
        System.out.println(fahrenheit + " grade  Fahrenheit reprezinta " + String.format("%2f",celsius)+ " Grade  + Celsius.");
    }}
