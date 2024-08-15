package main.java.br.com.danielsantdev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import main.java.br.com.danielsantdev.domain.Marca;
import main.java.br.com.danielsantdev.domain.Registro;

public class RegistroDao implements IRegistroDao {

    @Override
    public Registro cadastrar(Registro reg) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(reg);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return reg;
    }

    @Override
    public Registro buscarPorCodigoMarca(String codigoMarca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Registro m ");
        sb.append("INNER JOIN Marca c on c = m.marca ");
        sb.append("WHERE c.codigo = :codigoMarca");

        entityManager.getTransaction().begin();
        TypedQuery<Registro> query =
                entityManager.createQuery(sb.toString(), Registro.class);
        query.setParameter("codigoMarca", codigoMarca);
        Registro registro = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return registro;
    }

    @Override
    public Registro buscarPorMarca(Marca marca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Registro m ");
        sb.append("INNER JOIN Marca c on c = m.marca ");
        sb.append("WHERE c = :marca");

        entityManager.getTransaction().begin();
        TypedQuery<Registro> query =
                entityManager.createQuery(sb.toString(), Registro.class);
        query.setParameter("marca", marca);
        Registro registro = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return registro;
    }

    @Override
    public Registro buscarPorCodigoMarcaCriteria(String codigoMarca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Registro> query = builder.createQuery(Registro.class);
        Root<Registro> root = query.from(Registro.class);
        Join<Object, Object> join = root.join("marca", JoinType.INNER);
        query.select(root).where(builder.equal(join.get("codigo"), codigoMarca));

        TypedQuery<Registro> tpQuery =
                entityManager.createQuery(query);
        Registro registro = tpQuery.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return registro;
    }

    @Override
    public Registro buscarPorMarcaCriteria(Marca marca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Registro> query = builder.createQuery(Registro.class);
        Root<Registro> root = query.from(Registro.class);
        Join<Object, Object> join = root.join("marca", JoinType.INNER);
        query.select(root).where(builder.equal(join, marca));

        TypedQuery<Registro> tpQuery =
                entityManager.createQuery(query);
        Registro registro = tpQuery.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return registro;
    }
    
}
