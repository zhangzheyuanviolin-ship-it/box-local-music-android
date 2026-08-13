            package p000;

            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.Reference;
            import java.net.Socket;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.logging.Level;
            
            public final class OOlioiIOOO1 implements Cloneable {
                public final OIOlo0OloOi I00iOIl;
                public final I0Oi111ii I00iiI;
                public final IioiI0IIIIO I00iiO;
                public final OOlio0l0lO I00iio;
                public final AtomicBoolean I00ilI0I1;
                public Throwable I00ilO0;
                public Il11O1o I00io1l;
                public OOll1O I00ioIO;
                public IOI0oloi01 I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public boolean I00li1OI;
                public boolean I00ll1;
                public volatile boolean I00lli11;
                public volatile IOI0oloi01 I00lll10;
                public volatile OOll1O I00o0iI0io1;

                public OOlioiIOOO1(OIOlo0OloOi oIOlo0OloOi, I0Oi111ii i0Oi111ii) {
/* 4 */             this.I00iOIl = oIOlo0OloOi;
/* 6 */             this.I00iiI = i0Oi111ii;
/* 14 */            this.I00iiO = (IioiI0IIIIO) oIOlo0OloOi.I00iiI.I00iOIl;
/* 18 */            oIOlo0OloOi.I00ilI0I1.getClass();
/* 23 */            OOlio0l0lO oOlio0l0lO = new OOlio0l0lO(this);
/* 28 */            oOlio0l0lO.I000II(0L);
/* 31 */            this.I00iio = oOlio0l0lO;
/* 38 */            this.I00ilI0I1 = new AtomicBoolean();
/* 41 */            this.I00ll1 = true;
                }

                public final void I00000oIO(OOll1O oOll1O) {
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 5 */             if (this.I00ioIO != null) {
/* 29 */                I000II.I001IO000("Check failed.");
/* 49 */                return;
                    }
/* 7 */             this.I00ioIO = oOll1O;
/* 9 */             ArrayList arrayList = oOll1O.I000oI1ioi;
/* 13 */            Throwable th = this.I00ilO0;
/* 15 */            OOliiO0 oOliiO0 = new OOliiO0(this);
/* 18 */            oOliiO0.I00000oIO = th;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            arrayList.add(oOliiO0);
                }

                public final IOException I00000oOI(IOException iOException) throws IOException {
                    Socket socketI000OiO;
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 3 */             OOll1O oOll1O = this.I00ioIO;
/* 5 */             if (oOll1O != null) {
                        synchronized (oOll1O) {
/* 8 */                     socketI000OiO = I000OiO();
                        }
/* 15 */                if (this.I00ioIO == null) {
/* 17 */                    if (socketI000OiO != null) {
/* 19 */                        OollIoI001lo.I0000oI00(socketI000OiO);
                            }
                        } else if (socketI000OiO != null) {
/* 28 */                    I000II.I001IO000("Check failed.");
/* 31 */                    return null;
                        }
                    }
/* 42 */            if (!this.I00iio.I000OOo1O()) {
/* 186 */               return iOException;
                    }
/* 49 */            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
/* 52 */            if (iOException != null) {
/* 54 */                interruptedIOException.initCause(iOException);
                    }
/* 57 */            return interruptedIOException;
                }

                public final void I0000Il00O() {
/* 1 */             OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 5 */             OO1I1IllO.I00000oIO.getClass();
/* 27 */            this.I00ilO0 = OO1I1IllO.I00000oOI.isLoggable(Level.FINE) ? new Throwable("response.body().close()") : null;
                }

                public final void I0000O() throws IOException {
                    Socket socket;
/* 3 */             if (this.I00lli11) {
/* 5 */                 return;
                    }
/* 7 */             this.I00lli11 = true;
/* 9 */             IOI0oloi01 iOI0oloi01 = this.I00lll10;
/* 11 */            if (iOI0oloi01 != null) {
/* 17 */                ((Il111ol) iOI0oloi01.I0000O).cancel();
                    }
/* 20 */            OOll1O oOll1O = this.I00o0iI0io1;
/* 22 */            if (oOll1O == null || (socket = oOll1O.I00000oOI) == null) {
/* 113 */               return;
                    }
/* 28 */            OollIoI001lo.I0000oI00(socket);
                }

                public final Oi1001l0Il I0000oI00() {
/* 9 */             if (!this.I00ilI0I1.compareAndSet(false, true)) {
/* 67 */                I000II.I001IO000("Already Executed");
/* 70 */                return null;
                    }
/* 13 */            this.I00iio.I000O01llI0();
/* 16 */            I0000Il00O();
                    try {
/* 21 */                o01l1ioOo0 o01l1iooo0 = this.I00iOIl.I00iOIl;
                        synchronized (o01l1iooo0) {
/* 28 */                    ((ArrayDeque) o01l1iooo0.I00iio).add(this);
                        }
/* 32 */                return I000II();
                    } finally {
/* 55 */                o01l1ioOo0 o01l1iooo02 = this.I00iOIl.I00iOIl;
/* 61 */                o01l1iooo02.I0001Ioi1lo((ArrayDeque) o01l1iooo02.I00iio, this);
                    }
                }

                public final void I0001Ioi1lo(boolean z) {
                    IOI0oloi01 iOI0oloi01;
                    synchronized (this) {
/* 4 */                 if (!this.I00ll1) {
/* 39 */                    throw new IllegalStateException("released");
                        }
                    }
/* 8 */             if (z && (iOI0oloi01 = this.I00lll10) != null) {
/* 18 */                ((Il111ol) iOI0oloi01.I0000O).cancel();
/* 26 */                ((OOlioiIOOO1) iOI0oloi01.I00000oOI).I000O01llI0(iOI0oloi01, true, true, null);
                    }
/* 29 */            this.I00l0I0l0lO1 = null;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Oi1001l0Il I000II() throws Throwable {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            IOOii0O10Io0.I00100l0(arrayList, this.I00iOIl.I00iiO);
/* 17 */            OIOlo0OloOi oIOlo0OloOi = this.I00iOIl;
/* 19 */            int i = 1;
/* 20 */            II1ooii11i iI1ooii11i = new II1ooii11i(i);
/* 23 */            iI1ooii11i.I00000oOI = oIOlo0OloOi;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            arrayList.add(iI1ooii11i);
/* 35 */            o0llIi o0llii = this.I00iOIl.I00l0OO0IO;
/* 38 */            II1ooii11i iI1ooii11i2 = new II1ooii11i(0);
/* 41 */            iI1ooii11i2.I00000oOI = o0llii;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            arrayList.add(iI1ooii11i2);
/* 54 */            arrayList.add(new IOlo0iiO1(i));
/* 59 */            arrayList.add(IOlo0iiO1.I00000oOI);
/* 68 */            IOOii0O10Io0.I00100l0(arrayList, this.I00iOIl.I00iio);
/* 74 */            IOlo0iiO1 iOlo0iiO1 = new IOlo0iiO1(2);
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            arrayList.add(iOlo0iiO1);
/* 85 */            I0Oi111ii i0Oi111ii = this.I00iiI;
/* 87 */            OIOlo0OloOi oIOlo0OloOi2 = this.I00iOIl;
                    try {
/* 102 */               Oi1001l0Il oi1001l0IlI00000oOI = new OOlli0I(this, arrayList, 0, null, i0Oi111ii, oIOlo0OloOi2.I00oIiI10, oIOlo0OloOi2.I00oO101o, oIOlo0OloOi2.I00oOio10iI1).I00000oOI(i0Oi111ii);
/* 108 */               if (this.I00lli11) {
/* 114 */                   OollIoI001lo.I0000O(oi1001l0IlI00000oOI);
/* 124 */                   throw new IOException("Canceled");
                        }
/* 110 */               I000OOo1O(null);
/* 113 */               return oi1001l0IlI00000oOI;
                    } catch (IOException e) {
                        try {
/* 133 */                   throw I000OOo1O(e);
                        } catch (Throwable th) {
/* 134 */                   th = th;
/* 135 */                   if (i == 0) {
/* 137 */                       I000OOo1O(null);
                            }
/* 541 */                   throw th;
                        }
                    } catch (Throwable th2) {
/* 125 */               th = th2;
/* 126 */               i = 0;
/* 135 */               if (i == 0) {
                        }
/* 541 */               throw th;
                    }
                }

                public final IOException I000O01llI0(IOI0oloi01 iOI0oloi01, boolean z, boolean z2, IOException iOException) {
                    boolean z3;
                    boolean z4;
/* 7 */             if (iOI0oloi01.equals(this.I00lll10)) {
                        synchronized (this) {
/* 12 */                    z3 = false;
/* 13 */                    if (z) {
                                try {
/* 17 */                            if (!this.I00l0OO0IO) {
/* 22 */                                if (z2 || !this.I00li1OI) {
/* 63 */                                    z4 = false;
                                        }
                                    }
/* 28 */                            if (z) {
/* 30 */                                this.I00l0OO0IO = false;
                                    }
/* 32 */                            if (z2) {
/* 34 */                                this.I00li1OI = false;
                                    }
/* 36 */                            boolean z5 = this.I00l0OO0IO;
/* 46 */                            boolean z6 = (z5 || this.I00li1OI) ? false : true;
/* 47 */                            if (!z5 && !this.I00li1OI) {
/* 55 */                                if (!this.I00ll1) {
/* 57 */                                    z3 = true;
                                        }
                                    }
/* 58 */                            z4 = z3;
/* 59 */                            z3 = z6;
                                } catch (Throwable th) {
/* 62 */                            throw th;
                                }
                            } else {
/* 22 */                        if (z2) {
                                }
/* 63 */                        z4 = false;
                            }
                        }
/* 65 */                if (z3) {
/* 68 */                    this.I00lll10 = null;
/* 70 */                    OOll1O oOll1O = this.I00ioIO;
/* 72 */                    if (oOll1O != null) {
                                synchronized (oOll1O) {
                                    oOll1O.I000l1++;
                                }
                            }
                        }
/* 85 */                if (z4) {
/* 87 */                    return I00000oOI(iOException);
                        }
                    }
/* 483 */           return iOException;
                }

                public final IOException I000OOo1O(IOException iOException) {
                    boolean z;
                    synchronized (this) {
/* 4 */                 z = false;
/* 5 */                 if (this.I00ll1) {
/* 7 */                     this.I00ll1 = false;
/* 11 */                    if (!this.I00l0OO0IO) {
/* 15 */                        if (!this.I00li1OI) {
/* 17 */                            z = true;
                                }
                            }
                        }
                    }
                    return z ? I00000oOI(iOException) : iOException;
                }

                public final Socket I000OiO() {
/* 1 */             OOll1O oOll1O = this.I00ioIO;
/* 3 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 5 */             ArrayList arrayList = oOll1O.I000oI1ioi;
/* 7 */             Iterator it = arrayList.iterator();
/* 11 */            int i = 0;
                    while (true) {
/* 17 */                if (!it.hasNext()) {
/* 39 */                    i = -1;
                            break;
                        }
/* 33 */                if (O0000Ioio00.I0000O(((Reference) it.next()).get(), this)) {
                            break;
                        }
/* 36 */                i++;
                    }
/* 41 */            if (i == -1) {
/* 107 */               I000II.I001IO000("Check failed.");
/* 40 */                return null;
                    }
/* 43 */            arrayList.remove(i);
/* 46 */            this.I00ioIO = null;
/* 52 */            if (!arrayList.isEmpty()) {
/* 40 */                return null;
                    }
/* 58 */            oOll1O.I00100l0 = System.nanoTime();
/* 60 */            IioiI0IIIIO iioiI0IIIIO = this.I00iiO;
/* 64 */            OloO00ioIOO oloO00ioIOO = (OloO00ioIOO) iioiI0IIIIO.I00000oOI;
/* 68 */            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) iioiI0IIIIO.I0000O;
/* 70 */            byte[] bArr2 = OollIoI001lo.I00000oIO;
/* 74 */            if (!oOll1O.I000OOo1O) {
/* 82 */                oloO00ioIOO.I0000Il00O((IoIOOii1OOi) iioiI0IIIIO.I0000Il00O, 0L);
/* 40 */                return null;
                    }
/* 87 */            oOll1O.I000OOo1O = true;
/* 89 */            concurrentLinkedQueue.remove(oOll1O);
/* 96 */            if (concurrentLinkedQueue.isEmpty()) {
/* 98 */                oloO00ioIOO.I00000oIO();
                    }
/* 101 */           return oOll1O.I0000Il00O;
                }

                public final Object clone() {
/* 7 */             return new OOlioiIOOO1(this.I00iOIl, this.I00iiI);
                }
            }
