package com.mycompany.canil;

public class Canil {
    public static void main(String[] args) {
       Cachorros caramelo = new Cachorros();
        Cachorros pitbull = new Cachorros();
        Cachorros pastorAlemao = new Cachorros();
        Cachorros pinchel = new Cachorros();
        Cachorros americanBooque = new Cachorros();
        caramelo.nome = " Babalu ";
        caramelo.cor = "  Caramelo ";
        caramelo.tamanho = " Médio " ;
        caramelo.raca = " Vira-Lata ";
        
        caramelo.Latindo();
        
        caramelo.informaDados();
        
        pitbull.nome = " Blake ";
        pitbull.cor = " Preto ";
        pitbull.tamanho = " Grande ";
        pitbull.raca = " Raca ";
        
        pitbull.Latindo();
        
        pitbull.informaDados();
    
        pastorAlemao.nome = " Billy ";
        pastorAlemao.cor = " Vermelho ";
        pastorAlemao.tamanho = " Grande ";
        pastorAlemao.raca = " PastorAlemao ";
        
        pastorAlemao.naoLatindo();
        
        pastorAlemao.informaDados();
        
        pinchel.nome = " Pipoca ";
        pinchel.cor = "  Branco ";
        pinchel.tamanho = " Pequeno ";
        pinchel.raca = " Pincher ";
        
        pinchel.Latindo();
        
        pinchel.informaDados();
        
       americanBooque.nome = " Jasper ";
       americanBooque.cor = " Cinza ";
       americanBooque.tamanho = "Pequeno ";
       americanBooque.raca =   " AmericanBooque "; 
        
       americanBooque.naoLatindo();
       
       americanBooque.informaDados();
    }
    
} 
    

