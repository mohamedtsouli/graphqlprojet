package org.sid.devoir.service;
import org.sid.devoir.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO saveComputer(ComputerDTO ComputerDto);

    public boolean deleteComputer(Long id);

    public List<ComputerDTO> getComputerByProce(String proce);

    public List<ComputerDTO> saveComputers(List<ComputerDTO> ComputerDTOs);

}
