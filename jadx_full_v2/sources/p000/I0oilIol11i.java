            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.os.Trace;
            import android.text.BoringLayout;
            import android.text.GraphemeClusterSegmentFinder;
            import android.text.Layout;
            import android.text.SegmentFinder;
            import android.text.SpannableString;
            import android.text.Spanned;
            import android.text.StaticLayout;
            import android.text.TextDirectionHeuristic;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I0oilIol11i {
                public I0ol0iioI I00000oIO;
                public long I00000oOI;
                public Oo0iOioO I0000Il00O;
                public CharSequence I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;
                public List I000II;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0207  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x020c  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x020e  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0216  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x024e  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x030a  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x030f  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x018a  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
                /* JADX WARN: Type inference failed for: r9v11 */
                /* JADX WARN: Type inference failed for: r9v6 */
                /* JADX WARN: Type inference failed for: r9v7, types: [android.graphics.Paint$FontMetricsInt] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Oo0iOioO I00000oIO(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
                    O0oo10OIOO11[] o0oo10OIOO11Arr;
                    int i8;
                    Oo0iOioO oo0iOioO;
                    TextDirectionHeuristic textDirectionHeuristic;
                    Layout layoutI00000oIO;
                    int i9;
                    boolean z;
                    long jI00000oIO;
                    int i10;
                    long jI00000oIO2;
                    long jI00000oIO3;
                    char c;
                    int i11;
                    int iI0000oI00;
                    ?? r9;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    O0oo10OIOO11 o0oo10OIOO11;
                    O0oo10OIOO11 o0oo10OIOO112;
                    OO1Il0I1 oO1Il0I1;
/* 5 */             float fI0000oI00 = I0000oI00();
/* 11 */            I0ol0iioI i0ol0iioI = this.I00000oIO;
/* 13 */            I100o1l i100o1l = i0ol0iioI.I00ioIO;
/* 15 */            int i12 = i0ol0iioI.I00lli11;
/* 17 */            O0iOlIOIl0 o0iOlIOIl0 = i0ol0iioI.I00l0OO0IO;
/* 19 */            Oo0lloOiiIOI oo0lloOiiIOI = i0ol0iioI.I00iiI;
/* 21 */            I0oillooIio1 i0oillooIio1 = I0oioi.I00000oIO;
/* 23 */            OO1Oi01o0 oO1Oi01o0 = oo0lloOiiIOI.I0000Il00O;
/* 35 */            boolean z5 = (oO1Oi01o0 == null || (oO1Il0I1 = oO1Oi01o0.I00000oOI) == null) ? false : oO1Il0I1.I00000oIO;
/* 38 */            Oo0iOioO oo0iOioO2 = new Oo0iOioO();
/* 41 */            oo0iOioO2.I00000oIO = i100o1l;
/* 45 */            oo0iOioO2.I00000oOI = truncateAt;
/* 47 */            oo0iOioO2.I0000Il00O = z5;
/* 54 */            oo0iOioO2.I000oI1ioi = new Rect();
/* 56 */            int length = charSequence.length();
/* 60 */            TextDirectionHeuristic textDirectionHeuristicI00000oOI = Oo0iliIolI.I00000oOI(i12);
/* 64 */            Layout.Alignment alignment = OloOi1iI.I00000oIO;
/* 66 */            boolean z6 = true;
/* 96 */            Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : OloOi1iI.I00000oOI : OloOi1iI.I00000oIO : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
/* 117 */           boolean z7 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, I1oi100lI.class) < length;
/* 120 */           Trace.beginSection("TextLayout:initLayout");
                    try {
/* 126 */               if (!o0iOlIOIl0.I000II) {
/* 142 */                   o0iOlIOIl0.I0001Ioi1lo = BoringLayout.isBoring(o0iOlIOIl0.I00000oIO, o0iOlIOIl0.I00000oOI, Oo0iliIolI.I00000oOI(o0iOlIOIl0.I0000Il00O), true, null);
/* 144 */                   o0iOlIOIl0.I000II = true;
                        }
/* 146 */               BoringLayout.Metrics metrics = o0iOlIOIl0.I0001Ioi1lo;
                        double d = fI0000oI00;
/* 156 */               int iCeil = (int) Math.ceil(d);
/* 157 */               if (metrics == null || o0iOlIOIl0.I00000oOI() > fI0000oI00 || z7) {
/* 209 */                   o0oo10OIOO11Arr = null;
/* 222 */                   int iCeil2 = (int) Math.ceil(d);
/* 227 */                   i8 = i3;
/* 236 */                   boolean z8 = z5;
/* 237 */                   oo0iOioO = oo0iOioO2;
/* 238 */                   textDirectionHeuristic = textDirectionHeuristicI00000oOI;
/* 249 */                   z5 = z8;
/* 245 */                   layoutI00000oIO = lOOOliiiOOi.I00000oIO(charSequence, i100o1l, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i8, truncateAt, iCeil2, i2, z8, i5, i6, i7, i4);
/* 251 */                   z6 = false;
                        } else {
/* 169 */                   if (iCeil < 0) {
/* 174 */                       Ioliol.I00000oIO("negative width");
                            }
/* 177 */                   if (iCeil < 0) {
/* 182 */                       Ioliol.I00000oIO("negative ellipsized width");
                            }
/* 196 */                   o0oo10OIOO11Arr = null;
/* 198 */                   layoutI00000oIO = new BoringLayout(charSequence, i100o1l, iCeil, alignment2, 1.0f, 0.0f, metrics, z5, truncateAt, iCeil, true);
/* 201 */                   i8 = i3;
/* 203 */                   oo0iOioO = oo0iOioO2;
/* 204 */                   textDirectionHeuristic = textDirectionHeuristicI00000oOI;
                        }
/* 252 */               oo0iOioO.I0001Ioi1lo = layoutI00000oIO;
/* 254 */               Trace.endSection();
/* 261 */               int iMin = Math.min(layoutI00000oIO.getLineCount(), i8);
/* 265 */               oo0iOioO.I000II = iMin;
                        int i13 = iMin - 1;
/* 290 */               oo0iOioO.I0000O = iMin >= i8 && (layoutI00000oIO.getEllipsisCount(i13) > 0 || layoutI00000oIO.getLineEnd(i13) != charSequence.length());
/* 348 */               O0oo10OIOO11[] o0oo10OIOO11Arr2 = ((layoutI00000oIO.getText() instanceof Spanned) && (lOO1lIo0.I00000oIO((Spanned) layoutI00000oIO.getText(), O0oo10OIOO11.class) || layoutI00000oIO.getText().length() <= 0)) ? (O0oo10OIOO11[]) ((Spanned) layoutI00000oIO.getText()).getSpans(0, layoutI00000oIO.getText().length(), O0oo10OIOO11.class) : o0oo10OIOO11Arr;
/* 350 */               oo0iOioO.I000o00OoI0I = o0oo10OIOO11Arr2;
/* 352 */               if (o0oo10OIOO11Arr2 != null && (o0oo10OIOO112 = (O0oo10OIOO11) I1IoiO1l.I001i1O0Ol(o0oo10OIOO11Arr2)) != null && o0oo10OIOO112.I00iiO) {
/* 368 */                   i9 = 2;
/* 369 */                   z = o0oo10OIOO112.I00ilO0 == 2;
/* 395 */                   boolean z9 = o0oo10OIOO11Arr2 == null && (o0oo10OIOO11 = (O0oo10OIOO11) I1IoiO1l.I001i1O0Ol(o0oo10OIOO11Arr2)) != null && o0oo10OIOO11.I00iio && o0oo10OIOO11.I00ilO0 == i9;
/* 396 */                   char c2 = ' ';
/* 403 */                   if (z || !z9) {
/* 414 */                       jI00000oIO = Oo0iliIolI.I00000oOI;
/* 416 */                       if (z5) {
/* 437 */                           i10 = 1;
/* 509 */                           jI00000oIO2 = jI00000oIO;
/* 529 */                           jI00000oIO3 = Oo0iliIolI.I00000oIO(z ? 0 : (int) (jI00000oIO2 >> 32), z9 ? 0 : (int) (jI00000oIO2 & 4294967295L));
                                } else {
/* 435 */                           if (!(z6 ? ((BoringLayout) layoutI00000oIO).isFallbackLineSpacingEnabled() : ((StaticLayout) layoutI00000oIO).isFallbackLineSpacingEnabled())) {
/* 439 */                               TextPaint paint = layoutI00000oIO.getPaint();
/* 443 */                               CharSequence text = layoutI00000oIO.getText();
/* 456 */                               Rect rectI00000oIO = l1o1i1oliIi.I00000oIO(paint, text, layoutI00000oIO.getLineStart(0), layoutI00000oIO.getLineEnd(0));
/* 460 */                               int lineAscent = layoutI00000oIO.getLineAscent(0);
/* 464 */                               int i14 = rectI00000oIO.top;
/* 471 */                               int topPadding = i14 < lineAscent ? lineAscent - i14 : layoutI00000oIO.getTopPadding();
/* 469 */                               i10 = 1;
/* 476 */                               if (iMin != 1) {
/* 487 */                                   rectI00000oIO = l1o1i1oliIi.I00000oIO(paint, text, layoutI00000oIO.getLineStart(i13), layoutI00000oIO.getLineEnd(i13));
                                        }
/* 491 */                               int lineDescent = layoutI00000oIO.getLineDescent(i13);
/* 495 */                               int i15 = rectI00000oIO.bottom;
/* 501 */                               int bottomPadding = i15 > lineDescent ? i15 - lineDescent : layoutI00000oIO.getBottomPadding();
/* 505 */                               if (topPadding != 0 || bottomPadding != 0) {
/* 512 */                                   jI00000oIO2 = Oo0iliIolI.I00000oIO(topPadding, bottomPadding);
                                        }
/* 529 */                               jI00000oIO3 = Oo0iliIolI.I00000oIO(z ? 0 : (int) (jI00000oIO2 >> 32), z9 ? 0 : (int) (jI00000oIO2 & 4294967295L));
                                    }
/* 509 */                           jI00000oIO2 = jI00000oIO;
/* 529 */                           jI00000oIO3 = Oo0iliIolI.I00000oIO(z ? 0 : (int) (jI00000oIO2 >> 32), z9 ? 0 : (int) (jI00000oIO2 & 4294967295L));
                                }
                            } else {
/* 407 */                       jI00000oIO3 = Oo0iliIolI.I00000oOI;
/* 409 */                       jI00000oIO = jI00000oIO3;
/* 411 */                       i10 = 1;
                            }
/* 533 */                   if (o0oo10OIOO11Arr2 == null) {
/* 535 */                       int length2 = o0oo10OIOO11Arr2.length;
/* 536 */                       int i16 = 0;
/* 537 */                       int iMax = 0;
/* 538 */                       int iMax2 = 0;
/* 539 */                       while (i16 < length2) {
/* 541 */                           O0oo10OIOO11 o0oo10OIOO113 = o0oo10OIOO11Arr2[i16];
/* 543 */                           char c3 = c2;
/* 545 */                           int i17 = o0oo10OIOO113.I00li1OI;
/* 547 */                           if (i17 < 0) {
/* 553 */                               iMax = Math.max(iMax, Math.abs(i17));
                                    }
/* 557 */                           int i18 = o0oo10OIOO113.I00ll1;
/* 559 */                           if (i18 < 0) {
/* 565 */                               iMax2 = Math.max(iMax, Math.abs(i18));
                                    }
/* 570 */                           i16++;
/* 572 */                           c2 = c3;
                                }
/* 575 */                       c = c2;
/* 586 */                       jI00000oIO = (iMax == 0 && iMax2 == 0) ? Oo0iliIolI.I00000oOI : Oo0iliIolI.I00000oIO(iMax, iMax2);
                            } else {
/* 591 */                       c = ' ';
                            }
/* 603 */                   oo0iOioO.I000O01llI0 = Math.max((int) (jI00000oIO3 >> c), (int) (jI00000oIO >> c));
/* 615 */                   oo0iOioO.I000OOo1O = Math.max((int) (jI00000oIO3 & 4294967295L), (int) (jI00000oIO & 4294967295L));
/* 617 */                   TextPaint textPaint = oo0iOioO.I00000oIO;
/* 619 */                   O0oo10OIOO11[] o0oo10OIOO11Arr3 = oo0iOioO.I000o00OoI0I;
/* 623 */                   i11 = oo0iOioO.I000II - i10;
/* 632 */                   if (layoutI00000oIO.getLineStart(i11) == layoutI00000oIO.getLineEnd(i11) || o0oo10OIOO11Arr3 == null || o0oo10OIOO11Arr3.length == 0) {
/* 779 */                       iI0000oI00 = 0;
/* 780 */                       r9 = o0oo10OIOO11Arr;
                            } else {
/* 645 */                       SpannableString spannableString = new SpannableString("\u200b");
/* 652 */                       O0oo10OIOO11 o0oo10OIOO114 = (O0oo10OIOO11) I1IoiO1l.I001IO000(o0oo10OIOO11Arr3);
/* 654 */                       int length3 = spannableString.length();
/* 658 */                       if (i11 == 0 || !(z4 = o0oo10OIOO114.I00iio)) {
/* 667 */                           z2 = o0oo10OIOO114.I00iio;
/* 669 */                           z3 = z2;
                                } else {
/* 664 */                           z3 = z4;
/* 665 */                           z2 = false;
                                }
/* 704 */                       spannableString.setSpan(new O0oo10OIOO11(o0oo10OIOO114.I00iOIl, length3, z2, z3, o0oo10OIOO114.I00ilI0I1, o0oo10OIOO114.I00ilO0), 0, spannableString.length(), 33);
/* 744 */                       StaticLayout staticLayoutI00000oIO = lOOOliiiOOi.I00000oIO(spannableString, textPaint, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, O0iOOlOi0l0i.I00000oIO, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, oo0iOioO.I0000Il00O, 0, 0, 0, 0);
/* 750 */                       Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
/* 753 */                       iI0000oI00 = 0;
/* 758 */                       fontMetricsInt.ascent = staticLayoutI00000oIO.getLineAscent(0);
/* 764 */                       fontMetricsInt.descent = staticLayoutI00000oIO.getLineDescent(0);
/* 770 */                       fontMetricsInt.top = staticLayoutI00000oIO.getLineTop(0);
/* 776 */                       fontMetricsInt.bottom = staticLayoutI00000oIO.getLineBottom(0);
                                r9 = fontMetricsInt;
                            }
/* 782 */                   if (r9 != 0) {
/* 796 */                       iI0000oI00 = ((Paint.FontMetricsInt) r9).bottom - ((int) (oo0iOioO.I0000oI00(i13) - oo0iOioO.I000O01llI0(i13)));
                            }
/* 798 */                   oo0iOioO.I000lI = iI0000oI00;
/* 800 */                   oo0iOioO.I000l1 = r9;
/* 810 */                   oo0iOioO.I000OiO = ioOilOo1.I00000oIO(layoutI00000oIO, i13, layoutI00000oIO.getPaint());
/* 820 */                   oo0iOioO.I000iOII = ioOilOo1.I00000oOI(layoutI00000oIO, i13, layoutI00000oIO.getPaint());
/* 822 */                   VarHandle.storeStoreFence();
/* 825 */                   return oo0iOioO;
                        }
/* 373 */               i9 = 2;
/* 395 */               if (o0oo10OIOO11Arr2 == null) {
                        }
/* 396 */               char c22 = ' ';
/* 403 */               if (z) {
/* 414 */                   jI00000oIO = Oo0iliIolI.I00000oOI;
/* 416 */                   if (z5) {
                            }
                        }
/* 533 */               if (o0oo10OIOO11Arr2 == null) {
                        }
/* 603 */               oo0iOioO.I000O01llI0 = Math.max((int) (jI00000oIO3 >> c), (int) (jI00000oIO >> c));
/* 615 */               oo0iOioO.I000OOo1O = Math.max((int) (jI00000oIO3 & 4294967295L), (int) (jI00000oIO & 4294967295L));
/* 617 */               TextPaint textPaint2 = oo0iOioO.I00000oIO;
/* 619 */               O0oo10OIOO11[] o0oo10OIOO11Arr32 = oo0iOioO.I000o00OoI0I;
/* 623 */               i11 = oo0iOioO.I000II - i10;
/* 632 */               if (layoutI00000oIO.getLineStart(i11) == layoutI00000oIO.getLineEnd(i11)) {
/* 779 */                   iI0000oI00 = 0;
/* 780 */                   r9 = o0oo10OIOO11Arr;
                        }
/* 782 */               if (r9 != 0) {
                        }
/* 798 */               oo0iOioO.I000lI = iI0000oI00;
/* 800 */               oo0iOioO.I000l1 = r9;
/* 810 */               oo0iOioO.I000OiO = ioOilOo1.I00000oIO(layoutI00000oIO, i13, layoutI00000oIO.getPaint());
/* 820 */               oo0iOioO.I000iOII = ioOilOo1.I00000oOI(layoutI00000oIO, i13, layoutI00000oIO.getPaint());
/* 822 */               VarHandle.storeStoreFence();
/* 825 */               return oo0iOioO;
                    } catch (Throwable th) {
/* 827 */               Trace.endSection();
/* 1821 */              throw th;
                    }
                }

                public final boolean I00000oOI() {
/* 1 */             I0ol0iioI i0ol0iioI = this.I00000oIO;
                    return (i0ol0iioI.I00io1l || i0ol0iioI.I00000oIO() || i0ol0iioI.I00iiI.I00000oIO.I000OOo1O != null) ? false : true;
                }

                public final float I0000Il00O(int i) {
/* 5 */             if (I00000oOI()) {
/* 7 */                 return this.I0000oI00;
                    }
/* 10 */            Oo0iOioO oo0iOioO = this.I0000Il00O;
/* 20 */            return oo0iOioO.I0000oI00(i) - oo0iOioO.I000O01llI0(i);
                }

                public final long I0000O(OOo0IO oOo0IO, int i, OIiilo1Ool0o oIiilo1Ool0o) {
                    SegmentFinder graphemeClusterSegmentFinder;
/* 1 */             Oo0iOioO oo0iOioO = this.I0000Il00O;
/* 3 */             RectF rectFI00000oOI = lIiool1i00.I00000oOI(oOo0IO);
/* 15 */            boolean z = i != 0 && i == 1;
/* 18 */            int i2 = 2;
/* 19 */            I00oooO i00oooO = new I00oooO(i2);
/* 22 */            i00oooO.I00iiI = oIiilo1Ool0o;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            Layout layout = oo0iOioO.I0001Ioi1lo;
/* 29 */            if (z) {
/* 33 */                CharSequence text = layout.getText();
/* 37 */                I1I1OO00o1o i1I1OO00o1oI000iOII = oo0iOioO.I000iOII();
/* 41 */                OoIol00Ool ooIol00Ool = new OoIol00Ool(i2);
/* 44 */                ooIol00Ool.I00iiI = text;
/* 46 */                ooIol00Ool.I00iiO = i1I1OO00o1oI000iOII;
/* 48 */                VarHandle.storeStoreFence();
/* 53 */                graphemeClusterSegmentFinder = new I11OOoI(ooIol00Ool);
                    } else {
/* 65 */                graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(layout.getText(), oo0iOioO.I00000oIO);
                    }
/* 71 */            I0oOI0i i0oOI0i = new I0oOI0i();
/* 74 */            i0oOI0i.I00000oIO = i00oooO;
/* 76 */            VarHandle.storeStoreFence();
/* 79 */            int[] rangeForRect = layout.getRangeForRect(rectFI00000oOI, graphemeClusterSegmentFinder, i0oOI0i);
                    return rangeForRect == null ? Oo0lI00l.I00000oOI : lOliOi0Oi.I00000oIO(rangeForRect[0], rangeForRect[1]);
                }

                public final float I0000oI00() {
/* 7 */             return IOo0oO11ll1O.I000OiO(this.I00000oOI);
                }

                public final void I0001Ioi1lo(IIolOo iIolOo) {
/* 1 */             Canvas canvas = I0lO01i00oi.I00000oIO;
/* 5 */             Canvas canvas2 = ((I0lIooIo1) iIolOo).I00000oIO;
/* 7 */             Oo0iOioO oo0iOioO = this.I0000Il00O;
/* 12 */            if (oo0iOioO.I0000O) {
/* 14 */                canvas2.save();
/* 23 */                canvas2.clipRect(0.0f, 0.0f, I0000oI00(), this.I0000oI00);
                    }
/* 26 */            int i = oo0iOioO.I000O01llI0;
/* 34 */            if (canvas2.getClipBounds(oo0iOioO.I000oI1ioi)) {
/* 37 */                if (i != 0) {
/* 40 */                    canvas2.translate(0.0f, i);
                        }
/* 43 */                ThreadLocal threadLocal = Oo0iliIolI.I00000oIO;
/* 45 */                Object oloOioO0 = threadLocal.get();
/* 49 */                if (oloOioO0 == null) {
/* 53 */                    oloOioO0 = new OloOioO0();
/* 56 */                    threadLocal.set(oloOioO0);
                        }
/* 59 */                OloOioO0 oloOioO02 = (OloOioO0) oloOioO0;
/* 61 */                oloOioO02.I00000oIO = canvas2;
                        try {
/* 66 */                    oo0iOioO.I0001Ioi1lo.draw(oloOioO02);
/* 71 */                    if (i != 0) {
/* 77 */                        canvas2.translate(0.0f, (-1.0f) * i);
                            }
                        } finally {
/* 89 */                    oloOioO02.I00000oIO = null;
                        }
                    }
/* 82 */            if (oo0iOioO.I0000O) {
/* 84 */                canvas2.restore();
                    }
                }

                public final void I000II(IIolOo iIolOo, long j, OioOII0oI oioOII0oI, OlooIOI0O olooIOI0O, Iilloo0IOoIo iilloo0IOoIo, int i) {
/* 3 */             I100o1l i100o1l = this.I00000oIO.I00ioIO;
/* 5 */             int i2 = i100o1l.I0000Il00O;
/* 7 */             i100o1l.I0000O(j);
/* 10 */            i100o1l.I0001Ioi1lo(oioOII0oI);
/* 13 */            i100o1l.I000II(olooIOI0O);
/* 16 */            i100o1l.I0000oI00(iilloo0IOoIo);
/* 19 */            i100o1l.I00000oOI(i);
/* 22 */            float f = this.I0001Ioi1lo;
/* 27 */            if (f == 0.0f) {
/* 29 */                I0001Ioi1lo(iIolOo);
                    } else {
/* 33 */                iIolOo.I000II();
/* 36 */                iIolOo.I000o00OoI0I(0.0f, f);
/* 39 */                I0001Ioi1lo(iIolOo);
/* 42 */                iIolOo.I00100l0();
                    }
/* 45 */            i100o1l.I00000oOI(i2);
                }

                public final void I000O01llI0(IIolOo iIolOo, III11l1I iII11l1I, float f, OioOII0oI oioOII0oI, OlooIOI0O olooIOI0O, Iilloo0IOoIo iilloo0IOoIo) {
/* 3 */             I100o1l i100o1l = this.I00000oIO.I00ioIO;
/* 5 */             int i = i100o1l.I0000Il00O;
/* 7 */             float fI0000oI00 = I0000oI00();
/* 11 */            float f2 = this.I0000oI00;
/* 33 */            i100o1l.I0000Il00O(iII11l1I, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(fI0000oI00) << 32), f);
/* 36 */            i100o1l.I0001Ioi1lo(oioOII0oI);
/* 39 */            i100o1l.I000II(olooIOI0O);
/* 42 */            i100o1l.I0000oI00(iilloo0IOoIo);
/* 46 */            i100o1l.I00000oOI(3);
/* 49 */            float f3 = this.I0001Ioi1lo;
/* 54 */            if (f3 == 0.0f) {
/* 56 */                I0001Ioi1lo(iIolOo);
                    } else {
/* 60 */                iIolOo.I000II();
/* 63 */                iIolOo.I000o00OoI0I(0.0f, f3);
/* 66 */                I0001Ioi1lo(iIolOo);
/* 69 */                iIolOo.I00100l0();
                    }
/* 72 */            i100o1l.I00000oOI(i);
                }
            }
