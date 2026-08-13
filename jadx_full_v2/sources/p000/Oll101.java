            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            
            public final class Oll101 {
                public static final IOO01l00ol I00000oIO;
                public static final OoiI00ill I00000oOI;

                static {
/* 4 */             IOO01l00ol iOO01l00ol = new IOO01l00ol(1);
/* 7 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 11 */            iOO01l00ol.I00iiI = O1OI1l011OO1.I00000oIO;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            I00000oIO = iOO01l00ol;
/* 20 */            I00000oOI = IiiIil1lOIO.I00000oOI;
                }

                public static Oll0oO I00000oIO(Ii00l101O ii00l101O, boolean z, IlliIl1l11O illiIl1l11O) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 10 */            IiIOIO1I iiIOIO1II00000oIO = iOi1II01i0.I00000oIO(I00000oIO, ii00l101O, z ? Ii01I10.I00iio : Ii01I10.I00iOIl, illiIl1l11O);
/* 16 */            Oll0oO oll0oO = new Oll0oO();
/* 19 */            oll0oO.I00iOIl = iiIOIO1II00000oIO;
/* 26 */            oll0oO.I00iiI = new Oi0OoOoOI1li();
/* 28 */            VarHandle.storeStoreFence();
/* 63 */            new OiIOol0(l00iIoI.I0000Il00O(l00iIoI.I00000oOI(oll0oO, new I00oII(1, iiIOIO1II00000oIO, IiIOI1ol0o.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 21))), Ii0111o.I00iOIl).resumeWith(OoiIlOl1iI.I00000oIO);
/* 98 */            return oll0oO;
                }
            }
