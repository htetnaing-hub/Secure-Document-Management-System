package com.hna.securedoc.domain;

/**
 * @author Htet Naing Aung
 * @version 1.0
 * @email htetnaing.ucsmdy@gmail.com
 * @since 2024-06-24
 */


public class RequestContext {

    private static final ThreadLocal<Long> USER_ID = new ThreadLocal<>();

    private RequestContext() {}

    public static void start(){
        USER_ID.remove();
    }

    public static void setUserId(Long userId) {
        USER_ID.set(userId);
    }

    public static Long getUserId() {
        return USER_ID.get();
    }

}
