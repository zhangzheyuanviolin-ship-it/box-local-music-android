            package p000;
            
            public final class ili1O1il110 extends lio0Oolo1li1 {
                @Override
                public final ili1II I00000oIO(iliIlI0o00ii iliili0o00ii) {
                    ili1II ili1ii;
/* 1 */             ili1II ili1ii2 = ili1II.I0000O;
                    synchronized (iliili0o00ii) {
                        try {
/* 4 */                     ili1ii = iliili0o00ii.I00iiI;
/* 6 */                     if (ili1ii != ili1ii2) {
/* 8 */                         iliili0o00ii.I00iiI = ili1ii2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return ili1ii;
                }

                @Override
                public final ili1iI1O0lIl I00000oOI(iliIlI0o00ii iliili0o00ii) {
                    ili1iI1O0lIl ili1ii1o0lil;
/* 1 */             ili1iI1O0lIl ili1ii1o0lil2 = ili1iI1O0lIl.I0000Il00O;
                    synchronized (iliili0o00ii) {
                        try {
/* 4 */                     ili1ii1o0lil = iliili0o00ii.I00iiO;
/* 6 */                     if (ili1ii1o0lil != ili1ii1o0lil2) {
/* 8 */                         iliili0o00ii.I00iiO = ili1ii1o0lil2;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 14 */            return ili1ii1o0lil;
                }

                @Override
                public final void I0000Il00O(ili1iI1O0lIl ili1ii1o0lil, ili1iI1O0lIl ili1ii1o0lil2) {
/* 1 */             ili1ii1o0lil.I00000oOI = ili1ii1o0lil2;
                }

                @Override
                public final void I0000O(ili1iI1O0lIl ili1ii1o0lil, Thread thread) {
/* 1 */             ili1ii1o0lil.I00000oIO = thread;
                }

                @Override
                public final boolean I0000oI00(iliIlI0o00ii iliili0o00ii, ili1II ili1ii, ili1II ili1ii2) {
                    synchronized (iliili0o00ii) {
                        try {
/* 4 */                     if (iliili0o00ii.I00iiI != ili1ii) {
/* 14 */                        return false;
                            }
/* 6 */                     iliili0o00ii.I00iiI = ili1ii2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(iliIlI0o00ii iliili0o00ii, Object obj, Object obj2) {
                    synchronized (iliili0o00ii) {
                        try {
/* 4 */                     if (iliili0o00ii.I00iOIl != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     iliili0o00ii.I00iOIl = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                @Override
                public final boolean I000II(iliIlI0o00ii iliili0o00ii, ili1iI1O0lIl ili1ii1o0lil, ili1iI1O0lIl ili1ii1o0lil2) {
                    synchronized (iliili0o00ii) {
                        try {
/* 4 */                     if (iliili0o00ii.I00iiO != ili1ii1o0lil) {
/* 14 */                        return false;
                            }
/* 6 */                     iliili0o00ii.I00iiO = ili1ii1o0lil2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }
            }
