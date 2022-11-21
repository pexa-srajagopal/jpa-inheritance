package in.reta.jpainheritance.singlejsonb.entity;


import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity(name = "single_js_parent_document")
@Table(name = "single_js_parent_document")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@TypeDef(
        name = "json",
        typeClass = JsonBinaryType.class
)
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
    @JoinTable(name = "single_js_associated_document", joinColumns = @JoinColumn(name = "linked_document_id"), inverseJoinColumns = @JoinColumn(name = "primary_document_id"))
    private ParentDocument primaryDocuments;

}
