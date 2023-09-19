package com.mycompany.seres_vivos;

public class pessoa {
    String nome,cromossomo,cognitivo,bio,fisico;
    boolean sexo = false;
    
    public void mudarSexoMasc(){
        sexo=true;
    }
    
    public void mudarSexoFem(){
        sexo=false;
    }
    
    public void informarDados(){
        String estadoSexo;
        if(sexo){
            estadoSexo="Masculino";
        }
        else{
            estadoSexo="Feminino";
        }
        System.out.println("Nome: "+nome+"\n Sexo: "+estadoSexo+
                "\n Cromossomo: "+cromossomo+"\n Biologia: "+bio+
                "\n Físico: "+fisico+"\n Cognitivo: "+cognitivo);
        sexo=false;
        
        
    }
    
    
}
