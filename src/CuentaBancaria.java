public class CuentaBancaria {
    private String Propietario;
    private double saldo;

    public CuentaBancaria(String propietario, double saldo) {
        this.Propietario = propietario;
        this.saldo = saldo;
    }

    public double retiro(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo = this.saldo - cantidad;
            return cantidad;
        }

        return this.saldo;
    }

    public double deposito(double cantidad) {
        if (cantidad >= 1) {
            this.saldo = this.saldo + cantidad;
        }
    }

    public String obtenerPropietario(){
        return this.Propietario;
    }

    public double obtenerSaldo(){
        return this.saldo;
    }
}



