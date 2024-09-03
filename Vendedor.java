package loja;

public class Vendedor {
	private String nome;
	private int tempoServico;
	private char categoria;
	private Double totalVendas;
	
	private static double salarioBase = 1500;
	
	public Vendedor(String nome, int tempoServico, Double totalVendas) {
		this.nome = nome;
		this.tempoServico = tempoServico;
		this.totalVendas = totalVendas;
		this.setCategoria();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static Double getSalarioBase() {
		return salarioBase;
	}
	public static void setSalarioBase(Double salarioBase) {
		Vendedor.salarioBase = salarioBase;
	}
	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}
	public char getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (tempoServico > 60) {
			this.categoria = 'A';
		}
		else if (tempoServico >= 30 && tempoServico <= 60) {
			this.categoria = 'B';
		}
		else {
			this.categoria = 'C';
		}	
	}
	public Double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(Double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public Double comissao() {
		if (totalVendas > 20000) {
			return totalVendas*0.2;
		}
		else if (totalVendas >=10000 && totalVendas <= 20000) {
			return totalVendas*0.15;
		}
		else {
			return totalVendas*0.05;
		}
	}
	
	public Double gratificacao () {
		if(categoria == 'A') {
			return salarioBase * 0.15;			
		}
		else if(categoria == 'B') {
			return salarioBase * 0.075;
		}
		else {
			return 0.0;
		}
	}
	
	public Double salario () {
		return salarioBase + this.comissao() + this.gratificacao();
	}
	
	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", tempoServico=" + tempoServico + ", categoria=" + categoria
				+ ", totalVendas=" + totalVendas + "]";
	}


}
