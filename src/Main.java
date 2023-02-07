import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Money money = new Money();
        int m = money.getMoney();
        System.out.println(m);

        Worker worker = new Worker();

        Pensioner pensioner = new Pensioner("Mark", 35, 170, 65, 1.2);
        System.out.println(pensioner);

        worker.setMinSalary(1000);
        worker.setMaxSalary(2000);
        worker.setAge(50);

        double answer = worker.calculatePension();

        System.out.println(worker + " твоя пенсия составит $:");
        System.out.println(answer);

        List<Person> children = new ArrayList<>();

        Worker firstChild = new Worker();
        firstChild.setName("Иван");

        Worker secondChild = new Worker();
        secondChild.setName("Дмитрий");

        children.add(firstChild);
        children.add(secondChild);

        worker.setChildren(children);

        worker.infoAboutChildren();

        Company oracle = new Company("Oracle");
        Company google = new Company("Google");

        List<Company> companyList = new ArrayList<>();
        companyList.add(oracle);
        companyList.add(google);

        worker.setCompanyList(companyList);

        worker.infoAboutCompany();
    }
}