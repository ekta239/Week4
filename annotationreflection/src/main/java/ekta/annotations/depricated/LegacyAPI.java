package ekta.annotations.depricated;

// LegacyAPI.java
public class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("This is an old feature.");
    }

    public void newFeature() {
        System.out.println("This is the new feature.");
    }
}
