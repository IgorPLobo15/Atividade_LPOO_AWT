package com.mycompany.objeto;

public class AgenciaAutomoveis {
    public AgenciaAutomoveis() {
    }
    public static void main(String[]args){
        //Criando os obj.(instancias) da classe automovel
        Automoveis fusca=new Automoveis();//New cria o objeto fusca
        Automoveis gol=new Automoveis();//New cria o objeto gol
        Automoveis monza=new Automoveis();//New cria o objeto monza
        Automoveis montana=new Automoveis();//New cria o objeto montana
        
        fusca.modelo=" Fusca ";
        fusca.cor=" Preto ";
        fusca.ano=1997;
        fusca.tipo=" Luxo ";
        fusca.categoria= " Passeio ";
        fusca.capacidade=" - 0,5 ton ";
        fusca.quantidade= " 5 Lugares ";
        fusca.portas=" 2 Portas ";
        
        
        gol.modelo=" Gol ";
        gol.cor=" Vermelho ";
        gol.ano=2001;
        gol.tipo=" Simples ";
        gol.categoria=" Passeio ";
        gol.capacidade= " -0,5 ton";
        gol.quantidade=" 5 Lugares ";
        gol.portas=" 4 Portas ";
        
        monza.modelo=" Monza ";
        monza.cor=" Azul ";
        monza.ano=1994;
        monza.tipo=" Simples ";
        monza.categoria=" Passeio ";
        monza.capacidade=" -0,5 ";
        monza.quantidade=" 5 Lugares ";
        monza.portas=" 4 Portas ";
        
        montana.modelo=" Montana ";
        montana.cor=" Prata ";
        montana.ano=2004;
        montana.tipo=" Luxo ";
        montana.categoria=" Utilitario ";
        montana.capacidade=" +0,5 ton";
        montana.quantidade=" 2 Lugares ";
        montana.portas=" 2 Portas ";
        
        //liigando motores\
        fusca.desligaMotor();
        gol.ligaMotor();
        monza.desligaMotor();
        montana.ligaMotor();
        
        //mostrando informações
        fusca.informaDados();
        gol.informaDados();
        monza.informaDados();
        montana.informaDados();
       
    }
 
}
