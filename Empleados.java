import java.util.ArrayList;

public class Empleados {
    private static ArrayList<Empleado> empleados_lista;

    public Empleados() {
        empleados_lista = new ArrayList<>();
        darAlta();
    }

    public void listadoEmpleados() {
        for (Empleado empleado : empleados_lista) {
            System.out.println(empleado.toString());
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados_lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public static void addEmpleado(Empleado empleado){
        empleados_lista.add(empleado);
    }

    public static void darAlta(){
        Empleado e1 = new Empleado("Juan", "Desarrollador", 50000);
        Empleado e2 = new Empleado("María", "Diseñadora", 45000);
        Empleado e3 = new Empleado("Pedro", "Gerente", 60000);
        addEmpleado(e1);
        addEmpleado(e2);
        addEmpleado(e3);

    }


}
