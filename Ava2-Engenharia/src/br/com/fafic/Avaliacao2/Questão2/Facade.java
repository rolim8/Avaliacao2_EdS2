package br.com.fafic.Avaliacao2.Questão2;

public class Facade {
    private Previdencia Previdencia;
    private Emprestimo Emprestimo;
    private ClienteEspecial ClienteEspecial;

    public Facade() {
        this.Previdencia = new Previdencia();
        this.Emprestimo = new Emprestimo();
        this.ClienteEspecial = new ClienteEspecial();
    }

    public void iniciar(CallCenter CC){
        this.Emprestimo.recebendoLigacaoDoCliente(CC);
        this.Emprestimo.ligacaoEncerrada(CC);
        this.Previdencia.recebendoLigacaoDoCliente(CC);
        this.Previdencia.ligacaoEncerrada(CC);
        this.ClienteEspecial.recebendoLigacaoDoCliente(CC);
        this.ClienteEspecial.ligacaoEncerrada(CC);
    }
}