            package p000;
            
            public class OO0o0oOIIii extends OO0ll1OIlIO0 {
                public final OO0lo1Ooo I00ilI0I1;
                public Object I00ilO0;
                public boolean I00io1l;
                public int I00ioIO;

                public OO0o0oOIIii(OO0lo1Ooo oO0lo1Ooo, OoIiOIo0i010[] ooIiOIo0i010Arr) {
/* 3 */             super(oO0lo1Ooo.I00iiO, ooIiOIo0i010Arr);
/* 6 */             this.I00ilI0I1 = oO0lo1Ooo;
/* 10 */            this.I00ioIO = oO0lo1Ooo.I00ilI0I1;
                }

                public final void I000II(int i, OoIiIlIo ooIiIlIo, Object obj, int i2) {
/* 3 */             OoIiOIo0i010[] ooIiOIo0i010Arr = (OoIiOIo0i010[]) this.I00iio;
/* 5 */             int i3 = i2 * 5;
/* 9 */             if (i3 <= 30) {
/* 51 */                int iI00000oIO = 1 << lOoIIlo.I00000oIO(i, i3);
/* 57 */                if (ooIiIlIo.I000O01llI0(iI00000oIO)) {
/* 75 */                    ooIiOIo0i010Arr[i2].I00000oIO(ooIiIlIo.I0000O, Integer.bitCount(ooIiIlIo.I00000oIO) * 2, ooIiIlIo.I0001Ioi1lo(iI00000oIO));
/* 78 */                    this.I00iiI = i2;
/* 80 */                    return;
                        } else {
/* 81 */                    int iI00111O = ooIiIlIo.I00111O(iI00000oIO);
/* 85 */                    OoIiIlIo ooIiIlIoI0010o = ooIiIlIo.I0010o(iI00111O);
/* 101 */                   ooIiOIo0i010Arr[i2].I00000oIO(ooIiIlIo.I0000O, Integer.bitCount(ooIiIlIo.I00000oIO) * 2, iI00111O);
/* 105 */                   I000II(i, ooIiIlIoI0010o, obj, i2 + 1);
/* 204 */                   return;
                        }
                    }
/* 11 */            OoIiOIo0i010 ooIiOIo0i010 = ooIiOIo0i010Arr[i2];
/* 13 */            Object[] objArr = ooIiIlIo.I0000O;
/* 17 */            ooIiOIo0i010.I00000oIO(objArr, objArr.length, 0);
                    while (true) {
/* 20 */                OoIiOIo0i010 ooIiOIo0i0102 = ooIiOIo0i010Arr[i2];
/* 32 */                if (O0000Ioio00.I0000O(ooIiOIo0i0102.I00iiI[ooIiOIo0i0102.I00iio], obj)) {
/* 43 */                    this.I00iiI = i2;
/* 45 */                    return;
                        } else {
                            ooIiOIo0i010Arr[i2].I00iio += 2;
                        }
                    }
                }

                @Override
                public final Object next() {
/* 8 */             if (this.I00ilI0I1.I00ilI0I1 != this.I00ioIO) {
/* 42 */                I000II.I001IIilI0O();
/* 7 */                 return null;
                    }
/* 12 */            if (!this.I00iiO) {
/* 38 */                IoOOl0iOl1io.I00000oOI();
/* 7 */                 return null;
                    }
/* 20 */            OoIiOIo0i010 ooIiOIo0i010 = ((OoIiOIo0i010[]) this.I00iio)[this.I00iiI];
/* 28 */            this.I00ilO0 = ooIiOIo0i010.I00iiI[ooIiOIo0i010.I00iio];
/* 31 */            this.I00io1l = true;
/* 33 */            return super.next();
                }

                @Override
                public final void remove() {
/* 3 */             if (!this.I00io1l) {
/* 74 */                IOOlIIilOl0.I000iOII();
/* 110 */               return;
                    }
/* 5 */             boolean z = this.I00iiO;
/* 8 */             OO0lo1Ooo oO0lo1Ooo = this.I00ilI0I1;
/* 10 */            if (!z) {
/* 61 */                OoOOI1100oI0.I00000oIO(oO0lo1Ooo).remove(this.I00ilO0);
                    } else {
/* 12 */                if (!z) {
/* 51 */                    IoOOl0iOl1io.I00000oOI();
/* 54 */                    return;
                        }
/* 20 */                OoIiOIo0i010 ooIiOIo0i010 = ((OoIiOIo0i010[]) this.I00iio)[this.I00iiI];
/* 26 */                Object obj = ooIiOIo0i010.I00iiI[ooIiOIo0i010.I00iio];
/* 34 */                OoOOI1100oI0.I00000oIO(oO0lo1Ooo).remove(this.I00ilO0);
/* 47 */                I000II(obj != null ? obj.hashCode() : 0, oO0lo1Ooo.I00iiO, obj, 0);
                    }
/* 65 */            this.I00ilO0 = null;
/* 67 */            this.I00io1l = false;
/* 71 */            this.I00ioIO = oO0lo1Ooo.I00ilI0I1;
                }
            }
