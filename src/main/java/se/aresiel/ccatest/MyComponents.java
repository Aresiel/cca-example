package se.aresiel.ccatest;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import nerdhub.cardinal.components.api.util.RespawnCopyStrategy;
import net.minecraft.util.Identifier;

public class MyComponents implements EntityComponentInitializer {

    public static final ComponentKey<IntComponent> RANDINT = ComponentRegistry.getOrCreate(new Identifier("ccatest", "randint"), IntComponent.class);


    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(RANDINT, player -> new RandomIntComponent(), RespawnCopyStrategy.INVENTORY);
    }
}
