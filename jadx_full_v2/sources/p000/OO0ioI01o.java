            package p000;
            
            public final class OO0ioI01o implements OlI1ii {
                public final IIIIlO11I0lO I00iOIl;
                public final III1o0lOio0 I00iiI;
                public Oii1OOIOo I00iiO;
                public int I00iio;
                public boolean I00ilI0I1;
                public long I00ilO0;

                public OO0ioI01o(IIIIlO11I0lO iIIIlO11I0lO) {
/* 4 */             this.I00iOIl = iIIIlO11I0lO;
/* 6 */             III1o0lOio0 iII1o0lOio0I0000oI00 = iIIIlO11I0lO.I0000oI00();
/* 10 */            this.I00iiI = iII1o0lOio0I0000oI00;
/* 12 */            Oii1OOIOo oii1OOIOo = iII1o0lOio0I0000oI00.I00iOIl;
/* 14 */            this.I00iiO = oii1OOIOo;
/* 22 */            this.I00iio = oii1OOIOo != null ? oii1OOIOo.I00000oOI : -1;
                }

                @Override
                public final void close() {
/* 2 */             this.I00ilI0I1 = true;
                }

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) {
                    Oii1OOIOo oii1OOIOo;
                    Oii1OOIOo oii1OOIOo2;
/* 5 */             if (j < 0) {
/* 102 */               I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 1 */                 return 0L;
                    }
/* 9 */             if (this.I00ilI0I1) {
/* 92 */                I000II.I001IO000("closed");
/* 1 */                 return 0L;
                    }
/* 11 */            Oii1OOIOo oii1OOIOo3 = this.I00iiO;
/* 13 */            III1o0lOio0 iII1o0lOio02 = this.I00iiI;
/* 15 */            if (oii1OOIOo3 != null && (oii1OOIOo3 != (oii1OOIOo2 = iII1o0lOio02.I00iOIl) || this.I00iio != oii1OOIOo2.I00000oOI)) {
/* 30 */                I000II.I001IO000("Peek source is invalid because upstream source was used");
/* 1 */                 return 0L;
                    }
/* 34 */            if (j == 0) {
/* 1 */                 return 0L;
                    }
/* 48 */            if (!this.I00iOIl.I000lI(this.I00ilO0 + 1)) {
/* 50 */                return -1L;
                    }
/* 55 */            if (this.I00iiO == null && (oii1OOIOo = iII1o0lOio02.I00iOIl) != null) {
/* 61 */                this.I00iiO = oii1OOIOo;
/* 65 */                this.I00iio = oii1OOIOo.I00000oOI;
                    }
/* 72 */            long jMin = Math.min(j, iII1o0lOio02.I00iiI - this.I00ilO0);
/* 81 */            this.I00iiI.I000II(iII1o0lOio0, this.I00ilO0, jMin);
                    this.I00ilO0 += jMin;
/* 89 */            return jMin;
                }

                @Override
                public final Oo11IoI timeout() {
/* 3 */             return this.I00iOIl.timeout();
                }
            }
