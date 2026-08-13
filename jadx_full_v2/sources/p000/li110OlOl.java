            package p000;
            
            public final class li110OlOl extends ll0lOI {
                @Override
                public final void I00000oIO(li111il1iiIi li111il1iiii, Thread thread) {
/* 1 */             li111il1iiii.I00000oIO = thread;
                }

                @Override
                public final void I00000oOI(li111il1iiIi li111il1iiii, li111il1iiIi li111il1iiii2) {
/* 1 */             li111il1iiii.I00000oOI = li111il1iiii2;
                }

                @Override
                public final boolean I0000Il00O(li11oiolO li11oiolo, li111il1iiIi li111il1iiii, li111il1iiIi li111il1iiii2) {
                    synchronized (li11oiolo) {
                        try {
/* 4 */                     if (li11oiolo.I00iiO != li111il1iiii) {
/* 14 */                        return false;
                            }
/* 6 */                     li11oiolo.I00iiO = li111il1iiii2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0000O(li10iIlI1O li10iili1o, li10IIOIIO li10iioiio, li10IIOIIO li10iioiio2) {
                    synchronized (li10iili1o) {
                        try {
/* 4 */                     if (li10iili1o.I00iiI != li10iioiio) {
/* 14 */                        return false;
                            }
/* 6 */                     li10iili1o.I00iiI = li10iioiio2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final li111il1iiIi I0000oI00(li10iIlI1O li10iili1o) {
                    li111il1iiIi li111il1iiii;
/* 1 */             li111il1iiIi li111il1iiii2 = li111il1iiIi.I0000Il00O;
                    synchronized (li10iili1o) {
                        try {
/* 4 */                     li111il1iiii = li10iili1o.I00iiO;
/* 6 */                     if (li111il1iiii != li111il1iiii2) {
/* 8 */                         li10iili1o.I00iiO = li111il1iiii2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return li111il1iiii;
                }

                @Override
                public final li10IIOIIO I0001Ioi1lo(li10iIlI1O li10iili1o) {
                    li10IIOIIO li10iioiio;
/* 1 */             li10IIOIIO li10iioiio2 = li10IIOIIO.I0000O;
                    synchronized (li10iili1o) {
                        try {
/* 4 */                     li10iioiio = li10iili1o.I00iiI;
/* 6 */                     if (li10iioiio != li10iioiio2) {
/* 8 */                         li10iili1o.I00iiI = li10iioiio2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return li10iioiio;
                }

                @Override
                public final boolean I000II(li11oiolO li11oiolo, Object obj, Object obj2) {
                    synchronized (li11oiolo) {
                        try {
/* 4 */                     if (li11oiolo.I00iOIl != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     li11oiolo.I00iOIl = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }
            }
