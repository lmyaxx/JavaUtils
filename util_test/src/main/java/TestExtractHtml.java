import file.FileHelper;
import org.junit.Test;
import us.codecraft.webmagic.selector.Html;

import java.io.IOException;

/**
 * @ClassName:
 * @Description
 * @Authors Chad li
 * @CreateDate: 2020/10/8
 * @UpdateUser: 更新者
 * @UpdateDate 2020/10/8
 * @UpdateDescription: 更新描述
 * @Version 1.0
 **/
public class TestExtractHtml {
    @Test
    public void test() throws IOException {

        String content =  FileHelper.readFileContent("/home/chad/IdeaProjects/JavaUtils/util_test/src/main/resources/test.html");
        Html html  = Html.create(content);
        System.out.println();
    }
}
