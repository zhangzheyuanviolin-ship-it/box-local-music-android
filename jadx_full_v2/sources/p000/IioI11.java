            package p000;

            import android.hardware.camera2.params.DynamicRangeProfiles;
            import java.util.Collections;
            import java.util.Set;
            
            public final class IioI11 implements IioI0ol1O0 {
                public static final Oi1ol0llI I00iOIl = new Oi1ol0llI(new IioI11(), 9);
                public static final Set I00iiI = Collections.singleton(Iio1oiI.I0000O);

                @Override
                public final DynamicRangeProfiles I0000Il00O() {
/* 1 */             return null;
                }

                @Override
                public final Set I0000O() {
/* 1 */             return I00iiI;
                }

                @Override
                public final Set I00100o1O0lo(Iio1oiI iio1oiI) {
/* 21 */            lII1OI11o1I.I00000oIO("DynamicRange is not supported: " + iio1oiI, Iio1oiI.I0000O.equals(iio1oiI));
/* 24 */            return I00iiI;
                }
            }
