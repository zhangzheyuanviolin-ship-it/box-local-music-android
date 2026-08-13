            package p000;

            import java.util.ArrayList;
            
            public final class i00oo10 implements O0oiIoI0 {
                public IIOlO1ii I00iOIl;
                public I101iI1i I00iiI;
                public OOloolilI11i I00iiO;
                public OOo0ooi I00iio;

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) {
                    boolean z;
/* 9 */             IIoOo1iIio1l iIoOo1iIio1lI001lloI = null;
                    switch (i00ol1O1I.I00000oIO[o0oOOiI0.ordinal()]) {
                        case 1:
/* 157 */                   iOi1II01i0.I0000O(this.I00iOIl, null, Ii01I10.I00iio, new O1o1iI(this.I00iio, this.I00iiO, o0oiOi, this, (IOoil1iiIilo) null, 23), 1);
/* 160 */                   return;
                        case 2:
/* 37 */                    I101iI1i i101iI1i = this.I00iiI;
/* 40 */                    if (i101iI1i != null) {
/* 44 */                        I1ii1l10IO i1ii1l10IO = (I1ii1l10IO) i101iI1i.I00iiO;
                                synchronized (i1ii1l10IO.I00000oOI) {
                                    try {
                                        synchronized (i1ii1l10IO.I00000oOI) {
/* 52 */                                    z = i1ii1l10IO.I00000oIO;
                                        }
/* 55 */                                if (!z) {
/* 61 */                                    ArrayList arrayList = (ArrayList) i1ii1l10IO.I0000Il00O;
/* 67 */                                    i1ii1l10IO.I0000Il00O = (ArrayList) i1ii1l10IO.I0000O;
/* 69 */                                    i1ii1l10IO.I0000O = arrayList;
/* 71 */                                    i1ii1l10IO.I00000oIO = true;
/* 73 */                                    int size = arrayList.size();
/* 78 */                                    for (int i = 0; i < size; i++) {
/* 88 */                                        ((IOoil1iiIilo) arrayList.get(i)).resumeWith(OoiIlOl1iI.I00000oIO);
                                            }
/* 97 */                                    arrayList.clear();
                                        }
                                    } catch (Throwable th) {
/* 106 */                               throw th;
                                    }
                                }
                            }
/* 107 */                   OOloolilI11i oOloolilI11i = this.I00iiO;
                            synchronized (oOloolilI11i.I0000Il00O) {
/* 114 */                       if (oOloolilI11i.I00111O) {
/* 116 */                           oOloolilI11i.I00111O = false;
/* 118 */                           iIoOo1iIio1lI001lloI = oOloolilI11i.I001lloI();
                                }
                            }
/* 127 */                   if (iIoOo1iIio1lI001lloI != null) {
/* 133 */                       ((IIoOoIol0Io0) iIoOo1iIio1lI001lloI).resumeWith(OoiIlOl1iI.I00000oIO);
/* 136 */                       return;
                            }
/* 136 */                   return;
                        case 3:
/* 24 */                    OOloolilI11i oOloolilI11i2 = this.I00iiO;
                            synchronized (oOloolilI11i2.I0000Il00O) {
/* 29 */                        oOloolilI11i2.I00111O = true;
                            }
/* 32 */                    return;
                        case 4:
/* 20 */                    this.I00iiO.I001lIiIIo1O();
/* 23 */                    return;
                        case 5:
                        case 6:
                        case 7:
/* 136 */                   return;
                        default:
/* 14 */                    I000II.I00000oIO();
/* 17 */                    return;
                    }
                }
            }
