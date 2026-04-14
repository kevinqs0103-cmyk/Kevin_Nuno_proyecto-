
public class Persona {

    private String nombre;
    private String apellidos;
    private Localdate fecha_nacimiento;

    private String dni;

    public Persona(String nombre, String apellidos, Localdate fecha_nacimiento, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Localdate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Localdate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", dni='" + dni + '\'' +
                '}';
    }
}