            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
/* 96 */    public class O1Il00 {
                public final int I00000oIO;
                public final Ii11I0l I00000oOI;
                public final i1O10l1io1iO I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public O1Il00(int i) {
/* 4 */             this.I00000oIO = i;
/* 6 */             if (i <= 0) {
/* 41 */                lO00l0o.I00000oIO("maxSize <= 0");
/* 77 */                throw null;
                    }
/* 10 */            Ii11I0l ii11I0l = new Ii11I0l();
/* 22 */            ii11I0l.I00000oIO = new LinkedHashMap(0, 0.75f, true);
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            this.I00000oOI = ii11I0l;
/* 36 */            this.I0000Il00O = new i1O10l1io1iO(13);
                }

                public Object I00000oIO(Object obj) {
/* 1 */             return null;
                }

                public final Object I0000Il00O(Object obj) {
                    Object objPut;
                    synchronized (this.I0000Il00O) {
/* 8 */                 Object obj2 = this.I00000oOI.I00000oIO.get(obj);
/* 12 */                if (obj2 != null) {
                            this.I0000oI00++;
/* 21 */                    return obj2;
                        }
                        this.I0001Ioi1lo++;
/* 31 */                Object objI00000oIO = I00000oIO(obj);
/* 35 */                if (objI00000oIO == null) {
/* 37 */                    return null;
                        }
                        synchronized (this.I0000Il00O) {
                            try {
/* 46 */                        objPut = this.I00000oOI.I00000oIO.put(obj, objI00000oIO);
/* 50 */                        if (objPut != null) {
/* 56 */                            this.I00000oOI.I00000oIO.put(obj, objPut);
                                } else {
                                    this.I0000O += I0001Ioi1lo(obj, objI00000oIO);
                                }
                            } catch (Throwable th) {
/* 85 */                        throw th;
                            }
                        }
/* 72 */                if (objPut != null) {
/* 74 */                    I00000oOI(obj, objI00000oIO, objPut);
/* 77 */                    return objPut;
                        }
/* 80 */                I000O01llI0(this.I00000oIO);
/* 83 */                return objI00000oIO;
                    }
                }

                public final Object I0000O(Object obj, Object obj2) {
                    Object objPut;
                    synchronized (this.I0000Il00O) {
                        this.I0000O += I0001Ioi1lo(obj, obj2);
/* 17 */                objPut = this.I00000oOI.I00000oIO.put(obj, obj2);
/* 21 */                if (objPut != null) {
                            this.I0000O -= I0001Ioi1lo(obj, objPut);
                        }
                    }
/* 36 */            if (objPut != null) {
/* 38 */                I00000oOI(obj, objPut, obj2);
                    }
/* 43 */            I000O01llI0(this.I00000oIO);
/* 46 */            return objPut;
                }

                public final Object I0000oI00(Object obj) {
                    Object objRemove;
                    synchronized (this.I0000Il00O) {
/* 8 */                 objRemove = this.I00000oOI.I00000oIO.remove(obj);
/* 12 */                if (objRemove != null) {
                            this.I0000O -= I0001Ioi1lo(obj, objRemove);
                        }
                    }
/* 27 */            if (objRemove != null) {
/* 30 */                I00000oOI(obj, objRemove, null);
                    }
/* 33 */            return objRemove;
                }

                public final int I0001Ioi1lo(Object obj, Object obj2) {
/* 1 */             int iI000II = I000II(obj, obj2);
/* 5 */             if (iI000II >= 0) {
/* 7 */                 return iI000II;
                    }
/* 37 */            throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
                }

                public int I000II(Object obj, Object obj2) {
/* 1 */             return 1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
                
                    throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(int i) {
                    Object key;
                    Object value;
                    while (true) {
                        synchronized (this.I0000Il00O) {
                            try {
/* 6 */                         if (this.I0000O < 0 || (this.I00000oOI.I00000oIO.isEmpty() && this.I0000O != 0)) {
                                    break;
                                }
/* 27 */                        if (this.I0000O <= i || this.I00000oOI.I00000oIO.isEmpty()) {
                                    break;
                                }
/* 54 */                        Map.Entry entry = (Map.Entry) IOOi0Ool1i.I001lloI(this.I00000oOI.I00000oIO.entrySet());
/* 56 */                        if (entry == null) {
/* 59 */                            return;
                                }
/* 60 */                        key = entry.getKey();
/* 64 */                        value = entry.getValue();
/* 72 */                        this.I00000oOI.I00000oIO.remove(key);
                                this.I0000O -= I0001Ioi1lo(key, value);
                            } catch (Throwable th) {
/* 168 */                       throw th;
                            }
                        }
/* 86 */                I00000oOI(key, value, null);
                    }
                }

                public final String toString() {
                    String str;
                    synchronized (this.I0000Il00O) {
                        try {
/* 6 */                     int i = this.I0000oI00;
/* 10 */                    int i2 = this.I0001Ioi1lo + i;
/* 63 */                    str = "LruCache[maxSize=" + this.I00000oIO + ",hits=" + this.I0000oI00 + ",misses=" + this.I0001Ioi1lo + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 68 */            return str;
                }

/* 97 */        public void I00000oOI(Object obj, Object obj2, Object obj3) {
                }
            }
