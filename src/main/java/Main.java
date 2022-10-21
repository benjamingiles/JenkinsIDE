import java.util.Scanner;

public class Main {

  public static void Main() {

    Calculator calculator = new Calculator();
    System.out.println("welcome to the calculator");
    System.out.println("Enter a command:");

    while(true) {

      Scanner scanner=new Scanner(System.in);
      String input = scanner.nextLine();

      if (input.startsWith("add")) {
        int first = Integer.parseInt(String.valueOf(input.charAt(4)));
        int second = Integer.parseInt(String.valueOf(input.charAt(6)));
        System.out.println(calculator.add(first, second));
      }

      else if (input.startsWith("subtract")) {
        int first = Integer.parseInt(String.valueOf(input.charAt(9)));
        int second = Integer.parseInt(String.valueOf(input.charAt(11)));
        System.out.println(calculator.subtract(first, second));
      }
      else if (input.startsWith("multiply")) {
        int first = Integer.parseInt(String.valueOf(input.charAt(9)));
        int second = Integer.parseInt(String.valueOf(input.charAt(11)));
        System.out.println(calculator.multiply(first, second));
      }
      else if (input.startsWith("divide")) {
        int first = Integer.parseInt(String.valueOf(input.charAt(7)));
        int second = Integer.parseInt(String.valueOf(input.charAt(9)));
        System.out.println(calculator.divide(first, second));
      }
      else if (input.startsWith("fibonacci")) {
        int first = Integer.parseInt(String.valueOf(input.charAt(10)));
        System.out.println(calculator.fibonacciNumberFinder(first));
      }
      else if (input.startsWith("binary")) {
        int first = Integer.parseInt(String.valueOf(input.charAt(7)));
        System.out.println(calculator.intToBinaryNumber(first));
      }
    }

  }
}
