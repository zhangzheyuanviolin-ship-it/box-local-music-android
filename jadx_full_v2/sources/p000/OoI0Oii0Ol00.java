            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OoI0Oii0Ol00 {
                public static final OoI0Oii0Ol00 I00iOIl;
                public static final OoI0Oii0Ol00 I00iiI;
                public static final OoI0Oii0Ol00[] I00iiO;

                static {
/* 6 */             OoI0Oii0Ol00 ooI0Oii0Ol00 = new OoI0Oii0Ol00("DEFERRED", 0);
/* 9 */             I00iOIl = ooI0Oii0Ol00;
/* 16 */            OoI0Oii0Ol00 ooI0Oii0Ol002 = new OoI0Oii0Ol00("IMMEDIATE", 1);
/* 19 */            I00iiI = ooI0Oii0Ol002;
/* 29 */            OoI0Oii0Ol00[] ooI0Oii0Ol00Arr = {ooI0Oii0Ol00, ooI0Oii0Ol002, new OoI0Oii0Ol00("EXCLUSIVE", 2)};
/* 33 */            I00iiO = ooI0Oii0Ol00Arr;
/* 35 */            ilIII1o11.I00000oIO(ooI0Oii0Ol00Arr);
                }

                public static OoI0Oii0Ol00 valueOf(String str) {
/* 7 */             return (OoI0Oii0Ol00) Enum.valueOf(OoI0Oii0Ol00.class, str);
                }

                public static OoI0Oii0Ol00[] values() {
/* 7 */             return (OoI0Oii0Ol00[]) I00iiO.clone();
                }
            }
