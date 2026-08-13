            package p000;
            
            public final class iilo1l extends ii0OoOo10 {
                private static final iilo1l zzb;
                private int zzd;
                private Object zzf;
                private ilOiO0 zzg;
                private boolean zzh;
                private l1O1ilI zzi;
                private ioIOiI zzj;
                private iolOO0iIIlI zzk;
                private int zzl;
                private int zze = 0;
                private byte zzm = 2;

                static {
/* 3 */             iilo1l iilo1lVar = new iilo1l();
/* 6 */             zzb = iilo1lVar;
/* 10 */            ii0OoOo10.I000lI(iilo1l.class, iilo1lVar);
                }

                public static iilli0i1lI I001IIilI0O() {
/* 7 */             return (iilli0i1lI) zzb.I0000oI00();
                }

                public static void I001IO000(iilo1l iilo1lVar, ioIOiI ioioii) {
/* 1 */             iilo1lVar.zzj = ioioii;
                    iilo1lVar.zzd |= 8;
                }

                public static void I001i1O0Ol(iilo1l iilo1lVar, iolOO0iIIlI ioloo0iiili) {
/* 1 */             iilo1lVar.zzk = ioloo0iiili;
                    iilo1lVar.zzd |= 16;
                }

                public static void I001i1lo1io(iilo1l iilo1lVar, ilOiO0 iloio0) {
/* 1 */             iilo1lVar.zzg = iloio0;
                    iilo1lVar.zzd |= 1;
                }

                public static void I001iOo1i0O(iilo1l iilo1lVar, l1O1ilI l1o1ili) {
/* 1 */             iilo1lVar.zzi = l1o1ili;
                    iilo1lVar.zzd |= 4;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 77 */                return Byte.valueOf(this.zzm);
                    }
/* 6 */             if (i2 == 2) {
/* 71 */                return new ii0oOi0(zzb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzj", "zzi", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new iilo1l();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new iilli0i1lI(zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzb;
                    }
/* 22 */            this.zzm = ii0oooo10 == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final int I00111O() {
/* 1 */             return this.zzl;
                }

                public final boolean I001l0I00() {
/* 4 */             if (this.zze == 6) {
/* 10 */                return ((Boolean) this.zzf).booleanValue();
                    }
/* 15 */            return false;
                }

                public final boolean I001lIiIIo1O() {
/* 4 */             if (this.zze == 5) {
/* 10 */                return ((Boolean) this.zzf).booleanValue();
                    }
/* 15 */            return false;
                }

                public final boolean I001lllioOl() {
                    return (this.zzd & 32) != 0;
                }
            }
