package com.mycompany.canil;

public class Cachorros {
    String nome,cor,tamanho,raca;
     
     boolean latir=false;
     
     public void Latindo() //Método
    {
        latir=true;
    }
    public void naoLatindo() //Método
    {
        latir=false;
    }
    
    
     public void informaDados() //Método
    {
        String lateString;
        if (latir)
        {
            lateString=" Latindo ";
        }
        else
        {
            lateString=" não Latindo";
        }
        System.out.println("Cachorro: "+nome+""+raca+""+cor+tamanho+lateString);
        latir=false;
    }   
    
}
