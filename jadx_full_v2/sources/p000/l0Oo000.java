            package p000;
            
            public final class l0Oo000 extends lIIOO0oi1o {
                private static final l0Oo000 zzb;
                private static volatile lO11l0OoOIIi zzd;
                private int zze;
                private float zzf;
                private float zzg;
                private float zzh;
                private float zzi;
                private float zzj;
                private long zzk;
                private byte zzl = 2;

                static {
/* 3 */             l0Oo000 l0oo000 = new l0Oo000();
/* 6 */             zzb = l0oo000;
/* 10 */            lIIOO0oi1o.I0000oI00(l0Oo000.class, l0oo000);
                }

                public static lO11l0OoOIIi I0010I0i() {
/* 9 */             return (lO11l0OoOIIi) zzb.I000OiO(7, null);
                }

                @Override
                public final Object I000OiO(int i, lIIOO0oi1o liioo0oi1o) {
                    lO11l0OoOIIi li1i1li0o0i;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 105 */               return Byte.valueOf(this.zzl);
                    }
/* 6 */             if (i2 == 2) {
/* 99 */                return new lO1i1o0O0o(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 71 */                return new l0Oo000();
                    }
/* 12 */            if (i2 == 4) {
/* 65 */                return new illO0I1(zzb);
                    }
/* 15 */            if (i2 == 5) {
/* 58 */                return zzb;
                    }
/* 18 */            if (i2 != 6) {
/* 25 */                this.zzl = liioo0oi1o == null ? (byte) 0 : (byte) 1;
/* 27 */                return null;
                    }
/* 29 */            lO11l0OoOIIi lo11l0oooiii = zzd;
/* 31 */            if (lo11l0oooiii != null) {
/* 57 */                return lo11l0oooiii;
                    }
                    synchronized (l0Oo000.class) {
                        try {
/* 36 */                    li1i1li0o0i = zzd;
/* 38 */                    if (li1i1li0o0i == null) {
/* 44 */                        li1i1li0o0i = new lI1i1lI0O0I(zzb);
/* 47 */                        zzd = li1i1li0o0i;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return li1i1li0o0i;
                }

                public final float I000o00OoI0I() {
/* 1 */             return this.zzh;
                }

                public final float I000oI1ioi() {
/* 1 */             return this.zzi;
                }

                public final float I00100l0() {
/* 1 */             return this.zzf;
                }

                public final float I00100o1O0lo() {
/* 1 */             return this.zzg;
                }
            }
