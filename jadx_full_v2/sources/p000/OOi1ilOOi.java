            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOi1ilOOi {
                public static final OOi1ilOOi I00iOIl;
                public static final OOi1ilOOi[] I00iiI;

                static {
/* 6 */             OOi1ilOOi oOi1ilOOi = new OOi1ilOOi("DEFAULT", 0);
/* 9 */             I00iOIl = oOi1ilOOi;
/* 31 */            I00iiI = new OOi1ilOOi[]{oOi1ilOOi, new OOi1ilOOi("SIGNED", 1), new OOi1ilOOi("FIXED", 2)};
                }

                public static OOi1ilOOi valueOf(String str) {
/* 7 */             return (OOi1ilOOi) Enum.valueOf(OOi1ilOOi.class, str);
                }

                public static OOi1ilOOi[] values() {
/* 7 */             return (OOi1ilOOi[]) I00iiI.clone();
                }
            }
