package ekta.annotations.depricated;

// Main.java (To observe warning)
public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature(); // Should show a warning
        api.newFeature();
    }
}
