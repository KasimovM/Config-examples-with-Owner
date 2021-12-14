package gmail.mrkvktrvch.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${environment}.properties")

public interface WebConfig extends Config {

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();
}
