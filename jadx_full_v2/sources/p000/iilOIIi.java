            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class iilOIIi {
                public static final iilOIIi I00iOIl;
                public static final iilOIIi[] I00iiI;

                static {
/* 6 */             iilOIIi iiloiii = new iilOIIi("DEFAULT", 0);
/* 9 */             I00iOIl = iiloiii;
/* 31 */            I00iiI = new iilOIIi[]{iiloiii, new iilOIIi("SIGNED", 1), new iilOIIi("FIXED", 2)};
                }

                public static iilOIIi[] values() {
/* 7 */             return (iilOIIi[]) I00iiI.clone();
                }
            }
