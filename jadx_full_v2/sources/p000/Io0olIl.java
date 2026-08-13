            package p000;
            
            public final class Io0olIl {
                public OI1I0OoOl I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) {
                    Io0olI1l00 io0olI1l00;
                    OI1I0OoOl oI1I0OoOl;
/* 3 */             if (iOoilo instanceof Io0olI1l00) {
/* 6 */                 io0olI1l00 = (Io0olI1l00) iOoilo;
/* 8 */                 int i = io0olI1l00.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    io0olI1l00.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    io0olI1l00 = new Io0olI1l00(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = io0olI1l00.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = io0olI1l00.I00iio;
/* 32 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 52 */                oI1I0OoOl = this.I00000oIO;
/* 54 */                io0olI1l00.I00iOIl = oI1I0OoOl;
/* 56 */                io0olI1l00.I00iio = 1;
/* 62 */                if (oI1I0OoOl.I00000oIO(io0olI1l00) == ii0111o) {
/* 64 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                oI1I0OoOl = io0olI1l00.I00iOIl;
/* 38 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 67 */            return new OI1I11lO1i(oI1I0OoOl);
                }
            }
