
package com.mycompany.ex_threads;

class Tarefa_1 extends Thread{
    public Tarefa_1(String name){
        super(name);
    }
    public void run(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Fluxo de programa que está rodando \"1\"");
        System.out.println(" ");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
    {
    }
    String A = getName();
    System.out.println("Nome da Thread = "+A);
    int b = getPriority(); 
    System.out.println("Uma Thread de prioridade "+b);

    for(int i=0;i<=10;i++){
        System.out.print("-"+i);

    }
    System.out.println(" ");
    System.out.println(" ");
    }   
}