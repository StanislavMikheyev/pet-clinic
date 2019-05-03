package stanislav.mikheyev.petclinic.services;

import stanislav.mikheyev.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
