package in.reta.jpainheritance.singlejsonb.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "single_js_child_a_document")
@Table(name = "single_js_child_a_document")
@Setter
@Getter
@NoArgsConstructor
public class ChildADocument extends ParentDocument {

    @Type(type = "json")
    @Column(columnDefinition = "jsonb")
    private ChildAMeta metaDetails;
}
