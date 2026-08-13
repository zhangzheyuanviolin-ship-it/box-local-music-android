            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Array;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public abstract class Oolli0oi0 {
                public static final Ill0IO I00000oIO = new Ill0IO("kotlin.jvm.JvmStatic");
                public static final String I00000oOI;

                static {
/* 12 */            StringBuilder sb = new StringBuilder();
/* 15 */            Illo0liIIii illo0liIIii = Illo0liIIii.I0000Il00O;
/* 23 */            sb.append(illo0liIIii.I00000oIO.I00000oIO.I00000oIO);
/* 28 */            sb.append('.');
/* 33 */            sb.append(illo0liIIii.I00000oOI);
/* 40 */            I00000oOI = sb.toString();
                }

                public static final IiO10i1 I00000oIO(Object obj) {
/* 3 */             if (obj instanceof IiO10i1) {
/* 5 */                 return (IiO10i1) obj;
                    }
/* 10 */            if (!(obj instanceof IIiO0l1Oiloi)) {
/* 25 */                return null;
                    }
/* 14 */            O0IOl1llI1I o0IOl1llI1II0000O = ((IIiO0l1Oiloi) obj).I0000O();
/* 20 */            if (o0IOl1llI1II0000O instanceof IiO10i1) {
/* 22 */                return (IiO10i1) o0IOl1llI1II0000O;
                    }
/* 25 */            return null;
                }

                public static final List I00000oOI(I1110ii00 i1110ii00) {
                    Annotation annotationI000II;
/* 1 */             I11IlOOO<I111oOiIiO0> annotations = i1110ii00.getAnnotations();
/* 7 */             ArrayList arrayList = new ArrayList();
/* 18 */            for (I111oOiIiO0 i111oOiIiO0 : annotations) {
/* 26 */                OlI1o0ooI olI1o0ooII0010I0i = i111oOiIiO0.I0010I0i();
/* 32 */                if (olI1o0ooII0010I0i instanceof OOo1Il01OliO) {
/* 36 */                    annotationI000II = ((OOo1Il01OliO) olI1o0ooII0010I0i).I00iOIl;
                        } else if (olI1o0ooII0010I0i instanceof OiII0Oi) {
/* 45 */                    OOoI1O oOoI1O = ((OiII0Oi) olI1o0ooII0010I0i).I00iOIl;
/* 55 */                    OOo1O1i oOo1O1i = oOoI1O instanceof OOo1O1i ? (OOo1O1i) oOoI1O : null;
/* 61 */                    annotationI000II = oOo1O1i != null ? oOo1O1i.I00000oIO : null;
                        } else {
/* 63 */                    annotationI000II = I000II(i111oOiIiO0);
                        }
/* 67 */                if (annotationI000II != null) {
/* 69 */                    arrayList.add(annotationI000II);
                        }
                    }
/* 73 */            return I000OiO(arrayList);
                }

                public static final Object I0000Il00O(Type type) {
/* 4 */             if (type instanceof Class) {
/* 7 */                 Class cls = (Class) type;
/* 13 */                if (cls.isPrimitive()) {
/* 21 */                    if (cls.equals(Boolean.TYPE)) {
/* 23 */                        return Boolean.FALSE;
                            }
/* 33 */                    if (cls.equals(Character.TYPE)) {
/* 35 */                        return (char) 0;
                            }
/* 46 */                    if (cls.equals(Byte.TYPE)) {
/* 48 */                        return (byte) 0;
                            }
/* 59 */                    if (cls.equals(Short.TYPE)) {
/* 61 */                        return (short) 0;
                            }
/* 72 */                    if (cls.equals(Integer.TYPE)) {
/* 74 */                        return 0;
                            }
/* 85 */                    if (cls.equals(Float.TYPE)) {
/* 88 */                        return Float.valueOf(0.0f);
                            }
/* 99 */                    if (cls.equals(Long.TYPE)) {
/* 103 */                       return 0L;
                            }
/* 114 */                   if (cls.equals(Double.TYPE)) {
/* 118 */                       return Double.valueOf(0.0d);
                            }
/* 129 */                   if (cls.equals(Void.TYPE)) {
/* 133 */                       I000II.I001IO000("Parameter with void type is illegal");
/* 3 */                         return null;
                            }
/* 139 */                   OoOil11Ol1o.I000iOII("Unknown primitive: ", type);
                        }
                    }
/* 3 */             return null;
                }

                public static final IIiIoIl11IO I0000O(Class cls, Io000liOIo io000liOIo, OI1IlOlol oI1IlOlol, Oi0Oooi oi0Oooi, II0O0I00oOi iI0O0I00oOi, IlliIl1l11O illiIl1l11O) {
                    List list;
/* 1 */             OiII0Iii oiII0IiiI00000oIO = OI0010i.I00000oIO(cls);
/* 7 */             if (io000liOIo instanceof OOOll1o0) {
/* 12 */                list = ((OOOll1o0) io000liOIo).I00l0I0l0lO1;
                    } else {
/* 18 */                if (!(io000liOIo instanceof OOOo0i11Ol)) {
/* 61 */                    IOOlIIilOl0.I000lI("Unsupported message: ", io000liOIo);
/* 64 */                    return null;
                        }
/* 23 */                list = ((OOOo0i11Ol) io000liOIo).I00l0I0l0lO1;
                    }
/* 14 */            List list2 = list;
/* 28 */            Ii10lIo0l1 ii10lIo0l1 = oiII0IiiI00000oIO.I00000oIO;
/* 56 */            return (IIiIoIl11IO) illiIl1l11O.invoke(new O1iiIOlO(new IiOili0lOO1(ii10lIo0l1, oI1IlOlol, (OI0010oo1o) ii10lIo0l1.I00000oOI, oi0Oooi, OooO111lO1OI.I00000oOI, iI0O0I00oOi, null, null, list2)), io000liOIo);
                }

                public static final boolean I0000oI00(IiOOIlll iiOOIlll) {
/* 1 */             O0IiIl0il o0IiIl0ilI001IIilI0O = iiOOIlll.I001IIilI0O();
/* 13 */            O0Ii1IOoiO o0Ii1IOoiO = o0IiIl0ilI001IIilI0O instanceof O0Ii1IOoiO ? (O0Ii1IOoiO) o0IiIl0ilI001IIilI0O : null;
/* 15 */            if (o0Ii1IOoiO == null || !o0Ii1IOoiO.I000o00OoI0I()) {
/* 14 */                return false;
                    }
/* 23 */            O0OoII0ii1li o0OoII0ii1liI00O0i0ii = o0Ii1IOoiO.I00O0i0ii();
                    return (o0OoII0ii1liI00O0i0ii != null ? o0OoII0ii1liI00O0i0ii.I000lI : null) == null;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                public static final Class I0001Ioi1lo(ClassLoader classLoader, IOIOill iOIOill, int i) {
/* 5 */             Ill0OI0lo ill0OI0lo = iOIOill.I00000oIO().I00000oIO;
/* 7 */             String str = ill0OI0lo.I00000oIO;
/* 17 */            Integer numI000lI = OlOolloIIOl0.I000lI(10, OlOoOIi0o.I00Iooi00oi(str, I00000oOI, str));
/* 21 */            if (numI000lI != null) {
/* 23 */                int iIntValue = numI000lI.intValue();
/* 27 */                Illo01lli illo01lli = Illo01lli.I0000Il00O;
/* 42 */                return I0001Ioi1lo(classLoader, new IOIOill(illo01lli.I00000oIO, illo01lli.I00000oIO(iIntValue + 1)), i);
                    }
/* 47 */            String str2 = O00oO0liO11.I00000oIO;
/* 49 */            IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(ill0OI0lo);
/* 53 */            if (iOIOillI000O01llI0 == null) {
/* 55 */                iOIOillI000O01llI0 = iOIOill;
                    }
/* 60 */            if (!iOIOillI000O01llI0.equals(iOIOill)) {
/* 64 */                classLoader = OOo1Io0I0.I0000O(OoiIlOl1iI.class);
                    }
/* 72 */            String str3 = iOIOillI000O01llI0.I00000oIO.I00000oIO.I00000oIO;
/* 78 */            String str4 = iOIOillI000O01llI0.I00000oOI.I00000oIO.I00000oIO;
/* 86 */            if (O0000Ioio00.I0000O(str3, "kotlin")) {
                        switch (str4.hashCode()) {
                            case -901856463:
/* 199 */                       if (str4.equals("BooleanArray")) {
/* 202 */                           return boolean[].class;
                                }
                                break;
                            case -763279523:
/* 187 */                       if (str4.equals("ShortArray")) {
/* 190 */                           return short[].class;
                                }
                                break;
                            case -755911549:
/* 175 */                       if (str4.equals("CharArray")) {
/* 178 */                           return char[].class;
                                }
                                break;
                            case -74930671:
/* 163 */                       if (str4.equals("ByteArray")) {
/* 166 */                           return byte[].class;
                                }
                                break;
                            case 22374632:
/* 151 */                       if (str4.equals("DoubleArray")) {
/* 154 */                           return double[].class;
                                }
                                break;
                            case 63537721:
/* 139 */                       if (str4.equals("Array")) {
/* 142 */                           return Object[].class;
                                }
                                break;
                            case 601811914:
/* 127 */                       if (str4.equals("IntArray")) {
/* 130 */                           return int[].class;
                                }
                                break;
                            case 948852093:
/* 115 */                       if (str4.equals("FloatArray")) {
/* 118 */                           return float[].class;
                                }
                                break;
                            case 2104330525:
/* 103 */                       if (str4.equals("LongArray")) {
/* 106 */                           return long[].class;
                                }
                                break;
                        }
                    }
/* 207 */           StringBuilder sb = new StringBuilder();
/* 210 */           if (i > 0) {
/* 213 */               for (int i2 = 0; i2 < i; i2++) {
/* 217 */                   sb.append("[");
                        }
/* 225 */               sb.append(OlIo0Ooi1loI.I001IIilI0O);
                    }
/* 232 */           if (str3.length() > 0) {
/* 240 */               sb.append(str3.concat("."));
                    }
/* 251 */           sb.append(str4.replace('.', '$'));
/* 254 */           if (i > 0) {
/* 258 */               sb.append(";");
                    }
/* 265 */           return lIlIilIioI.I00000oIO(classLoader, sb.toString());
                }

                public static final Annotation I000II(I111oOiIiO0 i111oOiIiO0) {
/* 1 */             OI000ilOol oI000ilOolI0000O = IiOiOOIo.I0000O(i111oOiIiO0);
/* 13 */            Class clsI000O01llI0 = oI000ilOolI0000O != null ? I000O01llI0(oI000ilOolI0000O) : null;
/* 14 */            if (clsI000O01llI0 == null) {
/* 17 */                clsI000O01llI0 = null;
                    }
/* 18 */            if (clsI000O01llI0 == null) {
/* 5 */                 return null;
                    }
/* 25 */            Set<Map.Entry> setEntrySet = i111oOiIiO0.I00111O().entrySet();
/* 33 */            ArrayList arrayList = new ArrayList();
/* 44 */            for (Map.Entry entry : setEntrySet) {
/* 56 */                OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) entry.getKey();
/* 68 */                Object objI000OOo1O = I000OOo1O((IOo0i1) entry.getValue(), clsI000O01llI0.getClassLoader());
/* 84 */                OIoi0IIoi oIoi0IIoi = objI000OOo1O != null ? new OIoi0IIoi(oI1Iio0ii1.I00000oOI(), objI000OOo1O) : null;
/* 85 */                if (oIoi0IIoi != null) {
/* 87 */                    arrayList.add(oIoi0IIoi);
                        }
                    }
/* 99 */            return (Annotation) iOO0O10.I00000oOI(clsI000O01llI0, O1Oii0O0loo.I000OiO(arrayList));
                }

                public static final Class I000O01llI0(OI000ilOol oI000ilOol) {
/* 1 */             OlI1o0ooI olI1o0ooII0010I0i = oI000ilOol.I0010I0i();
/* 7 */             if (olI1o0ooII0010I0i instanceof O0iIIIiiO) {
/* 13 */                return ((O0iIIIiiO) olI1o0ooII0010I0i).I00iOIl.I00000oIO;
                    }
/* 18 */            if (olI1o0ooII0010I0i instanceof OiII0Oi) {
/* 26 */                return ((OOo1oliI) ((OiII0Oi) olI1o0ooII0010I0i).I00iOIl).I00000oIO;
                    }
/* 29 */            IOIOill iOIOillI0001Ioi1lo = IiOiOOIo.I0001Ioi1lo(oI000ilOol);
/* 33 */            if (iOIOillI0001Ioi1lo == null) {
/* 35 */                return null;
                    }
/* 46 */            return I0001Ioi1lo(OOo1Io0I0.I0000O(oI000ilOol.getClass()), iOIOillI0001Ioi1lo, 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final Object I000OOo1O(IOo0i1 iOo0i1, ClassLoader classLoader) {
                    Class clsI0001Ioi1lo;
/* 3 */             if (iOo0i1 instanceof I11IOOl1IolO) {
/* 11 */                return I000II((I111oOiIiO0) ((I11IOOl1IolO) iOo0i1).I00000oIO);
                    }
/* 18 */            int i = 0;
/* 20 */            if (iOo0i1 instanceof I1IoIo1O0) {
/* 22 */                I1IoIo1O0 i1IoIo1O0 = (I1IoIo1O0) iOo0i1;
/* 32 */                OoOl0o110 ooOl0o110 = i1IoIo1O0 instanceof OoOl0o110 ? (OoOl0o110) i1IoIo1O0 : null;
/* 33 */                if (ooOl0o110 != null) {
/* 35 */                    O0iIl1 o0iIl1 = ooOl0o110.I0000Il00O;
/* 37 */                    Object obj = i1IoIo1O0.I00000oIO;
/* 40 */                    Iterable iterable = (Iterable) obj;
/* 50 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 53 */                    Iterator it = iterable.iterator();
/* 61 */                    while (it.hasNext()) {
/* 73 */                        arrayList.add(I000OOo1O((IOo0i1) it.next(), classLoader));
                            }
/* 77 */                    OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 83 */                    IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 91 */                    OOIil01OI oOIil01OII0010I0i = iOIiO1lIl0lI00100o1O0lo == null ? null : O0i1lI0o1io.I0010I0i(iOIiO1lIl0lI00100o1O0lo);
                            switch (oOIil01OII0010I0i == null ? -1 : OollOoII.I00000oIO[oOIil01OII0010I0i.ordinal()]) {
                                case -1:
/* 326 */                           if (!O0i1lI0o1io.I001iOo1i0O(o0iIl1)) {
/* 464 */                               IoOOl0iOl1io.I001lIiIIo1O("Not an array type: ", o0iIl1);
/* 19 */                                return null;
                                    }
/* 338 */                           O0iIl1 o0iIl1I00000oOI = ((OoOi1Ol) IOOi0Ool1i.I00OilO00Il(o0iIl1.I00OIl())).I00000oOI();
/* 346 */                           IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = o0iIl1I00000oOI.I00iOIl().I00100o1O0lo();
/* 357 */                           OI000ilOol oI000ilOol = iOIiO1lIl0lI00100o1O0lo2 instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo2 : null;
/* 358 */                           if (oI000ilOol == null) {
/* 458 */                               IOOlIIilOl0.I000lI("Not a class type: ", o0iIl1I00000oOI);
/* 19 */                                return null;
                                    }
/* 364 */                           if (O0i1lI0o1io.I00IO1oi11O(o0iIl1I00000oOI)) {
/* 368 */                               int size = ((List) obj).size();
/* 372 */                               String[] strArr = new String[size];
/* 374 */                               while (i < size) {
/* 380 */                                   strArr[i] = arrayList.get(i);
/* 382 */                                   i++;
                                        }
/* 385 */                               return strArr;
                                    }
/* 392 */                           if (O0i1lI0o1io.I00000oOI(oI000ilOol, OlIllOO11lOl.I00O0i0ii)) {
/* 396 */                               int size2 = ((List) obj).size();
/* 400 */                               Class[] clsArr = new Class[size2];
/* 402 */                               while (i < size2) {
/* 408 */                                   clsArr[i] = arrayList.get(i);
/* 410 */                                   i++;
                                        }
/* 413 */                               return clsArr;
                                    }
/* 414 */                           IOIOill iOIOillI0001Ioi1lo = IiOiOOIo.I0001Ioi1lo(oI000ilOol);
/* 418 */                           if (iOIOillI0001Ioi1lo != null && (clsI0001Ioi1lo = I0001Ioi1lo(classLoader, iOIOillI0001Ioi1lo, 0)) != null) {
/* 438 */                               Object[] objArr = (Object[]) Array.newInstance((Class<?>) clsI0001Ioi1lo, ((List) obj).size());
/* 440 */                               int size3 = arrayList.size();
/* 444 */                               while (i < size3) {
/* 450 */                                   objArr[i] = arrayList.get(i);
/* 452 */                                   i++;
                                        }
/* 455 */                               return objArr;
                                    }
                                    break;
                                case 0:
                                default:
/* 110 */                           I000II.I00000oIO();
/* 19 */                            return null;
                                case 1:
/* 298 */                           int size4 = ((List) obj).size();
/* 302 */                           boolean[] zArr = new boolean[size4];
/* 304 */                           while (i < size4) {
/* 316 */                               zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
/* 318 */                               i++;
                                    }
/* 321 */                           return zArr;
                                case 2:
/* 272 */                           int size5 = ((List) obj).size();
/* 276 */                           char[] cArr = new char[size5];
/* 278 */                           while (i < size5) {
/* 290 */                               cArr[i] = ((Character) arrayList.get(i)).charValue();
/* 292 */                               i++;
                                    }
/* 295 */                           return cArr;
                                case 3:
/* 246 */                           int size6 = ((List) obj).size();
/* 250 */                           byte[] bArr = new byte[size6];
/* 252 */                           while (i < size6) {
/* 264 */                               bArr[i] = ((Byte) arrayList.get(i)).byteValue();
/* 266 */                               i++;
                                    }
/* 269 */                           return bArr;
                                case 4:
/* 220 */                           int size7 = ((List) obj).size();
/* 224 */                           short[] sArr = new short[size7];
/* 226 */                           while (i < size7) {
/* 238 */                               sArr[i] = ((Short) arrayList.get(i)).shortValue();
/* 240 */                               i++;
                                    }
/* 243 */                           return sArr;
                                case 5:
/* 194 */                           int size8 = ((List) obj).size();
/* 198 */                           int[] iArr = new int[size8];
/* 200 */                           while (i < size8) {
/* 212 */                               iArr[i] = ((Integer) arrayList.get(i)).intValue();
/* 214 */                               i++;
                                    }
/* 217 */                           return iArr;
                                case 6:
/* 168 */                           int size9 = ((List) obj).size();
/* 172 */                           float[] fArr = new float[size9];
/* 174 */                           while (i < size9) {
/* 186 */                               fArr[i] = ((Float) arrayList.get(i)).floatValue();
/* 188 */                               i++;
                                    }
/* 191 */                           return fArr;
                                case 7:
/* 142 */                           int size10 = ((List) obj).size();
/* 146 */                           long[] jArr = new long[size10];
/* 148 */                           while (i < size10) {
/* 160 */                               jArr[i] = ((Long) arrayList.get(i)).longValue();
/* 162 */                               i++;
                                    }
/* 165 */                           return jArr;
                                case 8:
/* 116 */                           int size11 = ((List) obj).size();
/* 120 */                           double[] dArr = new double[size11];
/* 122 */                           while (i < size11) {
/* 134 */                               dArr[i] = ((Double) arrayList.get(i)).doubleValue();
/* 136 */                               i++;
                                    }
/* 139 */                           return dArr;
                            }
                        }
                    } else if (iOo0i1 instanceof Il0o0Oii0I) {
/* 476 */               OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) ((Il0o0Oii0I) iOo0i1).I00000oIO;
/* 480 */               IOIOill iOIOill = (IOIOill) oIoi0IIoi.I00iOIl;
/* 484 */               OI1Iio0ii1 oI1Iio0ii12 = (OI1Iio0ii1) oIoi0IIoi.I00iiI;
/* 486 */               Class clsI0001Ioi1lo2 = I0001Ioi1lo(classLoader, iOIOill, 0);
/* 490 */               if (clsI0001Ioi1lo2 != null) {
/* 496 */                   return Enum.valueOf(clsI0001Ioi1lo2, oI1Iio0ii12.I00000oOI());
                        }
                    } else {
/* 503 */               if (!(iOo0i1 instanceof O0IiIOO)) {
/* 566 */                   if ((iOo0i1 instanceof Il0ool10) || (iOo0i1 instanceof OIOOIOl)) {
/* 19 */                        return null;
                            }
/* 573 */                   return iOo0i1.I00000oOI();
                        }
/* 509 */               O0Ii1oOl01 o0Ii1oOl01 = (O0Ii1oOl01) ((O0IiIOO) iOo0i1).I00000oIO;
/* 513 */               if (o0Ii1oOl01 instanceof O0Ii1li1lo) {
/* 517 */                   IOIOo1o iOIOo1o = ((O0Ii1li1lo) o0Ii1oOl01).I00000oIO;
/* 523 */                   return I0001Ioi1lo(classLoader, iOIOo1o.I00000oIO, iOIOo1o.I00000oOI);
                        }
/* 530 */               if (!(o0Ii1oOl01 instanceof O0Ii1O0ioiiI)) {
/* 560 */                   I000II.I00000oIO();
/* 19 */                    return null;
                        }
/* 540 */               IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo3 = ((O0Ii1O0ioiiI) o0Ii1oOl01).I00000oIO.I00iOIl().I00100o1O0lo();
/* 551 */               OI000ilOol oI000ilOol2 = iOIiO1lIl0lI00100o1O0lo3 instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo3 : null;
/* 552 */               if (oI000ilOol2 != null) {
/* 554 */                   return I000O01llI0(oI000ilOol2);
                        }
                    }
/* 19 */            return null;
                }

                public static final List I000OiO(ArrayList arrayList) {
/* 5 */             if (!arrayList.isEmpty()) {
/* 9 */                 Iterator it = arrayList.iterator();
/* 17 */                while (it.hasNext()) {
/* 45 */                    if (((IOIO10iOi1) l0O00Ol.I00000oIO((Annotation) it.next())).I001l0I00().getSimpleName().equals("Container")) {
/* 49 */                        ArrayList arrayList2 = new ArrayList();
/* 52 */                        Iterator it2 = arrayList.iterator();
/* 60 */                        while (it2.hasNext()) {
/* 66 */                            Annotation annotation = (Annotation) it2.next();
/* 74 */                            Class clsI001l0I00 = ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00();
/* 120 */                           IOOii0O10Io0.I00100l0(arrayList2, (!clsI001l0I00.getSimpleName().equals("Container") || clsI001l0I00.getAnnotation(Oi011Il0io00.class) == null) ? Collections.singletonList(annotation) : Arrays.asList((Annotation[]) clsI001l0I00.getDeclaredMethod("value", null).invoke(annotation, null)));
                                }
/* 124 */                       return arrayList2;
                            }
                        }
                    }
/* 186 */           return arrayList;
                }
            }
