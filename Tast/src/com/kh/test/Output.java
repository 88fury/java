
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output {

    public static void main(String[] args) {

        FileWriter fw1 = null;
        FileWriter fw2 = null;
        FileWriter fw3 = null;

        try {
            fw1 = new FileWriter("test.txt");
            fw1.write(97);

            fw2 = new FileWriter("D:\\test.txt");
            fw2.write(65);

            File tmpFolder = new File("D:\\tmp");
            tmpFolder.mkdir();

            File tmpFile = new File("D:\\tmp\\test.txt");
            tmpFile.createNewFile();

            File folder = new File("parent");
            folder.mkdir();

            File personFile = new File("parent\\person.txt");
            personFile.createNewFile();

            System.out.println("파일명 : " + personFile.getName());
            System.out.println("절대경로 : " + personFile.getAbsolutePath());
            System.out.println("파일용량 : " + personFile.length());
            System.out.println("상위폴더 : " + personFile.getParent());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw1 != null) {
                    fw1.close();
                }
                if (fw2 != null) {
                    fw2.close();
                }
                if (fw3 != null) {
                    fw3.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
