            package p000;

            import android.graphics.Paint;
            import android.os.Build;
            import android.text.Layout;
            import android.text.Spannable;
            import android.text.SpannableString;
            import android.text.Spanned;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class l1oI100ii {
                /* JADX WARN: Removed duplicated region for block: B:104:0x0157  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x015f  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x01ef  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x01fc  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x02e7  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x0323  */
                /* JADX WARN: Removed duplicated region for block: B:212:0x0326  */
                /* JADX WARN: Removed duplicated region for block: B:216:0x0354  */
                /* JADX WARN: Removed duplicated region for block: B:221:0x0384  */
                /* JADX WARN: Removed duplicated region for block: B:222:0x0388  */
                /* JADX WARN: Removed duplicated region for block: B:264:0x0449  */
                /* JADX WARN: Removed duplicated region for block: B:266:0x045f  */
                /* JADX WARN: Removed duplicated region for block: B:268:0x0472  */
                /* JADX WARN: Removed duplicated region for block: B:269:0x047e  */
                /* JADX WARN: Removed duplicated region for block: B:270:0x0491  */
                /* JADX WARN: Removed duplicated region for block: B:271:0x049a  */
                /* JADX WARN: Removed duplicated region for block: B:272:0x049f  */
                /* JADX WARN: Removed duplicated region for block: B:282:0x0443 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0132  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final I0oilIol11i I00000oIO(OIoiOo11o oIoiOo11o, long j, int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    O0oo0I00 o0oo0I00;
                    int i12;
                    int i13;
                    TextUtils.TruncateAt truncateAt;
                    TextUtils.TruncateAt truncateAt2;
                    int i14;
                    I0oilIol11i i0oilIol11i;
                    int i15;
                    int i16;
                    I0oilIol11i i0oilIol11i2;
                    int i17;
                    Layout layout;
                    OioOII0IIoO1[] oioOII0IIoO1Arr;
                    CharSequence charSequence;
                    List list;
                    OOo0IO oOo0IO;
                    float fI000OiO;
                    int iI0000Il00O;
                    float fI000OOo1O;
                    int iI0000Il00O2;
                    float fI0000O;
                    int iI00000oOI;
                    float fI000O01llI0;
                    float fI00000oOI;
                    float fI0000O2;
                    float f;
                    Paint.FontMetricsInt fontMetricsInt;
                    int i18;
/* 9 */             I0ol0iioI i0ol0iioI = (I0ol0iioI) oIoiOo11o;
/* 11 */            I100o1l i100o1l = i0ol0iioI.I00ioIO;
/* 13 */            CharSequence charSequence2 = i0ol0iioI.I00l0I0l0lO1;
/* 15 */            I0oilIol11i i0oilIol11i3 = new I0oilIol11i();
/* 18 */            i0oilIol11i3.I00000oIO = i0ol0iioI;
/* 22 */            i0oilIol11i3.I00000oOI = j;
/* 28 */            if (IOo0oO11ll1O.I000iOII(j) != 0 || IOo0oO11ll1O.I000l1(j) != 0) {
/* 39 */                Ioliol.I00000oIO("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                    }
/* 43 */            if (i < 1) {
/* 48 */                Ioliol.I00000oIO("maxLines should be greater than 0");
                    }
/* 51 */            Oo0lloOiiIOI oo0lloOiiIOI = i0ol0iioI.I00iiI;
/* 58 */            if (i2 == 2) {
/* 64 */                i3 = 0;
/* 74 */                if (!Oo0o1OiIo.I00000oOI(oo0lloOiiIOI.I00000oIO.I000O01llI0, lOlilO1lOIO.I0000O(0)) && !Oo0o1OiIo.I00000oOI(oo0lloOiiIOI.I00000oIO.I000O01llI0, Oo0o1OiIo.I0000Il00O) && (i18 = oo0lloOiiIOI.I00000oOI.I00000oIO) != 0 && i18 != 5 && i18 != 4 && charSequence2.length() != 0) {
/* 116 */                   Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
/* 118 */                   if (spannableString == null) {
/* 122 */                       spannableString = new SpannableString(charSequence2);
                            }
/* 131 */                   if (!lOO1lIo0.I00000oIO(spannableString, Iol0Io11Ilo.class)) {
/* 150 */                       spannableString.setSpan(new Iol0Io11Ilo(), spannableString.length() - 1, spannableString.length() - 1, 33);
                            }
/* 153 */                   charSequence2 = spannableString;
                        }
                    } else {
/* 156 */               i3 = 0;
                    }
/* 154 */           CharSequence charSequence3 = charSequence2;
/* 159 */           i0oilIol11i3.I0000O = charSequence3;
/* 165 */           if (i0oilIol11i3.I00000oOI()) {
/* 181 */               i0oilIol11i3.I0000oI00 = lOO1lI1o.I00000oOI(oo0lloOiiIOI.I00000oOI.I0000Il00O, i100o1l.getTextSize(), i0ol0iioI.I00ilO0);
                    }
/* 183 */           OIoioI0OIiI oIoioI0OIiI = oo0lloOiiIOI.I00000oOI;
/* 185 */           int i19 = oIoioI0OIiI.I00000oIO;
/* 209 */           int i20 = i19 == 1 ? 3 : i19 == 2 ? 4 : i19 == 3 ? 2 : (i19 != 5 && i19 == 6) ? 1 : i3;
/* 214 */           int i21 = i19 == 4 ? 1 : i3;
/* 223 */           int i22 = oIoioI0OIiI.I000O01llI0 == 2 ? 4 : i3;
/* 225 */           int i23 = oIoioI0OIiI.I000II;
/* 227 */           int i24 = i23 & 255;
/* 229 */           if (i24 == 1) {
/* 231 */               i4 = i3;
                    } else {
/* 235 */               if (i24 != 2) {
/* 244 */                   i4 = i24 == 3 ? 2 : i3;
/* 248 */                   i5 = (i23 >> 8) & 255;
/* 250 */                   if (i5 != 1) {
/* 257 */                       if (i5 == 2) {
/* 259 */                           i6 = i20;
/* 260 */                           i7 = 1;
                                } else if (i5 == 3) {
/* 265 */                           i6 = i20;
/* 266 */                           i7 = 2;
                                } else if (i5 == 4) {
/* 271 */                           i6 = i20;
/* 272 */                           i7 = 3;
                                } else {
/* 252 */                           i6 = i20;
/* 253 */                           i7 = i3;
                                }
                            }
/* 273 */                   O0oo0I00 o0oo0I002 = oIoioI0OIiI.I0001Ioi1lo;
/* 277 */                   i8 = (i23 >> 16) & 255;
/* 280 */                   if (i8 != 1) {
/* 282 */                       i10 = i22;
/* 283 */                       i11 = i3;
/* 285 */                       i9 = 2;
                            } else {
/* 287 */                       i9 = 2;
/* 288 */                       if (i8 == 2) {
/* 290 */                           i10 = i22;
/* 291 */                           i11 = 1;
                                } else {
/* 293 */                           i10 = i22;
/* 294 */                           i11 = i3;
                                }
                            }
/* 296 */                   if (i2 != i9) {
/* 298 */                       truncateAt2 = TextUtils.TruncateAt.END;
                            } else if (i2 == 5) {
/* 310 */                       truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                            } else {
/* 314 */                       if (i2 != 4) {
/* 319 */                           o0oo0I00 = o0oo0I002;
/* 321 */                           i12 = i10;
/* 322 */                           i13 = i6;
/* 323 */                           truncateAt = null;
/* 325 */                           Oo0iOioO oo0iOioOI00000oIO = i0oilIol11i3.I00000oIO(i13, i21, truncateAt, i, i12, i4, i7, i11, charSequence3);
/* 329 */                           Layout layout2 = oo0iOioOI00000oIO.I0001Ioi1lo;
/* 335 */                           int i25 = i13;
/* 342 */                           if (Build.VERSION.SDK_INT >= 35 || i100o1l.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
/* 352 */                               i14 = 2;
/* 353 */                               i0oilIol11i = i0oilIol11i3;
/* 355 */                               i15 = i;
                                    } else {
/* 373 */                               int ellipsisStart = layout2.getEllipsisStart(0);
/* 418 */                               Oo0iOioO oo0iOioOI00000oIO2 = i0oilIol11i3.I00000oIO(i25, i21, truncateAt, i, i12, i4, i7, i11, TextUtils.concat(charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())));
/* 422 */                               i0oilIol11i = i0oilIol11i3;
/* 423 */                               i15 = i;
/* 424 */                               i14 = 2;
/* 425 */                               oo0iOioOI00000oIO = oo0iOioOI00000oIO2;
                                    }
/* 426 */                           int i26 = oo0iOioOI00000oIO.I000II;
/* 428 */                           if (i2 != i14) {
/* 496 */                               i16 = i15;
/* 497 */                               i0oilIol11i2 = i0oilIol11i;
/* 498 */                               i17 = i14;
                                    } else {
/* 438 */                               if (oo0iOioOI00000oIO.I00000oIO() > IOo0oO11ll1O.I000OOo1O(j) && i15 > 1) {
/* 443 */                                   int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 447 */                                   int i27 = 0;
                                            while (true) {
/* 448 */                                       if (i27 >= i26) {
                                                    break;
                                                }
/* 457 */                                       if (oo0iOioOI00000oIO.I0000oI00(i27) > iI000OOo1O) {
/* 459 */                                           i26 = i27;
                                                    break;
                                                }
/* 461 */                                       i27++;
                                            }
/* 464 */                                   if (i26 < 0 || i26 == i15) {
/* 486 */                                       i16 = i15;
/* 487 */                                       i0oilIol11i2 = i0oilIol11i;
/* 488 */                                       i17 = 2;
                                            } else {
/* 476 */                                       i16 = i15;
/* 477 */                                       i0oilIol11i2 = i0oilIol11i;
/* 480 */                                       i17 = 2;
/* 481 */                                       oo0iOioOI00000oIO = i0oilIol11i2.I00000oIO(i25, i21, truncateAt, i26 < 1 ? 1 : i26, i12, i4, i7, i11, i0oilIol11i.I0000O);
                                            }
/* 489 */                                   i0oilIol11i2.I0000Il00O = oo0iOioOI00000oIO;
/* 501 */                                   layout = oo0iOioOI00000oIO.I0001Ioi1lo;
/* 507 */                                   if (i0oilIol11i2.I00000oOI() || Float.isNaN(i0oilIol11i2.I0000oI00)) {
/* 749 */                                       i0oilIol11i2.I0000oI00 = oo0iOioOI00000oIO.I00000oIO();
                                            } else {
/* 524 */                                       float fI00000oIO = i0oilIol11i2.I0000oI00 - oo0iOioOI00000oIO.I00000oIO();
/* 525 */                                       O0oo0I00 o0oo0I003 = o0oo0I00;
/* 534 */                                       int i28 = o0oo0I003 != null ? o0oo0I003.I0000Il00O : O0oo0I00.I0000O.I0000Il00O;
/* 543 */                                       int i29 = o0oo0I003 != null ? o0oo0I003.I00000oOI : O0oo0I00.I0000O.I00000oOI;
/* 551 */                                       boolean z = (i29 & 1) > 0;
/* 562 */                                       boolean z2 = !oo0iOioOI00000oIO.I0000O && (i29 & 16) > 0;
/* 570 */                                       float fAbs = o0oo0I003 != null ? o0oo0I003.I00000oIO : O0oo0I00.I0000O.I00000oIO;
/* 576 */                                       if (fAbs == -1.0f) {
/* 617 */                                           fAbs = oo0iOioOI00000oIO.I00000oIO() != 0 ? Math.abs((oo0iOioOI00000oIO.I000II + (-1) != 0 || (fontMetricsInt = oo0iOioOI00000oIO.I000l1) == null) ? layout.getLineAscent(0) : fontMetricsInt.ascent) / oo0iOioOI00000oIO.I00000oIO() : 0.5f;
                                                }
/* 624 */                                       float fCeil = (float) Math.ceil(fI00000oIO);
/* 632 */                                       float fCeil2 = (float) Math.ceil(fCeil * fAbs);
/* 635 */                                       if (fI00000oIO <= 0.0f && (i28 == 1 || (z && z2 && i28 == 0))) {
/* 652 */                                           i0oilIol11i2.I0000oI00 = oo0iOioOI00000oIO.I00000oIO();
/* 654 */                                           i0oilIol11i2.I0001Ioi1lo = 0.0f;
                                                } else if (fI00000oIO < 0.0f && i28 == i17) {
/* 666 */                                           float f2 = z ? fCeil - fCeil2 : 0.0f;
/* 667 */                                           f = z2 ? fCeil2 : 0.0f;
/* 670 */                                           i0oilIol11i2.I0001Ioi1lo = f2;
/* 679 */                                           i0oilIol11i2.I0000oI00 = oo0iOioOI00000oIO.I00000oIO() + f2 + f;
                                                } else if (fI00000oIO < 0.0f) {
/* 701 */                                           float fMax = (z || z2 || fCeil2 >= 0.0f) ? 0.0f : Math.max(fCeil2 - fCeil, -fCeil2) + fCeil2;
/* 702 */                                           i0oilIol11i2.I0001Ioi1lo = 0.0f;
/* 711 */                                           i0oilIol11i2.I0000oI00 = oo0iOioOI00000oIO.I00000oIO() + 0.0f + fMax;
                                                } else {
/* 723 */                                           float fCeil3 = (float) Math.ceil((1.0f - fAbs) * fCeil);
/* 724 */                                           float f3 = fCeil - fCeil3;
/* 725 */                                           if (z) {
/* 727 */                                               f3 = 0.0f;
                                                    }
/* 728 */                                           f = z2 ? 0.0f : fCeil3;
/* 732 */                                           i0oilIol11i2.I0001Ioi1lo = f3;
/* 741 */                                           i0oilIol11i2.I0000oI00 = oo0iOioOI00000oIO.I00000oIO() + f3 + f;
                                                }
                                            }
/* 775 */                                   char c = ' ';
/* 793 */                                   i0oilIol11i2.I00000oIO.I00ioIO.I0000Il00O(oo0lloOiiIOI.I0000Il00O(), (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00) & 4294967295L) | (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00()) << 32), oo0lloOiiIOI.I00000oIO.I00000oIO.I0000Il00O());
/* 802 */                                   if (layout.getText() instanceof Spanned) {
/* 804 */                                       oioOII0IIoO1Arr = null;
                                            } else {
/* 811 */                                       Spanned spanned = (Spanned) layout.getText();
/* 828 */                                       if (spanned.nextSpanTransition(-1, spanned.length(), OioOII0IIoO1.class) != spanned.length()) {
/* 849 */                                           oioOII0IIoO1Arr = (OioOII0IIoO1[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), OioOII0IIoO1.class);
                                                }
                                            }
/* 851 */                                   if (oioOII0IIoO1Arr != null) {
/* 853 */                                       int length = oioOII0IIoO1Arr.length;
/* 854 */                                       int i30 = 0;
/* 855 */                                       while (i30 < length) {
/* 869 */                                           char c2 = c;
/* 887 */                                           oioOII0IIoO1Arr[i30].I00iiO.setValue(Ol0i1I.I00000oIO((Float.floatToRawIntBits(i0oilIol11i2.I0000oI00) & 4294967295L) | (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00()) << c2)));
/* 890 */                                           i30++;
/* 892 */                                           c = c2;
                                                }
                                            }
/* 895 */                                   charSequence = i0oilIol11i2.I0000O;
/* 899 */                                   if (charSequence instanceof Spanned) {
/* 901 */                                       list = Il01100l.I00iOIl;
                                            } else {
/* 906 */                                       Spanned spanned2 = (Spanned) charSequence;
/* 915 */                                       Object[] spans = spanned2.getSpans(0, charSequence.length(), OO1I0OOolIl0.class);
/* 922 */                                       ArrayList arrayList = new ArrayList(spans.length);
/* 927 */                                       for (Object obj : spans) {
/* 931 */                                           OO1I0OOolIl0 oO1I0OOolIl0 = (OO1I0OOolIl0) obj;
/* 933 */                                           int spanStart = spanned2.getSpanStart(oO1I0OOolIl0);
/* 937 */                                           int spanEnd = spanned2.getSpanEnd(oO1I0OOolIl0);
/* 943 */                                           int iI000II = i0oilIol11i2.I0000Il00O.I000II(spanStart);
/* 951 */                                           boolean z3 = iI000II >= i16;
/* 983 */                                           boolean z4 = i0oilIol11i2.I0000Il00O.I0001Ioi1lo.getEllipsisCount(iI000II) > 0 && spanEnd > i0oilIol11i2.I0000Il00O.I0001Ioi1lo.getEllipsisStart(iI000II) + i0oilIol11i2.I0000Il00O.I0001Ioi1lo.getLineStart(iI000II);
/* 994 */                                           boolean z5 = spanEnd > i0oilIol11i2.I0000Il00O.I0001Ioi1lo(iI000II);
/* 995 */                                           if (z4 || z5 || z3) {
/* 1205 */                                              oOo0IO = null;
                                                    } else {
/* 1017 */                                              boolean z6 = i0oilIol11i2.I0000Il00O.I0001Ioi1lo.getParagraphDirection(iI000II) == 1;
/* 1022 */                                              boolean zIsRtlCharAt = i0oilIol11i2.I0000Il00O.I0001Ioi1lo.isRtlCharAt(spanStart);
/* 1026 */                                              if (!z6 || zIsRtlCharAt) {
/* 1045 */                                                  if (z6 && zIsRtlCharAt) {
/* 1051 */                                                      fI000OOo1O = i0oilIol11i2.I0000Il00O.I000OiO(spanStart, false);
/* 1055 */                                                      iI0000Il00O2 = oO1I0OOolIl0.I0000Il00O();
                                                            } else {
/* 1063 */                                                      Oo0iOioO oo0iOioO = i0oilIol11i2.I0000Il00O;
/* 1065 */                                                      if (zIsRtlCharAt) {
/* 1067 */                                                          fI000OOo1O = oo0iOioO.I000OOo1O(spanStart, false);
/* 1071 */                                                          iI0000Il00O2 = oO1I0OOolIl0.I0000Il00O();
                                                                } else {
/* 1076 */                                                          fI000OiO = oo0iOioO.I000OiO(spanStart, false);
/* 1080 */                                                          iI0000Il00O = oO1I0OOolIl0.I0000Il00O();
                                                                }
                                                            }
/* 1060 */                                                  fI000OiO = fI000OOo1O - iI0000Il00O2;
/* 1085 */                                                  Oo0iOioO oo0iOioO2 = i0oilIol11i2.I0000Il00O;
                                                            switch (oO1I0OOolIl0.I00io1l) {
                                                                case 0:
/* 1184 */                                                          fI0000O = oo0iOioO2.I0000O(iI000II);
/* 1188 */                                                          iI00000oOI = oO1I0OOolIl0.I00000oOI();
/* 1137 */                                                          fI000O01llI0 = fI0000O - iI00000oOI;
/* 1201 */                                                          oOo0IO = new OOo0IO(fI000OiO, fI000O01llI0, fI000OOo1O, oO1I0OOolIl0.I00000oOI() + fI000O01llI0);
                                                                    break;
                                                                case 1:
/* 1179 */                                                          fI000O01llI0 = oo0iOioO2.I000O01llI0(iI000II);
/* 1201 */                                                          oOo0IO = new OOo0IO(fI000OiO, fI000O01llI0, fI000OOo1O, oO1I0OOolIl0.I00000oOI() + fI000O01llI0);
                                                                    break;
                                                                case 2:
/* 1170 */                                                          fI0000O = oo0iOioO2.I0000oI00(iI000II);
/* 1174 */                                                          iI00000oOI = oO1I0OOolIl0.I00000oOI();
/* 1137 */                                                          fI000O01llI0 = fI0000O - iI00000oOI;
/* 1201 */                                                          oOo0IO = new OOo0IO(fI000OiO, fI000O01llI0, fI000OOo1O, oO1I0OOolIl0.I00000oOI() + fI000O01llI0);
                                                                    break;
                                                                case 3:
/* 1168 */                                                          fI000O01llI0 = ((oo0iOioO2.I0000oI00(iI000II) + oo0iOioO2.I000O01llI0(iI000II)) - oO1I0OOolIl0.I00000oOI()) / 2.0f;
/* 1201 */                                                          oOo0IO = new OOo0IO(fI000OiO, fI000O01llI0, fI000OOo1O, oO1I0OOolIl0.I00000oOI() + fI000O01llI0);
                                                                    break;
                                                                case 4:
/* 1143 */                                                          fI00000oOI = oO1I0OOolIl0.I00000oIO().ascent;
/* 1146 */                                                          fI0000O2 = oo0iOioO2.I0000O(iI000II);
/* 1118 */                                                          fI000O01llI0 = fI0000O2 + fI00000oOI;
/* 1201 */                                                          oOo0IO = new OOo0IO(fI000OiO, fI000O01llI0, fI000OOo1O, oO1I0OOolIl0.I00000oOI() + fI000O01llI0);
                                                                    break;
                                                                case 5:
/* 1131 */                                                          fI0000O = oo0iOioO2.I0000O(iI000II) + oO1I0OOolIl0.I00000oIO().descent;
/* 1132 */                                                          iI00000oOI = oO1I0OOolIl0.I00000oOI();
/* 1137 */                                                          fI000O01llI0 = fI0000O - iI00000oOI;
/* 1201 */                                                          oOo0IO = new OOo0IO(fI000OiO, fI000O01llI0, fI000OOo1O, oO1I0OOolIl0.I00000oOI() + fI000O01llI0);
                                                                    break;
                                                                case 6:
/* 1098 */                                                          Paint.FontMetricsInt fontMetricsIntI00000oIO = oO1I0OOolIl0.I00000oIO();
/* 1112 */                                                          fI00000oOI = ((fontMetricsIntI00000oIO.ascent + fontMetricsIntI00000oIO.descent) - oO1I0OOolIl0.I00000oOI()) / i17;
/* 1114 */                                                          fI0000O2 = oo0iOioO2.I0000O(iI000II);
/* 1118 */                                                          fI000O01llI0 = fI0000O2 + fI00000oOI;
/* 1201 */                                                          oOo0IO = new OOo0IO(fI000OiO, fI000O01llI0, fI000OOo1O, oO1I0OOolIl0.I00000oOI() + fI000O01llI0);
                                                                    break;
                                                                default:
/* 1094 */                                                          I000II.I001IO000("unexpected verticalAlignment");
/* 53 */                                                            return null;
                                                            }
                                                        } else {
/* 1033 */                                                  fI000OiO = i0oilIol11i2.I0000Il00O.I000OOo1O(spanStart, false);
/* 1037 */                                                  iI0000Il00O = oO1I0OOolIl0.I0000Il00O();
                                                        }
/* 1042 */                                              fI000OOo1O = iI0000Il00O + fI000OiO;
/* 1085 */                                              Oo0iOioO oo0iOioO22 = i0oilIol11i2.I0000Il00O;
                                                        switch (oO1I0OOolIl0.I00io1l) {
                                                        }
                                                    }
/* 1207 */                                          arrayList.add(oOo0IO);
                                                }
/* 1214 */                                      list = arrayList;
                                            }
/* 1215 */                                  i0oilIol11i2.I000II = list;
/* 1217 */                                  VarHandle.storeStoreFence();
/* 1220 */                                  return i0oilIol11i2;
                                        }
/* 492 */                               i16 = i15;
/* 493 */                               i0oilIol11i2 = i0oilIol11i;
/* 494 */                               i17 = 2;
                                    }
/* 499 */                           i0oilIol11i2.I0000Il00O = oo0iOioOI00000oIO;
/* 501 */                           layout = oo0iOioOI00000oIO.I0001Ioi1lo;
/* 507 */                           if (i0oilIol11i2.I00000oOI()) {
/* 749 */                               i0oilIol11i2.I0000oI00 = oo0iOioOI00000oIO.I00000oIO();
                                    }
/* 775 */                           char c3 = ' ';
/* 793 */                           i0oilIol11i2.I00000oIO.I00ioIO.I0000Il00O(oo0lloOiiIOI.I0000Il00O(), (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00) & 4294967295L) | (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00()) << 32), oo0lloOiiIOI.I00000oIO.I00000oIO.I0000Il00O());
/* 802 */                           if (layout.getText() instanceof Spanned) {
                                    }
/* 851 */                           if (oioOII0IIoO1Arr != null) {
                                    }
/* 895 */                           charSequence = i0oilIol11i2.I0000O;
/* 899 */                           if (charSequence instanceof Spanned) {
                                    }
/* 1215 */                          i0oilIol11i2.I000II = list;
/* 1217 */                          VarHandle.storeStoreFence();
/* 1220 */                          return i0oilIol11i2;
                                }
/* 316 */                       truncateAt2 = TextUtils.TruncateAt.START;
                            }
/* 300 */                   o0oo0I00 = o0oo0I002;
/* 302 */                   i12 = i10;
/* 303 */                   i13 = i6;
/* 304 */                   truncateAt = truncateAt2;
/* 325 */                   Oo0iOioO oo0iOioOI00000oIO3 = i0oilIol11i3.I00000oIO(i13, i21, truncateAt, i, i12, i4, i7, i11, charSequence3);
/* 329 */                   Layout layout22 = oo0iOioOI00000oIO3.I0001Ioi1lo;
/* 335 */                   int i252 = i13;
/* 342 */                   if (Build.VERSION.SDK_INT >= 35) {
/* 352 */                       i14 = 2;
/* 353 */                       i0oilIol11i = i0oilIol11i3;
/* 355 */                       i15 = i;
                            }
/* 426 */                   int i262 = oo0iOioOI00000oIO3.I000II;
/* 428 */                   if (i2 != i14) {
                            }
/* 499 */                   i0oilIol11i2.I0000Il00O = oo0iOioOI00000oIO3;
/* 501 */                   layout = oo0iOioOI00000oIO3.I0001Ioi1lo;
/* 507 */                   if (i0oilIol11i2.I00000oOI()) {
                            }
/* 775 */                   char c32 = ' ';
/* 793 */                   i0oilIol11i2.I00000oIO.I00ioIO.I0000Il00O(oo0lloOiiIOI.I0000Il00O(), (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00) & 4294967295L) | (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00()) << 32), oo0lloOiiIOI.I00000oIO.I00000oIO.I0000Il00O());
/* 802 */                   if (layout.getText() instanceof Spanned) {
                            }
/* 851 */                   if (oioOII0IIoO1Arr != null) {
                            }
/* 895 */                   charSequence = i0oilIol11i2.I0000O;
/* 899 */                   if (charSequence instanceof Spanned) {
                            }
/* 1215 */                  i0oilIol11i2.I000II = list;
/* 1217 */                  VarHandle.storeStoreFence();
/* 1220 */                  return i0oilIol11i2;
                        }
/* 237 */               i4 = 1;
                    }
/* 248 */           i5 = (i23 >> 8) & 255;
/* 250 */           if (i5 != 1) {
                    }
/* 273 */           O0oo0I00 o0oo0I0022 = oIoioI0OIiI.I0001Ioi1lo;
/* 277 */           i8 = (i23 >> 16) & 255;
/* 280 */           if (i8 != 1) {
                    }
/* 296 */           if (i2 != i9) {
                    }
/* 300 */           o0oo0I00 = o0oo0I0022;
/* 302 */           i12 = i10;
/* 303 */           i13 = i6;
/* 304 */           truncateAt = truncateAt2;
/* 325 */           Oo0iOioO oo0iOioOI00000oIO32 = i0oilIol11i3.I00000oIO(i13, i21, truncateAt, i, i12, i4, i7, i11, charSequence3);
/* 329 */           Layout layout222 = oo0iOioOI00000oIO32.I0001Ioi1lo;
/* 335 */           int i2522 = i13;
/* 342 */           if (Build.VERSION.SDK_INT >= 35) {
                    }
/* 426 */           int i2622 = oo0iOioOI00000oIO32.I000II;
/* 428 */           if (i2 != i14) {
                    }
/* 499 */           i0oilIol11i2.I0000Il00O = oo0iOioOI00000oIO32;
/* 501 */           layout = oo0iOioOI00000oIO32.I0001Ioi1lo;
/* 507 */           if (i0oilIol11i2.I00000oOI()) {
                    }
/* 775 */           char c322 = ' ';
/* 793 */           i0oilIol11i2.I00000oIO.I00ioIO.I0000Il00O(oo0lloOiiIOI.I0000Il00O(), (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00) & 4294967295L) | (Float.floatToRawIntBits(i0oilIol11i2.I0000oI00()) << 32), oo0lloOiiIOI.I00000oIO.I00000oIO.I0000Il00O());
/* 802 */           if (layout.getText() instanceof Spanned) {
                    }
/* 851 */           if (oioOII0IIoO1Arr != null) {
                    }
/* 895 */           charSequence = i0oilIol11i2.I0000O;
/* 899 */           if (charSequence instanceof Spanned) {
                    }
/* 1215 */          i0oilIol11i2.I000II = list;
/* 1217 */          VarHandle.storeStoreFence();
/* 1220 */          return i0oilIol11i2;
                }
            }
