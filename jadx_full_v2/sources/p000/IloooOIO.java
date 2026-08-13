            package p000;
            
            public final class IloooOIO implements O1l1liOO {
                public static final IloooOIO I00000oOI = new IloooOIO(0);
                public final int I00000oIO;

                public IloooOIO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final OOlI0Ol I00000oIO(Class cls) {
                    switch (this.I00000oIO) {
                        case 0:
/* 21 */                    if (!Io00l0.class.isAssignableFrom(cls)) {
/* 65 */                        I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 20 */                        return null;
                            }
                            try {
/* 36 */                        return (OOlI0Ol) Io00l0.I0000O(cls.asSubclass(Io00l0.class)).I0000Il00O(3);
                            } catch (Exception e) {
/* 51 */                        OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls.getName()), e);
/* 20 */                        return null;
                            }
                        default:
/* 13 */                    throw new IllegalStateException("This should never be called.");
                    }
                }

                @Override
                public final boolean I00000oOI(Class cls) {
                    switch (this.I00000oIO) {
                        case 0:
/* 10 */                    return Io00l0.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }
            }
