package entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class HtmlNode {
    private String label;
    private Map<String, String> properties;
    private List<HtmlNode> children;
    private HtmlNode parent;
    private String content;

    public String getAbsPath(){
        return null;
    }

    /**
     * 第一步：去掉外围部分　将
     * <html class='bg' href='www.baidu.com'>
     *     哈哈哈
     *     <div></div>
     * </html>
     * @param html
     */
    public HtmlNode(String html){
        html = html.trim();
        int start = 0, end = html.length();
        StringBuilder rawProperties = new StringBuilder();
        boolean canAdd = false;
        //假设html中不存在非法的<或者>
        for( ; start <= end; start++){
            if(canAdd){
                rawProperties.append(html.charAt(start));
            }
            if(html.charAt(start)=='<'){
                canAdd = true;
            }
            if(html.charAt(start)=='>'){
                start++;
                break;
            }
        }
        while(end>=start){
            if(html.charAt(end-1)=='<'&&html.charAt(end)=='/'){
                end = end - 2;
                break;
            }
            end --;
        }


    }

}
