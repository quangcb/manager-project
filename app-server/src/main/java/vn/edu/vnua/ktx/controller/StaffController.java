package vn.edu.vnua.ktx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.vnua.ktx.model.Staff;
import vn.edu.vnua.ktx.repository.StaffRepository;

public class StaffController {

    @Autowired
    private StaffRepository staffRepository;
}
