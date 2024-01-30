package au.zinoveva.gb.services;

import au.zinoveva.gb.domain.Course;
import au.zinoveva.gb.repositories.CourseRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CourseService {

    CourseRepository repository;

    public void save(Course course) {
        this.repository.save(course);
    }

    public Course getByID(Long id) {
        return this.repository.getReferenceById(id);
    }

    public List<Course> getAll() {
        return this.repository.findAll();
    }

    public void delete(Course course) {
        this.repository.delete(course);
    }

    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }



}
