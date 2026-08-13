            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ii0ii1 {
                public static final Ii0ii1 I00iOIl;
                public static final Ii0ii1 I00iiI;
                public static final Ii0ii1 I00iiO;
                public static final Ii0ii1[] I00iio;

                static {
/* 6 */             Ii0ii1 ii0ii1 = new Ii0ii1("None", 0);
/* 9 */             I00iOIl = ii0ii1;
/* 16 */            Ii0ii1 ii0ii12 = new Ii0ii1("Cancelled", 1);
/* 19 */            I00iiI = ii0ii12;
/* 26 */            Ii0ii1 ii0ii13 = new Ii0ii1("Redirected", 2);
/* 29 */            I00iiO = ii0ii13;
/* 39 */            Ii0ii1[] ii0ii1Arr = {ii0ii1, ii0ii12, ii0ii13, new Ii0ii1("RedirectCancelled", 3)};
/* 43 */            I00iio = ii0ii1Arr;
/* 45 */            ilIII1o11.I00000oIO(ii0ii1Arr);
                }

                public static Ii0ii1 valueOf(String str) {
/* 7 */             return (Ii0ii1) Enum.valueOf(Ii0ii1.class, str);
                }

                public static Ii0ii1[] values() {
/* 7 */             return (Ii0ii1[]) I00iio.clone();
                }
            }
