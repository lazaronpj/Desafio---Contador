import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();

		System.out.println("\n\nParâmetro 2 - Parâmetro 1 \n");

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			System.out.println("ERRO: O número 2 deve ser maior do que o número 1!");
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("ERRO");
		} else {
			int contagem = parametroDois - parametroUm;
			// realizar o for para imprimir os números com base na variável contagem
			for (int i = 0; i < contagem; i++) {
				System.out.println("Imprimindo o número " + contagem + ".");
			}
			System.out.println("\n\nContagem feita com sucesso!\n\n");
		}
	}
}