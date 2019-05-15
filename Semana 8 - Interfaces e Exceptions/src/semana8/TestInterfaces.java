package semana8;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TestInterfaces {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    try{	
    System.out.println("Retângulo");

    System.out.println("Altura:");
	float altura = input.nextFloat();
	System.out.println("Largura:");
	float largura = input.nextFloat();
	Retangulo retangulo = new Retangulo(altura,largura);
	retangulo.getPerimetro();
	retangulo.print();
	
	System.out.println("_________________________________________________________\n");
	System.out.println("Triângulo");
	System.out.println("Lado 1:");
	float lado1 = input.nextFloat();
	
	System.out.println("Lado 2:");
	float lado2 = input.nextFloat();
	
	System.out.println("Lado 3:");
	float lado3 = input.nextFloat();
	
	Triangulo tri = new Triangulo(lado1,lado2,lado3);
	tri.getArea();
	tri.getPerimetro();
	tri.print();
	
	System.out.println("_________________________________________________________\n");
	System.out.println("Círculo");
	System.out.println("Raio:");
	float raio = input.nextFloat();
	Circulo cir = new Circulo(raio);
	cir.getArea();
	cir.getPerimetro();
	cir.print();
	System.out.println("_________________________________________________________\n");
	

}
  catch(InputMismatchException e1){
    System.out.println("Apenas números são permitidos");	
    }
  catch(Exception e){
    	System.out.println("Houve um erro inesperado");
    }
  finally{
	  System.out.println("Fim");
	  input.close();
  }

}
}
