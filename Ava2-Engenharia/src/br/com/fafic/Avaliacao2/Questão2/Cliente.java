package br.com.fafic.Avaliacao2.Questão2;

public class Cliente {
    public void iniciar(CallCenter CC){
        Facade faca = new Facade();
        faca.iniciar(CC);
    }
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.iniciar(new CallCenter("Mateus Santos, Orlando Leite"));
    }
}
