            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class l0OoOooo {
                public static final l0OoOooo I00iOIl;
                public static final l0OoOooo[] I00iiI;

                static {
/* 6 */             l0OoOooo l0oooooo = new l0OoOooo("DEFAULT", 0);
/* 9 */             I00iOIl = l0oooooo;
/* 31 */            I00iiI = new l0OoOooo[]{l0oooooo, new l0OoOooo("SIGNED", 1), new l0OoOooo("FIXED", 2)};
                }

                public static l0OoOooo[] values() {
/* 7 */             return (l0OoOooo[]) I00iiI.clone();
                }
            }
