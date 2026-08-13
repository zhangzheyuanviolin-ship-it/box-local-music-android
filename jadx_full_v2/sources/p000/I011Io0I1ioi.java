            package p000;
            
            public final class I011Io0I1ioi extends iOI011o {
                @Override
                public final boolean I00000oIO(I011IO1I11OI i011io1i11oi, I010o0o0oO i010o0o0oO, I010o0o0oO i010o0o0oO2) {
                    synchronized (i011io1i11oi) {
                        try {
/* 4 */                     if (i011io1i11oi.I00iiI != i010o0o0oO) {
/* 13 */                        return false;
                            }
/* 6 */                     i011io1i11oi.I00iiI = i010o0o0oO2;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 215 */                   throw th;
                        }
                    }
                }

                @Override
                public final boolean I00000oOI(I011iiii0i i011iiii0i, Object obj, Object obj2) {
                    synchronized (i011iiii0i) {
                        try {
/* 4 */                     if (i011iiii0i.I00iOIl != obj) {
/* 13 */                        return false;
                            }
/* 6 */                     i011iiii0i.I00iOIl = obj2;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 215 */                   throw th;
                        }
                    }
                }

                @Override
                public final boolean I0000Il00O(I011iiii0i i011iiii0i, I011iO i011iO, I011iO i011iO2) {
                    synchronized (i011iiii0i) {
                        try {
/* 4 */                     if (i011iiii0i.I00iiO != i011iO) {
/* 13 */                        return false;
                            }
/* 6 */                     i011iiii0i.I00iiO = i011iO2;
/* 8 */                     return true;
                        } catch (Throwable th) {
/* 215 */                   throw th;
                        }
                    }
                }

                @Override
                public final I010o0o0oO I0000O(I011IO1I11OI i011io1i11oi) {
                    I010o0o0oO i010o0o0oO;
/* 1 */             I010o0o0oO i010o0o0oO2 = I010o0o0oO.I0000O;
                    synchronized (i011io1i11oi) {
                        try {
/* 4 */                     i010o0o0oO = i011io1i11oi.I00iiI;
/* 6 */                     if (i010o0o0oO != i010o0o0oO2) {
/* 8 */                         i011io1i11oi.I00iiI = i010o0o0oO2;
                            }
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
/* 14 */            return i010o0o0oO;
                }

                @Override
                public final I011iO I0000oI00(I011IO1I11OI i011io1i11oi) {
                    I011iO i011iO;
/* 1 */             I011iO i011iO2 = I011iO.I0000Il00O;
                    synchronized (i011io1i11oi) {
                        try {
/* 4 */                     i011iO = i011io1i11oi.I00iiO;
/* 6 */                     if (i011iO != i011iO2) {
/* 8 */                         i011io1i11oi.I00iiO = i011iO2;
                            }
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
/* 14 */            return i011iO;
                }

                @Override
                public final void I0001Ioi1lo(I011iO i011iO, I011iO i011iO2) {
/* 1 */             i011iO.I00000oOI = i011iO2;
                }

                @Override
                public final void I000II(I011iO i011iO, Thread thread) {
/* 1 */             i011iO.I00000oIO = thread;
                }
            }
