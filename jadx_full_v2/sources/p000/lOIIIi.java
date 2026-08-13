            package p000;
            
            public final class lOIIIi extends ii0Oi0OiillI {
                private static final lOIIIi zzd;
                private byte zze = 2;

                static {
/* 3 */             lOIIIi loiiii = new lOIIIi();
/* 6 */             zzd = loiiii;
/* 10 */            ii0OoOo10.I000lI(lOIIIi.class, loiiii);
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 55 */                return Byte.valueOf(this.zze);
                    }
/* 7 */             if (i2 == 2) {
/* 49 */                return new ii0oOi0(zzd, "\u0001\u0000", null);
                    }
/* 10 */            if (i2 == 3) {
/* 39 */                return new lOIIIi();
                    }
/* 13 */            if (i2 == 4) {
/* 33 */                return new iOliIoi11o(zzd);
                    }
/* 16 */            if (i2 == 5) {
/* 26 */                return zzd;
                    }
/* 23 */            this.zze = ii0oooo10 == null ? (byte) 0 : (byte) 1;
/* 6 */             return null;
                }
            }
