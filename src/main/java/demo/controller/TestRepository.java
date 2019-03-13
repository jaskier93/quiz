package demo.controller;

import demo.model.Test;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface TestRepository extends CrudRepository<Test, Integer> {

}
