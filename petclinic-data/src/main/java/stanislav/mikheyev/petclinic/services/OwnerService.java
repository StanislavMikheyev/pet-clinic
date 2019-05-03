package stanislav.mikheyev.petclinic.services;

import stanislav.mikheyev.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
