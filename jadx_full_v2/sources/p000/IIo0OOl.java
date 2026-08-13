            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIo0OOl implements Oi110Iil1i0 {
                public final int I00000oOI;
                public final Oi110Iil1i0 I0000Il00O;

                public IIo0OOl(int i, long j) {
/* 1 */             this.I00000oOI = i;
                    switch (i) {
                        case 1:
/* 25 */                    IIo0OOiOoIO iIo0OOiOoIO = new IIo0OOiOoIO();
/* 28 */                    iIo0OOiOoIO.I00000oOI = j;
/* 30 */                    VarHandle.storeStoreFence();
/* 36 */                    this.I0000Il00O = new Oo11iIll(j, iIo0OOiOoIO);
                            break;
                        default:
/* 15 */                    this.I0000Il00O = new IIo0OOl(1, j);
                            break;
                    }
                }

                @Override
                public final long I00000oIO() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             Oi110Iil1i0 oi110Iil1i0 = this.I0000Il00O;
                    switch (i) {
                        case 0:
/* 19 */                    return ((Oo11iIll) ((IIo0OOl) oi110Iil1i0).I0000Il00O).I00000oOI;
                        default:
/* 10 */                    return ((Oo11iIll) oi110Iil1i0).I00000oOI;
                    }
                }

                @Override
                public final Oi110I I00000oOI(IIo0IiiO iIo0IiiO) {
/* 1 */             int i = this.I00000oOI;
/* 3 */             Oi110Iil1i0 oi110Iil1i0 = this.I0000Il00O;
                    switch (i) {
                        case 0:
/* 27 */                    if (((Oo11iIll) ((IIo0OOl) oi110Iil1i0).I0000Il00O).I00000oOI(iIo0IiiO).I00000oOI) {
/* 56 */                        return Oi110I.I0000oI00;
                            }
/* 31 */                    Throwable th = (Throwable) iIo0IiiO.I0000Il00O;
/* 35 */                    if (th instanceof IIoIiOlOIiO) {
/* 41 */                        l11I11lO.I00000oIO("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
/* 48 */                        if (((IIoIiOlOIiO) th).I00iOIl > 0) {
/* 50 */                            return Oi110I.I0001Ioi1lo;
                                }
                            }
/* 53 */                    return Oi110I.I0000O;
                        default:
/* 10 */                    return ((Oo11iIll) oi110Iil1i0).I00000oOI(iIo0IiiO);
                    }
                }
            }
