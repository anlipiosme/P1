import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.AfterSubscribe;
import pages.PageA1;

public class PageTest extends BaseTest {

    @Test
    public void checkPage(){
        String email = "test@fake.ru";
        PageA1 pageA1 = new PageA1();
        pageA1.makeSubscribe(email);
        AfterSubscribe afterSubscribe = new AfterSubscribe();
        Assert.assertTrue(afterSubscribe.getTitle().contains("Вы подписались"));
        Assert.assertTrue(afterSubscribe.getText().contains("Вы успешно подписались на нашу новостную рассылку."));
    }
}
