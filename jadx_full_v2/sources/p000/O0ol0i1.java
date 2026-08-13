            package p000;
            
            public final class O0ol0i1 extends OooioIIoi0O {
                public final OI0l1oli1I I00000oOI;

                public O0ol0i1() {
/* 4 */             OI0l1oli1I oI0l1oli1I = IooO001.I00000oIO;
/* 11 */            this.I00000oOI = new OI0l1oli1I();
                }

                @Override
                public final void I0000O() {
/* 1 */             OI0l1oli1I oI0l1oli1I = this.I00000oOI;
/* 3 */             int[] iArr = oI0l1oli1I.I00000oOI;
/* 5 */             Object[] objArr = oI0l1oli1I.I0000Il00O;
/* 7 */             long[] jArr = oI0l1oli1I.I00000oIO;
                    int length = jArr.length - 2;
/* 12 */            if (length < 0) {
/* 245 */               return;
                    }
/* 15 */            int i = 0;
                    while (true) {
/* 16 */                long j = jArr[i];
/* 30 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 39 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 42 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 51 */                        if ((255 & j) < 128) {
/* 55 */                            int i4 = (i << 3) + i3;
/* 56 */                            int i5 = iArr[i4];
/* 60 */                            OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) objArr[i4];
/* 62 */                            Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 64 */                            int i6 = oI0oiiIO0.I00000oOI;
/* 67 */                            for (int i7 = 0; i7 < i6; i7++) {
/* 71 */                                O0oil001 o0oil001 = (O0oil001) objArr2[i7];
/* 73 */                                IIoi0i iIoi0i = o0oil001.I0000O;
/* 75 */                                if (iIoi0i != null) {
/* 77 */                                    iIoi0i.cancel();
                                        }
/* 81 */                                o0oil001.I0000O = null;
/* 87 */                                O1OIiIOOoOO o1OIiIOOoOO = (O1OIiIOOoOO) o0oil001.I00000oIO.I00iiI;
/* 90 */                                o1OIiIOOoOO.I00iiI = true;
/* 92 */                                o1OIiIOOoOO.I00iOIl = false;
/* 94 */                                o1OIiIOOoOO.I00000oIO();
                                    }
                                }
/* 100 */                       j >>= 8;
                            }
/* 104 */                   if (i2 != 8) {
/* 245 */                       return;
                            }
                        }
/* 106 */               if (i == length) {
/* 245 */                   return;
                        } else {
/* 108 */                   i++;
                        }
                    }
                }
            }
