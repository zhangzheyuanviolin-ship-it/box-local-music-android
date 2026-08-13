            package p000;
            
            public final class Ol000oOO0 extends O1ooOo implements O0iOoioOoI, OIOilOIi1, Iillo1il11l, IOlIil1 {
                public Oiool011li I00o0iI0io1;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 1 */             OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 17 */            return o1iOIoOiO0.I001i1lo1io(oO1I0001000iI001lllioOl.I00iOIl, oO1I0001000iI001lllioOl.I00iiI, Il011I1OiO0I.I00iOIl, new I10iiiO1l0lo(o1iOIoOiO0, this, oO1I0001000iI001lllioOl, 1));
                }

                @Override
                public final void I00ilO0() {
/* 3 */             this.I00o0iI0io1.I0001Ioi1lo();
/* 10 */            l1ioloOOl00l.I00000oIO(this, this.I00o0iI0io1.I00iio);
                }

                /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) {
                    OOo0IO oOo0IOI0000Il00O;
                    Io10IOI io10IOI;
                    float fIntBitsToFloat;
                    float fIntBitsToFloat2;
                    long j;
/* 3 */             o0iiliOio.I00000oOI();
/* 8 */             Oiool011li oiool011li = this.I00o0iI0io1;
/* 10 */            Io10IIII io10IIIII0001Ioi1lo = il0lI1i1olii.I0001Ioi1lo(this);
/* 16 */            IOO000ilo iOO000ilo = o0iiliOio.I00iOIl.I00iiI;
/* 18 */            OI0oiiIO0 oI0oiiIO0 = oiool011li.I00ioIO;
/* 22 */            int iI000II = oiool011li.I00io1l.I000II();
/* 28 */            boolean z = true;
/* 29 */            if (oiool011li.I00l0OO0IO != iI000II) {
/* 31 */                OlIOiI1iI1 olIOiI1iI1 = Ol000ioo.I00000oIO;
/* 33 */                int i = oI0oiiIO0.I00000oOI;
/* 36 */                for (int i2 = 1; i2 < i; i2++) {
/* 38 */                    Object objI000II = oI0oiiIO0.I000II(i2);
                            int i3 = i2 - 1;
/* 44 */                    while (i3 >= 0 && Float.compare(IliIiio1.I00000oIO((OiolIO0Il) oI0oiiIO0.I000II(i3)), IliIiio1.I00000oIO((OiolIO0Il) objI000II)) > 0) {
/* 75 */                        oI0oiiIO0.I000oI1ioi(i3 + 1, oI0oiiIO0.I000II(i3));
                                i3--;
                            }
/* 83 */                    oI0oiiIO0.I000oI1ioi(i3 + 1, objI000II);
                        }
/* 89 */                oiool011li.I00l0OO0IO = iI000II;
                    }
/* 91 */            Object[] objArr = oI0oiiIO0.I00000oIO;
/* 93 */            int i4 = oI0oiiIO0.I00000oOI;
/* 95 */            int i5 = 0;
/* 96 */            while (i5 < i4) {
/* 100 */               OiolIO0Il oiolIO0Il = (OiolIO0Il) objArr[i5];
/* 102 */               boolean zI000O01llI0 = oiolIO0Il.I000O01llI0();
/* 106 */               OIooliIO0 oIooliIO0 = oiolIO0Il.I00lll10;
/* 108 */               if (zI000O01llI0 && ((Io10IOI) oIooliIO0.getValue()) == null) {
/* 122 */                   oIooliIO0.setValue(io10IIIII0001Ioi1lo.I0000Il00O());
                        }
/* 129 */               Io10IOI io10IOI2 = (Io10IOI) oIooliIO0.getValue();
/* 131 */               if (io10IOI2 != null && (oOo0IOI0000Il00O = oiolIO0Il.I0001Ioi1lo().I0000Il00O.I00000oIO().I0000Il00O()) != null && oiolIO0Il.I000O01llI0()) {
/* 159 */                   long jI0000oI00 = oOo0IOI0000Il00O.I0000oI00();
/* 168 */                   float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jI0000oI00 >> 32));
/* 179 */                   float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jI0000oI00 & 4294967295L));
/* 183 */                   Oiolo1I oiolo1II00000oIO = oiolIO0Il.I00000oIO();
/* 194 */                   O0iOOo0Ii o0iOOo0Ii = oiolo1II00000oIO != null ? oiolo1II00000oIO.I0000oI00 : null;
/* 202 */                   O0iOOo0Ii o0iOOo0Ii2 = oiolIO0Il.I0001Ioi1lo().I00000oOI.I00ilI0I1;
/* 204 */                   if (o0iOOo0Ii2 == null) {
/* 527 */                       I000II.I000iOII("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
/* 530 */                       return;
                            }
/* 211 */                   if (oiolo1II00000oIO != null) {
/* 213 */                       IIo11l1iO iIo11l1iO = oiolo1II00000oIO.I0000Il00O;
/* 219 */                       if (oiolo1II00000oIO.I0000O() == z && o0iOOo0Ii != null && o0iOOo0Ii.I0010o() && o0iOOo0Ii2.I0010o()) {
/* 255 */                           fI000II = ((Boolean) ((OIooliIO0) iIo11l1iO.I00iiO).getValue()).booleanValue() ? ((OIooO1iiliI) iIo11l1iO.I00iio).I000II() : 1.0f;
/* 273 */                           if (((Boolean) ((OIooliIO0) iIo11l1iO.I00ilI0I1).getValue()).booleanValue()) {
/* 285 */                               io10IOI = io10IOI2;
/* 287 */                               j = ((OoI0l01O) ((OIooliIO0) iIo11l1iO.I00ilO0).getValue()).I00000oIO;
                                    } else {
/* 290 */                               io10IOI = io10IOI2;
/* 292 */                               j = OoI0l01O.I00000oOI;
                                    }
/* 294 */                           long jI00000oIO = Oiol1l10l.I00000oIO(o0iOOo0Ii, o0iOOo0Ii2, j);
/* 301 */                           fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI00000oIO >> 32));
/* 308 */                           fIntBitsToFloat = Float.intBitsToFloat((int) (jI00000oIO & 4294967295L));
                                } else {
/* 315 */                           io10IOI = io10IOI2;
/* 317 */                           fIntBitsToFloat = 0.0f;
/* 318 */                           fIntBitsToFloat2 = 0.0f;
                                }
/* 312 */                       float f = fI000II;
/* 320 */                       I0ol0lI i0ol0lI = oiolIO0Il.I00li1OI;
/* 326 */                       ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(0.0f, 0.0f);
                                try {
/* 345 */                           long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
/* 346 */                           long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 354 */                           iOO000ilo.I0010o().I000II();
                                    try {
/* 361 */                               ((IIOOoll) iOO000ilo.I00iiI).I00i01iIIliI(f, f, jFloatToRawIntBits);
/* 364 */                               if (i0ol0lI != null) {
/* 366 */                                   jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 374 */                                   iOO000ilo.I0010o().I000II();
                                            try {
/* 389 */                                       ((IOO000ilo) ((IIOOoll) iOO000ilo.I00iiI).I00iiI).I0010o().I000l1(i0ol0lI);
/* 396 */                                       ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(fIntBitsToFloat3, fIntBitsToFloat4);
                                                try {
/* 401 */                                           illII1oO.I00000oIO(o0iiliOio, io10IOI);
                                                } finally {
                                                }
                                            } finally {
/* 443 */                                       iOO000ilo.I0010o().I00100l0();
/* 446 */                                       iOO000ilo.I00Io1lO(jI001iOo1i0O);
                                            }
                                        } else {
/* 450 */                                   Io10IOI io10IOI3 = io10IOI;
/* 456 */                                   ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(fIntBitsToFloat3, fIntBitsToFloat4);
                                            try {
/* 459 */                                       illII1oO.I00000oIO(o0iiliOio, io10IOI3);
                                            } finally {
                                            }
                                        }
                                    } catch (Throwable th) {
/* 514 */                               throw th;
                                    }
                                } finally {
/* 519 */                           float f2 = -0.0f;
/* 521 */                           ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(f2, f2);
                                }
                            }
                        }
/* 531 */               i5++;
/* 533 */               z = true;
                    }
                }

                @Override
                public final void I010101Oo1lO() {
/* 5 */             l1ioloOOl00l.I00000oIO(this, this.I00o0iI0io1.I00iio);
/* 10 */            this.I00o0iI0io1.getClass();
                }

                @Override
                public final void I010I0() {
/* 3 */             this.I00o0iI0io1.getClass();
                }
            }
