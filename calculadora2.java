package Calculadora;

import java.util.Scanner;

public class calculadora2 {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		{
			float numero1, numero2;
			char operacao;
			String continua = "SIM";

		//	while (continua == "SIM") {
				Scanner entrada = new Scanner(System.in);
				System.out.println("Escolha sua operação [+ - * / ]: ");
				operacao = entrada.nextLine().charAt(0);
				System.out.println("Entre com o primeiro número: ");
				numero1 = entrada.nextFloat();
				System.out.println("Entre com o segundo número: ");
				numero2 = entrada.nextFloat();
				System.out.println("          ");

				switch (operacao) {
				case '+':
					System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
					break;
				case '-':
					System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
					break;
				case '*':
					System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
					break;
				case '/':
					System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
					break;

				default:

					System.out.println("Você digitou uma operação inválida.");
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Voce deseja continua calculando, digite SIM, caso contrario = NAO");
				continua = entrada.next();
				if (continua == "SIM") {

					numero1 = 0;
					numero2 = 0;
					operacao = ' ';

				} else if (continua == "NAO") {
					System.out.println("Operacao finalizada");
				} else {
					System.out.println("Digitação da Continuação invalida " + continua);
					{
						continua = "SIM";
						
						
					}

				}

			}
		}
	}
//}