            package p000;
            
            public final class IloolOiO0 implements O1l1iIio {
                public static final IloolOiO0 I00000oOI = new IloolOiO0(0);
                public final int I00000oIO;

                public IloolOiO0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final OOl1oi1OO I00000oIO(Class cls) {
                    switch (this.I00000oIO) {
                        case 0:
/* 21 */                    if (!Io00Io0IO11.class.isAssignableFrom(cls)) {
/* 65 */                        I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 20 */                        return null;
                            }
                            try {
/* 36 */                        return (OOl1oi1OO) Io00Io0IO11.I000OiO(cls.asSubclass(Io00Io0IO11.class)).I000OOo1O(3);
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
/* 10 */                    return Io00Io0IO11.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }
            }
