            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.List;
            
            public final class l00O0loO extends i1oi01OllI {
                private static final l00O0loO zzw;
                private static volatile iI0ooO1Oi000 zzx;
                private int zzb;
                private long zze;
                private String zzf = "";
                private int zzg;
                private iI00IlI1oII zzh;
                private iI00IlI1oII zzi;
                private iI00IlI1oII zzj;
                private String zzk;
                private boolean zzl;
                private iI00IlI1oII zzm;
                private iI00IlI1oII zzn;
                private String zzo;
                private String zzp;
                private iooOiIloili zzq;
                private l00oOl0i00 zzr;
                private l01l00o zzs;
                private l010oo0li0 zzt;
                private l00il1oiiiIl zzu;
                private i1oo10I0OO zzv;

                static {
/* 3 */             l00O0loO l00o0loo = new l00O0loO();
/* 6 */             zzw = l00o0loo;
/* 10 */            i1oi01OllI.I000o00OoI0I(l00O0loO.class, l00o0loo);
                }

                public l00O0loO() {
/* 8 */             iI10i0liO ii10i0lio = iI10i0liO.I00ilI0I1;
/* 10 */            this.zzh = ii10i0lio;
/* 12 */            this.zzi = ii10i0lio;
/* 14 */            this.zzj = ii10i0lio;
/* 16 */            this.zzk = "";
/* 18 */            this.zzm = ii10i0lio;
/* 20 */            this.zzn = ii10i0lio;
/* 22 */            this.zzo = "";
/* 24 */            this.zzp = "";
/* 28 */            this.zzv = i1oiI1lIo.I00ilI0I1;
                }

                public static l001olOIO1il I00Io1lO() {
/* 7 */             return (l001olOIO1il) zzw.I000OOo1O();
                }

                public static l00O0loO I00Io1o110i() {
/* 1 */             return zzw;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 129 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 123 */               return i1oi01OllI.I000oI1ioi(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", l01IlIIiiI.class, "zzi", l000oiIIiIiI.class, "zzj", io1l111o.class, "zzk", "zzl", "zzm", l1OOIIoo0.class, "zzn", ioollI0011i.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
                    }
/* 9 */             if (i2 == 3) {
/* 63 */                return new l00O0loO();
                    }
/* 12 */            if (i2 == 4) {
/* 57 */                return new l001olOIO1il(zzw);
                    }
/* 15 */            if (i2 == 5) {
/* 50 */                return zzw;
                    }
/* 18 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzx;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 47 */                return ii0ooo1oi000;
                    }
                    synchronized (l00O0loO.class) {
                        try {
/* 27 */                    i1oo1lloo = zzx;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzw);
/* 38 */                        zzx = i1oo1lloo;
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

                public final long I001IIilI0O() {
/* 1 */             return this.zze;
                }

                public final boolean I001IO000() {
                    return (this.zzb & 2) != 0;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.zzf;
                }

                public final iI00IlI1oII I001i1lo1io() {
/* 1 */             return this.zzh;
                }

                public final int I001iOo1i0O() {
/* 3 */             return this.zzi.size();
                }

                public final l000oiIIiIiI I001l0I00(int i) {
/* 7 */             return (l000oiIIiIiI) this.zzi.get(i);
                }

                public final List I001lIiIIo1O() {
/* 1 */             return this.zzj;
                }

                public final iI00IlI1oII I001lllioOl() {
/* 1 */             return this.zzm;
                }

                public final int I001lloI() {
/* 3 */             return this.zzm.size();
                }

                public final iI00IlI1oII I00II0Ol1O0l() {
/* 1 */             return this.zzn;
                }

                public final String I00II0oii1o() {
/* 1 */             return this.zzo;
                }

                public final boolean I00IO1() {
                    return (this.zzb & Barcode.FORMAT_ITF) != 0;
                }

                public final iooOiIloili I00IO1oi11O() {
/* 1 */             iooOiIloili ioooiiloili = this.zzq;
                    return ioooiiloili == null ? iooOiIloili.I001l0I00() : ioooiiloili;
                }

                public final boolean I00IOO() {
                    return (this.zzb & Barcode.FORMAT_UPC_A) != 0;
                }

                public final l01l00o I00IioO0OiOi() {
/* 1 */             l01l00o l01l00oVar = this.zzs;
                    return l01l00oVar == null ? l01l00o.I001IO000() : l01l00oVar;
                }

                public final i1oo10I0OO I00IlilI0i0i() {
/* 1 */             return this.zzv;
                }

                public final void I00IoIO0lI(int i, l000oiIIiIiI l000oiiiiiii) {
/* 1 */             iI00IlI1oII ii00ili1oiiI000o00OoI0I = this.zzi;
/* 8 */             if (!((i1io1OO01oI) ii00ili1oiiI000o00OoI0I).I00iOIl) {
/* 10 */                ii00ili1oiiI000o00OoI0I = io1OllI.I000o00OoI0I(ii00ili1oiiI000o00OoI0I);
/* 14 */                this.zzi = ii00ili1oiiI000o00OoI0I;
                    }
/* 16 */            ii00ili1oiiI000o00OoI0I.set(i, l000oiiiiiii);
                }

                public final void I00IoO0() {
/* 3 */             this.zzj = iI10i0liO.I00ilI0I1;
                }

                public final void I00IoiI() {
/* 3 */             this.zzm = iI10i0liO.I00ilI0I1;
                }
            }
