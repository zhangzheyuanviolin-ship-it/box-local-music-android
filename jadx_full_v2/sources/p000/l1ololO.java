            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.concurrent.ExecutorService;
            
            public final class l1ololO implements OIOilII0IlO {
                public lIOlOoIoo I00iOIl;
                public ArrayList I00iiI;
                public int I00iiO;
                public ArrayList I00iio;

                @Override
                public final void I00000oOI(Object obj) {
/* 1 */             lIOlOoIoo liolooioo = this.I00iOIl;
/* 3 */             ArrayList arrayList = this.I00iiI;
/* 5 */             int i = this.I00iiO;
/* 7 */             ArrayList arrayList2 = this.I00iio;
/* 9 */             i01Ii0ooO i01ii0ooo = (i01Ii0ooO) obj;
/* 11 */            if (i01ii0ooo == null) {
/* 13 */                lIOlOoIoo.I00000oOI();
/* 16 */                return;
                    }
/* 17 */            i01IOiO1lO i01ioio1lo = i01ii0ooo.I00000oOI;
/* 19 */            arrayList.toString();
/* 22 */            String.valueOf(i01ioio1lo);
/* 25 */            lIOlOoIoo.I00000oOI();
/* 30 */            if (i01ioio1lo == i01IOiO1lO.I00iio) {
/* 32 */                ExecutorService executorService = liolooioo.I000O01llI0;
/* 37 */                I1I1Oi0iil i1I1Oi0iil = new I1I1Oi0iil(3);
/* 40 */                i1I1Oi0iil.I00iiO = liolooioo;
/* 42 */                i1I1Oi0iil.I00iiI = i;
/* 44 */                i1I1Oi0iil.I00iio = arrayList2;
/* 46 */                VarHandle.storeStoreFence();
/* 49 */                executorService.execute(i1I1Oi0iil);
                    }
                }
            }
