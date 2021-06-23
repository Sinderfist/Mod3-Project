package mod3DB.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import mod3DB.database.model.Profile;
import mod3DB.database.repository.ProfileRepository;

@Service
public class ProfileService {
	@Autowired
	private ProfileRepository ProfileRepository;
	
	public Iterable<Profile> getProfile(){
		return this.ProfileRepository.findAll();			
	}
	
	public Profile getProfileById(Long id) {
		return ProfileRepository.findById(id).get();
	}
	
	public Profile createProfile(Profile data) {
		return ProfileRepository.save(data);
	}
	
	public Profile updateProfile(Profile data) {
		return ProfileRepository.save(data);
	}
	
	public HttpStatus deleteProfile(Long id) {
		ProfileRepository.deleteById(id);
		return HttpStatus.OK;
	}
}
