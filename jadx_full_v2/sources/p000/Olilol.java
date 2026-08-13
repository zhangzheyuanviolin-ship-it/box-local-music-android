            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Olilol {
                public static final Olilol I00iOIl;
                public static final Olilol I00iiI;
                public static final Olilol I00iiO;
                public static final Olilol I00iio;
                public static final Olilol I00ilI0I1;
                public static final Olilol[] I00ilO0;

                static {
/* 6 */             Olilol olilol = new Olilol("PRIV", 0);
/* 9 */             I00iOIl = olilol;
/* 16 */            Olilol olilol2 = new Olilol("YUV", 1);
/* 19 */            I00iiI = olilol2;
/* 26 */            Olilol olilol3 = new Olilol("JPEG", 2);
/* 29 */            I00iiO = olilol3;
/* 36 */            Olilol olilol4 = new Olilol("JPEG_R", 3);
/* 39 */            I00iio = olilol4;
/* 46 */            Olilol olilol5 = new Olilol("RAW", 4);
/* 49 */            I00ilI0I1 = olilol5;
/* 51 */            Olilol[] olilolArr = {olilol, olilol2, olilol3, olilol4, olilol5};
/* 55 */            I00ilO0 = olilolArr;
/* 57 */            ilIII1o11.I00000oIO(olilolArr);
                }

                public static Olilol valueOf(String str) {
/* 7 */             return (Olilol) Enum.valueOf(Olilol.class, str);
                }

                public static Olilol[] values() {
/* 7 */             return (Olilol[]) I00ilO0.clone();
                }
            }
