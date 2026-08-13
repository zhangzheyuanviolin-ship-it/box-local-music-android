            package p000;

            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.net.Socket;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            
            public final class IoIOii01O implements Closeable {
                public static final Oio10I11IIi I00oliIiO01i;
                public OOll1O I00iOIl;
                public LinkedHashMap I00iiI;
                public String I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public boolean I00ilO0;
                public OloO0oOI1lI I00io1l;
                public OloO00ioIOO I00ioIO;
                public OloO00ioIOO I00l0I0l0lO1;
                public OloO00ioIOO I00l0OO0IO;
                public o0llIi I00li1OI;
                public long I00ll1;
                public long I00lli11;
                public long I00lll10;
                public long I00o0iI0io1;
                public Oio10I11IIi I00o0l1o1o0;
                public Oio10I11IIi I00o101lO;
                public long I00oI0i;
                public long I00oII;
                public long I00oIiI10;
                public long I00oO101o;
                public Socket I00oOio10iI1;
                public IoIiIIOI I00ol1;
                public I01illiil1Oo I00olI;
                public LinkedHashSet I00oli;

                static {
/* 3 */             Oio10I11IIi oio10I11IIi = new Oio10I11IIi();
/* 10 */            oio10I11IIi.I00000oOI(7, 65535);
/* 16 */            oio10I11IIi.I00000oOI(5, 16384);
/* 19 */            I00oliIiO01i = oio10I11IIi;
                }

                public final void I00000oIO(int i, int i2, IOException iOException) {
                    int i3;
                    Object[] array;
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
                    try {
/* 3 */                 I000O01llI0(i);
                    } catch (IOException unused) {
                    }
                    synchronized (this) {
/* 14 */                if (this.I00iiI.isEmpty()) {
/* 36 */                    array = null;
                        } else {
/* 24 */                    array = this.I00iiI.values().toArray(new IoIi1I11l11[0]);
/* 30 */                    this.I00iiI.clear();
                        }
                    }
/* 38 */            IoIi1I11l11[] ioIi1I11l11Arr = (IoIi1I11l11[]) array;
/* 40 */            if (ioIi1I11l11Arr != null) {
/* 43 */                for (IoIi1I11l11 ioIi1I11l11 : ioIi1I11l11Arr) {
                            try {
/* 47 */                        ioIi1I11l11.I0000Il00O(i2, iOException);
                            } catch (IOException unused2) {
                            }
                        }
                    }
                    try {
/* 55 */                this.I00ol1.close();
                    } catch (IOException unused3) {
                    }
                    try {
/* 60 */                this.I00oOio10iI1.close();
                    } catch (IOException unused4) {
                    }
/* 65 */            this.I00ioIO.I0000oI00();
/* 70 */            this.I00l0I0l0lO1.I0000oI00();
/* 75 */            this.I00l0OO0IO.I0000oI00();
                }

                public final synchronized IoIi1I11l11 I0000Il00O(int i) {
/* 12 */            return (IoIi1I11l11) this.I00iiI.get(Integer.valueOf(i));
                }

                public final synchronized IoIi1I11l11 I000II(int i) {
                    IoIi1I11l11 ioIi1I11l11;
/* 12 */            ioIi1I11l11 = (IoIi1I11l11) this.I00iiI.remove(Integer.valueOf(i));
/* 14 */            notifyAll();
/* 18 */            return ioIi1I11l11;
                }

                public final void I000O01llI0(int i) {
                    synchronized (this.I00ol1) {
                        synchronized (this) {
/* 7 */                     if (this.I00ilO0) {
/* 11 */                        return;
                            }
/* 15 */                    this.I00ilO0 = true;
/* 24 */                    this.I00ol1.I000O01llI0(OollIoI001lo.I00000oIO, this.I00iio, i);
                        }
                    }
                }

                public final synchronized void I000l1(long j) {
/* 4 */             long j2 = this.I00oI0i + j;
/* 5 */             this.I00oI0i = j2;
/* 9 */             long j3 = j2 - this.I00oII;
/* 21 */            if (j3 >= this.I00o0l1o1o0.I00000oIO() / 2) {
/* 24 */                I001l0I00(0, j3);
                        this.I00oII += j3;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
                
                    r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.I00ol1.I00iiO);
                    r6 = r2;
                    r8.I00oIiI10 += r6;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00100l0(int i, boolean z, III1o0lOio0 iII1o0lOio0, long j) {
                    int iMin;
                    long j2;
/* 6 */             if (j == 0) {
/* 10 */                this.I00ol1.I0000Il00O(z, i, iII1o0lOio0, 0);
/* 13 */                return;
                    }
/* 16 */            while (j > 0) {
                        synchronized (this) {
                            while (true) {
                                try {
                                    try {
/* 19 */                                long j3 = this.I00oIiI10;
/* 21 */                                long j4 = this.I00oO101o;
/* 25 */                                if (j3 < j4) {
                                            break;
                                        } else {
/* 37 */                                    if (!this.I00iiI.containsKey(Integer.valueOf(i))) {
/* 52 */                                        throw new IOException("stream closed");
                                            }
/* 39 */                                    wait();
                                        }
                                    } catch (InterruptedException unused) {
/* 94 */                                Thread.currentThread().interrupt();
/* 102 */                               throw new InterruptedIOException();
                                    }
                                } catch (Throwable th) {
/* 104 */                           throw th;
                                }
                            }
                        }
/* 74 */                j -= j2;
/* 86 */                this.I00ol1.I0000Il00O(z && j == 0, i, iII1o0lOio0, iMin);
                    }
                }

                public final void I001i1lo1io(int i, int i2) {
/* 41 */            this.I00ioIO.I0000Il00O(new IoIOIIi(this.I00iiO + '[' + i + "] writeSynReset", this, i, i2, 1), 0L);
                }

                public final void I001l0I00(int i, long j) {
/* 40 */            this.I00ioIO.I0000Il00O(new IoIOiOIIlo0(this.I00iiO + '[' + i + "] windowUpdate", this, i, j), 0L);
                }

                @Override
                public final void close() {
/* 5 */             I00000oIO(1, 9, null);
                }

                public final void flush() {
/* 3 */             this.I00ol1.flush();
                }
            }
