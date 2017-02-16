/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.geometricas;

import java.util.Scanner;

/**
 *
 * @author DarkVizyan
 */
public class FigurasGeometricas {
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int  tipoFigura;
        System.out.println("Seleccione Figura Geometrica: ");
        System.out.println("1-Circulos  2-Triangulo  3-Cuadrado/Rectangulo");
        Scanner in = new Scanner(System.in);
        tipoFigura=in.nextInt();
        
        switch (tipoFigura){
            
            case 1:{Circulo A = new Circulo("A");
                    A.pedirRadio();
                    A.calcularArea();
                    A.calcularCircunferencia();

                    Circulo B = new Circulo("B");
                    B.pedirRadio();
                    B.calcularArea();
                    B.calcularCircunferencia();

                    Circulo C = new Circulo("C");
                    C.pedirRadio();
                    C.calcularArea();
                    C.calcularCircunferencia();

                    Circulo D = new Circulo("D");
                    D.pedirRadio();
                    D.calcularArea();
                    D.calcularCircunferencia();
            
            }break;
            
            case 2:{Triangulo E = new Triangulo("A");
                    E.pedirBase();
                    E.calcularArea();
                    E.calcularPerimetro();

                    Triangulo F = new Triangulo("B");
                    F.pedirBase();
                    F.calcularArea();
                    F.calcularPerimetro();

                    Triangulo G = new Triangulo("C");
                    G.pedirBase();
                    G.calcularArea();
                    G.calcularPerimetro();

                    Triangulo H = new Triangulo("D");
                    H.pedirBase();
                    H.calcularArea();
                    H.calcularPerimetro();
            
            }break;
            
            case 3: {Cuadrado I = new Cuadrado("A");
                    I.pedirBase();
                    I.calcularArea();
                    I.calcularPerimetro();

                    Cuadrado J = new Cuadrado("B");
                    J.pedirBase();
                    J.calcularArea();
                    J.calcularPerimetro();

                    Cuadrado K = new Cuadrado("C");
                    K.pedirBase();
                    K.calcularArea();
                    K.calcularPerimetro();

                    Cuadrado L = new Cuadrado("D");
                    L.pedirBase();
                    L.calcularArea();
                    L.calcularPerimetro();
            
            }break;
            
            default: break;
                    
            
        }  
       
    }
    
}
