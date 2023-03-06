public class Main {
    public static void main(String[] args) {

        //Instancia de cuenta de banco
        CuentaBancaria cuentaBanco = new CuentaBancaria("Rebeca Ramirez", 400);

        cuentaBanco.deposito(5000);

        cuentaBanco.retiro(2000);

        System.out.println("Nombre: " + cuentaBanco.obtenerPropietario());
        System.out.println("Saldo total: $ "+ cuentaBanco.obtenerSaldo());

    }
}