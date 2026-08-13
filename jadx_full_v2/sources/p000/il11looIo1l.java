            package p000;
            
            public final class il11looIo1l extends ii0OoOo10 {
                private static final il11looIo1l zzb;
                private byte zze = 2;
                private ii0i1l11 zzd = ii0oOIO0OliO.I00iio;

                static {
/* 3 */             il11looIo1l il11looio1l = new il11looIo1l();
/* 6 */             zzb = il11looio1l;
/* 10 */            ii0OoOo10.I000lI(il11looIo1l.class, il11looio1l);
                }

                public static il11looIo1l I001IIilI0O() {
/* 1 */             return zzb;
                }

                public static il11looIo1l I001IO000(byte[] bArr, ii0II11oi0I ii0ii11oi0i) {
/* 7 */             return (il11looIo1l) ii0OoOo10.I000O01llI0(zzb, bArr, ii0ii11oi0i);
                }

                public static void I001i1lo1io(il11looIo1l il11looio1l, Iterable iterable) {
/* 1 */             ii0i1l11 ii0i1l11VarI000OOo1O = il11looio1l.zzd;
/* 8 */             if (!((ii010ilOI1O1) ii0i1l11VarI000OOo1O).I00iOIl) {
/* 10 */                ii0i1l11VarI000OOo1O = ii0OoOo10.I000OOo1O(ii0i1l11VarI000OOo1O);
/* 14 */                il11looio1l.zzd = ii0i1l11VarI000OOo1O;
                    }
/* 16 */            ii00oo.I00000oOI(iterable, ii0i1l11VarI000OOo1O);
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return Byte.valueOf(this.zze);
                    }
/* 6 */             if (i2 == 2) {
/* 57 */                return new ii0oOi0(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", iiI0O1lI.class});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new il11looIo1l();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new iil10O1iilo(zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzb;
                    }
/* 22 */            this.zze = ii0oooo10 == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final int I00111O() {
/* 3 */             return this.zzd.size();
                }

                public final ii0i1l11 I001i1O0Ol() {
/* 1 */             return this.zzd;
                }
            }
