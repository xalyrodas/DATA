import java.util.ArrayList;
import java.util.List;

public class Data {
    public static ArrayList ListaDeAlumnos(){

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Luis", "Reyes", 17));
        alumnos.add(new Alumno("Kevin", "Herrera", 18));
        alumnos.add(new Alumno("Nataly", "Vasquea", 16));
        alumnos.add(new Alumno("Aaron", "Aguilar", 15));
        alumnos.add(new Alumno("Camila", "Sambrano", 17));

        return alumnos;
    }
}
