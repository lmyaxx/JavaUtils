import java.util.LinkedList;
import java.util.List;

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
public class Page {

    /**
     *  将一个list拆分size大小限制为limit的多个list
     * @param list   被拆分list
     * @param limit  拆分后单个list的size限制
     * @param <T>   对象类型
     * @return  拆分后的size伟大为limit的list的list
     */
    public <T> List<List<T>> splitListByLimit(List<T> list, int limit){
        int total = list.size();
        List<List<T>> result = new LinkedList<List<T>>();
        for(int low = 0 ; low < total ; ){
            int top = low + limit;
            result.add(list.subList(low,Math.min(top,total)));
        }
        return result;
    }
}
