package ekta.annotations.rolledalowed;



public class AccessManager {
    public static void main(String[] args) {
        SecureService service = new SecureService();
        try {
            service.executeTask("USER");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
