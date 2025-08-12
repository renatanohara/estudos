public enum TipoOperacao {
    DEPOSITO,
    SAQUE,
    TRANSFERENCIA;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
