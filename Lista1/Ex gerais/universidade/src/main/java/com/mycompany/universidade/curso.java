package com.mycompany.universidade;

public class curso {
    String turno,nome,area;
    int vagas,periodos;
    boolean liberar = false;
    
    
    public void liberarpos(){
        liberar=true;
    }
    
    public void informarDados(){
        String posString;
        if(liberar){
            posString= "Liberada";
        }
        else{
            posString= "Não Liberada";
        }
        System.out.println("Curso: "+nome+"\n Turno: "+turno+"\n Área: "+area+"\n Vagas:"+vagas+"\n Períodos: "+periodos+"\n Estado da Pôs-Graduação: "+posString+"\n");
        liberar=false;
    }
    
    
    
    
    
}
