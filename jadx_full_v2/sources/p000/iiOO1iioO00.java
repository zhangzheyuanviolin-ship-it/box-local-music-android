            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class iiOO1iioO00 extends ii0OoOo10 {
                private static final iiOO1iioO00 zzb;
                private int zzd;
                private String zze = "";
                private ii01lO0l11ii zzf;
                private iiOOIO0Ii1o zzg;
                private String zzh;
                private ii01lO0l11ii zzi;
                private iiOOIO0Ii1o zzj;
                private String zzk;
                private ii01lO0l11ii zzl;
                private iiOOIO0Ii1o zzm;
                private String zzn;
                private String zzo;
                private iiOOIO0Ii1o zzp;

                static {
/* 3 */             iiOO1iioO00 iioo1iioo00 = new iiOO1iioO00();
/* 6 */             zzb = iioo1iioo00;
/* 10 */            ii0OoOo10.I000lI(iiOO1iioO00.class, iioo1iioo00);
                }

                public iiOO1iioO00() {
/* 8 */             ii01iiOoo ii01iiooo = ii01lO0l11ii.I00iiI;
/* 10 */            this.zzf = ii01iiooo;
/* 12 */            this.zzh = "";
/* 14 */            this.zzi = ii01iiooo;
/* 16 */            this.zzk = "";
/* 18 */            this.zzl = ii01iiooo;
/* 20 */            this.zzn = "";
/* 22 */            this.zzo = "";
                }

                public static iiOO1iO I00111O() {
/* 7 */             return (iiOO1iO) zzb.I0000oI00();
                }

                public static iiOO1iioO00 I001IIilI0O() {
/* 1 */             return zzb;
                }

                public static void I001IO000(iiOO1iioO00 iioo1iioo00, ii01lO0l11ii ii01lo0l11ii) {
/* 1 */             ii01lo0l11ii.getClass();
                    iioo1iioo00.zzd |= 16;
/* 10 */            iioo1iioo00.zzi = ii01lo0l11ii;
                }

                public static void I001i1O0Ol(iiOO1iioO00 iioo1iioo00, ii01lO0l11ii ii01lo0l11ii) {
/* 1 */             ii01lo0l11ii.getClass();
                    iioo1iioo00.zzd |= Barcode.FORMAT_ITF;
/* 10 */            iioo1iioo00.zzl = ii01lo0l11ii;
                }

                public static void I001i1lo1io(iiOO1iioO00 iioo1iioo00, iiOOIO0Ii1o iiooio0ii1o) {
/* 1 */             iioo1iioo00.zzg = iiooio0ii1o;
                    iioo1iioo00.zzd |= 4;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 77 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 72 */                return new ii0oOi0(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0004\u0004ဈ\u0003\u0005ဈ\u0006\u0006ည\u0007\u0007ဈ\t\bဈ\n\tဉ\u0002\nဉ\u0005\u000bဉ\b\fဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzi", "zzh", "zzk", "zzl", "zzn", "zzo", "zzg", "zzj", "zzm", "zzp"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iiOO1iioO00();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iiOO1iO(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
