package ferramentaAN;
import java.time.LocalDate;
import java.util.List;

public class Venda {

	private LocalDate dataDaVenda;
	private Cliente cliente;
	private List <Produto> produtos;
	private double valorTotal;
	
	
	//getters e setters
	public LocalDate getDataDaVenda() {
		return dataDaVenda;
	}
	public void setDataDaVenda(LocalDate dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	//lógica de validacao de vendas
	public boolean validarVenda() {
		
		if (dataDaVenda == null || dataDaVenda.isAfter(LocalDate.now())) {
			
			System.out.println("A data da venda é inválida.");
			
			return false;
		}
		
		if (produtos == null || produtos.isEmpty()) {
			
			System.out.println("Digite um produto válido");
			return false;
		}
		
		if (valorTotal <= 0.0) {
			System.out.println("O valor total das vendas deve ser maior que zero.");
		}
		
		return true;
	}
	
	
	
}
