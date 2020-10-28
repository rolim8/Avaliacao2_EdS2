package br.com.fafic.Avaliacao2.Questão2;

public class CallCenter {
    private String ligacaoCliente;

    public CallCenter(String ligacaoDoCliente) {
        this.ligacaoCliente = ligacaoDoCliente;
    }

    public String getLigacaoDoCliente() {
        return ligacaoCliente;
    }

    public void setLigacaoDoCliente(String ligacaoDoCliente) {
        this.ligacaoCliente = ligacaoDoCliente;
    }
}
