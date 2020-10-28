package br.com.fafic.Avaliacao2.Questao1.Main;

public class Main {
    public static void main(String[] args) {
        Vinyl_Player t1 = new Vinyl_Player();
        CD_Adapter a1 = new CD_Adapter();
        CD cd1 = new CD("Paramore");

        System.out.println(a1.play_CD_Vitrola(cd1));
        System.out.println(t1.play(a1.read_CD_Vitrola(cd1)));
    }
}
