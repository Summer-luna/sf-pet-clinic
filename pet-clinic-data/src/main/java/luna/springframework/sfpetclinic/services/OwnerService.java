package luna.springframework.sfpetclinic.services;

import luna.springframework.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByFirstName(String firstName);

}
