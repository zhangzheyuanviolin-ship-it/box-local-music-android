            package p000;

            import java.io.Closeable;
            
            public final class IlIOloI10 extends IoiOloi {
                public OO0IIO1Il I00iOIl;
                public IlIiOO0ilI I00iiI;
                public String I00iiO;
                public Closeable I00iio;
                public boolean I00ilI0I1;
                public OOliO0 I00ilO0;

                @Override
                public final ioOiI0O0I I000O01llI0() {
/* 1 */             return null;
                }

                @Override
                public final synchronized IIIIlO11I0lO I00iOIl() {
/* 4 */             if (this.I00ilI0I1) {
/* 38 */                throw new IllegalStateException("closed");
                    }
/* 6 */             OOliO0 oOliO0 = this.I00ilO0;
/* 8 */             if (oOliO0 != null) {
/* 11 */                return oOliO0;
                    }
/* 22 */            OOliO0 oOliO02 = new OOliO0(this.I00iiI.I00IioO0OiOi(this.I00iOIl));
/* 25 */            this.I00ilO0 = oOliO02;
/* 28 */            return oOliO02;
                }

                @Override
                public final synchronized void close() {
                    try {
/* 3 */                 this.I00ilI0I1 = true;
/* 5 */                 OOliO0 oOliO0 = this.I00ilO0;
/* 7 */                 if (oOliO0 != null) {
/* 9 */                     I000O01llI0.I00000oIO(oOliO0);
                        }
/* 15 */                Closeable closeable = this.I00iio;
/* 17 */                if (closeable != null) {
/* 19 */                    I000O01llI0.I00000oIO(closeable);
                        }
                    } catch (Throwable th) {
/* 55 */                throw th;
                    }
                }
            }
