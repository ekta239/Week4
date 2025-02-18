package ekta.annotations.catcheresult;

public class CacheManager {
    public static void main(String[] args) throws Exception {
        ExpensiveOperation operation = new ExpensiveOperation();
        System.out.println(operation.computeSquare(5)); // Compute and store
        System.out.println(operation.computeSquare(5)); // Fetch from cache
    }
}