package com.mycompany.ex_threads;

public class Exemplo_Threads{
    public static void main ( String arg[]){
        Tarefa_1 T1 = new Tarefa_1("Tarefa_1");
        T1.setPriority(10);
        Tarefa_2 T2 = new Tarefa_2("Tarefa_2");
        T2.setPriority(1);
        Tarefa_3 T3 = new Tarefa_3("Tarefa_3");
        T3.setPriority(4);
        Tarefa_4 T4 = new Tarefa_4("Tarefa_3");
        T4.setPriority(6);
        Tarefa_5 T5 = new Tarefa_5("Tarefa_3");
        T5.setPriority(8);
        T1.start();       
        T2.start();
        T3.start();
        T4.start();
        T5.start();
    }
}
