package ru.gb.lsn5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        saveFile();
        readFiel();
        backup();
    }

    private static void saveFile() throws IOException {
        int[] ar2 = {0,1,2,3,0,1,2,3,0};

        FileOutputStream outFile = new FileOutputStream("save.txt");
        /**
         * 0 - 0
         * 1 - 1
         * 2 - 10
         * 3 - 11
         */
        for (int i = 0; i < 3; i++) { // кажая группа значений будет длиной 1 байт. Всего групп 3.
            byte oneByte = 0;// значение группы по умолчанию - 0
            for (int j = 0; j < 3; j++) { //  запишем все 3 числа в один байт
                /**
                 * для кажого последующего числа будем использовать смещение на 2 бита
                 * для певрого числа смещение = 0, далее 2, для последнего числа в группе - 4
                 *
                 */
                oneByte += (byte) (ar2[3 * i + j] << (j * 2));

            }
            outFile.write(oneByte);
        }

        outFile.flush();
        outFile.close();

    }

    private static void readFiel() throws IOException {
        int[] ar20 = new int[9];
        FileInputStream fis = new FileInputStream("save.txt");
        int a;
        int i = 0;
        while ((a = fis.read()) != -1) {
            for (int b = 0; b < 3; ++b) {
                ar20[i++] = a >> (b * 2) & 0x3;
                }
            }
        fis.close();

        System.out.println(Arrays.toString(ar20));
    }

private static void backup() throws IOException {
    Files.createDirectory(Path.of("./backup"));
    DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
    for (Path file : dir) {
        if (Files.isDirectory(file)) continue;
        Files.copy(file, Path.of("./backup/" + file.toString()));
        }

}

}
