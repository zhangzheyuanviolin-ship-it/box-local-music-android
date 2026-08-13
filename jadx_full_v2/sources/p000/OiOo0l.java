            package p000;
            
            public final class OiOo0l implements OII1lIlol {
                public Oii00o1ll I00iOIl;
                public boolean I00iiI;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I001lllioOl(long j, long j2, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OiOo010lii oiOo010lii;
                    long jI0000oI00;
/* 3 */             if (iOoil1iiIilo instanceof OiOo010lii) {
/* 6 */                 oiOo010lii = (OiOo010lii) iOoil1iiIilo;
/* 8 */                 int i = oiOo010lii.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiOo010lii.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oiOo010lii = new OiOo010lii(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 27 */            Object objI00000oIO = oiOo010lii.I00iiI;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oiOo010lii.I00iio;
/* 34 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 56 */                jI0000oI00 = 0;
/* 58 */                if (this.I00iiI) {
/* 60 */                    Oii00o1ll oii00o1ll = this.I00iOIl;
/* 64 */                    if (!oii00o1ll.I000OOo1O) {
/* 67 */                        oiOo010lii.I00iOIl = j2;
/* 69 */                        oiOo010lii.I00iio = 1;
/* 71 */                        objI00000oIO = oii00o1ll.I00000oIO(j2, oiOo010lii);
/* 75 */                        if (objI00000oIO == ii0111o) {
/* 77 */                            return ii0111o;
                                }
                            }
/* 82 */                    jI0000oI00 = OooIOilolOo.I0000oI00(j2, jI0000oI00);
                        }
/* 86 */                return OooIOilolOo.I00000oIO(jI0000oI00);
                    }
/* 36 */            if (i2 != 1) {
/* 46 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 49 */                return null;
                    }
/* 38 */            j2 = oiOo010lii.I00iOIl;
/* 40 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 80 */            jI0000oI00 = ((OooIOilolOo) objI00000oIO).I00000oIO;
/* 82 */            jI0000oI00 = OooIOilolOo.I0000oI00(j2, jI0000oI00);
/* 86 */            return OooIOilolOo.I00000oIO(jI0000oI00);
                }

                @Override
                public final long I00ioIO(int i, long j, long j2) {
/* 3 */             if (!this.I00iiI) {
/* 39 */                return 0L;
                    }
/* 5 */             Oii00o1ll oii00o1ll = this.I00iOIl;
/* 13 */            if (oii00o1ll.I00000oIO.I00000oIO()) {
/* 39 */                return 0L;
                    }
/* 34 */            return oii00o1ll.I000OOo1O(oii00o1ll.I0000oI00(oii00o1ll.I00000oIO.I0000oI00(oii00o1ll.I0000oI00(oii00o1ll.I000O01llI0(j2)))));
                }
            }
