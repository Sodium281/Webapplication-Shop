package enfaseel.shop.service;

import enfaseel.shop.dao.PeopleDAO;
import enfaseel.shop.entities.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService{

    @Autowired
    private PeopleDAO peopleDAO;

    @Transactional
    public void addPeople(People people) {
        peopleDAO.addPeople(people);
    }

    @Transactional
    public List<People> listPeople() {
        return peopleDAO.listPeople();
    }

    @Transactional
    public void removePeople(Integer id) {
        peopleDAO.removePeople(id);
    }
}
