#include "player.h"
#include "items.h"

extern "C" {

// God Mode
void Java_org_diasurgical_devilutionx_CheatBridge_enableGodMode(JNIEnv *, jobject) {
    Players[MyPlayerId]._pHitPoints = 9999;
    Players[MyPlayerId]._pMaxHP = 9999;
}

// Oro Infinito
void Java_org_diasurgical_devilutionx_CheatBridge_giveGold(JNIEnv *, jobject, jint amount) {
    Players[MyPlayerId]._pGold = amount;
}

// Max Stats
void Java_org_diasurgical_devilutionx_CheatBridge_maxStats(JNIEnv *, jobject) {
    Players[MyPlayerId]._pStrength = 255;
    Players[MyPlayerId]._pMagic = 255;
    Players[MyPlayerId]._pDexterity = 255;
    Players[MyPlayerId]._pVitality = 255;
}

// Max Spells
void Java_org_diasurgical_devilutionx_CheatBridge_maxSpells(JNIEnv *, jobject) {
    for (int i = 0; i < 37; i++) {
        Players[MyPlayerId]._pMemSpells |= (1ULL << i);
        Players[MyPlayerId]._pSplLvl[i] = 15;
    }
}
}
