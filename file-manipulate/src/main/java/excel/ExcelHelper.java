package excel;

public class ExcelHelper {

    public static void createExcel(){

//        XSSFWorkbook wb = new XSSFWorkbook();
//        XSSFSheet sheet = wb.createSheet();
//        XSSFRow row = sheet.createRow(0);
//        XSSFCell cell = row.createCell( 0);
//        cell.setCellValue("custom XSSF colors");
//        XSSFCellStyle style1 = wb.createCellStyle();
//        style1.setFillForegroundColor(new XSSFColor(new java.awt.Color(128, 0, 128), new DefaultIndexedColorMap()));
//        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    }
    public int minOperations(String[] logs) {
        int res = 0;
        for(String log: logs){
            if(log.startsWith("../")){
                if(res>0){
                    res--;
                }
            }else if(log.startsWith("./")){

            }else{
                res ++;
            }
        }
        return res;
    }

    public int maximumRequests(int n, int[][] requests) {
        int[] count = new int[n];
        int len = requests.length;
        int total = (1<< len) -1;
        for(int cur = total; cur >= 0; cur =  (cur - 1) ){

        }
        return 0;
    }

    private boolean isValid(int n, int[][] nums){
        return false;
    }
}
