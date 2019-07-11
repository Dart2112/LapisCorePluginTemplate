#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import net.lapismc.lapiscore.LapisCoreConfiguration;
import net.lapismc.lapiscore.LapisCorePlugin;

public class ${artifactId} extends LapisCorePlugin {

    @Override
    public void onEnable() {
        registerConfiguration(new LapisCoreConfiguration(this, 1, 1));
        getLogger().info(getName() + " v." + getDescription().getVersion() + " has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info(getName() + " has been disabled!");
    }
}
