            package p000;
            
            public final class ilO11o0Ol implements io0lI0 {
                public static final ilO11o0Ol I00000oOI = new ilO11o0Ol(0);
                public final int I00000oIO;

                public ilO11o0Ol(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ioIloOilIii zzb(Class cls) {
                    switch (this.I00000oIO) {
                        case 0:
/* 21 */                    if (!ilOl10.class.isAssignableFrom(cls)) {
/* 65 */                        I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 20 */                        return null;
                            }
                            try {
/* 36 */                        return (ioIloOilIii) ilOl10.I0000O(cls.asSubclass(ilOl10.class)).I000lI(3);
                            } catch (Exception e) {
/* 51 */                        OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls.getName()), e);
/* 20 */                        return null;
                            }
                        default:
/* 13 */                    throw new IllegalStateException("This should never be called.");
                    }
                }

                @Override
                public final boolean zzc(Class cls) {
                    switch (this.I00000oIO) {
                        case 0:
/* 10 */                    return ilOl10.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }
            }
