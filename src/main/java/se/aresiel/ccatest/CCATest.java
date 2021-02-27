package se.aresiel.ccatest;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class CCATest implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Hello Fabric world!");
	}
}
