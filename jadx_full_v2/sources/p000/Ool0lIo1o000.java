            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ool0lIo1o000 {
                public static final Ool0lIo1o000 I00iOIl;
                public static final Ool0lIo1o000 I00iiI;
                public static final Ool0lIo1o000 I00iiO;
                public static final Ool0lIo1o000[] I00iio;

                static {
/* 6 */             Ool0lIo1o000 ool0lIo1o000 = new Ool0lIo1o000("CRITICAL", 0);
/* 9 */             I00iOIl = ool0lIo1o000;
/* 16 */            Ool0lIo1o000 ool0lIo1o0002 = new Ool0lIo1o000("HIGH", 1);
/* 19 */            I00iiI = ool0lIo1o0002;
/* 26 */            Ool0lIo1o000 ool0lIo1o0003 = new Ool0lIo1o000("NORMAL", 2);
/* 29 */            I00iiO = ool0lIo1o0003;
/* 31 */            Ool0lIo1o000[] ool0lIo1o000Arr = {ool0lIo1o000, ool0lIo1o0002, ool0lIo1o0003};
/* 35 */            I00iio = ool0lIo1o000Arr;
/* 37 */            ilIII1o11.I00000oIO(ool0lIo1o000Arr);
                }

                public static Ool0lIo1o000 valueOf(String str) {
/* 7 */             return (Ool0lIo1o000) Enum.valueOf(Ool0lIo1o000.class, str);
                }

                public static Ool0lIo1o000[] values() {
/* 7 */             return (Ool0lIo1o000[]) I00iio.clone();
                }
            }
