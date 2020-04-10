package pkg7poo;


public class Cuenta {
    private double saldo;
    private int numeroDeCuenta;

    public Cuenta(double saldo, int numeroDeCuenta) {
        this.saldo = saldo;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
    public void retirarDinero(double cantidad){
        saldo -= cantidad;
    }
    
    public void ingresarDinero(double cantidad){
        saldo += cantidad;
    }
    
    
}
