            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class l1Io001O1 extends ii0OoOo10 {
                private static final l1Io001O1 zzb;
                private int zzd;
                private l1Io0011l0i1 zzg;
                private l0i1I00l0o zzh;
                private l0i1I00l0o zzi;
                private iil000iIoi1 zzj;
                private float zzm;
                private ii0i1l11 zzn;
                private ii0i1l11 zzo;
                private boolean zzp;
                private ii10lI1lO0 zzq;
                private int zzr;
                private String zze = "";
                private String zzf = "";
                private String zzk = "en";
                private int zzl = -1;

                static {
/* 3 */             l1Io001O1 l1io001o1 = new l1Io001O1();
/* 6 */             zzb = l1io001o1;
/* 10 */            ii0OoOo10.I000lI(l1Io001O1.class, l1io001o1);
                }

                public l1Io001O1() {
/* 17 */            ii0oOIO0OliO ii0ooio0olio = ii0oOIO0OliO.I00iio;
/* 19 */            this.zzn = ii0ooio0olio;
/* 21 */            this.zzo = ii0ooio0olio;
/* 23 */            this.zzr = -1;
                }

                public static l1Ii0O0i10O1 I00111O() {
/* 7 */             return (l1Ii0O0i10O1) zzb.I0000oI00();
                }

                public static void I001IIilI0O(l1Io001O1 l1io001o1, l0i1I00l0o l0i1i00l0o) {
/* 1 */             l1io001o1.zzh = l0i1i00l0o;
                    l1io001o1.zzd |= 8;
                }

                public static void I001IO000(l1Io001O1 l1io001o1, l0i1I00l0o l0i1i00l0o) {
/* 1 */             l1io001o1.zzi = l0i1i00l0o;
                    l1io001o1.zzd |= 16;
                }

                public static void I001i1O0Ol(l1Io001O1 l1io001o1, int i) {
                    l1io001o1.zzd |= Barcode.FORMAT_ITF;
/* 7 */             l1io001o1.zzl = i;
                }

                public static void I001i1lo1io(l1Io001O1 l1io001o1, float f) {
                    l1io001o1.zzd |= Barcode.FORMAT_QR_CODE;
/* 7 */             l1io001o1.zzm = f;
                }

                public static void I001iOo1i0O(l1Io001O1 l1io001o1, lIil0l010OO liil0l010oo) {
/* 1 */             ii0i1l11 ii0i1l11VarI000OOo1O = l1io001o1.zzo;
/* 8 */             if (!((ii010ilOI1O1) ii0i1l11VarI000OOo1O).I00iOIl) {
/* 10 */                ii0i1l11VarI000OOo1O = ii0OoOo10.I000OOo1O(ii0i1l11VarI000OOo1O);
/* 14 */                l1io001o1.zzo = ii0i1l11VarI000OOo1O;
                    }
/* 16 */            ii00oo.I00000oOI(liil0l010oo, ii0i1l11VarI000OOo1O);
                }

                public static void I001l0I00(l1Io001O1 l1io001o1, ii10lI1lO0 ii10li1lo0) {
/* 1 */             ii10li1lo0.getClass();
/* 4 */             l1io001o1.zzq = ii10li1lo0;
                    l1io001o1.zzd |= Barcode.FORMAT_UPC_E;
                }

                public static void I001lIiIIo1O(l1Io001O1 l1io001o1) {
                    l1io001o1.zzd |= 1;
/* 9 */             l1io001o1.zze = "";
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 81 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 76 */                return new ii0oOi0(zzb, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0007\u0003ခ\b\u0004\u001a\u0005\u001a\u0006ဉ\u0002\bဇ\t\tဉ\n\nဉ\u0003\u000bဈ\u0006\fဉ\u0004\rင\u000b\u000eဉ\u0005\u000fဈ\u0001", new Object[]{"zzd", "zze", "zzl", "zzm", "zzn", "zzo", "zzg", "zzp", "zzq", "zzh", "zzk", "zzi", "zzr", "zzj", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new l1Io001O1();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new l1Ii0O0i10O1(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
