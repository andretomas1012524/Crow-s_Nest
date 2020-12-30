package tomas.andre.crowsnest;

public class Pontuacao {

    public int id;
    public String desc;
    public double pontuacao;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Pontuacao(String desc, double pontuacao) {
        this.desc = desc;
        this.pontuacao = pontuacao;
    }
}
