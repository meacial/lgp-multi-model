package com.string;

/**
 * StringBuilder 3种清空方法比较
 *
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/12/6 17:36
 */
public class StringBuilderT {
    public static void main(String[] args) {
        int cnt = 10000000;
        String pre_del = "stringbuiler_del.test.";
        String pre_new = "stringbuiler_new.test.";
        String pre_set = "stringbuiler_set.test.";

        cleanBySetLength(pre_set, cnt);

        //cleanByDelete(pre_del, cnt);

        //cleanByNewInstance(pre_new, cnt);
    }

    /**
     * 通过每次新建一个StringBuilder实例，实现清空
     * @param pre
     * @param cnt
     */
    private static void cleanByNewInstance(String pre, int cnt) {
        System.out.print("# cleanByNewInstance() \t\t : ");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cnt; i++) {
            StringBuilder sb = new StringBuilder(String.format("%s%s", pre, cnt));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    /**
     * 通过StringBuilder的delete方法实现清空
     * @param pre
     * @param cnt
     */
    private static void cleanByDelete(String pre, int cnt) {
        System.out.print("# cleanByDelete() \t\t : ");
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            sb.delete(0, sb.length());
            sb.append(String.format("%s%s", pre, cnt));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    /**
     * 通过setLength情况StringBuilder
     * @param pre
     * @param cnt
     */
    private static void cleanBySetLength(String pre, int cnt) {
        System.out.print("# cleanBySetLength() \t\t : ");
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            sb.setLength(0);
            sb.append(String.format("%s%s", pre, cnt));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
