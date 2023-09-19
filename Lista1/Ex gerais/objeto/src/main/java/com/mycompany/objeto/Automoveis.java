package com.mycompany.objeto;

public class Automoveis {
    //Atributos
     String modelo,cor,tipo,categoria,capacidade,quantidade,portas;
     int ano;
    boolean estadoMotor=false;
    public void ligaMotor() //Método
    {
        estadoMotor=true;
    }
    public void desligaMotor() //Método
    {
        estadoMotor=false;
    }

    public void informaDados() //Método
    {
        String motorString;
        if (estadoMotor)
        {
            motorString="Ligado";
        }
        else
        {
            motorString="Desligado";
        }
        System.out.println("Automovel: "+modelo+""+ano+""+cor+tipo+motorString+categoria+capacidade+quantidade+portas);
        estadoMotor=false;
    }     
}