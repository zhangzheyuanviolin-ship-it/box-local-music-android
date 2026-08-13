            package p000;

            import java.util.List;
            
            public final class l1100ll extends i1oi01OllI {
                private static final l1100ll zzg;
                private static volatile iI0ooO1Oi000 zzh;
                private int zzb;
                private int zze;
                private iI001o1 zzf = iI0Il0IoIil.I00ilI0I1;

                static {
/* 3 */             l1100ll l1100llVar = new l1100ll();
/* 6 */             zzg = l1100llVar;
/* 10 */            i1oi01OllI.I000o00OoI0I(l1100ll.class, l1100llVar);
                }

                public static l10oOiI0 I001iOo1i0O() {
/* 7 */             return (l10oOiI0) zzg.I000OOo1O();
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return i1oi01OllI.I000oI1ioi(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l1100ll();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new l10oOiI0(zzg);
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
                    synchronized (l1100ll.class) {
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

                public final boolean I00111O() {
                    return (this.zzb & 1) != 0;
                }

                public final int I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final List I001IO000() {
/* 1 */             return this.zzf;
                }

                public final int I001i1O0Ol() {
/* 3 */             return this.zzf.size();
                }

                public final long I001i1lo1io(int i) {
/* 5 */             return ((iI0Il0IoIil) this.zzf).I0000O(i);
                }

                public final void I001l0I00(int i) {
                    this.zzb |= 1;
/* 7 */             this.zze = i;
                }

                public final void I001lIiIIo1O(List list) {
/* 1 */             List list2 = this.zzf;
/* 6 */             boolean z = ((i1io1OO01oI) list2).I00iOIl;
                    List list3 = list2;
/* 8 */             if (!z) {
/* 10 */                int size = list2.size();
/* 17 */                iI0Il0IoIil ii0il0ioiilI00iOIl = ((iI0Il0IoIil) list2).I00iOIl(size + size);
/* 21 */                this.zzf = ii0il0ioiilI00iOIl;
                        list3 = ii0il0ioiilI00iOIl;
                    }
/* 23 */            i1oIooioiO.I00000oOI(list, list3);
                }
            }
