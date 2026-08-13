            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ii01I10 {
                public static final Ii01I10 I00iOIl;
                public static final Ii01I10 I00iiI;
                public static final Ii01I10 I00iiO;
                public static final Ii01I10 I00iio;
                public static final Ii01I10[] I00ilI0I1;

                static {
/* 6 */             Ii01I10 ii01I10 = new Ii01I10("DEFAULT", 0);
/* 9 */             I00iOIl = ii01I10;
/* 16 */            Ii01I10 ii01I102 = new Ii01I10("LAZY", 1);
/* 19 */            I00iiI = ii01I102;
/* 26 */            Ii01I10 ii01I103 = new Ii01I10("ATOMIC", 2);
/* 29 */            I00iiO = ii01I103;
/* 36 */            Ii01I10 ii01I104 = new Ii01I10("UNDISPATCHED", 3);
/* 39 */            I00iio = ii01I104;
/* 41 */            Ii01I10[] ii01I10Arr = {ii01I10, ii01I102, ii01I103, ii01I104};
/* 45 */            I00ilI0I1 = ii01I10Arr;
/* 47 */            ilIII1o11.I00000oIO(ii01I10Arr);
                }

                public static Ii01I10 valueOf(String str) {
/* 7 */             return (Ii01I10) Enum.valueOf(Ii01I10.class, str);
                }

                public static Ii01I10[] values() {
/* 7 */             return (Ii01I10[]) I00ilI0I1.clone();
                }
            }
