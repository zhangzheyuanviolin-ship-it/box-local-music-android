            package p000;

            import java.util.Arrays;
            
            public abstract class lOilill0l0o {
                public static final String I00000oIO(long j) {
/* 145 */           return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? IlIi0I0.I000o00OoI0I(new StringBuilder(), (j - 500000000) / 1000000000, " s ") : j <= -999500 ? IlIi0I0.I000o00OoI0I(new StringBuilder(), (j - 500000) / 1000000, " ms") : j <= 0 ? IlIi0I0.I000o00OoI0I(new StringBuilder(), (j - 500) / 1000, " µs") : j < 999500 ? IlIi0I0.I000o00OoI0I(new StringBuilder(), (j + 500) / 1000, " µs") : j < 999500000 ? IlIi0I0.I000o00OoI0I(new StringBuilder(), (j + 500000) / 1000000, " ms") : IlIi0I0.I000o00OoI0I(new StringBuilder(), (j + 500000000) / 1000000000, " s ")}, 1));
                }

                public static final void I00000oOI(OloIi00i oloIi00i, OloO00ioIOO oloO00ioIOO, String str) {
/* 47 */            OloO0oOI1lI.I000OOo1O.fine(oloO00ioIOO.I00000oOI + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + oloIi00i.I00000oIO);
                }
            }
