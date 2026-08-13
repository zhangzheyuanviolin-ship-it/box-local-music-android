            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IIl1oi {
                public static final IIl1oi I00iOIl;
                public static final IIl1oi I00iiI;
                public static final IIl1oi I00iiO;
                public static final IIl1oi I00iio;
                public static final IIl1oi I00ilI0I1;
                public static final IIl1oi[] I00ilO0;

                static {
/* 6 */             IIl1oi iIl1oi = new IIl1oi("UNKNOWN", 0);
/* 9 */             I00iOIl = iIl1oi;
/* 16 */            IIl1oi iIl1oi2 = new IIl1oi("INACTIVE", 1);
/* 19 */            I00iiI = iIl1oi2;
/* 26 */            IIl1oi iIl1oi3 = new IIl1oi("METERING", 2);
/* 29 */            I00iiO = iIl1oi3;
/* 36 */            IIl1oi iIl1oi4 = new IIl1oi("CONVERGED", 3);
/* 39 */            I00iio = iIl1oi4;
/* 46 */            IIl1oi iIl1oi5 = new IIl1oi("LOCKED", 4);
/* 49 */            I00ilI0I1 = iIl1oi5;
/* 55 */            I00ilO0 = new IIl1oi[]{iIl1oi, iIl1oi2, iIl1oi3, iIl1oi4, iIl1oi5};
                }

                public static IIl1oi valueOf(String str) {
/* 7 */             return (IIl1oi) Enum.valueOf(IIl1oi.class, str);
                }

                public static IIl1oi[] values() {
/* 7 */             return (IIl1oi[]) I00ilO0.clone();
                }
            }
