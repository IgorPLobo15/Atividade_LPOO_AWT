package com.mycompany.residencia_urbana;

public class Residencia_urbana {
    public static void main(String[] args) {
        moradia apart1 = new moradia();
        moradia apart2 = new moradia();
        moradia casa3 = new moradia();
        moradia casa4 = new moradia();
        moradia casa5 = new moradia();
        
        apart1.tipo ="Apartamento 1";
        apart2.tipo ="Apartamento 2";
        casa3.tipo ="Casa 1";
        casa4.tipo ="Casa 2";
        casa5.tipo ="Casa 3";
        
        apart1.quartos=3;
        apart2.quartos=2;
        casa3.quartos=4;
        casa4.quartos=3;
        casa5.quartos=4;
        
        apart1.banheiros=2;
        apart2.banheiros=3;
        casa3.banheiros=2;
        casa4.banheiros=3;
        casa5.banheiros=4;
        
        apart1.metros=120;
        apart2.metros=75;
        casa3.metros=133;
        casa4.metros=167;
        casa5.metros=140;
        
        apart1.local ="Járdim Goías";
        apart2.local ="Setor Bueno";
        casa3.local ="Setor Jaó";
        casa4.local ="Novo Mundo";
        casa5.local ="Alta da Gloria";
        
        apart1.informarDados();
        apart2.informarDados();
        casa3.informarDados();
        casa4.informarDados();
        casa5.informarDados();
    }
}
