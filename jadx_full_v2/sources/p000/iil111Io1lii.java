            package p000;

            import java.util.Arrays;
            import java.util.List;
            
            public final class iil111Io1lii extends illOil implements ioOI1Io1oo {
                private static final iil111Io1lii zzb;
                private int zzd;
                private ilo1Oi01I zze;
                private ilo1Oi01I zzf;
                private int zzg;
                private int zzh;
                private int zzi;
                private int zzj;

                static {
/* 3 */             iil111Io1lii iil111io1lii = new iil111Io1lii();
/* 6 */             zzb = iil111io1lii;
/* 10 */            illOil.I000OiO(iil111Io1lii.class, iil111io1lii);
                }

                public iil111Io1lii() {
/* 4 */             iliO1I10o0 ilio1i10o0 = iliO1I10o0.I00iio;
/* 6 */             this.zze = ilio1i10o0;
/* 8 */             this.zzf = ilio1i10o0;
                }

                public static iOoIoI01oo1 I00100l0() {
/* 7 */             return (iOoIoI01oo1) zzb.I0000O();
                }

                public static void I00100o1O0lo(iil111Io1lii iil111io1lii, int i) {
                    iil111io1lii.zzd |= 2;
/* 7 */             iil111io1lii.zzh = i;
                }

                public static void I0010I0i(iil111Io1lii iil111io1lii, float f) {
/* 1 */             List list = iil111io1lii.zze;
/* 8 */             if (!((il0II1iiI) list).I00iOIl) {
/* 10 */                int size = list.size();
/* 19 */                int i = size == 0 ? 10 : size + size;
/* 20 */                iliO1I10o0 ilio1i10o0 = (iliO1I10o0) list;
/* 24 */                if (i < ilio1i10o0.I00iiO) {
/* 44 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 47 */                    return;
                        } else {
/* 37 */                    iliO1I10o0 ilio1i10o02 = new iliO1I10o0(Arrays.copyOf(ilio1i10o0.I00iiI, i), ilio1i10o0.I00iiO, true);
/* 40 */                    iil111io1lii.zze = ilio1i10o02;
/* 42 */                    list = ilio1i10o02;
                        }
                    }
/* 50 */            ((iliO1I10o0) list).I00000oOI(f);
                }

                public static void I0010o(iil111Io1lii iil111io1lii, float f) {
/* 1 */             List list = iil111io1lii.zzf;
/* 8 */             if (!((il0II1iiI) list).I00iOIl) {
/* 10 */                int size = list.size();
/* 19 */                int i = size == 0 ? 10 : size + size;
/* 20 */                iliO1I10o0 ilio1i10o0 = (iliO1I10o0) list;
/* 24 */                if (i < ilio1i10o0.I00iiO) {
/* 44 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 47 */                    return;
                        } else {
/* 37 */                    iliO1I10o0 ilio1i10o02 = new iliO1I10o0(Arrays.copyOf(ilio1i10o0.I00iiI, i), ilio1i10o0.I00iiO, true);
/* 40 */                    iil111io1lii.zzf = ilio1i10o02;
/* 42 */                    list = ilio1i10o02;
                        }
                    }
/* 50 */            ((iliO1I10o0) list).I00000oOI(f);
                }

                public static void I00111O(iil111Io1lii iil111io1lii, int i) {
                    iil111io1lii.zzd |= 1;
/* 7 */             iil111io1lii.zzg = i;
                }

                @Override
                public final Object I000oI1ioi(int i, illOil illoil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 64 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return illOil.I000O01llI0(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iil111Io1lii();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iOoIoI01oo1(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
