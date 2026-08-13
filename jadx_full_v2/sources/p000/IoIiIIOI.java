            package p000;

            import java.io.Closeable;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class IoIiIIOI implements Closeable {
                public static final Logger I00ilO0 = Logger.getLogger(IoIO101IlO.class.getName());
                public OOliIlo01o I00iOIl;
                public III1o0lOio0 I00iiI;
                public int I00iiO;
                public boolean I00iio;
                public IoIIIIi I00ilI0I1;

                public final synchronized void I00000oIO(Oio10I11IIi oio10I11IIi) {
                    try {
/* 4 */                 if (this.I00iio) {
/* 122 */                   throw new IOException("closed");
                        }
/* 6 */                 int i = this.I00iiO;
/* 8 */                 int i2 = oio10I11IIi.I00000oIO;
/* 12 */                if ((i2 & 32) != 0) {
/* 17 */                    i = oio10I11IIi.I00000oOI[5];
                        }
/* 19 */                this.I00iiO = i;
/* 34 */                if (((i2 & 2) != 0 ? oio10I11IIi.I00000oOI[1] : -1) != -1) {
/* 36 */                    IoIIIIi ioIIIIi = this.I00ilI0I1;
/* 44 */                    int i3 = (i2 & 2) != 0 ? oio10I11IIi.I00000oOI[1] : -1;
/* 46 */                    ioIIIIi.getClass();
/* 51 */                    int iMin = Math.min(i3, 16384);
/* 55 */                    int i4 = ioIIIIi.I0000O;
/* 57 */                    if (i4 != iMin) {
/* 60 */                        if (iMin < i4) {
/* 68 */                            ioIIIIi.I00000oOI = Math.min(ioIIIIi.I00000oOI, iMin);
                                }
/* 70 */                        ioIIIIi.I0000Il00O = true;
/* 72 */                        ioIIIIi.I0000O = iMin;
/* 74 */                        int i5 = ioIIIIi.I000O01llI0;
/* 76 */                        if (iMin < i5) {
/* 78 */                            if (iMin == 0) {
/* 83 */                                I1IoiO1l.I00111O(ioIIIIi.I0000oI00, null);
/* 90 */                                ioIIIIi.I0001Ioi1lo = ioIIIIi.I0000oI00.length - 1;
/* 92 */                                ioIIIIi.I000II = 0;
/* 94 */                                ioIIIIi.I000O01llI0 = 0;
                                    } else {
/* 98 */                                ioIIIIi.I00000oIO(i5 - iMin);
                                    }
                                }
                            }
                        }
/* 105 */               I000II(0, 0, 4, 1);
/* 110 */               this.I00iOIl.flush();
                    } catch (Throwable th) {
/* 186 */               throw th;
                    }
                }

                public final synchronized void I0000Il00O(boolean z, int i, III1o0lOio0 iII1o0lOio0, int i2) {
/* 4 */             if (this.I00iio) {
/* 27 */                throw new IOException("closed");
                    }
/* 7 */             I000II(i, i2, 0, z ? 1 : 0);
/* 10 */            if (i2 > 0) {
/* 15 */                this.I00iOIl.write(iII1o0lOio0, i2);
                    }
                }

                public final void I000II(int i, int i2, int i3, int i4) {
/* 1 */             OOliIlo01o oOliIlo01o = this.I00iOIl;
/* 3 */             Level level = Level.FINE;
/* 5 */             Logger logger = I00ilO0;
/* 11 */            if (logger.isLoggable(level)) {
/* 18 */                logger.fine(IoIO101IlO.I00000oIO(false, i, i2, i3, i4));
                    }
/* 23 */            if (i2 > this.I00iiO) {
/* 483 */               throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.I00iiO + ": " + i2).toString());
                    }
/* 28 */            if ((Integer.MIN_VALUE & i) != 0) {
/* 75 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "reserved bit set: "));
/* 78 */                return;
                    }
/* 30 */            byte[] bArr = OollIoI001lo.I00000oIO;
/* 36 */            oOliIlo01o.writeByte((i2 >>> 16) & 255);
/* 43 */            oOliIlo01o.writeByte((i2 >>> 8) & 255);
/* 48 */            oOliIlo01o.writeByte(i2 & 255);
/* 53 */            oOliIlo01o.writeByte(i3 & 255);
/* 58 */            oOliIlo01o.writeByte(i4 & 255);
/* 65 */            oOliIlo01o.I000II(Integer.MAX_VALUE & i);
                }

                public final synchronized void I000O01llI0(byte[] bArr, int i, int i2) {
/* 4 */             if (this.I00iio) {
/* 86 */                throw new IOException("closed");
                    }
/* 11 */            if (IIlIOloOOO.I001lIiIIo1O(i2) == -1) {
/* 78 */                throw new IllegalArgumentException("errorCode.httpCode == -1");
                    }
/* 18 */            I000II(0, bArr.length + 8, 7, 0);
/* 23 */            this.I00iOIl.I000II(i);
/* 32 */            this.I00iOIl.I000II(IIlIOloOOO.I001lIiIIo1O(i2));
/* 36 */            if (bArr.length != 0) {
/* 39 */                OOliIlo01o oOliIlo01o = this.I00iOIl;
/* 43 */                if (oOliIlo01o.I00iiO) {
/* 70 */                    throw new IllegalStateException("closed");
                        }
/* 48 */                oOliIlo01o.I00iiI.I00ioIO(bArr.length, bArr);
/* 51 */                oOliIlo01o.I00000oIO();
                    }
/* 56 */            this.I00iOIl.flush();
                }

                public final synchronized void I000l1(boolean z, int i, ArrayList arrayList) {
/* 4 */             if (this.I00iio) {
/* 96 */                throw new IOException("closed");
                    }
/* 8 */             this.I00ilI0I1.I0000O(arrayList);
/* 13 */            long j = this.I00iiI.I00iiI;
/* 18 */            long jMin = Math.min(this.I00iiO, j);
/* 30 */            int i2 = j == jMin ? 4 : 0;
/* 31 */            if (z) {
/* 33 */                i2 |= 1;
                    }
/* 37 */            I000II(i, (int) jMin, 1, i2);
/* 44 */            this.I00iOIl.write(this.I00iiI, jMin);
/* 47 */            if (j > jMin) {
/* 49 */                long j2 = j - jMin;
/* 54 */                while (j2 > 0) {
/* 59 */                    long jMin2 = Math.min(this.I00iiO, j2);
/* 63 */                    j2 -= jMin2;
/* 74 */                    I000II(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
/* 81 */                    this.I00iOIl.write(this.I00iiI, jMin2);
                        }
                    }
                }

                public final synchronized void I00100l0(int i, int i2, boolean z) {
/* 4 */             if (this.I00iio) {
/* 39 */                throw new IOException("closed");
                    }
/* 10 */            I000II(0, 8, 6, z ? 1 : 0);
/* 15 */            this.I00iOIl.I000II(i);
/* 20 */            this.I00iOIl.I000II(i2);
/* 25 */            this.I00iOIl.flush();
                }

                public final synchronized void I001i1lo1io(int i, int i2) {
/* 4 */             if (this.I00iio) {
/* 52 */                throw new IOException("closed");
                    }
/* 11 */            if (IIlIOloOOO.I001lIiIIo1O(i2) == -1) {
/* 44 */                throw new IllegalArgumentException("Failed requirement.");
                    }
/* 16 */            I000II(i, 4, 3, 0);
/* 25 */            this.I00iOIl.I000II(IIlIOloOOO.I001lIiIIo1O(i2));
/* 30 */            this.I00iOIl.flush();
                }

                public final synchronized void I001l0I00(int i, long j) {
/* 6 */             if (this.I00iio) {
/* 72 */                throw new IOException("closed");
                    }
/* 12 */            if (j == 0 || j > 2147483647L) {
/* 64 */                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                    }
/* 25 */            I000II(i, 4, 8, 0);
/* 31 */            this.I00iOIl.I000II((int) j);
/* 36 */            this.I00iOIl.flush();
                }

                @Override
                public final synchronized void close() {
/* 3 */             this.I00iio = true;
/* 7 */             this.I00iOIl.close();
                }

                public final synchronized void flush() {
/* 4 */             if (this.I00iio) {
/* 22 */                throw new IOException("closed");
                    }
/* 8 */             this.I00iOIl.flush();
                }
            }
