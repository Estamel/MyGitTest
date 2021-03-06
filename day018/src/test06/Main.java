package test06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File fin = new File("D:\\测试文件夹\\本地");
        File fout = new File("D:\\测试文件夹\\真云");
        findAndCopy(fin, fout);
    }

    private static void findAndCopy(File fin, File fout) throws IOException {
        File[] files = fin.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                findAndCopy(file, fout);
            } else if (file.isFile()) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                File fout2 = new File("D:\\测试文件夹\\真云" + file.getPath().substring(11).replaceFirst(file.getName(), ""));
                File absoluteFile = fout2.getAbsoluteFile();
                if (!absoluteFile.exists()) {
                    System.out.println(file.getName());
                    System.out.println(fout2);
                    fout2.mkdirs();
                }
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fout + file.getPath().substring(11)));
                byte[] bytes = new byte[1024];
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
//+"\\"+file.getPath().substring(11))