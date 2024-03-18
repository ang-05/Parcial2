class Empleado {
    private String nombre;
    private String cargo;
    private double salario;
    /**
     * Constructor de la clase Empleado
     * @param nombre
     * @param cargo
     * @param salario
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    /**
     * Método para obtener el nombre del empleado
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método para obtener el cargo del empleado
     * @return
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * Método para obtener el salario del empleado
     * @return
     */
    public double getSalario() {
        return salario;
    }   
    /**
     * Método para establecer el nombre del empleado
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método para establecer el cargo del empleado
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }   
    /**
     * Método para establecer el salario del empleado
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }   
    /**
     * Método para mostrar los datos del empleado
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
