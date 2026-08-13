            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            
            public final class I0IiOl0 implements IIlO1O0lOl {
                public final IIlO1O0lOl I00000oOI;
                public final int I0000Il00O;
                public Object I0000O;

                public I0IiOl0(IIlO1O0lOl iIlO1O0lOl, int i) {
/* 1 */             this.I0000Il00O = i;
/* 6 */             this.I00000oOI = iIlO1O0lOl;
                }

                @Override
                public IIlO1O0lOl I00000oIO() {
                    switch (this.I0000Il00O) {
                        case 0:
/* 15 */                    return (IIlO1O0lOl) this.I0000O;
                        default:
/* 8 */                     return this.I00000oOI.I00000oIO();
                    }
                }

                @Override
                public final void I00000oOI() {
/* 3 */             this.I00000oOI.I00000oOI();
                }

                @Override
                public final void I0000Il00O(OilliIo0l0OI oilliIo0l0OI) {
/* 3 */             this.I00000oOI.I0000Il00O(oilliIo0l0OI);
                }

                @Override
                public final void I0000O(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 3 */             this.I00000oOI.I0000O(iOlOo1ll1l1);
                }

                @Override
                public final void I0000oI00(int i) {
/* 3 */             this.I00000oOI.I0000oI00(i);
                }

                @Override
                public final void I0001Ioi1lo(Ioi11lOIIO0O ioi11lOIIO0O) {
/* 3 */             this.I00000oOI.I0001Ioi1lo(ioi11lOIIO0O);
                }

                @Override
                public ListenableFuture I000II(IioiI0IIIIO iioiI0IIIIO) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 17 */                    return ((IIlO1O0lOl) this.I0000O).I000II(iioiI0IIIIO);
                        default:
/* 8 */                     return this.I00000oOI.I000II(iioiI0IIIIO);
                    }
                }

                @Override
                public ListenableFuture I000O01llI0(ArrayList arrayList, int i, int i2) {
/* 1 */             int i3 = this.I0000Il00O;
/* 3 */             IIlO1O0lOl iIlO1O0lOl = this.I00000oOI;
                    switch (i3) {
                        case 1:
/* 25 */                    lII1OI11o1I.I00000oIO("Only support one capture config.", arrayList.size() == 1);
/* 28 */                    ListenableFuture listenableFutureI000l1 = iIlO1O0lOl.I000l1(i);
/* 32 */                    Illo1O1o illo1O1oI00000oIO = Illo1O1o.I00000oIO(listenableFutureI000l1);
/* 38 */                    IlloIII0 illoIII0 = new IlloIII0(1);
/* 41 */                    illoIII0.I00iiI = listenableFutureI000l1;
/* 43 */                    VarHandle.storeStoreFence();
/* 50 */                    IO0oo1I0oIO iO0oo1I0oIOI000O01llI0 = iIllIoiiIO.I000O01llI0(illo1O1oI00000oIO, illoIII0, Iii11l.I00000oIO());
/* 58 */                    IIoIil iIoIil = new IIoIil(23);
/* 61 */                    iIoIil.I00iiI = this;
/* 63 */                    iIoIil.I00iiO = arrayList;
/* 65 */                    VarHandle.storeStoreFence();
/* 72 */                    IO0oo1I0oIO iO0oo1I0oIOI000O01llI02 = iIllIoiiIO.I000O01llI0(iO0oo1I0oIOI000O01llI0, iIoIil, Iii11l.I00000oIO());
/* 79 */                    IlloIII0 illoIII02 = new IlloIII0(2);
/* 82 */                    illoIII02.I00iiI = listenableFutureI000l1;
/* 84 */                    VarHandle.storeStoreFence();
/* 110 */                   return new O10IIOOiO(new ArrayList(Collections.singletonList(iIllIoiiIO.I000O01llI0(iO0oo1I0oIOI000O01llI02, illoIII02, Iii11l.I00000oIO()))), true, Iii11l.I00000oIO());
                        default:
/* 8 */                     return iIlO1O0lOl.I000O01llI0(arrayList, i, i2);
                    }
                }

                @Override
                public ListenableFuture I000OOo1O(boolean z) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 17 */                    return ((IIlO1O0lOl) this.I0000O).I000OOo1O(z);
                        default:
/* 8 */                     return this.I00000oOI.I000OOo1O(z);
                    }
                }

                @Override
                public final IOlOo1ll1l1 I000OiO() {
/* 3 */             return this.I00000oOI.I000OiO();
                }

                @Override
                public final void I000iOII() {
/* 3 */             this.I00000oOI.I000iOII();
                }

                @Override
                public final ListenableFuture I000l1(int i) {
/* 3 */             return this.I00000oOI.I000l1(i);
                }
            }
