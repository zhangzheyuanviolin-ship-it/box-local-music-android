            package androidx.camera.camera2.compat.quirk;

            import android.util.Range;
            import android.util.Size;
            import java.util.LinkedHashMap;
            import kotlin.Metadata;
            import p000.O1Oii0O0loo;
            import p000.OIoi0IIoi;
            import p000.OOiio1i;
            import p000.Olilol;
            import p000.ilO0Io0l0oo;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "LOOiio1i;", "<init>", "()V", "ilO0Io0l0oo", "camera-camera2"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class ExtraCroppingQuirk implements OOiio1i {
                public static final LinkedHashMap I00000oIO = O1Oii0O0loo.I0000oI00(new OIoi0IIoi("SM-T580", null), new OIoi0IIoi("SM-J710MN", new Range(21, 26)), new OIoi0IIoi("SM-A320FL", null), new OIoi0IIoi("SM-G570M", null), new OIoi0IIoi("SM-G610F", null), new OIoi0IIoi("SM-G610M", new Range(21, 26)));

                public static Size I00000oOI(Olilol olilol) {
/* 5 */             if (!ilO0Io0l0oo.I00000oIO()) {
/* 50 */                return null;
                    }
/* 7 */             int iOrdinal = olilol.ordinal();
/* 11 */            if (iOrdinal == 0) {
/* 46 */                return new Size(1920, 1080);
                    }
/* 14 */            if (iOrdinal == 1) {
/* 36 */                return new Size(1280, 720);
                    }
/* 17 */            if (iOrdinal != 2) {
/* 50 */                return null;
                    }
/* 26 */            return new Size(3264, 1836);
                }
            }
