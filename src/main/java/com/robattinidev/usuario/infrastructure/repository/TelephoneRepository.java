package com.robattinidev.usuario.infrastructure.repository;


import com.robattinidev.usuario.infrastructure.entity.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone, Long> {
}
