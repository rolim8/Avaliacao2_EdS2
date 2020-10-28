package br.com.fafic.Avaliacao2.Questao1.Main;
import br.com.fafic.Avaliacao2.Questao1.Models.Disco;
import br.com.fafic.Avaliacao2.Questao1.Models.Player;

public class CD_Player implements Player<CD> {
    public String play(CD cd1) {
        return "Cds tocando" + cd1.getDisco();
    }
}
