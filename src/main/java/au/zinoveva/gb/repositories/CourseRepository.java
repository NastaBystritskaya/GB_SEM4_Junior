package au.zinoveva.gb.repositories;

import au.zinoveva.gb.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
