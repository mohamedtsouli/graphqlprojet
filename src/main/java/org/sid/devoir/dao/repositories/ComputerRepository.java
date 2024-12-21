package org.sid.devoir.dao.repositories;

import org.sid.devoir.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

        public List<Computer> findByProce(String proce);

        }
