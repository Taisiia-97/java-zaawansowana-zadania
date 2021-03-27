package task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        ImageSearcher imageSearcher = path1 -> {

            try (Stream<Path> walk = Files.walk(path1)) {
                return walk.map(path -> path.toFile())
                        .filter(image -> image.getName().endsWith(".png") || image.getName().endsWith(".jpg"))
                        .collect(Collectors.toList());
            }
        };

        Path path = Paths.get("src", "main", "resources", "zad33");

        List<File> images = imageSearcher.getImages(path);
        System.out.println(images);
    }

}
