package enfaseel.shop.dao;

import enfaseel.shop.entities.People;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PeopleDAOImpl implements PeopleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPeople(People people) {
        sessionFactory.getCurrentSession().save(people);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<People> listPeople() {
        return sessionFactory.getCurrentSession().createQuery("from People").list();
    }

    @Override
    public void removePeople(Integer id) {
        People tempPeople = sessionFactory.getCurrentSession().load(
                People.class, id);
        if (null != tempPeople) {
            sessionFactory.getCurrentSession().delete(tempPeople);
        }
    }
}
