import lombok.Cleanup;
import template.Book;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSV {
    public static CSV csv = new CSV();
    public static CSV getCsv(){
        return csv;
    }
    public CSVReader csvReader = new CSVReader("src/main/resources/text.csv");

    class CSVReader {
        private final File file;

        public CSVReader(File file) {
            this.file = file;
        }

        public CSVReader(String filePath) {
            this(new File(filePath));
        }

        public String readHeader() throws IOException {
            @Cleanup
            InputStream inputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(inputStream);
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }
            return null;
        }

        public List<Book> readData() throws IOException {
            @Cleanup
            InputStream inputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(inputStream);
            List<Book> books = new ArrayList<>();
            if (scanner.hasNextLine())
                scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                List<String> book = Arrays.stream(line.split(", ")).toList();
            }

            return books;
        }

    }
}
