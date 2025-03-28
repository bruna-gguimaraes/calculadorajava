import java.util.Scanner;

public class CalculadoraJava {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite o primeiro número: ");
      double num1 = scanner.nextDouble();
      System.out.print("Digite o segundo número: ");
      double num2 = scanner.nextDouble();
      System.out.print("Digite a operação (+, -, *, /): ");
      char operador = scanner.next().charAt(0);
      scanner.close();
      double resultado;

      switch(operador) {
         case '+':
           resultado = num1 + num2;
            break;
         case '-':
            resultado = num1 - num2;
            break;
         case '*':
            resultado = num1 * num2;
            break;
         case '/':
            resultado = num1 / num2;
            break;
         default:
            System.out.println("Operação inválida.");
            return;
      }

      System.out.println(num1+" "+operador+" "+num2+": "+resultado);
   }
}
