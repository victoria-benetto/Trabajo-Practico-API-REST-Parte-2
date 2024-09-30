package com.example.inicial1.dtos;



import com.example.inicial1.entities.Persona;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class PersonaDto {

    private Long id;
    private String nombre;
    private String apellido;

    /*public List<PersonaDto> findAll() throws Exception{
        try{
            List<Persona> entities = baseRepository.findAll();
            List<PersonaDto> dtos = new ArrayList<>();
            ModelMapper modelMapper = new ModelMapper();
            for(Persona persona: entities){
                dtos.add(modelMapper.map(persona, PersonaDto.class));
            }
            return dtos;
        } catch (Exception e){

        }
    }*/
}
