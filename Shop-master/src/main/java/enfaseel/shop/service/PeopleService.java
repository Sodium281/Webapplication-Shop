package enfaseel.shop.service;

import enfaseel.shop.entities.People;

import java.util.List;

public interface PeopleService {

    void addPeople(People people);

    List<People> listPeople();

    void removePeople(Integer id);
}
