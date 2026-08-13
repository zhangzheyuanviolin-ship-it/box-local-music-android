            package p000;
            
            public final class ioOIloOolo extends lioiOiO {
                @Override
                public final ioO100IioiO0 I00000oIO(ioOI0o10I iooi0o10i) {
                    ioO100IioiO0 ioo100iioio0;
/* 1 */             ioO100IioiO0 ioo100iioio02 = ioO100IioiO0.I0000O;
                    synchronized (iooi0o10i) {
                        try {
/* 4 */                     ioo100iioio0 = iooi0o10i.I00iiI;
/* 6 */                     if (ioo100iioio0 != ioo100iioio02) {
/* 8 */                         iooi0o10i.I00iiI = ioo100iioio02;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return ioo100iioio0;
                }

                @Override
                public final ioOOIoo I00000oOI(ioOI0o10I iooi0o10i) {
                    ioOOIoo ioooioo;
/* 1 */             ioOOIoo ioooioo2 = ioOOIoo.I0000Il00O;
                    synchronized (iooi0o10i) {
                        try {
/* 4 */                     ioooioo = iooi0o10i.I00iiO;
/* 6 */                     if (ioooioo != ioooioo2) {
/* 8 */                         iooi0o10i.I00iiO = ioooioo2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return ioooioo;
                }

                @Override
                public final void I0000Il00O(ioOOIoo ioooioo, ioOOIoo ioooioo2) {
/* 1 */             ioooioo.I00000oOI = ioooioo2;
                }

                @Override
                public final void I0000O(ioOOIoo ioooioo, Thread thread) {
/* 1 */             ioooioo.I00000oIO = thread;
                }

                @Override
                public final boolean I0000oI00(ioOI0o10I iooi0o10i, ioO100IioiO0 ioo100iioio0, ioO100IioiO0 ioo100iioio02) {
                    synchronized (iooi0o10i) {
                        try {
/* 4 */                     if (iooi0o10i.I00iiI != ioo100iioio0) {
/* 14 */                        return false;
                            }
/* 6 */                     iooi0o10i.I00iiI = ioo100iioio02;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(ioOi11iiI iooi11iii, Object obj, Object obj2) {
                    synchronized (iooi11iii) {
                        try {
/* 4 */                     if (iooi11iii.I00iOIl != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     iooi11iii.I00iOIl = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I000II(ioOi11iiI iooi11iii, ioOOIoo ioooioo, ioOOIoo ioooioo2) {
                    synchronized (iooi11iii) {
                        try {
/* 4 */                     if (iooi11iii.I00iiO != ioooioo) {
/* 14 */                        return false;
                            }
/* 6 */                     iooi11iii.I00iiO = ioooioo2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }
            }
