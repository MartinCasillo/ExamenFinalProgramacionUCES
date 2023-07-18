public class CuentaBancariaImp {
    public static void main(String[] args){
        CuentaBancaria[] cuentaCorriente = new CuentaBancaria[6];
        cuentaCorriente[0] = new CuentaBancaria(1000001,148000);
        cuentaCorriente[1] = new CuentaBancaria(1000002,19000);
        cuentaCorriente[2] = new CuentaBancaria(1000003,167000);
        cuentaCorriente[3] = new CuentaBancaria(1000004,16000);
        cuentaCorriente[4] = new CuentaBancaria(1000005,123000);
        cuentaCorriente[5] = new CuentaBancaria(1000006,170000);

        int posicion = mayorSaldoBancario(cuentaCorriente);


        System.out.println("La cuenta bancaria con mayor saldo es : "
                + cuentaCorriente[posicion].getNumeroDeCuenta() +
                " Posee un saldo de : "
                + cuentaCorriente[posicion].getSaldo());


    }
    public static int mayorSaldoBancario(CuentaBancaria[] cuentaCorriente){
        int contadorSaldo = 0;
        int posicion = 0;
        for(int i = 0; i <= cuentaCorriente.length;i++ ){
            if(cuentaCorriente[posicion].getSaldo() > contadorSaldo ){
                contadorSaldo = cuentaCorriente[posicion].getSaldo();
                posicion = i;
            }
        }
    return posicion;
    }
}