import java.util.Scanner;

public class Pessoa {
	public Sexo sexo;
	public Olhos olhos;
	public Cabelos cabelos;
	public int idade;

	public Pessoa entrarDados() {
		PrjPesquisaTest.dados = 1;
		System.out.println("Entre com os dados (idade -1 para sair): ");
		Pessoa pessoa = new Pessoa();
		Scanner sc = new Scanner(System.in);
		System.out.print("Idade: ");
		pessoa.idade = Integer.parseInt(sc.nextLine());
		if (pessoa.idade == -1) {
			pessoa.equals(null);
			PrjPesquisaTest.dados=0;
			System.out.println("Termino de entrada de dados ...");
			return pessoa;
		}

		int op = 0;
		while (op < 1 || op > 2) {
			System.out.print("Entre com o sexo (1-F / 2-M): ");
			op = Integer.parseInt(sc.nextLine());
			if (op == 1) {
				pessoa.sexo = Sexo.feminino;
			} else if (op == 2) {
				pessoa.sexo = Sexo.masculino;
			}
		}
		op = 0;
		while (op < 1 || op > 3) {
			System.out.print("Cor dos olhos: (1-azuis /2- verdes /3-castanhos)");
			op = Integer.parseInt(sc.nextLine());
			switch (op) {
			case 1: {
				pessoa.olhos = Olhos.azuis;
				break;
			}
			case 2: {
				pessoa.olhos = Olhos.verdes;
				break;
			}
			case 3: {
				pessoa.olhos = Olhos.castanhos;
			}
			}
		}
		op = 0;
		while (op < 1 || op > 3) {
			System.out.print("Cor dos cabelos: (1-louros /2- castanhos /3-pretos)");
			op = Integer.parseInt(sc.nextLine());
			switch (op) {
			case 1: {
				pessoa.cabelos = Cabelos.louros;
				break;
			}
			case 2: {
				pessoa.cabelos = Cabelos.castanhos;
				break;
			}
			case 3: {
				pessoa.cabelos = Cabelos.pretos;
			}
			}
		}
		System.out.println("Dados registrados");
		PrjPesquisaTest.cont++;
		return pessoa;
	}

}
