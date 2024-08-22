import java.util.Scanner;
import java.util.Locale;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		terminal.useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		} finally {
			terminal.close();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
		
		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++) {
            int numeroAtual = i+1;
            System.out.println("Imprimindo o número " + numeroAtual);
		}
    }
}
