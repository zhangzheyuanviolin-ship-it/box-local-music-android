            package p000;
            
            public final class l1o1I1oIO extends ill0o1o {
                private static final l1o1I1oIO zzd;
                private byte zze;

                static {
/* 3 */             l1o1I1oIO l1o1i1oio = new l1o1I1oIO();
/* 6 */             zzd = l1o1i1oio;
/* 10 */            illOil.I000OiO(l1o1I1oIO.class, l1o1i1oio);
                }

                public l1o1I1oIO() {
/* 6 */             this.zzb = ilOol10I0IlI.I0000Il00O;
/* 9 */             this.zze = (byte) 2;
                }

                public static l1o1I1oIO I00100l0() {
/* 1 */             return zzd;
                }

                @Override
                public final Object I000oI1ioi(int i, illOil illoil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 54 */                return Byte.valueOf(this.zze);
                    }
/* 7 */             if (i2 == 2) {
/* 47 */                return illOil.I000O01llI0(zzd, "\u0003\u0000", null);
                    }
/* 10 */            if (i2 == 3) {
/* 39 */                return new l1o1I1oIO();
                    }
/* 14 */            if (i2 == 4) {
/* 33 */                return new l1o0IOI0OO(0, zzd);
                    }
/* 17 */            if (i2 == 5) {
/* 26 */                return zzd;
                    }
/* 23 */            this.zze = illoil != null ? (byte) 1 : (byte) 0;
/* 6 */             return null;
                }
            }
