package com.swvl.service.userService;

import com.swvl.exception.LoginException;
import com.swvl.model.CurrentUserSession;
import com.swvl.model.dto.UserLoginDTO;

public interface UserLoginService {
    public CurrentUserSession userLogin(UserLoginDTO userLoginDTO) throws LoginException;
    public String userLogout(String key) throws LoginException;
}
