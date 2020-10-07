import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @ClassName:
 * @Description
 * @Authors Chad li
 * @CreateDate: 2020/10/6
 * @UpdateUser: 更新者
 * @UpdateDate 2020/10/6
 * @UpdateDescription: 更新描述
 * @Version 1.0
 **/
public class RegexExtractor {


    @Test
    public void test(){
        String url = "    (9200)  更新日期：2019-06-08 ";
        Pattern pattern = compile(".*更新日期：(\\d*-\\d*-\\d*).*");
        Matcher matcher=pattern.matcher(url);

        while(matcher.find()){
            String pageNum =  matcher.group(1);
            System.out.println(matcher.group(1));
            System.out.println(url.replaceFirst("reqPageNum=\\d*","reqPageNum=" + (Integer.parseInt(pageNum) + 1)));
        }

    }
}
