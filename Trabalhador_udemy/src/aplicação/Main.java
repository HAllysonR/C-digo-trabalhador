package aplica��o;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<funcion�rio> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o n�mero de funcion�rios: ");
		int n = sc.nextInt();
		sc.nextLine();// consumir a quebra de linha
		for (int i = 1; i < n; i++) {
			
			System.out.println("Nome do funcin�rio: " +  i);
			String nome = sc.nextLine();
			System.out.println("Horas trabalhadas");
			int valor = sc.nextInt();
			System.out.println("Valor pot horas trabalhadas");
			double valorHoras = sc.nextDouble();
			System.out.println("O funcion�rio � tercerizado, 1 para sim e 0 para n�o)");
			int resposta  = sc.nextInt();
			if(resposta == 1) {
				System.out.println("Valor adicional");
				double adicional = sc.nextDouble();
				Funcionario_tercerizado  tercerizado = new Funcionario_tercerizado(nome,valor,valorHoras, adicional);
				lista.add(tercerizado);
			}
			else {
				funcion�rio funcio = new funcion�rio(nome,valor,valorHoras);
				lista.add(funcio);
	//pode ser assim tamb�m:lista.add(new funcion�rio(nome,valor,valorHoras));
			}

		}
		
		System.out.println("\n");
		System.out.println("Pagamento");
		//imprimir a lista
		for(funcion�rio fun : lista) {
			System.out.println(fun.getNome()  + " - R$ " + String.format("%.2f", fun.pagamento()));
			
		}

	}

}
