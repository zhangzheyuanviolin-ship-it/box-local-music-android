            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class i01IioIOl0l0 {
                public static final i01IioIOl0l0[] I00iOIl;

                static {
/* 25 */            i01IioIOl0l0[] i01iioiol0l0Arr = {new i01IioIOl0l0("NOT_APPLIED", 0), new i01IioIOl0l0("APPLIED_IMMEDIATELY", 1), new i01IioIOl0l0("APPLIED_FOR_NEXT_RUN", 2)};
/* 29 */            I00iOIl = i01iioiol0l0Arr;
/* 31 */            ilIII1o11.I00000oIO(i01iioiol0l0Arr);
                }

                public static i01IioIOl0l0 valueOf(String str) {
/* 7 */             return (i01IioIOl0l0) Enum.valueOf(i01IioIOl0l0.class, str);
                }

                public static i01IioIOl0l0[] values() {
/* 7 */             return (i01IioIOl0l0[]) I00iOIl.clone();
                }
            }
