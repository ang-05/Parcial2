
import java.util.Scanner;

public class SistemaGestionEmpleados {

    private Empleado[] empleados;
    /**
     * Constructor de la clase SistemaGestionEmpleados
     * @param empleados
     */
    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    /**
     * Método para listar los empleados
     * @param porcentaje
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public static void main(String[] args) {
       /**
        * Crear un objeto de la clase Empleados que será un ArayList con datos ficticios
        */
        Empleados empleados = new Empleados();

        /**
         * Crear un objeto de la clase Scanner para leer el porcentaje de aumento de salario
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.PEDIR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();
        /**
         * Llamar al método aumentarSalario de la clase Empleados
         */
        empleados.aumentarSalario(porcentaje);
        /**
         * Llamar al método listadoEmpleados de la clase Empleados
         */
        empleados.listadoEmpleados();
        
        scanner.close();
    }
}
