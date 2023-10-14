package ferramentaAN;

public class Produto {

	private String nome;
	private String categoria;
	private double preco;
	private int quantidadeEmEstoque;
	
	
	public Produto(String nome, String categoria, double preco, int quantidadeEmEstoque) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	
	public boolean validarProduto(Produto produto) {
	    // Verificar se o produto não é nulo
	    if (produto == null) {
	        System.out.println("O produto não pode ser nulo.");
	        return false;
	    }

	    // Verificar se o nome do produto não está vazio
	    if (produto.getNome() == null || produto.getNome().isEmpty()) {
	        System.out.println("O nome do produto não pode estar vazio.");
	        return false;
	    }

	    // Verificar se o preço do produto é maior que zero
	    if (produto.getPreco() <= 0.0) {
	        System.out.println("O preço do produto deve ser maior que zero.");
	        return false;
	    }

	    // Verificar outras condições de validação do produto, se necessário

	    // Se todas as verificações passaram, o produto é considerado válido
	    return true;
	}

	
}
