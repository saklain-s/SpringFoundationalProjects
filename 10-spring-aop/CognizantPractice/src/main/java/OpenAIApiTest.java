import java.io.OutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class OpenAIApiTest {
    public static void main(String[] args) {
        // Replace with your actual OpenAI API key
        // String apiKey = "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";
        String apiKey = "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";

        try {
            String endpoint = "https://api.openai.com/v1/chat/completions";

            // JSON body for the request
            String jsonInput = "{\n" +
                    "  \"model\": \"gpt-3.5-turbo\",\n" +
                    "  \"messages\": [\n" +
                    "    {\"role\": \"user\", \"content\": \"What's the time now?\"}\n" +
                    "  ]\n" +
                    "}";

            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Authorization", "Bearer " + apiKey);
            conn.setDoOutput(true);

            // Send the JSON request body
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInput.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Read response
            int status = conn.getResponseCode();
            InputStream responseStream = (status < HttpURLConnection.HTTP_BAD_REQUEST)
                    ? conn.getInputStream()
                    : conn.getErrorStream();

            Scanner sc = new Scanner(responseStream, "UTF-8");
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
