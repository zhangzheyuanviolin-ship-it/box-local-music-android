            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IIllOlooI {
                public static final IIllOlooI I00iOIl;
                public static final IIllOlooI I00iiI;
                public static final IIllOlooI I00iiO;
                public static final IIllOlooI I00iio;
                public static final IIllOlooI I00ilI0I1;
                public static final IIllOlooI I00ilO0;
                public static final IIllOlooI I00io1l;
                public static final IIllOlooI[] I00ioIO;

                static {
/* 6 */             IIllOlooI iIllOlooI = new IIllOlooI("RELEASED", 0);
/* 9 */             I00iOIl = iIllOlooI;
/* 16 */            IIllOlooI iIllOlooI2 = new IIllOlooI("RELEASING", 1);
/* 19 */            I00iiI = iIllOlooI2;
/* 26 */            IIllOlooI iIllOlooI3 = new IIllOlooI("CLOSED", 2);
/* 29 */            I00iiO = iIllOlooI3;
/* 36 */            IIllOlooI iIllOlooI4 = new IIllOlooI("PENDING_OPEN", 3);
/* 39 */            I00iio = iIllOlooI4;
/* 46 */            IIllOlooI iIllOlooI5 = new IIllOlooI("CLOSING", 4);
/* 49 */            I00ilI0I1 = iIllOlooI5;
/* 56 */            IIllOlooI iIllOlooI6 = new IIllOlooI("OPENING", 5);
/* 59 */            I00ilO0 = iIllOlooI6;
/* 66 */            IIllOlooI iIllOlooI7 = new IIllOlooI("OPEN", 6);
/* 69 */            I00io1l = iIllOlooI7;
/* 83 */            I00ioIO = new IIllOlooI[]{iIllOlooI, iIllOlooI2, iIllOlooI3, iIllOlooI4, iIllOlooI5, iIllOlooI6, iIllOlooI7, new IIllOlooI("CONFIGURED", 7)};
                }

                public static IIllOlooI valueOf(String str) {
/* 7 */             return (IIllOlooI) Enum.valueOf(IIllOlooI.class, str);
                }

                public static IIllOlooI[] values() {
/* 7 */             return (IIllOlooI[]) I00ioIO.clone();
                }
            }
