package InsurancePolicy.controller;

import InsurancePolicy.dtos.InsurancePolicyDto;
import InsurancePolicy.services.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/insurancepolicy")
public class InsurancePolicyController {

    @Autowired
    private InsurancePolicyService insurancePolicyService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void saveInsurancePolicy( @RequestParam Integer customerid,
            @RequestBody InsurancePolicyDto policy) {

        insurancePolicyService.createInsurancePolicy(policy);
    }

}
