            package p000;
            
            public final class l10iOIOOll extends lIIOO0oi1o {
                private static final l10iOIOOll zzb;
                private static volatile lO11l0OoOIIi zzd;
                private int zze;
                private l11IIolOIl zzf;
                private li1OIo00O zzg;

                static {
/* 3 */             l10iOIOOll l10ioiooll = new l10iOIOOll();
/* 6 */             zzb = l10ioiooll;
/* 10 */            lIIOO0oi1o.I0000oI00(l10iOIOOll.class, l10ioiooll);
                }

                public static lO11l0OoOIIi I000oI1ioi() {
/* 9 */             return (lO11l0OoOIIi) zzb.I000OiO(7, null);
                }

                @Override
                public final Object I000OiO(int i, lIIOO0oi1o liioo0oi1o) {
                    lO11l0OoOIIi li1i1li0o0i;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 88 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return new lO1i1o0O0o(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l10iOIOOll();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new illO0I1(zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 18 */            if (i2 != 6) {
/* 20 */                return null;
                    }
/* 22 */            lO11l0OoOIIi lo11l0oooiii = zzd;
/* 24 */            if (lo11l0oooiii != null) {
/* 49 */                return lo11l0oooiii;
                    }
                    synchronized (l10iOIOOll.class) {
                        try {
/* 29 */                    li1i1li0o0i = zzd;
/* 31 */                    if (li1i1li0o0i == null) {
/* 37 */                        li1i1li0o0i = new lI1i1lI0O0I(zzb);
/* 40 */                        zzd = li1i1li0o0i;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 46 */            return li1i1li0o0i;
                }

                public final l11IIolOIl I000o00OoI0I() {
/* 1 */             l11IIolOIl l11iioloil = this.zzf;
                    return l11iioloil == null ? l11IIolOIl.I00100l0() : l11iioloil;
                }
            }
