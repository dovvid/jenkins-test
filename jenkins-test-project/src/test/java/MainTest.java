import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class MainTest {

    @DataProvider
    Object[][] testDataProvider(){
        return new String[][] {new String[]{"Test"},new String[]{""},new String[]{" "},new String[]{"Hello World"}};
    }

    @Test(dataProvider = "testDataProvider")
    void testGenerateMessage(String msg) {
        assertThat(Main.generateGreetingMessage(msg)).isEqualTo(msg);
    }
}
