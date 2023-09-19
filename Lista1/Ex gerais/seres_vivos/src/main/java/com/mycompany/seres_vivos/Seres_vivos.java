package com.mycompany.seres_vivos;

public class Seres_vivos {

    public static void main(String[] args) {
        
        pessoa joao =new pessoa();
        pessoa joana = new pessoa();
        pessoa andre = new pessoa();
        pessoa ana = new pessoa();
        pessoa patricia = new pessoa();
        
        joao.nome="João";
        joana.nome="Joana";
        andre.nome="André";
        ana.nome="Ana";
        patricia.nome="Patrícia";
        
        joao.cromossomo ="XY,";
        joana.cromossomo ="XX";
        andre.cromossomo ="XY,";
        ana.cromossomo ="XX";
        patricia.cromossomo ="XX";
        
        joao.bio="Órgãos genitais masculinos (pênis e testículos) e níveis mais elevados de testosterona.";
        joana.bio="Órgãos genitais femininos (vulva, vagina e ovários) e níveis mais elevados de estrogênio e progesterona.";
        andre.bio="Órgãos genitais masculinos (pênis e testículos) e níveis mais elevados de testosterona.";
        ana.bio="Órgãos genitais femininos (vulva, vagina e ovários) e níveis mais elevados de estrogênio e progesterona.";
        patricia.bio="Órgãos genitais femininos (vulva, vagina e ovários) e níveis mais elevados de estrogênio e progesterona.";
        
        joao.fisico="Tende a ter uma estatura mais alta e maior massa muscular.";
        joana.fisico="Tende a ter uma estatura menor e uma proporção menor de massa muscular em relação ao corpo.";
        andre.fisico="Tende a ter uma estatura mais alta e maior massa muscular.";
        ana.fisico="Tende a ter uma estatura menor e uma proporção menor de massa muscular em relação ao corpo.";
        patricia.fisico="Tende a ter uma estatura menor e uma proporção menor de massa muscular em relação ao corpo.";
        
        joao.cognitivo="Pode ter habilidades espaciais mais desenvolvidas.";
        joana.cognitivo="Pode ter habilidades verbais mais desenvolvidas.";
        andre.cognitivo="Pode ter habilidades espaciais mais desenvolvidas.";
        ana.cognitivo="Pode ter habilidades verbais mais desenvolvidas.";
        patricia.cognitivo="Pode ter habilidades verbais mais desenvolvidas.";
        
        joao.mudarSexoMasc();
        andre.mudarSexoMasc();
        
        joao.informarDados();
        joana.informarDados();
        andre.informarDados();
        ana.informarDados();
        patricia.informarDados();
        
        
        
        
    }
}
