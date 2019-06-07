package stanislav.mikheyev.petclinic.services.map;

import org.springframework.stereotype.Service;
import stanislav.mikheyev.petclinic.model.PetType;
import stanislav.mikheyev.petclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findBytId(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
