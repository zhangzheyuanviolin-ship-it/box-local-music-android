            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
/* 17 */    public final class l0IIioiIOIo implements ll0o111o0, OIi0Oi1lOoo, OIi0011o, OIOol0 {
                public final int I00iOIl;
                public Executor I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public l0IIioiIOIo(Executor executor, OIOolOo oIOolOo) {
/* 2 */             this.I00iOIl = 1;
/* 12 */            this.I00iiO = new Object();
/* 14 */            this.I00iiI = executor;
/* 16 */            this.I00iio = oIOolOo;
                }

                @Override
                public final void I00000oIO(OloIIoII1oo oloIIoII1oo) {
/* 3 */             int i = 11;
                    switch (this.I00iOIl) {
                        case 0:
/* 147 */                   if (((o0IiOl) oloIIoII1oo).I0000O) {
                                synchronized (this.I00iiO) {
                                    try {
/* 156 */                               if (((OIOol0) this.I00iio) != null) {
/* 163 */                                   Executor executor = this.I00iiI;
/* 169 */                                   I0lil01 i0lil01 = new I0lil01(26);
/* 172 */                                   i0lil01.I00iiI = this;
/* 174 */                                   VarHandle.storeStoreFence();
/* 177 */                                   executor.execute(i0lil01);
                                        }
                                    } finally {
                                    }
                                }
/* 183 */                       return;
                            }
/* 183 */                   return;
                        case 1:
                            synchronized (this.I00iiO) {
                            }
/* 121 */                   Executor executor2 = this.I00iiI;
/* 126 */                   l0001OI0 l0001oi0 = new l0001OI0(7);
/* 129 */                   l0001oi0.I00iiI = oloIIoII1oo;
/* 131 */                   l0001oi0.I00iiO = this;
/* 133 */                   VarHandle.storeStoreFence();
/* 136 */                   executor2.execute(l0001oi0);
/* 139 */                   return;
                        case 2:
/* 71 */                    if (oloIIoII1oo.I000OOo1O() || ((o0IiOl) oloIIoII1oo).I0000O) {
/* 116 */                       return;
                            }
                            synchronized (this.I00iiO) {
                                try {
/* 87 */                            if (((OIi0011o) this.I00iio) != null) {
/* 94 */                                Executor executor3 = this.I00iiI;
/* 100 */                               liOO1i1 lioo1i1 = new liOO1i1(8);
/* 103 */                               lioo1i1.I00iiI = oloIIoII1oo;
/* 105 */                               lioo1i1.I00iiO = this;
/* 107 */                               VarHandle.storeStoreFence();
/* 110 */                               executor3.execute(lioo1i1);
                                    }
                                } finally {
                                }
                            }
/* 116 */                   return;
                        case 3:
/* 30 */                    if (oloIIoII1oo.I000OOo1O()) {
                                synchronized (this.I00iiO) {
                                    try {
/* 39 */                                if (((OIi0Oi1lOoo) this.I00iio) != null) {
/* 46 */                                    Executor executor4 = this.I00iiI;
/* 50 */                                    illioiliioi illioiliioiVar = new illioiliioi(i);
/* 53 */                                    illioiliioiVar.I00iiI = oloIIoII1oo;
/* 55 */                                    illioiliioiVar.I00iiO = this;
/* 57 */                                    VarHandle.storeStoreFence();
/* 60 */                                    executor4.execute(illioiliioiVar);
                                        }
                                    } finally {
                                    }
                                }
/* 66 */                        return;
                            }
/* 66 */                    return;
                        default:
/* 10 */                    IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(i);
/* 13 */                    illoOi1I1OO.I00iiI = oloIIoII1oo;
/* 15 */                    illoOi1I1OO.I00iiO = this;
/* 17 */                    VarHandle.storeStoreFence();
/* 22 */                    this.I00iiI.execute(illoOi1I1OO);
/* 25 */                    return;
                    }
                }

                @Override
                public void I00000oOI() {
/* 5 */             ((o0IiOl) this.I00iio).I00100l0();
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 5 */             ((o0IiOl) this.I00iio).I000lI(obj);
                }

                @Override
                public void onFailure(Exception exc) {
/* 5 */             ((o0IiOl) this.I00iio).I000oI1ioi(exc);
                }

/* 18 */        public l0IIioiIOIo(int i) {
/* 19 */            this.I00iOIl = i;
                }

/* 19 */        public l0IIioiIOIo(Executor executor, OliOio1iiOI oliOio1iiOI, o0IiOl o0iiol) {
                    this.I00iOIl = 4;
                    this.I00iiI = executor;
                    this.I00iiO = oliOio1iiOI;
                    this.I00iio = o0iiol;
                }
            }
