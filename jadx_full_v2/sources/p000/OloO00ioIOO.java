            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.logging.Level;
            
            public final class OloO00ioIOO {
                public OloO0oOI1lI I00000oIO;
                public String I00000oOI;
                public boolean I0000Il00O;
                public OloIi00i I0000O;
                public ArrayList I0000oI00;
                public boolean I0001Ioi1lo;

                public final void I00000oIO() {
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
                    synchronized (this.I00000oIO) {
/* 10 */                if (I00000oOI()) {
/* 14 */                    this.I00000oIO.I0000Il00O(this);
                        }
                    }
                }

                public final boolean I00000oOI() {
/* 1 */             ArrayList arrayList = this.I0000oI00;
/* 3 */             OloIi00i oloIi00i = this.I0000O;
/* 6 */             if (oloIi00i != null && oloIi00i.I00000oOI) {
/* 12 */                this.I0001Ioi1lo = true;
                    }
/* 19 */            boolean z = false;
/* 21 */            for (int size = arrayList.size() - 1; -1 < size; size--) {
/* 31 */                if (((OloIi00i) arrayList.get(size)).I00000oOI) {
/* 37 */                    OloIi00i oloIi00i2 = (OloIi00i) arrayList.get(size);
/* 47 */                    if (OloO0oOI1lI.I000OOo1O.isLoggable(Level.FINE)) {
/* 51 */                        lOilill0l0o.I00000oOI(oloIi00i2, this, "canceled");
                            }
/* 54 */                    arrayList.remove(size);
/* 57 */                    z = true;
                        }
                    }
/* 113 */           return z;
                }

                public final void I0000Il00O(OloIi00i oloIi00i, long j) {
                    synchronized (this.I00000oIO) {
/* 6 */                 if (!this.I0000Il00O) {
/* 58 */                    if (I0000O(oloIi00i, j, false)) {
/* 62 */                        this.I00000oIO.I0000Il00O(this);
                            }
                        } else if (oloIi00i.I00000oOI) {
/* 20 */                    if (OloO0oOI1lI.I000OOo1O.isLoggable(Level.FINE)) {
/* 24 */                        lOilill0l0o.I00000oOI(oloIi00i, this, "schedule canceled (queue is shutdown)");
                            }
                        } else {
/* 40 */                    if (OloO0oOI1lI.I000OOo1O.isLoggable(Level.FINE)) {
/* 44 */                        lOilill0l0o.I00000oOI(oloIi00i, this, "schedule failed (queue is shutdown)");
                            }
/* 52 */                    throw new RejectedExecutionException();
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0076 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000O(OloIi00i oloIi00i, long j, boolean z) {
                    Iterator it;
                    int size;
/* 1 */             ArrayList arrayList = this.I0000oI00;
/* 3 */             OloO00ioIOO oloO00ioIOO = oloIi00i.I0000Il00O;
/* 6 */             if (oloO00ioIOO != this) {
/* 9 */                 if (oloO00ioIOO != null) {
/* 136 */                   I000II.I001IO000("task is in multiple queues");
/* 5 */                     return false;
                        }
/* 11 */                oloIi00i.I0000Il00O = this;
                    }
/* 13 */            long jNanoTime = System.nanoTime();
/* 17 */            long j2 = jNanoTime + j;
/* 19 */            int iIndexOf = arrayList.indexOf(oloIi00i);
/* 24 */            if (iIndexOf == -1) {
/* 51 */                oloIi00i.I0000O = j2;
/* 61 */                if (OloO0oOI1lI.I000OOo1O.isLoggable(Level.FINE)) {
/* 88 */                    lOilill0l0o.I00000oOI(oloIi00i, this, z ? "run again after ".concat(lOilill0l0o.I00000oIO(j2 - jNanoTime)) : "scheduled after ".concat(lOilill0l0o.I00000oIO(j2 - jNanoTime)));
                        }
/* 91 */                it = arrayList.iterator();
/* 95 */                size = 0;
                        while (true) {
/* 100 */                   if (it.hasNext()) {
/* 119 */                       size = -1;
                                break;
                            }
/* 113 */                   if (((OloIi00i) it.next()).I0000O - jNanoTime > j) {
                                break;
                            }
/* 116 */                   size++;
                        }
/* 120 */               if (size == -1) {
/* 122 */                   size = arrayList.size();
                        }
/* 126 */               arrayList.add(size, oloIi00i);
/* 129 */               if (size != 0) {
/* 131 */                   return true;
                        }
                    } else if (oloIi00i.I0000O > j2) {
/* 48 */                arrayList.remove(iIndexOf);
/* 51 */                oloIi00i.I0000O = j2;
/* 61 */                if (OloO0oOI1lI.I000OOo1O.isLoggable(Level.FINE)) {
                        }
/* 91 */                it = arrayList.iterator();
/* 95 */                size = 0;
                        while (true) {
/* 100 */                   if (it.hasNext()) {
                            }
/* 116 */                   size++;
                        }
/* 120 */               if (size == -1) {
                        }
/* 126 */               arrayList.add(size, oloIi00i);
/* 129 */               if (size != 0) {
                        }
                    } else if (OloO0oOI1lI.I000OOo1O.isLoggable(Level.FINE)) {
/* 44 */                lOilill0l0o.I00000oOI(oloIi00i, this, "already scheduled");
/* 5 */                 return false;
                    }
/* 5 */             return false;
                }

                public final void I0000oI00() {
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
                    synchronized (this.I00000oIO) {
/* 7 */                 this.I0000Il00O = true;
/* 13 */                if (I00000oOI()) {
/* 17 */                    this.I00000oIO.I0000Il00O(this);
                        }
                    }
                }

                public final String toString() {
/* 1 */             return this.I00000oOI;
                }
            }
