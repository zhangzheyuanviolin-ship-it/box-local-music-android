            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.internal.GenAiUtils;
            import java.lang.invoke.VarHandle;
            
            public abstract class iOiiOlio implements AutoCloseable {
                public l00Iil I00iOIl;
                public int I00iiI;
                public iOi1l1i1O I00iiO;
                public volatile ilOiOOII0I0 I00iio;
                public ioii01Ii100 I00ilI0I1;
                public boolean I00ilO0;

                public final synchronized ListenableFuture I00000oIO() {
/* 4 */             if (this.I00iio != null) {
/* 8 */                 return ll0li01oO0li.I00000oIO(this.I00iio);
                    }
/* 16 */            l00Iil l00iil = this.I00iOIl;
/* 24 */            if (!GenAiUtils.isAiCoreCompatible(l00iil.I00iiI)) {
/* 34 */                return ll0li01oO0li.I00000oOI(new GenAiException(null, GenAiException.ErrorCode.AICORE_INCOMPATIBLE));
                    }
/* 40 */            int i = this.I00iiI;
/* 42 */            l00iil.I000II();
/* 57 */            li1l1liO1i0l li1l1lio1i0lI0000O = ll0li01oO0li.I0000O(liIOoOi1Ii1.I000o00OoI0I(l00iil.I00000oIO()), ioo0I10ilio.I00000oIO, liI1iIi1IllO.I00iOIl);
/* 63 */            iooo1l iooo1lVar = new iooo1l();
/* 66 */            iooo1lVar.I00000oIO = i;
/* 68 */            VarHandle.storeStoreFence();
/* 73 */            li1ii1 li1ii1VarI0000Il00O = ll0li01oO0li.I0000Il00O(li1l1lio1i0lI0000O, iooo1lVar, l00iil.I00iOIl);
/* 80 */            iOiiIoi1oI ioiiioi1oi = new iOiiIoi1oI(0);
/* 83 */            ioiiioi1oi.I00000oOI = this;
/* 85 */            VarHandle.storeStoreFence();
/* 90 */            return ll0li01oO0li.I0000O(li1ii1VarI0000Il00O, ioiiioi1oi, l00iil.I00iOIl);
                }

                public final li0lOl1ol1I I0000Il00O(li1o00OoI0 li1o00ooi0, iOiO11oOi1 ioio11ooi1) {
/* 4 */             iOiOO11l ioioo11l = new iOiOO11l(1);
/* 7 */             ioioo11l.I00000oOI = ioio11ooi1;
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            lil11i lil11iVar = this.I00iOIl.I00iOIl;
/* 18 */            li0lOl1ol1I li0lol1ol1i = new li0lOl1ol1I();
/* 21 */            li0lol1ol1i.I00ioIO = li1o00ooi0;
/* 25 */            li0lol1ol1i.I00l0I0l0lO1 = Throwable.class;
/* 27 */            li0lol1ol1i.I00l0OO0IO = ioioo11l;
/* 33 */            li1o00ooi0.addListener(li0lol1ol1i, ll0o0IiI.I00000oIO(lil11iVar, li0lol1ol1i));
/* 37 */            return li0lol1ol1i;
                }

                public abstract ioii01Ii100 I000II(l00Iil l00iil, ilOiOOII0I0 iloiooii0i0);

                public abstract Object I000O01llI0(Object obj, iOi1Olo ioi1olo);

                public abstract Object I000l1(Object obj);

                public final ListenableFuture I00100l0() {
/* 1 */             l00Iil l00iil = this.I00iOIl;
/* 9 */             int i = 0;
/* 10 */            if (!GenAiUtils.isAiCoreCompatible(l00iil.I00iiI)) {
/* 16 */                return ll0li01oO0li.I00000oIO(0);
                    }
/* 21 */            ListenableFuture listenableFutureI00000oIO = I00000oIO();
/* 27 */            iOiOO11l ioioo11l = new iOiOO11l(i);
/* 33 */            ioioo11l.I00000oOI = (iOil1lO10l) this;
/* 35 */            VarHandle.storeStoreFence();
/* 46 */            return I0000Il00O(ll0li01oO0li.I0000Il00O(listenableFutureI00000oIO, ioioo11l, l00iil.I00iOIl), Iioi0lilII.I00l0OO0IO);
                }

                public final ListenableFuture I001i1lo1io() {
/* 1 */             ioii01Ii100 ioii01ii100 = this.I00ilI0I1;
/* 3 */             if (ioii01ii100 != null) {
/* 5 */                 return ll0li01oO0li.I00000oIO(ioii01ii100);
                    }
/* 10 */            ListenableFuture listenableFutureI00000oIO = I00000oIO();
/* 17 */            iOiiIoi1oI ioiiioi1oi = new iOiiIoi1oI(1);
/* 20 */            ioiiioi1oi.I00000oOI = this;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            return ll0li01oO0li.I0000O(listenableFutureI00000oIO, ioiiioi1oi, this.I00iOIl.I00iOIl);
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.I0000Il00O();
/* 7 */             this.I00ilO0 = true;
/* 11 */            this.I00iiO.zzc();
                }
            }
