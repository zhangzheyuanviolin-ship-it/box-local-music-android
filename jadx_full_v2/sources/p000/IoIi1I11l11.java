            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            
            public final class IoIi1I11l11 {
                public final int I00000oIO;
                public final IoIOii01O I00000oOI;
                public long I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public long I0001Ioi1lo;
                public final ArrayDeque I000II;
                public boolean I000O01llI0;
                public final IoIOlili01I I000OOo1O;
                public final IoIOli I000OiO;
                public final IoIi0OIOO0 I000iOII;
                public final IoIi0OIOO0 I000l1;
                public int I000lI;
                public IOException I000o00OoI0I;

                public IoIi1I11l11(int i, IoIOii01O ioIOii01O, boolean z, boolean z2, Io1Io0OOi011 io1Io0OOi011) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = ioIOii01O;
/* 15 */            this.I0001Ioi1lo = ioIOii01O.I00o101lO.I00000oIO();
/* 19 */            ArrayDeque arrayDeque = new ArrayDeque();
/* 22 */            this.I000II = arrayDeque;
/* 28 */            long jI00000oIO = ioIOii01O.I00o0l1o1o0.I00000oIO();
/* 33 */            IoIOlili01I ioIOlili01I = new IoIOlili01I();
/* 36 */            ioIOlili01I.I00ilO0 = this;
/* 38 */            ioIOlili01I.I00iOIl = jI00000oIO;
/* 40 */            ioIOlili01I.I00iiI = z2;
/* 47 */            ioIOlili01I.I00iiO = new III1o0lOio0();
/* 54 */            ioIOlili01I.I00iio = new III1o0lOio0();
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            this.I000OOo1O = ioIOlili01I;
/* 63 */            IoIOli ioIOli = new IoIOli();
/* 66 */            ioIOli.I00iio = this;
/* 68 */            ioIOli.I00iOIl = z;
/* 75 */            ioIOli.I00iiI = new III1o0lOio0();
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            this.I000OiO = ioIOli;
/* 87 */            this.I000iOII = new IoIi0OIOO0(this);
/* 94 */            this.I000l1 = new IoIi0OIOO0(this);
/* 97 */            if (io1Io0OOi011 == null) {
/* 119 */               if (I000II()) {
/* 121 */                   return;
                        }
/* 124 */               I000II.I001IO000("remotely-initiated streams should have headers");
/* 966 */               throw null;
                    }
/* 103 */           if (I000II()) {
/* 111 */               I000II.I001IO000("locally-initiated streams shouldn't have headers yet");
/* 114 */               throw null;
                    }
/* 105 */           arrayDeque.add(io1Io0OOi011);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO() {
                    boolean z;
                    boolean zI000O01llI0;
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
                    synchronized (this) {
                        try {
/* 4 */                     IoIOlili01I ioIOlili01I = this.I000OOo1O;
/* 8 */                     if (ioIOlili01I.I00iiI || !ioIOlili01I.I00ilI0I1) {
/* 29 */                        z = false;
                            } else {
/* 14 */                        IoIOli ioIOli = this.I000OiO;
/* 18 */                        if (ioIOli.I00iOIl || ioIOli.I00iiO) {
/* 27 */                            z = true;
                                }
                            }
/* 30 */                    zI000O01llI0 = I000O01llI0();
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
/* 35 */            if (z) {
/* 40 */                I0000Il00O(9, null);
                    } else {
/* 44 */                if (zI000O01llI0) {
/* 53 */                    return;
                        }
/* 50 */                this.I00000oOI.I000II(this.I00000oIO);
                    }
                }

                public final void I00000oOI() throws IOException {
/* 1 */             IoIOli ioIOli = this.I000OiO;
/* 5 */             if (ioIOli.I00iiO) {
/* 35 */                IioIoO10iOiI.I000OOo1O("stream closed");
/* 113 */               return;
                    }
/* 9 */             if (ioIOli.I00iOIl) {
/* 29 */                IioIoO10iOiI.I000OOo1O("stream finished");
/* 32 */                return;
                    }
/* 11 */            int i = this.I000lI;
/* 13 */            if (i != 0) {
/* 15 */                IOException iOException = this.I000o00OoI0I;
/* 17 */                if (iOException == null) {
/* 25 */                    throw new OlOO0IOl0i1(i);
                        }
                    }
                }

                public final void I0000Il00O(int i, IOException iOException) {
/* 5 */             if (I0000O(i, iOException)) {
/* 14 */                this.I00000oOI.I00ol1.I001i1lo1io(this.I00000oIO, i);
                    }
                }

                public final boolean I0000O(int i, IOException iOException) {
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
                    synchronized (this) {
/* 7 */                 if (this.I000lI != 0) {
/* 6 */                     return false;
                        }
/* 11 */                this.I000lI = i;
/* 13 */                this.I000o00OoI0I = iOException;
/* 15 */                notifyAll();
/* 22 */                if (this.I000OOo1O.I00iiI) {
/* 28 */                    if (this.I000OiO.I00iOIl) {
/* 6 */                         return false;
                            }
                        }
/* 39 */                this.I00000oOI.I000II(this.I00000oIO);
/* 42 */                return true;
                    }
                }

                public final void I0000oI00(int i) {
/* 6 */             if (I0000O(i, null)) {
/* 13 */                this.I00000oOI.I001i1lo1io(this.I00000oIO, i);
                    }
                }

                public final IoIOli I0001Ioi1lo() {
                    synchronized (this) {
/* 4 */                 if (!this.I000O01llI0 && !I000II()) {
/* 20 */                    throw new IllegalStateException("reply before requesting the sink");
                        }
                    }
/* 24 */            return this.I000OiO;
                }

                public final boolean I000II() {
/* 10 */            boolean z = (this.I00000oIO & 1) == 1;
/* 13 */            this.I00000oOI.getClass();
                    return true == z;
                }

                public final synchronized boolean I000O01llI0() {
                    try {
/* 5 */                 if (this.I000lI != 0) {
/* 4 */                     return false;
                        }
/* 9 */                 IoIOlili01I ioIOlili01I = this.I000OOo1O;
/* 13 */                if (ioIOlili01I.I00iiI || ioIOlili01I.I00ilI0I1) {
/* 22 */                    IoIOli ioIOli = this.I000OiO;
/* 26 */                    if (ioIOli.I00iOIl || ioIOli.I00iiO) {
/* 34 */                        if (this.I000O01llI0) {
/* 4 */                             return false;
                                }
                            }
                        }
/* 39 */                return true;
                    } catch (Throwable th) {
/* 113 */               throw th;
                    }
                }

                public final void I000OOo1O(Io1Io0OOi011 io1Io0OOi011, boolean z) {
                    boolean zI000O01llI0;
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
                    synchronized (this) {
                        try {
/* 7 */                     if (this.I000O01llI0 && z) {
/* 14 */                        this.I000OOo1O.getClass();
                            } else {
/* 20 */                        this.I000O01llI0 = true;
/* 24 */                        this.I000II.add(io1Io0OOi011);
                            }
/* 27 */                    if (z) {
/* 31 */                        this.I000OOo1O.I00iiI = true;
                            }
/* 33 */                    zI000O01llI0 = I000O01llI0();
/* 37 */                    notifyAll();
                        } catch (Throwable th) {
/* 89 */                    throw th;
                        }
                    }
/* 41 */            if (zI000O01llI0) {
/* 50 */                return;
                    }
/* 47 */            this.I00000oOI.I000II(this.I00000oIO);
                }
            }
