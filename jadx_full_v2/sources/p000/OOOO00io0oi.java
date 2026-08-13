            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOOO00io0oi {
                public static final OOOO00io0oi I00iOIl;
                public static final OOOO00io0oi I00iiI;
                public static final OOOO00io0oi[] I00iiO;

                static {
/* 6 */             OOOO00io0oi oOOO00io0oi = new OOOO00io0oi("PRETTY", 0);
/* 14 */            OOOO00io0oi oOOO00io0oi2 = new OOOO00io0oi("DEBUG", 1);
/* 17 */            I00iOIl = oOOO00io0oi2;
/* 24 */            OOOO00io0oi oOOO00io0oi3 = new OOOO00io0oi("NONE", 2);
/* 27 */            I00iiI = oOOO00io0oi3;
/* 29 */            OOOO00io0oi[] oOOO00io0oiArr = {oOOO00io0oi, oOOO00io0oi2, oOOO00io0oi3};
/* 33 */            I00iiO = oOOO00io0oiArr;
/* 35 */            ilIII1o11.I00000oIO(oOOO00io0oiArr);
                }

                public static OOOO00io0oi valueOf(String str) {
/* 7 */             return (OOOO00io0oi) Enum.valueOf(OOOO00io0oi.class, str);
                }

                public static OOOO00io0oi[] values() {
/* 7 */             return (OOOO00io0oi[]) I00iiO.clone();
                }
            }
