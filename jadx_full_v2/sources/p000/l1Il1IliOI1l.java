            package p000;

            import android.content.pm.ApplicationInfo;
            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Process;
            import android.os.StrictMode;
            import android.util.Log;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
/* 47 */    public class l1Il1IliOI1l implements OOooilOIIl0I, lIlOiO0OoO0, l01lllOO0, o0lOOi0l1II {
                public static Boolean I00iio;
                public Object I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public l1Il1IliOI1l(i1lIIl01O i1liil01o, String str) {
/* 6 */             this.I00iOIl = I1oIO0ll01.I0000Il00O;
/* 12 */            OoIol00Ool ooIol00Ool = new OoIol00Ool(12);
/* 15 */            ooIol00Ool.I00iiI = this;
/* 17 */            ooIol00Ool.I00iiO = i1liil01o;
/* 19 */            VarHandle.storeStoreFence();
/* 26 */            this.I00iiI = lOiIlo.I00000oIO(ooIol00Ool);
/* 32 */            OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(11);
/* 35 */            ooOlO1O0o.I00iiI = this;
/* 37 */            ooOlO1O0o.I00iiO = str;
/* 39 */            VarHandle.storeStoreFence();
/* 46 */            this.I00iiO = lOiIlo.I00000oIO(ooOlO1O0o);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oIO(int i, Throwable th, byte[] bArr) {
                    lIoI0O1iI0l lioi0o1ii0l;
/* 3 */             lIl1O1li lil1o1li = (lIl1O1li) this.I00iOIl;
/* 5 */             lil1o1li.I010II();
/* 10 */            liIOlO1 liiolo1 = (liIOlO1) this.I00iiO;
/* 14 */            if (i != 200 && i != 204) {
/* 22 */                if (i == 304) {
/* 24 */                    i = 304;
/* 25 */                    if (th != null) {
                            }
                        }
/* 56 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 58 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 75 */                l01o0io1ooo0.I00l0I0l0lO1.I0000oI00("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(liiolo1.I00iOIl), Integer.valueOf(i), th);
/* 110 */               if (!Arrays.asList(((String) iol1II1ii1i.I001IIilI0O.I00000oIO(null)).split(",")).contains(String.valueOf(i))) {
                        }
                    } else if (th != null) {
/* 31 */                l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 33 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 46 */                l01o0io1ooo02.I00lll10.I0000Il00O("[sgtm] Upload succeeded for row_id", Long.valueOf(liiolo1.I00iOIl));
/* 49 */                lioi0o1ii0l = lIoI0O1iI0l.SUCCESS;
                    } else {
/* 56 */                l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 58 */                l0olllO1i.I000II(l01o0io1ooo03);
/* 75 */                l01o0io1ooo03.I00l0I0l0lO1.I0000oI00("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(liiolo1.I00iOIl), Integer.valueOf(i), th);
/* 110 */               lioi0o1ii0l = !Arrays.asList(((String) iol1II1ii1i.I001IIilI0O.I00000oIO(null)).split(",")).contains(String.valueOf(i)) ? lIoI0O1iI0l.BACKOFF : lIoI0O1iI0l.FAILURE;
                    }
/* 114 */           AtomicReference atomicReference = (AtomicReference) this.I00iiI;
/* 120 */           lOliOlO1Io loliolo1ioI000OOo1O = ((l0olllO1i) lil1o1li.I00iOIl).I000OOo1O();
/* 126 */           long j = liiolo1.I00iOIl;
/* 132 */           iI0iiII1i ii0iiii1i = new iI0iiII1i(lioi0o1ii0l.I00iOIl, j, liiolo1.I00ilO0);
/* 135 */           loliolo1ioI000OOo1O.I010II();
/* 138 */           loliolo1ioI000OOo1O.I010OIo1l();
/* 142 */           lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(true);
/* 150 */           O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(18);
/* 153 */           o10oO1IiI1.I00iiI = loliolo1ioI000OOo1O;
/* 155 */           o10oO1IiI1.I00iiO = lli10iiI011IO1I11OI;
/* 157 */           o10oO1IiI1.I00iio = ii0iiii1i;
/* 159 */           VarHandle.storeStoreFence();
/* 162 */           loliolo1ioI000OOo1O.I0110o(o10oO1IiI1);
/* 169 */           l01O0IO1ooO0 l01o0io1ooo04 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 171 */           l0olllO1i.I000II(l01o0io1ooo04);
/* 182 */           l01o0io1ooo04.I00lll10.I0000O(Long.valueOf(j), "[sgtm] Updated status for row_id", lioi0o1ii0l);
                    synchronized (atomicReference) {
/* 186 */               atomicReference.set(lioi0o1ii0l);
/* 189 */               atomicReference.notifyAll();
                    }
                }

                @Override
                public void I00000oOI(String str, int i, Throwable th, byte[] bArr, Map map) {
/* 21 */            ((lilOOl0) this.I00iiO).I001IIilI0O(true, i, th, bArr, (String) this.I00iOIl, (ArrayList) this.I00iiI, map);
                }

                /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0214  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IOI0oloi01 I0000Il00O() throws IOException {
                    String strSubstring;
                    int i;
                    li0011I1O li0011i1o;
                    li0011I1O li0011i1o2;
                    String str;
                    lOio0i0 loio0i0;
/* 3 */             String str2 = (String) this.I00iiO;
/* 7 */             lIlIo1 lilio1 = (lIlIo1) this.I00iOIl;
/* 9 */             OliiillO oliiillO = lilio1.I0001Ioi1lo;
/* 18 */            if (!lIOOli.I000lI(lilio1.I00000oOI)) {
/* 33 */                return new IOI0oloi01(llOOiIiIOo.I001lIiIIo1O(), new IIOOoI(3, 17));
                    }
/* 37 */            Boolean boolValueOf = I00iio;
/* 39 */            if (boolValueOf == null) {
/* 45 */                boolValueOf = Boolean.valueOf(Process.isIsolated());
/* 49 */                I00iio = boolValueOf;
                    }
/* 55 */            if (boolValueOf.booleanValue()) {
/* 670 */               return new IOI0oloi01(llOOiIiIOo.I001lIiIIo1O(), new IIOOoI(3, 18));
                    }
/* 59 */            llIii0000O0 lliii0000o0I00000oOI = lilio1.I000II.I00000oOI();
/* 63 */            i1lIIl01O i1liil01o = lliii0000o0I00000oOI.I0000Il00O;
/* 65 */            i1ii1lIIol i1ii1liiol = i1ii1lIIol.FILE;
/* 67 */            I1Io0i0II i1Io0i0II = lIillol1io.I00000oIO;
/* 71 */            int iIndexOf = str2.indexOf("#");
/* 77 */            if (iIndexOf >= 0) {
/* 99 */                strSubstring = str2.substring(0, iIndexOf);
                    } else {
/* 85 */                if (str2.contains("@")) {
/* 95 */                    I000II.I000iOII("Invalid package name: ".concat(str2));
/* 76 */                    return null;
                        }
/* 87 */                strSubstring = str2;
                    }
/* 107 */           if (!lliii0000o0I00000oOI.I000O01llI0) {
/* 159 */               i = 14;
                    } else if (!lliii0000o0I00000oOI.I00000oIO || !lliii0000o0I00000oOI.I00000oOI.contains(i1ii1liiol)) {
/* 157 */               i = 3;
                    } else if (i1liil01o.I0000O() != 0) {
/* 127 */               IoillO0OOoo ioillO0OOoo = lliii0000o0I00000oOI.I0001Ioi1lo;
/* 153 */               i = (ioillO0OOoo.isEmpty() || ioillO0OOoo.contains(strSubstring)) ? lliii0000o0I00000oOI.I000II.contains(strSubstring) ? 6 : 0 : 5;
                    } else {
/* 155 */               i = 4;
                    }
/* 162 */           if (i != 0) {
/* 171 */               li0011i1o2 = new li0011I1O(null, new IIOOoI(i));
                    } else {
                        try {
/* 176 */                   str = lliii0000o0I00000oOI.I0000oI00;
                        } catch (Exception e) {
/* 503 */                   ll0ii0IllI.I00000oIO(Level.WARNING, lilio1.I00000oIO(), e, "Failed to read shared file for %s", str2);
/* 517 */                   li0011i1o = new li0011I1O(lOio0i0.I0000Il00O, new IIOOoI(3, 10));
                        }
/* 182 */               if (str.isEmpty()) {
/* 190 */                   OIiiIl0iO oIiiIl0iO = (OIiiIl0iO) lilio1.I000O01llI0.get();
/* 196 */                   if (oIiiIl0iO.I00000oOI()) {
/* 235 */                       str = ((ApplicationInfo) oIiiIl0iO.I00000oIO()).dataDir;
                            } else {
/* 208 */                       ll0ii0IllI.I00000oIO(Level.WARNING, lilio1.I00000oIO(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
/* 220 */                       li0011i1o = new li0011I1O(lOio0i0.I0000Il00O, new IIOOoI(3, 7));
/* 223 */                       li0011i1o2 = li0011i1o;
                            }
                        }
/* 237 */               String str3 = File.separator;
/* 239 */               String str4 = lliii0000o0I00000oOI.I0000O;
/* 265 */               StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str3).length() + str4.length());
/* 268 */               sb.append(str);
/* 271 */               sb.append(str3);
/* 274 */               sb.append(str4);
/* 277 */               String string = sb.toString();
/* 283 */               l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l(i1liil01o, str2);
/* 293 */               Uri.Builder builderScheme = new Uri.Builder().scheme("file");
/* 301 */               String string2 = l1il1ilioi1l.I0000O().toString();
/* 334 */               StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
/* 337 */               sb2.append(str3);
/* 340 */               sb2.append(string);
/* 343 */               sb2.append(str3);
/* 346 */               sb2.append(string2);
/* 357 */               Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
/* 361 */               StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
/* 378 */               StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            try {
/* 385 */                       lloOo1iol llooo1iol = (lloOo1iol) oliiillO.get();
/* 391 */                       boolean zI00111O = lliii0000o0I00000oOI.I000iOII.I00111O();
/* 396 */                       O1ilIl1l0I o1ilIl1l0I = new O1ilIl1l0I(2);
/* 399 */                       o1ilIl1l0I.I00iiI = zI00111O;
/* 401 */                       VarHandle.storeStoreFence();
/* 417 */                       li0011i1o2 = new li0011I1O((lOio0i0) llooo1iol.I00000oIO(uriBuild, o1ilIl1l0I), new IIOOoI(5, 2));
                            } finally {
/* 487 */                       StrictMode.setThreadPolicy(threadPolicy);
                            }
                        } catch (iI00lI e2) {
/* 440 */                   ll0ii0IllI.I00000oIO(Level.SEVERE, lilio1.I00000oIO(), e2, "Failed to parse snapshot from shared storage for %s", str2);
/* 452 */                   li0011i1o2 = new li0011I1O(null, new IIOOoI(9));
/* 522 */                   IIOOoI iIOOoI = li0011i1o2.I00000oOI;
/* 524 */                   loio0i0 = li0011i1o2.I00000oIO;
/* 526 */                   if (loio0i0 != null) {
                            }
                        } catch (FileNotFoundException unused) {
/* 471 */                   ll0ii0IllI.I00000oIO(Level.INFO, lilio1.I00000oIO(), null, "Shared storage file not found for %s", str2);
/* 483 */                   li0011i1o2 = new li0011I1O(null, new IIOOoI(8));
/* 522 */                   IIOOoI iIOOoI2 = li0011i1o2.I00000oOI;
/* 524 */                   loio0i0 = li0011i1o2.I00000oIO;
/* 526 */                   if (loio0i0 != null) {
                            }
                        }
                    }
/* 522 */           IIOOoI iIOOoI22 = li0011i1o2.I00000oOI;
/* 524 */           loio0i0 = li0011i1o2.I00000oIO;
/* 526 */           if (loio0i0 != null) {
/* 528 */               return IOI0oloi01.I000II(loio0i0, iIOOoI22);
                    }
/* 533 */           int i2 = iIOOoI22.I0000Il00O;
                    try {
/* 539 */               lloOo1iol llooo1iol2 = (lloOo1iol) oliiillO.get();
/* 543 */               Uri uri = (Uri) this.I00iiI;
/* 553 */               iI0ooO1Oi000 ii0ooo1oi000 = (iI0ooO1Oi000) llOOiIiIOo.I001lIiIIo1O().I0010o(7);
/* 555 */               i1o0l0i i1o0l0iVar = i1o0l0i.I00000oIO;
/* 557 */               int i3 = i1ioiooIiOol.I00000oIO;
/* 559 */               i1o0l0i i1o0l0iVar2 = i1o0l0i.I00000oOI;
/* 565 */               InputStream inputStreamI00000oOI = ll1110lO.I00000oOI(llooo1iol2.I00000oOI(uri));
                        try {
/* 571 */                   i1oi01OllI i1oi01olliI00000oIO = ((i1oO1llOO) ii0ooo1oi000).I00000oIO(inputStreamI00000oOI, i1o0l0iVar2);
/* 575 */                   if (inputStreamI00000oOI != null) {
/* 577 */                       inputStreamI00000oOI.close();
                            }
/* 589 */                   return new IOI0oloi01((llOOiIiIOo) i1oi01olliI00000oIO, new IIOOoI(4, i2));
                        } catch (Throwable th) {
/* 594 */                   if (inputStreamI00000oOI != null) {
                                try {
/* 596 */                           inputStreamI00000oOI.close();
                                } catch (Throwable th2) {
/* 601 */                           th.addSuppressed(th2);
                                }
                            }
/* 604 */                   throw th;
                        }
                    } catch (IOException | RuntimeException unused2) {
/* 617 */               ll0ii0IllI.I00000oIO(Level.INFO, lilio1.I00000oIO(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str2);
                        return I0001Ioi1lo() ? IOI0oloi01.I000II(lOio0i0.I0000Il00O, new IIOOoI(3, 16)) : new IOI0oloi01(llOOiIiIOo.I001lIiIIo1O(), new IIOOoI(3, 11));
                    }
                }

                public File I0000O() {
/* 11 */            String str = (String) ((OliiillO) this.I00iiI).get();
/* 21 */            String str2 = (String) ((OliiillO) this.I00iiO).get();
/* 57 */            return new File(IIl001iO0Io.I00100o1O0lo(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
                }

                public byte[] I0000oI00(iOO010illOlI ioo010illoli) {
                    lOolIioIo11 looliioio11;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iOIl;
/* 14 */                HashMap map2 = (HashMap) this.I00iiI;
/* 18 */                l0iO10io0IOO l0io10io0ioo = (l0iO10io0IOO) this.I00iiO;
/* 20 */                looliioio11 = new lOolIioIo11();
/* 27 */                OOiI1O oOiI1O = new OOiI1O(14);
/* 31 */                oOiI1O.I00000oOI = false;
/* 33 */                oOiI1O.I0000Il00O = false;
/* 35 */                oOiI1O.I0000oI00 = looliioio11;
/* 37 */                VarHandle.storeStoreFence();
/* 40 */                looliioio11.I0000oI00 = oOiI1O;
/* 42 */                looliioio11.I00000oIO = byteArrayOutputStream;
/* 44 */                looliioio11.I00000oOI = map;
/* 46 */                looliioio11.I0000Il00O = map2;
/* 48 */                looliioio11.I0000O = l0io10io0ioo;
/* 50 */                VarHandle.storeStoreFence();
/* 59 */                oIOi0lOI = (OIOi0lOI) map.get(iOO010illOlI.class);
                    } catch (IOException unused) {
                    }
/* 61 */            if (oIOi0lOI == null) {
/* 82 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(iOO010illOlI.class)));
                    }
/* 63 */            oIOi0lOI.encode(ioo010illoli, looliioio11);
/* 83 */            return byteArrayOutputStream.toByteArray();
                }

                public boolean I0001Ioi1lo() {
/* 7 */             lOlIllO1 lolillo1I0000Il00O = ((lIlIo1) this.I00iOIl).I000II.I0000Il00O();
                    return lolillo1I0000Il00O.I001IO000() && ((AbstractCollection) lolillo1I0000Il00O.I001lIiIIo1O()).contains(i1ii1lIIol.FILE);
                }

                public l1Ioi1ioOI I000II() {
/* 3 */             l1Ioi1ioOI l1ioi1iooi = new l1Ioi1ioOI();
/* 10 */            l1ioi1iooi.I00000oIO = (lIi00i) this.I00iOIl;
/* 16 */            l1ioi1iooi.I00000oOI = (l1Iii1) this.I00iiI;
/* 22 */            l1ioi1iooi.I0000Il00O = (l11oOo0i0IiO) this.I00iiO;
/* 24 */            VarHandle.storeStoreFence();
/* 55 */            return l1ioi1iooi;
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 7 */             lIIl1lol0iOI liil1lol0ioi = (lIIl1lol0iOI) ((lIIo1l) obj).I000l1();
/* 19 */            l1oiO1ol1 l1oio1ol1 = new l1oiO1ol1((lI1i1OI1O0l) this.I00iOIl, (IOoi01o) this.I00iiO);
/* 24 */            String str = (String) this.I00iiI;
/* 26 */            Parcel parcelI00Iooi00oi = liil1lol0ioi.I00Iooi00oi();
/* 30 */            parcelI00Iooi00oi.writeString(str);
/* 33 */            iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, l1oio1ol1);
/* 38 */            liil1lol0ioi.I00O0o1oo(28, parcelI00Iooi00oi);
                }

                @Override
                public boolean zza() {
                    il0oiOo1loi1 il0oioo1loi1;
/* 6 */             o01iIOoOi o01iioooi = (o01iIOoOi) this.I00iOIl;
/* 10 */            o01Il0IOli o01il0ioli = (o01Il0IOli) this.I00iiI;
/* 15 */            o01oIol1O o01oiol1o = (o01oIol1O) this.I00iiO;
/* 17 */            i0OI1l1Oo i0oi1l1oo = o01iioooi.I0000O;
/* 27 */            String str = o01iioooi.I0000oI00;
/* 29 */            I0i0io0oOOi i0i0io0oOOi = o01iioooi.I00000oIO;
/* 31 */            i0i0io0oOOi.getClass();
/* 47 */            String str2 = str + "/projects/722550545529/installations";
/* 55 */            ArrayList arrayList = new ArrayList(20);
/* 58 */            String str3 = i0i0io0oOOi.I00iiI;
/* 62 */            illliIoo1l0O.I00000oIO("x-goog-api-key");
/* 65 */            illliIoo1l0O.I00000oOI(str3, "x-goog-api-key");
/* 68 */            arrayList.add("x-goog-api-key");
/* 79 */            arrayList.add(OlOoOIi0o.I00OIo(str3).toString());
/* 85 */            boolean z = false;
/* 94 */            Io1Io0OOi011 io1Io0OOi011 = new Io1Io0OOi011((String[]) arrayList.toArray(new String[0]));
/* 103 */           String strI000lI = IlIi0I0.I000lI("{fid: '", o01il0ioli.I00000oIO, "', appId: '1:722550545529:android:82c62205f0ef0ea96608a8', authVersion: 'FIS_v2', sdkVersion: 'o:a:mlkit:1.0.0'}");
/* 107 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 113 */           o01oIol1O o01oiol1o2 = new o01oIol1O();
/* 116 */           o01oiol1o2.I0000Il00O();
/* 119 */           String strI00000oIO = o01iioooi.I00000oIO(io1Io0OOi011, str2, strI000lI, o01oiol1o, o01oiol1o2);
/* 123 */           o01oiol1o2.I00000oOI();
/* 126 */           if (strI00000oIO != null) {
                        try {
                            try {
/* 134 */                       il0oiOo1loi1 il0oioo1loi1I00000oOI = lilloiiOo.I00000oOI(strI00000oIO).I00000oOI();
                                try {
/* 144 */                           String strI0001Ioi1lo = il0oioo1loi1I00000oOI.I0000oI00("name").I0001Ioi1lo();
/* 160 */                           o01Il0IOli o01il0ioli2 = new o01Il0IOli(il0oioo1loi1I00000oOI.I0000oI00("fid").I0001Ioi1lo());
/* 169 */                           String strI0001Ioi1lo2 = il0oioo1loi1I00000oOI.I0000oI00("refreshToken").I0001Ioi1lo();
/* 173 */                           il0oiOo1loi1 il0oioo1loi1I0000O = il0oioo1loi1I00000oOI.I0000O();
/* 183 */                           String strI0001Ioi1lo3 = il0oioo1loi1I0000O.I0000oI00("token").I0001Ioi1lo();
/* 197 */                           il0oioo1loi1 = il0oioo1loi1I00000oOI;
                                    try {
/* 217 */                               long j = (Long.parseLong(il0oioo1loi1I0000O.I0000oI00("expiresIn").I0001Ioi1lo().replaceFirst("s$", "")) * 1000) + jCurrentTimeMillis;
/* 231 */                               Log.i("MLKitFbInstsRestClient", "installation name: " + strI0001Ioi1lo);
/* 234 */                               String.valueOf(il0oioo1loi1I0000O);
/* 242 */                               o01iioooi.I0000Il00O = new IioiI0IIIIO(j, o01il0ioli2, strI0001Ioi1lo2, strI0001Ioi1lo3);
/* 244 */                               z = true;
                                    } catch (ClassCastException | IllegalStateException | NullPointerException e) {
/* 248 */                               e = e;
/* 285 */                               Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from url <" + str2 + ">:\nraw json:\n" + strI00000oIO + "\nparsed json:\n" + il0oioo1loi1.toString(), e);
/* 288 */                               loOill110Ol looill110ol = loOill110Ol.RPC_RETURNED_INVALID_RESULT;
/* 290 */                               o01oiol1o2.I00000oIO(looill110ol);
/* 295 */                               o01oiol1o.I0000oI00.I000l1(looill110ol);
/* 298 */                               z = false;
/* 340 */                               return z;
                                    }
                                } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
/* 250 */                           e = e2;
/* 251 */                           il0oioo1loi1 = il0oioo1loi1I00000oOI;
                                }
                            } catch (il1ilOI0IIlo | IllegalStateException | NullPointerException e3) {
/* 321 */                       Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + str2 + ">:\n" + strI00000oIO, e3);
/* 324 */                       loOill110Ol looill110ol2 = loOill110Ol.RPC_RETURNED_MALFORMED_RESULT;
/* 326 */                       o01oiol1o2.I00000oIO(looill110ol2);
/* 331 */                       o01oiol1o.I0000oI00.I000l1(looill110ol2);
                            }
                        } finally {
/* 343 */                   i0oi1l1oo.I0001Ioi1lo(lioiiIOoil.INSTALLATION_ID_FIS_CREATE_INSTALLATION, o01oiol1o2);
                        }
                    }
/* 340 */           return z;
                }

/* 48 */        public l1Il1IliOI1l(lilOOl0 lilool0, String str, ArrayList arrayList) {
                    this.I00iOIl = str;
                    this.I00iiI = arrayList;
                    this.I00iiO = lilool0;
                }
            }
