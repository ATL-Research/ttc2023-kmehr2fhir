import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class tests {
    @Test
    void trueistrue(){
        System.out.println("true is true");
        assert(true);  
    }

        @Test
    void trueisfalse(){
        System.out.println("true is false");
        assert(false);  
    }
}
