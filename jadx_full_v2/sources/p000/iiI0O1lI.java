            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class iiI0O1lI extends ii0OoOo10 {
                private static final iiI0O1lI zzb;
                private int zzd;
                private ii1lIlI0 zze;
                private iiI0lOl zzf;
                private iiI01l0 zzg;
                private int zzh;
                private iiI011O00i zzi;
                private iiI1lIiOOloi zzj;
                private long zzk;
                private long zzl;
                private boolean zzm;
                private int zzn;
                private byte zzo = 2;

                static {
/* 3 */             iiI0O1lI iii0o1li = new iiI0O1lI();
/* 6 */             zzb = iii0o1li;
/* 10 */            ii0OoOo10.I000lI(iiI0O1lI.class, iii0o1li);
                }

                public static iiI0Ill0 I001IO000() {
/* 7 */             return (iiI0Ill0) zzb.I0000oI00();
                }

                public static void I001i1O0Ol(iiI0O1lI iii0o1li) {
                    iii0o1li.zzd |= Barcode.FORMAT_UPC_A;
/* 8 */             iii0o1li.zzn = 3;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 83 */                return Byte.valueOf(this.zzo);
                    }
/* 6 */             if (i2 == 2) {
/* 77 */                return new ii0oOi0(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0003\u0004ဉ\u0004\u0005ᐉ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tင\t\nဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzh", iOoiloi.I001l0I00, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new iiI0O1lI();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new iiI0Ill0(zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzb;
                    }
/* 22 */            this.zzo = ii0oooo10 == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final long I00111O() {
/* 1 */             return this.zzl;
                }

                public final iiI011O00i I001IIilI0O() {
/* 1 */             iiI011O00i iii011o00i = this.zzi;
                    return iii011o00i == null ? iiI011O00i.I001IO000() : iii011o00i;
                }
            }
