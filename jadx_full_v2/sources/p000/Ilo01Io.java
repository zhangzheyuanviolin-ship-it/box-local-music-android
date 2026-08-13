            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ilo01Io {
                public static final Ilo01Io I00iOIl;
                public static final Ilo01Io I00iiI;
                public static final Ilo01Io I00iiO;
                public static final Ilo01Io[] I00iio;

                static {
/* 6 */             Ilo01Io ilo01Io = new Ilo01Io("UNKNOWN", 0);
/* 9 */             I00iOIl = ilo01Io;
/* 16 */            Ilo01Io ilo01Io2 = new Ilo01Io("DEFAULT", 1);
/* 19 */            I00iiI = ilo01Io2;
/* 26 */            Ilo01Io ilo01Io3 = new Ilo01Io("YUV", 2);
/* 29 */            I00iiO = ilo01Io3;
/* 35 */            I00iio = new Ilo01Io[]{ilo01Io, ilo01Io2, ilo01Io3};
                }

                public static Ilo01Io valueOf(String str) {
/* 7 */             return (Ilo01Io) Enum.valueOf(Ilo01Io.class, str);
                }

                public static Ilo01Io[] values() {
/* 7 */             return (Ilo01Io[]) I00iio.clone();
                }
            }
