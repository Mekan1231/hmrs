package kodlamaio.hmrs.business.rules.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hmrs.business.rules.abstracts.UserRuleService;
import kodlamaio.hmrs.core.utilities.verifiations.abstracts.Verification;
import kodlamaio.hmrs.dataAccess.abstracts.EmployerRepository;
import kodlamaio.hmrs.entities.concrete.Employer;

@Service
public class EmployerRuleManager implements UserRuleService {

    @Autowired
    private EmployerRepository repository;
    private List<Employer> employers;

    


    @Override
    public boolean comparePassword(String password, String confirmedPassword) {
        return password.equals(confirmedPassword);
    }

    @Override
    public boolean checkIfExistEmail(String email) {
        this.employers=this.repository.findAll();
        for (Employer employer : employers) {
            if (email.equals(employer.getEmail())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean verifyByEmail(Verification verification, String email) {
      return verification.verify();
    }

    public boolean verifyByPersonnel(Verification verification) {
        return verification.verify();
    }

    public boolean checkIfDomainSame(String website, String emailDomain) {
        String[] parts=emailDomain.split("@");
        String domain=parts[1];
        return website.equals(domain);
    }
    
}
