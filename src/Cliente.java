public class Cliente {

    private int id;
    private String nome;
    private String telefone;
    private String placa;
    private String modelo;
    private String cor;
    private String observacao;

    public Cliente(int id, String nome, String telefone,
                   String placa, String modelo,
                   String cor, String observacao) {

        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {

        return "\nID: " + id +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nPlaca: " + placa +
                "\nModelo: " + modelo +
                "\nCor: " + cor +
                "\nObservação: " + observacao;
    }
}