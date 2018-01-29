package cn.springmvc.onlyo.dao;

import cn.springmvc.onlyo.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration(locations= { "classpath*:spring-db.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;
    @Test
    public void findById() throws Exception {
        Student s  = studentDao.findById(1);
        System.out.println(s);
    }

}