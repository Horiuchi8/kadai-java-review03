package Javaapis.collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class HashSample {

    public static void main(String[] args) {
        //初期化
        HashSet<String> set = new HashSet<String>();

        //都道府県を追加
        set.add("東京都");
        set.add("大阪府");
        set.add("北海道");
        set.add("広島県");
        set.add("北海道");

        //全ての要素を出力
        for(String str : set) {
            System.out.println(str);
        }

        //広島県が含まれているか
        if(set.contains("広島県")){
            System.out.println("広島県に行ったことがある");
        }else {
            System.out.println("広島県に行ったことがない");
        }

        //群馬県が含まれているか
        if(set.contains("群馬県")){
            System.out.println("群馬県に行ったことがある");
        }else {
            System.out.println("群馬県に行ったことがない");
        }

        //北海道を削除
        set.remove("北海道");

        //全ての要素を出力
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String item = (String)iterator.next();
            System.out.println(item);
            }
    }
}
