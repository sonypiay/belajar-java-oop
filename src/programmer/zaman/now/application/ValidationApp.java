package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("sony", null);

//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data valid");
//        } catch (ValidationException exception) {
//            System.out.println("Data tidak valid: " + exception.getMessage());
//        } catch (NullPointerException exception) {
//            System.out.println("Data null: " + exception.getMessage());
//        }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }
    }
}
