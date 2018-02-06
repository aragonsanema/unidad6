package Ejercicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class cine {
	private Scanner teclado;
	private ArrayList<Persona>cola;
	public cine(){
		teclado=new Scanner(System.in);
		cola=new ArrayList<Persona>();
	}
	public void crearCola(){
		int numPersonas=(int)Math.random()*50;
		System.out.println("Numero de personas:"+numPersonas);
		for(int i=0;i<numPersonas;i++){
			System.out.print("Nombre:");
			String nom=teclado.nextLine();
			int edad=(int)Math.random()*55+5;
			Persona p=new Persona(nom,edad);
			cola.add(p);
			
		}
	}
	public void imprimir(){
		Iterator<Persona>micola=cola.iterator();
		while(micola.hasNext()){
			Persona p=micola.next();
			p.imprimir();
		}
	}
	public float TotalRecaudado(){
		float resultado=0;
		
		return resultado;
	}
	public static void main(String[] args) {
		

	}

}
