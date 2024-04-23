import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		try {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
		
			
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (InputMismatchException e) {
			System.out.println("O campo primeiro parametro e segundo parametro precisam ser númericos");
	
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		} catch (ParametrosInvalidosException e){
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois){
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	    for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número: "+i);
		}
	}
}
