package desafio3geografia;

public class Cidade {
    private String nome;
    private String estado;
    private String cap;

    public Cidade(String nome, String estado, String cap) {
        this.nome = nome;
        this.estado = estado;
        this.cap = cap;
    }
    
    public void status(){
        System.out.println("A cidade de " + this.nome + ", pertence ao " + this.estado +", e "+ this.cap + ".");
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCap() {
        return this.cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }
    
    
}