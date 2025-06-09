package Color;

public enum ColorEnum {
    ROJO("#FF0000"),
    VERDE("#00FF00"),
    AZUL("#0000FF"),
    AMARILLO("#FFFF00"),
    NEGRO("#000000"),
    BLANCO("#FFFFFF"),
    GRIS("#808080");
    private String codHexadecimal;

    ColorEnum(String codHexadecimal) {
        this.codHexadecimal = codHexadecimal;
    }

    public String getCodHexadecimal() {
        return codHexadecimal;
    }

    public void setCodHexadecimal(String codHexadecimal) {
        this.codHexadecimal = codHexadecimal;
    }
}
