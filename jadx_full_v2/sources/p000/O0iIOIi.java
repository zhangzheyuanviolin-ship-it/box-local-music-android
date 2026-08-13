            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0iIOIi {
                public static final O0iIOIi I00iOIl;
                public static final O0iIOIi I00iiI;
                public static final O0iIOIi I00iiO;
                public static final O0iIOIi[] I00iio;

                static {
/* 6 */             O0iIOIi o0iIOIi = new O0iIOIi("RUNTIME", 0);
/* 9 */             I00iOIl = o0iIOIi;
/* 16 */            O0iIOIi o0iIOIi2 = new O0iIOIi("BINARY", 1);
/* 19 */            I00iiI = o0iIOIi2;
/* 26 */            O0iIOIi o0iIOIi3 = new O0iIOIi("SOURCE", 2);
/* 29 */            I00iiO = o0iIOIi3;
/* 31 */            O0iIOIi[] o0iIOIiArr = {o0iIOIi, o0iIOIi2, o0iIOIi3};
/* 35 */            I00iio = o0iIOIiArr;
/* 37 */            ilIII1o11.I00000oIO(o0iIOIiArr);
                }

                public static O0iIOIi valueOf(String str) {
/* 7 */             return (O0iIOIi) Enum.valueOf(O0iIOIi.class, str);
                }

                public static O0iIOIi[] values() {
/* 7 */             return (O0iIOIi[]) I00iio.clone();
                }
            }
