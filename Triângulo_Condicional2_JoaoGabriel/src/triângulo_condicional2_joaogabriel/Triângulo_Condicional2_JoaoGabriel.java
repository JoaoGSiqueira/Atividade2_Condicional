/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triângulo_condicional2_joaogabriel;

import java.util.Scanner;

/**
 *
 * @author João Gabriel
 */
public class Triângulo_Condicional2_JoaoGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int A,B,C;
        System.out.print("Digite o valor do lado A: ");
        A = entrada.nextInt();
        System.out.print("Digite o valor do lado B: ");
        B = entrada.nextInt();
        System.out.print("Digite o valor do lado C: ");
        C = entrada.nextInt();
        
        if(A+B>C && A+C>B && B+C>A);
        System.out.println("Os valores formam um Triângulo");
        
        
        if(A==B && A==C && B==C){
        System.out.println("Sendo um Triângulo Equilátero");
        } 
        else if(A!=B && A!=C && B!=C){
         System.out.println("Sendo um Triângulo Escaleno");
         }   
        else if (A==B && A!=C || A==C && A!=B|| B==C && B!=A){
        System.out.println("Sendo um Triângulo Isósceles");
         }
        else
         System.out.println("Os valores inseridos não formam um Triângulo");
    }
        
        
               
          
        
        
        
    }
    

