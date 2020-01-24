package InsurancePolicy.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class InsurancePolicyDto implements Serializable {

    private Integer id;
    private String policyNumber;
    private String type;
    private Date startDate;
    private Date expDate;
    private Boolean isActive;
    List<ProductDto> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "InsurancePolicyDto{" +
                "id=" + id +
                ", policyNumber='" + policyNumber + '\'' +
                ", type='" + type + '\'' +
                ", startDate=" + startDate +
                ", expDate=" + expDate +
                ", isActive=" + isActive +
                '}';
    }
}
