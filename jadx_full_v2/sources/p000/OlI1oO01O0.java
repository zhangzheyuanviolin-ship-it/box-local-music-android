            package p000;
            
            public final class OlI1oO01O0 extends IoiOloi {
                public final ioOiI0O0I I00iOIl;
                public boolean I00iiI;
                public IIIIlO11I0lO I00iiO;

                public OlI1oO01O0(IIIIlO11I0lO iIIIlO11I0lO, ioOiI0O0I iooii0o0i) {
/* 4 */             this.I00iOIl = iooii0o0i;
/* 6 */             this.I00iiO = iIIIlO11I0lO;
                }

                @Override
                public final ioOiI0O0I I000O01llI0() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final synchronized IIIIlO11I0lO I00iOIl() {
/* 4 */             if (this.I00iiI) {
/* 37 */                throw new IllegalStateException("closed");
                    }
/* 6 */             IIIIlO11I0lO iIIIlO11I0lO = this.I00iiO;
/* 8 */             if (iIIIlO11I0lO != null) {
/* 11 */                return iIIIlO11I0lO;
                    }
/* 21 */            OOliO0 oOliO0 = new OOliO0(IlIiOO0ilI.I00iOIl.I00IioO0OiOi(null));
/* 24 */            this.I00iiO = oOliO0;
/* 27 */            return oOliO0;
                }

                @Override
                public final synchronized void close() {
/* 3 */             this.I00iiI = true;
/* 5 */             IIIIlO11I0lO iIIIlO11I0lO = this.I00iiO;
/* 7 */             if (iIIIlO11I0lO != null) {
/* 9 */                 I000O01llI0.I00000oIO(iIIIlO11I0lO);
                    }
                }
            }
