            package p000;
            
            public abstract class Il10lO implements Runnable, Comparable, IiiOlIiio {
                public long I00iOIl;
                public int I00iiI = -1;
                private volatile Object _heap;

                public Il10lO(long j) {
/* 4 */             this.I00iOIl = j;
                }

                @Override
                public final void I00000oOI() {
                    synchronized (this) {
                        try {
/* 2 */                     Object obj = this._heap;
/* 4 */                     I0OooiI1I i0OooiI1I = Il10o001OloI.I00000oIO;
/* 6 */                     if (obj == i0OooiI1I) {
/* 9 */                         return;
                            }
/* 20 */                    Il10li0OlI il10li0OlI = obj instanceof Il10li0OlI ? (Il10li0OlI) obj : null;
/* 21 */                    if (il10li0OlI != null) {
                                synchronized (il10li0OlI) {
/* 24 */                            Object obj2 = this._heap;
/* 33 */                            if ((obj2 instanceof Oo10IOio ? (Oo10IOio) obj2 : null) != null) {
/* 38 */                                il10li0OlI.I0000Il00O(this.I00iiI);
                                    }
                                }
                            }
/* 46 */                    this._heap = i0OooiI1I;
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                public final int I0000Il00O(long j, Il10li0OlI il10li0OlI, Il10o00 il10o00) {
                    synchronized (this) {
/* 6 */                 if (this._heap == Il10o001OloI.I00000oIO) {
/* 9 */                     return 2;
                        }
                        synchronized (il10li0OlI) {
                            try {
/* 12 */                        Il10lO[] il10lOArr = il10li0OlI.I00000oIO;
/* 20 */                        Il10lO il10lO = il10lOArr != null ? il10lOArr[0] : null;
/* 21 */                        int i = Il10o00.I00ioIO;
/* 37 */                        if (I1Ioolli0l0o.I00000oIO.getIntVolatile(il10o00, Il10o00.I00ilO0) == 1) {
/* 31 */                            return 1;
                                }
/* 46 */                        if (il10lO == null) {
/* 48 */                            il10li0OlI.I0000Il00O = j;
                                } else {
/* 53 */                            long j2 = il10lO.I00iOIl;
/* 59 */                            if (j2 - j < 0) {
/* 62 */                                j = j2;
                                    }
/* 63 */                            long j3 = il10li0OlI.I0000Il00O;
/* 69 */                            if (j - j3 > 0) {
/* 71 */                                il10li0OlI.I0000Il00O = j;
                                    } else {
/* 74 */                                j = j3;
                                    }
                                }
/* 80 */                        if (this.I00iOIl - j < 0) {
/* 82 */                            this.I00iOIl = j;
                                }
/* 84 */                        il10li0OlI.I00000oIO(this);
/* 14 */                        return 0;
                            } catch (Throwable th) {
/* 91 */                        throw th;
                            }
                        }
                    }
                }

                public final void I0000O(Il10li0OlI il10li0OlI) {
/* 5 */             if (this._heap != Il10o001OloI.I00000oIO) {
/* 7 */                 this._heap = il10li0OlI;
                    } else {
/* 12 */                I000II.I000iOII("Failed requirement.");
                    }
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             long j = this.I00iOIl - ((Il10lO) obj).I00iOIl;
/* 12 */            if (j > 0) {
/* 14 */                return 1;
                    }
                    return j < 0 ? -1 : 0;
                }

                public String toString() {
/* 18 */            return "Delayed[nanos=" + this.I00iOIl + ']';
                }
            }
