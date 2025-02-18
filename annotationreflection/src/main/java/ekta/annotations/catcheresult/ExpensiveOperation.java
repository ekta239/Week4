package ekta.annotations.catcheresult;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ExpensiveOperation {
    private final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int number) {
        if (cache.containsKey(number)) {
            return cache.get(number);
        }
        int result = number * number;
        cache.put(number, result);
        return result;
    }
}
