            package p000;
            
            public final class ioOolOII extends lioiiOOIoO {
                @Override
                public final ioOlIi I00000oIO(ioOlolI0ll00 ioololi0ll00) {
                    ioOlIi ioolii;
/* 1 */             ioOlIi ioolii2 = ioOlIi.I0000O;
                    synchronized (ioololi0ll00) {
                        try {
/* 4 */                     ioolii = ioololi0ll00.I00iiI;
/* 6 */                     if (ioolii != ioolii2) {
/* 8 */                         ioololi0ll00.I00iiI = ioolii2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return ioolii;
                }

                @Override
                public final ioOooi000 I00000oOI(ioOlolI0ll00 ioololi0ll00) {
                    ioOooi000 iooooi000;
/* 1 */             ioOooi000 iooooi0002 = ioOooi000.I0000Il00O;
                    synchronized (ioololi0ll00) {
                        try {
/* 4 */                     iooooi000 = ioololi0ll00.I00iiO;
/* 6 */                     if (iooooi000 != iooooi0002) {
/* 8 */                         ioololi0ll00.I00iiO = iooooi0002;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return iooooi000;
                }

                @Override
                public final void I0000Il00O(ioOooi000 iooooi000, ioOooi000 iooooi0002) {
/* 1 */             iooooi000.I00000oOI = iooooi0002;
                }

                @Override
                public final void I0000O(ioOooi000 iooooi000, Thread thread) {
/* 1 */             iooooi000.I00000oIO = thread;
                }

                @Override
                public final boolean I0000oI00(ioOlolI0ll00 ioololi0ll00, ioOlIi ioolii, ioOlIi ioolii2) {
                    synchronized (ioololi0ll00) {
                        try {
/* 4 */                     if (ioololi0ll00.I00iiI != ioolii) {
/* 14 */                        return false;
                            }
/* 6 */                     ioololi0ll00.I00iiI = ioolii2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(ioi01lIi1 ioi01lii1, Object obj, Object obj2) {
                    synchronized (ioi01lii1) {
                        try {
/* 4 */                     if (ioi01lii1.I00iOIl != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     ioi01lii1.I00iOIl = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I000II(ioi01lIi1 ioi01lii1, ioOooi000 iooooi000, ioOooi000 iooooi0002) {
                    synchronized (ioi01lii1) {
                        try {
/* 4 */                     if (ioi01lii1.I00iiO != iooooi000) {
/* 14 */                        return false;
                            }
/* 6 */                     ioi01lii1.I00iiO = iooooi0002;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }
            }
