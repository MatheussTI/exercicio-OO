package loja;

import java.util.ArrayList;

public class VetVendedor {
	
	private ArrayList<Vendedor> list;
	
	public VetVendedor(Vendedor vendedor) {
		list = new ArrayList<Vendedor>();
	}
	
	public void inserir (Vendedor vendedor) {
		list.add(vendedor);
	}
	
	public void remover(Vendedor vendedor){
		list.remove(vendedor);
	}
	
	public int pesquisar(Vendedor vendedor) {
		return list.indexOf(vendedor);
	}
	
	public Vendedor getElem(Vendedor vendedor, int num) {
		if(num >= list.size()) {
			return null;  
		}
		return list.get(num);
	}
	
	public Vendedor maiorTempoServico() {
		
	}
}
