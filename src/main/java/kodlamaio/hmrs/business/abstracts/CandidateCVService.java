package kodlamaio.hmrs.business.abstracts;

import kodlamaio.hmrs.business.requestes.candidatecv.CreateCandidateCvRequest;
import kodlamaio.hmrs.core.utilities.results.Result;

public interface CandidateCVService {
    Result add(CreateCandidateCvRequest candidateCvRequest);
}
