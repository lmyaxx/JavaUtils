import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName:
 * @Description
 * @Authors Chad li
 * @CreateDate: 2020/1/9
 * @UpdateUser: 更新者
 * @UpdateDate 2020/1/9
 * @UpdateDescription: 更新描述
 * @Version 1.0
 **/
public class CodeConverter {

    public String unicodeToUtf8 (String s) throws UnsupportedEncodingException {
        return new String( s.getBytes("utf-8") , "utf-8");
    }
    public String unicodeToGBK (String s) throws UnsupportedEncodingException {
        return new String( s.getBytes("GBK") , "GBK");
    }

    @Test
    public void test_convert() throws UnsupportedEncodingException {
        String ss = "中文";
        ss = unicodeToGBK(ss);
        System.out.println(ss);
    }

}
