package Ejercicios.EJ1_POJOEventoMusical;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
public class Evento implements Serializable {

    // Ejercicio 3 VV
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "incremento10")
    @SequenceGenerator(initialValue = 10, allocationSize = 10, name = "incremento10")
    private Integer id;

    @Transient
    private Integer idControl;
    // Ejercicio 3 ^^

    private String nombreEvento;
    private Timestamp fecha;
    private BigDecimal recaudacion;

    // Ejercicio2 VV
    @Enumerated(EnumType.STRING)
    private Generos generos;
    @Embedded
    List<Artistas> artistas;
    // Ejercicio2 ^^

    public Evento(String nombreEvento, Timestamp fecha, BigDecimal recaudacion){
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this. recaudacion = recaudacion;
    }

    public Evento(){

    }

    //¿Para que sirven los tipos...?
    //Date: Almacena una fecha, por ejemplo "2023-04-27"
    //Time: Almacena la hora, por ejemplo "21:00:00".
    //Timestamp: Almacena la fecha y la hora, por ejemplo "2023-04-27 21:00:00".
    //Calendar:



    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "•:Evento:•" + '\n' +
                "Nombre: " + nombreEvento + '\n' +
                "Fecha del evento: " + fecha + '\n' +
                "Recaudación: " + recaudacion +
                '}';
    }
}