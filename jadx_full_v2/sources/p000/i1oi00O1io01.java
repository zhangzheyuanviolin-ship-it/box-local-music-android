            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class i1oi00O1io01 extends ii0OoOo10 {
                private static final i1oi00O1io01 zzb;
                private int zzd;
                private String zze = "";
                private String zzf = "";
                private String zzg = "";
                private String zzh = "";
                private String zzi = "";
                private String zzj = "";
                private String zzk = "";
                private ii0i1l11 zzl = ii0oOIO0OliO.I00iio;
                private String zzm = "";
                private boolean zzn;
                private boolean zzo;
                private boolean zzp;
                private int zzq;
                private int zzr;

                static {
/* 3 */             i1oi00O1io01 i1oi00o1io01 = new i1oi00O1io01();
/* 6 */             zzb = i1oi00o1io01;
/* 10 */            ii0OoOo10.I000lI(i1oi00O1io01.class, i1oi00o1io01);
                }

                public static i1oOlI I00111O() {
/* 7 */             return (i1oOlI) zzb.I0000oI00();
                }

                public static i1oi00O1io01 I001IIilI0O() {
/* 1 */             return zzb;
                }

                public static void I001i1O0Ol(i1oi00O1io01 i1oi00o1io01, String str) {
                    i1oi00o1io01.zzd |= 1;
/* 7 */             i1oi00o1io01.zze = str;
                }

                public static void I001i1lo1io(i1oi00O1io01 i1oi00o1io01, String str) {
                    i1oi00o1io01.zzd |= 8;
/* 7 */             i1oi00o1io01.zzh = str;
                }

                public static void I001iOo1i0O(i1oi00O1io01 i1oi00o1io01, String str) {
                    i1oi00o1io01.zzd |= 16;
/* 7 */             i1oi00o1io01.zzi = str;
                }

                public static void I001l0I00(i1oi00O1io01 i1oi00o1io01) {
                    i1oi00o1io01.zzd |= 32;
/* 9 */             i1oi00o1io01.zzj = "";
                }

                public static void I001lIiIIo1O(i1oi00O1io01 i1oi00o1io01) {
                    i1oi00o1io01.zzd |= 64;
/* 9 */             i1oi00o1io01.zzk = "";
                }

                public static void I001lllioOl(i1oi00O1io01 i1oi00o1io01, lIil0l010OO liil0l010oo) {
/* 1 */             ii0i1l11 ii0i1l11VarI000OOo1O = i1oi00o1io01.zzl;
/* 8 */             if (!((ii010ilOI1O1) ii0i1l11VarI000OOo1O).I00iOIl) {
/* 10 */                ii0i1l11VarI000OOo1O = ii0OoOo10.I000OOo1O(ii0i1l11VarI000OOo1O);
/* 14 */                i1oi00o1io01.zzl = ii0i1l11VarI000OOo1O;
                    }
/* 16 */            ii00oo.I00000oOI(liil0l010oo, ii0i1l11VarI000OOo1O);
                }

                public static void I001lloI(i1oi00O1io01 i1oi00o1io01, String str) {
                    i1oi00o1io01.zzd |= Barcode.FORMAT_ITF;
/* 7 */             i1oi00o1io01.zzm = str;
                }

                public static void I00II0Ol1O0l(i1oi00O1io01 i1oi00o1io01, boolean z) {
                    i1oi00o1io01.zzd |= Barcode.FORMAT_QR_CODE;
/* 7 */             i1oi00o1io01.zzn = z;
                }

                public static void I00II0oii1o(i1oi00O1io01 i1oi00o1io01, boolean z) {
                    i1oi00o1io01.zzd |= Barcode.FORMAT_UPC_A;
/* 7 */             i1oi00o1io01.zzo = z;
                }

                public static void I00IO1(i1oi00O1io01 i1oi00o1io01, int i) {
                    i1oi00o1io01.zzd |= Barcode.FORMAT_PDF417;
/* 7 */             i1oi00o1io01.zzq = i;
                }

                public static void I00IO1oi11O(i1oi00O1io01 i1oi00o1io01, int i) {
                    i1oi00o1io01.zzd |= Barcode.FORMAT_AZTEC;
/* 7 */             i1oi00o1io01.zzr = i;
                }

                public static void I00IOO(i1oi00O1io01 i1oi00o1io01, String str) {
                    i1oi00o1io01.zzd |= 2;
/* 7 */             i1oi00o1io01.zzf = str;
                }

                public static void I00IioO0OiOi(i1oi00O1io01 i1oi00o1io01) {
                    i1oi00o1io01.zzd |= 4;
/* 9 */             i1oi00o1io01.zzg = "";
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 81 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 76 */                return new ii0oOi0(zzb, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b\u001a\tဈ\u0007\nဇ\b\u000bဇ\t\fဇ\n\rဋ\u000b\u000eင\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new i1oi00O1io01();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i1oOlI(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final String I001IO000() {
/* 1 */             return this.zzi;
                }
            }
