            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIllIOi11 implements IllOOo00lI {
                public final int I00iOIl;
                public IIllO1o I00iiI;

                public IIllIOi11(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIllO1o iIllO1o = this.I00iiI;
                    switch (i) {
                        case 0:
/* 23 */                    IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 27 */                    IIlo0i0ll iIlo0i0ll = iIllO1o.I00iOIl.I00000oOI;
/* 29 */                    iIlo0OOlI.getClass();
/* 36 */                    return Boolean.valueOf(IIlo0OOlI.I00000oOI(iIlo0i0ll));
                        default:
/* 8 */                     IIloIoOOiO0l iIloIoOOiO0l = iIllO1o.I00iOIl;
/* 12 */                    IIioOol iIioOol = new IIioOol();
/* 17 */                    String str = iIloIoOOiO0l.I00000oIO.I00iiI;
/* 19 */                    VarHandle.storeStoreFence();
/* 22 */                    return iIioOol;
                    }
                }
            }
