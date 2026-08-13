            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OoOOOOl {
                public static final OoOOOOl I00iOIl;
                public static final OoOOOOl I00iiI;
                public static final OoOOOOl[] I00iiO;

                static {
/* 6 */             OoOOOOl ooOOOOl = new OoOOOOl("NOT_NULL", 0);
/* 9 */             I00iOIl = ooOOOOl;
/* 16 */            OoOOOOl ooOOOOl2 = new OoOOOOl("NULLABLE", 1);
/* 24 */            OoOOOOl ooOOOOl3 = new OoOOOOl("FLEXIBLE", 2);
/* 27 */            I00iiI = ooOOOOl3;
/* 29 */            OoOOOOl[] ooOOOOlArr = {ooOOOOl, ooOOOOl2, ooOOOOl3};
/* 33 */            I00iiO = ooOOOOlArr;
/* 35 */            ilIII1o11.I00000oIO(ooOOOOlArr);
                }

                public static OoOOOOl valueOf(String str) {
/* 7 */             return (OoOOOOl) Enum.valueOf(OoOOOOl.class, str);
                }

                public static OoOOOOl[] values() {
/* 7 */             return (OoOOOOl[]) I00iiO.clone();
                }
            }
