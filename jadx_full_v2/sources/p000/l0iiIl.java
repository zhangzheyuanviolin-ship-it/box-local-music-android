            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class l0iiIl extends i1oi01OllI {
                private static final l0iiIl zze;
                private static volatile iI0ooO1Oi000 zzf;
                private iI00IlI1oII zzb = iI10i0liO.I00ilI0I1;

                static {
/* 3 */             l0iiIl l0iiil = new l0iiIl();
/* 6 */             zze = l0iiil;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0iiIl.class, l0iiil);
                }

                public static l0Oio1IOl I001IIilI0O() {
/* 7 */             return (l0Oio1IOl) zze.I000OOo1O();
                }

                public static l0iiIl I001IO000() {
/* 1 */             return zze;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return i1oi01OllI.I000oI1ioi(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", l0i111O0.class});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l0iiIl();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new l0Oio1IOl(zze);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zze;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzf;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (l0iiIl.class) {
                        try {
/* 27 */                    i1oo1lloo = zzf;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zze);
/* 38 */                        zzf = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
/* 44 */            return i1oo1lloo;
                }

                public final List I00111O() {
/* 1 */             return this.zzb;
                }

                public final void I001i1O0Ol(ArrayList arrayList) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzb;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzb = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            i1oIooioiO.I00000oOI(arrayList, ii00ili1oiiI000o00OoI0I);
                }
            }
