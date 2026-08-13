            package p000;
            
            public final class iiOOO1I01 extends ii0Oi0OiillI {
                private static final iiOOO1I01 zzd;
                private boolean zzA;
                private int zze;
                private float zzi;
                private boolean zzl;
                private boolean zzm;
                private boolean zzn;
                private int zzo;
                private iiOOOIi001IO zzp;
                private iiO1ol0 zzq;
                private iiIli0Io1 zzr;
                private iiOO0il1li0 zzs;
                private iiOO1iioO00 zzt;
                private ii10lI1lO0 zzv;
                private boolean zzw;
                private boolean zzx;
                private int zzy;
                private int zzz;
                private byte zzB = 2;
                private String zzf = "";
                private int zzg = 10;
                private int zzh = 1;
                private float zzj = 0.3f;
                private ii0i1l11 zzk = ii0oOIO0OliO.I00iio;
                private int zzu = 1;

                static {
/* 3 */             iiOOO1I01 iiooo1i01 = new iiOOO1I01();
/* 6 */             zzd = iiooo1i01;
/* 10 */            ii0OoOo10.I000lI(iiOOO1I01.class, iiooo1i01);
                }

                public static iiOO0o0lOOiO I001IIilI0O() {
/* 7 */             return (iiOO0o0lOOiO) zzd.I0000oI00();
                }

                public static void I001IO000(iiOOO1I01 iiooo1i01) {
                    iiooo1i01.zze |= 1;
/* 9 */             iiooo1i01.zzf = "MobileSSDTfLiteClient";
                }

                public static void I001i1O0Ol(iiOOO1I01 iiooo1i01) {
                    iiooo1i01.zze |= 32;
/* 8 */             iiooo1i01.zzl = true;
                }

                public static void I001i1lo1io(iiOOO1I01 iiooo1i01, iiOO1iioO00 iioo1iioo00) {
/* 1 */             iioo1iioo00.getClass();
/* 4 */             iiooo1i01.zzt = iioo1iioo00;
                    iiooo1i01.zze |= 8192;
                }

                public static void I001iOo1i0O(iiOOO1I01 iiooo1i01, ii10lI1lO0 ii10li1lo0) {
/* 1 */             ii10li1lo0.getClass();
/* 4 */             iiooo1i01.zzv = ii10li1lo0;
                    iiooo1i01.zze |= 32768;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 5 */             if (i2 == 0) {
/* 109 */               return Byte.valueOf(this.zzB);
                    }
/* 8 */             if (i2 == 2) {
/* 103 */               return new ii0oOi0(zzd, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006\u001a\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\nဋ\b\u000bဉ\t\fဉ\n\rဉ\f\u000fင\u000e\u0010ဉ\r\u0011ဉ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014င\u0012\u0015ဉ\u000b\u0016᠌\u0013\u0017ဇ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzs", "zzu", "zzt", "zzv", "zzw", "zzx", "zzy", "zzr", "zzz", iiII1i00iIOo.I001IO000, "zzA"});
                    }
/* 11 */            if (i2 == 3) {
/* 41 */                return new iiOOO1I01();
                    }
/* 14 */            if (i2 == 4) {
/* 35 */                return new iiOO0o0lOOiO(zzd);
                    }
/* 17 */            if (i2 == 5) {
/* 28 */                return zzd;
                    }
/* 24 */            this.zzB = ii0oooo10 == null ? (byte) 0 : (byte) 1;
/* 26 */            return null;
                }
            }
