package Exericici;

import java.util.Scanner;

public class Exercicio9 {

	private int total_de_eleitores;
	private int validos;
	private int brancos;
	private int nulos;

	public int getTotal_de_eleitores() {
		return total_de_eleitores;
	}

	public void setTotal_de_eleitores(int total_de_eleitores) {
		this.total_de_eleitores = total_de_eleitores;
	}

	public int getValidos() {
		return validos;
	}

	public void setValidos(int validos) {
		this.validos = validos;
	}

	public int getBrancos() {
		return brancos;
	}

	public void setBrancos(int brancos) {
		this.brancos = brancos;
	}

	public int getNulos() {
		return nulos;
	}

	public void setNulos(int nulos) {
		this.nulos = nulos;
	}
	

	Scanner s = new Scanner(System.in); 
	
	
	public void receber_entrada() {
		
		System.out.println("Informe numeros de votos validos");

		validos = s.nextInt();

		System.out.println("Informe numeros de votos nulos");

		nulos = s.nextInt();

		System.out.println("Informe numeros de votos brancos");

		brancos = s.nextInt();
		
	}


	public int totalvalidos() {

		int calculo = ((validos * total_de_eleitores) / 100 ) ;

		System.out.println( "Validos:" +calculo + "%");

		return calculo;
	}

	public int TotalNulos() {

		int calculo =( (nulos * total_de_eleitores) / 100) ;

		System.out.println( "Nulos" +calculo + " %");

		return calculo;

	}

	public int TotalBrancos() {

		int calculo = ((brancos * total_de_eleitores) / 100)  ;

		System.out.println( "Brancos:" + calculo   + "%");

		return calculo;

	}

	public int Totaleleitor() {
		

	
		
		

		total_de_eleitores = (  brancos + validos + nulos);

		System.out.println("total_de_eleitores:" + total_de_eleitores );

		return total_de_eleitores;

	}

}
