package Lesson14;

public class Main3 {
    public static void main(String[] args) {
        StringUtilsImps stringUtil = new StringUtilsImps();


//        int[] index = stringUtil.findWord("хеллоу ворлд бугага бугага бугага ппп, аываывБ гррр", "бугага");
//
//        for (int i: index){
//            System.out.println(i);
//        }

        try {
            double[] d = stringUtil.findNumbers("123.9 123j jkfd 11");
        } catch (Exception e){
            e.printStackTrace();
        }





//        try {
//            d = stringUtil.findNumbers("123 5345 46 dsf340sdf fgd9fg dfg 345");
//        } catch (CustomException e) {
//            e.printStackTrace();
//        }

    }
}
