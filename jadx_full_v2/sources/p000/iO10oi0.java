            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class iO10oi0 extends ii0OoOo10 {
                private static final iO10oi0 zzb;
                private int zzd;
                private Object zzf;
                private boolean zzg;
                private l1Io001O1 zzh;
                private boolean zzi;
                private l0OOlliiOo zzj;
                private float zzk;
                private boolean zzl;
                private boolean zzm;
                private boolean zzo;
                private float zzp;
                private int zzq;
                private iiIo11i0oo zzr;
                private int zze = 0;
                private byte zzs = 2;
                private int zzn = -1;

                static {
/* 3 */             iO10oi0 io10oi0 = new iO10oi0();
/* 6 */             zzb = io10oi0;
/* 10 */            ii0OoOo10.I000lI(iO10oi0.class, io10oi0);
                }

                public static iO0OliiO I00111O() {
/* 7 */             return (iO0OliiO) zzb.I0000oI00();
                }

                public static void I001IIilI0O(iO10oi0 io10oi0, l1Io001O1 l1io001o1) {
/* 1 */             l1io001o1.getClass();
/* 4 */             io10oi0.zzh = l1io001o1;
                    io10oi0.zzd |= 2;
                }

                public static void I001IO000(iO10oi0 io10oi0) {
                    io10oi0.zzd |= 4;
/* 8 */             io10oi0.zzi = true;
                }

                public static void I001i1O0Ol(iO10oi0 io10oi0, l0OOlliiOo l0oolliioo) {
/* 1 */             io10oi0.zzj = l0oolliioo;
                    io10oi0.zzd |= 8;
                }

                public static void I001i1lo1io(iO10oi0 io10oi0, iiOOO1I01 iiooo1i01) {
/* 1 */             io10oi0.zzf = iiooo1i01;
/* 4 */             io10oi0.zze = 1;
                }

                public static void I001iOo1i0O(iO10oi0 io10oi0, boolean z) {
                    io10oi0.zzd |= 64;
/* 7 */             io10oi0.zzm = z;
                }

                public static void I001l0I00(iO10oi0 io10oi0, int i) {
                    io10oi0.zzd |= Barcode.FORMAT_ITF;
/* 7 */             io10oi0.zzn = i;
                }

                public static void I001lIiIIo1O(iO10oi0 io10oi0) {
                    io10oi0.zzd |= Barcode.FORMAT_UPC_A;
/* 10 */            io10oi0.zzp = 0.6f;
                }

                public static void I001lllioOl(iO10oi0 io10oi0) {
                    io10oi0.zzd |= Barcode.FORMAT_UPC_E;
/* 8 */             io10oi0.zzq = 0;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 5 */             if (i2 == 0) {
/* 95 */                return Byte.valueOf(this.zzs);
                    }
/* 8 */             if (i2 == 2) {
/* 89 */                return new ii0oOi0(zzb, "\u0004\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001м\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0006\u0005င\u0007\u0006ဇ\b\u0007ဇ\u0000\bခ\t\tင\n\nဇ\u0002\u000bဉ\u000b\fခ\u0004\rဇ\u0005\u000e<\u0000", new Object[]{"zzf", "zze", "zzd", iiOOO1I01.class, "zzh", "zzj", "zzm", "zzn", "zzo", "zzg", "zzp", "zzq", "zzi", "zzr", "zzk", "zzl", il0oIOOIOO.class});
                    }
/* 11 */            if (i2 == 3) {
/* 41 */                return new iO10oi0();
                    }
/* 14 */            if (i2 == 4) {
/* 35 */                return new iO0OliiO(zzb);
                    }
/* 17 */            if (i2 == 5) {
/* 28 */                return zzb;
                    }
/* 24 */            this.zzs = ii0oooo10 == null ? (byte) 0 : (byte) 1;
/* 26 */            return null;
                }
            }
