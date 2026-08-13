            package p000;
            
            public final class I01101olii extends iOI00o11 {
                @Override
                public final boolean I00000oIO(I011IOil i011IOil, I010oio1OO0 i010oio1OO0, I010oio1OO0 i010oio1OO02) {
                    synchronized (i011IOil) {
                        try {
/* 4 */                     if (i011IOil.I00iiI != i010oio1OO0) {
/* 13 */                        return false;
                            }
/* 6 */                     i011IOil.I00iiI = i010oio1OO02;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I00000oOI(I011IOil i011IOil, Object obj, Object obj2) {
                    synchronized (i011IOil) {
                        try {
/* 4 */                     if (i011IOil.I00iOIl != obj) {
/* 13 */                        return false;
                            }
/* 6 */                     i011IOil.I00iOIl = obj2;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0000Il00O(I011IOil i011IOil, I0111i i0111i, I0111i i0111i2) {
                    synchronized (i011IOil) {
                        try {
/* 4 */                     if (i011IOil.I00iiO != i0111i) {
/* 13 */                        return false;
                            }
/* 6 */                     i011IOil.I00iiO = i0111i2;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final void I0000O(I0111i i0111i, I0111i i0111i2) {
/* 1 */             i0111i.I00000oOI = i0111i2;
                }

                @Override
                public final void I0000oI00(I0111i i0111i, Thread thread) {
/* 1 */             i0111i.I00000oIO = thread;
                }
            }
