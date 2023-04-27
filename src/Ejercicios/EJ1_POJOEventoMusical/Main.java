package Ejercicios.EJ1_POJOEventoMusical;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        Timestamp ts = Timestamp.valueOf("2023-04-27 21:00:00");
        BigDecimal bd = BigDecimal.valueOf(8000000.00);

        Evento evento1 = new Evento("partido furbo", ts, bd);

        System.out.println(evento1);

    }
}