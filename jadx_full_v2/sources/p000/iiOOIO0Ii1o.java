            package p000;
            
            public final class iiOOIO0Ii1o extends ii0OoOo10 {
                private static final iiOOIO0Ii1o zzb;
                private int zzd;
                private int zze;
                private long zzf;
                private long zzg;

                static {
/* 3 */             iiOOIO0Ii1o iiooio0ii1o = new iiOOIO0Ii1o();
/* 6 */             zzb = iiooio0ii1o;
/* 10 */            ii0OoOo10.I000lI(iiOOIO0Ii1o.class, iiooio0ii1o);
                }

                public static iiOOI0ooi I00111O() {
/* 7 */             return (iiOOI0ooi) zzb.I0000oI00();
                }

                public static void I001IIilI0O(iiOOIO0Ii1o iiooio0ii1o, int i) {
                    iiooio0ii1o.zzd |= 1;
/* 7 */             iiooio0ii1o.zze = i;
                }

                public static void I001IO000(iiOOIO0Ii1o iiooio0ii1o, long j) {
                    iiooio0ii1o.zzd |= 2;
/* 7 */             iiooio0ii1o.zzf = j;
                }

                public static void I001i1O0Ol(iiOOIO0Ii1o iiooio0ii1o, long j) {
                    iiooio0ii1o.zzd |= 4;
/* 7 */             iiooio0ii1o.zzg = j;
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new ii0oOi0(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iiOOIO0Ii1o();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iiOOI0ooi(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
