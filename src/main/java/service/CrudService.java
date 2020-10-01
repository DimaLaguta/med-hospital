package service;

import java.util.List;

public interface CrudService<T> {
    void create(T t);

    T getById(Integer id);

    List<T> getAll();

    void update(T t);

    void deleteById(Integer id);

}