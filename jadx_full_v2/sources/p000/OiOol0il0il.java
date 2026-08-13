            package p000;

            import android.widget.EdgeEffect;
            
            public final class OiOol0il0il {
                public Oii00o1ll I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:102:0x01f8  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x0224  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0238 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:122:0x023e  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x0246  */
                /* JADX WARN: Removed duplicated region for block: B:171:0x02eb  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x013b A[PHI: r8
                  0x013b: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:76:0x0169, B:65:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I00000oIO(int i, long j) {
                    long j2;
                    float fIntBitsToFloat;
                    int i2;
                    float fI000O01llI0;
                    float fIntBitsToFloat2;
                    long jFloatToRawIntBits;
                    long jI0001Ioi1lo;
                    boolean z;
                    boolean zI0001Ioi1lo;
                    boolean z2;
                    int i3;
                    boolean z3;
/* 7 */             Oii00o1ll oii00o1ll = this.I00000oIO;
/* 9 */             oii00o1ll.I000OiO = i;
/* 11 */            I0o1iIoolIi i0o1iIoolIi = oii00o1ll.I00000oOI;
/* 13 */            if (i0o1iIoolIi == null || !oii00o1ll.I00000oOI()) {
/* 762 */               return oii00o1ll.I0000O(oii00o1ll.I000iOII, j, i);
                    }
/* 21 */            int i4 = oii00o1ll.I000OiO;
/* 23 */            OIoO1Ol oIoO1Ol = oii00o1ll.I000lI;
/* 25 */            IioO1oi1li iioO1oi1li = i0o1iIoolIi.I0000Il00O;
/* 33 */            if (Ol0i1I.I0001Ioi1lo(i0o1iIoolIi.I000II)) {
/* 45 */                return ((OIOlIiiioi) oIoO1Ol.invoke(OIOlIiiioi.I00000oIO(j))).I00000oIO;
                    }
/* 54 */            if (!i0o1iIoolIi.I0001Ioi1lo) {
/* 62 */                if (IioO1oi1li.I000II(iioO1oi1li.I0001Ioi1lo)) {
/* 64 */                    i0o1iIoolIi.I000II(0L);
                        }
/* 73 */                if (IioO1oi1li.I000II(iioO1oi1li.I000II)) {
/* 75 */                    i0o1iIoolIi.I000O01llI0(0L);
                        }
/* 84 */                if (IioO1oi1li.I000II(iioO1oi1li.I0000O)) {
/* 86 */                    i0o1iIoolIi.I000OOo1O(0L);
                        }
/* 95 */                if (IioO1oi1li.I000II(iioO1oi1li.I0000oI00)) {
/* 97 */                    i0o1iIoolIi.I0001Ioi1lo(0L);
                        }
/* 100 */               i0o1iIoolIi.I0001Ioi1lo = true;
                    }
/* 102 */           int i5 = I0oiIoiIO.I00000oIO;
/* 110 */           float f = i4 == 2 ? 4.0f : 1.0f;
/* 112 */           long jI000O01llI0 = OIOlIiiioi.I000O01llI0(f, j);
/* 123 */           int i6 = (int) (j & 4294967295L);
/* 132 */           if (Float.intBitsToFloat(i6) != 0.0f) {
/* 146 */               if (!IioO1oi1li.I000II(iioO1oi1li.I0000O) || Float.intBitsToFloat(i6) >= 0.0f) {
/* 196 */                   j2 = 4294967295L;
/* 204 */                   if (IioO1oi1li.I000II(iioO1oi1li.I0000oI00) && Float.intBitsToFloat(i6) > 0.0f) {
/* 214 */                       float fI0001Ioi1lo = i0o1iIoolIi.I0001Ioi1lo(jI000O01llI0);
/* 224 */                       if (!IioO1oi1li.I000II(iioO1oi1li.I0000oI00)) {
/* 230 */                           iioO1oi1li.I00000oOI().finish();
                                }
/* 249 */                       fIntBitsToFloat = fI0001Ioi1lo == Float.intBitsToFloat((int) (jI000O01llI0 & 4294967295L)) ? Float.intBitsToFloat(i6) : fI0001Ioi1lo / f;
                            }
                        } else {
/* 156 */                   float fI000OOo1O = i0o1iIoolIi.I000OOo1O(jI000O01llI0);
/* 160 */                   j2 = 4294967295L;
/* 168 */                   if (!IioO1oi1li.I000II(iioO1oi1li.I0000O)) {
/* 174 */                       iioO1oi1li.I0000oI00().finish();
                            }
/* 193 */                   fIntBitsToFloat = fI000OOo1O == Float.intBitsToFloat((int) (jI000O01llI0 & 4294967295L)) ? Float.intBitsToFloat(i6) : fI000OOo1O / f;
                        }
/* 254 */               i2 = (int) (j >> 32);
/* 261 */               if (Float.intBitsToFloat(i2) != 0.0f) {
/* 272 */                   if (IioO1oi1li.I000II(iioO1oi1li.I0001Ioi1lo) && Float.intBitsToFloat(i2) < 0.0f) {
/* 282 */                       fI000O01llI0 = i0o1iIoolIi.I000II(jI000O01llI0);
/* 292 */                       if (!IioO1oi1li.I000II(iioO1oi1li.I0001Ioi1lo)) {
/* 298 */                           iioO1oi1li.I0000Il00O().finish();
                                }
/* 309 */                       if (fI000O01llI0 == Float.intBitsToFloat((int) (jI000O01llI0 >> 32))) {
/* 311 */                           fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                                }
                            } else if (!IioO1oi1li.I000II(iioO1oi1li.I000II) || Float.intBitsToFloat(i2) <= 0.0f) {
/* 263 */                       fIntBitsToFloat2 = 0.0f;
                            } else {
/* 335 */                       fI000O01llI0 = i0o1iIoolIi.I000O01llI0(jI000O01llI0);
/* 345 */                       if (!IioO1oi1li.I000II(iioO1oi1li.I000II)) {
/* 351 */                           iioO1oi1li.I0000O().finish();
                                }
/* 364 */                       fIntBitsToFloat2 = fI000O01llI0 == Float.intBitsToFloat((int) (jI000O01llI0 >> 32)) ? Float.intBitsToFloat(i2) : fI000O01llI0 / f;
                            }
                        }
/* 383 */               jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & j2);
/* 390 */               if (!OIOlIiiioi.I0000O(jFloatToRawIntBits, 0L)) {
/* 392 */                   i0o1iIoolIi.I0000O();
                        }
/* 395 */               jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(j, jFloatToRawIntBits);
/* 409 */               long j3 = ((OIOlIiiioi) oIoO1Ol.invoke(OIOlIiiioi.I00000oIO(jI0001Ioi1lo))).I00000oIO;
/* 413 */               long jI0001Ioi1lo2 = OIOlIiiioi.I0001Ioi1lo(jI0001Ioi1lo, j3);
/* 429 */               if ((Float.intBitsToFloat((int) (jI0001Ioi1lo >> 32)) == 0.0f || Float.intBitsToFloat((int) (jI0001Ioi1lo & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (IioO1oi1li.I000II(iioO1oi1li.I0001Ioi1lo) || IioO1oi1li.I000II(iioO1oi1li.I0000O) || IioO1oi1li.I000II(iioO1oi1li.I000II) || IioO1oi1li.I000II(iioO1oi1li.I0000oI00)))) {
/* 498 */                   i0o1iIoolIi.I00000oIO();
                        }
/* 503 */               if (i4 != 1) {
/* 507 */                   int i7 = (int) (jI0001Ioi1lo2 >> 32);
/* 518 */                   if (Float.intBitsToFloat(i7) > 0.5f) {
/* 520 */                       i0o1iIoolIi.I000II(jI0001Ioi1lo2);
                            } else if (Float.intBitsToFloat(i7) < -0.5f) {
/* 533 */                       i0o1iIoolIi.I000O01llI0(jI0001Ioi1lo2);
                            } else {
/* 537 */                       z2 = false;
/* 540 */                       i3 = (int) (jI0001Ioi1lo2 & j2);
/* 547 */                       if (Float.intBitsToFloat(i3) <= 0.5f) {
/* 549 */                           i0o1iIoolIi.I000OOo1O(jI0001Ioi1lo2);
                                } else if (Float.intBitsToFloat(i3) < -0.5f) {
/* 562 */                           i0o1iIoolIi.I0001Ioi1lo(jI0001Ioi1lo2);
                                } else {
/* 566 */                           z3 = false;
/* 575 */                           z = !z2 || z3;
                                }
/* 552 */                       z3 = true;
/* 575 */                       if (z2) {
                                }
                            }
/* 523 */                   z2 = true;
/* 540 */                   i3 = (int) (jI0001Ioi1lo2 & j2);
/* 547 */                   if (Float.intBitsToFloat(i3) <= 0.5f) {
                            }
/* 552 */                   z3 = true;
/* 575 */                   if (z2) {
                            }
                        }
/* 581 */               if (!OIOlIiiioi.I0000O(jI0001Ioi1lo, 0L)) {
/* 589 */                   if (!IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0001Ioi1lo) || Float.intBitsToFloat(i2) >= 0.0f) {
/* 616 */                       zI0001Ioi1lo = false;
                            } else {
/* 599 */                       EdgeEffect edgeEffectI0000Il00O = iioO1oi1li.I0000Il00O();
/* 603 */                       Float.intBitsToFloat(i2);
/* 606 */                       edgeEffectI0000Il00O.onRelease();
/* 611 */                       zI0001Ioi1lo = IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0001Ioi1lo);
                            }
/* 623 */                   if (IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I000II) && Float.intBitsToFloat(i2) > 0.0f) {
/* 633 */                       EdgeEffect edgeEffectI0000O = iioO1oi1li.I0000O();
/* 637 */                       Float.intBitsToFloat(i2);
/* 640 */                       edgeEffectI0000O.onRelease();
/* 656 */                       zI0001Ioi1lo = zI0001Ioi1lo || IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I000II);
                            }
/* 663 */                   if (IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0000O) && Float.intBitsToFloat(i6) < 0.0f) {
/* 673 */                       EdgeEffect edgeEffectI0000oI00 = iioO1oi1li.I0000oI00();
/* 677 */                       Float.intBitsToFloat(i6);
/* 680 */                       edgeEffectI0000oI00.onRelease();
/* 696 */                       zI0001Ioi1lo = zI0001Ioi1lo || IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0000O);
                            }
/* 703 */                   if (IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0000oI00) && Float.intBitsToFloat(i6) > 0.0f) {
/* 713 */                       EdgeEffect edgeEffectI00000oOI = iioO1oi1li.I00000oOI();
/* 717 */                       Float.intBitsToFloat(i6);
/* 720 */                       edgeEffectI00000oOI.onRelease();
/* 736 */                       zI0001Ioi1lo = zI0001Ioi1lo || IioO1oi1li.I0001Ioi1lo(iioO1oi1li.I0000oI00);
                            }
/* 744 */                   z = zI0001Ioi1lo || z;
                        }
/* 746 */               if (z) {
/* 748 */                   i0o1iIoolIi.I0000O();
                        }
/* 755 */               return OIOlIiiioi.I000II(jFloatToRawIntBits, j3);
                    }
/* 134 */           j2 = 4294967295L;
/* 136 */           fIntBitsToFloat = 0.0f;
/* 254 */           i2 = (int) (j >> 32);
/* 261 */           if (Float.intBitsToFloat(i2) != 0.0f) {
                    }
/* 383 */           jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & j2);
/* 390 */           if (!OIOlIiiioi.I0000O(jFloatToRawIntBits, 0L)) {
                    }
/* 395 */           jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(j, jFloatToRawIntBits);
/* 409 */           long j32 = ((OIOlIiiioi) oIoO1Ol.invoke(OIOlIiiioi.I00000oIO(jI0001Ioi1lo))).I00000oIO;
/* 413 */           long jI0001Ioi1lo22 = OIOlIiiioi.I0001Ioi1lo(jI0001Ioi1lo, j32);
/* 429 */           if (Float.intBitsToFloat((int) (jI0001Ioi1lo >> 32)) == 0.0f) {
/* 498 */               i0o1iIoolIi.I00000oIO();
                    } else {
/* 498 */               i0o1iIoolIi.I00000oIO();
                    }
/* 503 */           if (i4 != 1) {
                    }
/* 581 */           if (!OIOlIiiioi.I0000O(jI0001Ioi1lo, 0L)) {
                    }
/* 746 */           if (z) {
                    }
/* 755 */           return OIOlIiiioi.I000II(jFloatToRawIntBits, j32);
                }
            }
