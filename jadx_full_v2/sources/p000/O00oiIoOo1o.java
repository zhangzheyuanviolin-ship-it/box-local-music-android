            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O00oiIoOo1o {
                public static final O00oiIoOo1o I00iOIl;
                public static final O00oiIoOo1o I00iiI;
                public static final O00oiIoOo1o I00iiO;
                public static final O00oiIoOo1o[] I00iio;

                static {
/* 6 */             O00oiIoOo1o o00oiIoOo1o = new O00oiIoOo1o("INFLEXIBLE", 0);
/* 9 */             I00iOIl = o00oiIoOo1o;
/* 16 */            O00oiIoOo1o o00oiIoOo1o2 = new O00oiIoOo1o("FLEXIBLE_UPPER_BOUND", 1);
/* 19 */            I00iiI = o00oiIoOo1o2;
/* 26 */            O00oiIoOo1o o00oiIoOo1o3 = new O00oiIoOo1o("FLEXIBLE_LOWER_BOUND", 2);
/* 29 */            I00iiO = o00oiIoOo1o3;
/* 31 */            O00oiIoOo1o[] o00oiIoOo1oArr = {o00oiIoOo1o, o00oiIoOo1o2, o00oiIoOo1o3};
/* 35 */            I00iio = o00oiIoOo1oArr;
/* 37 */            ilIII1o11.I00000oIO(o00oiIoOo1oArr);
                }

                public static O00oiIoOo1o valueOf(String str) {
/* 7 */             return (O00oiIoOo1o) Enum.valueOf(O00oiIoOo1o.class, str);
                }

                public static O00oiIoOo1o[] values() {
/* 7 */             return (O00oiIoOo1o[]) I00iio.clone();
                }
            }
