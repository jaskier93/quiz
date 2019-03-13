package demo.repository;

import demo.model.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRespository extends CrudRepository<Test, Integer> {

}
