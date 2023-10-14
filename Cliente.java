package ferramentaAN;

public class Cliente {
	
	//atributos da classe
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	
	
	public Cliente(String nome, String email, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public boolean validaCliente() {
		
		if (nome == null || nome.isEmpty()) {
			
			System.out.println("Nome inválido");
			
			return false;
		}
		
		if (email == null || email.isEmpty()) {
			
			System.out.println("Email inválido");
			
			return false;
		}
		
		if (telefone == null || telefone.isEmpty()) {
			
			System.out.println("Telefone inválido");
			
			return false;
		}

		if (endereco == null || endereco.isEmpty()) {
	
			System.out.println("Endereco inválido");
	
			return false;
		}
		
		return true;
	}
	
}
