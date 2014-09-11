package me.nallar.logspammustdie;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import me.nallar.modpatcher.ModPatcher;

import java.util.*;

@IFMLLoadingPlugin.SortingIndex(1001) // Magic value, after deobf transformer.
public class CoreMod implements IFMLLoadingPlugin {
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
		ModPatcher.addPatchesFromInputStream(CoreMod.class.getResourceAsStream("/modpatcher.xml"));
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}
}
