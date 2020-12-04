package enfaseel.shop.dao;

import enfaseel.shop.entities.People;

import java.util.List;

public interface PeopleDAO {

    void addPeople(People people);

    List<People> listPeople();

    void removePeople(Integer id);
}
