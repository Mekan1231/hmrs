package kodlamaio.hmrs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hmrs.business.abstracts.JobService;
import kodlamaio.hmrs.core.utilities.results.DataResult;
import kodlamaio.hmrs.entities.concrete.Job;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/Job")
@AllArgsConstructor
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("/getall")
    public DataResult<List<Job>> getAll(){
        return jobService.getAll();
    }
    
}
