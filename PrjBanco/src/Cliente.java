import java.util.Scanner;

public class Cliente {
	public int id;
	public String nome;
	public String cpf;
	public String dataNascimento;
	
	Cliente adicionaCliente(Cliente c){
		Scanner sc = new Scanner(System.in);
		System.out.println("Id: " + c.id);
		System.out.print("Nome : ");
		c.nome = sc.nextLine();
		System.out.print("CPF: ");
		c.cpf = sc.nextLine();
		System.out.print("Data Nascimento: ");
		c.dataNascimento = sc.nextLine();
		System.out.println("");
		
		return c;
	}
	
	void listaClientes(Cliente c[]){
		for (Cliente cliente : c) {
			System.out.println("id: " + cliente.id);
			System.out.println("nome: " + cliente.nome);
			System.out.println("cpf: "+ cliente.cpf);
			System.out.println("data nascimento: "+cliente.dataNascimento);
			System.out.println("");
		}
	}
	
	void listaCliente(Cliente cliente){
			System.out.println("id: " + cliente.id);
			System.out.println("nome: " + cliente.nome);
			System.out.println("cpf: "+ cliente.cpf);
			System.out.println("data nascimento: "+cliente.dataNascimento);
			System.out.println("");
		
	}
}
