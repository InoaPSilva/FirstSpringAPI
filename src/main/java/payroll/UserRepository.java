package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inoapsilva.iplsapi.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

	
	
}
