package org.sid.devoir.service;

import org.sid.devoir.dao.entities.Computer;
import org.sid.devoir.dao.repositories.ComputerRepository;
import org.sid.devoir.dto.ComputerDTO;
import org.sid.devoir.mapper.ComputerMapper;

import java.util.ArrayList;
import java.util.List;

public class ComputerManager implements ComputerService {
    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDTO);
        computer = ComputerRepository.save(computer);
        ComputerDTO = computerMapper.fromComputerDtoToComputer(computer);
        return computerDTO;


        //return computerMapper.from computerTo computerDTO(computerRepository.save(computerMapper.fromcomputerDTOTocomputer(computerDTO)));
    }

    @Override
    public boolean deleteComputer(Long id) {
        try {
            computerRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOs = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOs.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDTOs;
    }



    @Override
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS) {

        List<Computer> computers = new ArrayList<>();
        for (Computer computerDTO : computers) {
            computers.add(computerMapper.fromComputerDtoToComputer(computerDTO));
        }

        computers = computerRepository.saveAll(computers);

        computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDTOS;
    }
}
