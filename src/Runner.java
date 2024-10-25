import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Runner {
    public static void main(String[] args) {
        String username = "";
        if (args.length > 0) {
            username = args[0];
            System.out.println("Username = " +username);
        }else{
            System.out.println("No Username provided! Please enter a username.");
        }

        String baseURL = "https://api.github.com/";
        String apiURL = baseURL + username + "/events";

        try {
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/vnd.github.v3+json");
            int code = con.getResponseCode();

            if (code == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
