package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// static factory 추가
public class MyStreamV2 {
    private List<Integer> internalList;

    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    // static factory
    public static MyStreamV2 of(List<Integer> internalList) {
        return new MyStreamV2(internalList);
    }
    public MyStreamV2 filter(Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer element : internalList) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return new MyStreamV2(filteredList);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer element : internalList) {
            filteredList.add(mapper.apply(element));
        }

        return new MyStreamV2(filteredList);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
