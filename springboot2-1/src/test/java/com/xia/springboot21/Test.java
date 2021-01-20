package com.xia.springboot21;

import com.xia.springboot21.entity.Children;
import com.xia.springboot21.entity.Father;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author: xia liang
 * @create: 2021/01/18 15:55
 */
public class Test {
    Children c = new Children();
    @org.junit.Test
    public void test(){
        if(Father.class.isAssignableFrom(Children.class)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        if(c instanceof Father){
            System.out.println("hello children");
        }
    }
    @org.junit.Test
    public void testString(){
        String s = "hello world";
        char[] chars = new char[]{'h','l','l','e','e','o'};
//        s = new String(chars);
        char[] c2 = Arrays.copyOf(chars, 10);
        for (char c : c2){
            System.out.println(c);
        }
//        s = new String(chars);
        char[] chars1 = new char[]{'h','e','l','l','o'};
        String s1 = new String(chars1,1,3);
        byte[] bytes = new byte[]{'0','1','1','0'};
        String s2 = new String(bytes, 1, 3, StandardCharsets.ISO_8859_1);
        String s3 = "hello world2";
        boolean b = s.equals(s3);
        int i = s.compareTo(s3);
        boolean matches = s.regionMatches(1, s3, 1, 7);
        int hashCode = s.hashCode();
        int index = s.indexOf(104);
        int lastIndexOf = s.lastIndexOf(104);
    }
}
