package kodlamaio.hmrs.business.abstracts;

import java.util.List;

import kodlamaio.hmrs.business.requestes.job.CreateJobRequest;
import kodlamaio.hmrs.business.responses.job.GetAllJobResponse;
import kodlamaio.hmrs.core.utilities.results.DataResult;
import kodlamaio.hmrs.core.utilities.results.Result;

public interface JobService {
    DataResult<List<GetAllJobResponse>> getAll();
    Result add(CreateJobRequest request);
}
