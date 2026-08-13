            package p000;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.concurrent.ConcurrentLinkedQueue;
            
/* 8 */     public final class IoIOOii1OOi extends OloIi00i {
                public final int I0000oI00;
                public final Object I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIOOii1OOi(String str, int i, Object obj) {
/* 6 */             super(str, true);
/* 1 */             this.I0000oI00 = i;
/* 3 */             this.I0001Ioi1lo = obj;
                }

                @Override
                public final long I00000oIO() throws IOException {
/* 3 */             int i = 0;
                    switch (this.I0000oI00) {
                        case 0:
/* 158 */                   IoIOii01O ioIOii01O = (IoIOii01O) this.I0001Ioi1lo;
/* 160 */                   ioIOii01O.getClass();
                            try {
/* 166 */                       ioIOii01O.I00ol1.I00100l0(2, 0, false);
                            } catch (IOException e) {
/* 171 */                       ioIOii01O.I00000oIO(2, 2, e);
                            }
/* 4 */                     return -1L;
                        case 1:
/* 19 */                    IioiI0IIIIO iioiI0IIIIO = (IioiI0IIIIO) this.I0001Ioi1lo;
/* 21 */                    long jNanoTime = System.nanoTime();
/* 29 */                    Iterator it = ((ConcurrentLinkedQueue) iioiI0IIIIO.I0000O).iterator();
/* 36 */                    long j = Long.MIN_VALUE;
/* 37 */                    OOll1O oOll1O = null;
/* 38 */                    int i2 = 0;
/* 43 */                    while (it.hasNext()) {
/* 49 */                        OOll1O oOll1O2 = (OOll1O) it.next();
                                synchronized (oOll1O2) {
/* 56 */                            if (iioiI0IIIIO.I00000oOI(oOll1O2, jNanoTime) > 0) {
/* 58 */                                i2++;
                                    } else {
/* 61 */                                i++;
/* 65 */                                long j2 = jNanoTime - oOll1O2.I00100l0;
/* 69 */                                if (j2 > j) {
/* 71 */                                    oOll1O = oOll1O2;
/* 72 */                                    j = j2;
                                        }
                                    }
                                }
                            }
/* 78 */                    long j3 = iioiI0IIIIO.I00000oIO;
/* 82 */                    if (j < j3 && i <= 5) {
/* 88 */                        if (i > 0) {
/* 90 */                            return j3 - j;
                                }
/* 93 */                        if (i2 > 0) {
/* 95 */                            return j3;
                                }
/* 4 */                         return -1L;
                            }
                            synchronized (oOll1O) {
/* 106 */                       if (!oOll1O.I000oI1ioi.isEmpty()) {
/* 104 */                           return 0L;
                                }
/* 115 */                       if (oOll1O.I00100l0 + j != jNanoTime) {
/* 104 */                           return 0L;
                                }
/* 120 */                       oOll1O.I000OOo1O = true;
/* 126 */                       ((ConcurrentLinkedQueue) iioiI0IIIIO.I0000O).remove(oOll1O);
/* 132 */                       OollIoI001lo.I0000oI00(oOll1O.I0000Il00O);
/* 143 */                       if (!((ConcurrentLinkedQueue) iioiI0IIIIO.I0000O).isEmpty()) {
/* 104 */                           return 0L;
                                }
/* 149 */                       ((OloO00ioIOO) iioiI0IIIIO.I00000oOI).I00000oIO();
/* 104 */                       return 0L;
                            }
                        default:
/* 13 */                    ((IllOOo00lI) this.I0001Ioi1lo).invoke();
/* 4 */                     return -1L;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public IoIOOii1OOi(IioiI0IIIIO iioiI0IIIIO, String str) {
/* 10 */            super(str, true);
                    this.I0000oI00 = 1;
                    this.I0001Ioi1lo = iioiI0IIIIO;
                }
            }
