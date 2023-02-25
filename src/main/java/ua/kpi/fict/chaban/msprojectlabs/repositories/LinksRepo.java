package ua.kpi.fict.chaban.msprojectlabs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.kpi.fict.chaban.msprojectlabs.entities.Links;

@Repository
public interface LinksRepo extends JpaRepository<Links, Long> {
}

