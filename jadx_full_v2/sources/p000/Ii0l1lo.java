            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ii0l1lo {
                public static final Ii0l1lo I00iiI;
                public static final Ii0l1lo I00iiO;
                public static final Ii0l1lo I00iio;
                public static final Ii0l1lo I00ilI0I1;
                public static final Ii0l1lo I00ilO0;
                public static final Ii0l1lo I00io1l;
                public static final Ii0l1lo[] I00ioIO;
                public static final Il0li01oOil I00l0I0l0lO1;
                public final String I00iOIl;

                static {
/* 8 */             Ii0l1lo ii0l1lo = new Ii0l1lo("SYSTEM", 0, "system");
/* 11 */            I00iiI = ii0l1lo;
/* 20 */            Ii0l1lo ii0l1lo2 = new Ii0l1lo("LIGHT", 1, "light");
/* 23 */            I00iiO = ii0l1lo2;
/* 32 */            Ii0l1lo ii0l1lo3 = new Ii0l1lo("CATPPUCCIN", 2, "catppuccin");
/* 35 */            I00iio = ii0l1lo3;
/* 44 */            Ii0l1lo ii0l1lo4 = new Ii0l1lo("DRACULA", 3, "dracula");
/* 47 */            I00ilI0I1 = ii0l1lo4;
/* 56 */            Ii0l1lo ii0l1lo5 = new Ii0l1lo("PTYXIS", 4, "ptyxis");
/* 59 */            I00ilO0 = ii0l1lo5;
/* 68 */            Ii0l1lo ii0l1lo6 = new Ii0l1lo("PTYXIS_EXTENDED", 5, "ptyxis_extended");
/* 71 */            I00io1l = ii0l1lo6;
/* 73 */            Ii0l1lo[] ii0l1loArr = {ii0l1lo, ii0l1lo2, ii0l1lo3, ii0l1lo4, ii0l1lo5, ii0l1lo6};
/* 77 */            I00ioIO = ii0l1loArr;
/* 83 */            I00l0I0l0lO1 = ilIII1o11.I00000oIO(ii0l1loArr);
                }

                public Ii0l1lo(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static Ii0l1lo valueOf(String str) {
/* 7 */             return (Ii0l1lo) Enum.valueOf(Ii0l1lo.class, str);
                }

                public static Ii0l1lo[] values() {
/* 7 */             return (Ii0l1lo[]) I00ioIO.clone();
                }
            }
