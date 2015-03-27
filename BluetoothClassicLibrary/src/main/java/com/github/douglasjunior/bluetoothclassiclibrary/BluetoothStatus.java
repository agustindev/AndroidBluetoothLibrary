package com.github.douglasjunior.bluetoothclassiclibrary;

/**
 * Created by douglas on 25/11/14.
 */
public enum BluetoothStatus {
    CONNECTED {
        @Override
        public String toString() {
            return "Conectado";
        }
    },
    CONNECTING {
        @Override
        public String toString() {
            return "Conectando";
        }
    },
    DISABLED {
        @Override
        public String toString() {
            return "Desabilitado";
        }
    },
    NONE {
        @Override
        public String toString() {
            return "Desconectado";
        }
    }
}
