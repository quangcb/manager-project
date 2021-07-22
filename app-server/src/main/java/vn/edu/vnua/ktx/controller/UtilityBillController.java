package vn.edu.vnua.ktx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.vnua.ktx.model.UtilityBill;
import vn.edu.vnua.ktx.repository.UtilityBillRepository;

public class UtilityBillController {

    @Autowired
    private UtilityBillRepository utilityBillRepository;
}
