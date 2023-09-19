package com.mycompany.universidade;

public class Universidade {
    public static void main(String[] args) {
        
        curso engenharia= new curso();
        curso psicologia = new curso();
        curso medicina = new curso();
        curso comunicacao= new curso();
        curso cienciacomp= new curso();
        
        engenharia.nome="Engenharia Mecânica";
        psicologia.nome="Psicologia";
        medicina.nome="Medicina";
        comunicacao.nome="Comunicação Social - Jornalismo";
        cienciacomp.nome="Ciência da Computação";
        
        engenharia.turno="Integral";
        psicologia.turno="Noturno";
        medicina.turno="Integral";
        comunicacao.turno="Matutino";
        cienciacomp.turno="Vespertino";
        
        engenharia.area="Exatas";
        psicologia.area="Humanas";
        medicina.area="Saúde";
        comunicacao.area="Humanas";
        cienciacomp.area="Exatas";
        
        engenharia.vagas=60;
        psicologia.vagas=40;
        medicina.vagas=80;
        comunicacao.vagas=30;
        cienciacomp.vagas=50;
        
        engenharia.periodos=10;
        psicologia.periodos=8;
        medicina.periodos=12;
        comunicacao.periodos=6;
        cienciacomp.periodos=8;
        
        engenharia.liberarpos();
        medicina.liberarpos();
        
        engenharia.informarDados();
        psicologia.informarDados();
        medicina.informarDados();
        comunicacao.informarDados();
        cienciacomp.informarDados();
        
        
        
        
        
    }
}
