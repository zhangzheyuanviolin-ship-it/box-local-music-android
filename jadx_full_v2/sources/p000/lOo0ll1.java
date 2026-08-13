            package p000;
            
            public final class lOo0ll1 extends i1oi01OllI {
                private static final lOo0ll1 zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private lOlIllO1 zze;
                private lOliIOo1 zzf;

                static {
/* 3 */             lOo0ll1 loo0ll1 = new lOo0ll1();
/* 6 */             zzg = loo0ll1;
/* 10 */            i1oi01OllI.I000o00OoI0I(lOo0ll1.class, loo0ll1);
                }

                public static lOo0ll1 I001IO000(byte[] bArr, i1o0l0i i1o0l0iVar) {
/* 7 */             return (lOo0ll1) i1oi01OllI.I0000O(zzg, bArr, i1o0l0iVar);
                }

                public static lOo011l1O1 I001i1O0Ol() {
/* 7 */             return (lOo011l1O1) zzg.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new lOo0ll1();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new lOo011l1O1(zzg);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzg;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzh;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (lOo0ll1.class) {
                        try {
/* 27 */                    i1oo1lloo = zzh;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzg);
/* 38 */                        zzh = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final lOlIllO1 I00111O() {
/* 1 */             lOlIllO1 lolillo1 = this.zze;
                    return lolillo1 == null ? lOlIllO1.I00IOO() : lolillo1;
                }

                public final lOliIOo1 I001IIilI0O() {
/* 1 */             lOliIOo1 loliioo1 = this.zzf;
                    return loliioo1 == null ? lOliIOo1.I00111O() : loliioo1;
                }

                public final void I001i1lo1io(lOlIllO1 lolillo1) {
/* 1 */             this.zze = lolillo1;
                    this.zzb |= 1;
                }
            }
