package luna.springframework.sfpetclinic.services;

import luna.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByFirstName(String firstName);

}
