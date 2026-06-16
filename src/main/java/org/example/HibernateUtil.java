package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .build();



        try {
            sessionFactory =
                    new MetadataSources(registry)
                            .addAnnotatedClass(User.class)
                            .addAnnotatedClass(Movie.class)

                            .buildMetadata()
                            .buildSessionFactory();
        }
        catch (Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
            throw new RuntimeException("Failed to build the seession factory",e);
        }


    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }





}
