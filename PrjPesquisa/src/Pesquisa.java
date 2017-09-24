
public class Pesquisa {
	public Pessoa[] pesquisa;

	public Pesquisa(int tamanho) {
		pesquisa = new Pessoa[tamanho];
	}

	public int maiorIdade(Pesquisa p) {
		int idade = 0;
		for (Pessoa pessoa : pesquisa) {
			if (pessoa != null) {
				if (pessoa.idade > idade) {
					idade = pessoa.idade;
				}
			}
		}
		return idade;
	}

	float porcentagem(Pesquisa p) {
		float porc;
		int cont = 0;
		int tt = 0;
		for (int i = 0; i < p.pesquisa.length; i++) {
			if (p.pesquisa[i] != null) {
				tt++;
				if ((p.pesquisa[i].idade >= 18 && p.pesquisa[i].idade <= 35) && p.pesquisa[i].olhos == Olhos.verdes
						&& p.pesquisa[i].cabelos == Cabelos.louros) {
					cont++;
				}
			}
		}
		porc = (float) cont / (float) tt;
		return porc;
	}

	void lista(Pesquisa pesquisa) {
		for (int i = 0; i < 100; i++) {
			if (pesquisa.pesquisa[i] != null) {
				System.out.println("idade "+pesquisa.pesquisa[i].idade);
				System.out.println(pesquisa.pesquisa[i].olhos);
				
			}
		}
	}

}
