package com.lddx.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Enumeration ArrayList String[] 容器
        //数组 -- 指定数组大小
        String[] arr1 = new String[3];

        arr1[0] = "a";
        arr1[1] = "b";
        arr1[2] = "c";

        System.out.println(arr1);

        System.out.println(Arrays.toString(arr1));


        //使用for循环将数组的数据取出来 --for

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer a = 3;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a.doubleValue());

//        集合ArrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("3");
        list.add("4");

//        System.out.println(list.get(1));
//        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //方法3：增强版for循环——for each 循环
        //从list
        for (String i :
                list) {
            System.out.println(i);

        }
        //方法4: 使用迭代器Inerator的方式
        //把list中的数据放入迭代器中
        Iterator<String> it = list.iterator();
        /*
         * it.hasNext() 返回booblean类型
         *                   true 表示迭代器中有数据
         *                   false 表示迭代器中没有数据
         *   it。netx() ——> 从迭代器中取数据
         * *///
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
