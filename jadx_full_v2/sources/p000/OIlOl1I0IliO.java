            package p000;

            import android.util.Log;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public abstract class OIlOl1I0IliO implements IIi0O1OOO1i0, OIll1oO1 {
                public final OIo011l I00iOIl;
                public float I00iiO;
                public float I00iio;
                public final IIOoi0ooOoO I00ioIO;
                public OIll1lio I00l0I0l0lO1;
                public final HashMap I00ilI0I1 = new HashMap();
                public final HashMap I00ilO0 = new HashMap();
                public final float[] I00io1l = {880.0f, -1000.0f};
                public final HashMap I00iiI = new HashMap();

                public OIlOl1I0IliO(IIOoi0ooOoO iIOoi0ooOoO, OIo011l oIo011l) {
/* 26 */            this.I00ioIO = iIOoi0ooOoO;
/* 28 */            this.I00iOIl = oIo011l;
/* 39 */            IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(IIi0I0I0o.I0IlIoI1oi0);
/* 46 */            if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 48 */                IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oII;
/* 52 */                int size = iIOoIilO.I00iOIl.size();
/* 56 */                int i = 0;
                        while (true) {
/* 59 */                    if (i >= size - 1) {
                                break;
                            }
/* 61 */                    int i2 = i + 1;
/* 63 */                    IIOoOiOI iIOoOiOII00lll10 = iIOoIilO.I00lll10(i);
/* 73 */                    if (iIOoOiOII00lll10 instanceof IIi0IoOo) {
/* 92 */                        IIi0IoOo iIi0IoOo = (IIi0IoOo) iIOoOiOII00lll10;
/* 94 */                        int i3 = i + 2;
/* 96 */                        IIOoOiOI iIOoOiOII00lll102 = iIOoIilO.I00lll10(i2);
/* 102 */                       if (iIOoOiOII00lll102 instanceof IIOoIilO) {
/* 104 */                           IIOoIilO iIOoIilO2 = (IIOoIilO) iIOoOiOII00lll102;
/* 106 */                           int iI00lli11 = iIi0IoOo.I00lli11();
/* 112 */                           int size2 = iIOoIilO2.I00iOIl.size();
/* 117 */                           for (int i4 = 0; i4 < size2; i4++) {
/* 119 */                               IIOoOiOI iIOoOiOII00lll103 = iIOoIilO2.I00lll10(i4);
/* 125 */                               if (iIOoOiOII00lll103 instanceof IIi0IoOo) {
/* 145 */                                   this.I00iiI.put(Integer.valueOf(iI00lli11 + i4), Float.valueOf(((IIi0IoOo) iIOoOiOII00lll103).I00ioIO()));
                                        } else {
/* 161 */                                   Log.w("PdfBox-Android", "Expected a number array member, got " + iIOoOiOII00lll103);
                                        }
                                    }
/* 167 */                           i = i3;
                                } else {
/* 169 */                           if (i3 >= size) {
/* 173 */                               Log.w("PdfBox-Android", "premature end of widths array");
                                        break;
                                    }
/* 177 */                           i += 3;
/* 179 */                           IIOoOiOI iIOoOiOII00lll104 = iIOoIilO.I00lll10(i3);
/* 185 */                           if ((iIOoOiOII00lll102 instanceof IIi0IoOo) && (iIOoOiOII00lll104 instanceof IIi0IoOo)) {
/* 200 */                               int iI00lli112 = ((IIi0IoOo) iIOoOiOII00lll102).I00lli11();
/* 204 */                               float fI00ioIO = ((IIi0IoOo) iIOoOiOII00lll104).I00ioIO();
/* 208 */                               for (int iI00lli113 = iIi0IoOo.I00lli11(); iI00lli113 <= iI00lli112; iI00lli113++) {
/* 220 */                                   this.I00iiI.put(Integer.valueOf(iI00lli113), Float.valueOf(fI00ioIO));
                                        }
                                    } else {
/* 248 */                               Log.w("PdfBox-Android", "Expected two numbers, got " + iIOoOiOII00lll102 + " and " + iIOoOiOII00lll104);
                                    }
                                }
                            } else {
/* 87 */                        Log.w("PdfBox-Android", "Expected a number array member, got " + iIOoOiOII00lll10);
/* 90 */                        i = i2;
                            }
                        }
                    }
/* 253 */           HashMap map = this.I00ilO0;
/* 255 */           HashMap map2 = this.I00ilI0I1;
/* 257 */           float[] fArr = this.I00io1l;
/* 259 */           IIOoi0ooOoO iIOoi0ooOoO2 = this.I00ioIO;
/* 263 */           IIOoOiOI iIOoOiOII00oII2 = iIOoi0ooOoO2.I00oII(IIi0I0I0o.I01Io11IiiiO);
/* 270 */           if (iIOoOiOII00oII2 instanceof IIOoIilO) {
/* 272 */               IIOoIilO iIOoIilO3 = (IIOoIilO) iIOoOiOII00oII2;
/* 274 */               IIOoOiOI iIOoOiOII00lll105 = iIOoIilO3.I00lll10(0);
/* 278 */               IIOoOiOI iIOoOiOII00lll106 = iIOoIilO3.I00lll10(1);
/* 284 */               if ((iIOoOiOII00lll105 instanceof IIi0IoOo) && (iIOoOiOII00lll106 instanceof IIi0IoOo)) {
/* 296 */                   fArr[0] = ((IIi0IoOo) iIOoOiOII00lll105).I00ioIO();
/* 304 */                   fArr[1] = ((IIi0IoOo) iIOoOiOII00lll106).I00ioIO();
                        }
                    }
/* 308 */           IIOoOiOI iIOoOiOII00oII3 = iIOoi0ooOoO2.I00oII(IIi0I0I0o.I0IlOI1i);
/* 314 */           if (iIOoOiOII00oII3 instanceof IIOoIilO) {
/* 316 */               IIOoIilO iIOoIilO4 = (IIOoIilO) iIOoOiOII00oII3;
/* 318 */               int i5 = 0;
/* 325 */               while (i5 < iIOoIilO4.I00iOIl.size()) {
/* 331 */                   IIi0IoOo iIi0IoOo2 = (IIi0IoOo) iIOoIilO4.I00lll10(i5);
/* 333 */                   int i6 = i5 + 1;
/* 335 */                   IIOoOiOI iIOoOiOII00lll107 = iIOoIilO4.I00lll10(i6);
/* 341 */                   if (iIOoOiOII00lll107 instanceof IIOoIilO) {
/* 343 */                       IIOoIilO iIOoIilO5 = (IIOoIilO) iIOoOiOII00lll107;
/* 352 */                       for (int i7 = 0; i7 < iIOoIilO5.I00iOIl.size(); i7 += 3) {
/* 360 */                           int iI00lli114 = (i7 / 3) + iIi0IoOo2.I00lli11();
/* 365 */                           IIi0IoOo iIi0IoOo3 = (IIi0IoOo) iIOoIilO5.I00lll10(i7);
/* 373 */                           IIi0IoOo iIi0IoOo4 = (IIi0IoOo) iIOoIilO5.I00lll10(i7 + 1);
/* 381 */                           IIi0IoOo iIi0IoOo5 = (IIi0IoOo) iIOoIilO5.I00lll10(i7 + 2);
/* 395 */                           map2.put(Integer.valueOf(iI00lli114), Float.valueOf(iIi0IoOo3.I00ioIO()));
/* 415 */                           map.put(Integer.valueOf(iI00lli114), new Ooo0OIOI(iIi0IoOo4.I00ioIO(), iIi0IoOo5.I00ioIO()));
                                }
                            } else {
/* 427 */                       int iI00lli115 = ((IIi0IoOo) iIOoOiOII00lll107).I00lli11();
/* 437 */                       IIi0IoOo iIi0IoOo6 = (IIi0IoOo) iIOoIilO4.I00lll10(i5 + 2);
/* 445 */                       IIi0IoOo iIi0IoOo7 = (IIi0IoOo) iIOoIilO4.I00lll10(i5 + 3);
/* 447 */                       int i8 = i5 + 4;
/* 453 */                       IIi0IoOo iIi0IoOo8 = (IIi0IoOo) iIOoIilO4.I00lll10(i8);
/* 455 */                       for (int iI00lli116 = iIi0IoOo2.I00lli11(); iI00lli116 <= iI00lli115; iI00lli116++) {
/* 469 */                           map2.put(Integer.valueOf(iI00lli116), Float.valueOf(iIi0IoOo6.I00ioIO()));
/* 489 */                           map.put(Integer.valueOf(iI00lli116), new Ooo0OIOI(iIi0IoOo7.I00ioIO(), iIi0IoOo8.I00ioIO()));
                                }
/* 495 */                       i6 = i8;
                            }
/* 496 */                   i5 = i6 + 1;
                        }
                    }
                }

                public abstract int I0000O(int i);

                public abstract int I0000oI00(int i);

                public float I0001Ioi1lo() {
                    float fFloatValue;
/* 6 */             if (this.I00iio == 0.0f) {
/* 8 */                 int i = 0;
/* 9 */                 HashMap map = this.I00iiI;
/* 11 */                if (map != null) {
/* 21 */                    fFloatValue = 0.0f;
/* 26 */                    for (Float f : map.values()) {
/* 40 */                        if (f.floatValue() > 0.0f) {
/* 46 */                            fFloatValue += f.floatValue();
/* 47 */                            i++;
                                }
                            }
                        } else {
/* 50 */                    fFloatValue = 0.0f;
                        }
/* 51 */                if (i != 0) {
/* 55 */                    this.I00iio = fFloatValue / i;
                        }
/* 57 */                float f2 = this.I00iio;
/* 61 */                if (f2 <= 0.0f || Float.isNaN(f2)) {
/* 73 */                    this.I00iio = I000OOo1O();
                        }
                    }
/* 75 */            return this.I00iio;
                }

                public final String I000II() {
/* 5 */             return this.I00ioIO.I010101Oo1lO(IIi0I0I0o.I00ol1);
                }

                public final OIlOo0I1lIl I000O01llI0() {
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00ioIO.I00oII(IIi0I0I0o.I010lI0oi);
/* 11 */            if (!(iIOoOiOII00oII instanceof IIOoi0ooOoO)) {
/* 27 */                return null;
                    }
/* 18 */            OIlOo0I1lIl oIlOo0I1lIl = new OIlOo0I1lIl(0);
/* 21 */            oIlOo0I1lIl.I00iiI = (IIOoi0ooOoO) iIOoOiOII00oII;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            return oIlOo0I1lIl;
                }

                public final float I000OOo1O() {
/* 1 */             float f = this.I00iiO;
/* 6 */             if (f != 0.0f) {
/* 113 */               return f;
                    }
/* 12 */            IIOoOiOI iIOoOiOII00oII = this.I00ioIO.I00oII(IIi0I0I0o.I01Io1);
/* 18 */            if (!(iIOoOiOII00oII instanceof IIi0IoOo)) {
/* 31 */                this.I00iiO = 1000.0f;
/* 29 */                return 1000.0f;
                    }
/* 22 */            float fI00ioIO = ((IIi0IoOo) iIOoOiOII00oII).I00ioIO();
/* 26 */            this.I00iiO = fI00ioIO;
/* 28 */            return fI00ioIO;
                }

                public final OIll1lio I000OiO() {
                    IIOoi0ooOoO iIOoi0ooOoO;
/* 3 */             if (this.I00l0I0l0lO1 == null && (iIOoi0ooOoO = (IIOoi0ooOoO) this.I00ioIO.I00oII(IIi0I0I0o.I01OooO0o0o)) != null) {
/* 22 */                this.I00l0I0l0lO1 = new OIll1lio(iIOoi0ooOoO);
                    }
/* 24 */            return this.I00l0I0l0lO1;
                }

                public final int[] I000iOII() throws IOException {
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00ioIO.I00oII(IIi0I0I0o.I010l1ol111);
/* 11 */            if (!(iIOoOiOII00oII instanceof IIi0io1lIo)) {
/* 64 */                return null;
                    }
/* 15 */            IIOooOII iIOooOIII010l1ol111 = ((IIi0io1lIo) iIOoOiOII00oII).I010l1ol111();
/* 21 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 24 */            io0iolo.I0000Il00O(iIOooOIII010l1ol111, byteArrayOutputStream);
/* 27 */            byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 31 */            io0iolo.I00000oOI(iIOooOIII010l1ol111);
/* 35 */            int length = byteArray.length / 2;
/* 37 */            int[] iArr = new int[length];
/* 40 */            int i = 0;
/* 41 */            for (int i2 = 0; i2 < length; i2++) {
/* 56 */                iArr[i2] = ((byteArray[i] & 255) << 8) | (byteArray[i + 1] & 255);
/* 58 */                i += 2;
                    }
/* 63 */            return iArr;
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00ioIO;
                }
            }
