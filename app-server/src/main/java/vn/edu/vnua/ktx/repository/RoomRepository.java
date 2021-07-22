package vn.edu.vnua.ktx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.vnua.ktx.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
    
}
