            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class iI1oilo {
                public static final iI1oilo I00iOIl;
                public static final iI1oilo[] I00iiI;

                static {
/* 6 */             iI1oilo ii1oilo = new iI1oilo("DEFAULT", 0);
/* 9 */             I00iOIl = ii1oilo;
/* 31 */            I00iiI = new iI1oilo[]{ii1oilo, new iI1oilo("SIGNED", 1), new iI1oilo("FIXED", 2)};
                }

                public static iI1oilo[] values() {
/* 7 */             return (iI1oilo[]) I00iiI.clone();
                }
            }
