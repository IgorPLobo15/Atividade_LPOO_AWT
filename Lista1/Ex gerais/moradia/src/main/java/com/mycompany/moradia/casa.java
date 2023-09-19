package com.mycompany.moradia;

public class casa {
    String tipo,local;
    int banheiros,quartos;
    double metros;
    
    public void informarDados(){
        System.out.println("Tipo: "+tipo+"\n Quartos: "+quartos+" quartos"+"\n Metragem: "+metros+" metros quadrados"+"\n Localidade: "+local+"\n");
    }
}
