package in.reta.jpainheritance.joined.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "parent_document")
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
@NoArgsConstructor
public class ParentDocument {

    @Id
    @GeneratedValue
    private Long parentId;

    @Column
    private String documentType;

    @Column
    private String parentValue;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "associated_document", joinColumns = @JoinColumn(name = "linked_document_id"), inverseJoinColumns = @JoinColumn(name = "primary_document_id"))
    private ParentDocument primaryDocuments;

}
