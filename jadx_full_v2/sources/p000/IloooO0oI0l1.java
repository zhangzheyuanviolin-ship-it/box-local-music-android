            package p000;
            
            public final class IloooO0oI0l1 implements O1l1iiII1I {
                public static final IloooO0oI0l1 I00000oOI = new IloooO0oI0l1(0);
                public final int I00000oIO;

                public IloooO0oI0l1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final OOlI00I I00000oIO(Class cls) {
                    switch (this.I00000oIO) {
                        case 0:
/* 21 */                    if (!Io00Ol1o10O.class.isAssignableFrom(cls)) {
/* 65 */                        I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 20 */                        return null;
                            }
                            try {
/* 36 */                        return (OOlI00I) Io00Ol1o10O.I0001Ioi1lo(cls.asSubclass(Io00Ol1o10O.class)).I0000oI00(3);
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
/* 10 */                    return Io00Ol1o10O.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }
            }
