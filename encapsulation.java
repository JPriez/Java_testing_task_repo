public class Company {
    private String companyName;
    private String companySphere;
    private String projectName;

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanySphere() {
        return companySphere;
    }
    public void setCompanySphere(String companySphere) {
        this.companySphere = companySphere;
    }
    public String getProjectName() {
        return projectName;
    }


    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    @Override
    public String toString() {
        return "=============================\n"
               + "Company Name: " + companyName +
                "\nSphere:" + companySphere +
                "\nProject Name: " + projectName +
               "\n============================\n";
    }
}

public class CompanyRunner {
    public static void main(String[] args) {
        Company bethesda = new Company();

        bethesda.setCompanyName("Bethesda ");
        bethesda.setCompanySphere("Developing");
        bethesda.setProjectName("Fireworld");

        System.out.println("Bethesda info:");
        System.out.println(bethesda);
    }
}
