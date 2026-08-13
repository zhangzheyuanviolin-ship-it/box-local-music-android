            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0oOi0I {
                public static final O0oOi0I I00iOIl;
                public static final O0oOi0I I00iiI;
                public static final O0oOi0I I00iiO;
                public static final O0oOi0I I00iio;
                public static final O0oOi0I I00ilI0I1;
                public static final O0oOi0I[] I00ilO0;

                static {
/* 6 */             O0oOi0I o0oOi0I = new O0oOi0I("DESTROYED", 0);
/* 9 */             I00iOIl = o0oOi0I;
/* 16 */            O0oOi0I o0oOi0I2 = new O0oOi0I("INITIALIZED", 1);
/* 19 */            I00iiI = o0oOi0I2;
/* 26 */            O0oOi0I o0oOi0I3 = new O0oOi0I("CREATED", 2);
/* 29 */            I00iiO = o0oOi0I3;
/* 36 */            O0oOi0I o0oOi0I4 = new O0oOi0I("STARTED", 3);
/* 39 */            I00iio = o0oOi0I4;
/* 46 */            O0oOi0I o0oOi0I5 = new O0oOi0I("RESUMED", 4);
/* 49 */            I00ilI0I1 = o0oOi0I5;
/* 51 */            O0oOi0I[] o0oOi0IArr = {o0oOi0I, o0oOi0I2, o0oOi0I3, o0oOi0I4, o0oOi0I5};
/* 55 */            I00ilO0 = o0oOi0IArr;
/* 57 */            ilIII1o11.I00000oIO(o0oOi0IArr);
                }

                public static O0oOi0I valueOf(String str) {
/* 7 */             return (O0oOi0I) Enum.valueOf(O0oOi0I.class, str);
                }

                public static O0oOi0I[] values() {
/* 7 */             return (O0oOi0I[]) I00ilO0.clone();
                }

                public final boolean I00000oIO(O0oOi0I o0oOi0I) {
                    return compareTo(o0oOi0I) >= 0;
                }
            }
