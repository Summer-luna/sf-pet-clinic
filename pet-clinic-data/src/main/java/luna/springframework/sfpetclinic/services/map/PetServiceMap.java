package luna.springframework.sfpetclinic.services.map;

import luna.springframework.sfpetclinic.model.Pet;
import luna.springframework.sfpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object, Long id) {
        return super.save(object, object.getId());
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
