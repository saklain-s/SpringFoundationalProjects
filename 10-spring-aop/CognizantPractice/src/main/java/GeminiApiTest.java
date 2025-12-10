import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GeminiApiTest {
    public static void main(String[] args) {
        // Replace with your real API key
        String apiKey = "AIzaSyB4cgrkW7QVKuE1mWYPRVm1_znqEUYG4OM";

        try {
            // API endpoint
            String endpoint = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=" + apiKey;

            // JSON body
            String jsonInput = "{\n" +
                    "  \"contents\": [\n" +
                    "    {\n" +
                    "      \"parts\": [\n" +
                    "        {\n" +
                    "          \"text\": \"Hi\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}";

            // Open connection
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setDoOutput(true);

            // Send request
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInput.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Read response
            int status = conn.getResponseCode();
            Scanner sc = new Scanner(conn.getInputStream(), "UTF-8");
            StringBuilder response = new StringBuilder();
            while (sc.hasNextLine()) {
                response.append(sc.nextLine());
            }
            sc.close();

            System.out.println("Status: " + status);
            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
