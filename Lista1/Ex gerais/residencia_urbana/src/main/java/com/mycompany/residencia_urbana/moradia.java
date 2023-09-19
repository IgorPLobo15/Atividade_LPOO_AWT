package com.mycompany.residencia_urbana;

public class moradia {
    String tipo,local;
    int banheiros,quartos;
    double metros;
    
    public void informarDados(){
        System.out.println("Tipo: "+tipo+"\n Quartos: "+quartos+" quartos"+"\n Metragem: "+metros+" metros quadrados"+"\n Localidade: "+local+"\n");
    }
}
