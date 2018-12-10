package cn.com.cpy.leetcode;

/**
 * HashMap的hash方法测试
 *
 * @author chenpanyu
 * @version 1.0
 * @since 18-11-2 上午10:30
 */
public class Hash {

    public static void main(String[] args) {
        hash("333");
    }

    private static int hash(Object k) {
        int h = 0;
        //得到k的hashcode值
        System.out.println(Integer.toBinaryString(k.hashCode()));
        h ^= k.hashCode();
        System.out.println(Integer.toBinaryString(h));
        System.out.println(Integer.toBinaryString(h >>> 20));
        System.out.println(Integer.toBinaryString(h >>> 12));
        System.out.println(Integer.toBinaryString((h >>> 20) ^ (h >>> 12)));
        //进行计算
        h ^= (h >>> 20) ^ (h >>> 12);
        System.out.println(Integer.toBinaryString(h));
        System.out.println(Integer.toBinaryString(h >>> 7));
        System.out.println(Integer.toBinaryString(h >>> 4));
        System.out.println(Integer.toBinaryString((h >>> 7) ^ (h >>> 4)));
        h ^= (h >>> 7) ^ (h >>> 4);
        System.out.println(Integer.toBinaryString(h));
        return h;
    }
}


