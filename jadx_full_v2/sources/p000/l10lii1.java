            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class l10lii1 extends i1oi01OllI {
                private static final l10lii1 zzh;
                private static volatile iI0ooO1Oi000 zzi;
                private iI001o1 zzb;
                private iI001o1 zze;
                private iI00IlI1oII zzf;
                private iI00IlI1oII zzg;

                static {
/* 3 */             l10lii1 l10lii1Var = new l10lii1();
/* 6 */             zzh = l10lii1Var;
/* 10 */            i1oi01OllI.I000o00OoI0I(l10lii1.class, l10lii1Var);
                }

                public l10lii1() {
/* 4 */             iI0Il0IoIil ii0il0ioiil = iI0Il0IoIil.I00ilI0I1;
/* 6 */             this.zzb = ii0il0ioiil;
/* 8 */             this.zze = ii0il0ioiil;
/* 10 */            iI10i0liO ii10i0lio = iI10i0liO.I00ilI0I1;
/* 12 */            this.zzf = ii10i0lio;
/* 14 */            this.zzg = ii10i0lio;
                }

                public static l10iIi0IIl0 I001lllioOl() {
/* 7 */             return (l10iIi0IIl0) zzh.I000OOo1O();
                }

                public static l10lii1 I001lloI() {
/* 1 */             return zzh;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return i1oi01OllI.I000oI1ioi(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", l0io11IIiil.class, "zzg", l1100ll.class});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l10lii1();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new l10iIi0IIl0(zzh);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzh;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzi;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l10lii1.class) {
                        try {
/* 27 */                    i1oo1lloo = zzi;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzh);
/* 38 */                        zzi = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final List I00111O() {
/* 1 */             return this.zzb;
                }

                public final int I001IIilI0O() {
/* 3 */             return this.zzb.size();
                }

                public final List I001IO000() {
/* 1 */             return this.zze;
                }

                public final int I001i1O0Ol() {
/* 3 */             return this.zze.size();
                }

                public final iI00IlI1oII I001i1lo1io() {
/* 1 */             return this.zzf;
                }

                public final int I001iOo1i0O() {
/* 3 */             return this.zzf.size();
                }

                public final iI00IlI1oII I001l0I00() {
/* 1 */             return this.zzg;
                }

                public final int I001lIiIIo1O() {
/* 3 */             return this.zzg.size();
                }

                public final void I00II0Ol1O0l(Iterable iterable) {
/* 1 */             List list = this.zzb;
/* 6 */             boolean z = ((i1io1OO01oI) list).I00iOIl;
                    List list2 = list;
/* 8 */             if (!z) {
/* 10 */                int size = list.size();
/* 17 */                iI0Il0IoIil ii0il0ioiilI00iOIl = ((iI0Il0IoIil) list).I00iOIl(size + size);
/* 21 */                this.zzb = ii0il0ioiilI00iOIl;
                        list2 = ii0il0ioiilI00iOIl;
                    }
/* 23 */            i1oIooioiO.I00000oOI(iterable, list2);
                }

                public final void I00II0oii1o() {
/* 3 */             this.zzb = iI0Il0IoIil.I00ilI0I1;
                }

                public final void I00IO1(List list) {
/* 1 */             List list2 = this.zze;
/* 6 */             boolean z = ((i1io1OO01oI) list2).I00iOIl;
                    List list3 = list2;
/* 8 */             if (!z) {
/* 10 */                int size = list2.size();
/* 17 */                iI0Il0IoIil ii0il0ioiilI00iOIl = ((iI0Il0IoIil) list2).I00iOIl(size + size);
/* 21 */                this.zze = ii0il0ioiilI00iOIl;
                        list3 = ii0il0ioiilI00iOIl;
                    }
/* 23 */            i1oIooioiO.I00000oOI(list, list3);
                }

                public final void I00IO1oi11O() {
/* 3 */             this.zze = iI0Il0IoIil.I00ilI0I1;
                }

                public final void I00IOO(ArrayList arrayList) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzf;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzf = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            i1oIooioiO.I00000oOI(arrayList, ii00ili1oiiI000o00OoI0I);
                }

                public final void I00IioO0OiOi() {
/* 3 */             this.zzf = iI10i0liO.I00ilI0I1;
                }

                public final void I00IlilI0i0i(Iterable iterable) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzg;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzg = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            i1oIooioiO.I00000oOI(iterable, ii00ili1oiiI000o00OoI0I);
                }

                public final void I00Io1lO() {
/* 3 */             this.zzg = iI10i0liO.I00ilI0I1;
                }
            }
