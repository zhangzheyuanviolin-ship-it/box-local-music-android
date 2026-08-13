            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class iilIoo01O {
                public static final iilIoo01O I00iOIl;
                public static final iilIoo01O[] I00iiI;

                static {
/* 6 */             iilIoo01O iilioo01o = new iilIoo01O("DEFAULT", 0);
/* 9 */             I00iOIl = iilioo01o;
/* 31 */            I00iiI = new iilIoo01O[]{iilioo01o, new iilIoo01O("SIGNED", 1), new iilIoo01O("FIXED", 2)};
                }

                public static iilIoo01O[] values() {
/* 7 */             return (iilIoo01O[]) I00iiI.clone();
                }
            }
