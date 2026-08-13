            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class o0iIO111 extends o001IlOi0O implements o0IIiol0oIo {
                private static final o0iIO111 zzb;
                private int zzd;
                private boolean zzi;
                private boolean zzj;
                private boolean zzm;
                private o10lOOO zzn;
                private lIOioi0II0o zzo;
                private i1liOiiOI zzp;
                private float zze = 0.1f;
                private int zzf = 1;
                private int zzg = 1;
                private int zzh = 1;
                private float zzk = 45.0f;
                private float zzl = 0.5f;

                static {
/* 3 */             o0iIO111 o0iio111 = new o0iIO111();
/* 6 */             zzb = o0iio111;
/* 10 */            o001IlOi0O.I0001Ioi1lo(o0iIO111.class, o0iio111);
                }

                public static o0IiO00l I000oI1ioi() {
/* 7 */             return (o0IiO00l) zzb.I000lI();
                }

                public static void I00100l0(o0iIO111 o0iio111, float f) {
                    o0iio111.zzd |= 1;
/* 7 */             o0iio111.zze = f;
                }

                public static void I00100o1O0lo(o0iIO111 o0iio111, boolean z) {
                    o0iio111.zzd |= 32;
/* 7 */             o0iio111.zzj = z;
                }

                public static void I0010I0i(o0iIO111 o0iio111) {
                    o0iio111.zzd |= Barcode.FORMAT_QR_CODE;
/* 8 */             o0iio111.zzm = true;
                }

                public static void I0010o(o0iIO111 o0iio111, o10lOOO o10looo) {
/* 1 */             o0iio111.zzn = o10looo;
                    o0iio111.zzd |= Barcode.FORMAT_UPC_A;
                }

                public static void I00111O(o0iIO111 o0iio111, lIOioi0II0o lioioi0ii0o) {
/* 1 */             o0iio111.zzo = lioioi0ii0o;
                    o0iio111.zzd |= Barcode.FORMAT_UPC_E;
                }

                public static void I001IIilI0O(o0iIO111 o0iio111, i1liOiiOI i1lioiioi) {
/* 1 */             o0iio111.zzp = i1lioiioi;
                    o0iio111.zzd |= Barcode.FORMAT_PDF417;
                }

                public static void I001IO000(o0iIO111 o0iio111, boolean z) {
                    o0iio111.zzd |= 16;
/* 7 */             o0iio111.zzi = z;
                }

                public static void I001iOo1i0O(o0iIO111 o0iio111, int i) {
/* 3 */             o0iio111.zzf = i - 1;
                    o0iio111.zzd |= 2;
                }

                public static void I001l0I00(o0iIO111 o0iio111, int i) {
/* 3 */             o0iio111.zzg = i - 1;
                    o0iio111.zzd |= 4;
                }

                public static void I001lIiIIo1O(o0iIO111 o0iio111, int i) {
/* 3 */             o0iio111.zzh = i - 1;
                    o0iio111.zzd |= 8;
                }

                @Override
                public final Object I000iOII(int i, o001IlOi0O o001iloi0o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 82 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 76 */                return o001IlOi0O.I0000O(zzb, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"zzd", "zze", "zzf", i1IOi0lOi1II.I00000oOI, "zzg", i1IOi0lOi1II.I0001Ioi1lo, "zzh", i1IOi0lOi1II.I0000Il00O, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new o0iIO111();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new o0IiO00l(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final int I001i1O0Ol() {
/* 1 */             int i = this.zzg;
/* 15 */            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 3 : 2 : 1;
/* 16 */            if (i2 == 0) {
/* 3 */                 return 2;
                    }
/* 20 */            return i2;
                }

                public final int I001i1lo1io() {
/* 1 */             int i = this.zzf;
/* 4 */             int i2 = 1;
/* 5 */             if (i != 0) {
/* 7 */                 if (i != 1) {
/* 9 */                     i2 = 3;
/* 10 */                    if (i != 2) {
/* 16 */                        i2 = i != 3 ? 0 : 4;
                            }
                        } else {
/* 18 */                    i2 = 2;
                        }
                    }
/* 19 */            if (i2 == 0) {
/* 3 */                 return 2;
                    }
/* 55 */            return i2;
                }
            }
