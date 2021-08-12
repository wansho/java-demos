import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author wanshuo
 * @date 2021-07-01 20:21:21
 */
public class FileTest {

    public static void main(String[] args) {

        File dir = new File("C:\\Users\\wanshuo\\Desktop\\passwd\\");
        File[] listFiles = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("userinfo") && name.endsWith("xml");
            }
        });
        Arrays.stream(listFiles).forEach(file -> System.out.println(file.lastModified()));
        Map<Long, File> modifiedTime2FileMap = Arrays.stream(listFiles).collect(Collectors.toMap(File::lastModified, Function.identity()));
        Optional<Long> max = modifiedTime2FileMap.keySet().stream().max((a, b) -> a > b ? 1 : -1);
//        Arrays.stream(listFiles).forEach(file -> System.out.println(file.getName()));
        System.out.println(modifiedTime2FileMap.get(max.get()).getAbsolutePath());


    }
}
