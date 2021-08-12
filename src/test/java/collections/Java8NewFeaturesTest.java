package collections;

import bean.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Java8NewFeaturesTest {

    @Test
    void testForEach(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        list.stream().forEach(x -> {
            System.out.println(x);
        });
    }

    @Test
    void testReduce(){
        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(false);
        Boolean reduce = booleanList.stream().reduce(true, (acc, element) -> acc && element);
        System.out.println(reduce);
    }

    @Test
    void testOptional(){
        List<Integer> integerList = Arrays.asList();
        Optional<Integer> max = integerList.stream().max((a, b) -> a > b ? 1 : -1);
        Integer orElse = max.orElse(0);
        System.out.println(orElse);
        Map<String, String> map = new HashMap<>();
        System.out.println(map.get("1"));
    }

    @Test
    void testGroupBy(){
        User user1 = new User("1", "wansho", "研发", new BigDecimal(4));
        User user3 = new User("3", "gzx", "软件工程组",new BigDecimal(3));
        User user2 = new User("2", "lrx", "研发",new BigDecimal(2));
        User user4 = new User("4", "ljx", "软件工程组",new BigDecimal(1));
        List<User> userList = Arrays.asList(user1, user2, user3, user4);
        Map<String, List<User>> collect = userList
                .stream()
                .sorted(Comparator.comparing(User::getOrder))
                .collect(Collectors.groupingBy(User::getDepartment));
        collect.forEach((key, value) -> {
            System.out.println(key);
            value.stream().forEach(user -> System.out.println(user));
        });
    }

    @Test
    void testBigDecimalSort(){
        List<BigDecimal> bigDecimalList = new ArrayList<>();
        bigDecimalList.add(new BigDecimal(10));
        bigDecimalList.add(new BigDecimal(7));
        bigDecimalList.add(new BigDecimal(77));
        bigDecimalList.add(new BigDecimal(12));
        System.out.println(bigDecimalList.stream().sorted().collect(Collectors.toList()));
    }

}