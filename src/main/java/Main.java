import lombok.Cleanup;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setAge(5);
        player.setName("Oskar");
        System.out.println(player.toString());





        try {
            @Cleanup
            InputStream in = new FileInputStream(new File("tutaj_sciezka_do_pliku"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
             e.printStackTrace();
        }

    }
}