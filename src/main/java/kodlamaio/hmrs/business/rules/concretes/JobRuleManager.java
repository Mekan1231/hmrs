package kodlamaio.hmrs.business.rules.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hmrs.business.rules.abstracts.RuleService;
import kodlamaio.hmrs.dataAccess.abstracts.JobRepository;
import kodlamaio.hmrs.entities.concrete.Job;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobRuleManager implements RuleService {
    @Autowired
    private JobRepository repository;
    private List<Job> positions;

    
    

    public boolean checkIfExistPosition(String email) {
        this.positions=this.repository.findAll();
        for (Job position : positions) {
            if (email.equals(position.getPosition())) {
                return false;
            }
        }
        return true;
    }
    
}
