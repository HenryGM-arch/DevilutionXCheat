package org.diasurgical.devilutionx;

public class CheatBridge {
    static {
        System.loadLibrary("devilutionx");
    }

    public static native void enableGodMode();
    public static native void giveGold(int amount);
    public static native void maxStats();
    public static native void maxSpells();
}
