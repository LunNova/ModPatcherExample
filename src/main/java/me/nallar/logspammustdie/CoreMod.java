package me.nallar.logspammustdie;

import me.nallar.modpatcher.ModPatcher;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.*;

@IFMLLoadingPlugin.SortingIndex(1001) // Magic value, after deobf transformer.
public class CoreMod implements IFMLLoadingPlugin {
	static {
		ModPatcher.requireVersion("1.10.2.1");
	}

	@Override
	public String[] getASMTransformerClass() {
		return new String[0];
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return ModPatcher.getSetupClass();
	}

	@Override
	public void injectData(Map<String, Object> stringObjectMap) {
		ModPatcher.loadPatches(CoreMod.class.getResourceAsStream("/modpatcher.xml"));
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}
}
