package tests;

import com.ultimatesoftware.aeon.core.testabstraction.product.Aeon;
import com.ultimatesoftware.aeon.extensions.junit5.AeonTestLifecycle;
import main.ESign;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.SAME_THREAD)
@ExtendWith(AeonTestLifecycle.class)
public class BaseTests {

    protected ESign esign;

    @BeforeEach
    void setup(){
        esign = Aeon.launch(ESign.class);
    }

    @AfterEach
    void tearDown(){
        esign.browser.quit();
    }
}
