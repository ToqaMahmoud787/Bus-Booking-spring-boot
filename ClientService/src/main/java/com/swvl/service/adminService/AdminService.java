package com.swvl.service.adminService;

import com.swvl.exception.AdminException;
import com.swvl.model.Admin;

public interface AdminService {
    public Admin createAdmin(Admin admin) throws AdminException;
    public Admin updateAdmin(Admin admin, String key) throws AdminException;
}
