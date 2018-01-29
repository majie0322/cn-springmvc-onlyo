package cn.springmvc.onlyo.dao;

import cn.springmvc.onlyo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
@Repository
*/
public interface StudentDao extends JpaRepository<Student, Integer> {

    Student findById(Integer id);
}
