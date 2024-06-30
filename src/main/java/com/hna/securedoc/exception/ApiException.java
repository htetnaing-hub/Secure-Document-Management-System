package com.hna.securedoc.exception;

/**
 * @author Htet Naing Aung
 * @version 1.0
 * @email htetnaing.ucsmdy@gmail.com
 * @since 2024-06-24
 */

public class ApiException extends RuntimeException{
    public ApiException(String message){ super(message); }
    public ApiException(){ super("An error occurred"); }

}
