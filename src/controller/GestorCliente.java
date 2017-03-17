package controller;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;

public class GestorCliente {
		ArrayList<Cliente> ARCliente;
		
		public GestorCliente() {
			this.ARCliente=new ArrayList<Cliente>();
		}
		
		public void addClient(String nome, String morada, String email, String telefone) {
			Cliente c=new Cliente(nome, morada, email, telefone);
			int novoID=ARCliente.size();
			
			c.setId(novoID);
			
			ARCliente.add(c);
		}
		
		public Cliente getCliente(int id) {
			/*FOREACH: para cada cliente, sob a variavel c, dentro da colecao arCliente, faz */
			for (Cliente c: ARCliente) {
				if (c.getId()==id)
					return c;
			}
			
			return null;
		}
		
		public double getGastoVacinas(Cliente c) {
			/* Alternativa 
			 * for (int i=0; i<ARCliente.size(); i++) {
			 * Cliente c= ARCliente.get(i);
			 * ... */
			
				double totalVacAnimais=0;
				
				for (Animal a : c.getAnimais()) {
					double totalVacinaAnimal=0;
					
					for (Vacina v : a.getFicha().getVacinas()) {
						totalVacinaAnimal+=v.getPreco();
						
					}
					totalVacAnimais+=totalVacinaAnimal;
				
			}
				return totalClientes;
		}
		
}
