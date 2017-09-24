
public class PrjPesquisaTest {
	static int cont;
	static int dados;

	public static void main(String[] args) {

		Pesquisa pesquisa = new Pesquisa(100);
		dados = -1;
		cont = 0;
		for (int i = 0; i < pesquisa.pesquisa.length; i++) {

			while (dados != 0) {
				Pessoa pessoa = new Pessoa();
				pessoa = pessoa.entrarDados();
				if (dados != 0) {
					pesquisa.pesquisa[cont] = pessoa;
				}
			}
		}

		System.out.println("Maior idade : " + pesquisa.maiorIdade(pesquisa));

		System.out.printf("%% %.2f\n ", (pesquisa.porcentagem(pesquisa) * 100f));
	}

}
