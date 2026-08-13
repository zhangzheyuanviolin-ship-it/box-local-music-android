            package p000;
            
            public final class IIiOO0o extends IO101iio1o {
                public final IlliIl1l11O I00ilI0I1;

                public IIiOO0o(IlliIl1l11O illiIl1l11O, Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 1 */             super(illiIl1l11O, ii00l101O, i, iIII0i);
/* 4 */             this.I00ilI0I1 = illiIl1l11O;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(OOIoOo0O oOIoOo0O, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IIiOI0o1lIl iIiOI0o1lIl;
/* 3 */             if (iOoil1iiIilo instanceof IIiOI0o1lIl) {
/* 6 */                 iIiOI0o1lIl = (IIiOI0o1lIl) iOoil1iiIilo;
/* 8 */                 int i = iIiOI0o1lIl.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIiOI0o1lIl.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    iIiOI0o1lIl = new IIiOI0o1lIl(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 27 */            Object obj = iIiOI0o1lIl.I00iiI;
/* 29 */            Object obj2 = Ii0111o.I00iOIl;
/* 31 */            int i2 = iIiOI0o1lIl.I00iio;
/* 35 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 54 */                iIiOI0o1lIl.I00iOIl = oOIoOo0O;
/* 56 */                iIiOI0o1lIl.I00iio = 1;
/* 62 */                if (super.I000II(oOIoOo0O, iIiOI0o1lIl) == obj2) {
/* 64 */                    return obj2;
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                oOIoOo0O = iIiOI0o1lIl.I00iOIl;
/* 41 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 73 */            if (((OOIoO0IIOO0) oOIoOo0O).I00ilI0I1.I001l0I00()) {
/* 75 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 80 */            I000II.I001IO000("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
/* 33 */            return null;
                }

                @Override
                public final IO101i I000O01llI0(Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 5 */             return new IIiOO0o(this.I00ilI0I1, ii00l101O, i, iIII0i);
                }
            }
