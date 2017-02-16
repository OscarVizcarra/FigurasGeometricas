
package figuras.geometricas;

import java.util.Scanner;

public class Circulo {
    
    int radio;
    String nombre;
    static final double PI=3.1416;
    
    public Circulo(String nombreCirculo){
        nombre = nombreCirculo;  
    }
    
    public void pedirRadio(){ 
        
        System.out.print("Ingrese Valor del Radio del Circulo "+nombre+": ");
        Scanner in = new Scanner(System.in);
        radio=in.nextInt();    
    }
    
    public void calcularArea(){
        System.out.println("El Area del Circulo "+nombre+ " es: "+ (PI*radio*radio));
    }
    
    public void calcularCircunferencia(){
        System.out.println("La Circunferencia del Circulo "+nombre+" es: "+(2*PI*radio) );
        System.out.println("");
        
    }
}
