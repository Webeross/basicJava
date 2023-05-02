import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();


              //Variável resultado que armazena os resultados da operação abaixo;
        double resultado;

        if (operacao.equals("+")) {
            resultado = primeiroNumero + segundoNumero;

        } else if (operacao.equals("-")) {
            resultado = primeiroNumero - segundoNumero;

        } else if (operacao.equals("*")) {
            resultado = primeiroNumero * segundoNumero;

        } else if (operacao.equals("/")) {  
            resultado = primeiroNumero / segundoNumero;  
        } else {
            System.out.println("Operação inválida!");
            return;
        }

          System.out.println("Resultado: " + resultado);
            

         



        

  
    }
}
