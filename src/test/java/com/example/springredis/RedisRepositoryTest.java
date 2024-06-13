package com.example.springredis;

import com.example.springredis.entity.Person;
import com.example.springredis.repository.PersonRedisRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RedisRepositoryTest {

    @Autowired
    private PersonRedisRepository repo;

    @Test
    void test() {
        Person person = new Person("Park", 20);

        repo.save(person);

        repo.findById(person.getId());

        repo.count();

        repo.delete(person);
    }
}
