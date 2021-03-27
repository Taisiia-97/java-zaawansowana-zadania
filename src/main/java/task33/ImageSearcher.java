package task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface ImageSearcher {

    List<File> getImages(Path path) throws IOException;
}
