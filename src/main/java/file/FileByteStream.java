package file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-05-31
 */
public class FileByteStream {


    public static void main(String[] args) throws IOException {

        FileByteStream.stringByteStream();;
        FileByteStream.imageFileStream();

    }

    public static void stringByteStream () {
        String textStr = "Hello World";
        byte[] bytes = textStr.getBytes();

        System.out.printf("original plain  text %s  \n", textStr);
        System.out.printf("bytes convert %s  \n", (Object) bytes);
        System.out.printf("bytes format > toString %s  \n", bytes.toString());

        String data = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("byte array decoding = " + data);
    }

    public static void imageFileStream() throws IOException {
        String filePath = "C:\\Users\\Mezzomedia\\Downloads\\urbanbrush-20200528234654335659.jpg";
        byte[] imageBytes = Files.readAllBytes(Paths.get(filePath));

        String  str =  Base64.getEncoder().encodeToString(imageBytes);
        System.out.println(str);

        byte[] imageDecode = Base64.getDecoder().decode(str);


        Files.write(Paths.get("C:\\Users\\Mezzomedia\\Downloads\\ssadasd.jpg"), imageDecode);

    }
}
