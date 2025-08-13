package Unidad6.CreativoSInLimites;

public enum TipoDiseñador {
    UX(8),
    UI(7),
    IT(12);

    private final int valor;

    TipoDiseñador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

