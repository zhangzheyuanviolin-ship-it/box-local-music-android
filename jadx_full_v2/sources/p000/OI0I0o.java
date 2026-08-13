            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OI0I0o {
                public static final OI0I0o I00iOIl;
                public static final OI0I0o I00iiI;
                public static final OI0I0o I00iiO;
                public static final OI0I0o I00iio;
                public static final OI0I0o I00ilI0I1;
                public static final OI0I0o[] I00ilO0;

                static {
/* 6 */             OI0I0o oI0I0o = new OI0I0o("DefaultSpatial", 0);
/* 9 */             I00iOIl = oI0I0o;
/* 16 */            OI0I0o oI0I0o2 = new OI0I0o("FastSpatial", 1);
/* 19 */            I00iiI = oI0I0o2;
/* 26 */            OI0I0o oI0I0o3 = new OI0I0o("SlowSpatial", 2);
/* 34 */            OI0I0o oI0I0o4 = new OI0I0o("DefaultEffects", 3);
/* 37 */            I00iiO = oI0I0o4;
/* 44 */            OI0I0o oI0I0o5 = new OI0I0o("FastEffects", 4);
/* 47 */            I00iio = oI0I0o5;
/* 54 */            OI0I0o oI0I0o6 = new OI0I0o("SlowEffects", 5);
/* 57 */            I00ilI0I1 = oI0I0o6;
/* 59 */            OI0I0o[] oI0I0oArr = {oI0I0o, oI0I0o2, oI0I0o3, oI0I0o4, oI0I0o5, oI0I0o6};
/* 63 */            I00ilO0 = oI0I0oArr;
/* 65 */            ilIII1o11.I00000oIO(oI0I0oArr);
                }

                public static OI0I0o valueOf(String str) {
/* 7 */             return (OI0I0o) Enum.valueOf(OI0I0o.class, str);
                }

                public static OI0I0o[] values() {
/* 7 */             return (OI0I0o[]) I00ilO0.clone();
                }
            }
