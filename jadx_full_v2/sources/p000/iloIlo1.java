            package p000;
            
            public final class iloIlo1 extends lioI0I {
                @Override
                public final void I00000oIO(iloO01 iloo01, Thread thread) {
/* 1 */             iloo01.I00000oIO = thread;
                }

                @Override
                public final void I00000oOI(iloO01 iloo01, iloO01 iloo012) {
/* 1 */             iloo01.I00000oOI = iloo012;
                }

                @Override
                public final boolean I0000Il00O(iloOO0lI0llo ilooo0li0llo, iloO01 iloo01, iloO01 iloo012) {
                    synchronized (ilooo0li0llo) {
                        try {
/* 4 */                     if (ilooo0li0llo.I00iiO != iloo01) {
/* 14 */                        return false;
                            }
/* 6 */                     ilooo0li0llo.I00iiO = iloo012;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final iloO01 I0000O(iloOO0lI0llo ilooo0li0llo) {
                    iloO01 iloo01;
/* 1 */             iloO01 iloo012 = iloO01.I0000Il00O;
                    synchronized (ilooo0li0llo) {
                        try {
/* 4 */                     iloo01 = ilooo0li0llo.I00iiO;
/* 6 */                     if (iloo01 != iloo012) {
/* 8 */                         ilooo0li0llo.I00iiO = iloo012;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return iloo01;
                }

                @Override
                public final iloI0IOOI I0000oI00(iloOO0lI0llo ilooo0li0llo) {
                    iloI0IOOI iloi0iooi;
/* 1 */             iloI0IOOI iloi0iooi2 = iloI0IOOI.I00000oOI;
                    synchronized (ilooo0li0llo) {
                        try {
/* 4 */                     iloi0iooi = ilooo0li0llo.I00iiI;
/* 6 */                     if (iloi0iooi != iloi0iooi2) {
/* 8 */                         ilooo0li0llo.I00iiI = iloi0iooi2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return iloi0iooi;
                }

                @Override
                public final boolean I0001Ioi1lo(iloOO0lI0llo ilooo0li0llo, Object obj, Object obj2) {
                    synchronized (ilooo0li0llo) {
                        try {
/* 4 */                     if (ilooo0li0llo.I00iOIl != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     ilooo0li0llo.I00iOIl = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }
            }
