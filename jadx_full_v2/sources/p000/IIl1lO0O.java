            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IIl1lO0O {
                public static final IIl1lO0O I00iOIl;
                public static final IIl1lO0O I00iiI;
                public static final IIl1lO0O I00iiO;
                public static final IIl1lO0O I00iio;
                public static final IIl1lO0O I00ilI0I1;
                public static final IIl1lO0O I00ilO0;
                public static final IIl1lO0O[] I00io1l;

                static {
/* 6 */             IIl1lO0O iIl1lO0O = new IIl1lO0O("UNKNOWN", 0);
/* 9 */             I00iOIl = iIl1lO0O;
/* 16 */            IIl1lO0O iIl1lO0O2 = new IIl1lO0O("INACTIVE", 1);
/* 19 */            I00iiI = iIl1lO0O2;
/* 26 */            IIl1lO0O iIl1lO0O3 = new IIl1lO0O("SEARCHING", 2);
/* 29 */            I00iiO = iIl1lO0O3;
/* 36 */            IIl1lO0O iIl1lO0O4 = new IIl1lO0O("FLASH_REQUIRED", 3);
/* 39 */            I00iio = iIl1lO0O4;
/* 46 */            IIl1lO0O iIl1lO0O5 = new IIl1lO0O("CONVERGED", 4);
/* 49 */            I00ilI0I1 = iIl1lO0O5;
/* 56 */            IIl1lO0O iIl1lO0O6 = new IIl1lO0O("LOCKED", 5);
/* 59 */            I00ilO0 = iIl1lO0O6;
/* 65 */            I00io1l = new IIl1lO0O[]{iIl1lO0O, iIl1lO0O2, iIl1lO0O3, iIl1lO0O4, iIl1lO0O5, iIl1lO0O6};
                }

                public static IIl1lO0O valueOf(String str) {
/* 7 */             return (IIl1lO0O) Enum.valueOf(IIl1lO0O.class, str);
                }

                public static IIl1lO0O[] values() {
/* 7 */             return (IIl1lO0O[]) I00io1l.clone();
                }
            }
