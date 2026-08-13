            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class il11loI implements ll0o111o0, OIi0Oi1lOoo, OIi0011o, OIOol0 {
                public final int I00iOIl;
                public Executor I00iiI;
                public IOoillilli I00iiO;
                public o0IiOl I00iio;

                public il11loI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void I00000oIO(OloIIoII1oo oloIIoII1oo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 28 */                    liOO1i1 lioo1i1 = new liOO1i1(4);
/* 31 */                    lioo1i1.I00iiI = oloIIoII1oo;
/* 33 */                    lioo1i1.I00iiO = this;
/* 35 */                    VarHandle.storeStoreFence();
/* 40 */                    this.I00iiI.execute(lioo1i1);
                            break;
                        default:
/* 9 */                     iooili01 iooili01Var = new iooili01(6);
/* 12 */                    iooili01Var.I00iiI = oloIIoII1oo;
/* 14 */                    iooili01Var.I00iiO = this;
/* 16 */                    VarHandle.storeStoreFence();
/* 21 */                    this.I00iiI.execute(iooili01Var);
                            break;
                    }
                }

                @Override
                public void I00000oOI() {
/* 3 */             this.I00iio.I00100l0();
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 3 */             this.I00iio.I000lI(obj);
                }

                @Override
                public void onFailure(Exception exc) {
/* 3 */             this.I00iio.I000oI1ioi(exc);
                }
            }
