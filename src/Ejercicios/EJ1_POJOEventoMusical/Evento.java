package Ejercicios.EJ1_POJOEventoMusical;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Evento {
    private String nombreEvento;
    private Timestamp fecha;
    private BigDecimal recaudacion;

    public Evento(String nombreEvento, Timestamp fecha, BigDecimal recaudacion){
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this. recaudacion = recaudacion;
    }

    public void Evento(){

    }

    //¿Para que sirven los tipos...?
    //Date: Almacena una fecha, por ejemplo "27/04/2023"
    //Time: Almacena la hora, por ejemplo "12:00".
    //Timestamp: Almacena la fecha y la hora, por ejemplo "27/04/2023 12:00".
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
        return "Evento" + '\n' +
                "Nombre: " + nombreEvento + '\n' +
                "Fecha del evento: " + fecha + '\n' +
                "Recaudación: " + recaudacion +
                '}';
    }
}