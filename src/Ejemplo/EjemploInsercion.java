package Ejemplo;

import Ejercicios.EJ1_POJOEventoMusical.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EjemploInsercion {
    public static void main(String[] args) {
        //Abrir la conexión
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        EntityManager em = emf.createEntityManager();

        //Iniciar la transacción
        em.getTransaction().begin();

        //Operaciones
        Evento e1 = new Evento();
        e1.setNombreEvento("Evento Rock");
        Evento e2 = new Evento();
        e2.setNombreEvento("Evento hip-hop");
        em.persist(e1);
        em.persist(e2);

        //Finalizar la transacción: guardar la información
        em.getTransaction().commit();

        TypedQuery<Evento> query2 = em.createQuery("SELECT c FROM Evento c WHERE nombreEvento LIKE ?1", Evento.class);
        query2.setParameter(1, "Evento Rock");
        Evento evento2 = query2.getSingleResult();
        System.out.println(evento2);

        //Cerrar la conexión
        em.close();
        emf.close();



    }
}