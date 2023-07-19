package kodlamaio.hmrs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hmrs.business.abstracts.JobService;
import kodlamaio.hmrs.business.requestes.job.CreateJobRequest;
import kodlamaio.hmrs.business.responses.job.GetAllJobResponse;
import kodlamaio.hmrs.core.utilities.results.DataResult;
import kodlamaio.hmrs.core.utilities.results.Result;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/Job")
@AllArgsConstructor
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("/getall")
    public DataResult<List<GetAllJobResponse>> getAll(){
        return jobService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateJobRequest request) {
        return  jobService.add(request);
    }
    
}
