import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class demo {
    public static void main(String []args)
    {

      List<String>ll= Arrays.asList("abb","bca","abc","aec","adc");
      ll.stream().filter(x->x.startsWith("a")).filter(x->x.endsWith("c")).sorted().forEach(System.out::println);    }
}
