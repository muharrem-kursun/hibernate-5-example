package hibernateEx.com.dao;

import java.util.List;

public interface CrudRepository<Model,ID>{

    Model findById(ID id);
    List<Model> findAll();
    void insert(Model model);
    void deleteById(ID id);
    void delete(Model model);
    void update(Model model);

}
