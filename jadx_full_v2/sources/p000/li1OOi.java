            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.Shader;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.util.Xml;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import org.xmlpull.v1.XmlPullParserException;
            
            public abstract class li1OOi {
                /* JADX WARN: Removed duplicated region for block: B:115:0x02d6  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x02ea  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x02f1  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x0302  */
                /* JADX WARN: Removed duplicated region for block: B:132:0x0312  */
                /* JADX WARN: Removed duplicated region for block: B:135:0x0362  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x0367  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x037f  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x0383  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x03a8  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x03c4  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x03c9  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
                /* JADX WARN: Type inference failed for: r5v38, types: [int[], java.io.Serializable] */
                /* JADX WARN: Type inference failed for: r5v40, types: [int[], java.io.Serializable] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final IoiOoolI I00000oIO(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
                    long jI00000oOI;
                    int i2;
                    char c;
                    int i3;
                    boolean z;
                    int i4;
                    char c2;
                    int i5;
                    int i6;
                    int[] iArr;
                    int i7;
/* 7 */             AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
/* 13 */            I101oOiOiI i101oOiOiI = new I101oOiOiI();
/* 16 */            i101oOiOiI.I0000Il00O = xmlResourceParser;
/* 19 */            i101oOiOiI.I00000oIO = 0;
/* 24 */            I0IiO0lO i0IiO0lO = new I0IiO0lO(1);
/* 31 */            i0IiO0lO.I00000oOI = new float[64];
/* 33 */            i101oOiOiI.I0000oI00 = i0IiO0lO;
/* 35 */            VarHandle.storeStoreFence();
/* 40 */            TypedArray typedArrayI0000O = lOollIIio1O.I0000O(resources, theme, attributeSetAsAttributeSet, Ioo1l1i00O.I0000Il00O);
/* 48 */            i101oOiOiI.I000OiO(typedArrayI0000O.getChangingConfigurations());
/* 63 */            boolean z2 = !lOollIIio1O.I0000Il00O(xmlResourceParser, "autoMirrored") ? false : typedArrayI0000O.getBoolean(5, false);
/* 73 */            i101oOiOiI.I000OiO(typedArrayI0000O.getChangingConfigurations());
/* 80 */            float fI0000oI00 = i101oOiOiI.I0000oI00(typedArrayI0000O, "viewportWidth", 7, 0.0f);
/* 88 */            float fI0000oI002 = i101oOiOiI.I0000oI00(typedArrayI0000O, "viewportHeight", 8, 0.0f);
/* 94 */            if (fI0000oI00 <= 0.0f) {
/* 1175 */              throw new XmlPullParserException(Oi010OO0.I00111O(typedArrayI0000O.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
                    }
/* 98 */            if (fI0000oI002 <= 0.0f) {
/* 1159 */              throw new XmlPullParserException(Oi010OO0.I00111O(typedArrayI0000O.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
                    }
/* 100 */           int i8 = 3;
/* 101 */           float dimension = typedArrayI0000O.getDimension(3, 0.0f);
/* 109 */           i101oOiOiI.I000OiO(typedArrayI0000O.getChangingConfigurations());
/* 113 */           float dimension2 = typedArrayI0000O.getDimension(2, 0.0f);
/* 121 */           i101oOiOiI.I000OiO(typedArrayI0000O.getChangingConfigurations());
/* 128 */           if (typedArrayI0000O.hasValue(1)) {
/* 132 */               TypedValue typedValue = new TypedValue();
/* 135 */               typedArrayI0000O.getValue(1, typedValue);
/* 140 */               if (typedValue.type == 2) {
/* 142 */                   jI00000oOI = IOOiio0i.I000o00OoI0I;
                        } else {
/* 147 */                   ColorStateList colorStateListI00000oIO = lOollIIio1O.I00000oIO(typedArrayI0000O, xmlResourceParser, theme);
/* 155 */                   i101oOiOiI.I000OiO(typedArrayI0000O.getChangingConfigurations());
/* 169 */                   jI00000oOI = colorStateListI00000oIO != null ? iiO01ll11o1l.I00000oOI(colorStateListI00000oIO.getDefaultColor()) : IOOiio0i.I000o00OoI0I;
                        }
                    } else {
/* 172 */               jI00000oOI = IOOiio0i.I000o00OoI0I;
                    }
/* 176 */           int i9 = typedArrayI0000O.getInt(6, -1);
/* 184 */           i101oOiOiI.I000OiO(typedArrayI0000O.getChangingConfigurations());
/* 189 */           if (i9 == -1) {
/* 200 */               i2 = 5;
                    } else if (i9 == 3) {
/* 213 */               i2 = 3;
                    } else if (i9 != 5) {
/* 195 */               if (i9 != 9) {
                            switch (i9) {
                                case 14:
/* 208 */                           i2 = 13;
                                    break;
                                case 15:
/* 205 */                           i2 = 14;
                                    break;
                                case 16:
/* 202 */                           i2 = 12;
                                    break;
                            }
                        } else {
/* 211 */                   i2 = 9;
                        }
                    }
/* 220 */           float f = dimension / resources.getDisplayMetrics().density;
/* 227 */           float f2 = dimension2 / resources.getDisplayMetrics().density;
/* 229 */           typedArrayI0000O.recycle();
/* 249 */           int i10 = 2;
/* 252 */           IoiOo1iI ioiOo1iI = new IoiOo1iI(null, f, f2, fI0000oI00, fI0000oI002, jI00000oOI, i2, z2, 1);
/* 255 */           int i11 = 0;
/* 261 */           while (xmlResourceParser.getEventType() != 1 && (xmlResourceParser.getDepth() >= 1 || xmlResourceParser.getEventType() != i8)) {
/* 279 */               XmlResourceParser xmlResourceParser2 = (XmlResourceParser) i101oOiOiI.I0000Il00O;
/* 283 */               I0IiO0lO i0IiO0lO2 = (I0IiO0lO) i101oOiOiI.I0000oI00;
/* 285 */               int eventType = xmlResourceParser2.getEventType();
/* 291 */               ArrayList arrayList = ioiOo1iI.I000OOo1O;
/* 295 */               if (eventType != i10) {
/* 297 */                   if (eventType == i8 && "group".equals(xmlResourceParser2.getName())) {
/* 310 */                       int i12 = i11 + 1;
/* 313 */                       for (int i13 = 0; i13 < i12; i13++) {
/* 317 */                           if (ioiOo1iI.I000iOII) {
/* 319 */                               IolioOO1.I0000Il00O("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
/* 341 */                           ((IoiOo111o) IIl001iO0Io.I000OiO(1, arrayList)).I000OiO.add(IoiOo1iI.I0000Il00O((IoiOo111o) IIlIOloOOO.I000o00OoI0I(1, arrayList)));
                                }
/* 349 */                       int[] iArr2 = (int[]) i101oOiOiI.I0000O;
/* 351 */                       if (iArr2 == null || (i7 = i101oOiOiI.I00000oOI) == 0) {
/* 378 */                           i3 = i8;
/* 381 */                           i11 = 0;
/* 368 */                           c = 7;
/* 370 */                           z = false;
                                } else {
                                    int i14 = i7 - 1;
/* 360 */                           i101oOiOiI.I00000oOI = i14;
/* 362 */                           i11 = iArr2[i14];
                                }
                            }
/* 1111 */                  xmlResourceParser.next();
/* 1115 */                  i8 = i3;
/* 1119 */                  i10 = 2;
                        } else {
/* 383 */                   String name = xmlResourceParser2.getName();
/* 387 */                   if (name != null) {
/* 389 */                       int iHashCode = name.hashCode();
/* 396 */                       List listI00000oIO = Il01100l.I00iOIl;
/* 400 */                       if (iHashCode != -1649314686) {
/* 406 */                           if (iHashCode != 3433509) {
/* 411 */                               if (iHashCode == 98629247 && name.equals("group")) {
/* 425 */                                   TypedArray typedArrayI0000O2 = lOollIIio1O.I0000O(resources, theme, attributeSetAsAttributeSet, Ioo1l1i00O.I0000O);
/* 433 */                                   i101oOiOiI.I000OiO(typedArrayI0000O2.getChangingConfigurations());
/* 440 */                                   float fI0000oI003 = i101oOiOiI.I0000oI00(typedArrayI0000O2, "rotation", 5, 0.0f);
/* 445 */                                   float f3 = typedArrayI0000O2.getFloat(1, 0.0f);
/* 453 */                                   i101oOiOiI.I000OiO(typedArrayI0000O2.getChangingConfigurations());
/* 457 */                                   float f4 = typedArrayI0000O2.getFloat(2, 0.0f);
/* 465 */                                   i101oOiOiI.I000OiO(typedArrayI0000O2.getChangingConfigurations());
/* 473 */                                   float fI0000oI004 = i101oOiOiI.I0000oI00(typedArrayI0000O2, "scaleX", 3, 1.0f);
/* 479 */                                   float fI0000oI005 = i101oOiOiI.I0000oI00(typedArrayI0000O2, "scaleY", 4, 1.0f);
/* 486 */                                   float fI0000oI006 = i101oOiOiI.I0000oI00(typedArrayI0000O2, "translateX", 6, 0.0f);
/* 493 */                                   float fI0000oI007 = i101oOiOiI.I0000oI00(typedArrayI0000O2, "translateY", 7, 0.0f);
/* 498 */                                   String string = typedArrayI0000O2.getString(0);
/* 506 */                                   i101oOiOiI.I000OiO(typedArrayI0000O2.getChangingConfigurations());
/* 514 */                                   String str = string == null ? "" : string;
/* 516 */                                   typedArrayI0000O2.recycle();
/* 519 */                                   int i15 = Ooo1iOO.I00000oIO;
/* 523 */                                   if (ioiOo1iI.I000iOII) {
/* 525 */                                       IolioOO1.I0000Il00O("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
/* 537 */                                   arrayList.add(new IoiOo111o(str, fI0000oI003, f3, f4, fI0000oI004, fI0000oI005, fI0000oI006, fI0000oI007, listI00000oIO, Barcode.FORMAT_UPC_A));
/* 542 */                                   int[] iArr3 = (int[]) i101oOiOiI.I0000O;
/* 544 */                                   if (iArr3 == null) {
/* 546 */                                       ?? r5 = new int[4];
/* 548 */                                       i101oOiOiI.I0000O = r5;
                                                iArr = r5;
                                            } else {
/* 551 */                                       int i16 = i101oOiOiI.I00000oOI;
/* 553 */                                       int length = iArr3.length;
                                                iArr = iArr3;
/* 554 */                                       if (i16 >= length) {
/* 561 */                                           ?? CopyOf = Arrays.copyOf(iArr3, iArr3.length * 2);
/* 565 */                                           i101oOiOiI.I0000O = CopyOf;
                                                    iArr = CopyOf;
                                                }
                                            }
/* 567 */                                   int i17 = i101oOiOiI.I00000oOI;
/* 571 */                                   i101oOiOiI.I00000oOI = i17 + 1;
/* 573 */                                   iArr[i17] = i11;
/* 576 */                                   i11 = 0;
                                        }
/* 577 */                               c = 7;
/* 579 */                               i3 = 3;
/* 370 */                               z = false;
/* 1111 */                              xmlResourceParser.next();
/* 1115 */                              i8 = i3;
/* 1119 */                              i10 = 2;
                                    } else if (name.equals("path")) {
/* 595 */                               TypedArray typedArrayI0000O3 = lOollIIio1O.I0000O(resources, theme, attributeSetAsAttributeSet, Ioo1l1i00O.I0000oI00);
/* 603 */                               i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 614 */                               if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
/* 992 */                                   I000II.I000iOII("No path data available");
/* 988 */                                   return null;
                                        }
/* 617 */                               String string2 = typedArrayI0000O3.getString(0);
/* 625 */                               i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 634 */                               String str2 = string2 == null ? "" : string2;
/* 637 */                               String string3 = typedArrayI0000O3.getString(2);
/* 645 */                               i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 648 */                               if (string3 == null) {
/* 650 */                                   int i18 = Ooo1iOO.I00000oIO;
                                        } else {
/* 655 */                                   listI00000oIO = I0IiO0lO.I00000oIO(i0IiO0lO2, string3);
                                        }
/* 652 */                               List list = listI00000oIO;
/* 667 */                               I00Ol00 i00Ol00I00000oOI = lOollIIio1O.I00000oOI(typedArrayI0000O3, (XmlResourceParser) i101oOiOiI.I0000Il00O, theme, "fillColor", 1);
/* 675 */                               i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 684 */                               float fI0000oI008 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "fillAlpha", 12, 1.0f);
/* 707 */                               int i19 = !lOollIIio1O.I0000Il00O((XmlResourceParser) i101oOiOiI.I0000Il00O, "strokeLineCap") ? -1 : typedArrayI0000O3.getInt(8, -1);
/* 716 */                               i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 719 */                               if (i19 == 0) {
/* 727 */                                   i4 = 0;
/* 745 */                                   if (lOollIIio1O.I0000Il00O((XmlResourceParser) i101oOiOiI.I0000Il00O, "strokeLineJoin")) {
/* 749 */                                       c2 = 65535;
/* 750 */                                       i5 = -1;
                                            } else {
/* 756 */                                       c2 = 65535;
/* 757 */                                       i5 = typedArrayI0000O3.getInt(9, -1);
                                            }
/* 766 */                                   i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 769 */                                   if (i5 != 0) {
/* 772 */                                       if (i5 == 1) {
/* 784 */                                           i6 = 1;
                                                } else if (i5 == 2) {
/* 780 */                                           i6 = 2;
                                                }
/* 795 */                                       float fI0000oI009 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeMiterLimit", 10, 4.0f);
/* 806 */                                       I00Ol00 i00Ol00I00000oOI2 = lOollIIio1O.I00000oOI(typedArrayI0000O3, (XmlResourceParser) i101oOiOiI.I0000Il00O, theme, "strokeColor", 3);
/* 814 */                                       i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 823 */                                       float fI0000oI0010 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeAlpha", 11, 1.0f);
/* 829 */                                       float fI0000oI0011 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeWidth", 4, 1.0f);
/* 836 */                                       float fI0000oI0012 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathEnd", 6, 1.0f);
/* 842 */                                       c = 7;
/* 844 */                                       float fI0000oI0013 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathOffset", 7, 0.0f);
/* 851 */                                       float fI0000oI0014 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathStart", 5, 0.0f);
/* 875 */                                       int i20 = !lOollIIio1O.I0000Il00O((XmlResourceParser) i101oOiOiI.I0000Il00O, "fillType") ? 0 : typedArrayI0000O3.getInt(13, 0);
/* 883 */                                       i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 886 */                                       typedArrayI0000O3.recycle();
/* 891 */                                       Shader shader = (Shader) i00Ol00I00000oOI.I0000Il00O;
/* 924 */                                       III11l1I iII11lloi = (shader != null && i00Ol00I00000oOI.I00000oOI == 0) ? null : shader != null ? new III11lloi(shader) : new OlI00IIlOO(iiO01ll11o1l.I00000oOI(i00Ol00I00000oOI.I00000oOI));
/* 928 */                                       Shader shader2 = (Shader) i00Ol00I00000oOI2.I0000Il00O;
/* 967 */                                       IoiOo1iI ioiOo1iI2 = ioiOo1iI;
/* 973 */                                       ioiOo1iI2.I00000oIO(list, i20 != 0 ? 0 : 1, str2, iII11lloi, fI0000oI008, (shader2 == null && i00Ol00I00000oOI2.I00000oOI == 0) ? null : shader2 != null ? new III11lloi(shader2) : new OlI00IIlOO(iiO01ll11o1l.I00000oOI(i00Ol00I00000oOI2.I00000oOI)), fI0000oI0010, fI0000oI0011, i4, i6, fI0000oI009, fI0000oI0014, fI0000oI0012, fI0000oI0013);
/* 976 */                                       ioiOo1iI = ioiOo1iI2;
/* 978 */                                       z = false;
/* 982 */                                       i3 = 3;
                                            }
/* 777 */                                   i6 = 0;
/* 795 */                                   float fI0000oI0092 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeMiterLimit", 10, 4.0f);
/* 806 */                                   I00Ol00 i00Ol00I00000oOI22 = lOollIIio1O.I00000oOI(typedArrayI0000O3, (XmlResourceParser) i101oOiOiI.I0000Il00O, theme, "strokeColor", 3);
/* 814 */                                   i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 823 */                                   float fI0000oI00102 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeAlpha", 11, 1.0f);
/* 829 */                                   float fI0000oI00112 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeWidth", 4, 1.0f);
/* 836 */                                   float fI0000oI00122 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathEnd", 6, 1.0f);
/* 842 */                                   c = 7;
/* 844 */                                   float fI0000oI00132 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathOffset", 7, 0.0f);
/* 851 */                                   float fI0000oI00142 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathStart", 5, 0.0f);
/* 875 */                                   if (!lOollIIio1O.I0000Il00O((XmlResourceParser) i101oOiOiI.I0000Il00O, "fillType")) {
                                            }
/* 883 */                                   i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 886 */                                   typedArrayI0000O3.recycle();
/* 891 */                                   Shader shader3 = (Shader) i00Ol00I00000oOI.I0000Il00O;
/* 924 */                                   if (shader3 != null) {
/* 928 */                                       Shader shader22 = (Shader) i00Ol00I00000oOI22.I0000Il00O;
                                                if (shader22 == null) {
/* 967 */                                           IoiOo1iI ioiOo1iI22 = ioiOo1iI;
/* 973 */                                           ioiOo1iI22.I00000oIO(list, i20 != 0 ? 0 : 1, str2, iII11lloi, fI0000oI008, (shader22 == null && i00Ol00I00000oOI22.I00000oOI == 0) ? null : shader22 != null ? new III11lloi(shader22) : new OlI00IIlOO(iiO01ll11o1l.I00000oOI(i00Ol00I00000oOI22.I00000oOI)), fI0000oI00102, fI0000oI00112, i4, i6, fI0000oI0092, fI0000oI00142, fI0000oI00122, fI0000oI00132);
/* 976 */                                           ioiOo1iI = ioiOo1iI22;
/* 978 */                                           z = false;
/* 982 */                                           i3 = 3;
                                                }
                                            }
                                        } else {
/* 722 */                                   if (i19 == 1) {
/* 733 */                                       i4 = 1;
                                            } else if (i19 == 2) {
/* 730 */                                       i4 = 2;
                                            }
/* 745 */                                   if (lOollIIio1O.I0000Il00O((XmlResourceParser) i101oOiOiI.I0000Il00O, "strokeLineJoin")) {
                                            }
/* 766 */                                   i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 769 */                                   if (i5 != 0) {
                                            }
/* 777 */                                   i6 = 0;
/* 795 */                                   float fI0000oI00922 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeMiterLimit", 10, 4.0f);
/* 806 */                                   I00Ol00 i00Ol00I00000oOI222 = lOollIIio1O.I00000oOI(typedArrayI0000O3, (XmlResourceParser) i101oOiOiI.I0000Il00O, theme, "strokeColor", 3);
/* 814 */                                   i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 823 */                                   float fI0000oI001022 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeAlpha", 11, 1.0f);
/* 829 */                                   float fI0000oI001122 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "strokeWidth", 4, 1.0f);
/* 836 */                                   float fI0000oI001222 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathEnd", 6, 1.0f);
/* 842 */                                   c = 7;
/* 844 */                                   float fI0000oI001322 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathOffset", 7, 0.0f);
/* 851 */                                   float fI0000oI001422 = i101oOiOiI.I0000oI00(typedArrayI0000O3, "trimPathStart", 5, 0.0f);
/* 875 */                                   if (!lOollIIio1O.I0000Il00O((XmlResourceParser) i101oOiOiI.I0000Il00O, "fillType")) {
                                            }
/* 883 */                                   i101oOiOiI.I000OiO(typedArrayI0000O3.getChangingConfigurations());
/* 886 */                                   typedArrayI0000O3.recycle();
/* 891 */                                   Shader shader32 = (Shader) i00Ol00I00000oOI.I0000Il00O;
/* 924 */                                   if (shader32 != null) {
                                            }
                                        }
/* 1111 */                              xmlResourceParser.next();
/* 1115 */                              i8 = i3;
/* 1119 */                              i10 = 2;
                                    }
/* 577 */                           c = 7;
/* 579 */                           i3 = 3;
/* 370 */                           z = false;
/* 1111 */                          xmlResourceParser.next();
/* 1115 */                          i8 = i3;
/* 1119 */                          i10 = 2;
                                } else {
/* 996 */                           c = 7;
/* 997 */                           i3 = 3;
/* 999 */                           z = false;
/* 1011 */                          if (name.equals("clip-path")) {
/* 1018 */                              TypedArray typedArrayI0000O4 = lOollIIio1O.I0000O(resources, theme, attributeSetAsAttributeSet, Ioo1l1i00O.I0001Ioi1lo);
/* 1026 */                              i101oOiOiI.I000OiO(typedArrayI0000O4.getChangingConfigurations());
/* 1030 */                              String string4 = typedArrayI0000O4.getString(0);
/* 1038 */                              i101oOiOiI.I000OiO(typedArrayI0000O4.getChangingConfigurations());
/* 1047 */                              String str3 = string4 == null ? "" : string4;
/* 1050 */                              String string5 = typedArrayI0000O4.getString(1);
/* 1058 */                              i101oOiOiI.I000OiO(typedArrayI0000O4.getChangingConfigurations());
/* 1061 */                              if (string5 == null) {
/* 1063 */                                  int i21 = Ooo1iOO.I00000oIO;
                                        } else {
/* 1068 */                                  listI00000oIO = I0IiO0lO.I00000oIO(i0IiO0lO2, string5);
                                        }
/* 1065 */                              List list2 = listI00000oIO;
/* 1073 */                              typedArrayI0000O4.recycle();
/* 1078 */                              if (ioiOo1iI.I000iOII) {
/* 1080 */                                  IolioOO1.I0000Il00O("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
/* 1106 */                              arrayList.add(new IoiOo111o(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, Barcode.FORMAT_UPC_A));
/* 1109 */                              i11++;
                                    }
/* 1111 */                          xmlResourceParser.next();
/* 1115 */                          i8 = i3;
/* 1119 */                          i10 = 2;
                                }
                            }
                        }
/* 365 */               i3 = i8;
/* 368 */               c = 7;
/* 370 */               z = false;
/* 1111 */              xmlResourceParser.next();
/* 1115 */              i8 = i3;
/* 1119 */              i10 = 2;
                    }
/* 1125 */          int i22 = i | i101oOiOiI.I00000oIO;
/* 1129 */          IoiOolO1iOo ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 1133 */          IoiOoolI ioiOoolI = new IoiOoolI();
/* 1136 */          ioiOoolI.I00000oIO = ioiOolO1iOoI0000O;
/* 1138 */          ioiOoolI.I00000oOI = i22;
/* 1140 */          VarHandle.storeStoreFence();
/* 1143 */          return ioiOoolI;
                }

                public static final IoiOolO1iOo I00000oOI(int i, IloI0lOlll1 iloI0lOlll1) throws XmlPullParserException, Resources.NotFoundException, IOException {
/* 7 */             Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 15 */            Resources resources = (Resources) iloI0lOlll1.I000iOII(I0lloOI0oio.I0000Il00O);
/* 17 */            Resources.Theme theme = context.getTheme();
/* 21 */            Object configuration = resources.getConfiguration();
/* 43 */            boolean zI000II = iloI0lOlll1.I000II(configuration) | iloI0lOlll1.I0000oI00(i) | iloI0lOlll1.I000II(resources) | iloI0lOlll1.I000II(theme);
/* 44 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 48 */            if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 56 */                TypedValue typedValue = new TypedValue();
/* 60 */                resources.getValue(i, typedValue, true);
/* 63 */                XmlResourceParser xml = resources.getXml(i);
/* 67 */                int next = xml.next();
/* 72 */                while (next != 2 && next != 1) {
/* 76 */                    next = xml.next();
                        }
/* 81 */                if (next != 2) {
/* 106 */                   throw new XmlPullParserException("No start tag found");
                        }
/* 89 */                objI00O0i0ii = I00000oIO(theme, resources, xml, typedValue.changingConfigurations).I00000oIO;
/* 91 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 94 */            return (IoiOolO1iOo) objI00O0i0ii;
                }
            }
