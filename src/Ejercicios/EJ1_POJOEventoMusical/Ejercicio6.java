package Ejercicios.EJ1_POJOEventoMusical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejercicio6 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/evento.odb");
        EntityManager em = emf.createEntityManager();

        //Iniciar la transacción
        em.getTransaction().begin();

        Evento eventoActualizar = em.find(Evento.class, 1);
        if (eventoActualizar == null){
            System.out.println("El evento no se encuentra.");
        } else {
            eventoActualizar.setNombreEvento("Evento nuevo");
        }

        em.getTransaction().commit();
    }
}