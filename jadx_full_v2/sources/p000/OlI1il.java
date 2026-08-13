            package p000;

            import java.io.IOException;
            import java.util.concurrent.CancellationException;
            
            public final class OlI1il implements IIIoloiiI1 {
                public III1oo00i1li I00000oOI;
                private volatile IOO100 closed;

                @Override
                public final void I0000O(Throwable th) {
                    String message;
/* 3 */             if (this.closed != null) {
/* 5 */                 return;
                    }
/* 10 */            if (th == null || (message = th.getMessage()) == null) {
/* 18 */                message = "Channel was cancelled";
                    }
/* 26 */            this.closed = new IOO100(new IOException(message, th));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Throwable I0000oI00() {
                    Throwable th;
/* 1 */             IOO100 ioo100 = this.closed;
/* 3 */             if (ioo100 == null || (th = ioo100.I00000oIO) == 0) {
/* 44 */                return null;
                    }
                    return th instanceof IOollIi1OO0I ? ((IOollIi1OO0I) th).I00000oIO() : th instanceof CancellationException ? ilIiOIi0I.I00000oIO(((CancellationException) th).getMessage(), ioo100.I00000oIO) : new IOO1IOl1O10(th);
                }

                @Override
                public final Object I0001Ioi1lo(int i, IOoilo iOoilo) throws Throwable {
/* 1 */             Throwable thI0000oI00 = I0000oI00();
/* 5 */             if (thI0000oI00 == null) {
/* 14 */                return Boolean.valueOf(this.I00000oOI.I000lI(i));
                    }
/* 89 */            throw thI0000oI00;
                }

                @Override
                public final III1oo00i1li I000II() throws Throwable {
/* 1 */             Throwable thI0000oI00 = I0000oI00();
/* 5 */             if (thI0000oI00 == null) {
/* 7 */                 return this.I00000oOI;
                    }
/* 29 */            throw thI0000oI00;
                }

                @Override
                public final boolean I000O01llI0() {
/* 3 */             return this.I00000oOI.I00II0Ol1O0l();
                }
            }
