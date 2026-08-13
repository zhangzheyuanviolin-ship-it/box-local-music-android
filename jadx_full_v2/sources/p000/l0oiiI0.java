            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class l0oiiI0 extends i1oi01OllI {
                private static final l0oiiI0 zzi;
                private static volatile iI0ooO1Oi000 zzj;
                private int zzb;
                private iI00IlI1oII zze = iI10i0liO.I00ilI0I1;
                private String zzf = "";
                private String zzg = "";
                private int zzh;

                static {
/* 3 */             l0oiiI0 l0oiii0 = new l0oiiI0();
/* 6 */             zzi = l0oiii0;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0oiiI0.class, l0oiii0);
                }

                public static l0o1OoOIol I001lIiIIo1O() {
/* 7 */             return (l0o1OoOIol) zzi.I000OOo1O();
                }

                public static l0o1OoOIol I001lllioOl(l0oiiI0 l0oiii0) {
/* 3 */             i1oIooioiO i1oiooioioI000OOo1O = zzi.I000OOo1O();
/* 7 */             i1oiooioioI000OOo1O.I0001Ioi1lo(l0oiii0);
/* 10 */            return (l0o1OoOIol) i1oiooioioI000OOo1O;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return i1oi01OllI.I000oI1ioi(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", l100ll0OOIoO.class, "zzf", "zzg", "zzh", i1iOOl0o.I000iOII});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l0oiiI0();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new l0o1OoOIol(zzi);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzi;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzj;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l0oiiI0.class) {
                        try {
/* 27 */                    i1oo1lloo = zzj;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzi);
/* 38 */                        zzj = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final List I00111O() {
/* 1 */             return this.zze;
                }

                public final int I001IIilI0O() {
/* 3 */             return this.zze.size();
                }

                public final l100ll0OOIoO I001IO000(int i) {
/* 7 */             return (l100ll0OOIoO) this.zze.get(i);
                }

                public final boolean I001i1O0Ol() {
                    return (this.zzb & 1) != 0;
                }

                public final String I001i1lo1io() {
/* 1 */             return this.zzf;
                }

                public final boolean I001iOo1i0O() {
                    return (this.zzb & 2) != 0;
                }

                public final String I001l0I00() {
/* 1 */             return this.zzg;
                }

                public final void I001lloI(int i, l100ll0OOIoO l100ll0ooioo) {
/* 1 */             I00IioO0OiOi();
/* 6 */             this.zze.set(i, l100ll0ooioo);
                }

                public final void I00II0Ol1O0l(l100ll0OOIoO l100ll0ooioo) {
/* 1 */             I00IioO0OiOi();
/* 6 */             this.zze.add(l100ll0ooioo);
                }

                public final void I00II0oii1o(ArrayList arrayList) {
/* 1 */             I00IioO0OiOi();
/* 6 */             i1oIooioiO.I00000oOI(arrayList, this.zze);
                }

                public final void I00IO1() {
/* 3 */             this.zze = iI10i0liO.I00ilI0I1;
                }

                public final void I00IO1oi11O(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 1;
/* 10 */            this.zzf = str;
                }

                public final void I00IOO(String str) {
/* 1 */             str.getClass();
                    this.zzb |= 2;
/* 10 */            this.zzg = str;
                }

                public final void I00IioO0OiOi() {
/* 1 */             iI00IlI1oII ii00ili1oii = this.zze;
/* 8 */             if (((i1io1OO01oI) ii00ili1oii).I00iOIl) {
/* 20 */                return;
                    }
/* 14 */            this.zze = io1OllI.I000o00OoI0I(ii00ili1oii);
                }
            }
