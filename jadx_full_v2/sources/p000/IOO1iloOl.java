            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IOO1iloOl {
                public static final IOO1iloOl I00iOIl;
                public static final IOO1iloOl I00iiI;
                public static final IOO1iloOl I00iiO;
                public static final IOO1iloOl I00iio;
                public static final IOO1iloOl I00ilI0I1;
                public static final IOO1iloOl I00ilO0;
                public static final IOO1iloOl[] I00io1l;

                static {
/* 6 */             IOO1iloOl iOO1iloOl = new IOO1iloOl("APP_CLOSED", 0);
/* 9 */             I00iOIl = iOO1iloOl;
/* 16 */            IOO1iloOl iOO1iloOl2 = new IOO1iloOl("APP_DISCONNECTED", 1);
/* 19 */            I00iiI = iOO1iloOl2;
/* 26 */            IOO1iloOl iOO1iloOl3 = new IOO1iloOl("CAMERA2_CLOSED", 2);
/* 29 */            I00iiO = iOO1iloOl3;
/* 36 */            IOO1iloOl iOO1iloOl4 = new IOO1iloOl("CAMERA2_DISCONNECTED", 3);
/* 39 */            I00iio = iOO1iloOl4;
/* 46 */            IOO1iloOl iOO1iloOl5 = new IOO1iloOl("CAMERA2_ERROR", 4);
/* 49 */            I00ilI0I1 = iOO1iloOl5;
/* 56 */            IOO1iloOl iOO1iloOl6 = new IOO1iloOl("CAMERA2_EXCEPTION", 5);
/* 59 */            I00ilO0 = iOO1iloOl6;
/* 61 */            IOO1iloOl[] iOO1iloOlArr = {iOO1iloOl, iOO1iloOl2, iOO1iloOl3, iOO1iloOl4, iOO1iloOl5, iOO1iloOl6};
/* 65 */            I00io1l = iOO1iloOlArr;
/* 67 */            ilIII1o11.I00000oIO(iOO1iloOlArr);
                }

                public static IOO1iloOl valueOf(String str) {
/* 7 */             return (IOO1iloOl) Enum.valueOf(IOO1iloOl.class, str);
                }

                public static IOO1iloOl[] values() {
/* 7 */             return (IOO1iloOl[]) I00io1l.clone();
                }
            }
