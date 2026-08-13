            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class i01IiIoioll implements OOiO01IO {
                public OOiO01IO I00000oIO;
                public OOiO01IO I00000oOI;
                public OiOIi0O01 I0000Il00O;
                public OOiO01IO I0000O;

                @Override
                public final Object get() {
/* 7 */             Executor executor = (Executor) this.I00000oIO.get();
/* 15 */            OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) this.I00000oOI.get();
/* 23 */            IOO000ilo iOO000ilo = (IOO000ilo) this.I0000Il00O.get();
/* 31 */            OiIIilol0iO oiIIilol0iO2 = (OiIIilol0iO) this.I0000O.get();
/* 35 */            o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 38 */            o01l1iooo0.I00iOIl = executor;
/* 40 */            o01l1iooo0.I00iiI = oiIIilol0iO;
/* 42 */            o01l1iooo0.I00iiO = iOO000ilo;
/* 44 */            o01l1iooo0.I00iio = oiIIilol0iO2;
/* 46 */            VarHandle.storeStoreFence();
/* 55 */            return o01l1iooo0;
                }
            }
