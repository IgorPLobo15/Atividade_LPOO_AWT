package com.mycompany.portaavioes;
public class aviao {
    String nome,tipo,tamanho,autonomia,cappeso;
    boolean estadoaviao=false;
    
    public void decolar(){
        estadoaviao=true;
    }
    
    public void naodecolar(){
        estadoaviao=false;
    }
    
    public void informarDados(){
        String motorString;
        if (estadoaviao){
            motorString="Decolando";
        }
        else{
            motorString="Parado";
        }
        System.out.println(" Avião: "+nome+"\n Tipo: "+tipo+"\n Tamanho: "+tamanho+"\n Autonomia: "+autonomia+"\n Capacidade de Peso: "+cappeso+ "\n Está " +motorString+"\n");
        estadoaviao=false;
    }
}
