import entity.HtmlNode;
import file.FileHelper;
import org.junit.Before;
import org.junit.Test;

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
public class Constructor {

    private String html;

    @Before
    public void readHtmlContentFromFile() throws IOException {
        html = FileHelper.readFileContent("\"/home/chad/IdeaProjects/JavaUtils/util_test/src/main/resources/test.html");
    }

    @Test
    public void test(){

    }

}
