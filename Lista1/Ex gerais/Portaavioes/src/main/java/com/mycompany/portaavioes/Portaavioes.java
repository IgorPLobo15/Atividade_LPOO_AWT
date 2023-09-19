package com.mycompany.portaavioes;

public class Portaavioes {
    public static void main(String[] args) {
        aviao hercules=new aviao();
        aviao strato=new aviao();
        aviao apache=new aviao();
        aviao falcon=new aviao();
        aviao lady=new aviao();
        
        hercules.nome="C-130 Hércules";
        strato.nome="KC-135 StratoTanker";
        apache.nome="AH-64 Apache";
        falcon.nome=" F-16 Fighting Falcon";
        lady.nome="U-2 Dragon Lady";
        
        hercules.tipo="Carga Sólida";
        strato.tipo="Abastecimento de Combustível";
        apache.tipo="Helicóptero";
        falcon.tipo="Caça";
        lady.tipo="Reconhecimento";
        
        
        hercules.tamanho="Envergadura de aproximadamente 40 metros";
        strato.tamanho="Envergadura de aproximadamente 40 metros";
        apache.tamanho="Comprimento de cerca de 17 metros (incluindo rotores)";
        falcon.tamanho="Comprimento de cerca de 15 metros";
        lady.tamanho="Envergadura de aproximadamente 32 metros";
        
        hercules.autonomia="Cerca de 7.200 km";
        strato.autonomia="Cerca de 9.200 km";
        apache.autonomia="Cerca de 500 km";
        falcon.autonomia="Varia de acordo com a missão, cerca de 3.200 km (com tanques externos)";
        lady.autonomia=" Cerca de 11.000 km";
        
        hercules.cappeso="Até 70.307 kg";
        strato.cappeso="Até 146.000 kg (dependendo da variante)";
        apache.cappeso="Até 10.433 kg";
        falcon.cappeso="Até 19.187 kg";
        lady.cappeso="Até 35.830 kg";
        
        hercules.decolar();
        strato.naodecolar();
        apache.decolar();
        falcon.naodecolar();
        lady.naodecolar();
        
        
        hercules.informarDados();
        strato.informarDados();
        apache.informarDados();
        falcon.informarDados();
        lady.informarDados();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
