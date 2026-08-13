            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class loloOo1OiO implements I1Oll0OOO {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public loloOo1OiO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture apply(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 27 */                    IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) this.I00000oOI;
/* 31 */                    I01i1oI i01i1oI = (I01i1oI) this.I0000Il00O;
/* 35 */                    I01i1oI i01i1oI2 = (I01i1oI) this.I0000O;
/* 49 */                    if (IlloOoiiO.I00000oIO(i01i1oI).equals(IlloOoiiO.I00000oIO(i01i1oI2))) {
/* 51 */                        return IlloOoiiO.I0000Il00O(obj);
                            }
/* 59 */                    ll10Ii1io1I ll10ii1io1i = new ll10Ii1io1I(2);
/* 62 */                    ll10ii1io1i.I00000oOI = iIlOoolol0ll;
/* 64 */                    ll10ii1io1i.I0000Il00O = i01i1oI2;
/* 66 */                    VarHandle.storeStoreFence();
/* 77 */                    I01i1oI i01i1oII00100l0 = I01iIIO.I00100l0(i01i1oI2, o0iOII1liI.I00000oOI(ll10ii1io1i), (OilOi0I1) iIlOoolol0ll.I00ilI0I1);
                            synchronized (iIlOoolol0ll.I00l0OO0IO) {
                            }
/* 85 */                    return i01i1oII00100l0;
                        default:
/* 8 */                     loilO0l loilo0l = (loilO0l) this.I00000oOI;
/* 20 */                    return loilo0l.I0000Il00O.I00111O((ll10Ii1io1I) this.I0000Il00O, (Executor) this.I0000O);
                    }
                }
            }
