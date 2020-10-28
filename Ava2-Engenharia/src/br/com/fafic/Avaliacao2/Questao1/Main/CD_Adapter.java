package br.com.fafic.Avaliacao2.Questao1.Main;

public class CD_Adapter extends Vinyl_Player {
    public String play_CD_Vitrola(CD cd1){
        Vinyl v1 = new Vinyl(cd1.getDisco());
        return play(v1);
    }

    public Vinyl read_CD_Vitrola(CD cd1){
        Vinyl v1 = new Vinyl(cd1.getDisco());
        return v1;
    }

    public String play(Vinyl cd1) {
        return "Vinil tocando cd:" + cd1.getDisco();
    }
}