import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@@ -20,6 +21,7 @@
import jakarta.annotation.PostConstruct;

@Component
@Profile("dev")
public class DatabaseSeeder {

    @Autowired