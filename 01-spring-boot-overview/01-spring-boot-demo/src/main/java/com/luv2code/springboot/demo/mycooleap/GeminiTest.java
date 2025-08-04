package com.luv2code.springboot.demo.mycooleap;

import okhttp3.*;
import java.io.IOException;

public class GeminiTest {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        // Replace with your actual Gemini API key
        String apiKey = "AIzaSyDk67v7vhEEyhVkEmG49_uFTnvLSSlogwo";
        String url = "https://generativelanguage.googleapis.com/v1/models/gemini-1.5-pro:generateContent?key=" + apiKey;

        MediaType mediaType = MediaType.parse("application/json");
        String jsonBody = """
        {
          "contents": [
            {
              "parts": [
                {
                  "text": "Explain how AI works in a few words"
                }
              ]
            }
          ]
        }
        """;

        RequestBody body = RequestBody.create(mediaType, jsonBody);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            if (response.code() == 429) {
                System.out.println("Rate limit hit. Try again later.");
            }

            System.out.println(response.body().string());
        }

    }
}
