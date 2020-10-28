package br.com.fafic.Avaliacao2.Questao3;

public interface Builder <A, B> {
    public A component1(String componente1);
    
    public A component2(String componente2);
    
    public B create();
}
