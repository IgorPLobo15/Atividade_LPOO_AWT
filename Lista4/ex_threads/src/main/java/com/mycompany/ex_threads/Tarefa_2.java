package com.mycompany.ex_threads;

class Tarefa_2 extends Thread{
    public Tarefa_2(String name){
        super(name);
    }
    public void run(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Fluxo de programa \" 2\"");
        System.out.println(" ");
        String A = getName();
        System.out.println("Nome da Thread = "+A);
        int b = getPriority();
        System.out.println("Uma Thread de prioridade "+b);

        for(int i=10;i>=0;i--){
            System.out.print("-"+i);
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}

