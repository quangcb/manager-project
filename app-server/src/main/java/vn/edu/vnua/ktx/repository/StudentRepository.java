package vn.edu.vnua.ktx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.vnua.ktx.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByStudentId(Long studentId);
}
