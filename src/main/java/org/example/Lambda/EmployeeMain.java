package org.example.Lambda;
import org.example.Demo.Employee;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain
{

    public static void main(String[] args)
    {

        List<Employee> emp=new ArrayList<>();

        emp.add(new Employee(101,"Akshay",560000.00));
        emp.add(new Employee(1023,"Akshay",560000.00));
        emp.add(new Employee(107,"Sanjay",560000.00));
        emp.add(new Employee(102,"Mangesh",650000));
        emp.add(new Employee(103,"Satish",45000));
        emp.add(new Employee(106,"Satish",75000));

        LocalDateTime startTime=null;
        LocalDateTime endTime=null;

        System.out.println("------Start Time Stream----");
        startTime=LocalDateTime.now();
        emp.stream().map(p->p.getName()).forEach(q-> System.out.println(q));
        endTime=LocalDateTime.now();
        Duration d=Duration.between(startTime,endTime);
        System.out.println("****End Time Stream**** "+d);

        emp.parallelStream().map(p->p.getEmpId()).forEachOrdered(p-> System.out.println(p));



        System.out.println("********************* Avg Salary ******************");

        DoubleSummaryStatistics AllStatistics = emp.stream().collect(Collectors.summarizingDouble((p) -> p.getSalary()));

        System.out.println("All Statistics "+AllStatistics);

        System.out.println(AllStatistics.getAverage());
        System.out.println(AllStatistics.getMax());
        System.out.println(AllStatistics.getMin());


        Map<String, Long> collect = emp.stream().collect(Collectors.groupingBy(p -> p.getName(), Collectors.counting()));

        System.out.println(collect);


        for(int i=0;i<emp.size();i++){
            System.out.println("Emp Id "+emp.get(i).getEmpId()+" Emp name "+emp.get(i).getName()+
                    " emp salary "+emp.get(i).getSalary());
        }

        emp.forEach((x)-> System.out.println(x.getEmpId()+" "+x.getName()+" "+x.getSalary()));

        System.out.println("****** find out duplicate Employee");
//
//        List<Employee> collect = emp.stream().distinct().forEach(System.out.println(collect));
//        System.out.println(collect);


        Employee employee = emp.stream().max((t1, t2) -> (t1.getSalary() < t2.getSalary() ? -1 : t1.getSalary() == t2.getSalary() ? 0 : 1)).get();
        System.out.println("Maximum Salary "+employee);

        System.out.println(emp.stream().min((t1,t2)->t1.getSalary()>t2.getSalary() ? 1:t1.getSalary()==t2.getSalary() ? 0:-1).get());

        System.out.println(emp.stream().min((s1,s2)-> s1.getSalary()<s2.getSalary() ? -1: s1.getSalary()==s2.getSalary() ? 0: 1).get());

    }

}
