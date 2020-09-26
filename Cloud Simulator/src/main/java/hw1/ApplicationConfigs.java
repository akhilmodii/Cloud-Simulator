package hw1;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ApplicationConfigs {
    public static final Config cloudServiceConfig = ConfigFactory.load("Application.conf");
    public static final Config applicationconfig = ConfigFactory.load();
}
