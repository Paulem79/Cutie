package net.paulem.cutie.platform;

public interface Platform {
	boolean isModLoaded(String modId);

	ModLoader loader();

	enum ModLoader {
		FABRIC, NEOFORGE, FORGE, QUILT
	}
}
