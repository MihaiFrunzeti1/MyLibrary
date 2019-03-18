package ro.privatelibrary.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.privatelibrary.library.domain.UserLib;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserLib, String> {

//    List<UserLib> findAllOrderByName();

}
