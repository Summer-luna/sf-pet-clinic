package luna.springframework.sfpetclinic.services;

import luna.springframework.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
