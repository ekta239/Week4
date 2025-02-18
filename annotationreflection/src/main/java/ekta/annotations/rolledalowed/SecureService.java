package ekta.annotations.rolledalowed;

import java.lang.reflect.Method;


public class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }

    public void executeTask(String role) throws Exception {
        Method method = SecureService.class.getMethod("adminTask");
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (!roleAllowed.value().equals(role)) {
                throw new SecurityException("Access Denied!");
            }
        }
        adminTask();
    }
}
