package workshop.superheroes.hero;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class HeroApplicationLifeCycle {
    public static final Logger LOGGER = Logger.getLogger(HeroApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev){
        LOGGER.info("  _   _                      _    ____ ___ ");
        LOGGER.info(" | | | | ___ _ __ ___       / \\  |  _ \\_ _|");
        LOGGER.info(" | |_| |/ _ \\ '__/ _ \\     / _ \\ | |_) | | ");
        LOGGER.info(" |  _  |  __/ | | (_) |   / ___ \\|  __/| | ");
        LOGGER.info(" |_| |_|\\___|_|  \\___/   /_/   \\_\\_|  |___|");
        LOGGER.info("                         Powered by Quarkus");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application HERO is stopping...");
    }
}
