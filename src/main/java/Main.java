import lombok.Cleanup;

import java.io.*;

public class Main {
    public static void main(String[] args) {
      
        Player player1 = Player.builder().age1(1)
                .age(5)
                .name("Siema")
                .name3("Witaj")
                .name1("takietam")
                .age2(53).build();

        @Cleanup
        InputStream in = null;

        try {
          in = new FileInputStream(new File("tutaj_sciezka_do_pliku"));
          //in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}