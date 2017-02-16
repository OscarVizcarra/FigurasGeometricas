package figuras.geometricas;

import java.util.Scanner;

public class Triangulo {
    
    int base;
    int altura;
    int ladoA;
    int ladoB;
    int ladoC;
    String nombre;
    
    public Triangulo(String nombreTriangulo){
        nombre = nombreTriangulo;  
    }
    
    public void pedirBase(){ 
        
        System.out.print("Ingrese Valor de la Base del Triangulo "+nombre+": ");
        Scanner in = new Scanner(System.in);
        base=in.nextInt();  
        
        System.out.print("Ingrese Valor de la Altura del Triangulo "+nombre+": ");
        altura=in.nextInt();  
        
    }
    
    public void calcularArea(){
        System.out.println("El Area del Triangulo "+nombre+ " es: "+ ((base*altura)/2));
    }
    
    public void calcularPerimetro(){
        System.out.println("Ingrese lado 'a' del Triangulo "+nombre+": ");
        Scanner in = new Scanner(System.in);
        ladoA=in.nextInt();     
        System.out.println("Ingrese lado 'b' del Triangulo "+nombre+": ");
        ladoB=in.nextInt();     
        System.out.println("Ingrese lado 'c' del Triangulo "+nombre+": ");
        ladoC=in.nextInt();     
        System.out.println("El Perimetro del Triangulo "+nombre+" es: "+(ladoA+ladoB+ladoC));
        System.out.println("");
        
    }
}
