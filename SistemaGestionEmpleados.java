
import java.util.Scanner;

public class SistemaGestionEmpleados {

    private Empleado[] empleados;

    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public static void main(String[] args) {
       Empleados empleados = new Empleados();

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.PEDIR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();
        empleados.aumentarSalario(porcentaje);
        
        empleados.listadoEmpleados();
        
        scanner.close();
    }
}
