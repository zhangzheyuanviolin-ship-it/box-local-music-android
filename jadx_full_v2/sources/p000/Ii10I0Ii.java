            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class Ii10I0Ii {
                public static final Ii0ol0ii01I I00000oIO;
                public static final Ii0olO1 I00000oOI;

                static {
/* 4 */             Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(1);
/* 8 */             ii0ol0ii01I.I00iio = -1;
/* 10 */            I00000oIO = ii0ol0ii01I;
/* 14 */            Ii0olO1 ii0olO1 = new Ii0olO1();
/* 19 */            ii0olO1.I00iOIl = I00IOO.I0000O;
/* 21 */            ii0olO1.I00iiI = true;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            ii0olO1.I00ilI0I1 = -1;
/* 28 */            I00000oOI = ii0olO1;
                }

                public static Ii0ol0ii01I I00000oIO(I00IOO i00ioo) {
/* 3 */             int i = 1;
/* 4 */             if (i00ioo.I00000oOI < 1) {
/* 6 */                 return I00000oIO;
                    }
/* 11 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, i);
/* 15 */            ii0ol0ii01I.I00iio = -1;
/* 49 */            return ii0ol0ii01I;
                }

                public static Ii0olO1 I00000oOI(I00IOO i00ioo) {
/* 4 */             if (i00ioo.I00000oOI < 1) {
/* 6 */                 return I00000oOI;
                    }
/* 11 */            Ii0olO1 ii0olO1 = new Ii0olO1(i00ioo);
/* 15 */            ii0olO1.I00ilI0I1 = -1;
/* 49 */            return ii0olO1;
                }
            }
