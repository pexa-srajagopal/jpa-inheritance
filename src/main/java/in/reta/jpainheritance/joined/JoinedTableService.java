package in.reta.jpainheritance.joined;

import in.reta.jpainheritance.joined.entity.ChildADocument;
import in.reta.jpainheritance.joined.entity.ChildBDocument;
import in.reta.jpainheritance.joined.entity.DomainRoot;
import in.reta.jpainheritance.joined.entity.ParentDocument;
import in.reta.jpainheritance.joined.repository.DomainRootRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinedTableService {

    @Autowired
    DomainRootRepository domainRootRepository;

    public void execute() {
        DomainRoot domainRoot = new DomainRoot();
        domainRoot.setDomainValue("domain data");

        ParentDocument mainDocument = new ParentDocument();
        mainDocument.setDocumentType("Application");
        mainDocument.setParentValue("Application data");

        ParentDocument parentDocument = new ParentDocument();
        parentDocument.setDocumentType("Correspondence");
        parentDocument.setParentValue("Correspondence data");

        ParentDocument supportingDocument = new ParentDocument();
        supportingDocument.setDocumentType("Supporting");
        supportingDocument.setParentValue("Supporting data");
        supportingDocument.setPrimaryDocuments(parentDocument);

        ChildADocument childADocument = new ChildADocument();
        childADocument.setDocumentType("Child A");
        childADocument.setParentValue("child a parent data");
        childADocument.setChildAMetaA("child a meta data a");
        childADocument.setPrimaryDocuments(parentDocument);

        ChildBDocument childBDocument = new ChildBDocument();
        childBDocument.setDocumentType("Child B");
        childBDocument.setParentValue("child b parent data");
        childBDocument.setChildBMetaA("child b meta data a");
        childBDocument.setPrimaryDocuments(parentDocument);

        domainRoot.getParentDocuments().addAll(List.of(mainDocument, parentDocument, supportingDocument, childADocument, childBDocument));

        domainRootRepository.save(domainRoot);

        domainRootRepository.findAll().forEach(x -> {
            System.out.println(x.getDomainValue());
            x.getParentDocuments().forEach(y -> {
                System.out.println(y.getClass());
                System.out.println(y instanceof ParentDocument);
                System.out.println(y instanceof ChildADocument);
                System.out.println(y instanceof ChildBDocument);
            });
        });
    }
}
