            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ol00I1i00 {
                public static final Ol00I1i00 I00iOIl;
                public static final Ol00I1i00 I00iiI;
                public static final Ol00I1i00 I00iiO;
                public static final Ol00I1i00[] I00iio;

                static {
/* 6 */             Ol00I1i00 ol00I1i00 = new Ol00I1i00("START", 0);
/* 9 */             I00iOIl = ol00I1i00;
/* 16 */            Ol00I1i00 ol00I1i002 = new Ol00I1i00("STOP", 1);
/* 19 */            I00iiI = ol00I1i002;
/* 26 */            Ol00I1i00 ol00I1i003 = new Ol00I1i00("STOP_AND_RESET_REPLAY_CACHE", 2);
/* 29 */            I00iiO = ol00I1i003;
/* 31 */            Ol00I1i00[] ol00I1i00Arr = {ol00I1i00, ol00I1i002, ol00I1i003};
/* 35 */            I00iio = ol00I1i00Arr;
/* 37 */            ilIII1o11.I00000oIO(ol00I1i00Arr);
                }

                public static Ol00I1i00 valueOf(String str) {
/* 7 */             return (Ol00I1i00) Enum.valueOf(Ol00I1i00.class, str);
                }

                public static Ol00I1i00[] values() {
/* 7 */             return (Ol00I1i00[]) I00iio.clone();
                }
            }
