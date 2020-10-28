package br.com.fafic.Avaliacao2.Questao3;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Builder_Veiculo("Audi").component1("Cambio Manual").component2("Ar Condicionado").create());
        System.out.println(new Builder_Veiculo("Ford").component1("Ar condicionado").component2("Air Bag").create());
    }
}

