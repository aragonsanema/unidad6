package Ejercicios;
import java.util.Scanner;
public class Persona {
	private String nombre;
	private int edad;
	public Persona(String n,int e){
		nombre=n;
		edad=e;
	}
	public Persona(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Nombre:");
		nombre=teclado.nextLine();
		System.out.print("Edad:");
		edad=teclado.nextInt();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void imprimir(){
		System.out.println(nombre+" "+edad);
	}
}
