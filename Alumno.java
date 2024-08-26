public class Alumno {
    //propiedades

    private String nombre;
    private String apellido;
    private int edad;

    //metodo constructor
    Alumno(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }
    //SETERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //GETTERS

    public String getNombre() {
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
}

