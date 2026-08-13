            package p000;

            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import com.google.ai.edge.gallery.data.Accelerator;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
            public abstract class O1oOO0O1l0 {
                public static final List I00000oIO;
                public static final List I00000oOI;

                static {
/* 11 */            List listI000O01llI0 = IOOi1I.I000O01llI0(Accelerator.CPU, Accelerator.GPU, Accelerator.NPU);
/* 15 */            I00000oIO = listI000O01llI0;
/* 21 */            O0iO0Oii0o00 o0iO0Oii0o00 = new O0iO0Oii0o00(iIIiO0.I00111O);
/* 28 */            O0iO0Oii0o00 o0iO0Oii0o002 = new O0iO0Oii0o00(iIIiO0.I001IIilI0O);
/* 33 */            ValueType valueType = ValueType.INT;
/* 44 */            OIOOoO1O1oO oIOOoO1O1oO = new OIOOoO1O1oO(iIIiO0.I0000oI00, 100.0f, 32768.0f, 1024.0f, valueType, true);
/* 59 */            OIOOoO1O1oO oIOOoO1O1oO2 = new OIOOoO1O1oO(iIIiO0.I0001Ioi1lo, 5.0f, 40.0f, 64.0f, valueType, true);
/* 64 */            ValueType valueType2 = ValueType.FLOAT;
/* 75 */            OIOOoO1O1oO oIOOoO1O1oO3 = new OIOOoO1O1oO(iIIiO0.I000II, 0.0f, 1.0f, 0.95f, valueType2, true);
/* 89 */            OIOOoO1O1oO oIOOoO1O1oO4 = new OIOOoO1O1oO(iIIiO0.I000O01llI0, 0.0f, 2.0f, 1.0f, valueType2, true);
/* 96 */            II11OlOIOOOl iI11OlOIOOOl = new II11OlOIOOOl(iIIiO0.I000OOo1O);
/* 103 */           II11OlOIOOOl iI11OlOIOOOl2 = new II11OlOIOOOl(iIIiO0.I000OiO);
/* 110 */           II11OlOIOOOl iI11OlOIOOOl3 = new II11OlOIOOOl(iIIiO0.I000iOII);
/* 117 */           II11OlOIOOOl iI11OlOIOOOl4 = new II11OlOIOOOl(iIIiO0.I000l1);
/* 124 */           II11OlOIOOOl iI11OlOIOOOl5 = new II11OlOIOOOl(iIIiO0.I000o00OoI0I);
/* 134 */           String label = ((Accelerator) listI000O01llI0.get(0)).getLabel();
/* 138 */           List list = listI000O01llI0;
/* 150 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 153 */           Iterator it = list.iterator();
/* 161 */           while (it.hasNext()) {
/* 173 */               arrayList.add(((Accelerator) it.next()).getLabel());
                    }
/* 231 */           I00000oOI = IOOi1I.I000O01llI0(o0iO0Oii0o00, o0iO0Oii0o002, oIOOoO1O1oO, oIOOoO1O1oO2, oIOOoO1O1oO3, oIOOoO1O1oO4, iI11OlOIOOOl, iI11OlOIOOOl2, iI11OlOIOOOl3, iI11OlOIOOOl4, iI11OlOIOOOl5, new Oii1lO01il(iIIiO0.I00100o1O0lo, label, arrayList, true));
                }

                public static final void I00000oIO(Uri uri, IllOOo00lI illOOo00lI, Function1 function1, Map map, IloI0lOlll1 iloI0lOlll1, int i) {
                    Uri uri2;
                    IllOOo00lI illOOo00lI2;
                    Map map2;
                    Object oIoi0IIoi;
                    String string;
                    long j;
/* 12 */            iloI0lOlll1.I00i0O(-68936022);
/* 19 */            int i2 = 4;
/* 27 */            int i3 = i | (iloI0lOlll1.I000OOo1O(uri) ? 4 : 2) | 3072;
/* 44 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) != 1170)) {
/* 52 */                Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 54 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 58 */                Object obj = IOl11li.I00000oIO;
/* 60 */                if (objI00O0i0ii == obj) {
/* 70 */                    String str = "";
/* 72 */                    long j2 = 0;
                            try {
/* 81 */                        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_size", "_display_name"}, null, null, null);
/* 85 */                        if (cursorQuery != null) {
                                    try {
/* 91 */                                if (cursorQuery.moveToFirst()) {
/* 97 */                                    j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
/* 105 */                                   string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                                        } else {
/* 70 */                                    string = "";
/* 114 */                                   j = 0;
                                        }
/* 115 */                               cursorQuery.close();
/* 118 */                               j2 = j;
/* 119 */                               str = string;
                                    } finally {
                                    }
                                }
/* 135 */                       oIoi0IIoi = new OIoi0IIoi(Long.valueOf(j2), str);
                            } catch (Exception e) {
/* 140 */                       e.printStackTrace();
/* 149 */                       oIoi0IIoi = new OIoi0IIoi(0L, "");
                            }
/* 138 */                   objI00O0i0ii = oIoi0IIoi;
/* 153 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 156 */               OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) objI00O0i0ii;
/* 158 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 162 */               if (objI00O0i0ii2 == obj) {
/* 174 */                   Object oIool0l11 = new OIool0l11(((Number) oIoi0IIoi2.I00iOIl).longValue());
/* 177 */                   iloI0lOlll1.I00iio(oIool0l11);
/* 180 */                   objI00O0i0ii2 = oIool0l11;
                        }
/* 181 */               OIool0l11 oIool0l112 = (OIool0l11) objI00O0i0ii2;
/* 183 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 187 */               if (objI00O0i0ii3 == obj) {
/* 191 */                   String str2 = (String) oIoi0IIoi2.I00iiI;
/* 193 */                   OIo1i1 oIo1i1 = OollloolI.I00000oIO;
/* 211 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Pattern.compile("[^a-zA-Z0-9._-]").matcher(str2).replaceAll("_"));
/* 215 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 218 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii3;
/* 220 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 224 */               map2 = Il011I1OiO0I.I00iOIl;
                        Object obj2 = objI00O0i0ii4;
/* 226 */               if (objI00O0i0ii4 == obj) {
/* 230 */                   LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 243 */                   for (IOlOo10O0l0 iOlOo10O0l0 : I00000oOI) {
/* 261 */                       linkedHashMap.put(iOlOo10O0l0.I00000oOI().I00000oOI, iOlOo10O0l0.I00000oIO());
                            }
/* 273 */                   linkedHashMap.put("Name", (String) oI10i0Il.getValue());
/* 280 */                   linkedHashMap.put("Model type", "LLM");
/* 295 */                   for (Map.Entry entry : map2.entrySet()) {
/* 315 */                       linkedHashMap.put(((IOllO1I) entry.getKey()).I00000oOI, entry.getValue());
                            }
/* 319 */                   iloI0lOlll1.I00iio(linkedHashMap);
                            obj2 = linkedHashMap;
                        }
/* 322 */               Map map3 = (Map) obj2;
/* 324 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii5;
/* 328 */               if (objI00O0i0ii5 == obj) {
/* 332 */                   Ol1o1llOII ol1o1llOII = new Ol1o1llOII();
/* 335 */                   ol1o1llOII.putAll(map3);
/* 338 */                   iloI0lOlll1.I00iio(ol1o1llOII);
                            obj3 = ol1o1llOII;
                        }
/* 341 */               Ol1o1llOII ol1o1llOII2 = (Ol1o1llOII) obj3;
/* 343 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 347 */               if (objI00O0i0ii6 == obj) {
/* 349 */                   objI00O0i0ii6 = l001l0.I00000oIO();
/* 353 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 360 */               O1i0oIO o1i0oIO = new O1i0oIO(i2);
/* 363 */               o1i0oIO.I00iiI = (OI0lOIiOIOOo) objI00O0i0ii6;
/* 365 */               o1i0oIO.I00iiO = ol1o1llOII2;
/* 367 */               o1i0oIO.I00iio = illOOo00lI;
/* 369 */               o1i0oIO.I00ilO0 = function1;
/* 371 */               o1i0oIO.I00ilI0I1 = oI10i0Il;
/* 373 */               o1i0oIO.I00io1l = oIool0l112;
/* 375 */               VarHandle.storeStoreFence();
/* 389 */               illOOo00lI2 = illOOo00lI;
/* 392 */               uri2 = uri;
/* 394 */               iOIlI11IO.I00000oIO(illOOo00lI2, null, iiioOl1O.I00000oOI(2127326081, o1i0oIO, iloI0lOlll1), iloI0lOlll1, 390, 2);
                    } else {
/* 398 */               uri2 = uri;
/* 399 */               illOOo00lI2 = illOOo00lI;
/* 400 */               iloI0lOlll1.I00OilO00Il();
/* 403 */               map2 = map;
                    }
/* 405 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 409 */           if (oOloioIlI001IO000 != null) {
/* 415 */               O11iol o11iol = new O11iol(24);
/* 418 */               o11iol.I00iiI = uri2;
/* 420 */               o11iol.I00iiO = illOOo00lI2;
/* 422 */               o11iol.I00iio = function1;
/* 424 */               o11iol.I00ilI0I1 = map2;
/* 426 */               VarHandle.storeStoreFence();
/* 429 */               oOloioIlI001IO000.I0000O = o11iol;
                    }
                }

                public static final void I00000oOI(Uri uri, Ioiol1OIol ioiol1OIol, IllOOo00lI illOOo00lI, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
                    Ioiol1OIol ioiol1OIol2;
                    Uri uri2;
                    Function1 function12;
                    IllOOo00lI illOOo00lI2;
/* 14 */            iloI0lOlll1.I00i0O(387225077);
/* 54 */            int i2 = i | (iloI0lOlll1.I000OOo1O(uri) ? 4 : 2) | (iloI0lOlll1.I000II(ioiol1OIol) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(function1) ? 2048 : Barcode.FORMAT_UPC_E);
/* 70 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 72 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 76 */                Object obj = IOl11li.I00000oIO;
/* 78 */                if (objI00O0i0ii == obj) {
/* 82 */                    objI00O0i0ii = lOO00IiI0li.I00000oIO("");
/* 86 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 89 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 97 */                Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 99 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 103 */               if (objI00O0i0ii2 == obj) {
/* 105 */                   objI00O0i0ii2 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 109 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 112 */               Ii0110 ii0110 = (Ii0110) objI00O0i0ii2;
/* 114 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 118 */               if (objI00O0i0ii3 == obj) {
/* 123 */                   objI00O0i0ii3 = new OIooO1iiliI(0.0f);
/* 126 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 129 */               OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) objI00O0i0ii3;
/* 161 */               boolean zI000OOo1O = ((i2 & 112) == 32) | iloI0lOlll1.I000OOo1O(context) | iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(uri) | ((i2 & 7168) == 2048);
/* 163 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 167 */               if (zI000OOo1O || objI00O0i0ii4 == obj) {
/* 183 */                   Object i1iIiii = new I1iIiii(context, ii0110, ioiol1OIol, uri, function1, oIooO1iiliI, oI10i0Il, (IOoil1iiIilo) null);
/* 186 */                   function12 = function1;
/* 187 */                   oI10i0Il = oI10i0Il;
/* 188 */                   ioiol1OIol2 = ioiol1OIol;
/* 189 */                   uri2 = uri;
/* 190 */                   iloI0lOlll1.I00iio(i1iIiii);
/* 193 */                   objI00O0i0ii4 = i1iIiii;
                        } else {
/* 172 */                   ioiol1OIol2 = ioiol1OIol;
/* 173 */                   uri2 = uri;
/* 174 */                   function12 = function1;
                        }
/* 198 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii4, iloI0lOlll1, OoiIlOl1iI.I00000oIO);
/* 203 */               Iii0io0OooO iii0io0OooO = new Iii0io0OooO(4);
/* 210 */               O11iol o11iol = new O11iol(22);
/* 213 */               o11iol.I00iiI = oI10i0Il;
/* 215 */               o11iol.I00iiO = ioiol1OIol2;
/* 217 */               o11iol.I00iio = oIooO1iiliI;
/* 219 */               o11iol.I00ilI0I1 = illOOo00lI;
/* 221 */               VarHandle.storeStoreFence();
/* 235 */               illOOo00lI2 = illOOo00lI;
/* 237 */               iOIlI11IO.I00000oIO(illOOo00lI2, iii0io0OooO, iiioOl1O.I00000oOI(374087294, o11iol, iloI0lOlll1), iloI0lOlll1, 438, 0);
                    } else {
/* 241 */               ioiol1OIol2 = ioiol1OIol;
/* 242 */               uri2 = uri;
/* 243 */               function12 = function1;
/* 244 */               illOOo00lI2 = illOOo00lI;
/* 245 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 248 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 252 */           if (oOloioIlI001IO000 != null) {
/* 258 */               O11iol o11iol2 = new O11iol(23);
/* 261 */               o11iol2.I00iiI = uri2;
/* 263 */               o11iol2.I00iiO = ioiol1OIol2;
/* 265 */               o11iol2.I00iio = illOOo00lI2;
/* 267 */               o11iol2.I00ilI0I1 = function12;
/* 269 */               VarHandle.storeStoreFence();
/* 272 */               oOloioIlI001IO000.I0000O = o11iol2;
                    }
                }
            }
