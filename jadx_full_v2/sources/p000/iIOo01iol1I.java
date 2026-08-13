            package p000;
            
            public final class iIOo01iol1I extends liiOI1lOOIOO {
                @Override
                public final iIOloo00l0 I00000oIO(iIOoOi1oli iioooi1oli) {
                    iIOloo00l0 iioloo00l0;
/* 1 */             iIOloo00l0 iioloo00l02 = iIOloo00l0.I0000O;
                    synchronized (iioooi1oli) {
                        try {
/* 4 */                     iioloo00l0 = iioooi1oli.I00iiI;
/* 6 */                     if (iioloo00l0 != iioloo00l02) {
/* 8 */                         iioooi1oli.I00iiI = iioloo00l02;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return iioloo00l0;
                }

                @Override
                public final iIOo0i01l I00000oOI(iIOoOi1oli iioooi1oli) {
                    iIOo0i01l iioo0i01l;
/* 1 */             iIOo0i01l iioo0i01l2 = iIOo0i01l.I0000Il00O;
                    synchronized (iioooi1oli) {
                        try {
/* 4 */                     iioo0i01l = iioooi1oli.I00iiO;
/* 6 */                     if (iioo0i01l != iioo0i01l2) {
/* 8 */                         iioooi1oli.I00iiO = iioo0i01l2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return iioo0i01l;
                }

                @Override
                public final void I0000Il00O(iIOo0i01l iioo0i01l, iIOo0i01l iioo0i01l2) {
/* 1 */             iioo0i01l.I00000oOI = iioo0i01l2;
                }

                @Override
                public final void I0000O(iIOo0i01l iioo0i01l, Thread thread) {
/* 1 */             iioo0i01l.I00000oIO = thread;
                }

                @Override
                public final boolean I0000oI00(iIOoOi1oli iioooi1oli, iIOloo00l0 iioloo00l0, iIOloo00l0 iioloo00l02) {
                    synchronized (iioooi1oli) {
                        try {
/* 4 */                     if (iioooi1oli.I00iiI != iioloo00l0) {
/* 14 */                        return false;
                            }
/* 6 */                     iioooi1oli.I00iiI = iioloo00l02;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(iIOoOi1oli iioooi1oli, Object obj, Object obj2) {
                    synchronized (iioooi1oli) {
                        try {
/* 4 */                     if (iioooi1oli.I00iOIl != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     iioooi1oli.I00iOIl = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I000II(iIOoOi1oli iioooi1oli, iIOo0i01l iioo0i01l, iIOo0i01l iioo0i01l2) {
                    synchronized (iioooi1oli) {
                        try {
/* 4 */                     if (iioooi1oli.I00iiO != iioo0i01l) {
/* 14 */                        return false;
                            }
/* 6 */                     iioooi1oli.I00iiO = iioo0i01l2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }
            }
