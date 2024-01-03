package Javaapis.collection.list;

import java.util.HashMap;

public class HashMapSample {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();

        //HashMapにキーと値を追加
        hm.put("GK","川島");
        hm.put("DF","吉田");
        hm.put("MF","久保");
        hm.put("GK","浅野");

        //キーを指定して値を取得
        String member = hm.get("FM");
        System.out.println(member);

        //サイズを確認する
        int size = hm.size();
        System.out.println(size);

        //全部出力する
        for(String key : hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }
    }


}
