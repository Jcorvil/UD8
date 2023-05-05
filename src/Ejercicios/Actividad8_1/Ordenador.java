package Ejercicios.Actividad8_1;

import java.util.Date;

public class Ordenador {

    Integer memoria;
    Integer discoDuro;
    String cpu;
    Date fechaCompra;


    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public Integer getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(Integer discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    @Override
    public String toString() {
        return "·Especificaciones del ordenador·" +
                "Memoria RAM: " + memoria +
                "Disco Duro: " + discoDuro +
                "Procesador (cpu): " + cpu + '\'' +
                "Fecha de compra: " + fechaCompra;
    }
}