            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class l0IiI1o01I1o extends i1oi01OllI {
                private static final l0IiI1o01I1o zzp;
                private static volatile iI0ooO1Oi000 zzq;
                private int zzb;
                private String zze;
                private String zzf;
                private String zzg;
                private long zzh;
                private String zzi;
                private String zzj;
                private String zzk;
                private long zzl;
                private iI0Ol0 zzm;
                private iI0Ol0 zzn;
                private String zzo;

                static {
/* 3 */             l0IiI1o01I1o l0iii1o01i1o = new l0IiI1o01I1o();
/* 6 */             zzp = l0iii1o01i1o;
/* 10 */            i1oi01OllI.I000o00OoI0I(l0IiI1o01I1o.class, l0iii1o01i1o);
                }

                public l0IiI1o01I1o() {
/* 4 */             iI0Ol0 ii0ol0 = iI0Ol0.I00iiI;
/* 6 */             this.zzm = ii0ol0;
/* 8 */             this.zzn = ii0ol0;
/* 12 */            this.zze = "";
/* 14 */            this.zzf = "";
/* 16 */            this.zzg = "";
/* 18 */            this.zzi = "";
/* 20 */            this.zzj = "";
/* 22 */            this.zzk = "";
/* 24 */            this.zzo = "";
                }

                public static l0I0I1 I00OilO00Il() {
/* 7 */             return (l0I0I1) zzp.I000OOo1O();
                }

                public static l0IiI1o01I1o I00Oio() {
/* 1 */             return zzp;
                }

                @Override
                public final Object I0010o(int i) {
                    iI0ooO1Oi000 i1oo1lloo;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 110 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 104 */               return i1oi01OllI.I000oI1ioi(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", l0I10lOi.I00000oIO, "zzn", l0IIIO1lI.I00000oIO, "zzo"});
                    }
/* 9 */             if (i2 == 3) {
/* 64 */                return new l0IiI1o01I1o();
                    }
/* 12 */            if (i2 == 4) {
/* 58 */                return new l0I0I1(zzp);
                    }
/* 15 */            if (i2 == 5) {
/* 51 */                return zzp;
                    }
/* 18 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 20 */            iI0ooO1Oi000 ii0ooo1oi000 = zzq;
/* 22 */            if (ii0ooo1oi000 != null) {
/* 48 */                return ii0ooo1oi000;
                    }
                    synchronized (l0IiI1o01I1o.class) {
                        try {
/* 27 */                    i1oo1lloo = zzq;
/* 29 */                    if (i1oo1lloo == null) {
/* 35 */                        i1oo1lloo = new i1oO1llOO(zzp);
/* 38 */                        zzq = i1oo1lloo;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return i1oo1lloo;
                }

                public final void I00111O() {
                    this.zzb &= -5;
/* 11 */            this.zzg = zzp.zzg;
                }

                public final void I001IIilI0O(long j) {
                    this.zzb |= 8;
/* 7 */             this.zzh = j;
                }

                public final void I001IO000(String str) {
                    this.zzb |= 16;
/* 7 */             this.zzi = str;
                }

                public final void I001i1O0Ol() {
                    this.zzb &= -17;
/* 11 */            this.zzi = zzp.zzi;
                }

                public final void I001i1lo1io(String str) {
                    this.zzb |= 32;
/* 7 */             this.zzj = str;
                }

                public final void I001iOo1i0O() {
                    this.zzb &= -33;
/* 11 */            this.zzj = zzp.zzj;
                }

                public final void I001l0I00(String str) {
                    this.zzb |= 64;
/* 7 */             this.zzk = str;
                }

                public final void I001lIiIIo1O() {
                    this.zzb &= -65;
/* 11 */            this.zzk = zzp.zzk;
                }

                public final void I001lllioOl(long j) {
                    this.zzb |= Barcode.FORMAT_ITF;
/* 7 */             this.zzl = j;
                }

                public final iI0Ol0 I001lloI() {
/* 1 */             iI0Ol0 ii0ol0 = this.zzm;
/* 5 */             if (ii0ol0.I00iOIl) {
/* 20 */                return ii0ol0;
                    }
/* 7 */             iI0Ol0 ii0ol0I00000oIO = ii0ol0.I00000oIO();
/* 11 */            this.zzm = ii0ol0I00000oIO;
/* 20 */            return ii0ol0I00000oIO;
                }

                public final iI0Ol0 I00II0Ol1O0l() {
/* 1 */             iI0Ol0 ii0ol0 = this.zzn;
/* 5 */             if (ii0ol0.I00iOIl) {
/* 20 */                return ii0ol0;
                    }
/* 7 */             iI0Ol0 ii0ol0I00000oIO = ii0ol0.I00000oIO();
/* 11 */            this.zzn = ii0ol0I00000oIO;
/* 20 */            return ii0ol0I00000oIO;
                }

                public final void I00II0oii1o(String str) {
                    this.zzb |= Barcode.FORMAT_QR_CODE;
/* 7 */             this.zzo = str;
                }

                public final void I00IO1() {
                    this.zzb &= -257;
/* 11 */            this.zzo = zzp.zzo;
                }

                public final boolean I00IO1oi11O() {
                    return (this.zzb & 1) != 0;
                }

                public final String I00IOO() {
/* 1 */             return this.zze;
                }

                public final boolean I00IioO0OiOi() {
                    return (this.zzb & 2) != 0;
                }

                public final String I00IlilI0i0i() {
/* 1 */             return this.zzf;
                }

                public final boolean I00Io1lO() {
                    return (this.zzb & 4) != 0;
                }

                public final String I00Io1o110i() {
/* 1 */             return this.zzg;
                }

                public final boolean I00IoIO0lI() {
                    return (this.zzb & 8) != 0;
                }

                public final long I00IoO0() {
/* 1 */             return this.zzh;
                }

                public final boolean I00IoiI() {
                    return (this.zzb & 16) != 0;
                }

                public final String I00Iooi00oi() {
/* 1 */             return this.zzi;
                }

                public final boolean I00O0i0ii() {
                    return (this.zzb & 32) != 0;
                }

                public final String I00O0o1oo() {
/* 1 */             return this.zzj;
                }

                public final boolean I00O10llo() {
                    return (this.zzb & 64) != 0;
                }

                public final String I00OI1() {
/* 1 */             return this.zzk;
                }

                public final boolean I00OIO1() {
                    return (this.zzb & Barcode.FORMAT_ITF) != 0;
                }

                public final long I00OIl() {
/* 1 */             return this.zzl;
                }

                public final boolean I00OIo() {
                    return (this.zzb & Barcode.FORMAT_QR_CODE) != 0;
                }

                public final String I00OOll1() {
/* 1 */             return this.zzo;
                }

                public final void I00Ol00(String str) {
                    this.zzb |= 1;
/* 7 */             this.zze = str;
                }

                public final void I00Ol10() {
                    this.zzb &= -2;
/* 11 */            this.zze = zzp.zze;
                }

                public final void I00Ol1ll1(String str) {
                    this.zzb |= 2;
/* 7 */             this.zzf = str;
                }

                public final void I00OloOo() {
                    this.zzb &= -3;
/* 11 */            this.zzf = zzp.zzf;
                }

                public final void I00i01iIIliI(String str) {
                    this.zzb |= 4;
/* 7 */             this.zzg = str;
                }
            }
