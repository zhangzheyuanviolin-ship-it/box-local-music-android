            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.Xml;
            import android.view.InflateException;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.SubMenu;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
            public final class OliioiiiOo extends MenuInflater {
                public static final Class[] I0000oI00;
                public static final Class[] I0001Ioi1lo;
                public final Object[] I00000oIO;
                public final Object[] I00000oOI;
                public final Context I0000Il00O;
                public Object I0000O;

                static {
/* 3 */             Class[] clsArr = {Context.class};
/* 7 */             I0000oI00 = clsArr;
/* 9 */             I0001Ioi1lo = clsArr;
                }

                public OliioiiiOo(Context context) {
/* 1 */             super(context);
/* 4 */             this.I0000Il00O = context;
/* 6 */             Object[] objArr = {context};
/* 10 */            this.I00000oIO = objArr;
/* 12 */            this.I00000oOI = objArr;
                }

                public static Object I00000oIO(Object obj) {
                    return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? I00000oIO(((ContextWrapper) obj).getBaseContext()) : obj;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[PHI: r3
                  0x005f: PHI (r3v65 java.lang.String) = 
                  (r3v1 java.lang.String)
                  (r3v51 java.lang.String)
                  (r3v1 java.lang.String)
                  (r3v1 java.lang.String)
                  (r3v1 java.lang.String)
                  (r3v1 java.lang.String)
                  (r3v1 java.lang.String)
                  (r3v1 java.lang.String)
                 binds: [B:40:0x00d5, B:88:0x0250, B:17:0x005d, B:38:0x00ce, B:30:0x0090, B:36:0x00b6, B:35:0x009e, B:26:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
                    int i;
                    XmlPullParser xmlPullParser2;
                    ColorStateList colorStateList;
                    int resourceId;
/* 7 */             OliioO00ilo oliioO00ilo = new OliioO00ilo();
/* 10 */            oliioO00ilo.I00II0oii1o = this;
/* 12 */            String str = null;
/* 13 */            oliioO00ilo.I001lloI = null;
/* 15 */            oliioO00ilo.I00II0Ol1O0l = null;
/* 19 */            oliioO00ilo.I00000oIO = menu;
/* 22 */            oliioO00ilo.I00000oOI = 0;
/* 24 */            oliioO00ilo.I0000Il00O = 0;
/* 26 */            oliioO00ilo.I0000O = 0;
/* 28 */            oliioO00ilo.I0000oI00 = 0;
/* 31 */            oliioO00ilo.I0001Ioi1lo = true;
/* 33 */            oliioO00ilo.I000II = true;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            int eventType = xmlPullParser.getEventType();
                    while (true) {
/* 42 */                i = 2;
/* 45 */                if (eventType == 2) {
/* 47 */                    String name = xmlPullParser.getName();
/* 55 */                    if (!name.equals("menu")) {
/* 73 */                        throw new RuntimeException("Expecting menu, got ".concat(name));
                            }
/* 57 */                    eventType = xmlPullParser.next();
                        } else {
/* 74 */                    eventType = xmlPullParser.next();
/* 78 */                    if (eventType == 1) {
                                break;
                            }
                        }
                    }
/* 80 */            String str2 = null;
/* 81 */            boolean z = false;
/* 82 */            boolean z2 = false;
/* 83 */            while (!z) {
/* 85 */                if (eventType == 1) {
/* 654 */                   throw new RuntimeException("Unexpected end of document");
                        }
/* 92 */                if (eventType != i) {
/* 94 */                    if (eventType != 3) {
/* 96 */                        xmlPullParser2 = xmlPullParser;
                            } else {
/* 100 */                       String name2 = xmlPullParser.getName();
/* 104 */                       if (z2 && name2.equals(str2)) {
/* 112 */                           xmlPullParser2 = xmlPullParser;
/* 114 */                           str2 = str;
/* 115 */                           z2 = false;
                                } else {
/* 122 */                           if (name2.equals("group")) {
/* 124 */                               oliioO00ilo.I00000oOI = 0;
/* 126 */                               oliioO00ilo.I0000Il00O = 0;
/* 128 */                               oliioO00ilo.I0000O = 0;
/* 130 */                               oliioO00ilo.I0000oI00 = 0;
/* 132 */                               oliioO00ilo.I0001Ioi1lo = true;
/* 134 */                               oliioO00ilo.I000II = true;
                                    } else if (name2.equals("item")) {
/* 145 */                               if (!oliioO00ilo.I000O01llI0) {
/* 147 */                                   O1ioO0 o1ioO0 = oliioO00ilo.I001l0I00;
/* 149 */                                   if (o1ioO0 == null || !o1ioO0.I00000oOI.hasSubMenu()) {
/* 183 */                                       oliioO00ilo.I000O01llI0 = true;
/* 199 */                                       oliioO00ilo.I00000oOI(oliioO00ilo.I00000oIO.add(oliioO00ilo.I00000oOI, oliioO00ilo.I000OOo1O, oliioO00ilo.I000OiO, oliioO00ilo.I000iOII));
                                            } else {
/* 159 */                                       oliioO00ilo.I000O01llI0 = true;
/* 179 */                                       oliioO00ilo.I00000oOI(oliioO00ilo.I00000oIO.addSubMenu(oliioO00ilo.I00000oOI, oliioO00ilo.I000OOo1O, oliioO00ilo.I000OiO, oliioO00ilo.I000iOII).getItem());
                                            }
                                        }
                                    } else if (name2.equals("menu")) {
/* 209 */                               xmlPullParser2 = xmlPullParser;
/* 211 */                               z = true;
                                    }
/* 96 */                            xmlPullParser2 = xmlPullParser;
                                }
                            }
                        } else if (!z2) {
/* 217 */                   String name3 = xmlPullParser.getName();
/* 221 */                   boolean zEquals = name3.equals("group");
/* 225 */                   Context context = this.I0000Il00O;
/* 229 */                   if (zEquals) {
/* 233 */                       TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOli0.I00100l0);
/* 241 */                       oliioO00ilo.I00000oOI = typedArrayObtainStyledAttributes.getResourceId(1, 0);
/* 247 */                       oliioO00ilo.I0000Il00O = typedArrayObtainStyledAttributes.getInt(3, 0);
/* 253 */                       oliioO00ilo.I0000O = typedArrayObtainStyledAttributes.getInt(4, 0);
/* 259 */                       oliioO00ilo.I0000oI00 = typedArrayObtainStyledAttributes.getInt(5, 0);
/* 266 */                       oliioO00ilo.I0001Ioi1lo = typedArrayObtainStyledAttributes.getBoolean(2, true);
/* 272 */                       oliioO00ilo.I000II = typedArrayObtainStyledAttributes.getBoolean(0, true);
/* 274 */                       typedArrayObtainStyledAttributes.recycle();
/* 277 */                       xmlPullParser2 = xmlPullParser;
/* 279 */                       str = null;
                            } else if (name3.equals("item")) {
/* 291 */                       TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, OOilOli0.I00100o1O0lo);
/* 299 */                       oliioO00ilo.I000OOo1O = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
/* 322 */                       oliioO00ilo.I000OiO = (typedArrayObtainStyledAttributes2.getInt(5, oliioO00ilo.I0000Il00O) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, oliioO00ilo.I0000O) & 65535);
/* 329 */                       oliioO00ilo.I000iOII = typedArrayObtainStyledAttributes2.getText(7);
/* 337 */                       oliioO00ilo.I000l1 = typedArrayObtainStyledAttributes2.getText(8);
/* 343 */                       oliioO00ilo.I000lI = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
/* 347 */                       String string = typedArrayObtainStyledAttributes2.getString(9);
/* 359 */                       oliioO00ilo.I000o00OoI0I = string == null ? (char) 0 : string.charAt(0);
/* 369 */                       oliioO00ilo.I000oI1ioi = typedArrayObtainStyledAttributes2.getInt(16, Barcode.FORMAT_AZTEC);
/* 373 */                       String string2 = typedArrayObtainStyledAttributes2.getString(10);
/* 385 */                       oliioO00ilo.I00100l0 = string2 == null ? (char) 0 : string2.charAt(0);
/* 393 */                       oliioO00ilo.I00100o1O0lo = typedArrayObtainStyledAttributes2.getInt(20, Barcode.FORMAT_AZTEC);
/* 401 */                       if (typedArrayObtainStyledAttributes2.hasValue(11)) {
/* 407 */                           oliioO00ilo.I0010I0i = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
/* 412 */                           oliioO00ilo.I0010I0i = oliioO00ilo.I0000oI00;
                                }
/* 418 */                       oliioO00ilo.I0010o = typedArrayObtainStyledAttributes2.getBoolean(3, false);
/* 426 */                       oliioO00ilo.I00111O = typedArrayObtainStyledAttributes2.getBoolean(4, oliioO00ilo.I0001Ioi1lo);
/* 434 */                       oliioO00ilo.I001IIilI0O = typedArrayObtainStyledAttributes2.getBoolean(1, oliioO00ilo.I000II);
/* 443 */                       oliioO00ilo.I001IO000 = typedArrayObtainStyledAttributes2.getInt(21, -1);
/* 451 */                       oliioO00ilo.I001iOo1i0O = typedArrayObtainStyledAttributes2.getString(12);
/* 459 */                       oliioO00ilo.I001i1O0Ol = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
/* 467 */                       oliioO00ilo.I001i1lo1io = typedArrayObtainStyledAttributes2.getString(15);
/* 471 */                       String string3 = typedArrayObtainStyledAttributes2.getString(14);
/* 479 */                       boolean z3 = string3 != null;
/* 480 */                       if (z3 && oliioO00ilo.I001i1O0Ol == 0 && oliioO00ilo.I001i1lo1io == null) {
/* 500 */                           oliioO00ilo.I001l0I00 = (O1ioO0) oliioO00ilo.I00000oIO(string3, I0001Ioi1lo, this.I00000oOI);
                                } else {
/* 503 */                           if (z3) {
/* 509 */                               Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
/* 513 */                           oliioO00ilo.I001l0I00 = null;
                                }
/* 521 */                       oliioO00ilo.I001lIiIIo1O = typedArrayObtainStyledAttributes2.getText(17);
/* 529 */                       oliioO00ilo.I001lllioOl = typedArrayObtainStyledAttributes2.getText(22);
/* 537 */                       if (typedArrayObtainStyledAttributes2.hasValue(19)) {
/* 549 */                           oliioO00ilo.I00II0Ol1O0l = IiloO11l.I00000oIO(typedArrayObtainStyledAttributes2.getInt(19, -1), oliioO00ilo.I00II0Ol1O0l);
                                } else {
/* 553 */                           oliioO00ilo.I00II0Ol1O0l = null;
                                }
/* 561 */                       if (typedArrayObtainStyledAttributes2.hasValue(18)) {
/* 567 */                           if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = iOI10i0I11.I00000oOI(context, resourceId)) == null) {
/* 582 */                               colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                    }
/* 586 */                           oliioO00ilo.I001lloI = colorStateList;
/* 588 */                           str = null;
                                } else {
/* 590 */                           str = null;
/* 591 */                           oliioO00ilo.I001lloI = null;
                                }
/* 593 */                       typedArrayObtainStyledAttributes2.recycle();
/* 596 */                       oliioO00ilo.I000O01llI0 = false;
/* 96 */                        xmlPullParser2 = xmlPullParser;
                            } else {
/* 600 */                       str = null;
/* 605 */                       if (name3.equals("menu")) {
/* 607 */                           oliioO00ilo.I000O01llI0 = true;
/* 619 */                           SubMenu subMenuAddSubMenu = oliioO00ilo.I00000oIO.addSubMenu(oliioO00ilo.I00000oOI, oliioO00ilo.I000OOo1O, oliioO00ilo.I000OiO, oliioO00ilo.I000iOII);
/* 627 */                           oliioO00ilo.I00000oOI(subMenuAddSubMenu.getItem());
/* 630 */                           xmlPullParser2 = xmlPullParser;
/* 632 */                           I00000oOI(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                                } else {
/* 636 */                           xmlPullParser2 = xmlPullParser;
/* 638 */                           z2 = true;
/* 639 */                           str2 = name3;
                                }
                            }
                        }
/* 640 */               eventType = xmlPullParser2.next();
/* 644 */               i = 2;
                        z = z;
                        z2 = z2;
                    }
                }

                @Override
                public final void inflate(int i, Menu menu) {
/* 5 */             if (!(menu instanceof O1illlIiilIl)) {
/* 7 */                 super.inflate(i, menu);
/* 10 */                return;
                    }
/* 11 */            XmlResourceParser layout = null;
/* 12 */            boolean z = false;
                    try {
                        try {
/* 19 */                    layout = this.I0000Il00O.getResources().getLayout(i);
/* 23 */                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
/* 29 */                    if (menu instanceof O1illlIiilIl) {
/* 32 */                        O1illlIiilIl o1illlIiilIl = (O1illlIiilIl) menu;
/* 36 */                        if (!o1illlIiilIl.I00100l0) {
/* 38 */                            o1illlIiilIl.I001i1O0Ol();
/* 41 */                            z = true;
                                }
                            }
/* 49 */                    I00000oOI(layout, attributeSetAsAttributeSet, menu);
/* 52 */                    if (z) {
/* 56 */                        ((O1illlIiilIl) menu).I001IO000();
                            }
/* 59 */                    layout.close();
                        } catch (IOException e) {
/* 68 */                    throw new InflateException("Error inflating menu XML", e);
                        } catch (XmlPullParserException e2) {
/* 74 */                    throw new InflateException("Error inflating menu XML", e2);
                        }
                    } catch (Throwable th) {
/* 75 */                if (z) {
/* 79 */                    ((O1illlIiilIl) menu).I001IO000();
                        }
/* 82 */                if (layout != null) {
/* 84 */                    layout.close();
                        }
/* 106 */               throw th;
                    }
                }
            }
