            package p000;
            
            public final class iiIO1iilOl extends ii0OoOo10 {
                private static final iiIO1iilOl zzb;
                private int zzd;
                private int zze;
                private int zzf;
                private byte zzg = 2;

                static {
/* 3 */             iiIO1iilOl iiio1iilol = new iiIO1iilOl();
/* 6 */             zzb = iiio1iilol;
/* 10 */            ii0OoOo10.I000lI(iiIO1iilOl.class, iiio1iilol);
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 65 */                return Byte.valueOf(this.zzg);
                    }
/* 6 */             if (i2 == 2) {
/* 59 */                return new ii0oOi0(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new iiIO1iilOl();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new iiI01OiI01oI(zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzb;
                    }
/* 22 */            this.zzg = ii0oooo10 == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
