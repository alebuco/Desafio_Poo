
public class PrjBancoTest {
	
	public static void main(String[] args) {
		int TAM = 3;
		Cliente c[] = new Cliente[TAM];
		for (int i = 0; i < TAM; i++) {
			c[i]=new Cliente();
			c[i].id = i;
			c[i].adicionaCliente(c[i]);
		}
		
		c[0].listaClientes(c);
		
		Conta conta[] = new Conta[TAM];
		for (int i = 0; i < conta.length; i++) {
			conta[i] = new Conta();
			conta[i].numero = i;
			conta[i].cliente = c[i];
			conta[i].gerarValoresConta(conta[i]);
		}
		
		for (int i = 0; i < conta.length; i++) {
			conta[i].imprimeDadosConta(conta[i]);
		}
		

	}

}
