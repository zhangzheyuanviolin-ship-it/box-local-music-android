            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOOIII1 {
                public static final OOOIII1 I00iOIl;
                public static final OOOIII1[] I00iiI;

                static {
/* 6 */             OOOIII1 oooiii1 = new OOOIII1("SINGLE_SELECT", 0);
/* 9 */             I00iOIl = oooiii1;
/* 11 */            OOOIII1[] oooiii1Arr = {oooiii1};
/* 15 */            I00iiI = oooiii1Arr;
/* 17 */            ilIII1o11.I00000oIO(oooiii1Arr);
                }

                public static OOOIII1 valueOf(String str) {
/* 7 */             return (OOOIII1) Enum.valueOf(OOOIII1.class, str);
                }

                public static OOOIII1[] values() {
/* 7 */             return (OOOIII1[]) I00iiI.clone();
                }
            }
