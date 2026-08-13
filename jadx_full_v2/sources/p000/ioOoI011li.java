            package p000;
            
            public final class ioOoI011li extends lIIOO0oi1o {
                private static final ioOoI011li zzb;
                private static volatile lO11l0OoOIIi zzd;
                private lIOIoo1O zze = lO1Oio0looOO.I00iio;

                static {
/* 3 */             ioOoI011li ioooi011li = new ioOoI011li();
/* 6 */             zzb = ioooi011li;
/* 10 */            lIIOO0oi1o.I0000oI00(ioOoI011li.class, ioooi011li);
                }

                public static lO11l0OoOIIi I000o00OoI0I() {
/* 9 */             return (lO11l0OoOIIi) zzb.I000OiO(7, null);
                }

                @Override
                public final Object I000OiO(int i, lIIOO0oi1o liioo0oi1o) {
                    lO11l0OoOIIi li1i1li0o0i;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 86 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return new lO1i1o0O0o(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", ioOOl1io.class});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new ioOoI011li();
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
                    synchronized (ioOoI011li.class) {
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

                public final lIOIoo1O I000oI1ioi() {
/* 1 */             return this.zze;
                }
            }
