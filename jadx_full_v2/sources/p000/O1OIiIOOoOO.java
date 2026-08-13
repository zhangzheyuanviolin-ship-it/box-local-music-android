            package p000;
            
            public final class O1OIiIOOoOO implements Oi10loIIo1l {
                public boolean I00iOIl;
                public boolean I00iiI;
                public boolean I00iiO;
                public OI10I1IoI0Ol I00iio;

                /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO() {
/* 1 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iio;
/* 3 */             Object[] objArr = oI10I1IoI0Ol.I0000Il00O;
/* 5 */             long[] jArr = oI10I1IoI0Ol.I00000oIO;
                    int length = jArr.length - 2;
/* 10 */            if (length >= 0) {
/* 13 */                int i = 0;
                        while (true) {
/* 14 */                    long j = jArr[i];
/* 28 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 37 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 40 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 49 */                            if ((255 & j) < 128) {
/* 54 */                                Object obj = objArr[(i << 3) + i3];
/* 58 */                                if (obj instanceof OI0oiiIO0) {
/* 60 */                                    OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) obj;
/* 62 */                                    Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 64 */                                    int i4 = oI0oiiIO0.I00000oOI;
/* 67 */                                    for (int i5 = 0; i5 < i4; i5++) {
/* 69 */                                        Object obj2 = objArr2[i5];
                                            }
                                        }
                                    }
/* 74 */                            j >>= 8;
                                }
/* 78 */                        if (i2 != 8) {
                                    break;
                                } else if (i == length) {
                                    break;
                                } else {
/* 82 */                            i++;
                                }
                            }
                        }
                    }
/* 85 */            oI10I1IoI0Ol.I00000oIO();
                }
            }
