package Examples;

import java.util.Arrays;
import java.util.List;

public class StringsExamples {
    public String parse(String userDetails) {
        List<String> user = Arrays.asList(userDetails.split(":"));
        String username = user.get(0);
        username.trim();
        username.contains("c");
        return "ok";
    }
}
