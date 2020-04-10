
package pkg7poo;


public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    Cuenta cuentas [];

    public Cliente(String nombre, String apellido, String DNI, Cuenta [] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public double consultarSaldo (int n) {
        cuentas[n].getSaldo();
        return 0;
    }
    
    
    public void retirarSaldocliente(int n, double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }
    
    public void ingresarSaldoCliente (int n, double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    
    
}
