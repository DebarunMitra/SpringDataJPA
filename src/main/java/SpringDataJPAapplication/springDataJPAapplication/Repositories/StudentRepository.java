package SpringDataJPAapplication.springDataJPAapplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringDataJPAapplication.springDataJPAapplication.Models.Students;

public interface StudentRepository extends JpaRepository<Students, Long> {
    
}
