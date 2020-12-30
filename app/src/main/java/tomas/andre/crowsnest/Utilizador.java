package tomas.andre.crowsnest;

public class Utilizador {

    public int id;
    public String nome;
    public String pwd;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Utilizador(String nome, String pwd) {
        this.nome = nome;
        this.pwd = pwd;
    }
}
