            package p000;

            import android.content.Context;
            import java.util.List;
            
            public abstract class OI1OO1oo {
                public static final List I00000oIO = IOOi1I.I000O01llI0(new OIoi0IIoi("Fast", 250L), new OIoi0IIoi("Balanced", 500L), new OIoi0IIoi("Slow", 1000L), new OIoi0IIoi("Power saver", 2000L));
                public static final OIooliIO0 I00000oOI = lOO00IiI0li.I00000oIO(500L);
                public static boolean I0000Il00O;

                public static void I00000oIO(Context context, long j) {
/* 7 */             I00000oOI.setValue(Long.valueOf(j));
/* 27 */            context.getSharedPreferences("nano_vision_prefs", 0).edit().putLong("refresh_interval_ms", j).apply();
/* 31 */            I0000Il00O = true;
                }
            }
