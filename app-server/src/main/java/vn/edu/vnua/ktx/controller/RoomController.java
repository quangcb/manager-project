package vn.edu.vnua.ktx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.vnua.ktx.model.Room;
import vn.edu.vnua.ktx.repository.RoomRepository;

public class RoomController {
    
    @Autowired
    private RoomRepository roomRepository;
}
