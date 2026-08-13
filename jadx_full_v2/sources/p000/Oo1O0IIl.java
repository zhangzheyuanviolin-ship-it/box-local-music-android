            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oo1O0IIl {
                public static final Oo1O0IIl I00iOIl;
                public static final Oo1O0IIl I00iiI;
                public static final Oo1O0IIl I00iiO;
                public static final Oo1O0IIl[] I00iio;

                static {
/* 6 */             Oo1O0IIl oo1O0IIl = new Oo1O0IIl("NOT_STORED", 0);
/* 9 */             I00iOIl = oo1O0IIl;
/* 16 */            Oo1O0IIl oo1O0IIl2 = new Oo1O0IIl("EXPIRED", 1);
/* 19 */            I00iiI = oo1O0IIl2;
/* 26 */            Oo1O0IIl oo1O0IIl3 = new Oo1O0IIl("NOT_EXPIRED", 2);
/* 29 */            I00iiO = oo1O0IIl3;
/* 31 */            Oo1O0IIl[] oo1O0IIlArr = {oo1O0IIl, oo1O0IIl2, oo1O0IIl3};
/* 35 */            I00iio = oo1O0IIlArr;
/* 37 */            ilIII1o11.I00000oIO(oo1O0IIlArr);
                }

                public static Oo1O0IIl valueOf(String str) {
/* 7 */             return (Oo1O0IIl) Enum.valueOf(Oo1O0IIl.class, str);
                }

                public static Oo1O0IIl[] values() {
/* 7 */             return (Oo1O0IIl[]) I00iio.clone();
                }
            }
