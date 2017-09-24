import java.util.Random;

public class Conta {
	public int numero;
	public Cliente cliente;
	public Double saldo[];
	
	public Conta(){
		saldo = new Double[12];
	}
	
	void gerarValoresConta(Conta conta){
		Random rd = new Random();
		conta.cliente.listaCliente(conta.cliente);
		for (int i = 0; i < saldo.length; i++) {
			conta.saldo[i] = rd.nextDouble() * 1000;
		}
	}
	
	void imprimeDadosConta(Conta conta){
		System.out.println("Conta numero: " + conta.numero);
		conta.cliente.listaCliente(conta.cliente);
		for (int i = 0; i < saldo.length; i++) {
			System.out.printf("%3.2f \t",conta.saldo[i]);
		}
		System.out.printf("\n\n");
	}
}
