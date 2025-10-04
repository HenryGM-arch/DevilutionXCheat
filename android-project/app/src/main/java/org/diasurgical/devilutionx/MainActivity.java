package org.diasurgical.devilutionx;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Crear y mostrar tu diálogo de cheats
        showCheatDialog();
    }

    private void showCheatDialog() {
        Dialog cheatDialog = new Dialog(this);
        cheatDialog.setContentView(R.layout.dialog_cheats);

        Button btnGod = cheatDialog.findViewById(R.id.btnGodMode);
        Button btnGold = cheatDialog.findViewById(R.id.btnGold);
        Button btnStats = cheatDialog.findViewById(R.id.btnStats);
        Button btnSpells = cheatDialog.findViewById(R.id.btnSpells);

        btnGod.setOnClickListener(v -> CheatBridge.enableGodMode());
        btnGold.setOnClickListener(v -> CheatBridge.giveGold(999999));
        btnStats.setOnClickListener(v -> CheatBridge.maxStats());
        btnSpells.setOnClickListener(v -> CheatBridge.maxSpells());

        cheatDialog.show();
    }
}
