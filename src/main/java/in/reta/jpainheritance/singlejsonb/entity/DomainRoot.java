package in.reta.jpainheritance.singlejsonb.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "single_js_domain_root")
@Table(name = "single_js_domain_root")
@Setter
@Getter
@NoArgsConstructor
public class DomainRoot {

    @Id
    @GeneratedValue
    private Long domainRootId;

    @Column
    private String domainValue;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ParentDocument> parentDocuments = new ArrayList<>();

}
