import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atol.ttc23.transformation.Kmehr;
import atol.ttc23.transformation.Kmehr2Fhir;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrFactory;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;

import org.eclipse.papyrus.aof.core.IBox;


public class TestKmehr2Fhir {
    Kmehr2Fhir transfo;
    DocumentRoot source;
    FolderType fldr;
    PersonType pat;

    @Test
    void TestOne(){
        transfo = new Kmehr2Fhir();
        var fldr = KmehrFactory.eINSTANCE.createFolderType();
        var pat = KmehrFactory.eINSTANCE.createPersonType();
        pat.setFamilyname("notnull");
        fldr.setPatient(pat);

        var result = transfo.Folder(fldr).t;
        assertEquals(pat.getFamilyname(), result.getEntry().get(0).getResource().getPatient().getName().get(0).getFamily().getValue());
    }

}