            package p000;
            
            public final class l01l0io0lo11 extends liooi0 {
                @Override
                public final l01Olo10 I00000oIO(l01iOilOl1il l01ioilol1il) {
                    l01Olo10 l01olo10;
/* 1 */             l01Olo10 l01olo102 = l01Olo10.I0000O;
                    synchronized (l01ioilol1il) {
                        try {
/* 4 */                     l01olo10 = l01ioilol1il.I00iiI;
/* 6 */                     if (l01olo10 != l01olo102) {
/* 8 */                         l01ioilol1il.I00iiI = l01olo102;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return l01olo10;
                }

                @Override
                public final l01l0oIOl1 I00000oOI(l01iOilOl1il l01ioilol1il) {
                    l01l0oIOl1 l01l0oiol1;
/* 1 */             l01l0oIOl1 l01l0oiol12 = l01l0oIOl1.I0000Il00O;
                    synchronized (l01ioilol1il) {
                        try {
/* 4 */                     l01l0oiol1 = l01ioilol1il.I00iiO;
/* 6 */                     if (l01l0oiol1 != l01l0oiol12) {
/* 8 */                         l01ioilol1il.I00iiO = l01l0oiol12;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return l01l0oiol1;
                }

                @Override
                public final void I0000Il00O(l01l0oIOl1 l01l0oiol1, l01l0oIOl1 l01l0oiol12) {
/* 1 */             l01l0oiol1.I00000oOI = l01l0oiol12;
                }

                @Override
                public final void I0000O(l01l0oIOl1 l01l0oiol1, Thread thread) {
/* 1 */             l01l0oiol1.I00000oIO = thread;
                }

                @Override
                public final boolean I0000oI00(l01iOilOl1il l01ioilol1il, l01Olo10 l01olo10, l01Olo10 l01olo102) {
                    synchronized (l01ioilol1il) {
                        try {
/* 4 */                     if (l01ioilol1il.I00iiI != l01olo10) {
/* 14 */                        return false;
                            }
/* 6 */                     l01ioilol1il.I00iiI = l01olo102;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(l01loiOOo11l l01loiooo11l, Object obj, Object obj2) {
                    synchronized (l01loiooo11l) {
                        try {
/* 4 */                     if (l01loiooo11l.I00iOIl != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     l01loiooo11l.I00iOIl = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I000II(l01loiOOo11l l01loiooo11l, l01l0oIOl1 l01l0oiol1, l01l0oIOl1 l01l0oiol12) {
                    synchronized (l01loiooo11l) {
                        try {
/* 4 */                     if (l01loiooo11l.I00iiO != l01l0oiol1) {
/* 14 */                        return false;
                            }
/* 6 */                     l01loiooo11l.I00iiO = l01l0oiol12;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }
            }
