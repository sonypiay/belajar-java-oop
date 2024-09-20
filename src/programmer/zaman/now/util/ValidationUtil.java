package programmer.zaman.now.util;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if( loginRequest.getUsername() == null ) {
            throw new NullPointerException("username is null");
        } else if( loginRequest.getUsername().isBlank() ) {
            throw new ValidationException("username is blank");
        } else if( loginRequest.getPassword() == null ) {
            throw new NullPointerException("password is null");
        } else if( loginRequest.getPassword().isBlank() ) {
            throw new ValidationException("password is blank");
        }
    }
}
