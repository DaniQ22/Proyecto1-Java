/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Vector {
    int tamaño;
    int vector[];  
    
    public Vector(){
        tamaño = 0;
        vector = null;    
    }
    
    public void crearvector(){
        vector = new int[getTamaño()];
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int posicion, int numeros) {
        this.vector[posicion]= numeros;
 
    }
    
    public String mostraPares(){
        String lista = "";
        for (int i = 0; i < getTamaño(); i++) {
            if(i%2==0){
                lista += "En la posicion "+i+"Tenemos: "+vector[i];      
            } 
        }
        return lista;
        
    }
    
    public int ContarImpares(){
        int contador = 0;
        for (int i = 0; i < getTamaño(); i++) {
            if(vector[i]%2==1){
                contador ++;
            }
        }
        
        return contador;
    }
    
    public String VecesRepetio(){
        String lis = "";
        int cont = 0;
        for (int i = 0; i < getTamaño(); i++) {
            for (int j = i+1; j < getTamaño(); j++) {
                if (vector[i]==vector[j]) {
                    cont ++;
                    lis = "El numero repetido es: "+vector[i]+ " Y su posicion es: "+i+ " Y se repite: "+cont;
                    
                }
                
            }
   
            }  
         return lis;
       
        }
    
     
    }
       
    
    


