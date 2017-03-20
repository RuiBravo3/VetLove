package misc;

import java.util.ArrayList;

import model.*;

public class Mdata {
	public static Vacina vac= new Vacina("200317", "rabiolis", 13.4);
	public static Consulta con = new Consulta("200317", "Validar vacinas");
	public static ArrayList<Vacina> arvacs = new ArrayList<Vacina>();
	public static ArrayList<Consulta> arCons = new ArrayList<Consulta>();
	
	public static Ficha fl	= new Ficha(arvacs, arCons);
	
	public static Animal an = new Animal("Cao", "Pastor Alemao", "200117", fl);
	public static Cliente cl = new Cliente("Abel", "Seixal", "abel@gmal.cxom", "212107635");
	
	public static void fillData() {
		arvacs.add(vac);
		arCons.add(con);
		cl.getAnimais().add(an);
	}
}

