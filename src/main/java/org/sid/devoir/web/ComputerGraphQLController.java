package org.sid.devoir.web;

import lombok.AllArgsConstructor;
import org.sid.devoir.dto.ComputerDTO;
import org.sid.devoir.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    @Autowired
    private ComputerService computerService ;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computer){
        return computerService.saveComputer(computer);
    }

    @MutationMapping
    public Boolean deleteComputer(@Argument Long id){
        return computerService.deleteComputer(id);
    }


    @QueryMapping
    public List<ComputerDTO> getComputerByModel(@Argument String model){
        return computerService.getComputerByModel(model);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument double proce){
        return computerService.getComputerByProce(proce);
    }
}