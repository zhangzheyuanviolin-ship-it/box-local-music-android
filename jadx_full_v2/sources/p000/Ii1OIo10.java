            package p000;
            
            public final class Ii1OIo10 {
                public OlO0OIIl1 I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oIO(OoIl01i0Oo ooIl01i0Oo, IOoilo iOoilo) {
                    OIOil1o0Oio oIOil1o0Oio;
/* 3 */             if (iOoilo instanceof OIOil1o0Oio) {
/* 6 */                 oIOil1o0Oio = (OIOil1o0Oio) iOoilo;
/* 8 */                 int i = oIOil1o0Oio.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oIOil1o0Oio.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oIOil1o0Oio = new OIOil1o0Oio(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oIOil1o0Oio.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oIOil1o0Oio.I00iiO;
/* 32 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 52 */                OlO0OIIl1 olO0OIIl1 = this.I00000oIO;
/* 54 */                oIOil1o0Oio.I00iiO = 1;
/* 56 */                olO0OIIl1.I00000oIO(ooIl01i0Oo, oIOil1o0Oio);
/* 106 */               return;
                    }
/* 34 */            if (i2 != 1) {
/* 38 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                    } else {
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
/* 45 */                IOOlIIilOl0.I0000Il00O();
                    }
                }

                public OlO00iO01io I00000oOI() {
/* 7 */             return (OlO00iO01io) this.I00000oIO.getValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I0000Il00O(OlO00iO01io olO00iO01io) {
                    Object value;
                    OlO00iO01io olO00iO01io2;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oIO;
/* 61 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 8 */                 olO00iO01io2 = (OlO00iO01io) value;
/* 12 */                if ((olO00iO01io2 instanceof OOlIilOIlOi1) || O0000Ioio00.I0000O(olO00iO01io2, Ooi1ol.I00000oOI)) {
/* 56 */                    olO00iO01io2 = olO00iO01io;
                        } else if (olO00iO01io2 instanceof Ii11I1iOiIo) {
/* 34 */                    if (olO00iO01io.I00000oIO > ((Ii11I1iOiIo) olO00iO01io2).I00000oIO) {
                            }
                        } else if (!(olO00iO01io2 instanceof IlIo0ol0)) {
/* 44 */                    if (olO00iO01io2 instanceof OIIl11) {
/* 48 */                        I000II.I001IO000("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
/* 51 */                        return;
                            } else {
/* 52 */                        I000II.I00000oIO();
/* 55 */                        return;
                            }
                        }
/* 61 */            } while (!olO0OIIl1.I000iOII(value, olO00iO01io2));
                }
            }
