            package p000;

            import android.graphics.SurfaceTexture;
            import android.media.MediaCodec;
            import android.view.SurfaceHolder;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OolOiI0I {
                public static final l1I0oI I00iiI;
                public static final OolOiI0I I00iiO;
                public static final OolOiI0I I00iio;
                public static final OolOiI0I I00ilI0I1;
                public static final OolOiI0I I00ilO0;
                public static final OolOiI0I I00io1l;
                public static final OolOiI0I I00ioIO;
                public static final OolOiI0I[] I00l0I0l0lO1;
                public final Class I00iOIl;

                static {
/* 8 */             OolOiI0I oolOiI0I = new OolOiI0I("PREVIEW", 0, SurfaceHolder.class);
/* 11 */            I00iiO = oolOiI0I;
/* 19 */            OolOiI0I oolOiI0I2 = new OolOiI0I("IMAGE_CAPTURE", 1, null);
/* 22 */            I00iio = oolOiI0I2;
/* 29 */            OolOiI0I oolOiI0I3 = new OolOiI0I("IMAGE_ANALYSIS", 2, null);
/* 32 */            I00ilI0I1 = oolOiI0I3;
/* 41 */            OolOiI0I oolOiI0I4 = new OolOiI0I("VIDEO_CAPTURE", 3, MediaCodec.class);
/* 44 */            I00ilO0 = oolOiI0I4;
/* 54 */            OolOiI0I oolOiI0I5 = new OolOiI0I("STREAM_SHARING", 4, SurfaceTexture.class);
/* 57 */            I00io1l = oolOiI0I5;
/* 65 */            OolOiI0I oolOiI0I6 = new OolOiI0I("UNDEFINED", 5, null);
/* 68 */            I00ioIO = oolOiI0I6;
/* 70 */            OolOiI0I[] oolOiI0IArr = {oolOiI0I, oolOiI0I2, oolOiI0I3, oolOiI0I4, oolOiI0I5, oolOiI0I6};
/* 74 */            I00l0I0l0lO1 = oolOiI0IArr;
/* 76 */            ilIII1o11.I00000oIO(oolOiI0IArr);
/* 86 */            I00iiI = new l1I0oI(16);
                }

                public OolOiI0I(String str, int i, Class cls) {
/* 4 */             this.I00iOIl = cls;
                }

                public static OolOiI0I valueOf(String str) {
/* 7 */             return (OolOiI0I) Enum.valueOf(OolOiI0I.class, str);
                }

                public static OolOiI0I[] values() {
/* 7 */             return (OolOiI0I[]) I00l0I0l0lO1.clone();
                }

                @Override
                public final String toString() {
/* 1 */             int iOrdinal = ordinal();
/* 5 */             if (iOrdinal == 0) {
/* 42 */                return "Preview";
                    }
/* 8 */             if (iOrdinal == 1) {
/* 39 */                return "ImageCapture";
                    }
/* 11 */            if (iOrdinal == 2) {
/* 36 */                return "ImageAnalysis";
                    }
/* 14 */            if (iOrdinal == 3) {
/* 33 */                return "VideoCapture";
                    }
/* 17 */            if (iOrdinal == 4) {
/* 30 */                return "StreamSharing";
                    }
/* 20 */            if (iOrdinal == 5) {
/* 22 */                return "Undefined";
                    }
/* 25 */            I000II.I00000oIO();
/* 28 */            return null;
                }
            }
