            package p000;

            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O0iliol11l implements O1iOIo0o0 {
                public final int I00000oIO;
                public O1iOIo0o0 I00000oOI;
                public O0io0olo I0000Il00O;
                public int I0000O;
                public O1iOIo0o0 I0000oI00;

                public O0iliol11l(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO() {
                    switch (this.I00000oIO) {
                        case 0:
/* 31 */                    O0io0olo o0io0olo = this.I0000Il00O;
/* 35 */                    o0io0olo.I00ilI0I1 = this.I0000O;
/* 39 */                    this.I0000oI00.I00000oIO();
/* 42 */                    OI110O0 oi110o0 = o0io0olo.I00lli11;
/* 44 */                    OI10I1IoI0Ol oI10I1IoI0Ol = o0io0olo.I00ll1;
/* 46 */                    long[] jArr = oI10I1IoI0Ol.I00000oIO;
                            int length = jArr.length - 2;
/* 51 */                    if (length >= 0) {
/* 53 */                        int i = 0;
                                while (true) {
/* 54 */                            long j = jArr[i];
/* 68 */                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 77 */                                int i2 = 8 - ((~(i - length)) >>> 31);
/* 80 */                                for (int i3 = 0; i3 < i2; i3++) {
/* 89 */                                    if ((255 & j) < 128) {
/* 93 */                                        int i4 = (i << 3) + i3;
/* 96 */                                        Object obj = oI10I1IoI0Ol.I00000oOI[i4];
/* 102 */                                       Oli1o0 oli1o0 = (Oli1o0) oI10I1IoI0Ol.I0000Il00O[i4];
/* 104 */                                       int iI000OiO = oi110o0.I000OiO(obj);
/* 108 */                                       if (iI000OiO < 0 || iI000OiO >= o0io0olo.I00ilI0I1) {
/* 114 */                                           if (iI000OiO >= 0) {
/* 116 */                                               Object[] objArr = oi110o0.I00iOIl;
/* 118 */                                               Object obj2 = objArr[iI000OiO];
/* 122 */                                               objArr[iI000OiO] = Oli1lii10.I00000oOI;
                                                    }
/* 130 */                                           if (o0io0olo.I00l0OO0IO.I00000oOI(obj)) {
/* 132 */                                               oli1o0.I00000oOI();
                                                    }
/* 135 */                                           oI10I1IoI0Ol.I000l1(i4);
                                                }
                                            }
/* 138 */                                   j >>= 8;
                                        }
/* 142 */                               if (i2 == 8) {
/* 144 */                                   if (i != length) {
/* 146 */                                       i++;
                                            }
                                        }
                                    }
                                }
                            }
/* 151 */                   o0io0olo.I0001Ioi1lo(o0io0olo.I00iio);
                            break;
                        default:
/* 8 */                     O0io0olo o0io0olo2 = this.I0000Il00O;
/* 12 */                    o0io0olo2.I00iio = this.I0000O;
/* 16 */                    this.I0000oI00.I00000oIO();
/* 23 */                    if (o0io0olo2.I00iOIl.I00l0I0l0lO1 == null) {
/* 27 */                        o0io0olo2.I0001Ioi1lo(o0io0olo2.I00iio);
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final Map I00000oOI() {
                    switch (this.I00000oIO) {
                    }
/* 8 */             return this.I00000oOI.I00000oOI();
                }

                @Override
                public final Function1 I0000Il00O() {
                    switch (this.I00000oIO) {
                    }
/* 8 */             return this.I00000oOI.I0000Il00O();
                }

                @Override
                public final int I0000O() {
                    switch (this.I00000oIO) {
                    }
/* 8 */             return this.I00000oOI.I0000O();
                }

                @Override
                public final IlliIl1l11O I0000oI00() {
                    switch (this.I00000oIO) {
                    }
/* 8 */             return this.I00000oOI.I0000oI00();
                }

                @Override
                public final int I0001Ioi1lo() {
                    switch (this.I00000oIO) {
                    }
/* 8 */             return this.I00000oOI.I0001Ioi1lo();
                }

                @Override
                public final Function1 I000II() {
                    switch (this.I00000oIO) {
                    }
/* 8 */             return this.I00000oOI.I000II();
                }
            }
