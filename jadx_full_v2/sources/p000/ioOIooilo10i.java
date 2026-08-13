            package p000;
            
            public final class ioOIooilo10i extends lioii00ii {
                @Override
                public final ioO100ol0 I00000oIO(ioOI0i0o11I iooi0i0o11i) {
                    ioO100ol0 ioo100ol0;
/* 1 */             ioO100ol0 ioo100ol02 = ioO100ol0.I0000O;
                    synchronized (iooi0i0o11i) {
                        try {
/* 4 */                     ioo100ol0 = iooi0i0o11i.I00iiI;
/* 6 */                     if (ioo100ol0 != ioo100ol02) {
/* 8 */                         iooi0i0o11i.I00iiI = ioo100ol02;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return ioo100ol0;
                }

                @Override
                public final ioOOO0liOIIo I00000oOI(ioOI0i0o11I iooi0i0o11i) {
                    ioOOO0liOIIo ioooo0lioiio;
/* 1 */             ioOOO0liOIIo ioooo0lioiio2 = ioOOO0liOIIo.I0000Il00O;
                    synchronized (iooi0i0o11i) {
                        try {
/* 4 */                     ioooo0lioiio = iooi0i0o11i.I00iiO;
/* 6 */                     if (ioooo0lioiio != ioooo0lioiio2) {
/* 8 */                         iooi0i0o11i.I00iiO = ioooo0lioiio2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return ioooo0lioiio;
                }

                @Override
                public final void I0000Il00O(ioOOO0liOIIo ioooo0lioiio, ioOOO0liOIIo ioooo0lioiio2) {
/* 1 */             ioooo0lioiio.I00000oOI = ioooo0lioiio2;
                }

                @Override
                public final void I0000O(ioOOO0liOIIo ioooo0lioiio, Thread thread) {
/* 1 */             ioooo0lioiio.I00000oIO = thread;
                }

                @Override
                public final boolean I0000oI00(ioOI0i0o11I iooi0i0o11i, ioO100ol0 ioo100ol0, ioO100ol0 ioo100ol02) {
                    synchronized (iooi0i0o11i) {
                        try {
/* 4 */                     if (iooi0i0o11i.I00iiI != ioo100ol0) {
/* 14 */                        return false;
                            }
/* 6 */                     iooi0i0o11i.I00iiI = ioo100ol02;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(ioOi0ll1 iooi0ll1, Object obj, Object obj2) {
                    synchronized (iooi0ll1) {
                        try {
/* 4 */                     if (iooi0ll1.I00iOIl != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     iooi0ll1.I00iOIl = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I000II(ioOi0ll1 iooi0ll1, ioOOO0liOIIo ioooo0lioiio, ioOOO0liOIIo ioooo0lioiio2) {
                    synchronized (iooi0ll1) {
                        try {
/* 4 */                     if (iooi0ll1.I00iiO != ioooo0lioiio) {
/* 14 */                        return false;
                            }
/* 6 */                     iooi0ll1.I00iiO = ioooo0lioiio2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }
            }
