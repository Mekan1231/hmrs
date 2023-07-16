package kodlamaio.hmrs.webApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hmrs.business.abstracts.CandidateService;
import kodlamaio.hmrs.business.requestes.candidate.CreateCandidateRequest;
import kodlamaio.hmrs.core.utilities.results.Result;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/candidate")
@AllArgsConstructor
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @PostMapping("/add")
    public Result add(CreateCandidateRequest request) {
        return candidateService.add(request);
    }
}
