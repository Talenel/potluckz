package com.example.potluck;

/**
 * Created by student on 6/21/17.
 */
import com.example.potluck.models.Signup;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SignupRepository extends CrudRepository<Signup, String> {

}
