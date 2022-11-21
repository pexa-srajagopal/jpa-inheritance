package in.reta.jpainheritance.joined.repository;

import in.reta.jpainheritance.joined.entity.DomainRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRootRepository extends JpaRepository<DomainRoot, Long> {
}
