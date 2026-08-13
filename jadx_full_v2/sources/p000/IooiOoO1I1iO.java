            package p000;
            
            public final class IooiOoO1I1iO {
                public Object I00000oIO;

                public IooiOoO1I1iO(Object obj) {
/* 4 */             this.I00000oIO = obj;
                }

                public void I00000oIO(IooiIloo0i iooiIloo0i) {
/* 1 */             Object obj = this.I00000oIO;
/* 3 */             if (obj == null) {
/* 5 */                 this.I00000oIO = iooiIloo0i;
/* 7 */                 return;
                    }
/* 10 */            if (obj instanceof OI10IIO) {
/* 14 */                ((OI10IIO) obj).I00000oIO(iooiIloo0i);
/* 17 */                return;
                    }
/* 22 */            if (obj.equals(iooiIloo0i)) {
/* 77 */                return;
                    }
/* 26 */            OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 31 */            OI10IIO oi10iio2 = new OI10IIO(2);
/* 34 */            oi10iio2.I000iOII((IooiIloo0i) obj);
/* 37 */            oi10iio2.I000iOII(iooiIloo0i);
/* 40 */            this.I00000oIO = oi10iio2;
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oOI(IooiIloo0i iooiIloo0i) {
/* 1 */             Object obj = this.I00000oIO;
/* 8 */             if (O0000Ioio00.I0000O(obj, iooiIloo0i)) {
/* 10 */                this.I00000oIO = null;
/* 12 */                return;
                    }
/* 15 */            if (obj instanceof OI10IIO) {
/* 17 */                OI10IIO oi10iio = (OI10IIO) obj;
/* 19 */                oi10iio.I000l1(iooiIloo0i);
/* 22 */                int i = oi10iio.I0000O;
/* 24 */                if (i == 0) {
/* 103 */                   this.I00000oIO = null;
/* 168 */                   return;
                        }
/* 27 */                if (i != 1) {
/* 168 */                   return;
                        }
/* 30 */                Object[] objArr = oi10iio.I00000oOI;
/* 32 */                long[] jArr = oi10iio.I00000oIO;
                        int length = jArr.length - 2;
/* 37 */                if (length >= 0) {
/* 40 */                    int i2 = 0;
                            while (true) {
/* 41 */                        long j = jArr[i2];
/* 55 */                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 64 */                            int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 67 */                            for (int i4 = 0; i4 < i3; i4++) {
/* 76 */                                if ((255 & j) < 128) {
/* 83 */                                    this.I00000oIO = objArr[(i2 << 3) + i4];
/* 85 */                                    return;
                                        }
/* 86 */                                j >>= 8;
                                    }
/* 90 */                            if (i3 != 8) {
                                        break;
                                    } else if (i2 == length) {
                                        break;
                                    } else {
/* 94 */                                i2++;
                                    }
                                }
                            }
                        }
/* 99 */                OIiilo1Ool0o.I000II("The ScatterSet is empty");
                    }
                }
            }
