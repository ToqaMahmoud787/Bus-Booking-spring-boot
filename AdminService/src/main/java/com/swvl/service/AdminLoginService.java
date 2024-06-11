package com.swvl.service;

import com.swvl.exception.AdminException;
import com.swvl.exception.LoginException;
import com.swvl.model.dto.AdminLoginDTO;
import com.swvl.model.CurrentAdminSession;

public interface AdminLoginService {
    public CurrentAdminSession adminLogin(AdminLoginDTO loginDTO) throws LoginException, AdminException;
    public String adminLogout(String key) throws LoginException;
}
