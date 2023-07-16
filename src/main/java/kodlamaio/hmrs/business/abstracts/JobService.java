package kodlamaio.hmrs.business.abstracts;

import java.util.List;

import kodlamaio.hmrs.core.utilities.results.DataResult;
import kodlamaio.hmrs.entities.concrete.Job;

public interface JobService {
    DataResult<List<Job>> getAll();
}
