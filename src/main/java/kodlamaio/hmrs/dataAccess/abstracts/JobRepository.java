package kodlamaio.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hmrs.entities.concrete.Job;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {
    
}
