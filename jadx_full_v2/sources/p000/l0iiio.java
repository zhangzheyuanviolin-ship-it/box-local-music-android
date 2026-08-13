            package p000;
            
            public final class l0iiio extends ii0OoOo10 {
                private static final l0iiio zzb;
                private int zzd;
                private int zze;
                private long zzf;
                private long zzg;

                static {
/* 3 */             l0iiio l0iiioVar = new l0iiio();
/* 6 */             zzb = l0iiioVar;
/* 10 */            ii0OoOo10.I000lI(l0iiio.class, l0iiioVar);
                }

                public static l0iOi11Io0Il I001i1O0Ol() {
/* 7 */             return (l0iOi11Io0Il) zzb.I0000oI00();
                }

                public static void I001i1lo1io(l0iiio l0iiioVar, int i) {
                    l0iiioVar.zzd |= 1;
/* 7 */             l0iiioVar.zze = i;
                }

                public static void I001iOo1i0O(l0iiio l0iiioVar, long j) {
                    l0iiioVar.zzd |= 2;
/* 7 */             l0iiioVar.zzf = j;
                }

                public static void I001l0I00(l0iiio l0iiioVar, long j) {
                    l0iiioVar.zzd |= 4;
/* 7 */             l0iiioVar.zzg = j;
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
/* 32 */                return new l0iiio();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new l0iOi11Io0Il(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final int I00111O() {
/* 1 */             return this.zze;
                }

                public final long I001IIilI0O() {
/* 1 */             return this.zzf;
                }

                public final long I001IO000() {
/* 1 */             return this.zzg;
                }
            }
