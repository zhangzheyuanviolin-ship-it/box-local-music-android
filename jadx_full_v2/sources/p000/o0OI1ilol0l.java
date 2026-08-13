            package p000;

            import java.io.Closeable;
            
            public final class o0OI1ilol0l implements Runnable, Closeable {
                public o0OllIoI I00iOIl;
                public boolean I00iiI;
                public boolean I00iiO;
                public boolean I00iio;
                public boolean I00ilI0I1;

                public final void I00000oIO(I011IO1I11OI i011io1i11oi) {
/* 3 */             if (this.I00iiO) {
/* 26 */                I000II.I001IO000("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
                    } else if (this.I00iio) {
/* 20 */                I000II.I001IO000("Signal is already attached to future");
                    } else {
/* 10 */                this.I00iio = true;
/* 14 */                i011io1i11oi.addListener(this, Iii11Ooi.I00iOIl);
                    }
                }

                @Override
                public final void close() {
/* 1 */             o0OllIoI o0ollioi = this.I00iOIl;
                    try {
/* 4 */                 this.I00iOIl = null;
/* 6 */                 boolean z = this.I00iio;
/* 8 */                 if (!z) {
/* 13 */                    if (this.I00iiO) {
/* 59 */                        throw new IllegalStateException("Span was already closed!");
                            }
/* 16 */                    this.I00iiO = true;
/* 20 */                    if (this.I00iiI && !z) {
/* 28 */                        iO1lilOi.I00000oIO(Thread.currentThread());
                            }
                        }
/* 31 */                if (o0ollioi != null) {
/* 35 */                    ((o01iIll0IO) o0ollioi).close();
                        }
/* 40 */                if (this.I00ilI0I1) {
/* 48 */                    o0IOOIili01o.I00000oOI(o0IOOIili01o.I0000Il00O(), o0O11Oi0i0l.I00io1l);
                        }
                    } catch (Throwable th) {
/* 61 */                if (o0ollioi != null) {
                            try {
/* 65 */                        ((o01iIll0IO) o0ollioi).close();
                            } catch (Throwable th2) {
/* 70 */                        th.addSuppressed(th2);
                            }
                        }
/* 110 */               throw th;
                    }
                }

                @Override
                public final void run() {
                    boolean z;
/* 3 */             if (this.I00iiO || !(z = this.I00iio)) {
/* 33 */                iO1lilOi.I00000oOI().post(Iioo110oI.I00iio);
/* 55 */                return;
                    }
/* 11 */            this.I00iiO = true;
/* 15 */            if (!this.I00iiI || z) {
/* 26 */                return;
                    }
/* 23 */            iO1lilOi.I00000oIO(Thread.currentThread());
                }
            }
