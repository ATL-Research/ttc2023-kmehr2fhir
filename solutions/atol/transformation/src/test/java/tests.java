import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import atol.ttc23.transformation.Driver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;



public class tests {
    ResourceSet repo;


    @Test
    void trueistrue(){
        System.out.println("true is true");
        assert(true);  
    }

    // @Test
    // void trueisfalse(){
    //     System.out.println("true is false");
    //     assert(false);  
    // }

    // @Test
    // void TestOne(){
    //     Path sourceRelativePath = Paths.get("../../../../../models/sumehr_example.kmehr");
    //     Path expectedTargetRelativePath = Paths.get("../../../../../models/sumehr_example.fhir");
    //     Path testtargetRelativePath = Paths.get("testout.fhir");
    //     Resource sourceResource, targetResource;


    //     File fKmehr = new File(sourceRelativePath.toAbsolutePath().toString());
	// 	File fFhir = new File(expectedTargetRelativePath.toAbsolutePath().toString());
    //     File resultFhir = new File(testtargetRelativePath.toAbsolutePath().toString());


    //     Driver driver = new Driver(fKmehr, resultFhir);
    //     try{
    //         driver.execute();
    //     } catch (Exception e) {}


    //     sourceResource = repo.getResource(URI.createFileURI(fKmehr.getCanonicalPath()),true);
    //     targetResource = repo.getResource(URI.createFileURI(resultFhir.getCanonicalPath()),true);

    // }
}