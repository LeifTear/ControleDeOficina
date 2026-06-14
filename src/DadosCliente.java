public class DadosCliente {

    private int id;
    private String nome;
    private String telefone;
    private String placa;
    private String modelo;
    private String ano;
    private String observacao;
    private String status;

    public DadosCliente(int id, String nome, String telefone,
                        String placa, String modelo,
                        String ano, String observacao) {

        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.observacao = observacao;
        this.status = "Pendente";
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {

        return "\nID: " + id +
                "\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nPlaca: " + placa +
                "\nModelo: " + modelo +
                "\nCor: " + ano +
                "\nObservação: " + observacao +
                "\nStatus: " + status;



    }
}