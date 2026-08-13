            package p000;
            
            public final class l1l0lOliO extends ii0Oi0OiillI {
                private static final l1l0lOliO zzd;
                private int zze;
                private long zzf;
                private l00oIl zzg;
                private l01oiOlOIol zzh;
                private byte zzj = 2;
                private ii0i1l11 zzi = ii0oOIO0OliO.I00iio;

                static {
/* 3 */             l1l0lOliO l1l0lolio = new l1l0lOliO();
/* 6 */             zzd = l1l0lolio;
/* 10 */            ii0OoOo10.I000lI(l1l0lOliO.class, l1l0lolio);
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 71 */                return Byte.valueOf(this.zzj);
                    }
/* 6 */             if (i2 == 2) {
/* 65 */                return new ii0oOi0(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzi", l0IOIIIlol.class, "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new l1l0lOliO();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new iOliIoi11o(zzd);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzd;
                    }
/* 22 */            this.zzj = ii0oooo10 == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final int I001IIilI0O() {
/* 3 */             return this.zzi.size();
                }

                public final long I001IO000() {
/* 1 */             return this.zzf;
                }

                public final l00oIl I001i1O0Ol() {
/* 1 */             l00oIl l00oil = this.zzg;
                    return l00oil == null ? l00oIl.I001i1lo1io() : l00oil;
                }

                public final l0IOIIIlol I001i1lo1io(int i) {
/* 7 */             return (l0IOIIIlol) this.zzi.get(i);
                }

                public final boolean I001iOo1i0O() {
                    return (this.zze & 1) != 0;
                }
            }
