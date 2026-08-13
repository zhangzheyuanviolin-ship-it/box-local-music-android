            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O00IIlIoil {
                public static final O00IIlIoil I00iOIl;
                public static final O00IIlIoil I00iiI;
                public static final O00IIlIoil I00iiO;
                public static final O00IIlIoil I00iio;
                public static final O00IIlIoil[] I00ilI0I1;

                static {
/* 6 */             O00IIlIoil o00IIlIoil = new O00IIlIoil("IGNORED", 0);
/* 9 */             I00iOIl = o00IIlIoil;
/* 16 */            O00IIlIoil o00IIlIoil2 = new O00IIlIoil("SCHEDULED", 1);
/* 19 */            I00iiI = o00IIlIoil2;
/* 26 */            O00IIlIoil o00IIlIoil3 = new O00IIlIoil("DEFERRED", 2);
/* 29 */            I00iiO = o00IIlIoil3;
/* 36 */            O00IIlIoil o00IIlIoil4 = new O00IIlIoil("IMMINENT", 3);
/* 39 */            I00iio = o00IIlIoil4;
/* 41 */            O00IIlIoil[] o00IIlIoilArr = {o00IIlIoil, o00IIlIoil2, o00IIlIoil3, o00IIlIoil4};
/* 45 */            I00ilI0I1 = o00IIlIoilArr;
/* 47 */            ilIII1o11.I00000oIO(o00IIlIoilArr);
                }

                public static O00IIlIoil valueOf(String str) {
/* 7 */             return (O00IIlIoil) Enum.valueOf(O00IIlIoil.class, str);
                }

                public static O00IIlIoil[] values() {
/* 7 */             return (O00IIlIoil[]) I00ilI0I1.clone();
                }
            }
