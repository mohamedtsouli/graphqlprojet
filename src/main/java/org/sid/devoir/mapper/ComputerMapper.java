package org.sid.devoir.mapper;


import org.modelmapper.ModelMapper;
import org.sid.devoir.dao.entities.Computer;
import org.sid.devoir.dto.ComputerDTO;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDTO ComputerDto){
        return mapper.map(ComputerDto, Computer.class);
    }

    public ComputerDTO fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDTO.class);
    }

}