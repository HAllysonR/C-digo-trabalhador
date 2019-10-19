package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<funcionário> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o número de funcionários: ");
		int n = sc.nextInt();
		sc.nextLine();// consumir a quebra de linha
		for (int i = 1; i < n; i++) {
			
			System.out.println("Nome do funcinário: " +  i);
			String nome = sc.nextLine();
			System.out.println("Horas trabalhadas");
			int valor = sc.nextInt();
			System.out.println("Valor pot horas trabalhadas");
			double valorHoras = sc.nextDouble();
			System.out.println("O funcionário é tercerizado, 1 para sim e 0 para não)");
			int resposta  = sc.nextInt();
			if(resposta == 1) {
				System.out.println("Valor adicional");
				double adicional = sc.nextDouble();
				Funcionario_tercerizado  tercerizado = new Funcionario_tercerizado(nome,valor,valorHoras, adicional);
				lista.add(tercerizado);
			}
			else {
				funcionário funcio = new funcionário(nome,valor,valorHoras);
				lista.add(funcio);
	//pode ser assim também:lista.add(new funcionário(nome,valor,valorHoras));
			}

		}
		
		System.out.println("\n");
		System.out.println("Pagamento");
		//imprimir a lista
		for(funcionário fun : lista) {
			System.out.println(fun.getNome()  + " - R$ " + String.format("%.2f", fun.pagamento()));
			
		}

	}

}
