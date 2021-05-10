package de.borisskert.spring.springredisexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = EmbeddedRedisTestConfiguration.class)
@ActiveProfiles("IT")
class StudentRepositoryTest {

    @Autowired
    StudentRepository repository;

    @Test
    public void shouldStoreStudent() throws Exception {
        // given
        String id = UUID.randomUUID().toString();
        Student student = new Student(id, "John Doe", 1);

        // when
        repository.save(student);

        // then
        Student receivedStudent = repository.findById(id).orElseThrow();
        assertThat(receivedStudent).isEqualTo(student);
    }
}
