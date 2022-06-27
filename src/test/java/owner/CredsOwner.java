package owner;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:creds.properties"})
    public interface CredsOwner extends Config {
        String login();
        String password();

    }

