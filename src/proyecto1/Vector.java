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
    int numero;
    
    public Vector(){
        tamaño = 0;
        vector = null;
        numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
    
    public String MostrarVector(){
        String list = "";
        for (int i = 0; i < getTamaño(); i++) {
            list += "Posicion "+ i + " Valor "+ vector[i] + "\n";
            
        }
        return list;
        
    }
    public String mostraPares(){
        String lista = "";
        for (int i = 0; i < getTamaño(); i++) {
            if(i%2==0){
                lista += "En la posicion "+i+" Tenemos: "+vector[i] + " \n";      
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
        int cont;
        for (int i = 0; i < getTamaño(); i++) {
            cont = 1;
            for (int j = 0; j < getTamaño(); j++) {
                if (j!=i) {
                    if (vector[i]==vector[j]) {
                        cont ++;
                        lis += "El numero" + vector[i] + " Se repite " + cont;
                        
                    }
                    
                }
                
            }
        }
        return lis;
        }
    
    public int CantiVeMayor(){
        int cont = 0;
        for (int i = 0; i < getTamaño(); i++) {
            if (vector[i]>getNumero()) {
                cont ++;               
            }
            
        }
        return cont;
    }
    
     
    }
       
    
    


