package figuras.geometricas;

import java.util.Scanner;

public class Cuadrado {
    
    int base;
    int altura;
    String nombre;
    
    public Cuadrado(String nombreCuadrado){
        nombre = nombreCuadrado;  
    }
    
    public void pedirBase(){ 
        
        System.out.print("Ingrese Valor de la Base del Cuadrado "+nombre+": ");
        Scanner in = new Scanner(System.in);
        base=in.nextInt();  
        
        System.out.print("Ingrese Valor de la Altura del Cuadrado "+nombre+": ");
        altura=in.nextInt();  
        
    }
    
    public void calcularArea(){
        System.out.println("El Area del Cuadrado "+nombre+ " es: "+ (base*altura));
    }
    
    public void calcularPerimetro(){  
        System.out.println("El Perimetro del Cuadrado "+nombre+" es: "+(2*base+2*altura));
        System.out.println("");
        
    }
}