            package p000;
            
            public final class llOlO1lIl0l extends i1oi01OllI {
                private static final llOlO1lIl0l zzh;
                private static volatile iI0ooO1Oi000 zzi;
                private int zzb;
                private Object zzf;
                private int zze = 0;
                private String zzg = "";

                static {
/* 3 */             llOlO1lIl0l llolo1lil0l = new llOlO1lIl0l();
/* 6 */             zzh = llolo1lil0l;
/* 10 */            i1oi01OllI.I000o00OoI0I(llOlO1lIl0l.class, llolo1lil0l);
                }

                public static llOil00o1O0 I001l0I00() {
/* 7 */             return (llOil00o1O0) zzh.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return i1oi01OllI.I000oI1ioi(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new llOlO1lIl0l();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new llOil00o1O0(zzh);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzh;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzi;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (llOlO1lIl0l.class) {
                        try {
/* 27 */                    i1oo1lloo = zzi;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzh);
/* 38 */                        zzi = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final String I00111O() {
/* 1 */             return this.zzg;
                }

                public final long I001IIilI0O() {
/* 4 */             if (this.zze == 2) {
/* 10 */                return ((Long) this.zzf).longValue();
                    }
/* 15 */            return 0L;
                }

                public final boolean I001IO000() {
/* 4 */             if (this.zze == 3) {
/* 10 */                return ((Boolean) this.zzf).booleanValue();
                    }
/* 15 */            return false;
                }

                public final double I001i1O0Ol() {
/* 4 */             if (this.zze == 4) {
/* 10 */                return ((Double) this.zzf).doubleValue();
                    }
/* 15 */            return 0.0d;
                }

                public final String I001i1lo1io() {
                    return this.zze == 5 ? (String) this.zzf : "";
                }

                public final i1lIIl01O I001iOo1i0O() {
                    return this.zze == 6 ? (i1lIIl01O) this.zzf : i1lIIl01O.I00iiI;
                }

                public final void I001lIiIIo1O(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 1;
/* 10 */            this.zzg = str;
                }

                public final void I001lllioOl(long j) {
/* 2 */             this.zze = 2;
/* 8 */             this.zzf = Long.valueOf(j);
                }

                public final void I001lloI(boolean z) {
/* 2 */             this.zze = 3;
/* 8 */             this.zzf = Boolean.valueOf(z);
                }

                public final void I00II0Ol1O0l(double d) {
/* 2 */             this.zze = 4;
/* 8 */             this.zzf = Double.valueOf(d);
                }

                public final void I00II0oii1o(String str) {
/* 1 */             str.getClass();
/* 5 */             this.zze = 5;
/* 7 */             this.zzf = str;
                }

                public final void I00IO1(i1lIIl01O i1liil01o) {
/* 1 */             i1liil01o.getClass();
/* 5 */             this.zze = 6;
/* 7 */             this.zzf = i1liil01o;
                }

                public final int I00IO1oi11O() {
/* 1 */             int i = this.zze;
/* 4 */             if (i == 0) {
/* 3 */                 return 6;
                    }
/* 7 */             if (i == 2) {
/* 26 */                return 1;
                    }
/* 10 */            if (i == 3) {
/* 6 */                 return 2;
                    }
/* 13 */            if (i == 4) {
/* 9 */                 return 3;
                    }
/* 16 */            if (i != 5) {
                        return i != 6 ? 0 : 5;
                    }
/* 12 */            return 4;
                }
            }
