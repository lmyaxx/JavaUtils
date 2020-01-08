package file;
import java.io.*;

/**
 * @ClassName:
 * @Description
 * @Authors Chad li
 * @CreateDate: 2020/1/8
 * @UpdateUser: 更新者
 * @UpdateDate 2020/1/8
 * @UpdateDescription: 更新描述
 * @Version 1.0
 **/
public class FileHelper {

    public static void saveAsFileWriter(String content, String filePath) throws IOException {
        FileWriter fwriter = null;
        try {
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
            fwriter = new FileWriter(filePath, true);
            fwriter.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static String readFileContent(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String content = "";
        StringBuilder sb = new StringBuilder();
        while(content != null){
            content = bf.readLine();
            if(content == null){
                break;
            }
            sb.append(content);
        }
        bf.close();
        return sb.toString();
    }
}