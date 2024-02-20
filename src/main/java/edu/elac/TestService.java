import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-05 09:40
 */
public class TestService {

    public void calculate() {

        TestClass t1 = new TestClass();
        t1.setId(1);
        t1.setName("David");
        t1.setYearOfJoining(2024);
        t1.setSalary(10000.0);

        TestClass t2 = new TestClass();
        t2.setId(2);
        t2.setName("David2");
        t2.setYearOfJoining(2023);
        t2.setSalary(2000.0);

        TestClass t3 = new TestClass();
        t3.setId(3);
        t3.setName("David3");
        t3.setYearOfJoining(2021);
        t3.setSalary(3000.0);

        List<TestClass> list1 = new ArrayList<>();
        list1.add(t1);
        list1.add(t2);
        list1.add(t3);
        list1.stream().max(Comparator.comparing(TestClass::getSalary)).ifPresent(System.out::println);
    }


}