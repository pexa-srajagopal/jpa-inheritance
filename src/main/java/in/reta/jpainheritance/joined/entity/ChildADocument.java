package in.reta.jpainheritance.joined.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "child_a_document")
@Setter
@Getter
@NoArgsConstructor
public class ChildADocument extends ParentDocument {
    @Column
    private String childAMetaA;
}
