package com.mycompany.floricultura;
public class Floricultura {

    public static void main(String[] args) {
        
        flores rosa = new flores();
        flores orquidea = new flores();
        flores cravo = new flores();
        flores girassol = new flores();
        flores tulipa = new flores();
        flores margarida = new flores();
       
        //nomes
        rosa.nome ="Rosa (Rosa x hybrida)";
        orquidea.nome="Orquídea Phalaenopsis (Phalaenopsis alba)";
        cravo.nome="Cravo (Dianthus caryophyllus)";
        girassol.nome="Girassol (Helianthus annuus)";
        tulipa.nome="Tulipa (Tulipa sp.)";
        margarida.nome="Margarida (Leucanthemum vulgare)";
       
        //necessidades
        rosa.necessidade="Sol pleno ou meia-sombra";
        orquidea.necessidade="Sombra";
        cravo.necessidade="Sol Pleno";
        girassol.necessidade="Sol pleno";
        tulipa.necessidade="Sol pleno e meia-Sombra";
        margarida.necessidade="Sol pleno";
       
        //Regas
        rosa.regas="Regulares, àgua em horas ,mais quentes";
        orquidea.regas="2 vezes na semana";
        cravo.regas="Frequentes e curtas";
        girassol.regas="Regas regulares";
        tulipa.regas="Regulares, 1 a 3 vezes por semana";
        margarida.regas="Diárias, Inicio da manhã ou final da tarde";
        
        rosa.florada="Primavera e verão";
        orquidea.florada="Todo o ano, com maior intensidade na primavera e verão";
        cravo.florada="Primavera e verão";
        girassol.florada="Primavera e verão";
        tulipa.florada="Primavera e verão";
        margarida.florada="Verão e outono";
        
        rosa.informarDados();
        orquidea.informarDados();
        cravo.informarDados();
        girassol.informarDados();
        tulipa.informarDados();
        margarida.informarDados();
               
    }
}
