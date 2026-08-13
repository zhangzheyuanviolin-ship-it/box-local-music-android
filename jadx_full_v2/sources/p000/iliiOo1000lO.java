            package p000;

            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.Base64;
            import android.util.Xml;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
            public abstract class iliiOo1000lO {
                public static Iliii01Iil I00000oIO(XmlResourceParser xmlResourceParser, Resources resources) {
                    int next;
                    int i;
                    int i2;
                    int i3;
                    TypedArray typedArray;
/* 11 */            do {
/* 3 */                 next = xmlResourceParser.next();
/* 8 */                 i = 2;
/* 9 */                 if (next == 2) {
                            break;
                        }
/* 11 */            } while (next != 1);
/* 14 */            if (next != 2) {
/* 900 */               throw new XmlPullParserException("No start tag found");
                    }
/* 21 */            xmlResourceParser.require(2, null, "font-family");
/* 32 */            if (!xmlResourceParser.getName().equals("font-family")) {
/* 464 */               I0000Il00O(xmlResourceParser);
/* 16 */                return null;
                    }
/* 40 */            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), OOilIO.I00000oOI);
/* 44 */            int i4 = 0;
/* 45 */            String string = typedArrayObtainAttributes.getString(0);
/* 50 */            String string2 = typedArrayObtainAttributes.getString(5);
/* 55 */            String string3 = typedArrayObtainAttributes.getString(6);
/* 59 */            String string4 = typedArrayObtainAttributes.getString(2);
/* 63 */            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
/* 67 */            int i5 = 3;
/* 68 */            int integer = typedArrayObtainAttributes.getInteger(3, 1);
/* 77 */            int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
/* 82 */            String string5 = typedArrayObtainAttributes.getString(7);
/* 86 */            typedArrayObtainAttributes.recycle();
/* 89 */            if (string == null || string2 == null) {
/* 271 */               ArrayList arrayList = new ArrayList();
/* 278 */               while (xmlResourceParser.next() != 3) {
/* 285 */                   if (xmlResourceParser.getEventType() == 2) {
/* 298 */                       if (xmlResourceParser.getName().equals("font")) {
/* 306 */                           TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), OOilIO.I0000Il00O);
/* 322 */                           int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
/* 346 */                           boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
/* 353 */                           int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
/* 366 */                           String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
/* 371 */                           int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
/* 384 */                           int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
/* 385 */                           int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
/* 389 */                           typedArrayObtainAttributes2.getString(i9);
/* 392 */                           typedArrayObtainAttributes2.recycle();
/* 399 */                           while (xmlResourceParser.next() != 3) {
/* 401 */                               I0000Il00O(xmlResourceParser);
                                    }
/* 407 */                           IliioI1oiI iliioI1oiI = new IliioI1oiI();
/* 410 */                           iliioI1oiI.I00000oIO = i6;
/* 412 */                           iliioI1oiI.I00000oOI = z;
/* 414 */                           iliioI1oiI.I0000Il00O = string6;
/* 416 */                           iliioI1oiI.I0000O = i8;
/* 418 */                           iliioI1oiI.I0000oI00 = resourceId2;
/* 420 */                           VarHandle.storeStoreFence();
/* 423 */                           arrayList.add(iliioI1oiI);
                                } else {
/* 430 */                           I0000Il00O(xmlResourceParser);
                                }
                            }
                        }
/* 439 */               if (arrayList.isEmpty()) {
/* 16 */                    return null;
                        }
/* 451 */               IliioI1oiI[] iliioI1oiIArr = (IliioI1oiI[]) arrayList.toArray(new IliioI1oiI[0]);
/* 453 */               IliiloiI1i iliiloiI1i = new IliiloiI1i();
/* 456 */               iliiloiI1i.I00000oIO = iliioI1oiIArr;
/* 458 */               VarHandle.storeStoreFence();
/* 461 */               return iliiloiI1i;
                    }
/* 93 */            List listI00000oOI = I00000oOI(resources, resourceId);
/* 99 */            ArrayList arrayList2 = new ArrayList();
/* 106 */           while (xmlResourceParser.next() != i5) {
/* 112 */               if (xmlResourceParser.getEventType() == i) {
/* 125 */                   if (xmlResourceParser.getName().equals("fallback")) {
/* 133 */                       TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), OOilIO.I0000O);
                                try {
/* 137 */                           String string7 = typedArrayObtainAttributes3.getString(i4);
/* 142 */                           String string8 = typedArrayObtainAttributes3.getString(1);
/* 146 */                           i3 = integer;
/* 147 */                           String string9 = typedArrayObtainAttributes3.getString(i);
/* 151 */                           if (string7 == null) {
/* 193 */                               typedArray = typedArrayObtainAttributes3;
/* 202 */                               throw new XmlPullParserException("query attribute must be set in fallback element");
                                    }
/* 157 */                           while (xmlResourceParser.next() != i5) {
/* 159 */                               I0000Il00O(xmlResourceParser);
                                    }
                                    try {
/* 172 */                               typedArray = typedArrayObtainAttributes3;
/* 174 */                               i2 = i5;
                                        try {
/* 177 */                                   IliiOI0I0 iliiOI0I0 = new IliiOI0I0(string, string2, string7, listI00000oOI, string8, string9);
/* 180 */                                   typedArray.recycle();
/* 183 */                                   arrayList2.add(iliiOI0I0);
                                        } catch (Throwable th) {
/* 187 */                                   th = th;
                                        }
                                    } catch (Throwable th2) {
/* 189 */                               th = th2;
/* 190 */                               typedArray = typedArrayObtainAttributes3;
                                    }
/* 187 */                           th = th;
                                } catch (Throwable th3) {
/* 163 */                           th = th3;
/* 164 */                           typedArray = typedArrayObtainAttributes3;
                                }
/* 203 */                       typedArray.recycle();
/* 206 */                       throw th;
                            }
/* 207 */                   i2 = i5;
/* 208 */                   i3 = integer;
/* 209 */                   I0000Il00O(xmlResourceParser);
/* 212 */                   i5 = i2;
/* 213 */                   integer = i3;
/* 214 */                   i = 2;
/* 215 */                   i4 = 0;
                        }
                    }
/* 217 */           int i10 = integer;
/* 222 */           if (!arrayList2.isEmpty()) {
/* 226 */               return new IliioIiloIOi(arrayList2, i10, integer2, string5);
                    }
/* 230 */           if (string3 == null) {
/* 264 */               I000II.I000iOII("The provider font XML requires query attribute or fallback children.");
/* 16 */                return null;
                    }
/* 240 */           arrayList2.add(new IliiOI0I0(string, string2, string3, listI00000oOI, null, null));
/* 243 */           if (string4 != null) {
/* 253 */               arrayList2.add(new IliiOI0I0(string, string2, string4, listI00000oOI, null, null));
                    }
/* 258 */           return new IliioIiloIOi(arrayList2, i10, integer2, string5);
                }

                public static List I00000oOI(Resources resources, int i) throws Resources.NotFoundException {
/* 1 */             if (i == 0) {
/* 3 */                 return Collections.EMPTY_LIST;
                    }
/* 6 */             TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
                    try {
/* 14 */                if (typedArrayObtainTypedArray.length() == 0) {
/* 16 */                    return Collections.EMPTY_LIST;
                        }
/* 26 */                ArrayList arrayList = new ArrayList();
/* 35 */                if (typedArrayObtainTypedArray.getType(0) == 1) {
/* 42 */                    for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
/* 44 */                        int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
/* 48 */                        if (resourceId != 0) {
/* 50 */                            String[] stringArray = resources.getStringArray(resourceId);
/* 56 */                            ArrayList arrayList2 = new ArrayList();
/* 61 */                            for (String str : stringArray) {
/* 69 */                                arrayList2.add(Base64.decode(str, 0));
                                    }
/* 75 */                            arrayList.add(arrayList2);
                                }
                            }
                        } else {
/* 81 */                    String[] stringArray2 = resources.getStringArray(i);
/* 87 */                    ArrayList arrayList3 = new ArrayList();
/* 92 */                    for (String str2 : stringArray2) {
/* 100 */                       arrayList3.add(Base64.decode(str2, 0));
                            }
/* 106 */                   arrayList.add(arrayList3);
                        }
/* 112 */               return arrayList;
                    } finally {
/* 113 */               typedArrayObtainTypedArray.recycle();
                    }
                }

                public static void I0000Il00O(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
/* 1 */             int i = 1;
/* 2 */             while (i > 0) {
/* 4 */                 int next = xmlPullParser.next();
/* 9 */                 if (next == 2) {
/* 18 */                    i++;
                        } else if (next == 3) {
                            i--;
                        }
                    }
                }
            }
