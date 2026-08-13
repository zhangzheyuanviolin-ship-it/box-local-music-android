            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class lI0OI1i1ii implements Runnable {
                public final int I00iOIl;
                public lIl1O1li I00iiI;
                public AtomicReference I00iiO;

                public lI0OI1i1ii(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 61 */                    AtomicReference atomicReference = this.I00iiO;
                            synchronized (atomicReference) {
                                try {
                                    try {
/* 68 */                                l0olllO1i l0olllo1i = (l0olllO1i) this.I00iiI.I00iOIl;
/* 90 */                                atomicReference.set(Boolean.valueOf(l0olllo1i.I00iio.I01101IOlO(l0olllo1i.I000iOII().I010l1O(), iol1II1ii1i.I00Ol00)));
                                    } finally {
/* 105 */                               this.I00iiO.notify();
                                    }
                                } catch (Throwable th) {
/* 110 */                           throw th;
                                }
                            }
/* 99 */                    return;
                        default:
/* 12 */                    lOliOlO1Io loliolo1ioI000OOo1O = ((l0olllO1i) this.I00iiI.I00iOIl).I000OOo1O();
/* 22 */                    liIlli liilliI00000oOI = liIlli.I00000oOI(lIoOOO.SGTM_CLIENT);
/* 26 */                    AtomicReference atomicReference2 = this.I00iiO;
/* 28 */                    loliolo1ioI000OOo1O.I010II();
/* 31 */                    loliolo1ioI000OOo1O.I010OIo1l();
/* 35 */                    lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(false);
/* 43 */                    IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(16);
/* 46 */                    iO0iIlI1li.I00iiI = loliolo1ioI000OOo1O;
/* 48 */                    iO0iIlI1li.I00iiO = atomicReference2;
/* 50 */                    iO0iIlI1li.I00iio = lli10iiI011IO1I11OI;
/* 52 */                    iO0iIlI1li.I00ilI0I1 = liilliI00000oOI;
/* 54 */                    VarHandle.storeStoreFence();
/* 57 */                    loliolo1ioI000OOo1O.I0110o(iO0iIlI1li);
/* 60 */                    return;
                    }
                }
            }
