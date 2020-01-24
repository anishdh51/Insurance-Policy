package InsurancePolicy.repositories;

import InsurancePolicy.entities.InsurancePolicyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InsurancePolicyRepository extends
        CrudRepository<InsurancePolicyEntity, Integer>{

}
