package kodlamaio.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hmrs.business.abstracts.JobService;
import kodlamaio.hmrs.business.requestes.job.CreateJobRequest;
import kodlamaio.hmrs.business.responses.job.GetAllJobResponse;
import kodlamaio.hmrs.business.rules.abstracts.JobRuleService;
import kodlamaio.hmrs.core.utilities.mappers.ModelMapperService;
import kodlamaio.hmrs.core.utilities.results.DataResult;
import kodlamaio.hmrs.core.utilities.results.ErrorResult;
import kodlamaio.hmrs.core.utilities.results.Result;
import kodlamaio.hmrs.core.utilities.results.SuccessDataResult;
import kodlamaio.hmrs.core.utilities.results.SuccessResult;
import kodlamaio.hmrs.dataAccess.abstracts.JobRepository;
import kodlamaio.hmrs.entities.concrete.Job;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobManager implements JobService {
    @Autowired
    private JobRepository jobRepository;
    private ModelMapperService mapper;
    private JobRuleService ruleService;

    @Override
    public DataResult<List<GetAllJobResponse>> getAll() {

        List<Job> jobs=jobRepository.findAll();
        List<GetAllJobResponse> allJobResponses=jobs.stream().map(job->mapper.forResponse()
        .map(job, GetAllJobResponse.class)).toList();
        return new SuccessDataResult<List<GetAllJobResponse>>("Başarıyla Listelendi",allJobResponses);
    }

    @Override
    public Result add(CreateJobRequest request) {
        if (ruleService.checkIfExistPosition(request.getPosition())) {
            return new ErrorResult("Aynı iş posisyonu tekrar edemez");
        }

        Job job=mapper.forRequest().map(request,Job.class);
        jobRepository.save(job);

        return  new SuccessResult("Yeni iş posisyonu başarıyla eklendi");
    }
    
}
