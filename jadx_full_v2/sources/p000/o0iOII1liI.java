            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Random;
            
            public abstract class o0iOII1liI {
                public static final int I00000oIO = 0;

                static {
/* 10 */            Math.abs(new Random().nextInt());
/* 15 */            new HashMap();
                }

                public static final i000IO I00000oIO(I1OlOl11O0 i1OlOl11O0) {
/* 1 */             o0OllIoI o0ollioiI00000oIO = o0IOOIili01o.I00000oIO();
/* 9 */             i000IO i000io = new i000IO(13);
/* 12 */            i000io.I00iiI = o0ollioiI00000oIO;
/* 14 */            i000io.I00iiO = i1OlOl11O0;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return i000io;
                }

                public static final ll10Ii1io1I I00000oOI(I1Oll0OOO i1Oll0OOO) {
/* 1 */             o0OllIoI o0ollioiI00000oIO = o0IOOIili01o.I00000oIO();
/* 8 */             ll10Ii1io1I ll10ii1io1i = new ll10Ii1io1I(4);
/* 11 */            ll10ii1io1i.I00000oOI = o0ollioiI00000oIO;
/* 13 */            ll10ii1io1i.I0000Il00O = i1Oll0OOO;
/* 15 */            VarHandle.storeStoreFence();
/* 29 */            return ll10ii1io1i;
                }
            }
