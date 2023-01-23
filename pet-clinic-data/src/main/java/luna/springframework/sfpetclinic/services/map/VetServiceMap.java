package luna.springframework.sfpetclinic.services.map;

import luna.springframework.sfpetclinic.model.Vet;
import luna.springframework.sfpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void save(Vet object) {
        super.save(object, object.getId());
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
