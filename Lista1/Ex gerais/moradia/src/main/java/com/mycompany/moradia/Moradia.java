package com.mycompany.moradia;

public class Moradia {
    public static void main(String[] args) {
        
        casa casauni = new casa();
        casa apartamento = new casa();
        casa chale = new casa();
        casa condominio = new casa();
        casa casagem = new casa();
        casa kitnet = new casa();
        
        casauni.tipo ="Casa unifamiliar";
        apartamento.tipo ="Apartamento";
        chale.tipo ="Chalé";
        condominio.tipo ="Condomínio";
        casagem.tipo ="Casa geminada";
        kitnet.tipo ="Kitnet";
        
        casauni.quartos=3;
        apartamento.quartos=2;
        chale.quartos=4;
        condominio.quartos=3;
        casagem.quartos=4;
        kitnet.quartos=1;
        
        casauni.banheiros=2;
        apartamento.banheiros=2;
        chale.banheiros=3;
        condominio.banheiros=3;
        casagem.banheiros=2;
        kitnet.banheiros=1;
        
        casauni.metros=200;
        apartamento.metros=80;
        chale.metros=133;
        condominio.metros=167;
        casagem.metros=140;
        kitnet.metros=30;
        
        casauni.local ="Encontrada em bairros residenciais urbanos ou subúrbios";
        apartamento.local ="Geralmente localizado em edifícios de vários andares em áreas urbanas";
        chale.local ="Comum em áreas rurais, montanhas ou regiões campestres";
        condominio.local ="Encontrado tanto em áreas urbanas quanto suburbanas, muitas vezes com comodidades compartilhadas";
        casagem.local ="Comum em bairros urbanos ou subúrbios";
        kitnet.local ="Principalmente em áreas urbanas, próximas a centros comerciais ou campi universitários";
        
        casauni.informarDados();
        apartamento.informarDados();
        chale.informarDados();
        condominio.informarDados();
        casagem.informarDados();
        kitnet.informarDados();
        
    }
}
