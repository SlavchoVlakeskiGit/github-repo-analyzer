import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Main <owner/repo>");
            System.out.println("Example: java Main torvalds/linux");
            return;
        }

        String repo = args[0];
        String apiUrl = "https://api.github.com/repos/" + repo;

        try {

            // Fetch JSON from GitHub API
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/vnd.github+json");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Convert response to string
            String json = response.toString();

            // Extract data using helper method
            String stars = extractValue(json, "stargazers_count");
            String forks = extractValue(json, "forks_count");
            String language = extractValue(json, "language");

            // Print repository stats
            System.out.println("Stars: " + stars);
            System.out.println("Forks: " + forks);
            System.out.println("Language: " + language);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Helper method to extract values from JSON
    private static String extractValue(String json, String key) {
        String search = "\"" + key + "\":";
        int start = json.indexOf(search);
        if (start == -1) return "N/A";
        start += search.length();
        int end = json.indexOf(",", start);
        return json.substring(start, end).replace("\"", "").trim();
    }
}