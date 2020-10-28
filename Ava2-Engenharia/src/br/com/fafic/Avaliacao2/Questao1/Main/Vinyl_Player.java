package br.com.fafic.Avaliacao2.Questao1.Main;
import br.com.fafic.Avaliacao2.Questao1.Models.Player;

public class Vinyl_Player implements Player<Vinyl>{
    public String play(Vinyl cd1) {
        return "Vinil tocando " + cd1.getDisco();
    }
}