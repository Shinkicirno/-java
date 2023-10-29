package heimaCase;

import java.util.Random;

public class code {
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(6));

    }

    public static String createCode(int n){
        String code="";
        String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r =new Random();

        //定义一个循环随机生成每个字符
        for (int i = 0; i < n; i++) {
            //随机一个字符范围内的索引
            int index = r.nextInt(data.length());
            //根据索引去data中提取字符
            code += data.charAt(index);
        }
            return code;
    }
}

