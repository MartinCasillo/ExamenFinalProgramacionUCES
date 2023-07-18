public class CuentaBancaria {
    private int numeroDeCuenta;
    private int saldo;

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public CuentaBancaria(int numeroDeCuenta, int saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }
}