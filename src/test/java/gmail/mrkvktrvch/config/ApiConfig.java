package gmail.mrkvktrvch.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:token.properties")

public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com/KasimovM")
    String baseUrl();

    @Key("token")
    String token();
}