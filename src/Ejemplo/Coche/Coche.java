package Ejemplo.Coche;

import javax.jdo.annotations.Embedded;
import javax.persistence.Entity;
import java.io.Serializable;


@Entity(name = "cochecito")
public class Coche implements Serializable {

    private String color;
    private String marca;

    @Embedded
    private Fabricante fabricante;

    public Coche(){

    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}