package codesquad;

import codesquad.user.User;

import javax.servlet.http.HttpSession;

public class HttpSessionUtils {
    public static final String USER_SESSION_KEY = "loginUser";

    public static boolean isLoginUser(HttpSession session) {
        Object sessionUser = session.getAttribute(USER_SESSION_KEY);
        if(sessionUser == null) {
            return false;
        }
        return true;
    }

    public static User getUserFormSession(HttpSession session){
        if (!isLoginUser(session)) {
            return null;
        }
        return (User)session.getAttribute(USER_SESSION_KEY);
    }
}
