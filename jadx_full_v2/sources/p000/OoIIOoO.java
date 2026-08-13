            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OoIIOoO {
                public static final OoIIOoO I00iOIl;
                public static final OoIIOoO I00iiI;
                public static final OoIIOoO[] I00iiO;

                static {
/* 6 */             OoIIOoO ooIIOoO = new OoIIOoO("A", 0);
/* 9 */             I00iOIl = ooIIOoO;
/* 16 */            OoIIOoO ooIIOoO2 = new OoIIOoO("B", 1);
/* 19 */            I00iiI = ooIIOoO2;
/* 21 */            OoIIOoO[] ooIIOoOArr = {ooIIOoO, ooIIOoO2};
/* 25 */            I00iiO = ooIIOoOArr;
/* 27 */            ilIII1o11.I00000oIO(ooIIOoOArr);
                }

                public static OoIIOoO valueOf(String str) {
/* 7 */             return (OoIIOoO) Enum.valueOf(OoIIOoO.class, str);
                }

                public static OoIIOoO[] values() {
/* 7 */             return (OoIIOoO[]) I00iiO.clone();
                }
            }
