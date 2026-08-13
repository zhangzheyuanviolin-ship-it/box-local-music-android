            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.SynchronousQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Logger;
            
            public final class OloO0oOI1lI {
                public static final OloO0oOI1lI I000O01llI0;
                public static final Logger I000OOo1O;
                public I0IIiO0iI I00000oIO;
                public int I00000oOI;
                public boolean I0000Il00O;
                public long I0000O;
                public ArrayList I0000oI00;
                public ArrayList I0001Ioi1lo;
                public I0lil01 I000II;

                static {
/* 14 */            String strI00100l0 = IIl001iO0Io.I00100l0(new StringBuilder(), OollIoI001lo.I000II, " TaskRunner");
/* 20 */            Ooll0O0llOl1 ooll0O0llOl1 = new Ooll0O0llOl1();
/* 23 */            ooll0O0llOl1.I00000oIO = strI00100l0;
/* 26 */            ooll0O0llOl1.I00000oOI = true;
/* 28 */            VarHandle.storeStoreFence();
/* 33 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(23);
/* 54 */            i0IIiO0iI.I00iiI = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ooll0O0llOl1);
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            OloO0oOI1lI oloO0oOI1lI = new OloO0oOI1lI();
/* 62 */            oloO0oOI1lI.I00000oIO = i0IIiO0iI;
/* 66 */            oloO0oOI1lI.I00000oOI = 10000;
/* 73 */            oloO0oOI1lI.I0000oI00 = new ArrayList();
/* 80 */            oloO0oOI1lI.I0001Ioi1lo = new ArrayList();
/* 86 */            I0lil01 i0lil01 = new I0lil01(13);
/* 89 */            i0lil01.I00iiI = oloO0oOI1lI;
/* 91 */            VarHandle.storeStoreFence();
/* 94 */            oloO0oOI1lI.I000II = i0lil01;
/* 96 */            VarHandle.storeStoreFence();
/* 99 */            I000O01llI0 = oloO0oOI1lI;
/* 111 */           I000OOo1O = Logger.getLogger(OloO0oOI1lI.class.getName());
                }

                public final void I00000oIO(OloIi00i oloIi00i, long j) {
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 3 */             OloO00ioIOO oloO00ioIOO = oloIi00i.I0000Il00O;
/* 7 */             if (oloO00ioIOO.I0000O != oloIi00i) {
/* 54 */                I000II.I001IO000("Check failed.");
/* 89 */                return;
                    }
/* 9 */             boolean z = oloO00ioIOO.I0001Ioi1lo;
/* 12 */            oloO00ioIOO.I0001Ioi1lo = false;
/* 15 */            oloO00ioIOO.I0000O = null;
/* 19 */            this.I0000oI00.remove(oloO00ioIOO);
/* 26 */            if (j != -1 && !z && !oloO00ioIOO.I0000Il00O) {
/* 35 */                oloO00ioIOO.I0000O(oloIi00i, j, true);
                    }
/* 44 */            if (oloO00ioIOO.I0000oI00.isEmpty()) {
/* 51 */                return;
                    }
/* 48 */            this.I0001Ioi1lo.add(oloO00ioIOO);
                }

                public final OloIi00i I00000oOI() {
                    long j;
                    OloIi00i oloIi00i;
                    boolean z;
/* 3 */             ArrayList arrayList = this.I0000oI00;
/* 5 */             I0IIiO0iI i0IIiO0iI = this.I00000oIO;
/* 7 */             ArrayList arrayList2 = this.I0001Ioi1lo;
/* 9 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 15 */            while (!arrayList2.isEmpty()) {
/* 21 */                long jNanoTime = System.nanoTime();
/* 25 */                Iterator it = arrayList2.iterator();
/* 29 */                long jMin = Long.MAX_VALUE;
/* 34 */                OloIi00i oloIi00i2 = null;
                        while (true) {
/* 43 */                    if (!it.hasNext()) {
/* 88 */                        j = jNanoTime;
/* 90 */                        oloIi00i = null;
/* 92 */                        z = false;
                                break;
                            }
/* 57 */                    OloIi00i oloIi00i3 = (OloIi00i) ((OloO00ioIOO) it.next()).I0000oI00.get(0);
/* 59 */                    j = jNanoTime;
/* 61 */                    oloIi00i = null;
/* 67 */                    long jMax = Math.max(0L, oloIi00i3.I0000O - j);
/* 73 */                    if (jMax > 0) {
/* 75 */                        jMin = Math.min(jMax, jMin);
                            } else {
/* 82 */                        if (oloIi00i2 != null) {
/* 84 */                            z = true;
                                    break;
                                }
/* 86 */                        oloIi00i2 = oloIi00i3;
                            }
/* 79 */                    jNanoTime = j;
                        }
/* 93 */                if (oloIi00i2 != null) {
/* 95 */                    byte[] bArr2 = OollIoI001lo.I00000oIO;
/* 99 */                    oloIi00i2.I0000O = -1L;
/* 101 */                   OloO00ioIOO oloO00ioIOO = oloIi00i2.I0000Il00O;
/* 105 */                   oloO00ioIOO.I0000oI00.remove(oloIi00i2);
/* 108 */                   arrayList2.remove(oloO00ioIOO);
/* 111 */                   oloO00ioIOO.I0000O = oloIi00i2;
/* 113 */                   arrayList.add(oloO00ioIOO);
/* 116 */                   if (z || (!this.I0000Il00O && !arrayList2.isEmpty())) {
/* 134 */                       ((ThreadPoolExecutor) i0IIiO0iI.I00iiI).execute(this.I000II);
                            }
/* 137 */                   return oloIi00i2;
                        }
/* 140 */               if (this.I0000Il00O) {
/* 148 */                   if (jMin >= this.I0000O - j) {
/* 153 */                       return oloIi00i;
                            }
/* 150 */                   notify();
/* 153 */                   return oloIi00i;
                        }
/* 154 */               this.I0000Il00O = true;
/* 158 */               this.I0000O = j + jMin;
                        try {
                            try {
/* 163 */                       long j2 = jMin / 1000000;
/* 166 */                       long j3 = jMin - (1000000 * j2);
/* 170 */                       if (j2 > 0 || jMin > 0) {
/* 177 */                           wait(j2, (int) j3);
                                }
                            } catch (InterruptedException unused) {
/* 192 */                       for (int size = arrayList.size() - 1; -1 < size; size--) {
/* 200 */                           ((OloO00ioIOO) arrayList.get(size)).I00000oOI();
                                }
/* 211 */                       for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
/* 217 */                           OloO00ioIOO oloO00ioIOO2 = (OloO00ioIOO) arrayList2.get(size2);
/* 219 */                           oloO00ioIOO2.I00000oOI();
/* 228 */                           if (oloO00ioIOO2.I0000oI00.isEmpty()) {
/* 230 */                               arrayList2.remove(size2);
                                    }
                                }
                            }
                        } finally {
/* 236 */                   this.I0000Il00O = false;
                        }
                    }
/* 17 */            return null;
                }

                public final void I0000Il00O(OloO00ioIOO oloO00ioIOO) {
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 5 */             if (oloO00ioIOO.I0000O == null) {
/* 9 */                 boolean zIsEmpty = oloO00ioIOO.I0000oI00.isEmpty();
/* 13 */                ArrayList arrayList = this.I0001Ioi1lo;
/* 15 */                if (zIsEmpty) {
/* 27 */                    arrayList.remove(oloO00ioIOO);
                        } else if (!arrayList.contains(oloO00ioIOO)) {
/* 23 */                    arrayList.add(oloO00ioIOO);
                        }
                    }
/* 30 */            boolean z = this.I0000Il00O;
/* 32 */            I0IIiO0iI i0IIiO0iI = this.I00000oIO;
/* 34 */            if (z) {
/* 36 */                notify();
                    } else {
/* 46 */                ((ThreadPoolExecutor) i0IIiO0iI.I00iiI).execute(this.I000II);
                    }
                }

                public final OloO00ioIOO I0000O() {
                    int i;
                    synchronized (this) {
/* 2 */                 i = this.I00000oOI;
/* 6 */                 this.I00000oOI = i + 1;
                    }
/* 13 */            String strI000oI1ioi = Oi010OO0.I000oI1ioi(i, "Q");
/* 17 */            OloO00ioIOO oloO00ioIOO = new OloO00ioIOO();
/* 20 */            oloO00ioIOO.I00000oIO = this;
/* 22 */            oloO00ioIOO.I00000oOI = strI000oI1ioi;
/* 29 */            oloO00ioIOO.I0000oI00 = new ArrayList();
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            return oloO00ioIOO;
                }

                public final void I0000oI00(OloIi00i oloIi00i) {
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 3 */             Thread threadCurrentThread = Thread.currentThread();
/* 7 */             String name = threadCurrentThread.getName();
/* 13 */            threadCurrentThread.setName(oloIi00i.I00000oIO);
                    try {
/* 16 */                long jI00000oIO = oloIi00i.I00000oIO();
                        synchronized (this) {
/* 21 */                    I00000oIO(oloIi00i, jI00000oIO);
                        }
/* 25 */                threadCurrentThread.setName(name);
                    } catch (Throwable th) {
                        synchronized (this) {
/* 36 */                    I00000oIO(oloIi00i, -1L);
/* 40 */                    threadCurrentThread.setName(name);
/* 43 */                    throw th;
                        }
                    }
                }
            }
