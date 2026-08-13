            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ii0111o {
                public static final Ii0111o I00iOIl;
                public static final Ii0111o I00iiI;
                public static final Ii0111o I00iiO;
                public static final Ii0111o[] I00iio;

                static {
/* 6 */             Ii0111o ii0111o = new Ii0111o("COROUTINE_SUSPENDED", 0);
/* 9 */             I00iOIl = ii0111o;
/* 16 */            Ii0111o ii0111o2 = new Ii0111o("UNDECIDED", 1);
/* 19 */            I00iiI = ii0111o2;
/* 26 */            Ii0111o ii0111o3 = new Ii0111o("RESUMED", 2);
/* 29 */            I00iiO = ii0111o3;
/* 31 */            Ii0111o[] ii0111oArr = {ii0111o, ii0111o2, ii0111o3};
/* 35 */            I00iio = ii0111oArr;
/* 37 */            ilIII1o11.I00000oIO(ii0111oArr);
                }

                public static Ii0111o valueOf(String str) {
/* 7 */             return (Ii0111o) Enum.valueOf(Ii0111o.class, str);
                }

                public static Ii0111o[] values() {
/* 7 */             return (Ii0111o[]) I00iio.clone();
                }
            }
