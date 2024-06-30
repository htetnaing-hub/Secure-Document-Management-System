package com.hna.securedoc.enumeration;

import static com.hna.securedoc.constant.Constants.*;

/**
 * @author Htet Naing Aung
 * @version 1.0
 * @email htetnaing.ucsmdy@gmail.com
 * @since 2024-06-30
 */

public enum Authority {
    USER(USER_AUTHORITIES),
    ADMIN(ADMIN_AUTHORITIES),
    SUPER_ADMIN(SUPER_ADMIN_AUTHORITIES),
    MANAGER(MANAGER_AUTHORITIES);

    private final String value;

    Authority(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
