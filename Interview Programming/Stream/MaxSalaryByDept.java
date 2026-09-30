import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class MaxSalaryByDept {
    
    public static void main(String[] args) {
        
        List<Employee> empList = List.of(
            new Employee("Arul", "DMS", 60000),
            new Employee("murugan", "DMS1", 20000),
            new Employee("murugan", "DMS", 20000),
            new Employee("arul", "DMS1", 10000)
        );

        empList.stream()
                .filter(e->e!=null)
                .collect(Collectors
                    .groupingBy(
                        Employee::department,
                        Collectors.maxBy(
                            Comparator.comparingDouble(
                                Employee::salary
                            )
                        )
                ))
                .forEach((e,v) -> System.out.println(Arrays.asList(e,v)));

    }
}

record Employee(String name , String department, double salary){}
