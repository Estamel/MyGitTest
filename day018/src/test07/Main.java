package test07;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File fin = new File("D:\\测试文件夹\\本地");
        File fout = new File("D:\\测试文件夹\\真云");
        String s = fout.toString();
        int length = fin.toString().length();
        findAndCopy(fin, fout, length, s);
    }

    private static void findAndCopy(File fin, File fout, int length, String s) throws IOException {
        File[] files = fin.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findAndCopy(file, fout, length, s);
                } else if (file.isFile()) {
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                    File fout2 = new File(s + file.getParent().substring(length));
                    if (!fout2.exists()) {
                        System.out.println(fout2);
                        System.out.println(fout2.mkdirs());
                    }
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fout + file.getPath().substring(length)));
                    byte[] bytes = new byte[10240];
                    while (bis.read(bytes) != -1) {
                        bos.write(bytes, 0, bytes.length);
                        bos.flush();
                    }
                    bis.close();
                    bos.close();
                }
            }
        }
    }
}