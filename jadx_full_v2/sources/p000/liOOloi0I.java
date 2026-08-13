            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class liOOloi0I implements I1Oll0OOO {
                public final int I00000oIO;
                public Object I00000oOI;

                public liOOloi0I(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture apply(Object obj) throws IOException {
                    switch (this.I00000oIO) {
                        case 0:
/* 102 */                   lili0I0IOO0 lili0i0ioo0 = (lili0I0IOO0) this.I00000oOI;
/* 106 */                   lili0i0ioo0.getClass();
/* 109 */                   int i = ((lOI1111l) obj).I00iOIl;
/* 113 */                   if ((i == 29501 || i == 29537 || i == 29538 || i == 29539 || i == 29540 || i == 29541 || i == 29542 || i == 29543 || i == 29544) && !lili0i0ioo0.I000O01llI0.I0001Ioi1lo()) {
/* 155 */                       lili0i0ioo0.I00000oOI();
                            }
/* 158 */                   return Ioil1OOO.I00iiI;
                        case 1:
/* 63 */                    l1Il1IliOI1l l1il1ilioi1l = (l1Il1IliOI1l) this.I00000oOI;
/* 67 */                    l1il1ilioi1l.getClass();
/* 73 */                    l0ooiII1Ol l0ooiii1ol = new l0ooiII1Ol(3);
/* 76 */                    l0ooiii1ol.I0000Il00O = l1il1ilioi1l;
/* 78 */                    l0ooiii1ol.I00000oOI = (llOOiIiIOo) obj;
/* 80 */                    VarHandle.storeStoreFence();
/* 87 */                    OI011o1 oI011o1I00000oIO = ((lIlIo1) l1il1ilioi1l.I00iOIl).I00000oIO();
/* 93 */                    OoIlol ooIlol = new OoIlol(l0ooiii1ol);
/* 96 */                    oI011o1I00000oIO.execute(ooIlol);
/* 99 */                    return ooIlol;
                        case 2:
/* 56 */                    return IlloOoiiO.I0000O((ListenableFuture) ((llilooO) this.I00000oOI).I0000oI00.get());
                        case 3:
/* 37 */                    return IlloOoiiO.I0000Il00O(((lii0l0) this.I00000oOI).apply(obj));
                        case 4:
/* 24 */                    return ((loilO0l) this.I00000oOI).I0000oI00.I00O0i0ii();
                        default:
/* 8 */                     IOException iOException = (IOException) this.I00000oOI;
/* 12 */                    iOException.addSuppressed((IOException) obj);
/* 15 */                    throw iOException;
                    }
                }
            }
