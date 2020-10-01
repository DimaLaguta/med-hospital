package repo;

import java.util.List;
import java.util.Optional;

public interface CrudRepo<Entity, ID> {

    <Child extends Entity> void save(Child entity);

    Optional<Entity> findById(ID id);

    List<Entity> findAll();

    void deleteById(ID id);
}
