package in.reta.jpainheritance.singlejsonb;

import com.fasterxml.jackson.core.JsonProcessingException;
import in.reta.jpainheritance.singlejsonb.entity.*;
import in.reta.jpainheritance.singlejsonb.repository.SingleJBlobDomainRootRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.List;

@Service
public class SingleJBlobTableService {

    @Autowired
    SingleJBlobDomainRootRepository domainRootRepository;

    public void execute() throws JsonProcessingException {

        StopWatch timeMeasure = new StopWatch();

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
        ChildAMeta childAMeta = new ChildAMeta();
        childAMeta.setChildAMetaA("Child A Meta A");
        childADocument.setMetaDetails(childAMeta);
        childADocument.setPrimaryDocuments(parentDocument);

        ChildBDocument childBDocument = new ChildBDocument();
        childBDocument.setDocumentType("Child B");
        childBDocument.setParentValue("child b parent data");
        ChildBMeta childBMeta = new ChildBMeta();
        childBMeta.setChildBMetaA("Child B Meta A");
        childBDocument.setMetaDetails(childBMeta);
        childBDocument.setPrimaryDocuments(parentDocument);

        domainRoot.getParentDocuments().addAll(List.of(mainDocument, parentDocument, supportingDocument, childADocument, childBDocument));

        timeMeasure.start("Save Task");
        domainRootRepository.save(domainRoot);
        timeMeasure.stop();
        System.out.println(timeMeasure.getLastTaskTimeMillis());

        timeMeasure.start("Read & Process Task");
        domainRootRepository.findAll().forEach(x -> {
            System.out.println(x.getDomainValue());
            x.getParentDocuments().forEach(y -> {
                System.out.println(y.getClass());
                System.out.println(y instanceof ParentDocument);
                System.out.println(y instanceof ChildADocument);
                if (y instanceof ChildADocument) {
                    ChildAMeta childAMetaObj = ((ChildADocument) y).getMetaDetails();
                    System.out.println(childAMetaObj);
                }
                System.out.println(y instanceof ChildBDocument);
                if (y instanceof ChildBDocument) {
                    ChildBMeta childBMetaObj = ((ChildBDocument) y).getMetaDetails();
                    System.out.println(childBMetaObj);
                }
            });
        });
        timeMeasure.stop();
        System.out.println(timeMeasure.getLastTaskTimeMillis());
        System.out.println(timeMeasure.getLastTaskTimeNanos());
    }
}
