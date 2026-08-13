            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class IiI10I1IlO implements OOiO01IO {
                public OOiO01IO I00000oIO;
                public OOiO01IO I00000oOI;
                public OiOIi0O01 I0000Il00O;
                public OOiO01IO I0000O;
                public OOiO01IO I0000oI00;

                @Override
                public final Object get() {
/* 7 */             Executor executor = (Executor) this.I00000oIO.get();
/* 15 */            O1lOoiIIliiI o1lOoiIIliiI = (O1lOoiIIliiI) this.I00000oOI.get();
/* 23 */            IOO000ilo iOO000ilo = (IOO000ilo) this.I0000Il00O.get();
/* 31 */            OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) this.I0000O.get();
/* 39 */            OiIIilol0iO oiIIilol0iO2 = (OiIIilol0iO) this.I0000oI00.get();
/* 43 */            IiI101Oo iiI101Oo = new IiI101Oo();
/* 46 */            iiI101Oo.I00000oOI = executor;
/* 48 */            iiI101Oo.I0000Il00O = o1lOoiIIliiI;
/* 50 */            iiI101Oo.I00000oIO = iOO000ilo;
/* 52 */            iiI101Oo.I0000O = oiIIilol0iO;
/* 54 */            iiI101Oo.I0000oI00 = oiIIilol0iO2;
/* 56 */            VarHandle.storeStoreFence();
/* 110 */           return iiI101Oo;
                }
            }
