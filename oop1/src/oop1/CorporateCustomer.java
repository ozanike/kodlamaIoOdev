package oop1;

public class CorporateCustomer extends Customer{
    private String companyName;
    private String taxNumber;

    // Kisayol olarak command+n tusu generate islemini acar.
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
