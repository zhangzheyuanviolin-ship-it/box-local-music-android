            package p000;

            import android.text.TextDirectionHeuristic;
            import android.text.TextDirectionHeuristics;
            
            public abstract class Oo0iliIolI {
                public static final ThreadLocal I00000oIO = new ThreadLocal();
                public static final long I00000oOI = I00000oIO(0, 0);

                public static final long I00000oIO(int i, int i2) {
/* 12 */            return (i2 & 4294967295L) | (i << 32);
                }

                public static final TextDirectionHeuristic I00000oOI(int i) {
                    return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                }
            }
