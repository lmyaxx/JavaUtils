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
        System.out.println("http://m.xitongjia.com/zhuanti/mfwzwp/".matches("http://m.xitongjia.com/"+"[moblist|zhuanti].*"));
    }

    public static String extractInfo(String raw, String pattern){
        if(raw==null){
            return null;
        }
        Pattern p = compile(pattern);
        Matcher matcher = p.matcher(raw);
        if(matcher.find()){
            return matcher.group(1);
        }
        return null;
    }
}
