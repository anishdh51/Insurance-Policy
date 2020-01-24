package InsurancePolicy.services;


import InsurancePolicy.dtos.InsurancePolicyDto;
import InsurancePolicy.entities.InsurancePolicyEntity;
import InsurancePolicy.repositories.InsurancePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class InsurancePolicyService {

    @Autowired
    private InsurancePolicyRepository insurancePolicyRepository;

    public void createInsurancePolicy(InsurancePolicyDto dto){
        InsurancePolicyEntity ip = new InsurancePolicyEntity();
        ip.setPolicyNumber(dto.getPolicyNumber());
        ip.setType(dto.getType());
        ip.setStartDate(dto.getStartDate());
        ip.setExpDate(dto.getExpDate());
        ip.setActive(dto.getActive());
        ip.setUuid(UUID.randomUUID().toString());

        insurancePolicyRepository.save(ip);
    }
}
