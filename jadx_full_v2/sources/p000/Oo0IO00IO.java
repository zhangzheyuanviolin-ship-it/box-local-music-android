            package p000;

            import android.content.ClipData;
            import android.os.Parcel;
            import android.text.Annotation;
            import android.text.Spanned;
            import android.util.Base64;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class Oo0IO00IO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Oo0IOoOi01 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oo0IO00IO(Oo0IOoOi01 oo0IOoOi01, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oo0IOoOi01;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Oo0IOoOi01 oo0IOoOi01 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new Oo0IO00IO(oo0IOoOi01, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new Oo0IO00IO(oo0IOoOi01, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((Oo0IO00IO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:176:0x0358, code lost:
                
                    if (r2 == r1) goto L177;
                 */
                /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
                    I1111OO10i i1111OO10iI00000oIO;
                    IOO0IOIll iOO0IOIll;
                    Object iOO01ol;
                    Oo0IOoOi01 oo0IOoOi01;
                    Object i1111OO10i;
                    CharSequence text;
                    int i2;
                    int i3;
                    long j;
                    long j2;
/* 3 */             int i4 = this.I00iOIl;
/* 7 */             byte b = 1;
/* 8 */             Oo0IOoOi01 oo0IOoOi012 = this.I00iiO;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i4) {
                        case 0:
/* 983 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 985 */                   int i5 = this.I00iiI;
/* 987 */                   if (i5 != 0) {
/* 989 */                       if (i5 == 1) {
/* 991 */                           lIoii1l01l0i.I00000oOI(obj);
/* 1146 */                          return ooiIlOl1iI;
                                }
/* 996 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 999 */                       return null;
                            }
/* 1002 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1015 */                  if (Oo0lI00l.I0000O(oo0IOoOi012.I000l1().I00000oOI) || !oo0IOoOi012.I000O01llI0() || (oo0IOoOi012.I0001Ioi1lo instanceof OO0I1Oli)) {
/* 1123 */                      i = 1;
/* 1124 */                      i1111OO10iI00000oIO = null;
                            } else {
/* 1033 */                      i1111OO10iI00000oIO = lOlII1lolOiO.I00000oIO(oo0IOoOi012.I000l1());
/* 1053 */                      I1111OO10i i1111OO10iI0000Il00O = lOlII1lolOiO.I0000Il00O(oo0IOoOi012.I000l1(), oo0IOoOi012.I000l1().I00000oIO.I00iiI.length());
/* 1073 */                      I1111OO10i i1111OO10iI00000oOI = lOlII1lolOiO.I00000oOI(oo0IOoOi012.I000l1(), oo0IOoOi012.I000l1().I00000oIO.I00iiI.length());
/* 1079 */                      I11110OIl i11110OIl = new I11110OIl(i1111OO10iI0000Il00O);
/* 1082 */                      i11110OIl.I00000oOI(i1111OO10iI00000oOI);
/* 1085 */                      I1111OO10i i1111OO10iI000OiO = i11110OIl.I000OiO();
/* 1095 */                      int iI000II = Oo0lI00l.I000II(oo0IOoOi012.I000l1().I00000oOI);
/* 1109 */                      oo0IOoOi012.I0000Il00O.invoke(Oo0IOoOi01.I00000oOI(i1111OO10iI000OiO, lOliOi0Oi.I00000oIO(iI000II, iI000II)));
/* 1114 */                      oo0IOoOi012.I0010I0i(Io11Oo11oO.I00iOIl);
/* 1119 */                      i = 1;
/* 1120 */                      oo0IOoOi012.I00000oIO.I0000oI00 = true;
                            }
/* 1125 */                  if (i1111OO10iI00000oIO == null || (iOO0IOIll = oo0IOoOi012.I000O01llI0) == null) {
/* 1146 */                      return ooiIlOl1iI;
                            }
/* 1132 */                  IOO01ol iOO01olI00000oIO = ii0ioiio.I00000oIO(i1111OO10iI00000oIO);
/* 1136 */                  this.I00iiI = i;
/* 1140 */                  ((I0lOi1li1Ii) iOO0IOIll).I00000oIO(iOO01olI00000oIO);
                            return ooiIlOl1iI == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 15 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 17 */                    int i6 = this.I00iiI;
/* 20 */                    if (i6 == 0) {
/* 47 */                        lIoii1l01l0i.I00000oOI(obj);
/* 50 */                        IOO0IOIll iOO0IOIll2 = oo0IOoOi012.I000O01llI0;
/* 52 */                        if (iOO0IOIll2 == null) {
/* 980 */                           return ooiIlOl1iI;
                                }
/* 54 */                        this.I00iiI = 1;
/* 64 */                        ClipData primaryClip = ((I0lOi1li1Ii) iOO0IOIll2).I00000oIO.I00000oIO().getPrimaryClip();
/* 76 */                        iOO01ol = primaryClip != null ? new IOO01ol(primaryClip) : null;
/* 77 */                        if (iOO01ol != ii0111o2) {
                                }
/* 859 */                       return ii0111o2;
                            }
/* 22 */                    if (i6 != 1) {
/* 24 */                        if (i6 != 2) {
/* 35 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 38 */                            return null;
                                }
/* 26 */                        lIoii1l01l0i.I00000oOI(obj);
/* 29 */                        i1111OO10i = obj;
/* 31 */                        oo0IOoOi01 = oo0IOoOi012;
/* 862 */                       I1111OO10i i1111OO10i2 = (I1111OO10i) i1111OO10i;
/* 864 */                       if (i1111OO10i2 == null || !oo0IOoOi01.I000O01llI0()) {
/* 980 */                           return ooiIlOl1iI;
                                }
/* 896 */                       I11110OIl i11110OIl2 = new I11110OIl(lOlII1lolOiO.I0000Il00O(oo0IOoOi01.I000l1(), oo0IOoOi01.I000l1().I00000oIO.I00iiI.length()));
/* 899 */                       i11110OIl2.I00000oOI(i1111OO10i2);
/* 902 */                       I1111OO10i i1111OO10iI000OiO2 = i11110OIl2.I000OiO();
/* 922 */                       I1111OO10i i1111OO10iI00000oOI2 = lOlII1lolOiO.I00000oOI(oo0IOoOi01.I000l1(), oo0IOoOi01.I000l1().I00000oIO.I00iiI.length());
/* 928 */                       I11110OIl i11110OIl3 = new I11110OIl(i1111OO10iI000OiO2);
/* 931 */                       i11110OIl3.I00000oOI(i1111OO10iI00000oOI2);
/* 934 */                       I1111OO10i i1111OO10iI000OiO3 = i11110OIl3.I000OiO();
/* 954 */                       int length = i1111OO10i2.I00iiI.length() + Oo0lI00l.I000II(oo0IOoOi01.I000l1().I00000oOI);
/* 963 */                       Oo0IOoOi01 oo0IOoOi013 = oo0IOoOi01;
/* 967 */                       oo0IOoOi013.I0000Il00O.invoke(Oo0IOoOi01.I00000oOI(i1111OO10iI000OiO3, lOliOi0Oi.I00000oIO(length, length)));
/* 972 */                       oo0IOoOi013.I0010I0i(Io11Oo11oO.I00iOIl);
/* 978 */                       oo0IOoOi013.I00000oIO.I0000oI00 = true;
/* 980 */                       return ooiIlOl1iI;
                            }
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 44 */                    iOO01ol = obj;
/* 81 */                    IOO01ol iOO01ol2 = (IOO01ol) iOO01ol;
/* 83 */                    if (iOO01ol2 == null) {
/* 980 */                       return ooiIlOl1iI;
                            }
/* 85 */                    this.I00iiI = 2;
/* 89 */                    int i7 = 0;
/* 90 */                    ClipData.Item itemAt = iOO01ol2.I00000oIO.getItemAt(0);
/* 94 */                    if (itemAt != null && (text = itemAt.getText()) != null) {
/* 104 */                       if (text instanceof Spanned) {
/* 120 */                           Spanned spanned = (Spanned) text;
/* 132 */                           Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
/* 136 */                           ArrayList arrayList = new ArrayList();
/* 140 */                           int length2 = annotationArr.length - 1;
/* 141 */                           if (length2 >= 0) {
/* 143 */                               int i8 = 0;
                                        while (true) {
/* 144 */                                   Annotation annotation = annotationArr[i8];
/* 156 */                                   if (O0000Ioio00.I0000O(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
/* 164 */                                       int spanStart = spanned.getSpanStart(annotation);
/* 168 */                                       int spanEnd = spanned.getSpanEnd(annotation);
/* 172 */                                       String value = annotation.getValue();
/* 176 */                                       Parcel parcelObtain = Parcel.obtain();
/* 180 */                                       byte[] bArrDecode = Base64.decode(value, i7);
/* 185 */                                       parcelObtain.unmarshall(bArrDecode, i7, bArrDecode.length);
/* 188 */                                       parcelObtain.setDataPosition(i7);
/* 191 */                                       long j3 = IOOiio0i.I000o00OoI0I;
/* 197 */                                       long j4 = j3;
/* 193 */                                       long jI0000oI00 = Oo0o1OiIo.I0000Il00O;
/* 201 */                                       long jI0000oI002 = jI0000oI00;
/* 203 */                                       IlilIIiIiO ililIIiIiO = null;
/* 205 */                                       Ilil10i ilil10iI00000oIO = null;
/* 207 */                                       Ilil10oOo ilil10oOoI00000oIO = null;
/* 209 */                                       String string = null;
/* 211 */                                       I1oi0illolii i1oi0illoliiI00000oIO = null;
/* 213 */                                       Oo0OOlO0 oo0OOlO0 = null;
/* 215 */                                       OlooIOI0O olooIOI0O = null;
/* 217 */                                       OioOII0oI oioOII0oI = null;
/* 223 */                                       while (parcelObtain.dataAvail() > b) {
/* 225 */                                           byte b2 = parcelObtain.readByte();
/* 239 */                                           if (b2 != b) {
/* 289 */                                               i3 = spanStart;
/* 291 */                                               i2 = i7;
/* 295 */                                               if (b2 != 2) {
/* 362 */                                                   oo0IOoOi01 = oo0IOoOi012;
/* 366 */                                                   if (b2 != 3) {
/* 388 */                                                       if (b2 == 4) {
/* 395 */                                                           if (parcelObtain.dataAvail() >= 1) {
/* 397 */                                                               byte b3 = parcelObtain.readByte();
/* 410 */                                                               ilil10iI00000oIO = Ilil10i.I00000oIO((b3 != 0 && b3 == 1) ? 1 : i2);
/* 414 */                                                               spanStart = i3;
/* 416 */                                                               b = 1;
/* 417 */                                                               i7 = i2;
/* 419 */                                                               oo0IOoOi012 = oo0IOoOi01;
                                                                    }
                                                                } else if (b2 != 5) {
/* 462 */                                                           if (b2 == 6) {
/* 464 */                                                               string = parcelObtain.readString();
                                                                    } else if (b2 == 7) {
/* 476 */                                                               if (parcelObtain.dataAvail() >= 5) {
/* 478 */                                                                   byte b4 = parcelObtain.readByte();
/* 496 */                                                                   long j5 = b4 == 1 ? 4294967296L : b4 == 2 ? 8589934592L : 0L;
/* 515 */                                                                   jI0000oI002 = Oo0o1iioOiO.I00000oOI(j5, 0L) ? Oo0o1OiIo.I0000Il00O : lOlilO1lOIO.I0000oI00(parcelObtain.readFloat(), j5);
                                                                        }
                                                                    } else if (b2 == 8) {
/* 528 */                                                               if (parcelObtain.dataAvail() >= 4) {
/* 534 */                                                                   i1oi0illoliiI00000oIO = I1oi0illolii.I00000oIO(parcelObtain.readFloat());
                                                                        }
                                                                    } else if (b2 == 9) {
/* 548 */                                                               if (parcelObtain.dataAvail() >= 8) {
/* 563 */                                                                   spanStart = i3;
/* 560 */                                                                   oo0OOlO0 = new Oo0OOlO0(parcelObtain.readFloat(), parcelObtain.readFloat());
/* 351 */                                                                   i7 = i2;
/* 353 */                                                                   oo0IOoOi012 = oo0IOoOi01;
/* 355 */                                                                   b = 1;
                                                                        }
                                                                    } else if (b2 == 10) {
/* 577 */                                                               if (parcelObtain.dataAvail() >= 8) {
/* 579 */                                                                   int i9 = IOOiio0i.I000oI1ioi;
/* 581 */                                                                   long j6 = parcelObtain.readLong();
/* 585 */                                                                   long j7 = j6 & 63;
/* 589 */                                                                   if (j7 >= 16) {
/* 599 */                                                                       j6 = (j6 & (-64)) | (j7 + 1);
                                                                            }
/* 591 */                                                                   j4 = j6;
                                                                        }
                                                                    } else if (b2 == 11) {
/* 609 */                                                               if (parcelObtain.dataAvail() >= 4) {
/* 611 */                                                                   int i10 = parcelObtain.readInt();
/* 621 */                                                                   int i11 = (i10 & 2) != 0 ? 1 : i2;
/* 629 */                                                                   int i12 = (i10 & 1) != 0 ? 1 : i2;
/* 631 */                                                                   OlooIOI0O olooIOI0O2 = OlooIOI0O.I0000O;
/* 633 */                                                                   OlooIOI0O olooIOI0O3 = OlooIOI0O.I0000Il00O;
/* 635 */                                                                   if (i11 == 0 || i12 == 0) {
/* 707 */                                                                       olooIOI0O = i11 != 0 ? olooIOI0O2 : i12 != 0 ? olooIOI0O3 : OlooIOI0O.I00000oOI;
                                                                            } else {
/* 643 */                                                                       List listI000O01llI0 = IOOi1I.I000O01llI0(olooIOI0O2, olooIOI0O3);
/* 647 */                                                                       Integer numValueOf = Integer.valueOf(i2);
/* 654 */                                                                       int size = listI000O01llI0.size();
/* 660 */                                                                       for (int i13 = i2; i13 < size; i13++) {
/* 675 */                                                                           numValueOf = Integer.valueOf(numValueOf.intValue() | ((OlooIOI0O) listI000O01llI0.get(i13)).I00000oIO);
                                                                                }
/* 688 */                                                                       olooIOI0O = new OlooIOI0O(numValueOf.intValue());
                                                                            }
                                                                        }
                                                                    } else if (b2 == 12) {
/* 723 */                                                               if (parcelObtain.dataAvail() >= 20) {
/* 727 */                                                                   int i14 = IOOiio0i.I000oI1ioi;
/* 729 */                                                                   long j8 = parcelObtain.readLong();
/* 733 */                                                                   long j9 = j8 & 63;
/* 737 */                                                                   if (j9 >= 16) {
/* 746 */                                                                       j8 = (j8 & (-64)) | (j9 + 1);
                                                                            }
/* 739 */                                                                   long j10 = j8;
/* 785 */                                                                   spanStart = i3;
/* 787 */                                                                   i7 = i2;
/* 789 */                                                                   oo0IOoOi012 = oo0IOoOi01;
/* 782 */                                                                   oioOII0oI = new OioOII0oI(parcelObtain.readFloat(), j10, (Float.floatToRawIntBits(parcelObtain.readFloat()) << 32) | (Float.floatToRawIntBits(parcelObtain.readFloat()) & 4294967295L));
/* 355 */                                                                   b = 1;
                                                                        }
                                                                    }
/* 349 */                                                           spanStart = i3;
/* 351 */                                                           i7 = i2;
/* 353 */                                                           oo0IOoOi012 = oo0IOoOi01;
/* 355 */                                                           b = 1;
                                                                } else if (parcelObtain.dataAvail() >= 1) {
/* 432 */                                                           byte b5 = parcelObtain.readByte();
/* 436 */                                                           if (b5 != 0) {
/* 455 */                                                               int i15 = b5 == 1 ? 65535 : b5 == 3 ? 2 : b5 == 2 ? 1 : i2;
/* 456 */                                                               ilil10oOoI00000oIO = Ilil10oOo.I00000oIO(i15);
/* 349 */                                                               spanStart = i3;
/* 351 */                                                               i7 = i2;
/* 353 */                                                               oo0IOoOi012 = oo0IOoOi01;
/* 355 */                                                               b = 1;
                                                                    }
                                                                }
/* 816 */                                                       arrayList.add(new I11110l0o(new OlIIi1oIIOlo(j3, jI0000oI00, ililIIiIiO, ilil10iI00000oIO, ilil10oOoI00000oIO, null, string, jI0000oI002, i1oi0illoliiI00000oIO, oo0OOlO0, null, j4, olooIOI0O, oioOII0oI, 49152), i3, spanEnd));
                                                            } else if (parcelObtain.dataAvail() >= 4) {
/* 383 */                                                       spanStart = i3;
/* 380 */                                                       ililIIiIiO = new IlilIIiIiO(parcelObtain.readInt());
/* 351 */                                                       i7 = i2;
/* 353 */                                                       oo0IOoOi012 = oo0IOoOi01;
/* 355 */                                                       b = 1;
                                                            } else {
/* 816 */                                                       arrayList.add(new I11110l0o(new OlIIi1oIIOlo(j3, jI0000oI00, ililIIiIiO, ilil10iI00000oIO, ilil10oOoI00000oIO, null, string, jI0000oI002, i1oi0illoliiI00000oIO, oo0OOlO0, null, j4, olooIOI0O, oioOII0oI, 49152), i3, spanEnd));
                                                            }
                                                        } else if (parcelObtain.dataAvail() >= 5) {
/* 303 */                                                   byte b6 = parcelObtain.readByte();
/* 307 */                                                   if (b6 == b) {
/* 309 */                                                       oo0IOoOi01 = oo0IOoOi012;
/* 311 */                                                       j2 = 4294967296L;
                                                            } else if (b6 == 2) {
/* 318 */                                                       oo0IOoOi01 = oo0IOoOi012;
/* 320 */                                                       j2 = 8589934592L;
                                                            } else {
/* 323 */                                                       oo0IOoOi01 = oo0IOoOi012;
/* 325 */                                                       j = 0;
/* 327 */                                                       j2 = 0;
/* 344 */                                                       jI0000oI00 = !Oo0o1iioOiO.I00000oOI(j2, j) ? Oo0o1OiIo.I0000Il00O : lOlilO1lOIO.I0000oI00(parcelObtain.readFloat(), j2);
/* 349 */                                                       spanStart = i3;
/* 351 */                                                       i7 = i2;
/* 353 */                                                       oo0IOoOi012 = oo0IOoOi01;
/* 355 */                                                       b = 1;
                                                            }
/* 313 */                                                   j = 0;
/* 344 */                                                   jI0000oI00 = !Oo0o1iioOiO.I00000oOI(j2, j) ? Oo0o1OiIo.I0000Il00O : lOlilO1lOIO.I0000oI00(parcelObtain.readFloat(), j2);
/* 349 */                                                   spanStart = i3;
/* 351 */                                                   i7 = i2;
/* 353 */                                                   oo0IOoOi012 = oo0IOoOi01;
/* 355 */                                                   b = 1;
                                                        } else {
/* 358 */                                                   oo0IOoOi01 = oo0IOoOi012;
/* 816 */                                                   arrayList.add(new I11110l0o(new OlIIi1oIIOlo(j3, jI0000oI00, ililIIiIiO, ilil10iI00000oIO, ilil10oOoI00000oIO, null, string, jI0000oI002, i1oi0illoliiI00000oIO, oo0OOlO0, null, j4, olooIOI0O, oioOII0oI, 49152), i3, spanEnd));
                                                        }
                                                    } else if (parcelObtain.dataAvail() >= 8) {
/* 247 */                                               int i16 = IOOiio0i.I000oI1ioi;
/* 249 */                                               long j11 = parcelObtain.readLong();
/* 253 */                                               long j12 = j11 & 63;
/* 266 */                                               j3 = j12 < 16 ? j11 : (j11 & (-64)) | (j12 + 1);
                                                    } else {
/* 271 */                                               i2 = i7;
/* 273 */                                               oo0IOoOi01 = oo0IOoOi012;
/* 275 */                                               i3 = spanStart;
/* 816 */                                               arrayList.add(new I11110l0o(new OlIIi1oIIOlo(j3, jI0000oI00, ililIIiIiO, ilil10iI00000oIO, ilil10oOoI00000oIO, null, string, jI0000oI002, i1oi0illoliiI00000oIO, oo0OOlO0, null, j4, olooIOI0O, oioOII0oI, 49152), i3, spanEnd));
                                                    }
                                                }
/* 271 */                                       i2 = i7;
/* 273 */                                       oo0IOoOi01 = oo0IOoOi012;
/* 275 */                                       i3 = spanStart;
/* 816 */                                       arrayList.add(new I11110l0o(new OlIIi1oIIOlo(j3, jI0000oI00, ililIIiIiO, ilil10iI00000oIO, ilil10oOoI00000oIO, null, string, jI0000oI002, i1oi0illoliiI00000oIO, oo0OOlO0, null, j4, olooIOI0O, oioOII0oI, 49152), i3, spanEnd));
                                            } else {
/* 158 */                                       i2 = i7;
/* 160 */                                       oo0IOoOi01 = oo0IOoOi012;
                                            }
/* 819 */                                   if (i8 != length2) {
/* 821 */                                       i8++;
/* 823 */                                       i7 = i2;
/* 825 */                                       oo0IOoOi012 = oo0IOoOi01;
/* 827 */                                       b = 1;
                                            }
                                        }
                                    } else {
/* 831 */                               oo0IOoOi01 = oo0IOoOi012;
                                    }
/* 835 */                           String string2 = text.toString();
/* 839 */                           I1111OO10i i1111OO10i3 = I111IiO.I00000oIO;
/* 850 */                           i1111OO10i = new I1111OO10i(arrayList.isEmpty() ? null : arrayList, string2);
                                    break;
                                } else {
/* 112 */                           i1111OO10i = new I1111OO10i(text.toString());
/* 115 */                           oo0IOoOi01 = oo0IOoOi012;
                                    break;
                                }
                            } else {
/* 854 */                       oo0IOoOi01 = oo0IOoOi012;
/* 856 */                       i1111OO10i = null;
                                break;
                            }
                            break;
                    }
                }
            }
