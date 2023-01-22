package luna.springframework.sfpetclinic.services.map;

import luna.springframework.sfpetclinic.model.Vet;
import luna.springframework.sfpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }
}
