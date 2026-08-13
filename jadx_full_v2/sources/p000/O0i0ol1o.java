            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0i0ol1o {
                public static final O0i0ol1o I00iOIl;
                public static final O0i0ol1o I00iiI;
                public static final O0i0ol1o I00iiO;
                public static final O0i0ol1o[] I00iio;

                static {
/* 6 */             O0i0ol1o o0i0ol1o = new O0i0ol1o("INVARIANT", 0);
/* 9 */             I00iOIl = o0i0ol1o;
/* 16 */            O0i0ol1o o0i0ol1o2 = new O0i0ol1o("IN", 1);
/* 19 */            I00iiI = o0i0ol1o2;
/* 26 */            O0i0ol1o o0i0ol1o3 = new O0i0ol1o("OUT", 2);
/* 29 */            I00iiO = o0i0ol1o3;
/* 31 */            O0i0ol1o[] o0i0ol1oArr = {o0i0ol1o, o0i0ol1o2, o0i0ol1o3};
/* 35 */            I00iio = o0i0ol1oArr;
/* 37 */            ilIII1o11.I00000oIO(o0i0ol1oArr);
                }

                public static O0i0ol1o valueOf(String str) {
/* 7 */             return (O0i0ol1o) Enum.valueOf(O0i0ol1o.class, str);
                }

                public static O0i0ol1o[] values() {
/* 7 */             return (O0i0ol1o[]) I00iio.clone();
                }
            }
