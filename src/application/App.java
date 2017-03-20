package application;

import controller.GestorCliente;
import misc.Mdata;

public class App {

	public static void main(String[] args) {
		GestorCliente gc=new GestorCliente();
		gc.addClient(Mdata.cl);
	}

}