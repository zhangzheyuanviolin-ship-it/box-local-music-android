            package p000;
            
            public final class ioIooiOO1 extends lIIOO0oi1o {
                private static final ioIooiOO1 zzb;
                private lIOIoo1O zzd = lO1Oio0looOO.I00iio;

                static {
/* 3 */             ioIooiOO1 ioiooioo1 = new ioIooiOO1();
/* 6 */             zzb = ioiooioo1;
/* 10 */            lIIOO0oi1o.I0000oI00(ioIooiOO1.class, ioiooioo1);
                }

                public static ioIooiOO1 I000o00OoI0I(byte[] bArr) throws lIi0II001O1I {
/* 1 */             ioIooiOO1 ioiooioo1 = zzb;
/* 3 */             int length = bArr.length;
/* 4 */             lI0011loIOIo li0011loioio = lI0011loIOIo.I00000oOI;
/* 6 */             lO1Ilo0lloiO lo1ilo0lloio = lO1Ilo0lloiO.I0000Il00O;
/* 10 */            lIIOO0oi1o liioo0oi1oI000iOII = lIIOO0oi1o.I000iOII(ioiooioo1, bArr, length, lI0011loIOIo.I00000oOI);
/* 14 */            if (liioo0oi1oI000iOII == null || lIIOO0oi1o.I000II(liioo0oi1oI000iOII, true)) {
/* 38 */                return (ioIooiOO1) liioo0oi1oI000iOII;
                    }
/* 33 */            iilo0lOo110.I0001Ioi1lo(new lOOOIoiiilo().getMessage());
/* 36 */            return null;
                }

                @Override
                public final Object I000OiO(int i, lIIOO0oi1o liioo0oi1o) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 55 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 50 */                return new lO1i1o0O0o(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", ioIl1Ol111O.class});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new ioIooiOO1();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new illO0I1(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final lIOIoo1O I000oI1ioi() {
/* 1 */             return this.zzd;
                }
            }
