            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            
            public final class OOlI10o1ol implements IIIoloiiI1 {
                public final Ioo00OOI0II I00000oOI;
                public IOO100 I0000Il00O;
                public final III1oo00i1li I0000O = new III1oo00i1li();
                public final O010loOOi0Oo I0000oI00;
                public final Ii00l101O I0001Ioi1lo;

                public OOlI10o1ol(Ioo00OOI0II ioo00OOI0II, Ii00l101O ii00l101O) {
/* 4 */             this.I00000oOI = ioo00OOI0II;
/* 23 */            O010loOOi0Oo o010loOOi0Oo = new O010loOOi0Oo((O010OIi) ii00l101O.I00lli11(Iioi0lilII.I00iio));
/* 26 */            this.I0000oI00 = o010loOOi0Oo;
/* 43 */            this.I0001Ioi1lo = ii00l101O.I00ioIO(o010loOOi0Oo).I00ioIO(new Ii00oll("RawSourceChannel"));
/* 49 */            OIoO1Ol oIoO1Ol = new OIoO1Ol(12);
/* 52 */            oIoO1Ol.I00iiI = this;
/* 54 */            VarHandle.storeStoreFence();
/* 58 */            o010loOOi0Oo.I00IioO0OiOi(true, true, oIoO1Ol);
                }

                @Override
                public final void I0000O(Throwable th) {
/* 3 */             if (this.I0000Il00O != null) {
/* 40 */                return;
                    }
/* 7 */             if (th != null) {
/* 14 */                cancellationExceptionI00000oIO = th instanceof CancellationException ? (CancellationException) th : null;
/* 16 */                if (cancellationExceptionI00000oIO == null) {
/* 18 */                    String message = th.getMessage();
/* 22 */                    if (message == null) {
/* 24 */                        message = "Channel was cancelled";
                            }
/* 26 */                    cancellationExceptionI00000oIO = ilIiOIi0I.I00000oIO(message, th);
                        }
                    }
/* 33 */            this.I0000oI00.I000II(cancellationExceptionI00000oIO);
/* 38 */            if (this.I0000Il00O != null) {
/* 40 */                return;
                    }
/* 46 */            this.I0000Il00O = new IOO100(cancellationExceptionI00000oIO);
/* 50 */            this.I00000oOI.close();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Throwable I0000oI00() {
                    Throwable th;
/* 1 */             IOO100 ioo100 = this.I0000Il00O;
/* 3 */             if (ioo100 == null || (th = ioo100.I00000oIO) == 0) {
/* 43 */                return null;
                    }
                    return th instanceof IOollIi1OO0I ? ((IOollIi1OO0I) th).I00000oIO() : th instanceof CancellationException ? ilIiOIi0I.I00000oIO(((CancellationException) th).getMessage(), th) : new IOO1IOl1O10(th);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(int i, IOoilo iOoilo) throws Throwable {
                    OOlI10liilI oOlI10liilI;
/* 3 */             if (iOoilo instanceof OOlI10liilI) {
/* 6 */                 oOlI10liilI = (OOlI10liilI) iOoilo;
/* 8 */                 int i2 = oOlI10liilI.I00iio;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOlI10liilI.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOlI10liilI = new OOlI10liilI(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oOlI10liilI.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = oOlI10liilI.I00iio;
/* 33 */            III1oo00i1li iII1oo00i1li = this.I0000O;
/* 36 */            if (i3 == 0) {
/* 52 */                lIoii1l01l0i.I00000oOI(obj);
/* 57 */                if (this.I0000Il00O != null) {
/* 59 */                    Throwable thI0000oI00 = I0000oI00();
/* 63 */                    if (thI0000oI00 == null) {
/* 73 */                        return Boolean.valueOf(iII1oo00i1li.I00iiO >= ((long) i));
                            }
/* 78 */                    throw thI0000oI00;
                        }
/* 81 */                O1iOlO o1iOlO = new O1iOlO(this, i, (IOoil1iiIilo) null);
/* 84 */                oOlI10liilI.I00iOIl = i;
/* 86 */                oOlI10liilI.I00iio = 1;
/* 94 */                if (iOi1II01i0.I0000oI00(this.I0001Ioi1lo, o1iOlO, oOlI10liilI) == ii0111o) {
/* 96 */                    return ii0111o;
                        }
                    } else {
/* 38 */                if (i3 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 40 */                i = oOlI10liilI.I00iOIl;
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 105 */           return Boolean.valueOf(iII1oo00i1li.I00iiO >= ((long) i));
                }

                @Override
                public final III1oo00i1li I000II() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final boolean I000O01llI0() {
                    return this.I0000Il00O != null && this.I0000O.I00II0Ol1O0l();
                }
            }
