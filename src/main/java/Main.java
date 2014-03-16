import beans.Company;
import beans.EmployeeService;
import beans.Profile;
import beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        Profile profile = (Profile) context.getBean("profile");
        Company company = (Company) context.getBean("company");
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        System.out.println(user.toString());
        System.out.println(profile.toString());
        System.out.println(company.toString());
        System.out.println(employeeService.toString());
    }
}
