            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OlOOI001 {
                public static final OlOOI001 I00iiI;
                public static final OlOOI001 I00iiO;
                public static final OlOOI001 I00iio;
                public static final OlOOI001 I00ilI0I1;
                public static final OlOOI001 I00ilO0;
                public static final OlOOI001[] I00io1l;
                public final long I00iOIl;

                static {
/* 6 */             OlOOI001 olOOI001 = new OlOOI001("DEFAULT", 0, 0);
/* 9 */             I00iiI = olOOI001;
/* 16 */            OlOOI001 olOOI0012 = new OlOOI001("PREVIEW", 1, 1);
/* 19 */            I00iiO = olOOI0012;
/* 27 */            OlOOI001 olOOI0013 = new OlOOI001("VIDEO_RECORD", 2, 3);
/* 30 */            I00iio = olOOI0013;
/* 36 */            OlOOI001 olOOI0014 = new OlOOI001("STILL_CAPTURE", 3, 2);
/* 39 */            I00ilI0I1 = olOOI0014;
/* 47 */            OlOOI001 olOOI0015 = new OlOOI001("VIDEO_CALL", 4, 5);
/* 54 */            OlOOI001 olOOI0016 = new OlOOI001("PREVIEW_VIDEO_STILL", 5, 4);
/* 57 */            I00ilO0 = olOOI0016;
/* 67 */            OlOOI001[] olOOI001Arr = {olOOI001, olOOI0012, olOOI0013, olOOI0014, olOOI0015, olOOI0016, new OlOOI001("CROPPED_RAW", 6, 6)};
/* 71 */            I00io1l = olOOI001Arr;
/* 73 */            ilIII1o11.I00000oIO(olOOI001Arr);
                }

                public OlOOI001(String str, int i, int i2) {
/* 5 */             this.I00iOIl = i2;
                }

                public static OlOOI001 valueOf(String str) {
/* 7 */             return (OlOOI001) Enum.valueOf(OlOOI001.class, str);
                }

                public static OlOOI001[] values() {
/* 7 */             return (OlOOI001[]) I00io1l.clone();
                }
            }
