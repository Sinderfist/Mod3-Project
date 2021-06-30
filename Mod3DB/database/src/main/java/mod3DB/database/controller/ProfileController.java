package mod3DB.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import mod3DB.database.model.Profile;
import mod3DB.database.service.ProfileService;



@CrossOrigin
@RestController
@RequestMapping("/facespace")
public class ProfileController {
	
	@Autowired
	ProfileService ProfileService;
	
	@GetMapping
	public Iterable<Profile> getProfile(){
		return ProfileService.getProfile();
	}
	
	@GetMapping("/{id}")
	public Profile getProfileById(Long id) {
		return ProfileService.getProfileById(id);
	}
	
	@PostMapping
	public Profile createProfile(@RequestBody Profile data){
		return ProfileService.createProfile(data);
	}

	@PutMapping
	public Profile updateProfile(@RequestBody Profile data) {
		return ProfileService.updateProfile(data);
		
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteProfile(@PathVariable Long id) {
		return ProfileService.deleteProfile(id);
	}
	
}
