package ua.edu.ucu.taskthree;

public class CompanyReaderFacade {
    private BrandFetchReader brandFetchReader;
    private PDLReader pdlReader;

    public CompanyReaderFacade() {
        this.brandFetchReader = new BrandFetchReader();
        this.pdlReader = new PDLReader();
    }

    public Company fetch(String companyName) {
        Company companyFromBrandFetch = brandFetchReader.fetch(companyName);
        Company companyFromPDL = pdlReader.fetch(companyName);

        Company company = new Company();
        if (companyFromBrandFetch != null) {
            company.setName(companyFromBrandFetch.getName());
        }
        if (companyFromPDL != null && company.getDescription() == null) {
            company.setDescription("Info from PDL");
        }
        return company;
    }
}
