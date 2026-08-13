            package p000;

            import java.io.EOFException;
            
            public final class OOlll0Oi1 implements OlI1iil1l0 {
                public OO0ioOIlo I00iOIl;
                public boolean I00iiI;
                public III1oo00i1li I00iiO;

                @Override
                public final III1oo00i1li I0000oI00() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final boolean I000lI(long j) {
                    III1oo00i1li iII1oo00i1li;
/* 4 */             if (this.I00iiI) {
/* 49 */                I000II.I001IO000("Source is closed.");
/* 3 */                 return false;
                    }
/* 10 */            if (j < 0) {
/* 43 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount: "));
/* 3 */                 return false;
                    }
/* 32 */            do {
/* 12 */                iII1oo00i1li = this.I00iiO;
/* 18 */                if (iII1oo00i1li.I00iiO >= j) {
/* 35 */                    return true;
                        }
/* 32 */            } while (this.I00iOIl.I00II0oii1o(iII1oo00i1li, 8192L) != -1);
/* 3 */             return false;
                }

                @Override
                public final void I00100o1O0lo(long j) throws EOFException {
/* 5 */             if (!I000lI(j)) {
/* 49 */                throw new EOFException(IlIi0I0.I000l1(j, "Source doesn't contain required number of bytes (", ")."));
                    }
                }

                @Override
                public final boolean I00II0Ol1O0l() {
/* 1 */             III1oo00i1li iII1oo00i1li = this.I00iiO;
/* 6 */             if (!this.I00iiI) {
                        return iII1oo00i1li.I00II0Ol1O0l() && this.I00iOIl.I00II0oii1o(iII1oo00i1li, 8192L) == -1;
                    }
/* 33 */            I000II.I001IO000("Source is closed.");
/* 5 */             return false;
                }

                @Override
                public final long I00II0oii1o(III1oo00i1li iII1oo00i1li, long j) {
/* 1 */             III1oo00i1li iII1oo00i1li2 = this.I00iiO;
/* 7 */             if (this.I00iiI) {
/* 57 */                I000II.I001IO000("Source is closed.");
/* 5 */                 return 0L;
                    }
/* 11 */            if (j < 0) {
/* 51 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount: "));
/* 5 */                 return 0L;
                    }
/* 17 */            if (iII1oo00i1li2.I00iiO == 0 && this.I00iOIl.I00II0oii1o(iII1oo00i1li2, 8192L) == -1) {
/* 27 */                return -1L;
                    }
/* 40 */            return iII1oo00i1li2.I00II0oii1o(iII1oo00i1li, Math.min(j, iII1oo00i1li2.I00iiO));
                }

                @Override
                public final void close() throws EOFException {
/* 3 */             if (this.I00iiI) {
/* 5 */                 return;
                    }
/* 7 */             this.I00iiI = true;
/* 11 */            this.I00iOIl.I00ilI0I1 = true;
/* 13 */            III1oo00i1li iII1oo00i1li = this.I00iiO;
/* 17 */            iII1oo00i1li.skip(iII1oo00i1li.I00iiO);
                }

                @Override
                public final byte readByte() throws EOFException {
/* 3 */             I00100o1O0lo(1L);
/* 8 */             return this.I00iiO.readByte();
                }

                public final String toString() {
/* 18 */            return "buffered(" + this.I00iOIl + ')';
                }
            }
