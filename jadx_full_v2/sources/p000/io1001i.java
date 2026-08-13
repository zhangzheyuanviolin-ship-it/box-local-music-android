            package p000;
            
            public final class io1001i extends iOlOoOlI0li1 {
                private static final io1001i zze;
                private int zzb = 0;
                private Object zzd;

                static {
/* 3 */             io1001i io1001iVar = new io1001i();
/* 6 */             zze = io1001iVar;
/* 10 */            iOlOoOlI0li1.I0000oI00(io1001i.class, io1001iVar);
                }

                public static io1001i I000iOII(byte[] bArr, iOlO11i iolo11i) {
/* 7 */             return (io1001i) iOlOoOlI0li1.I000II(zze, bArr, iolo11i);
                }

                public static io1001i I000l1() {
/* 1 */             return zze;
                }

                @Override
                public final Object I000O01llI0(int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new iOloi0ll0o(zze, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzd", "zzb", l1OI01l0o.class, iOo1lI.class});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new io1001i();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i1I1l00o(zze);
                    }
/* 15 */            if (i2 == 5) {
/* 17 */                return zze;
                    }
/* 21 */            throw null;
                }

                public final boolean I000OOo1O() {
                    return this.zzb == 1;
                }

                public final l1OI01l0o I000OiO() {
                    return this.zzb == 1 ? (l1OI01l0o) this.zzd : l1OI01l0o.I000l1();
                }
            }
