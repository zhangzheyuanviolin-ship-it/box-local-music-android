            package p000;
            
            public final class I01Oi01Ilol extends iOI0lO1ilo {
                @Override
                public final boolean I00000oIO(I01Ol1o0 i01Ol1o0, I01OOIlI i01OOIlI, I01OOIlI i01OOIlI2) {
                    synchronized (i01Ol1o0) {
                        try {
/* 4 */                     if (i01Ol1o0.I00iiI != i01OOIlI) {
/* 13 */                        return false;
                            }
/* 6 */                     i01Ol1o0.I00iiI = i01OOIlI2;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I00000oOI(I01Ol1o0 i01Ol1o0, Object obj, Object obj2) {
                    synchronized (i01Ol1o0) {
                        try {
/* 4 */                     if (i01Ol1o0.I00iOIl != obj) {
/* 13 */                        return false;
                            }
/* 6 */                     i01Ol1o0.I00iOIl = obj2;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0000Il00O(I01Ol1o0 i01Ol1o0, I01OiO1OI i01OiO1OI, I01OiO1OI i01OiO1OI2) {
                    synchronized (i01Ol1o0) {
                        try {
/* 4 */                     if (i01Ol1o0.I00iiO != i01OiO1OI) {
/* 13 */                        return false;
                            }
/* 6 */                     i01Ol1o0.I00iiO = i01OiO1OI2;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final void I0000O(I01OiO1OI i01OiO1OI, I01OiO1OI i01OiO1OI2) {
/* 1 */             i01OiO1OI.I00000oOI = i01OiO1OI2;
                }

                @Override
                public final void I0000oI00(I01OiO1OI i01OiO1OI, Thread thread) {
/* 1 */             i01OiO1OI.I00000oIO = thread;
                }
            }
