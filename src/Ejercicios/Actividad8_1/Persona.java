package Ejercicios.Actividad8_1;

public class Persona {

    String nombre;
    String apellidos;
    Integer edad;
    String grupo;


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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }


    @Override
    public String toString() {
        return "·Alumno·" +
                "Nombre: '" + nombre + '\'' +
                "Apellidios: '" + apellidos + '\'' +
                "Edad: " + edad + '\'' +
                "Grupo: " + grupo;
    }
}
