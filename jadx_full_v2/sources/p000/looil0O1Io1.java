            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.util.Log;
            import androidx.work.multiprocess.RemoteWorkManagerClient;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.UUID;
            
            public final class looil0O1Io1 implements i11lIilOO0II, IOllol1io, I1IiiOO0i0io, I1IioI1l10, OOlo0i0, O0iIllo, OOO11l, IliO010iiOOI, OoI0o0oiol0l, IOoillilli, iiIi1oo0Io, IOiOiIIiii1 {
                public static looil0O1Io1 I00iiI;
                public static volatile looil0O1Io1 I00l0I0l0lO1;
                public final int I00iOIl;
                public static final OOo0IO I00iiO = new OOo0IO(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
                public static final looil0O1Io1 I00iio = new looil0O1Io1(3);
                public static final looil0O1Io1 I00ilI0I1 = new looil0O1Io1(4);
                public static final looil0O1Io1 I00ilO0 = new looil0O1Io1(5);
                public static final looil0O1Io1 I00io1l = new looil0O1Io1(6);
                public static final looil0O1Io1 I00ioIO = new looil0O1Io1(7);
                public static final looil0O1Io1 I00l0OO0IO = new looil0O1Io1(18);
                public static final looil0O1Io1 I00li1OI = new looil0O1Io1(19);
                public static final looil0O1Io1 I00ll1 = new looil0O1Io1(20);
                public static final looil0O1Io1 I00lli11 = new looil0O1Io1(21);
                public static final looil0O1Io1 I00lll10 = new looil0O1Io1(22);
                public static final looil0O1Io1 I00o0iI0io1 = new looil0O1Io1(23);
                public static final looil0O1Io1 I00o0l1o1o0 = new looil0O1Io1(25);

                public looil0O1Io1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static I1IoIo1O0 I000OOo1O(List list, OI0010oo1o oI0010oo1o, OOIil01OI oOIil01OI) {
/* 3 */             List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(list);
/* 11 */            ArrayList arrayList = new ArrayList();
/* 14 */            Iterator it = listI00iIi0i1o.iterator();
/* 22 */            while (it.hasNext()) {
/* 29 */                IOo0i1 iOo0i1I000OiO = I000OiO(null, it.next());
/* 33 */                if (iOo0i1I000OiO != null) {
/* 35 */                    arrayList.add(iOo0i1I000OiO);
                        }
                    }
/* 39 */            if (oI0010oo1o != null) {
/* 51 */                return new OoOl0o110(arrayList, oI0010oo1o.I0000O().I00100o1O0lo(oOIil01OI));
                    }
/* 61 */            I00iiI i00iiI = new I00iiI(14);
/* 64 */            i00iiI.I00iiI = oOIil01OI;
/* 66 */            VarHandle.storeStoreFence();
/* 69 */            return new I1IoIo1O0(arrayList, i00iiI);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
                public static IOo0i1 I000OiO(OI0011 oi0011, Object obj) {
/* 3 */             if (obj instanceof Byte) {
/* 13 */                return new IIOIIi1l11iO(((Number) obj).byteValue());
                    }
/* 19 */            if (obj instanceof Short) {
/* 29 */                return new Ol01Il11oii(((Number) obj).shortValue());
                    }
/* 35 */            if (obj instanceof Integer) {
/* 45 */                return new IooOlil01il(((Number) obj).intValue());
                    }
/* 51 */            if (obj instanceof Long) {
/* 61 */                return new O1IOl11I(((Number) obj).longValue());
                    }
/* 67 */            if (obj instanceof Character) {
/* 73 */                return new IO1I0lIl0l((Character) obj);
                    }
/* 79 */            if (obj instanceof Float) {
/* 89 */                return new II11Oo0I(((Number) obj).floatValue());
                    }
/* 95 */            if (obj instanceof Double) {
/* 105 */               return new II11Oo0I(((Number) obj).doubleValue());
                    }
/* 111 */           if (obj instanceof Boolean) {
/* 117 */               return new II11Oo0I((Boolean) obj);
                    }
/* 123 */           if (obj instanceof String) {
/* 129 */               return new OlOlol0il01((String) obj);
                    }
/* 133 */           boolean z = obj instanceof byte[];
/* 135 */           ?? SingletonList = Il01100l.I00iOIl;
/* 138 */           int i = 0;
/* 139 */           if (z) {
/* 141 */               byte[] bArr = (byte[]) obj;
/* 143 */               int length = bArr.length;
/* 144 */               if (length != 0) {
/* 146 */                   if (length != 1) {
/* 151 */                       SingletonList = new ArrayList(bArr.length);
/* 154 */                       int length2 = bArr.length;
/* 155 */                       while (i < length2) {
/* 163 */                           SingletonList.add(Byte.valueOf(bArr[i]));
/* 166 */                           i++;
                                }
                            } else {
/* 175 */                       SingletonList = Collections.singletonList(Byte.valueOf(bArr[0]));
                            }
                        }
/* 181 */               return I000OOo1O(SingletonList, oi0011, OOIil01OI.I00ioIO);
                    }
/* 188 */           if (obj instanceof short[]) {
/* 190 */               short[] sArr = (short[]) obj;
/* 192 */               int length3 = sArr.length;
/* 193 */               if (length3 != 0) {
/* 195 */                   if (length3 != 1) {
/* 200 */                       SingletonList = new ArrayList(sArr.length);
/* 203 */                       int length4 = sArr.length;
/* 204 */                       while (i < length4) {
/* 212 */                           SingletonList.add(Short.valueOf(sArr[i]));
/* 215 */                           i++;
                                }
                            } else {
/* 224 */                       SingletonList = Collections.singletonList(Short.valueOf(sArr[0]));
                            }
                        }
/* 230 */               return I000OOo1O(SingletonList, oi0011, OOIil01OI.I00l0I0l0lO1);
                    }
/* 237 */           if (obj instanceof int[]) {
/* 247 */               return I000OOo1O(I1IoiO1l.I00IOO((int[]) obj), oi0011, OOIil01OI.I00l0OO0IO);
                    }
/* 254 */           if (obj instanceof long[]) {
/* 256 */               long[] jArr = (long[]) obj;
/* 258 */               int length5 = jArr.length;
/* 259 */               if (length5 != 0) {
/* 261 */                   if (length5 != 1) {
/* 266 */                       SingletonList = new ArrayList(jArr.length);
/* 269 */                       int length6 = jArr.length;
/* 270 */                       while (i < length6) {
/* 278 */                           SingletonList.add(Long.valueOf(jArr[i]));
/* 281 */                           i++;
                                }
                            } else {
/* 290 */                       SingletonList = Collections.singletonList(Long.valueOf(jArr[0]));
                            }
                        }
/* 296 */               return I000OOo1O(SingletonList, oi0011, OOIil01OI.I00ll1);
                    }
/* 303 */           if (obj instanceof char[]) {
/* 305 */               char[] cArr = (char[]) obj;
/* 307 */               int length7 = cArr.length;
/* 308 */               if (length7 != 0) {
/* 310 */                   if (length7 != 1) {
/* 315 */                       SingletonList = new ArrayList(cArr.length);
/* 318 */                       int length8 = cArr.length;
/* 319 */                       while (i < length8) {
/* 327 */                           SingletonList.add(Character.valueOf(cArr[i]));
/* 330 */                           i++;
                                }
                            } else {
/* 339 */                       SingletonList = Collections.singletonList(Character.valueOf(cArr[0]));
                            }
                        }
/* 345 */               return I000OOo1O(SingletonList, oi0011, OOIil01OI.I00io1l);
                    }
/* 352 */           if (obj instanceof float[]) {
/* 362 */               return I000OOo1O(I1IoiO1l.I00IO1oi11O((float[]) obj), oi0011, OOIil01OI.I00li1OI);
                    }
/* 369 */           if (obj instanceof double[]) {
/* 371 */               double[] dArr = (double[]) obj;
/* 373 */               int length9 = dArr.length;
/* 374 */               if (length9 != 0) {
/* 376 */                   if (length9 != 1) {
/* 381 */                       SingletonList = new ArrayList(dArr.length);
/* 384 */                       int length10 = dArr.length;
/* 385 */                       while (i < length10) {
/* 393 */                           SingletonList.add(Double.valueOf(dArr[i]));
/* 396 */                           i++;
                                }
                            } else {
/* 405 */                       SingletonList = Collections.singletonList(Double.valueOf(dArr[0]));
                            }
                        }
/* 411 */               return I000OOo1O(SingletonList, oi0011, OOIil01OI.I00lli11);
                    }
/* 418 */           if (!(obj instanceof boolean[])) {
/* 466 */               if (obj == null) {
/* 470 */                   return new OIOOIOl(null);
                        }
/* 465 */               return null;
                    }
/* 420 */           boolean[] zArr = (boolean[]) obj;
/* 422 */           int length11 = zArr.length;
/* 423 */           if (length11 != 0) {
/* 425 */               if (length11 != 1) {
/* 430 */                   SingletonList = new ArrayList(zArr.length);
/* 433 */                   int length12 = zArr.length;
/* 434 */                   while (i < length12) {
/* 442 */                       SingletonList.add(Boolean.valueOf(zArr[i]));
/* 445 */                       i++;
                            }
                        } else {
/* 454 */                   SingletonList = Collections.singletonList(Boolean.valueOf(zArr[0]));
                        }
                    }
/* 460 */           return I000OOo1O(SingletonList, oi0011, OOIil01OI.I00ilO0);
                }

                public static String I000lI(String str) throws IOException {
/* 1 */             Runtime runtime = Runtime.getRuntime();
/* 39 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((str.startsWith("Windows 9") ? runtime.exec("command.com /c echo %windir%") : runtime.exec("cmd.exe /c echo %windir%")).getInputStream(), IO1IOO01oiO.I00000oIO));
/* 42 */            String line = bufferedReader.readLine();
/* 46 */            bufferedReader.close();
/* 77 */            return line;
                }

                public static IOIIo1OIOi1 I000o00OoI0I(String str) {
/* 3 */             IOIIo1OIOi1 iOIIo1OIOi1 = new IOIIo1OIOi1(str);
/* 8 */             IOIIo1OIOi1.I0000O.put(str, iOIIo1OIOi1);
/* 29 */            return iOIIo1OIOi1;
                }

                public static synchronized void I000oI1ioi() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new looil0O1Io1(0);
                    }
                }

                @Override
                public float I00000oIO() {
/* 1 */             return 0.0f;
                }

                @Override
                public ArrayList I00000oOI() {
                    String strI000lI;
/* 3 */             ArrayList arrayList = new ArrayList();
                    try {
/* 8 */                 strI000lI = System.getProperty("env.windir");
                    } catch (SecurityException unused) {
/* 13 */                strI000lI = null;
                    }
/* 16 */            String property = System.getProperty("os.name");
/* 20 */            if (strI000lI == null) {
                        try {
/* 22 */                    strI000lI = I000lI(property);
                        } catch (IOException | SecurityException unused2) {
                        }
                    }
/* 30 */            if (strI000lI == null || strI000lI.length() <= 2) {
/* 135 */               String str = property.endsWith("NT") ? "WINNT" : "WINDOWS";
/* 144 */               for (char c = 'C'; c <= 'E'; c = (char) (c + 1)) {
/* 150 */                   StringBuilder sb = new StringBuilder();
/* 153 */                   sb.append(c);
/* 156 */                   sb.append(":");
/* 159 */                   String str2 = File.separator;
/* 165 */                   File file = new File(IIl001iO0Io.I00100o1O0lo(sb, str2, str, str2, "FONTS"));
/* 172 */                   if (file.exists() && file.canRead()) {
/* 180 */                       arrayList.add(file);
                                break;
                            }
                        }
/* 188 */               for (char c2 = 'C'; c2 <= 'E'; c2 = (char) (c2 + 1)) {
/* 194 */                   StringBuilder sb2 = new StringBuilder();
/* 197 */                   sb2.append(c2);
/* 200 */                   sb2.append(":");
/* 209 */                   File file2 = new File(IIl001iO0Io.I00100l0(sb2, File.separator, "PSFONTS"));
/* 216 */                   if (file2.exists() && file2.canRead()) {
/* 224 */                       arrayList.add(file2);
                            }
                        }
                    } else {
/* 46 */                if (strI000lI.endsWith("/")) {
/* 54 */                    strI000lI = strI000lI.substring(0, strI000lI.length() - 1);
                        }
/* 62 */                StringBuilder sb3 = new StringBuilder(strI000lI);
/* 65 */                String str3 = File.separator;
/* 71 */                File file3 = new File(IIl001iO0Io.I00100l0(sb3, str3, "FONTS"));
/* 78 */                if (file3.exists() && file3.canRead()) {
/* 86 */                    arrayList.add(file3);
                        }
/* 104 */               File file4 = new File(IIl001iO0Io.I00100l0(new StringBuilder(strI000lI.substring(0, 2)), str3, "PSFONTS"));
/* 111 */               if (file4.exists() && file4.canRead()) {
/* 119 */                   arrayList.add(file4);
                        }
                    }
                    try {
/* 234 */               String str4 = System.getenv("LOCALAPPDATA");
/* 238 */               if (str4 != null && !str4.isEmpty()) {
/* 250 */                   StringBuilder sb4 = new StringBuilder();
/* 253 */                   sb4.append(str4);
/* 256 */                   String str5 = File.separator;
/* 258 */                   sb4.append(str5);
/* 263 */                   sb4.append("Microsoft");
/* 266 */                   sb4.append(str5);
/* 271 */                   sb4.append("Windows");
/* 274 */                   sb4.append(str5);
/* 279 */                   sb4.append("Fonts");
/* 286 */                   File file5 = new File(sb4.toString());
/* 293 */                   if (file5.exists() && file5.canRead()) {
/* 301 */                       arrayList.add(file5);
                            }
                        }
                    } catch (SecurityException unused3) {
                    }
/* 743 */           return arrayList;
                }

                @Override
                public ListenableFuture I0000Il00O(Context context, UUID uuid, Ii11I1OOII1 ii11I1OOII1) {
/* 5 */             RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) Oi00O10io.I00000oIO(context);
/* 11 */            IoloOio0I ioloOio0I = new IoloOio0I(24);
/* 14 */            ioloOio0I.I00iiI = uuid;
/* 16 */            ioloOio0I.I00iiO = ii11I1OOII1;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            Oll0oO oll0oOI0000Il00O = remoteWorkManagerClient.I0000Il00O(ioloOio0I);
/* 25 */            OIiilo1Ool0o oIiilo1Ool0o = RemoteWorkManagerClient.I000OiO;
/* 27 */            OilOol oilOol = remoteWorkManagerClient.I0000Il00O;
/* 29 */            IOO01l00ol iOO01l00ol = Oll101.I00000oIO;
/* 43 */            return Oll101.I00000oIO(ilIl1O1ii0Oo.I00000oIO(oilOol), false, new OO11OilO(oIiilo1Ool0o, oll0oOI0000Il00O, null, 7));
                }

                @Override
                public Object I0000O(OloIIoII1oo oloIIoII1oo) throws IOException {
                    i1oi01OllI i1oi01olliI0000oI00;
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_PINKY:
/* 383 */                   if (oloIIoII1oo.I000OOo1O()) {
/* 389 */                       return (Bundle) oloIIoII1oo.I000II();
                            }
/* 398 */                   if (Log.isLoggable("Rpc", 3)) {
/* 411 */                       "Error making request: ".concat(String.valueOf(oloIIoII1oo.I0001Ioi1lo()));
                            }
/* 425 */                   throw new IOException("SERVICE_NOT_AVAILABLE", oloIIoII1oo.I0001Ioi1lo());
                        default:
/* 11 */                    l1iIl0OO l1iil0oo = (l1iIl0OO) oloIIoII1oo.I000II();
/* 13 */                    lO1OiIOIl1IO lo1oiioil1ioI001l0I00 = lO1i1Iio1OIi.I001l0I00();
/* 17 */                    String str = l1iil0oo.I00iOIl;
/* 19 */                    lo1oiioil1ioI001l0I00.I0000Il00O();
/* 26 */                    ((lO1i1Iio1OIi) lo1oiioil1ioI001l0I00.I00iiI).I001lIiIIo1O(str);
/* 29 */                    String str2 = l1iil0oo.I00iiO;
/* 31 */                    lo1oiioil1ioI001l0I00.I0000Il00O();
/* 38 */                    ((lO1i1Iio1OIi) lo1oiioil1ioI001l0I00.I00iiI).I001lloI(str2);
/* 41 */                    boolean z = l1iil0oo.I00ilO0;
/* 43 */                    lo1oiioil1ioI001l0I00.I0000Il00O();
/* 50 */                    ((lO1i1Iio1OIi) lo1oiioil1ioI001l0I00.I00iiI).I00IO1(z);
/* 53 */                    long j = l1iil0oo.I00io1l;
/* 55 */                    lo1oiioil1ioI001l0I00.I0000Il00O();
/* 62 */                    ((lO1i1Iio1OIi) lo1oiioil1ioI001l0I00.I00iiI).I00IO1oi11O(j);
/* 65 */                    byte[] bArr = l1iil0oo.I00iiI;
/* 68 */                    if (bArr != null) {
/* 71 */                        i1lI1O i1li1oI000lI = i1lIIl01O.I000lI(bArr, 0, bArr.length);
/* 75 */                        lo1oiioil1ioI001l0I00.I0000Il00O();
/* 82 */                        ((lO1i1Iio1OIi) lo1oiioil1ioI001l0I00.I00iiI).I001lllioOl(i1li1oI000lI);
                            }
/* 89 */                    for (l1i0oiOO l1i0oioo : l1iil0oo.I00iio) {
/* 97 */                        for (l1lIII1IiI l1liii1iii : l1i0oioo.I00iiI) {
/* 101 */                           int i = l1liii1iii.I00io1l;
/* 103 */                           String str3 = l1liii1iii.I00iOIl;
/* 107 */                           if (i == 1) {
/* 297 */                               lO1lOlO lo1loloI001l0I00 = lO1oIIoolIO.I001l0I00();
/* 301 */                               lo1loloI001l0I00.I000O01llI0(str3);
/* 304 */                               if (i != 1) {
/* 340 */                                   I000II.I000iOII("Not a long type");
/* 105 */                                   return null;
                                        }
/* 306 */                               long j2 = l1liii1iii.I00iiI;
/* 308 */                               lo1loloI001l0I00.I0000Il00O();
/* 315 */                               ((lO1oIIoolIO) lo1loloI001l0I00.I00iiI).I001lloI(j2);
/* 318 */                               i1oi01olliI0000oI00 = lo1loloI001l0I00.I0000oI00();
                                    } else if (i == 2) {
/* 263 */                               lO1lOlO lo1loloI001l0I002 = lO1oIIoolIO.I001l0I00();
/* 267 */                               lo1loloI001l0I002.I000O01llI0(str3);
/* 270 */                               if (i != 2) {
/* 293 */                                   I000II.I000iOII("Not a boolean type");
/* 105 */                                   return null;
                                        }
/* 272 */                               boolean z2 = l1liii1iii.I00iiO;
/* 274 */                               lo1loloI001l0I002.I0000Il00O();
/* 281 */                               ((lO1oIIoolIO) lo1loloI001l0I002.I00iiI).I00II0Ol1O0l(z2);
/* 284 */                               i1oi01olliI0000oI00 = lo1loloI001l0I002.I0000oI00();
                                    } else if (i == 3) {
/* 228 */                               lO1lOlO lo1loloI001l0I003 = lO1oIIoolIO.I001l0I00();
/* 232 */                               lo1loloI001l0I003.I000O01llI0(str3);
/* 235 */                               if (i != 3) {
/* 258 */                                   I000II.I000iOII("Not a double type");
/* 105 */                                   return null;
                                        }
/* 237 */                               double d = l1liii1iii.I00iio;
/* 239 */                               lo1loloI001l0I003.I0000Il00O();
/* 246 */                               ((lO1oIIoolIO) lo1loloI001l0I003.I00iiI).I00II0oii1o(d);
/* 249 */                               i1oi01olliI0000oI00 = lo1loloI001l0I003.I0000oI00();
                                    } else if (i == 4) {
/* 190 */                               lO1lOlO lo1loloI001l0I004 = lO1oIIoolIO.I001l0I00();
/* 194 */                               lo1loloI001l0I004.I000O01llI0(str3);
/* 197 */                               if (i != 4) {
/* 223 */                                   I000II.I000iOII("Not a String type");
/* 105 */                                   return null;
                                        }
/* 199 */                               String str4 = l1liii1iii.I00ilI0I1;
/* 201 */                               lII0I0I000I.I000II(str4);
/* 204 */                               lo1loloI001l0I004.I0000Il00O();
/* 211 */                               ((lO1oIIoolIO) lo1loloI001l0I004.I00iiI).I00IO1(str4);
/* 214 */                               i1oi01olliI0000oI00 = lo1loloI001l0I004.I0000oI00();
                                    } else {
/* 118 */                               if (i != 5) {
/* 185 */                                   I000II.I000iOII(Oi010OO0.I00100l0(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
/* 105 */                                   return null;
                                        }
/* 120 */                               lO1lOlO lo1loloI001l0I005 = lO1oIIoolIO.I001l0I00();
/* 124 */                               lo1loloI001l0I005.I000O01llI0(str3);
/* 127 */                               if (i != 5) {
/* 159 */                                   I000II.I000iOII("Not a bytes type");
/* 105 */                                   return null;
                                        }
/* 129 */                               byte[] bArr2 = l1liii1iii.I00ilO0;
/* 131 */                               lII0I0I000I.I000II(bArr2);
/* 135 */                               i1lI1O i1li1oI000lI2 = i1lIIl01O.I000lI(bArr2, 0, bArr2.length);
/* 139 */                               lo1loloI001l0I005.I0000Il00O();
/* 146 */                               ((lO1oIIoolIO) lo1loloI001l0I005.I00iiI).I00IO1oi11O(i1li1oI000lI2);
/* 149 */                               i1oi01olliI0000oI00 = lo1loloI001l0I005.I0000oI00();
                                    }
/* 324 */                           lo1oiioil1ioI001l0I00.I0000Il00O();
/* 331 */                           ((lO1i1Iio1OIi) lo1oiioil1ioI001l0I00.I00iiI).I00II0Ol1O0l((lO1oIIoolIO) i1oi01olliI0000oI00);
                                }
/* 344 */                       String[] strArr = l1i0oioo.I00iiO;
/* 346 */                       if (strArr != null) {
/* 350 */                           for (String str5 : strArr) {
/* 354 */                               lo1oiioil1ioI001l0I00.I0000Il00O();
/* 361 */                               ((lO1i1Iio1OIi) lo1oiioil1ioI001l0I00.I00iiI).I00II0oii1o(str5);
                                    }
                                }
                            }
/* 376 */                   return (lO1i1Iio1OIi) lo1oiioil1ioI001l0I00.I0000oI00();
                    }
                }

                @Override
                public i11lilllII I0000oI00(Class cls) {
/* 8 */             if (!i11O1oIl.class.isAssignableFrom(cls)) {
/* 51 */                I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 7 */                 return null;
                    }
                    try {
/* 23 */                return (i11lilllII) i11O1oIl.I000l1(cls.asSubclass(i11O1oIl.class)).I000OOo1O(3, null);
                    } catch (Exception e) {
/* 37 */                OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls.getName()), e);
/* 7 */                 return null;
                    }
                }

                @Override
                public void I0001Ioi1lo(IiIooOOOI iiIooOOOI, int i, int[] iArr, O0iOOoiioO o0iOOoiioO, int[] iArr2) {
/* 3 */             if (o0iOOoiioO == O0iOOoiioO.I00iOIl) {
/* 6 */                 I1IiooiI1IlO.I00000oIO(i, iArr, iArr2, false);
                    } else {
/* 11 */                I1IiooiI1IlO.I00000oIO(i, iArr, iArr2, true);
                    }
                }

                @Override
                public boolean I000II(OoOIOoO1I ooOIOoO1I, OoOIOoO1I ooOIOoO1I2) {
/* 1 */             return ooOIOoO1I.equals(ooOIOoO1I2);
                }

                @Override
                public void I000O01llI0(IiIooOOOI iiIooOOOI, int i, int[] iArr, int[] iArr2) {
/* 2 */             I1IiooiI1IlO.I00000oIO(i, iArr, iArr2, false);
                }

                public synchronized IOIIo1OIOi1 I000iOII(String str) {
                    IOIIo1OIOi1 iOIIo1OIOi1;
                    try {
/* 2 */                 LinkedHashMap linkedHashMap = IOIIo1OIOi1.I0000O;
/* 8 */                 iOIIo1OIOi1 = (IOIIo1OIOi1) linkedHashMap.get(str);
/* 10 */                if (iOIIo1OIOi1 == null) {
/* 53 */                    iOIIo1OIOi1 = (IOIIo1OIOi1) linkedHashMap.get(OlOolloIIOl0.I000l1(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : OlOolloIIOl0.I000l1(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
/* 55 */                    if (iOIIo1OIOi1 == null) {
/* 59 */                        iOIIo1OIOi1 = new IOIIo1OIOi1(str);
                            }
/* 65 */                    linkedHashMap.put(str, iOIIo1OIOi1);
                        }
                    } catch (Throwable th) {
/* 77 */                throw th;
                    }
/* 69 */            return iOIIo1OIOi1;
                }

                @Override
                public boolean I000l1(Class cls) {
/* 3 */             return i11O1oIl.class.isAssignableFrom(cls);
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return (byte[]) obj;
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
/* 5 */             il0IIIOll.registerEncoder(ll00O01Ooli.class, l1iIl1o01.I00000oIO);
/* 12 */            il0IIIOll.registerEncoder(loioOO0OOiO.class, lOiIlll0i.I00000oIO);
/* 19 */            il0IIIOll.registerEncoder(ll01O0I1o0i1.class, l1iOiOi.I00000oIO);
/* 26 */            il0IIIOll.registerEncoder(ll0Oo10I10.class, l1iloollO.I00000oIO);
/* 33 */            il0IIIOll.registerEncoder(ll01OOOOii.class, l1iiOl.I00000oIO);
/* 40 */            il0IIIOll.registerEncoder(ll0IliOoo.class, l1iooO10ll.I00000oIO);
/* 47 */            il0IIIOll.registerEncoder(li1IOiiI.class, l0ol01Io0l0.I00000oIO);
/* 54 */            il0IIIOll.registerEncoder(li11ilIiI0.class, l0oOiOII.I00000oIO);
/* 61 */            il0IIIOll.registerEncoder(lil0ooilloO.class, l1IlO1O1.I00000oIO);
/* 68 */            il0IIIOll.registerEncoder(loOII0o.class, lOI01l1.I00000oIO);
/* 75 */            il0IIIOll.registerEncoder(li10O1O0.class, l0oI1OlI10i.I00000oIO);
/* 82 */            il0IIIOll.registerEncoder(li0lloi1l.class, l0o0llll0Oo.I00000oIO);
/* 89 */            il0IIIOll.registerEncoder(lliOIOI0ioIo.class, lIIlIOlll.I00000oIO);
/* 96 */            il0IIIOll.registerEncoder(o011OIoo.class, l11lo01.I00000oIO);
/* 103 */           il0IIIOll.registerEncoder(lii10I010O0o.class, l1I1oOi0O.I00000oIO);
/* 110 */           il0IIIOll.registerEncoder(liOIooOo1OII.class, l11iOO1o0Io.I00000oIO);
/* 117 */           il0IIIOll.registerEncoder(llii1oiliol0.class, lIIoIIo1.I00000oIO);
/* 124 */           il0IIIOll.registerEncoder(loIlII1O1.class, lO1iI1IIO.I00000oIO);
/* 131 */           il0IIIOll.registerEncoder(loIoli0.class, lO1lli1l0i.I00000oIO);
/* 138 */           il0IIIOll.registerEncoder(loIio0I1iI1l.class, lO1OioIIi01o.I00000oIO);
/* 145 */           il0IIIOll.registerEncoder(ll10II0o1.class, l1ll1IoliO.I00000oIO);
/* 152 */           il0IIIOll.registerEncoder(o01111IO.class, l0Oo0o1.I00000oIO);
/* 159 */           il0IIIOll.registerEncoder(ll111i0.class, l1lo01Oil0.I00000oIO);
/* 166 */           il0IIIOll.registerEncoder(llli1IOli00.class, lIiI1l00lIlI.I00000oIO);
/* 173 */           il0IIIOll.registerEncoder(llloIlO0I001.class, lIil0ol.I00000oIO);
/* 180 */           il0IIIOll.registerEncoder(llll11O.class, lIiiO0I.I00000oIO);
/* 187 */           il0IIIOll.registerEncoder(lllioil001.class, lIiOO10.I00000oIO);
/* 194 */           il0IIIOll.registerEncoder(llolOi1.class, lIo00l01ioi.I00000oIO);
/* 201 */           il0IIIOll.registerEncoder(llooi1iIl0i.class, lIo11Oo11liO.I00000oIO);
/* 208 */           il0IIIOll.registerEncoder(lo00ol1i.class, lIoO10IIOl.I00000oIO);
/* 215 */           il0IIIOll.registerEncoder(lo00Io.class, lIo1o11110.I00000oIO);
/* 222 */           il0IIIOll.registerEncoder(ll0o0Io00O10.class, l1li11Ilo0i.I00000oIO);
/* 229 */           il0IIIOll.registerEncoder(lo0O0OO1i.class, lIoi0oI.I00000oIO);
/* 236 */           il0IIIOll.registerEncoder(lo1I1l1Oo1I1.class, lIoioI0.I00000oIO);
/* 243 */           il0IIIOll.registerEncoder(lo1IiOIl1110.class, lIolo00iI.I00000oIO);
/* 250 */           il0IIIOll.registerEncoder(lo1Oo1l1.class, lIooll11O0Io.I00000oIO);
/* 257 */           il0IIIOll.registerEncoder(lo1ool1IOI.class, lO0IliiloI1.I00000oIO);
/* 264 */           il0IIIOll.registerEncoder(lo1ll0OIo1.class, lO0i1OlIl0.I00000oIO);
/* 271 */           il0IIIOll.registerEncoder(llolO1.class, lIlOIo11I.I00000oIO);
/* 278 */           il0IIIOll.registerEncoder(lilill.class, l1OiiIloOoIO.I00000oIO);
/* 285 */           il0IIIOll.registerEncoder(lloOloI11o00.class, lIll1ooo.I00000oIO);
/* 292 */           il0IIIOll.registerEncoder(lloO0lo00OO.class, lIliI1.I00000oIO);
/* 299 */           il0IIIOll.registerEncoder(lloOoO.class, lIlo1o0liI0.I00000oIO);
/* 306 */           il0IIIOll.registerEncoder(loO0oollOOl.class, lO1oIl.I00000oIO);
/* 313 */           il0IIIOll.registerEncoder(lolOiIi.class, lOl0oIOIi.I00000oIO);
/* 320 */           il0IIIOll.registerEncoder(lOo1Ooii.class, l0iOl1IlO.I00000oIO);
/* 327 */           il0IIIOll.registerEncoder(lOo0I0iOi11O.class, l0i1IOoIlll.I00000oIO);
/* 334 */           il0IIIOll.registerEncoder(lOloII.class, l0i0o1Ioo1i1.I00000oIO);
/* 341 */           il0IIIOll.registerEncoder(lOo1O010.class, l0iIOi1OillI.I00000oIO);
/* 348 */           il0IIIOll.registerEncoder(lOoOiIo.class, l0ilOI1o1.I00000oIO);
/* 355 */           il0IIIOll.registerEncoder(lOoIi0i0i.class, l0iilI.I00000oIO);
/* 362 */           il0IIIOll.registerEncoder(lOoii1.class, l0ioI1lOO.I00000oIO);
/* 369 */           il0IIIOll.registerEncoder(lOoliOIOlIO0.class, l0l0oO1I0I11.I00000oIO);
/* 376 */           il0IIIOll.registerEncoder(lOoo111010.class, l0l1o1ili.I00000oIO);
/* 383 */           il0IIIOll.registerEncoder(li001OIll0.class, l0lIOlol0I.I00000oIO);
/* 390 */           il0IIIOll.registerEncoder(li00oIo.class, l0lOOl.I00000oIO);
/* 397 */           il0IIIOll.registerEncoder(ioOiOIli1i.class, l0O1lO1O.I00000oIO);
/* 404 */           il0IIIOll.registerEncoder(ioi000.class, l0OOoiO1.I00000oIO);
/* 411 */           il0IIIOll.registerEncoder(ioOll0I11I.class, l0OIoi.I00000oIO);
/* 418 */           il0IIIOll.registerEncoder(lilI1ii.class, l1OIOio.I00000oIO);
/* 425 */           il0IIIOll.registerEncoder(li1OOIio1Oi.class, l0ooO11oo1o.I00000oIO);
/* 432 */           il0IIIOll.registerEncoder(iliiOi1.class, ioi1Iiolo.I00000oIO);
/* 439 */           il0IIIOll.registerEncoder(iliI01iIl.class, ioiIIIIl01.I00000oIO);
/* 446 */           il0IIIOll.registerEncoder(liO0ooiII1.class, l11IO0.I00000oIO);
/* 453 */           il0IIIOll.registerEncoder(ilioIlOi0O.class, ioiOOoo.I00000oIO);
/* 460 */           il0IIIOll.registerEncoder(ililI0.class, ioiioIo.I00000oIO);
/* 467 */           il0IIIOll.registerEncoder(iloO1li000o.class, ioolOIli1.I00000oIO);
/* 474 */           il0IIIOll.registerEncoder(iloIiOoiI.class, ioolll11li.I00000oIO);
/* 481 */           il0IIIOll.registerEncoder(ill0oooiIi.class, ioioo0O1Olo.I00000oIO);
/* 488 */           il0IIIOll.registerEncoder(ill0i1Oi.class, iol11I0.I00000oIO);
/* 495 */           il0IIIOll.registerEncoder(io000ol1I.class, l00Ooi.I00000oIO);
/* 502 */           il0IIIOll.registerEncoder(iloooiio.class, l00ioOl0I.I00000oIO);
/* 509 */           il0IIIOll.registerEncoder(io0iolo.class, l010iI1ool1.I00000oIO);
/* 516 */           il0IIIOll.registerEncoder(io0OoioI0O1.class, l0110oOI0oi.I00000oIO);
/* 523 */           il0IIIOll.registerEncoder(ioOOli.class, l0Ioi0OoO01l.I00000oIO);
/* 530 */           il0IIIOll.registerEncoder(ioO1iOoOi.class, l0O0l1lIOO.I00000oIO);
/* 537 */           il0IIIOll.registerEncoder(io1lIIli.class, l011ol0ilo.I00000oIO);
/* 544 */           il0IIIOll.registerEncoder(io1IlOiOOo.class, l01Ioii.I00000oIO);
/* 551 */           il0IIIOll.registerEncoder(ioI0iOIlI.class, l01i0lIOiO0I.I00000oIO);
/* 558 */           il0IIIOll.registerEncoder(io1oI1iOIoOi.class, l01lOiIiiOl.I00000oIO);
/* 565 */           il0IIIOll.registerEncoder(o000O0OO.class, lOIOiI1ol0O.I00000oIO);
/* 572 */           il0IIIOll.registerEncoder(lollOoOoo.class, l10110O0Oil.I00000oIO);
/* 579 */           il0IIIOll.registerEncoder(looIIlOIO.class, l1lOOOo1IIoI.I00000oIO);
/* 586 */           il0IIIOll.registerEncoder(looI0l1i1.class, l1lIiOIO.I00000oIO);
/* 593 */           il0IIIOll.registerEncoder(loo00iO11.class, l11ol0Iio.I00000oIO);
/* 600 */           il0IIIOll.registerEncoder(lool1O1l11io.class, lOIIOloOi0ll.I00000oIO);
/* 607 */           il0IIIOll.registerEncoder(looOio1l.class, lOI1OllI.I00000oIO);
/* 614 */           il0IIIOll.registerEncoder(o000o0l.class, lOIiiIlI1O1.I00000oIO);
/* 621 */           il0IIIOll.registerEncoder(loo1ilOi.class, l1Io0OO.I00000oIO);
/* 628 */           il0IIIOll.registerEncoder(o010o1iIl.class, lOlI11.I00000oIO);
/* 635 */           il0IIIOll.registerEncoder(o00oo1O11i.class, lOlIoOii11O.I00000oIO);
/* 642 */           il0IIIOll.registerEncoder(o00OIIOi1I1.class, lOl1oolI1O.I00000oIO);
/* 649 */           il0IIIOll.registerEncoder(loOoIo.class, lOIo011oo0.I00000oIO);
/* 656 */           il0IIIOll.registerEncoder(lil1OOilooi0.class, l1Iooiliill.I00000oIO);
/* 663 */           il0IIIOll.registerEncoder(lill0Ol.class, l1OlIIOIli1I.I00000oIO);
/* 670 */           il0IIIOll.registerEncoder(lOll0Oi.class, l0i0I0I0i0O.I00000oIO);
/* 677 */           il0IIIOll.registerEncoder(lii1oI1o.class, l1IIiO.I00000oIO);
/* 684 */           il0IIIOll.registerEncoder(lilOI0iO0OI1.class, l1OOilo0Il.I00000oIO);
/* 691 */           il0IIIOll.registerEncoder(liO1oilOi.class, l11OOiiOOo.I00000oIO);
/* 698 */           il0IIIOll.registerEncoder(li1iolIo.class, l10Il11llIO.I00000oIO);
/* 705 */           il0IIIOll.registerEncoder(li1lliOI.class, l10Oilo0.I00000oIO);
/* 712 */           il0IIIOll.registerEncoder(li1i10.class, l10I01iI.I00000oIO);
/* 719 */           il0IIIOll.registerEncoder(li1oiOOloO1.class, l10iOi0oOOl.I00000oIO);
/* 726 */           il0IIIOll.registerEncoder(ll0lO1.class, l1l1OI.I00000oIO);
/* 733 */           il0IIIOll.registerEncoder(ll0l01liOO1.class, l1l0o1O.I00000oIO);
/* 740 */           il0IIIOll.registerEncoder(ili0OO11.class, ioi10Ooo0.I00000oIO);
/* 747 */           il0IIIOll.registerEncoder(lol1I1IOIl.class, lOiiioloO.I00000oIO);
/* 754 */           il0IIIOll.registerEncoder(lolIl1o1I.class, lOiolO1ioooI.I00000oIO);
/* 761 */           il0IIIOll.registerEncoder(lolI0OoIIO.class, lOio0l01O.I00000oIO);
/* 768 */           il0IIIOll.registerEncoder(lOliOOi10l.class, l0Ol0ll.I00000oIO);
/* 775 */           il0IIIOll.registerEncoder(OoliIlOi.class, l0o00oI1i00.I00000oIO);
/* 782 */           il0IIIOll.registerEncoder(li0O01lloo01.class, l0lloiliiI.I00000oIO);
/* 789 */           il0IIIOll.registerEncoder(li0IolOol.class, l0liIooI.I00000oIO);
/* 796 */           il0IIIOll.registerEncoder(llOoIiI01.class, lIIIOiI0o0I.I00000oIO);
/* 803 */           il0IIIOll.registerEncoder(lliIiO11lioO.class, lIIiOliOO.I00000oIO);
/* 810 */           il0IIIOll.registerEncoder(lli1OoO10iII.class, lIIOOiIlo1O.I00000oIO);
/* 817 */           il0IIIOll.registerEncoder(ilo0oII1O01.class, iooO00Io00.I00000oIO);
/* 824 */           il0IIIOll.registerEncoder(ilo01iOOoO0l.class, iooi1Ii.I00000oIO);
/* 831 */           il0IIIOll.registerEncoder(llilIli0.class, lIO0loo0.I00000oIO);
/* 838 */           il0IIIOll.registerEncoder(lll0li01I0.class, lIOOlo11ii1.I00000oIO);
/* 845 */           il0IIIOll.registerEncoder(llilOIl.class, lIOI0o0.I00000oIO);
/* 852 */           il0IIIOll.registerEncoder(llioiIO1o.class, lIOO0IO0IiI.I00000oIO);
/* 859 */           il0IIIOll.registerEncoder(iloiiI0l00.class, iooooOoo01.I00000oIO);
/* 866 */           il0IIIOll.registerEncoder(iloOoOI0iI0i.class, l0011ili.I00000oIO);
/* 873 */           il0IIIOll.registerEncoder(loi11o1o0.class, lOOOO0ioi.I00000oIO);
/* 880 */           il0IIIOll.registerEncoder(loi11Il.class, lOOOIOl0OoO.I00000oIO);
/* 887 */           il0IIIOll.registerEncoder(lol010.class, lOiOOooOO.I00000oIO);
/* 894 */           il0IIIOll.registerEncoder(lol0li1O.class, lOiiOO10oI0.I00000oIO);
/* 901 */           il0IIIOll.registerEncoder(llo0IoIlII.class, lIilol00.I00000oIO);
/* 908 */           il0IIIOll.registerEncoder(llo1iioi.class, lIl1oloOlO.I00000oIO);
/* 915 */           il0IIIOll.registerEncoder(llo0O01O1l.class, lIl0O0oiOl.I00000oIO);
/* 922 */           il0IIIOll.registerEncoder(llo1iOili.class, lIl10lI.I00000oIO);
/* 929 */           il0IIIOll.registerEncoder(liilllI1l.class, l1Iiilo1o.I00000oIO);
/* 936 */           il0IIIOll.registerEncoder(io0Iiol0ol1.class, l00oOOo.I00000oIO);
/* 943 */           il0IIIOll.registerEncoder(io010o.class, l00ooIo.I00000oIO);
/* 950 */           il0IIIOll.registerEncoder(liiIiol0.class, l1Ii1i0l.I00000oIO);
/* 957 */           il0IIIOll.registerEncoder(liOOo1l1O.class, l1I0oi1iO1.I00000oIO);
/* 964 */           il0IIIOll.registerEncoder(lll1iOlO.class, lIOoOOi0.I00000oIO);
/* 971 */           il0IIIOll.registerEncoder(lllOOilll.class, lIi10i.I00000oIO);
/* 978 */           il0IIIOll.registerEncoder(lllIOO0.class, lIi0IO01i.I00000oIO);
/* 985 */           il0IIIOll.registerEncoder(iloo10Oil.class, l00I1O0IO.I00000oIO);
/* 992 */           il0IIIOll.registerEncoder(ilolI1I.class, l00OIO.I00000oIO);
/* 999 */           il0IIIOll.registerEncoder(llIo1Ii0ol0.class, lI0oI10.I00000oIO);
/* 1006 */          il0IIIOll.registerEncoder(llIo1o0OOiOO.class, lI101liIoOO.I00000oIO);
/* 1013 */          il0IIIOll.registerEncoder(llO0iiIl.class, lI110OI11.I00000oIO);
/* 1020 */          il0IIIOll.registerEncoder(illiOoIi.class, iollOl100.I00000oIO);
/* 1027 */          il0IIIOll.registerEncoder(illO1lIo.class, ioloo0Io.I00000oIO);
/* 1034 */          il0IIIOll.registerEncoder(llIIlIIOO.class, lI0O01o.I00000oIO);
/* 1041 */          il0IIIOll.registerEncoder(llIOolI.class, lI0OolliIi.I00000oIO);
/* 1048 */          il0IIIOll.registerEncoder(llIlI0I0i1.class, lI0l0i0.I00000oIO);
/* 1055 */          il0IIIOll.registerEncoder(illIo1lI.class, iol1llIo1I.I00000oIO);
/* 1062 */          il0IIIOll.registerEncoder(ill1liI0.class, iolil1OIIo.I00000oIO);
/* 1069 */          il0IIIOll.registerEncoder(llO0iii.class, lI1Io0i1.I00000oIO);
/* 1076 */          il0IIIOll.registerEncoder(llOI0I01llOI.class, lI1iIi.I00000oIO);
/* 1083 */          il0IIIOll.registerEncoder(llOIiilIO.class, lI1l0oo1Ooil.I00000oIO);
/* 1090 */          il0IIIOll.registerEncoder(llOOi1.class, lI1lOo0oo.I00000oIO);
/* 1097 */          il0IIIOll.registerEncoder(illoi1i0olIl.class, ioo0oI1O01.I00000oIO);
/* 1104 */          il0IIIOll.registerEncoder(illoOo0IO.class, ioo1lo1il1.I00000oIO);
/* 1111 */          il0IIIOll.registerEncoder(loi0I0I.class, lOIooIiiII0o.I00000oIO);
/* 1118 */          il0IIIOll.registerEncoder(loOooo.class, lOO0oI100o.I00000oIO);
/* 1125 */          il0IIIOll.registerEncoder(lilol10O.class, l1Oo1l1o1o.I00000oIO);
/* 1132 */          il0IIIOll.registerEncoder(lio0ili.class, l1i0olliii1.I00000oIO);
/* 1139 */          il0IIIOll.registerEncoder(lilooOlIoOIo.class, l1OooO.I00000oIO);
/* 1146 */          il0IIIOll.registerEncoder(lioIlO.class, l1i1o1Oll.I00000oIO);
/* 1153 */          il0IIIOll.registerEncoder(loI0001I1IiI.class, lO0lI0o.I00000oIO);
/* 1160 */          il0IIIOll.registerEncoder(loI0ioOlI1o.class, lO0oIOl.I00000oIO);
/* 1167 */          il0IIIOll.registerEncoder(ioIl1liO.class, l0I110OOIo.I00000oIO);
/* 1174 */          il0IIIOll.registerEncoder(ioIiii1.class, l0IOOlOO0O.I00000oIO);
/* 1181 */          il0IIIOll.registerEncoder(loi1ooii1IO.class, lOOiilOOo.I00000oIO);
/* 1188 */          il0IIIOll.registerEncoder(lo1OollOo.class, lO00l0oIoO.I00000oIO);
/* 1195 */          il0IIIOll.registerEncoder(lo1lOioli.class, lO01oil.I00000oIO);
/* 1202 */          il0IIIOll.registerEncoder(ioIOOi0.class, l01oil.I00000oIO);
/* 1209 */          il0IIIOll.registerEncoder(ioIIOlOIO0.class, l0I0IIIlo.I00000oIO);
/* 1216 */          il0IIIOll.registerEncoder(loi0liOO1l.class, lOO1i00i.I00000oIO);
/* 1223 */          il0IIIOll.registerEncoder(llI1iIllIO.class, l1o0ioi0i.I00000oIO);
/* 1230 */          il0IIIOll.registerEncoder(llI1II0O0il.class, lI0I0I0.I00000oIO);
/* 1237 */          il0IIIOll.registerEncoder(ll1o1lIoO1.class, l1ooIOl11lo0.I00000oIO);
/* 1244 */          il0IIIOll.registerEncoder(ll1lIIi1oii.class, l1oiiIiI11I.I00000oIO);
/* 1251 */          il0IIIOll.registerEncoder(ll1olIii.class, lI001OOi.I00000oIO);
/* 1258 */          il0IIIOll.registerEncoder(llI0OOi.class, lI01oIo.I00000oIO);
/* 1265 */          il0IIIOll.registerEncoder(ll1i0OIloIO.class, l1oO000oillI.I00000oIO);
/* 1272 */          il0IIIOll.registerEncoder(ll11loI.class, l1looilo1010.I00000oIO);
/* 1279 */          il0IIIOll.registerEncoder(ll1O1oOi1Oil.class, l1o1oo1I.I00000oIO);
/* 1286 */          il0IIIOll.registerEncoder(ll1IoOi1l.class, l1o1OlO.I00000oIO);
/* 1293 */          il0IIIOll.registerEncoder(llOlO00I1.class, lII0i1.I00000oIO);
/* 1300 */          il0IIIOll.registerEncoder(liIOOIo0.class, l1101i0oI1.I00000oIO);
/* 1307 */          il0IIIOll.registerEncoder(llOOii0oi.class, lI1oOio.I00000oIO);
/* 1314 */          il0IIIOll.registerEncoder(llOlOoio1o1l.class, lII1OIlllO.I00000oIO);
/* 1321 */          il0IIIOll.registerEncoder(liIIiioO.class, l10oiI0.I00000oIO);
/* 1328 */          il0IIIOll.registerEncoder(liIiilio0.class, l1111i.I00000oIO);
/* 1335 */          il0IIIOll.registerEncoder(loOIoO0io.class, lOIlOOlo0.I00000oIO);
/* 1342 */          il0IIIOll.registerEncoder(loI11OO0l.class, lO10ili0OllI.I00000oIO);
/* 1349 */          il0IIIOll.registerEncoder(loiioi1oIo1l.class, lOi0oo.I00000oIO);
/* 1356 */          il0IIIOll.registerEncoder(loIOIlo1OI.class, lO1Io0Ooo.I00000oIO);
/* 1363 */          il0IIIOll.registerEncoder(loII1ii1O0.class, lO11lI1.I00000oIO);
/* 1370 */          il0IIIOll.registerEncoder(loiO1l00loO.class, lOOll0Iooiii.I00000oIO);
/* 1377 */          il0IIIOll.registerEncoder(ioIoolio.class, l0IiIOi.I00000oIO);
/* 1384 */          il0IIIOll.registerEncoder(ioIo0l1lO01.class, l0Ill0.I00000oIO);
/* 1391 */          il0IIIOll.registerEncoder(loiO1oiOl010.class, lOi001I1.I00000oIO);
/* 1398 */          il0IIIOll.registerEncoder(liI1011OO.class, l10llOiIIi0o.I00000oIO);
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 14 */            return new IOO0o0I1l(0);
                }

                @Override
                public O0iIl1 getType() {
/* 20 */            throw new IllegalStateException("This method should not be called");
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 8:
/* 11 */                    return "Arrangement#Center";
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_INDEX:
/* 158 */                   return new Boolean(((Boolean) iII1OOolI.I00000oIO.get()).booleanValue());
                        case PoseLandmark.RIGHT_INDEX:
/* 110 */                   List list = iol1II1ii1i.I00000oIO;
/* 114 */                   iI1lO0li.I00iiI.get();
/* 133 */                   return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.upload.url", 78, "https://app-measurement.com/a").get();
                        case PoseLandmark.LEFT_THUMB:
/* 83 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 87 */                    iI1lO0li.I00iiI.get();
/* 107 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(79, 3600000L, "measurement.upload.window_interval").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 58 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 62 */                    iI1lO0li.I00iiI.get();
/* 80 */                    return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.config.url_authority", 7, "app-measurement.com").get();
                        case PoseLandmark.LEFT_HIP:
/* 32 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 36 */                    iI1lO0li.I00iiI.get();
/* 55 */                    return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.rb.attribution.app_allowlist", 32, "").get();
                        default:
/* 28 */                    return new Boolean(((Boolean) iIIlIllIoll.I00000oIO.get()).booleanValue());
                    }
                }
            }
