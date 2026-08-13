            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.io.IOException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class Ioo1oiOl implements IooI100o11O {
                public String I00000oIO;
                public String I00000oOI;

                public Ioo1oiOl(String str, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
                }

                public static Integer I00000oOI(ArrayList arrayList) throws IOException {
/* 2 */             Object objI000o00OoI0I = IIlIOloOOO.I000o00OoI0I(1, arrayList);
/* 8 */             if (objI000o00OoI0I instanceof Integer) {
/* 10 */                return (Integer) objI000o00OoI0I;
                    }
/* 13 */            IO1I000 io1i000 = (IO1I000) objI000o00OoI0I;
/* 17 */            int[] iArr = io1i000.I00000oIO.I00000oIO;
/* 24 */            if (iArr[0] == 12 && iArr[1] == 12) {
/* 51 */                return Integer.valueOf(((Integer) IIlIOloOOO.I000o00OoI0I(1, arrayList)).intValue() / ((Integer) IIlIOloOOO.I000o00OoI0I(1, arrayList)).intValue());
                    }
/* 60 */            I000II.I00111O("Unexpected char string command: ", io1i000.I00000oIO);
/* 63 */            return null;
                }

                public void I00000oIO(byte[] bArr, List list, ArrayList arrayList) throws EOFException {
                    Integer numValueOf;
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 7 */             Ii11iIi ii11iIi = new Ii11iIi(bArr);
/* 15 */            while (ii11iIi.I0000Il00O < ii11iIi.I00000oOI.length) {
/* 17 */                int iI0001Ioi1lo = ii11iIi.I0001Ioi1lo();
/* 27 */                if (iI0001Ioi1lo == 10) {
/* 29 */                    Object objI000o00OoI0I = IIlIOloOOO.I000o00OoI0I(1, arrayList);
/* 37 */                    if (objI000o00OoI0I instanceof Integer) {
/* 71 */                        Integer num = (Integer) objI000o00OoI0I;
/* 77 */                        if (num.intValue() < 0 || num.intValue() >= list.size()) {
/* 176 */                           Log.w("PdfBox-Android", "CALLSUBR is ignored, operand: " + num + ", subrs.size(): " + list.size() + " in glyph '" + str2 + "' of font " + str);
/* 185 */                           while (IIl001iO0Io.I000OiO(1, arrayList) instanceof Integer) {
/* 192 */                               arrayList.remove(arrayList.size() - 1);
                                    }
                                } else {
/* 99 */                            I00000oIO((byte[]) list.get(num.intValue()), list, arrayList);
/* 107 */                           Object obj = arrayList.get(arrayList.size() - 1);
/* 113 */                           if ((obj instanceof IO1I000) && ((IO1I000) obj).I00000oIO.I00000oIO[0] == 11) {
/* 132 */                               arrayList.remove(arrayList.size() - 1);
                                    }
                                }
                            } else {
/* 67 */                        Log.w("PdfBox-Android", "Parameter " + objI000o00OoI0I + " for CALLSUBR is ignored, integer expected in glyph '" + str2 + "' of font " + str);
                            }
                        } else if (iI0001Ioi1lo == 12 && ii11iIi.I00000oIO(0) == 16) {
/* 208 */                   ii11iIi.I0000Il00O();
/* 220 */                   Integer num2 = (Integer) arrayList.remove(arrayList.size() - 1);
/* 226 */                   Integer num3 = (Integer) IIlIOloOOO.I000o00OoI0I(1, arrayList);
/* 230 */                   ArrayDeque arrayDeque = new ArrayDeque();
/* 233 */                   int iIntValue = num2.intValue();
/* 237 */                   if (iIntValue == 0) {
/* 289 */                       arrayDeque.push(I00000oOI(arrayList));
/* 296 */                       arrayDeque.push(I00000oOI(arrayList));
/* 304 */                       arrayList.remove(arrayList.size() - 1);
/* 311 */                       arrayList.add(0);
/* 319 */                       arrayList.add(new IO1I000(12, 16));
                            } else if (iIntValue == 1) {
/* 273 */                       arrayList.add(1);
/* 281 */                       arrayList.add(new IO1I000(12, 16));
                            } else if (iIntValue != 3) {
/* 249 */                       for (int i = 0; i < num3.intValue(); i++) {
/* 255 */                           arrayDeque.push(I00000oOI(arrayList));
                                }
                            } else {
/* 265 */                       arrayDeque.push(I00000oOI(arrayList));
                            }
/* 326 */                   while (ii11iIi.I00000oIO(0) == 12 && ii11iIi.I00000oIO(1) == 17) {
/* 336 */                       ii11iIi.I0000Il00O();
/* 339 */                       ii11iIi.I0000Il00O();
/* 346 */                       arrayList.add(arrayDeque.pop());
                            }
/* 354 */                   if (arrayDeque.size() > 0) {
/* 378 */                       Log.w("PdfBox-Android", "Value left on the PostScript stack in glyph " + str2 + " of font " + str);
                            }
                        } else if (iI0001Ioi1lo >= 0 && iI0001Ioi1lo <= 31) {
/* 406 */                   arrayList.add(iI0001Ioi1lo == 12 ? new IO1I000(iI0001Ioi1lo, ii11iIi.I0001Ioi1lo()) : new IO1I000(iI0001Ioi1lo));
                        } else {
/* 413 */                   if (iI0001Ioi1lo < 32 || iI0001Ioi1lo > 255) {
/* 500 */                       OIiilo1Ool0o.I00100o1O0lo();
/* 2160 */                      return;
                            }
/* 419 */                   if (iI0001Ioi1lo >= 32 && iI0001Ioi1lo <= 246) {
/* 427 */                       numValueOf = Integer.valueOf(iI0001Ioi1lo - 139);
                            } else if (iI0001Ioi1lo >= 247 && iI0001Ioi1lo <= 250) {
/* 451 */                       numValueOf = Integer.valueOf(((iI0001Ioi1lo - 247) * Barcode.FORMAT_QR_CODE) + ii11iIi.I0001Ioi1lo() + 108);
                            } else if (iI0001Ioi1lo >= 251 && iI0001Ioi1lo <= 254) {
/* 476 */                       numValueOf = Integer.valueOf((((-(iI0001Ioi1lo - 251)) * Barcode.FORMAT_QR_CODE) - ii11iIi.I0001Ioi1lo()) - 108);
                            } else {
/* 481 */                       if (iI0001Ioi1lo != 255) {
/* 496 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 499 */                           return;
                                }
/* 487 */                       numValueOf = Integer.valueOf(ii11iIi.I0000oI00());
                            }
/* 491 */                   arrayList.add(numValueOf);
                        }
                    }
                }

                @Override
                public Ioo1Ololi1 toInstant() {
/* 113 */           throw new IoOoiol010lI(this.I00000oIO + " when parsing an Instant from \"" + iIo1li.I0000oI00(64, this.I00000oOI) + '\"');
                }
            }
