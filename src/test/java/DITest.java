import com.cetiti.Application;
import com.cetiti.service.AnotherServieceImpl;
import com.cetiti.service.CommonService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by zsh7040 on 2017-11-8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DITest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


    @Autowired
    @Qualifier("generateCommonService")
    private AnotherServieceImpl anotherService;

    @Autowired
    private CommonService service;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }


    @Test
    public void anotherService(){
        anotherService.hello();
        assertEquals("AnotherServieceImpl\r\n", outContent.toString());
    }

    @Test
    public void primaryService(){
        service.hello();
        assertEquals("PrimaryServiceImpl\r\n", outContent.toString());
    }


}
