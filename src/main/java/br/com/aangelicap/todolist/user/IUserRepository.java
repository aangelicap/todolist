package br.com.aangelicap.todolist.user;

import java.util.UUID;


public interface IUserRepository 
    extends org.springframework.data.jpa.repository.JpaRepository<UserModel, UUID> {

    

    
}
