            package p000;

            import java.nio.ByteBuffer;
            
/* 20 */    public final class OOliIlo01o implements IIIIiol {
                public Ol0i0olI I00iOIl;
                public III1o0lOio0 I00iiI;
                public boolean I00iiO;

                public final IIIIiol I00000oIO() {
/* 1 */             III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 5 */             if (this.I00iiO) {
/* 25 */                I000II.I001IO000("closed");
/* 28 */                return null;
                    }
/* 7 */             long jI0000Il00O = iII1o0lOio0.I0000Il00O();
/* 15 */            if (jI0000Il00O > 0) {
/* 19 */                this.I00iOIl.write(iII1o0lOio0, jI0000Il00O);
                    }
/* 22 */            return this;
                }

                public final IIIIiol I0000Il00O(long j) {
                    boolean z;
/* 3 */             if (this.I00iiO) {
/* 119 */               I000II.I001IO000("closed");
/* 122 */               return null;
                    }
/* 5 */             III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 7 */             iII1o0lOio0.getClass();
/* 14 */            if (j == 0) {
/* 18 */                iII1o0lOio0.I00lll10(48);
                    } else {
/* 24 */                if (j < 0) {
/* 26 */                    j = -j;
/* 29 */                    if (j < 0) {
/* 33 */                        iII1o0lOio0.I00oo1iO0ll("-9223372036854775808");
                            } else {
/* 37 */                        z = true;
                            }
                        } else {
/* 39 */                    z = false;
                        }
/* 40 */                byte[] bArr = I00000oOI.I00000oIO;
/* 50 */                int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
/* 61 */                int i = iNumberOfLeadingZeros + (j > I00000oOI.I00000oOI[iNumberOfLeadingZeros] ? 1 : 0);
/* 62 */                if (z) {
/* 64 */                    i++;
                        }
/* 66 */                Oii1OOIOo oii1OOIOoI00iiI = iII1o0lOio0.I00iiI(i);
/* 70 */                byte[] bArr2 = oii1OOIOoI00iiI.I00000oIO;
/* 74 */                int i2 = oii1OOIOoI00iiI.I0000Il00O + i;
/* 77 */                while (j != 0) {
                            i2--;
/* 90 */                    bArr2[i2] = I00000oOI.I00000oIO[(int) (j % 10)];
/* 92 */                    j /= 10;
                        }
/* 94 */                if (z) {
/* 100 */                   bArr2[i2 - 1] = 45;
                        }
                        oii1OOIOoI00iiI.I0000Il00O += i;
                        iII1o0lOio0.I00iiI += i;
                    }
/* 113 */           I00000oIO();
/* 116 */           return this;
                }

                public final IIIIiol I000II(int i) {
/* 3 */             if (this.I00iiO) {
/* 16 */                I000II.I001IO000("closed");
/* 19 */                return null;
                    }
/* 7 */             this.I00iiI.I00oII(i);
/* 10 */            I00000oIO();
/* 13 */            return this;
                }

                @Override
                public final IIIIiol I00OilO00Il(String str) {
/* 3 */             if (this.I00iiO) {
/* 16 */                I000II.I001IO000("closed");
/* 19 */                return null;
                    }
/* 7 */             this.I00iiI.I00oo1iO0ll(str);
/* 10 */            I00000oIO();
/* 13 */            return this;
                }

                @Override
                public final IIIIiol I00i01iIIliI(long j) {
/* 3 */             if (this.I00iiO) {
/* 16 */                I000II.I001IO000("closed");
/* 19 */                return null;
                    }
/* 7 */             this.I00iiI.I00o0iI0io1(j);
/* 10 */            I00000oIO();
/* 13 */            return this;
                }

                @Override
                public final IIIIiol I00iIi0i1o(int i, int i2, String str) {
/* 3 */             if (this.I00iiO) {
/* 16 */                I000II.I001IO000("closed");
/* 19 */                return null;
                    }
/* 7 */             this.I00iiI.I00oliIiO01i(i, i2, str);
/* 10 */            I00000oIO();
/* 13 */            return this;
                }

                @Override
                public final void close() throws Throwable {
/* 1 */             Ol0i0olI ol0i0olI = this.I00iOIl;
/* 5 */             if (this.I00iiO) {
/* 113 */               return;
                    }
                    try {
/* 7 */                 III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 9 */                 long j = iII1o0lOio0.I00iiI;
/* 15 */                if (j > 0) {
/* 17 */                    ol0i0olI.write(iII1o0lOio0, j);
                        }
/* 23 */                th = null;
                    } catch (Throwable th) {
/* 21 */                th = th;
                    }
                    try {
/* 24 */                ol0i0olI.close();
                    } catch (Throwable th2) {
/* 29 */                if (th == null) {
/* 31 */                    th = th2;
                        }
                    }
/* 33 */            this.I00iiO = true;
/* 35 */            if (th != null) {
/* 38 */                throw th;
                    }
                }

                @Override
                public final void flush() {
/* 1 */             Ol0i0olI ol0i0olI = this.I00iOIl;
/* 5 */             if (this.I00iiO) {
/* 26 */                I000II.I001IO000("closed");
/* 29 */                return;
                    }
/* 7 */             III1o0lOio0 iII1o0lOio0 = this.I00iiI;
/* 9 */             long j = iII1o0lOio0.I00iiI;
/* 15 */            if (j > 0) {
/* 17 */                ol0i0olI.write(iII1o0lOio0, j);
                    }
/* 20 */            ol0i0olI.flush();
                }

                @Override
                public final boolean isOpen() {
/* 3 */             return !this.I00iiO;
                }

                @Override
                public final Oo11IoI timeout() {
/* 3 */             return this.I00iOIl.timeout();
                }

                public final String toString() {
/* 18 */            return "buffer(" + this.I00iOIl + ')';
                }

                @Override
                public final int write(ByteBuffer byteBuffer) {
/* 3 */             if (this.I00iiO) {
/* 17 */                I000II.I001IO000("closed");
/* 20 */                return 0;
                    }
/* 7 */             int iWrite = this.I00iiI.write(byteBuffer);
/* 11 */            I00000oIO();
/* 14 */            return iWrite;
                }

                @Override
                public final IIIIiol writeByte(int i) {
/* 3 */             if (this.I00iiO) {
/* 16 */                I000II.I001IO000("closed");
/* 19 */                return null;
                    }
/* 7 */             this.I00iiI.I00lll10(i);
/* 10 */            I00000oIO();
/* 13 */            return this;
                }

                @Override
/* 21 */        public final void write(III1o0lOio0 iII1o0lOio0, long j) {
/* 22 */            if (!this.I00iiO) {
/* 24 */                this.I00iiI.write(iII1o0lOio0, j);
/* 25 */                I00000oIO();
                    } else {
/* 26 */                I000II.I001IO000("closed");
                    }
                }
            }
