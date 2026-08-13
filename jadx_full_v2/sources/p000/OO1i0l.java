            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OO1i0l {
                public static final OO1i0l I00iOIl;
                public static final OO1i0l I00iiI;
                public static final OO1i0l I00iiO;
                public static final OO1i0l[] I00iio;

                static {
/* 6 */             OO1i0l oO1i0l = new OO1i0l("Initial", 0);
/* 9 */             I00iOIl = oO1i0l;
/* 16 */            OO1i0l oO1i0l2 = new OO1i0l(BuildConfig.BUILD_VARIANT, 1);
/* 19 */            I00iiI = oO1i0l2;
/* 26 */            OO1i0l oO1i0l3 = new OO1i0l("Final", 2);
/* 29 */            I00iiO = oO1i0l3;
/* 31 */            OO1i0l[] oO1i0lArr = {oO1i0l, oO1i0l2, oO1i0l3};
/* 35 */            I00iio = oO1i0lArr;
/* 37 */            ilIII1o11.I00000oIO(oO1i0lArr);
                }

                public static OO1i0l valueOf(String str) {
/* 7 */             return (OO1i0l) Enum.valueOf(OO1i0l.class, str);
                }

                public static OO1i0l[] values() {
/* 7 */             return (OO1i0l[]) I00iio.clone();
                }
            }
