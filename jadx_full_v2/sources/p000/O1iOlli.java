            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1iOlli {
                public static final O1iOlli I00iOIl;
                public static final O1iOlli I00iiI;
                public static final O1iOlli[] I00iiO;

                static {
/* 6 */             O1iOlli o1iOlli = new O1iOlli("Min", 0);
/* 9 */             I00iOIl = o1iOlli;
/* 16 */            O1iOlli o1iOlli2 = new O1iOlli("Max", 1);
/* 19 */            I00iiI = o1iOlli2;
/* 21 */            O1iOlli[] o1iOlliArr = {o1iOlli, o1iOlli2};
/* 25 */            I00iiO = o1iOlliArr;
/* 27 */            ilIII1o11.I00000oIO(o1iOlliArr);
                }

                public static O1iOlli valueOf(String str) {
/* 7 */             return (O1iOlli) Enum.valueOf(O1iOlli.class, str);
                }

                public static O1iOlli[] values() {
/* 7 */             return (O1iOlli[]) I00iiO.clone();
                }
            }
