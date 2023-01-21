package luna.springframework.sfpetclinic.services;

import luna.springframework.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByFirstName(String firstName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
