            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0O10O {
                public static final O0O10O I00iOIl;
                public static final O0O10O I00iiI;
                public static final O0O10O I00iiO;
                public static final O0O10O[] I00iio;

                static {
/* 6 */             O0O10O o0o10o = new O0O10O("INVARIANT", 0);
/* 9 */             I00iOIl = o0o10o;
/* 16 */            O0O10O o0o10o2 = new O0O10O("IN", 1);
/* 19 */            I00iiI = o0o10o2;
/* 26 */            O0O10O o0o10o3 = new O0O10O("OUT", 2);
/* 29 */            I00iiO = o0o10o3;
/* 31 */            O0O10O[] o0o10oArr = {o0o10o, o0o10o2, o0o10o3};
/* 35 */            I00iio = o0o10oArr;
/* 37 */            ilIII1o11.I00000oIO(o0o10oArr);
                }

                public static O0O10O valueOf(String str) {
/* 7 */             return (O0O10O) Enum.valueOf(O0O10O.class, str);
                }

                public static O0O10O[] values() {
/* 7 */             return (O0O10O[]) I00iio.clone();
                }
            }
