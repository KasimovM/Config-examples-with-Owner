package gmail.mrkvktrvch.config_tests;

import gmail.mrkvktrvch.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiConfigTest {

    @Test
    public void apiConfigTest() {

        System.getProperty("token");

        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(apiConfig.baseUrl()).isEqualTo("https://github.com/KasimovM");
        assertThat(apiConfig.token()).isEqualTo("1337");
    }
}