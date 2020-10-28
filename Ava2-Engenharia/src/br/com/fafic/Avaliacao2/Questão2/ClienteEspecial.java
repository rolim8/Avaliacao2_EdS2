package br.com.fafic.Avaliacao2.Questão2;

public class ClienteEspecial {
    public void recebendoLigacaoDoCliente(CallCenter CC){
        String s = String.format("Todos os serviços dos  clientes especial está sendo atendendo as ligações dos cliente (%s).",CC.getLigacaoDoCliente());
        System.out.println(s);
    }
    public void ligacaoEncerrada(CallCenter CC){
        String s = String.format("Serviço de cliente especial finalizou sua ligações, o cliente (%s) foi atendido.",CC.getLigacaoDoCliente());
        System.out.println(s);
    }
}
