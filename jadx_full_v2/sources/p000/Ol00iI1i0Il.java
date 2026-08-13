            package p000;
            
            public final class Ol00iI1i0Il implements OII1lIlol {
                public Ol010000lo00 I00iOIl;
                public II1OIl1 I00iiI;

                public final long I00000oIO(float f) {
/* 1 */             OIilII oIilII = OIilII.I00iOIl;
/* 3 */             OIilII oIilII2 = OIilII.I00iOIl;
/* 25 */            return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I001lllioOl(long j, long j2, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    Ol00Oi1 ol00Oi1;
/* 3 */             if (iOoil1iiIilo instanceof Ol00Oi1) {
/* 6 */                 ol00Oi1 = (Ol00Oi1) iOoil1iiIilo;
/* 8 */                 int i = ol00Oi1.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ol00Oi1.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ol00Oi1 = new Ol00Oi1(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 27 */            Object objI00000oIO = ol00Oi1.I00iiI;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ol00Oi1.I00iio;
/* 34 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 54 */                OIilII oIilII = OIilII.I00iOIl;
/* 56 */                float fI0000O = OooIOilolOo.I0000O(j2);
/* 60 */                Ol010000lo00 ol010000lo00 = this.I00iOIl;
/* 62 */                II1OIl1 iI1OIl1 = this.I00iiI;
/* 64 */                ol00Oi1.I00iOIl = j;
/* 66 */                ol00Oi1.I00iio = 1;
/* 68 */                objI00000oIO = ol010000lo00.I00000oIO(iI1OIl1, fI0000O, ol00Oi1);
/* 72 */                if (objI00000oIO == ii0111o) {
/* 74 */                    return ii0111o;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 46 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 49 */                    return null;
                        }
/* 38 */                j = ol00Oi1.I00iOIl;
/* 40 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 89 */            return OooIOilolOo.I00000oIO(li1OoIii00.I00000oIO(OooIOilolOo.I0000Il00O(j), ((Number) objI00000oIO).floatValue()));
                }

                @Override
                public final long I00IoIO0lI(int i, long j) {
/* 1 */             OIilII oIilII = OIilII.I00iOIl;
/* 10 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
/* 17 */            if (fIntBitsToFloat >= 0.0f || i != 1) {
/* 48 */                return 0L;
                    }
/* 24 */            I0l1OOl1l10 i0l1OOl1l10 = this.I00iOIl.I0000oI00;
/* 26 */            float fI0000oI00 = i0l1OOl1l10.I0000oI00(fIntBitsToFloat);
/* 34 */            float fI0001Ioi1lo = fI0000oI00 - i0l1OOl1l10.I0001Ioi1lo();
/* 2 */             ((I0l1I0I0i10I) i0l1OOl1l10.I000o00OoI0I).I00000oIO(fI0000oI00, 0.0f);
/* 43 */            return I00000oIO(fI0001Ioi1lo);
                }

                @Override
                public final long I00ioIO(int i, long j, long j2) {
/* 1 */             OIilII oIilII = OIilII.I00iOIl;
/* 10 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j2));
/* 15 */            if (i != 1 || fIntBitsToFloat == 0.0f) {
/* 49 */                return 0L;
                    }
/* 25 */            I0l1OOl1l10 i0l1OOl1l10 = this.I00iOIl.I0000oI00;
/* 27 */            float fI0000oI00 = i0l1OOl1l10.I0000oI00(fIntBitsToFloat);
/* 35 */            float fI0001Ioi1lo = fI0000oI00 - i0l1OOl1l10.I0001Ioi1lo();
/* 2 */             ((I0l1I0I0i10I) i0l1OOl1l10.I000o00OoI0I).I00000oIO(fI0000oI00, 0.0f);
/* 44 */            return I00000oIO(fI0001Ioi1lo);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00ll1(long j, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    Ol00Oli1OO ol00Oli1OO;
/* 1 */             Ol010000lo00 ol010000lo00 = this.I00iOIl;
/* 3 */             I0l1OOl1l10 i0l1OOl1l10 = ol010000lo00.I0000oI00;
/* 7 */             if (iOoil1iiIilo instanceof Ol00Oli1OO) {
/* 10 */                ol00Oli1OO = (Ol00Oli1OO) iOoil1iiIilo;
/* 12 */                int i = ol00Oli1OO.I00iio;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    ol00Oli1OO.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    ol00Oli1OO = new Ol00Oli1OO(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 31 */            Object obj = ol00Oli1OO.I00iiI;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = ol00Oli1OO.I00iio;
/* 38 */            if (i2 == 0) {
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                OIilII oIilII = OIilII.I00iOIl;
/* 60 */                float fI0000O = OooIOilolOo.I0000O(j);
/* 64 */                float fI0001Ioi1lo = i0l1OOl1l10.I0001Ioi1lo();
/* 72 */                float fI0000oI00 = i0l1OOl1l10.I0000Il00O().I0000oI00();
/* 79 */                if (fI0000O >= 0.0f || fI0001Ioi1lo <= fI0000oI00) {
/* 98 */                    j = 0;
                        } else {
/* 85 */                    II1OIl1 iI1OIl1 = this.I00iiI;
/* 87 */                    ol00Oli1OO.I00iOIl = j;
/* 89 */                    ol00Oli1OO.I00iio = 1;
/* 95 */                    if (ol010000lo00.I00000oIO(iI1OIl1, fI0000O, ol00Oli1OO) == ii0111o) {
/* 97 */                        return ii0111o;
                            }
                        }
                    } else {
/* 40 */                if (i2 != 1) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 53 */                    return null;
                        }
/* 42 */                j = ol00Oli1OO.I00iOIl;
/* 44 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 100 */           return OooIOilolOo.I00000oIO(j);
                }
            }
