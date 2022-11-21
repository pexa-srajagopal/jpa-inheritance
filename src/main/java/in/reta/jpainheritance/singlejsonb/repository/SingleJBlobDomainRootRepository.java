package in.reta.jpainheritance.singlejsonb.repository;

import in.reta.jpainheritance.singlejsonb.entity.DomainRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingleJBlobDomainRootRepository extends JpaRepository<DomainRoot, Long> {
}
