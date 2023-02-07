import java.util.List;

public class Worker extends Person implements AbleToCalculatePension {

    private static final int MONEY_PER_CHILD = 200;
    private int minSalary;
    private int maxSalary;

    private List<Company> companyList;

    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public void infoAboutCompany() {
        System.out.print("Я работал в следующих компаниях: ");
        boolean start = true;

        for (Company company : companyList) {
            if (start) {
                System.out.print(company.getName());
                start = false;
            } else {
                System.out.print(", " + company.getName());
            }
        }
    }
        @Override
        public void die () {
            System.out.println("Этот человек не дожил до пенсии");
        }

        @Override
        public double calculatePension () {
            PensionFund pensionFund = new PensionFund("Пенсионный фонд Милана", "27-12-1946", TypeOfFund.STATE);
            int age = getAge();
            int additionalSalary = 0;
            if (getChildren() != null) {
                additionalSalary = getChildren().size() * MONEY_PER_CHILD;
            }
            double result = pensionFund.calculatePension(age, minSalary + additionalSalary, maxSalary);
            return result;
        }
    }

