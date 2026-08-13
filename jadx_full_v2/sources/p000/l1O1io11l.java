            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class l1O1io11l implements Runnable {
                public lIOlOoIoo I00iOIl;
                public O1ii11 I00iiI;
                public ArrayList I00iiO;
                public int I00iio;
                public ArrayList I00ilI0I1;

                @Override
                public final void run() {
/* 1 */             OOIliOOi010 oOIliOOi010 = OOIliOOi010.I00ioIO;
/* 5 */             lIOlOoIoo liolooioo = this.I00iOIl;
/* 7 */             ArrayList arrayList = this.I00iiO;
/* 9 */             int i = this.I00iio;
/* 11 */            ArrayList arrayList2 = this.I00ilI0I1;
/* 13 */            l1ololO l1ololo = new l1ololO();
/* 16 */            l1ololo.I00iOIl = liolooioo;
/* 18 */            l1ololo.I00iiI = arrayList;
/* 20 */            l1ololo.I00iiO = i;
/* 22 */            l1ololo.I00iio = arrayList2;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            this.I00iiI.I0000oI00(oOIliOOi010, l1ololo);
                }
            }
