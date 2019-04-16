package org.zhang.utils;

import org.zhang.bean.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by zhang on 2019/03/20.
 */
public class Util {
    public static User getCurrentUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user;
    }
}
