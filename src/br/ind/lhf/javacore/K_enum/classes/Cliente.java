package br.ind.lhf.javacore.K_enum.classes;

public class Cliente {
    public enum TipoPagamento{
        AVISTA, APRAZO
    }

    private  String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento pagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento pagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipoCliente +
                ", pagamento=" + pagamento +
                ", numero=" + tipoCliente.getTipo() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
