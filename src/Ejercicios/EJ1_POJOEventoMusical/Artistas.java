package Ejercicios.EJ1_POJOEventoMusical;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Artistas implements Serializable {

    private String nombre;
    private Integer componentes;

    public Artistas(String nombre, Integer componentes){
        this.nombre = nombre;
        this.componentes = componentes;
    }

    public Artistas(){

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getComponentes() {
        return componentes;
    }

    public void setComponentes(Integer componentes) {
        this.componentes = componentes;
    }
}