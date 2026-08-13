            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.XmlResourceParser;
            import android.graphics.Color;
            import android.util.AttributeSet;
            import android.util.StateSet;
            import android.util.TypedValue;
            import android.util.Xml;
            import com.box.gallery.R;
            import java.io.IOException;
            import java.lang.reflect.Array;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
            public abstract class IOOlOlo {
                public static final ThreadLocal I00000oIO = new ThreadLocal();

                public static ColorStateList I00000oIO(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
                    int next;
/* 1 */             AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
/* 13 */            do {
/* 5 */                 next = xmlResourceParser.next();
/* 10 */                if (next == 2) {
                            break;
                        }
/* 13 */            } while (next != 1);
/* 16 */            if (next == 2) {
/* 18 */                return I00000oOI(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
                    }
/* 98 */            throw new XmlPullParserException("No start tag found");
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
                /* JADX WARN: Type inference failed for: r0v0 */
                /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v46 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v4 */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r9v19 */
                /* JADX WARN: Type inference failed for: r9v20 */
                /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static ColorStateList I00000oOI(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
                    int depth;
                    int color;
                    int i;
                    int[] iArr;
                    int i2;
                    int iI00000oIO;
                    float f;
                    int i3;
                    float fCbrt;
/* 1 */             ?? r0 = resources;
/* 3 */             AttributeSet attributeSet2 = attributeSet;
/* 5 */             Resources.Theme theme2 = theme;
/* 7 */             String name = xmlPullParser.getName();
/* 17 */            if (!name.equals("selector")) {
/* 1182 */              throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
                    }
/* 23 */            boolean z = 1;
/* 24 */            int depth2 = xmlPullParser.getDepth() + 1;
/* 27 */            int[][] iArr2 = new int[20][];
/* 29 */            int[] iArr3 = new int[20];
/* 31 */            int i4 = 0;
/* 32 */            int i5 = 0;
                    while (true) {
/* 33 */                int next = xmlPullParser.next();
/* 37 */                if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                            break;
                        }
/* 49 */                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
/* 71 */                    int[] iArr4 = OOilIO.I00000oIO;
/* 80 */                    ?? ObtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i4, i4);
/* 85 */                    int resourceId = ObtainAttributes.getResourceId(i4, -1);
/* 92 */                    if (resourceId != -1) {
/* 94 */                        ThreadLocal threadLocal = I00000oIO;
/* 100 */                       TypedValue typedValue = (TypedValue) threadLocal.get();
/* 102 */                       if (typedValue == null) {
/* 106 */                           typedValue = new TypedValue();
/* 109 */                           threadLocal.set(typedValue);
                                }
/* 112 */                       r0.getValue(resourceId, typedValue, z);
/* 115 */                       int i6 = typedValue.type;
/* 119 */                       if (i6 < 28 || i6 > 31) {
                                    try {
/* 134 */                               color = I00000oIO(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                                    } catch (Exception unused) {
/* 139 */                               color = ObtainAttributes.getColor(i4, -65281);
                                    }
                                } else {
/* 144 */                           color = ObtainAttributes.getColor(i4, -65281);
                                }
/* 172 */                       float f2 = ObtainAttributes.hasValue(z) ? ObtainAttributes.getFloat(z, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
/* 178 */                       char c = z;
/* 189 */                       float f3 = ObtainAttributes.hasValue(2) ? ObtainAttributes.getFloat(2, -1.0f) : ObtainAttributes.getFloat(4, -1.0f);
/* 193 */                       ObtainAttributes.recycle();
/* 196 */                       int attributeCount = attributeSet2.getAttributeCount();
/* 200 */                       int[] iArr5 = new int[attributeCount];
/* 206 */                       int i7 = i4;
/* 207 */                       int i8 = i7;
/* 208 */                       while (i7 < attributeCount) {
/* 210 */                           int attributeNameResource = attributeSet2.getAttributeNameResource(i7);
/* 217 */                           if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
/* 234 */                               int i9 = i8 + 1;
/* 241 */                               if (!attributeSet2.getAttributeBooleanValue(i7, false)) {
/* 244 */                                   attributeNameResource = -attributeNameResource;
                                        }
/* 245 */                               iArr5[i8] = attributeNameResource;
/* 247 */                               i8 = i9;
                                    }
/* 248 */                           i7++;
                                }
/* 255 */                       int[] iArrTrimStateSet = StateSet.trimStateSet(iArr5, i8);
/* 262 */                       float f4 = 100.0f;
/* 273 */                       char c2 = (f3 < 0.0f || f3 > 100.0f) ? (char) 0 : c;
/* 276 */                       if (f2 == 1.0f && c2 == 0) {
/* 280 */                           iArr = iArrTrimStateSet;
/* 282 */                           i2 = depth2;
                                } else {
/* 295 */                           int iAlpha = (int) ((Color.alpha(color) * f2) + 0.5f);
/* 296 */                           if (iAlpha < 0) {
/* 298 */                               i = 0;
                                    } else {
/* 300 */                               i = 255;
/* 302 */                               if (iAlpha <= 255) {
/* 305 */                                   i = iAlpha;
                                        }
                                    }
/* 306 */                           if (c2 != 0) {
/* 308 */                               IIil1lIl0 iIil1lIl0I00000oIO = IIil1lIl0.I00000oIO(color);
/* 312 */                               float f5 = iIil1lIl0I00000oIO.I00000oIO;
/* 314 */                               float f6 = iIil1lIl0I00000oIO.I00000oOI;
/* 316 */                               OooloIO0I0 oooloIO0I0 = OooloIO0I0.I000iOII;
/* 323 */                               if (f6 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
/* 347 */                                   iArr = iArrTrimStateSet;
/* 349 */                                   i2 = depth2;
/* 718 */                                   iI00000oIO = i1Ioli1II.I00000oIO(f3);
                                        } else {
/* 361 */                                   float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
/* 365 */                                   float f7 = 0.0f;
/* 369 */                                   float f8 = f6;
/* 370 */                                   char c3 = c;
/* 372 */                                   IIil1lIl0 iIil1lIl0 = null;
                                            while (true) {
/* 384 */                                       if (Math.abs(f7 - f6) >= 0.4f) {
/* 386 */                                           float f9 = 1000.0f;
/* 388 */                                           float f10 = f4;
/* 390 */                                           float f11 = 0.0f;
/* 392 */                                           float f12 = 1000.0f;
/* 394 */                                           IIil1lIl0 iIil1lIl02 = null;
                                                    while (true) {
/* 409 */                                               if (Math.abs(f11 - f10) <= 0.01f) {
/* 640 */                                                   iArr = iArrTrimStateSet;
/* 642 */                                                   i2 = depth2;
/* 644 */                                                   f = f4;
                                                            break;
                                                        }
/* 415 */                                               f = f4;
/* 417 */                                               float f13 = ((f10 - f11) / 2.0f) + f11;
/* 423 */                                               iArr = iArrTrimStateSet;
/* 427 */                                               int iI0000Il00O = IIil1lIl0.I00000oOI(f13, f8, fMin).I0000Il00O(OooloIO0I0.I000iOII);
/* 435 */                                               float fI00000oOI = i1Ioli1II.I00000oOI(Color.red(iI0000Il00O));
/* 443 */                                               float fI00000oOI2 = i1Ioli1II.I00000oOI(Color.green(iI0000Il00O));
/* 451 */                                               float fI00000oOI3 = i1Ioli1II.I00000oOI(Color.blue(iI0000Il00O));
/* 457 */                                               float[] fArr = i1Ioli1II.I0000O[c];
/* 477 */                                               float f14 = ((fI00000oOI3 * fArr[2]) + ((fI00000oOI2 * fArr[c]) + (fI00000oOI * fArr[0]))) / f;
/* 484 */                                               if (f14 <= 0.008856452f) {
/* 489 */                                                   fCbrt = f14 * 903.2963f;
/* 491 */                                                   i3 = iI0000Il00O;
                                                        } else {
/* 494 */                                                   i3 = iI0000Il00O;
/* 507 */                                                   fCbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                                        }
/* 511 */                                               float fAbs = Math.abs(f3 - fCbrt);
/* 520 */                                               if (fAbs < 0.2f) {
/* 522 */                                                   IIil1lIl0 iIil1lIl0I00000oIO2 = IIil1lIl0.I00000oIO(i3);
/* 532 */                                                   IIil1lIl0 iIil1lIl0I00000oOI = IIil1lIl0.I00000oOI(iIil1lIl0I00000oIO2.I0000Il00O, iIil1lIl0I00000oIO2.I00000oOI, fMin);
/* 542 */                                                   float f15 = iIil1lIl0I00000oIO2.I0000O - iIil1lIl0I00000oOI.I0000O;
/* 552 */                                                   float f16 = iIil1lIl0I00000oIO2.I0000oI00 - iIil1lIl0I00000oOI.I0000oI00;
/* 560 */                                                   float f17 = iIil1lIl0I00000oIO2.I0001Ioi1lo - iIil1lIl0I00000oOI.I0001Ioi1lo;
/* 577 */                                                   i2 = depth2;
/* 594 */                                                   float fPow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
/* 597 */                                                   if (fPow <= 1.0f) {
/* 599 */                                                       f12 = fPow;
/* 601 */                                                       f9 = fAbs;
/* 603 */                                                       iIil1lIl02 = iIil1lIl0I00000oIO2;
                                                            }
                                                        } else {
/* 606 */                                                   i2 = depth2;
                                                        }
/* 610 */                                               if (f9 == 0.0f && f12 == 0.0f) {
                                                            break;
                                                        }
/* 621 */                                               if (fCbrt < f3) {
/* 623 */                                                   f11 = f13;
                                                        } else {
/* 626 */                                                   f10 = f13;
                                                        }
/* 632 */                                               f4 = f;
/* 634 */                                               iArrTrimStateSet = iArr;
/* 636 */                                               depth2 = i2;
                                                    }
/* 616 */                                           IIil1lIl0 iIil1lIl03 = iIil1lIl02;
/* 647 */                                           if (c3 == 0) {
/* 677 */                                               if (iIil1lIl03 == null) {
/* 679 */                                                   f6 = f8;
                                                        } else {
/* 681 */                                                   iIil1lIl0 = iIil1lIl03;
/* 682 */                                                   f7 = f8;
                                                        }
/* 688 */                                               f8 = ((f6 - f7) / 2.0f) + f7;
/* 694 */                                               f4 = f;
/* 696 */                                               iArrTrimStateSet = iArr;
/* 698 */                                               depth2 = i2;
                                                    } else {
/* 649 */                                               if (iIil1lIl03 != null) {
/* 651 */                                                   iI00000oIO = iIil1lIl03.I0000Il00O(oooloIO0I0);
                                                            break;
                                                        }
/* 661 */                                               f8 = ((f6 - f7) / 2.0f) + f7;
/* 667 */                                               f4 = f;
/* 669 */                                               iArrTrimStateSet = iArr;
/* 671 */                                               depth2 = i2;
/* 673 */                                               c3 = 0;
                                                    }
                                                } else {
/* 702 */                                           iArr = iArrTrimStateSet;
/* 704 */                                           i2 = depth2;
/* 713 */                                           iI00000oIO = iIil1lIl0 == null ? i1Ioli1II.I00000oIO(f3) : iIil1lIl0.I0000Il00O(oooloIO0I0);
                                                }
                                            }
                                        }
/* 655 */                               color = iI00000oIO;
                                    } else {
/* 723 */                               iArr = iArrTrimStateSet;
/* 725 */                               i2 = depth2;
                                    }
/* 733 */                           color = (16777215 & color) | (i << 24);
                                }
/* 735 */                       int i10 = i5 + 1;
/* 740 */                       if (i10 > iArr3.length) {
/* 749 */                           int[] iArr6 = new int[i5 <= 4 ? 8 : i5 * 2];
/* 752 */                           System.arraycopy(iArr3, 0, iArr6, 0, i5);
/* 755 */                           iArr3 = iArr6;
                                }
/* 756 */                       iArr3[i5] = color;
/* 759 */                       if (i10 > iArr2.length) {
/* 779 */                           ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
/* 782 */                           System.arraycopy(iArr2, 0, r1, 0, i5);
/* 785 */                           iArr2 = r1;
                                }
/* 786 */                       iArr2[i5] = iArr;
/* 788 */                       iArr2 = iArr2;
/* 790 */                       attributeSet2 = attributeSet;
/* 792 */                       theme2 = theme;
/* 794 */                       i5 = i10;
/* 795 */                       z = c;
/* 797 */                       depth2 = i2;
/* 799 */                       i4 = 0;
/* 800 */                       r0 = resources;
                            }
                        } else {
/* 804 */                   r0 = resources;
/* 806 */                   attributeSet2 = attributeSet;
/* 808 */                   theme2 = theme;
/* 810 */                   z = z;
/* 812 */                   depth2 = depth2;
/* 814 */                   i4 = 0;
                        }
                    }
/* 817 */           int[] iArr7 = new int[i5];
/* 819 */           int[][] iArr8 = new int[i5][];
/* 822 */           System.arraycopy(iArr3, 0, iArr7, 0, i5);
/* 825 */           System.arraycopy(iArr2, 0, iArr8, 0, i5);
/* 830 */           return new ColorStateList(iArr8, iArr7);
                }
            }
