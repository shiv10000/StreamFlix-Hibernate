package org.example;

import org.hibernate.SessionFactory;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main() {
      SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

      sessionFactory.inTransaction(
              session -> {
                  session.persist(new Movie("Interstellar", "action", LocalDate.now(), 3.0));
                  session.persist(new Movie("Crow", "action", LocalDate.now(), 5.0));
              }

      );
        }
    }
