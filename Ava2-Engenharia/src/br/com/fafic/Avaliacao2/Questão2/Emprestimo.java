package br.com.fafic.Avaliacao2.Questão2;

public class Emprestimo {
    public void recebendoLigacaoDoCliente(CallCenter CC){
        String s = String.format("O emprestimo está atendendo a ligação  do cliente (%s).",CC.getLigacaoDoCliente());
        System.out.println(s);
    }
    public void ligacaoEncerrada(CallCenter CC){
        String s = String.format("Servico de emprestimo finalizou  a ligação, o cliente (%s) foi atendido.",CC.getLigacaoDoCliente());
        System.out.println(s);
    }
}
