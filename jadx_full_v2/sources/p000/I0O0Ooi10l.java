            package p000;

            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import android.provider.DocumentsContract;
            import android.text.TextUtils;
            import android.util.Log;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
/* 17 */    public final class I0O0Ooi10l extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0O0Ooi10l(Ol0o1OiOIIIl ol0o1OiOIIIl, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, Ol1o1llOII ol1o1llOII, OI10i0Il oI10i0Il3, IOoil1iiIilo iOoil1iiIilo) {
/* 15 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 0;
/* 4 */             this.I00iiI = ol0o1OiOIIIl;
/* 6 */             this.I00iiO = oI10i0Il;
/* 8 */             this.I00iio = oI10i0Il2;
/* 10 */            this.I00ilO0 = ol1o1llOII;
/* 12 */            this.I00ilI0I1 = oI10i0Il3;
                }

                public static final void I00000oIO(Ol0o1OiOIIIl ol0o1OiOIIIl, OoIOol ooIOol, File file) throws Throwable {
/* 3 */             Context context = (Context) ooIOol.I00iiI;
/* 7 */             Uri uri = (Uri) ooIOol.I00iiO;
/* 23 */            if ("vnd.android.document/directory".equals(il1l0Ioi1ll.I00000oOI(context, uri, "mime_type"))) {
/* 25 */                file.mkdirs();
/* 34 */                for (OoIOol ooIOol2 : ooIOol.I0001Ioi1lo()) {
/* 55 */                    I00000oIO(ol0o1OiOIIIl, ooIOol2, new File(file, il1l0Ioi1ll.I00000oOI((Context) ooIOol2.I00iiI, (Uri) ooIOol2.I00iiO, "_display_name")));
                        }
/* 408 */               return;
                    }
/* 61 */            String strI00000oOI = il1l0Ioi1ll.I00000oOI(context, uri, "mime_type");
/* 69 */            if ("vnd.android.document/directory".equals(strI00000oOI) || TextUtils.isEmpty(strI00000oOI)) {
/* 408 */               return;
                    }
                    try {
/* 78 */                il1l0Ioi1ll.I00000oOI(context, uri, "_display_name");
/* 81 */                file.getPath();
/* 90 */                InputStream inputStreamOpenInputStream = ol0o1OiOIIIl.I0000Il00O.getContentResolver().openInputStream(uri);
/* 94 */                if (inputStreamOpenInputStream == null) {
/* 408 */                   return;
                        }
                        try {
/* 98 */                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
/* 101 */                       iOiOlIoI.I00000oIO(inputStreamOpenInputStream, fileOutputStream);
/* 104 */                       fileOutputStream.close();
/* 107 */                       inputStreamOpenInputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Exception e) {
/* 146 */               Log.e("AGSkillManagerVM", IIl001iO0Io.I000oI1ioi("Error copying file ", il1l0Ioi1ll.I00000oOI(context, uri, "_display_name"), " to ", file.getPath()), e);
                    }
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilO0;
/* 5 */             Object obj3 = this.I00ilI0I1;
/* 7 */             Object obj4 = this.I00iio;
                    switch (i) {
                        case 0:
/* 269 */                   return new I0O0Ooi10l((Ol0o1OiOIIIl) this.I00iiI, (OI10i0Il) this.I00iiO, (OI10i0Il) obj4, (Ol1o1llOII) obj2, (OI10i0Il) obj3, iOoil1iiIilo);
                        case 1:
/* 241 */                   I0O0Ooi10l i0O0Ooi10l = new I0O0Ooi10l((III0OOl1) this.I00iiO, (OIIlIII0Ili) obj4, (I01ii1IIl) obj3, (I0iI0O1IoIoI) obj2, iOoil1iiIilo, 1);
/* 244 */                   i0O0Ooi10l.I00iiI = obj;
/* 246 */                   return i0O0Ooi10l;
                        case 2:
/* 218 */                   return new I0O0Ooi10l((O1ol100o0O) this.I00iiI, (Context) this.I00iiO, (Ii0ioo10iO0) obj4, (O1oIOiI11o0) obj3, this.I00ilO0, iOoil1iiIilo, 2);
                        case 3:
/* 192 */                   return new I0O0Ooi10l((O1ol100o0O) this.I00iiI, (Context) this.I00iiO, (OloIl1l1oOii) obj4, (O1oIOiI11o0) obj3, (O11iO00I1o) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 165 */                   return new I0O0Ooi10l((O1oIOiI11o0) this.I00iiI, (O1oIOiI11o0) this.I00iiO, (O1ol100o0O) obj4, (Context) obj3, (OloIl1l1oOii) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 138 */                   return new I0O0Ooi10l((O1ol100o0O) this.I00iiI, (O1oIOiI11o0) this.I00iiO, (Context) obj4, (List) obj3, (I0IoiIiOoi) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 111 */                   return new I0O0Ooi10l((O1ol100o0O) this.I00iiI, (Uri) this.I00iiO, (String) obj4, (IlliIl1l11O) obj3, (String) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 84 */                    return new I0O0Ooi10l((OloIl1l1oOii) this.I00iiI, (IiI0O1Io) this.I00iiO, (O1oIOiI11o0) obj4, (O1ol100o0O) obj3, (Context) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 55 */                    I0O0Ooi10l i0O0Ooi10l2 = new I0O0Ooi10l((Uri) obj4, (Ol0o1OiOIIIl) this.I00iiI, (Function1) obj3, (IllOOo00lI) obj2, iOoil1iiIilo);
/* 58 */                    i0O0Ooi10l2.I00iiO = obj;
/* 60 */                    return i0O0Ooi10l2;
                        default:
/* 31 */                    I0O0Ooi10l i0O0Ooi10l3 = new I0O0Ooi10l((String) this.I00iiO, (i1Ii1ooOII0) obj4, (IOiOol0) obj3, (Context) obj2, iOoil1iiIilo, 9);
/* 34 */                    i0O0Ooi10l3.I00iiI = obj;
/* 36 */                    return i0O0Ooi10l3;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 145 */                   ((I0O0Ooi10l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
                            break;
                        case 2:
/* 116 */                   ((I0O0Ooi10l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 3:
/* 102 */                   ((I0O0Ooi10l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 4:
/* 88 */                    ((I0O0Ooi10l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 5:
/* 74 */                    ((I0O0Ooi10l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 6:
/* 60 */                    ((I0O0Ooi10l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 7:
/* 46 */                    ((I0O0Ooi10l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 8:
/* 32 */                    ((I0O0Ooi10l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((I0O0Ooi10l) create((Map) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                /* JADX WARN: Finally extract failed */
                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object value;
                    long j;
                    long j2;
                    Object value2;
                    InputStream inputStreamOpenInputStream;
                    Object obj2;
                    Object value3;
                    Object value4;
                    Object value5;
                    OoIOol ooIOol;
                    boolean z;
                    String strI00000oOI;
/* 3 */             int i = this.I00iOIl;
/* 5 */             int i2 = 13;
/* 7 */             String string = "";
/* 13 */            int i3 = 0;
/* 14 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 16 */            Object obj3 = this.I00ilO0;
/* 18 */            Object obj4 = this.I00ilI0I1;
/* 20 */            Object obj5 = this.I00iio;
                    switch (i) {
                        case 0:
/* 1405 */                  OI10i0Il oI10i0Il = (OI10i0Il) obj5;
/* 1407 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1409 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1414 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 1416 */                  List list = I0O0l00olII.I00000oIO;
/* 1423 */                  Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) oI10i0Il2.getValue();
/* 1425 */                  if (ol0ioI1iI != null) {
/* 1429 */                      oI10i0Il.setValue(Boolean.TRUE);
/* 1435 */                      Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iiI;
/* 1446 */                      I0Iol0OOiO i0Iol0OOiO = new I0Iol0OOiO(1);
/* 1449 */                      i0Iol0OOiO.I00iiI = (Ol1o1llOII) obj3;
/* 1451 */                      i0Iol0OOiO.I00iiO = oI10i0Il;
/* 1453 */                      i0Iol0OOiO.I00iio = (OI10i0Il) obj4;
/* 1455 */                      VarHandle.storeStoreFence();
/* 1458 */                      ol0o1OiOIIIl.getClass();
/* 1461 */                      IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(ol0o1OiOIIIl);
/* 1465 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1478 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new OO11OilO(ol0ioI1iI, ol0o1OiOIIIl, i0Iol0OOiO, null, 15), 2);
                            }
/* 1481 */                  return ooiIlOl1iI;
                        case 1:
/* 1358 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1360 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1365 */                  Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 1372 */                  III0OOl1 iII0OOl1 = (III0OOl1) this.I00iiO;
/* 1383 */                  IOoil1iiIilo iOoil1iiIilo = null;
/* 1388 */                  iOi1II01i0.I0000O(ii0110, null, null, new I00oIiI10(iII0OOl1, (OIIlIII0Ili) obj5, (I01ii1IIl) obj4, iOoil1iiIilo, 17), 3);
/* 1398 */                  return iOi1II01i0.I0000O(ii0110, null, null, new I00oI0i(iII0OOl1, (I0iI0O1IoIoI) obj3, iOoil1iiIilo, i2), 3);
                        case 2:
/* 1317 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1319 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1352 */                  O1ol100o0O.I000O01llI0((O1ol100o0O) this.I00iiI, (Context) this.I00iiO, ((Ii0ioo10iO0) obj5).I00000oOI(), (O1oIOiI11o0) obj4, this.I00ilO0, null, 16);
/* 1355 */                  return ooiIlOl1iI;
                        case 3:
/* 1258 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1260 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1265 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiI;
/* 1269 */                  Context context = (Context) this.I00iiO;
/* 1271 */                  OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) obj5;
/* 1275 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj4;
/* 1281 */                  I0IoOl i0IoOl = new I0IoOl(i2);
/* 1284 */                  i0IoOl.I00iio = o1ol100o0O;
/* 1286 */                  i0IoOl.I00iiI = context;
/* 1288 */                  i0IoOl.I00ilI0I1 = oloIl1l1oOii;
/* 1290 */                  i0IoOl.I00ilO0 = o1oIOiI11o0;
/* 1292 */                  i0IoOl.I00iiO = (O11iO00I1o) obj3;
/* 1294 */                  VarHandle.storeStoreFence();
/* 1311 */                  O1ol100o0O.I000O01llI0(o1ol100o0O, context, oloIl1l1oOii, o1oIOiI11o0, null, i0IoOl, 8);
/* 1314 */                  return ooiIlOl1iI;
                        case 4:
/* 1204 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1206 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1211 */                  O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iiI;
/* 1213 */                  String str = o1oIOiI11o02.I00000oIO;
/* 1217 */                  O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) this.I00iiO;
/* 1225 */                  if (!O0000Ioio00.I0000O(str, o1oIOiI11o03.I00000oIO)) {
/* 1247 */                      O1ol100o0O.I000O01llI0((O1ol100o0O) obj5, (Context) obj4, (OloIl1l1oOii) obj3, o1oIOiI11o02, null, null, 24);
                            }
/* 1252 */                  ((O1ol100o0O) obj5).I00IlilI0i0i(o1oIOiI11o03);
/* 1255 */                  return ooiIlOl1iI;
                        case 5:
/* 1145 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1147 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1152 */                  O1ol100o0O o1ol100o0O2 = (O1ol100o0O) this.I00iiI;
/* 1156 */                  O1oIOiI11o0 o1oIOiI11o04 = (O1oIOiI11o0) this.I00iiO;
/* 1165 */                  o1ol100o0O2.I00Io1o110i(o1oIOiI11o04, new O1oOil(O1oOl0.I00iOIl));
/* 1168 */                  O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 1182 */                  I0IoOl i0IoOl2 = new I0IoOl(14);
/* 1185 */                  i0IoOl2.I00iio = (Context) obj5;
/* 1187 */                  i0IoOl2.I00iiI = o1oIOiI11o04;
/* 1189 */                  i0IoOl2.I00ilI0I1 = (List) obj4;
/* 1191 */                  i0IoOl2.I00ilO0 = o1ol100o0O2;
/* 1193 */                  i0IoOl2.I00iiO = (I0IoiIiOoi) obj3;
/* 1195 */                  VarHandle.storeStoreFence();
/* 1198 */                  o111ooi11li.I00000oIO(o1oIOiI11o04, i0IoOl2);
/* 1201 */                  return ooiIlOl1iI;
                        case 6:
/* 685 */                   Uri uri = (Uri) this.I00iiO;
/* 687 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 689 */                   lIoii1l01l0i.I00000oOI(obj);
/* 695 */                   O1ol100o0O o1ol100o0O3 = (O1ol100o0O) this.I00iiI;
/* 697 */                   Context context2 = o1ol100o0O3.I0001Ioi1lo;
/* 699 */                   OlO0OIIl1 olO0OIIl1 = o1ol100o0O3.I000O01llI0;
/* 703 */                   String str2 = (String) obj3;
/* 751 */                   do {
/* 705 */                       value = olO0OIIl1.getValue();
/* 751 */                   } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) value, null, null, null, null, false, null, null, null, 0L, 0L, str2, 0.0f, null, null, false, 25599)));
/* 767 */                   Cursor cursorQuery = context2.getContentResolver().query(uri, new String[]{"_size", "_display_name"}, null, null, null);
/* 771 */                   if (cursorQuery != null) {
                                try {
/* 777 */                           if (cursorQuery.moveToFirst()) {
/* 783 */                               j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
/* 791 */                               string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                                    } else {
/* 799 */                               j = 0;
                                    }
/* 801 */                           cursorQuery.close();
/* 804 */                           j2 = j;
                                } finally {
                                }
                            } else {
/* 814 */                       j2 = 0;
                            }
/* 821 */                   if (string.length() == 0) {
/* 863 */                       do {
/* 823 */                           value5 = olO0OIIl1.getValue();
/* 863 */                       } while (!olO0OIIl1.I000iOII(value5, O1oiOloOo.I00000oIO((O1oiOloOo) value5, null, null, null, null, false, null, null, null, 0L, 0L, null, 0.0f, "Could not read file info", null, false, 27647)));
                            } else {
/* 873 */                       File file = new File(o1ol100o0O3.I000II, (String) obj5);
/* 876 */                       file.mkdirs();
/* 881 */                       File file2 = new File(file, string);
                                try {
/* 888 */                           inputStreamOpenInputStream = context2.getContentResolver().openInputStream(uri);
/* 892 */                           if (inputStreamOpenInputStream != null) {
                                        try {
/* 896 */                                   FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                            try {
/* 899 */                                       byte[] bArr = new byte[8192];
/* 901 */                                       long j3 = 0;
/* 903 */                                       long j4 = 0;
                                                while (true) {
/* 904 */                                           int i4 = inputStreamOpenInputStream.read(bArr);
/* 909 */                                           if (i4 != -1) {
/* 912 */                                               fileOutputStream.write(bArr, 0, i4);
/* 915 */                                               Object obj6 = obj4;
/* 918 */                                               j3 += i4;
/* 919 */                                               long jCurrentTimeMillis = System.currentTimeMillis();
/* 929 */                                               if (jCurrentTimeMillis - j4 > 200 && j2 > 0) {
/* 985 */                                                   do {
/* 935 */                                                       value3 = olO0OIIl1.getValue();
/* 985 */                                                   } while (!olO0OIIl1.I000iOII(value3, O1oiOloOo.I00000oIO((O1oiOloOo) value3, null, null, null, null, false, null, null, null, 0L, 0L, null, j3 / j2, null, null, false, 30719)));
/* 987 */                                                   j4 = jCurrentTimeMillis;
                                                        }
/* 988 */                                               obj4 = obj6;
                                                    } else {
/* 994 */                                               obj2 = obj4;
/* 996 */                                               fileOutputStream.close();
/* 999 */                                               inputStreamOpenInputStream.close();
                                                    }
                                                }
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } else {
/* 1020 */                              obj2 = obj4;
                                    }
/* 1070 */                          do {
/* 1022 */                              value4 = olO0OIIl1.getValue();
/* 1070 */                          } while (!olO0OIIl1.I000iOII(value4, O1oiOloOo.I00000oIO((O1oiOloOo) value4, null, null, null, null, false, null, null, null, 0L, 0L, null, 1.0f, null, null, false, 29695)));
/* 1085 */                          ((IlliIl1l11O) obj2).invoke(string, new Long(file2.length()));
                                } catch (Exception e) {
/* 1089 */                          file2.delete();
/* 1140 */                          do {
/* 1092 */                              value2 = olO0OIIl1.getValue();
/* 1140 */                          } while (!olO0OIIl1.I000iOII(value2, O1oiOloOo.I00000oIO((O1oiOloOo) value2, null, null, null, null, false, null, null, null, 0L, 0L, null, 0.0f, IIl001iO0Io.I000o00OoI0I("Import failed: ", e.getMessage()), null, false, 27647)));
                                }
                            }
/* 1142 */                  return ooiIlOl1iI;
                        case 7:
/* 620 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 622 */                   lIoii1l01l0i.I00000oOI(obj);
/* 628 */                   OloIl1l1oOii oloIl1l1oOii2 = (OloIl1l1oOii) this.I00iiI;
/* 644 */                   O1oIOiI11o0 o1oIOiI11o05 = (O1oIOiI11o0) oloIl1l1oOii2.I000OiO.get(((IiI0O1Io) this.I00iiO).I00100o1O0lo());
/* 657 */                   if (!O0000Ioio00.I0000O(o1oIOiI11o05.I00000oIO, ((O1oIOiI11o0) obj5).I00000oIO)) {
/* 673 */                       O1ol100o0O.I000O01llI0((O1ol100o0O) obj4, (Context) obj3, oloIl1l1oOii2, (O1oIOiI11o0) obj5, null, null, 24);
                            }
/* 678 */                   ((O1ol100o0O) obj4).I00IlilI0i0i(o1oIOiI11o05);
/* 681 */                   return ooiIlOl1iI;
                        case 8:
/* 108 */                   Uri uri2 = (Uri) obj5;
/* 110 */                   Function1 function1 = (Function1) obj4;
/* 115 */                   Ol0o1OiOIIIl ol0o1OiOIIIl2 = (Ol0o1OiOIIIl) this.I00iiI;
/* 117 */                   Context context3 = ol0o1OiOIIIl2.I0000Il00O;
/* 123 */                   Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 125 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 128 */                       Objects.toString(uri2);
/* 146 */                       OoIOol[] ooIOolArrI0001Ioi1lo = new OoIOol(i3, context3, DocumentsContract.buildDocumentUriUsingTree(uri2, DocumentsContract.getTreeDocumentId(uri2))).I0001Ioi1lo();
/* 150 */                       int length = ooIOolArrI0001Ioi1lo.length;
/* 151 */                       int i5 = 0;
                                while (true) {
/* 152 */                           if (i5 < length) {
/* 154 */                               ooIOol = ooIOolArrI0001Ioi1lo[i5];
/* 172 */                               if (!"SKILL.md".equals(il1l0Ioi1ll.I00000oOI((Context) ooIOol.I00iiI, (Uri) ooIOol.I00iiO, "_display_name"))) {
/* 175 */                                   i5++;
                                        }
                                    } else {
/* 179 */                               ooIOol = null;
                                    }
                                }
/* 180 */                       if (ooIOol == null || !ooIOol.I00000oIO()) {
/* 602 */                           ol0o1OiOIIIl2.I00100o1O0lo("SKILL.md not found in the selected directory.");
/* 605 */                           function1.invoke("SKILL.md not found in the selected directory.");
/* 608 */                           z = false;
                                } else {
                                    try {
/* 198 */                               inputStreamOpenInputStream = context3.getContentResolver().openInputStream((Uri) ooIOol.I00iiO);
/* 202 */                               if (inputStreamOpenInputStream != null) {
                                            try {
/* 213 */                                       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, IO1IOI.I00000oIO), 8192);
                                                try {
/* 216 */                                           strI00000oOI = lOliOoIi.I00000oOI(bufferedReader);
/* 220 */                                           bufferedReader.close();
/* 223 */                                           inputStreamOpenInputStream.close();
                                                } finally {
                                                }
                                            } finally {
                                            }
                                        } else {
/* 251 */                                   strI00000oOI = null;
                                        }
/* 262 */                               OIoi0IIoi oIoi0IIoiI0001Ioi1lo = Ol0o1OiOIIIl.I0001Ioi1lo(ol0o1OiOIIIl2, strI00000oOI == null ? "" : strI00000oOI, false, null, null, 24);
/* 268 */                               Ol0ioI1iI ol0ioI1iI2 = (Ol0ioI1iI) oIoi0IIoiI0001Ioi1lo.I00iOIl;
/* 272 */                               List list2 = (List) oIoi0IIoiI0001Ioi1lo.I00iiI;
/* 281 */                               if (list2.isEmpty()) {
/* 334 */                                   if (ol0ioI1iI2 != null) {
/* 336 */                                       IllOOo00lI illOOo00lI = (IllOOo00lI) obj3;
/* 368 */                                       File fileI000iOII = IlIl10.I000iOII(context3.getFilesDir(), "skills/".concat(Pattern.compile("\\s+").matcher(Ol0o1l0ll0i.I00000oOI(context3, uri2)).replaceAll("-")));
/* 380 */                                       String path = IlIl10.I000OiO(fileI000iOII, context3.getFilesDir()).getPath();
/* 388 */                                       if (fileI000iOII.exists()) {
/* 390 */                                           fileI000iOII.getPath();
/* 397 */                                           ol0o1OiOIIIl2.I000II(ol0ioI1iI2.I001i1O0Ol());
                                                }
/* 404 */                                       if (!fileI000iOII.exists()) {
/* 406 */                                           fileI000iOII.mkdirs();
                                                }
/* 417 */                                       List list3 = ((Ol0loOOoo) ol0o1OiOIIIl2.I0000O.getValue()).I00000oOI;
/* 423 */                                       if (!(list3 instanceof Collection) || !list3.isEmpty()) {
/* 435 */                                           Iterator it = list3.iterator();
/* 443 */                                           while (it.hasNext()) {
/* 465 */                                               if (O0000Ioio00.I0000O(((Ol0oI1llIloI) it.next()).I00000oIO.I001i1O0Ol(), ol0ioI1iI2.I001i1O0Ol())) {
/* 468 */                                                   ol0o1OiOIIIl2.I00100l0(false);
/* 493 */                                                   String str3 = "A skill with the name '" + ol0ioI1iI2.I001i1O0Ol() + "' already exists.";
/* 497 */                                                   ol0o1OiOIIIl2.I00100o1O0lo(str3);
/* 500 */                                                   function1.invoke(str3);
/* 503 */                                                   z = false;
                                                        }
                                                    }
                                                }
/* 520 */                                       I00000oIO(ol0o1OiOIIIl2, new OoIOol(0, context3, DocumentsContract.buildDocumentUriUsingTree(uri2, DocumentsContract.getTreeDocumentId(uri2))), fileI000iOII);
/* 527 */                                       Ol0ilO ol0ilO = (Ol0ilO) ol0ioI1iI2.I00100o1O0lo();
/* 529 */                                       ol0ilO.I0000O();
/* 536 */                                       ((Ol0ioI1iI) ol0ilO.I00iiI).I00IO1(path);
/* 545 */                                       ol0o1OiOIIIl2.I0000oI00((Ol0ioI1iI) ol0ilO.I00000oOI());
/* 548 */                                       illOOo00lI.invoke();
                                            } else {
/* 556 */                                       ol0o1OiOIIIl2.I00100o1O0lo("Unknown error during SKILL.md conversion.");
/* 559 */                                       function1.invoke("Unknown error during SKILL.md conversion.");
                                            }
/* 551 */                                   z = false;
                                        } else {
/* 314 */                                   String str4 = "Error parsing SKILL.md: " + IOOi0Ool1i.I00IlilI0i0i(list2, ", ", null, null, null, 62);
/* 318 */                                   ol0o1OiOIIIl2.I00100o1O0lo(str4);
/* 321 */                                   function1.invoke(str4);
/* 324 */                                   z = false;
                                        }
                                    } catch (Exception e2) {
/* 567 */                               Log.e("AGSkillManagerVM", "Error reading SKILL.md", e2);
/* 587 */                               String str5 = "Failed to read SKILL.md: " + e2.getMessage();
/* 591 */                               ol0o1OiOIIIl2.I00100o1O0lo(str5);
/* 594 */                               function1.invoke(str5);
/* 597 */                               z = false;
                                    }
                                }
/* 325 */                       ol0o1OiOIIIl2.I00100l0(z);
/* 329 */                       ol0o1OiOIIIl2.I000o00OoI0I(null);
/* 611 */                       return ooiIlOl1iI;
                            } catch (Throwable th) {
/* 612 */                       ol0o1OiOIIIl2.I00100l0(false);
/* 616 */                       ol0o1OiOIIIl2.I000o00OoI0I(null);
/* 619 */                       throw th;
                            }
                        default:
/* 25 */                    i1Ii1ooOII0 i1ii1oooii0 = (i1Ii1ooOII0) obj5;
/* 27 */                    Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    Map map = (Map) this.I00iiI;
/* 38 */                    String str6 = (String) this.I00iiO;
/* 44 */                    o0l0iIlo0O o0l0iilo0o = (o0l0iIlo0O) map.get(str6);
/* 46 */                    if (o0l0iilo0o != null) {
/* 60 */                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 31);
/* 65 */                        sb.append("Overwriting cache with name '");
/* 68 */                        sb.append(str6);
/* 73 */                        sb.append("'.");
/* 82 */                        Log.i("CacheFileManager", sb.toString());
/* 95 */                        if (!O0000Ioio00.I0000O(o0l0iilo0o.zzb(), i1ii1oooii0.I00000oOI)) {
/* 101 */                           IOiOol0.I00O0i0ii((IOiOol0) obj4, (Context) obj3, o0l0iilo0o);
                                }
                            }
/* 104 */                   map.put(str6, i1ii1oooii0);
/* 107 */                   return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public I0O0Ooi10l(Uri uri, Ol0o1OiOIIIl ol0o1OiOIIIl, Function1 function1, IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 8;
/* 19 */            this.I00iio = uri;
                    this.I00iiI = ol0o1OiOIIIl;
                    this.I00ilI0I1 = function1;
                    this.I00ilO0 = illOOo00lI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public I0O0Ooi10l(Object obj, Object obj2, Object obj3, Object obj4, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 20 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                    this.I00ilI0I1 = obj3;
                    this.I00ilO0 = obj4;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public I0O0Ooi10l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                    this.I00iio = obj3;
                    this.I00ilI0I1 = obj4;
                    this.I00ilO0 = obj5;
                }
            }
