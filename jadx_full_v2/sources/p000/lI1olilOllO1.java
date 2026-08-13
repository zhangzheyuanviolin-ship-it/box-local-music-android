            package p000;

            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            import org.json.JSONException;
            
            public final class lI1olilOllO1 implements Runnable {
                public final int I00iOIl;
                public lIl1O1li I00iiI;
                public AtomicReference I00iiO;

                public lI1olilOllO1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws JSONException {
                    switch (this.I00iOIl) {
                        case 0:
/* 66 */                    AtomicReference atomicReference = this.I00iiO;
                            synchronized (atomicReference) {
                                try {
                                    try {
/* 73 */                                l0olllO1i l0olllo1i = (l0olllO1i) this.I00iiI.I00iOIl;
/* 91 */                                atomicReference.set(l0olllo1i.I00iio.I010l1ol111(l0olllo1i.I000iOII().I010l1O(), iol1II1ii1i.I00Ol10));
                                    } finally {
/* 106 */                               this.I00iiO.notify();
                                    }
                                } catch (Throwable th) {
/* 111 */                           throw th;
                                }
                            }
/* 100 */                   return;
                        default:
/* 6 */                     lIl1O1li lil1o1li = this.I00iiI;
/* 12 */                    l0Oi0o l0oi0o = ((l0olllO1i) lil1o1li.I00iOIl).I00ilI0I1;
/* 14 */                    l0olllO1i.I0000oI00(l0oi0o);
/* 19 */                    Bundle bundleI0010o = l0oi0o.I00lll10.I0010o();
/* 27 */                    lOliOlO1Io loliolo1ioI000OOo1O = ((l0olllO1i) lil1o1li.I00iOIl).I000OOo1O();
/* 31 */                    AtomicReference atomicReference2 = this.I00iiO;
/* 33 */                    loliolo1ioI000OOo1O.I010II();
/* 36 */                    loliolo1ioI000OOo1O.I010OIo1l();
/* 40 */                    lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(false);
/* 48 */                    IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(15);
/* 51 */                    iO0iIlI1li.I00iiI = loliolo1ioI000OOo1O;
/* 53 */                    iO0iIlI1li.I00iiO = atomicReference2;
/* 55 */                    iO0iIlI1li.I00iio = lli10iiI011IO1I11OI;
/* 57 */                    iO0iIlI1li.I00ilI0I1 = bundleI0010o;
/* 59 */                    VarHandle.storeStoreFence();
/* 62 */                    loliolo1ioI000OOo1O.I0110o(iO0iIlI1li);
/* 65 */                    return;
                    }
                }
            }
