package mod3DB.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mod3DB.database.model.Profile;


@Repository 
public interface ProfileRepository extends CrudRepository<Profile, Long>{

}
