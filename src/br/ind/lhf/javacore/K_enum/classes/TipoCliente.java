package br.ind.lhf.javacore.K_enum.classes;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2){
        public char getId(){
            return 'B';
        }
    };

    private int tipo;

        TipoCliente(int tipo) {
        this.tipo = tipo;
    }

    public char getId(){
            return 'A';
    }

    public int getTipo() {
        return tipo;
    }
}
