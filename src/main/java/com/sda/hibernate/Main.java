package com.sda.hibernate;

import com.sda.hibernate.entity.BookEntity;
import com.sda.hibernate.entity.CategoryEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class Main {

    private static final SessionFactory sessionFactory;

    static{
        try{
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        }catch (Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()throws HibernateException{
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {

      /*  BookEntity bookEntity = new BookEntity();
        bookEntity.setAuthor("Stephen King");
        bookEntity.setTitle("Misery");
        BookEntity bookEntity1 = new BookEntity();
        bookEntity1.setTitle("Pierwszy śnieg");
        bookEntity1.setAuthor("Jo Nesbo");
        BookEntity bookEntity2 = new BookEntity();
        bookEntity2.setAuthor("Stephen King");
        bookEntity2.setTitle("To");
        BookEntity bookEntity3 = new BookEntity();
        bookEntity3.setAuthor("Stehpen King");
        bookEntity3.setTitle("Cujo");
        BookEntity bookEntity4 = new BookEntity();
        bookEntity4.setAuthor("Stanisław Lem");
        bookEntity4.setTitle("Cyberiada");
        BookEntity bookEntity5 = new BookEntity();
        bookEntity5.setTitle("Karaluchy");
        bookEntity5.setAuthor("Jo Nesbo");
        bookEntity5.setCategory("crime story");
        bookEntity5.setIsbn("12345");
        bookEntity5.setOnStock(3);
        bookEntity5.setPageCount(245);
        bookEntity5.setPrice(new BigDecimal(29.99));
        bookEntity5.setPublished(new Date(1999, 2, 1));
        bookEntity5.setPublisher("Oslo Publishing");

        Transaction tx = null;
        Session session = getSession();

        tx = session.beginTransaction();

        session.save(bookEntity);
        session.save(bookEntity1);
        session.save(bookEntity2);
        session.save(bookEntity3)
        session.save(bookEntity4);
        session.save(bookEntity5);

        tx.commit();
        //wypisanie wszystkich elementow z listy:
        tx = session.beginTransaction();
        List<BookEntity> bookEntityList = session.createCriteria(BookEntity.class).list();
        System.out.println(bookEntityList);
        //drugi sposob:
        List<BookEntity> bookEntityList1 = session.createQuery("FROM " + BookEntity.class.getName()).list();
        System.out.println(bookEntityList1);

        for (BookEntity entity : bookEntityList1) {
            System.out.println("Autor: " + entity.getAuthor() + " Tytuł: " + entity.getTitle());
        }*/
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName("crime story");
        CategoryEntity categoryEntity1 = new CategoryEntity();
        categoryEntity1.setName("fantasy");
        CategoryEntity categoryEntity2 = new CategoryEntity();
        categoryEntity2.setName("horror");
        CategoryEntity categoryEntity3 = new CategoryEntity();
        categoryEntity3.setName("detective story");
        CategoryEntity categoryEntity4 = new CategoryEntity();
        categoryEntity4.setName("poetry");

        Session session = getSession();
       Transaction transaction = session.beginTransaction();
      /*  session.save(categoryEntity);
        session.save(categoryEntity1);
        session.save(categoryEntity2);
        session.save(categoryEntity3);
        session.save(categoryEntity4);

        transaction.commit();*/

       // transaction = session.beginTransaction();
        List<CategoryEntity> categoryEntityList = session.createQuery("FROM " + CategoryEntity.class.getName()).list();
        for (CategoryEntity entity : categoryEntityList) {
            System.out.println("Kategoria: " + entity.getName());
        }
    }
}
