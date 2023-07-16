package kodlamaio.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hmrs.business.abstracts.JobService;
import kodlamaio.hmrs.core.utilities.results.DataResult;
import kodlamaio.hmrs.core.utilities.results.SuccessDataResult;
import kodlamaio.hmrs.dataAccess.abstracts.JobRepository;
import kodlamaio.hmrs.entities.concrete.Job;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobManager implements JobService {
    @Autowired
    private JobRepository jobRepository;

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>("Başarıyla Listelendi",jobRepository.findAll());
    }
    
}
