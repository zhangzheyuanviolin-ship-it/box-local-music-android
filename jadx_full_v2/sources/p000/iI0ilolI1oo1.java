            package p000;
            
            public final class iI0ilolI1oo1 extends illOil implements ioOI1Io1oo {
                private static final iI0ilolI1oo1 zzb;
                private int zzd;
                private int zze;
                private int zzf;
                private byte zzg = 2;

                static {
/* 3 */             iI0ilolI1oo1 ii0iloli1oo1 = new iI0ilolI1oo1();
/* 6 */             zzb = ii0iloli1oo1;
/* 10 */            illOil.I000OiO(iI0ilolI1oo1.class, ii0iloli1oo1);
                }

                public static i1oliiiIO0 I0010I0i() {
/* 7 */             return (i1oliiiIO0) zzb.I0000O();
                }

                public static void I0010o(iI0ilolI1oo1 ii0iloli1oo1, int i) {
                    ii0iloli1oo1.zzd |= 1;
/* 7 */             ii0iloli1oo1.zze = i;
                }

                public static void I00111O(iI0ilolI1oo1 ii0iloli1oo1, int i) {
                    ii0iloli1oo1.zzd |= 2;
/* 7 */             ii0iloli1oo1.zzf = i;
                }

                @Override
                public final Object I000oI1ioi(int i, illOil illoil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 64 */                return Byte.valueOf(this.zzg);
                    }
/* 6 */             if (i2 == 2) {
/* 57 */                return illOil.I000O01llI0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new iI0ilolI1oo1();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i1oliiiIO0(zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzb;
                    }
/* 22 */            this.zzg = illoil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final int I00100l0() {
/* 1 */             return this.zze;
                }

                public final int I00100o1O0lo() {
/* 1 */             return this.zzf;
                }
            }
