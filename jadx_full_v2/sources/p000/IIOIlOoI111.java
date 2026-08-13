            package p000;

            import android.content.res.Resources;
            import android.graphics.Bitmap;
            import android.graphics.BlendModeColorFilter;
            import android.graphics.Rect;
            import android.net.Uri;
            import android.os.CancellationSignal;
            import android.view.View;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.BufferedWriter;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import java.util.concurrent.CancellationException;
            import javax.crypto.Cipher;
            import kotlin.jvm.functions.Function1;
            
            public final class IIOIlOoI111 implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;

                public IIOIlOoI111(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:103:0x02ab  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0254  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws IOException {
                    Cipher cipher;
                    int i;
                    II0oIl iI0oIl;
                    OlI00IIlOO olI00IIlOO;
                    Ioi10illO1 ioi10illO1;
                    Ioi10illO1 ioi10illO12;
                    boolean z;
                    I0ol0lI i0ol0lI;
                    I0oO00o i0oO00oI00000oIO;
                    I0lIooIo1 i0lIooIo1I00000oIO;
                    IIolilIo iIolilIo;
                    IOO000ilo iOO000ilo;
                    float f;
                    float f2;
                    long jI001iOo1i0O;
/* 7 */             int i2 = 5;
/* 12 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 1921 */                  IIIloOl0I1I iIIloOl0I1I = (IIIloOl0I1I) this.I00iiI;
/* 1923 */                  Throwable th = (Throwable) obj;
/* 1925 */                  if (th != null && iIIloOl0I1I._closedCause == null) {
/* 1932 */                      iIIloOl0I1I.I0000O(th);
                            }
/* 1935 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
                            return obj == ((I00ooIo0) this.I00iiI) ? "(this Collection)" : String.valueOf(obj);
                        case 2:
/* 1887 */                  O01lii o01lii = (O01lii) this.I00iiI;
/* 1899 */                  o01lii.I00Io1lO((O01O0o1iI) obj, (String) IOOi0Ool1i.I00Io1o110i(o01lii.I00000oIO));
/* 1902 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1838 */                  I01Ii0ll10O i01Ii0ll10O = (I01Ii0ll10O) this.I00iiI;
/* 1840 */                  Map.Entry entry = (Map.Entry) obj;
/* 1844 */                  Object key = entry.getKey();
/* 1858 */                  StringBuilder sb = new StringBuilder(key == i01Ii0ll10O ? "(this Map)" : String.valueOf(key));
/* 1863 */                  sb.append('=');
/* 1866 */                  Object value = entry.getValue();
/* 1877 */                  sb.append(value != i01Ii0ll10O ? String.valueOf(value) : "(this Map)");
/* 1880 */                  return sb.toString();
                        case 4:
/* 1822 */                  Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iiI;
/* 1826 */                  ol0o1OiOIIIl.I000o00OoI0I((Uri) obj);
/* 1830 */                  ol0o1OiOIIIl.I00100o1O0lo(null);
/* 1833 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1802 */                  I0O1lii01O i0O1lii01O = (I0O1lii01O) this.I00iiI;
/* 1814 */                  i0O1lii01O.I00o101lO.invoke((OloilI0Ol) obj, iiliIooIliOo.I00000oIO(i0O1lii01O, I0lloOI0oio.I00000oOI));
/* 1817 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 1794 */                  ((IIiI1II) ((I0i1Io) this.I00iiI)).I0000O.I00O10llo((String) obj);
/* 1797 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 1653 */                  O0iiOlo o0iiOlo = (O0iiOlo) this.I00iiI;
/* 1655 */                  I0l00oIIo1O1 i0l00oIIo1O1 = (I0l00oIIo1O1) obj;
/* 1657 */                  OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1663 */                  if (i0l00oIIo1O1.I000oI1ioi() != Integer.MAX_VALUE) {
/* 1673 */                      if (i0l00oIIo1O1.I00000oOI().I00000oOI) {
/* 1675 */                          i0l00oIIo1O1.I00IOO();
                                }
/* 1696 */                      for (Map.Entry entry2 : i0l00oIIo1O1.I00000oOI().I000OOo1O.entrySet()) {
/* 1724 */                          o0iiOlo.I00000oIO((I0iolili01) entry2.getKey(), ((Number) entry2.getValue()).intValue(), i0l00oIIo1O1.I0001Ioi1lo());
                                }
/* 1744 */                      for (OIIlIII0Ili oIIlIII0Ili = i0l00oIIo1O1.I0001Ioi1lo().I00oli; !oIIlIII0Ili.equals(o0iiOlo.I00000oIO.I0001Ioi1lo()); oIIlIII0Ili = oIIlIII0Ili.I00oli) {
/* 1764 */                          for (I0iolili01 i0iolili01 : o0iiOlo.I00000oOI(oIIlIII0Ili).keySet()) {
/* 1776 */                              o0iiOlo.I00000oIO(i0iolili01, o0iiOlo.I0000Il00O(oIIlIII0Ili, i0iolili01), oIIlIII0Ili);
                                    }
                                }
                            }
/* 1783 */                  return ooiIlOl1iI;
                        case 8:
/* 1646 */                  return Boolean.valueOf(((IliIO10oO0) obj).I0110OiO(((Ili0i1il0l0l) this.I00iiI).I00000oIO));
                        case 9:
/* 1444 */                  O1Ii0OO o1Ii0OO = (O1Ii0OO) obj;
/* 1446 */                  I0lio1O01i01 i0lio1O01i01 = ((I0li1O0) this.I00iiI).I00o0l1o1o0;
/* 1458 */                  if (i0lio1O01i01.getInsetsListener().I00ilO0.I000II() > 0) {
/* 1460 */                      OI0l1oli1I oI0l1oli1I = i00llOioIoi.I00000oIO;
/* 1466 */                      long jI000iOII = o1Ii0OO.I00000oOI().I000iOII();
/* 1474 */                      OI10I1IoI0Ol oI10I1IoI0Ol = i0lio1O01i01.getInsetsListener().I00ilI0I1;
/* 1478 */                      int i3 = (int) (jI000iOII >> 32);
/* 1481 */                      int i4 = (int) (jI000iOII & 4294967295L);
/* 1486 */                      for (i00li00iOi i00li00ioi : i00llOioIoi.I00000oOI) {
/* 1495 */                          i010O0loi1l i010o0loi1l = (i010O0loi1l) oI10I1IoI0Ol.I000II(i00li00ioi);
/* 1504 */                          i00llOioIoi.I00000oIO(o1Ii0OO, ((i00ll0o0il) i00li00ioi).I0000Il00O, i010o0loi1l.I000O01llI0, i3, i4);
/* 1519 */                          if (((Boolean) i010o0loi1l.I00000oOI.getValue()).booleanValue()) {
/* 1525 */                              i00llOioIoi.I00000oIO(o1Ii0OO, i010o0loi1l.I0001Ioi1lo, i010o0loi1l.I000OiO, i3, i4);
/* 1532 */                              i00llOioIoi.I00000oIO(o1Ii0OO, i010o0loi1l.I000II, i010o0loi1l.I000iOII, i3, i4);
                                    }
/* 1541 */                          i00llOioIoi.I00000oIO(o1Ii0OO, ((i00ll0o0il) i00li00ioi).I0000O, i010o0loi1l.I000OOo1O, i3, i4);
                                }
/* 1551 */                      OI0oiiIO0 oI0oiiIO0 = i0lio1O01i01.getInsetsListener().I00io1l;
/* 1557 */                      if (oI0oiiIO0.I000OiO()) {
/* 1563 */                          Ol1o0O0O0 ol1o0O0O0 = i0lio1O01i01.getInsetsListener().I00ioIO;
/* 1565 */                          Object[] objArr = oI0oiiIO0.I00000oIO;
/* 1567 */                          int i5 = oI0oiiIO0.I00000oOI;
/* 1570 */                          for (int i6 = 0; i6 < i5; i6++) {
/* 1574 */                              OI10i0Il oI10i0Il = (OI10i0Il) objArr[i6];
/* 1580 */                              Iolo0O1 iolo0O1 = (Iolo0O1) ol1o0O0O0.get(i6);
/* 1586 */                              Rect rect = (Rect) oI10i0Il.getValue();
/* 1595 */                              o1Ii0OO.I0000Il00O(iolo0O1.I00000oOI(), rect.left);
/* 1605 */                              o1Ii0OO.I0000Il00O(iolo0O1.I0000O(), rect.top);
/* 1615 */                              o1Ii0OO.I0000Il00O(iolo0O1.I0000Il00O(), rect.right);
/* 1625 */                              o1Ii0OO.I0000Il00O(iolo0O1.I00000oIO(), rect.bottom);
                                    }
                                }
                            }
/* 1631 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 1426 */                  return Boolean.valueOf(((IooIolI) this.I00iiI).I00000oIO(((Oil000) obj).I0001Ioi1lo));
                        case 11:
/* 1409 */                  return Boolean.valueOf(iOIl0OoO.I0000oI00((Oil000) obj, (Resources) this.I00iiI));
                        case 12:
/* 1393 */                  ((Oil0O0I) obj).I00000oOI(Oiil1O.I00000oIO, new Oiil0Ol1(Io11Oll.I00iOIl, ((OIOlil0i) this.I00iiI).I00000oOI(), OiiioO1O1i1l.I00iiI, true));
/* 1396 */                  return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 1365 */                  ((O0iiOioolIi) this.I00iiI).I00i01iIIliI((IiIooOOOI) obj);
/* 1368 */                  return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 1354 */                  return Boolean.valueOf(O0000Ioio00.I0000O(((OI1llOooOl1) obj).I00000oOI, ((OI1llOooOl1) this.I00iiI).I00000oOI));
                        case 15:
/* 1325 */                  I1oiliiOol i1oiliiOol = (I1oiliiOol) this.I00iiI;
/* 1331 */                  I0IOIo0 i0IOIo0 = new I0IOIo0(i2);
/* 1334 */                  i0IOIo0.I00000oOI = i1oiliiOol;
/* 1336 */                  VarHandle.storeStoreFence();
/* 1339 */                  return i0IOIo0;
                        case 16:
/* 1307 */                  Oo1o1iil oo1o1iil = (Oo1o1iil) this.I00iiI;
/* 1314 */                  I0IOIo0 i0IOIo02 = new I0IOIo0(6);
/* 1317 */                  i0IOIo02.I00000oOI = oo1o1iil;
/* 1319 */                  VarHandle.storeStoreFence();
/* 1322 */                  return i0IOIo02;
                        case 17:
/* 1285 */                  IOliO010l1i1 iOliO010l1i1 = (IOliO010l1i1) this.I00iiI;
/* 1289 */                  I1ii1o0 i1ii1o0 = ((II0iil1) obj).I00000oIO;
/* 1291 */                  if (i1ii1o0 != null && (cipher = (Cipher) i1ii1o0.I00iiO) != null) {
/* 1299 */                      iOliO010l1i1.invoke(cipher);
                            }
/* 1302 */                  return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 1255 */                  BufferedWriter bufferedWriter = (BufferedWriter) this.I00iiI;
/* 1257 */                  String str = (String) obj;
/* 1263 */                  if (!OlOoOIi0o.I001l0I00(str) && !OlOolloIIOl0.I000l1(str, "#", false)) {
/* 1274 */                      bufferedWriter.write(str);
/* 1277 */                      bufferedWriter.newLine();
                            }
/* 1280 */                  return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 1226 */                  OlO0OIIl1 olO0OIIl1 = ((II10oli) this.I00iiI).I00000oOI;
/* 1247 */                  olO0OIIl1.I000lI(null, II10ol01.I00000oIO((II10ol01) olO0OIIl1.getValue(), (String) obj, false, null, 0.0f, null, null, false, 126));
/* 1250 */                  return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 209 */                   II1I10I0li iI1I10I0li = (II1I10I0li) this.I00iiI;
/* 211 */                   IIi11Illi1I iIi11Illi1I = (IIi11Illi1I) obj;
/* 223 */                   if (iIi11Illi1I.I00000oIO() * iI1I10I0li.I00oI0i < 0.0f || Ol0i1I.I0000O(iIi11Illi1I.I00iOIl.I0000oI00()) <= 0.0f) {
/* 1214 */                      return iIi11Illi1I.I00000oOI(new I10I0o1ii10(22));
                            }
/* 283 */                   float fMin = Math.min(Iil1010O.I0000Il00O(iI1I10I0li.I00oI0i, 0.0f) ? 1.0f : (float) Math.ceil(iIi11Illi1I.I00000oIO() * iI1I10I0li.I00oI0i), (float) Math.ceil(Ol0i1I.I0000O(iIi11Illi1I.I00iOIl.I0000oI00()) / 2.0f));
/* 287 */                   float f3 = fMin / 2.0f;
/* 309 */                   long jFloatToRawIntBits = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
/* 353 */                   long jFloatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() & 4294967295L)) - fMin) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() >> 32)) - fMin) << 32);
/* 354 */                   float f4 = fMin * 2.0f;
/* 372 */                   boolean z2 = f4 > Ol0i1I.I0000O(iIi11Illi1I.I00iOIl.I0000oI00());
/* 389 */                   l1lOoiII1l l1looiii1lI00000oIO = iI1I10I0li.I00oIiI10.I00000oIO(iIi11Illi1I.I00iOIl.I0000oI00(), iIi11Illi1I.I00iOIl.getLayoutDirection(), iIi11Illi1I);
/* 395 */                   if (!(l1looiii1lI00000oIO instanceof OIio1O0ll0I)) {
/* 982 */                       if (!(l1looiii1lI00000oIO instanceof OIiolOlo1iI)) {
/* 1142 */                          long jI0000oI00 = jFloatToRawIntBits2;
/* 1145 */                          if (!(l1looiii1lI00000oIO instanceof OIioiIl)) {
/* 1202 */                              I000II.I00000oIO();
/* 1205 */                              return null;
                                    }
/* 1147 */                          OlI00IIlOO olI00IIlOO2 = iI1I10I0li.I00oII;
/* 1149 */                          if (z2) {
/* 1151 */                              jFloatToRawIntBits = 0;
                                    }
/* 1153 */                          if (z2) {
/* 1157 */                              jI0000oI00 = iIi11Illi1I.I00iOIl.I0000oI00();
                                    }
/* 1177 */                          Iilloo0IOoIo olOooI0l0011 = z2 ? IlIl1I110o0I.I00000oIO : new OlOooI0l0011(fMin, 0.0f, 0, 0, null, 30);
/* 1183 */                          II11iol iI11iol = new II11iol();
/* 1186 */                          iI11iol.I00iOIl = olI00IIlOO2;
/* 1188 */                          iI11iol.I00iiI = jFloatToRawIntBits;
/* 1190 */                          iI11iol.I00iiO = jI0000oI00;
/* 1192 */                          iI11iol.I00iio = olOooI0l0011;
/* 1194 */                          VarHandle.storeStoreFence();
/* 1197 */                          return iIi11Illi1I.I00000oOI(iI11iol);
                                }
/* 984 */                       OlI00IIlOO olI00IIlOO3 = iI1I10I0li.I00oII;
/* 988 */                       OiI101I1oIi oiI101I1oIi = ((OIiolOlo1iI) l1looiii1lI00000oIO).I00000oIO;
/* 990 */                       boolean zI0000Il00O = lIooiiO1i.I0000Il00O(oiI101I1oIi);
/* 994 */                       long j = oiI101I1oIi.I0000oI00;
/* 996 */                       if (zI0000Il00O) {
/* 1010 */                          OlOooI0l0011 olOooI0l00112 = new OlOooI0l0011(fMin, 0.0f, 0, 0, null, 30);
/* 1015 */                          II11olo iI11olo = new II11olo();
/* 1018 */                          iI11olo.I00iOIl = z2;
/* 1020 */                          iI11olo.I00iiI = olI00IIlOO3;
/* 1022 */                          iI11olo.I00iiO = j;
/* 1024 */                          iI11olo.I00iio = f3;
/* 1026 */                          iI11olo.I00ilI0I1 = fMin;
/* 1028 */                          iI11olo.I00ilO0 = jFloatToRawIntBits;
/* 1030 */                          iI11olo.I00io1l = jFloatToRawIntBits2;
/* 1032 */                          iI11olo.I00ioIO = olOooI0l00112;
/* 1034 */                          VarHandle.storeStoreFence();
/* 1037 */                          return iIi11Illi1I.I00000oOI(iI11olo);
                                }
/* 1043 */                      II11ii iI11ii = iI1I10I0li.I00o101lO;
/* 1045 */                      if (iI11ii == null) {
/* 1049 */                          iI11ii = new II11ii();
/* 1052 */                          iI1I10I0li.I00o101lO = iI11ii;
                                }
/* 1054 */                      I0ol0lI i0ol0lII00000oIO = iI11ii.I0000O;
/* 1056 */                      if (i0ol0lII00000oIO == null) {
/* 1058 */                          i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 1062 */                          iI11ii.I0000O = i0ol0lII00000oIO;
                                }
/* 1064 */                      i0ol0lII00000oIO.I000O01llI0();
/* 1067 */                      I0ol0lI.I0000Il00O(i0ol0lII00000oIO, oiI101I1oIi);
/* 1070 */                      if (!z2) {
/* 1072 */                          I0ol0lI i0ol0lII00000oIO2 = I0olIlI11.I00000oIO();
/* 1116 */                          I0ol0lI.I0000Il00O(i0ol0lII00000oIO2, new OiI101I1oIi(fMin, fMin, oiI101I1oIi.I00000oOI() - fMin, oiI101I1oIi.I00000oIO() - fMin, iOi0OiI.I00000oOI(fMin, j), iOi0OiI.I00000oOI(fMin, oiI101I1oIi.I0001Ioi1lo), iOi0OiI.I00000oOI(fMin, oiI101I1oIi.I000II), iOi0OiI.I00000oOI(fMin, oiI101I1oIi.I000O01llI0)));
/* 1120 */                          i0ol0lII00000oIO.I000II(i0ol0lII00000oIO, i0ol0lII00000oIO2, 0);
                                }
/* 1127 */                      I00o101lO i00o101lO = new I00o101lO(20);
/* 1130 */                      i00o101lO.I00iiI = i0ol0lII00000oIO;
/* 1132 */                      i00o101lO.I00iiO = olI00IIlOO3;
/* 1134 */                      VarHandle.storeStoreFence();
/* 1137 */                      return iIi11Illi1I.I00000oOI(i00o101lO);
                            }
/* 397 */                   OlI00IIlOO olI00IIlOO4 = iI1I10I0li.I00oII;
/* 399 */                   OIio1O0ll0I oIio1O0ll0I = (OIio1O0ll0I) l1looiii1lI00000oIO;
/* 401 */                   I0ol0lI i0ol0lI2 = oIio1O0ll0I.I00000oIO;
/* 403 */                   if (z2) {
/* 409 */                       I00o101lO i00o101lO2 = new I00o101lO(21);
/* 412 */                       i00o101lO2.I00iiI = oIio1O0ll0I;
/* 414 */                       i00o101lO2.I00iiO = olI00IIlOO4;
/* 416 */                       VarHandle.storeStoreFence();
/* 419 */                       return iIi11Illi1I.I00000oOI(i00o101lO2);
                            }
/* 425 */                   if (olI00IIlOO4 != null) {
/* 429 */                       long jI0000Il00O = IOOiio0i.I0000Il00O(1.0f, olI00IIlOO4.I00000oIO);
/* 448 */                       iI0oIl = new II0oIl(new BlendModeColorFilter(iiO01ll11o1l.I000OOo1O(jI0000Il00O), iOIill.I00000oIO(5)));
/* 451 */                       iI0oIl.I00000oOI = jI0000Il00O;
/* 453 */                       iI0oIl.I0000Il00O = 5;
/* 455 */                       VarHandle.storeStoreFence();
/* 458 */                       i = 1;
                            } else {
/* 460 */                       i = 0;
/* 461 */                       iI0oIl = null;
                            }
/* 462 */                   OOo0IO oOo0IOI0000O = i0ol0lI2.I0000O();
/* 466 */                   float f5 = oOo0IOI0000O.I00000oOI;
/* 468 */                   float f6 = oOo0IOI0000O.I00000oIO;
/* 470 */                   II11ii iI11ii2 = iI1I10I0li.I00o101lO;
/* 472 */                   if (iI11ii2 == null) {
/* 476 */                       iI11ii2 = new II11ii();
/* 479 */                       iI1I10I0li.I00o101lO = iI11ii2;
                            }
/* 481 */                   I0ol0lI i0ol0lII00000oIO3 = iI11ii2.I0000O;
/* 483 */                   if (i0ol0lII00000oIO3 == null) {
/* 485 */                       i0ol0lII00000oIO3 = I0olIlI11.I00000oIO();
/* 489 */                       iI11ii2.I0000O = i0ol0lII00000oIO3;
                            }
/* 491 */                   i0ol0lII00000oIO3.I000O01llI0();
/* 494 */                   I0ol0lI.I00000oOI(i0ol0lII00000oIO3, oOo0IOI0000O);
/* 497 */                   i0ol0lII00000oIO3.I000II(i0ol0lII00000oIO3, i0ol0lI2, 0);
/* 502 */                   OOo0ooi oOo0ooi = new OOo0ooi();
/* 533 */                   long jCeil = (((int) Math.ceil(oOo0IOI0000O.I0000Il00O - f6)) << 32) | (((int) Math.ceil(oOo0IOI0000O.I0000O - f5)) & 4294967295L);
/* 534 */                   II11ii iI11ii3 = iI1I10I0li.I00o101lO;
/* 536 */                   I0oO00o i0oO00o = iI11ii3.I00000oIO;
/* 538 */                   I0lIooIo1 i0lIooIo1 = iI11ii3.I00000oOI;
/* 540 */                   if (i0oO00o != null) {
/* 542 */                       int iI00000oIO = i0oO00o.I00000oIO();
/* 546 */                       olI00IIlOO = olI00IIlOO4;
/* 550 */                       ioi10illO1 = new Ioi10illO1();
/* 553 */                       ioi10illO1.I00000oIO = iI00000oIO;
/* 555 */                       VarHandle.storeStoreFence();
                            } else {
/* 559 */                       olI00IIlOO = olI00IIlOO4;
/* 561 */                       ioi10illO1 = null;
                            }
/* 562 */                   if (ioi10illO1 != null && ioi10illO1.I00000oIO == 0) {
/* 597 */                       z = true;
                            } else {
/* 570 */                       if (i0oO00o != null) {
/* 572 */                           int iI00000oIO2 = i0oO00o.I00000oIO();
/* 578 */                           ioi10illO12 = new Ioi10illO1();
/* 581 */                           ioi10illO12.I00000oIO = iI00000oIO2;
/* 583 */                           VarHandle.storeStoreFence();
                                } else {
/* 587 */                           ioi10illO12 = null;
                                }
/* 588 */                       if (ioi10illO12 == null || i != ioi10illO12.I00000oIO) {
/* 595 */                           z = false;
                                }
                            }
                            try {
                                try {
/* 598 */                           if (i0oO00o != null && i0lIooIo1 != null) {
/* 608 */                               i0ol0lI = i0ol0lII00000oIO3;
/* 614 */                               float fIntBitsToFloat = Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() >> 32));
/* 618 */                               Bitmap bitmap = i0oO00o.I00000oIO;
/* 620 */                               boolean z3 = z;
/* 629 */                               if (fIntBitsToFloat <= bitmap.getWidth() && Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() & 4294967295L)) <= bitmap.getHeight() && z3) {
/* 657 */                                   i0oO00oI00000oIO = i0oO00o;
/* 658 */                                   i0lIooIo1I00000oIO = i0lIooIo1;
                                        }
/* 680 */                               iIolilIo = iI11ii3.I0000Il00O;
/* 682 */                               if (iIolilIo == null) {
/* 686 */                                   iIolilIo = new IIolilIo();
/* 689 */                                   iI11ii3.I0000Il00O = iIolilIo;
                                        }
/* 691 */                               iOO000ilo = iIolilIo.I00iiI;
/* 693 */                               IIolil1 iIolil1 = iIolilIo.I00iOIl;
/* 697 */                               long jI00000oOI = l000O1l.I00000oOI(jCeil);
/* 703 */                               O0iOOoiioO layoutDirection = iIi11Illi1I.I00iOIl.getLayoutDirection();
/* 707 */                               IiIooOOOI iiIooOOOI = iIolil1.I00000oIO;
/* 709 */                               IIolilIo iIolilIo2 = iIolilIo;
/* 711 */                               O0iOOoiioO o0iOOoiioO = iIolil1.I00000oOI;
/* 713 */                               II0oIl iI0oIl2 = iI0oIl;
/* 715 */                               IIolOo iIolOo = iIolil1.I0000Il00O;
/* 721 */                               long j2 = iIolil1.I0000O;
/* 723 */                               iIolil1.I00000oIO = iIi11Illi1I;
/* 725 */                               iIolil1.I00000oOI = layoutDirection;
/* 727 */                               iIolil1.I0000Il00O = i0lIooIo1I00000oIO;
/* 729 */                               iIolil1.I0000O = jI00000oOI;
/* 731 */                               i0lIooIo1I00000oIO.I000II();
/* 748 */                               IilloIOOO0i.I00ilI0I1(iIolilIo2, IOOiio0i.I00000oOI, 0L, jI00000oOI, 0.0f, null, 0, 58);
/* 751 */                               f = -f6;
/* 752 */                               f2 = -f5;
/* 757 */                               ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(f, f2);
/* 789 */                               IilloIOOO0i.I00OIo(iIolilIo2, oIio1O0ll0I.I00000oIO, olI00IIlOO, 0.0f, new OlOooI0l0011(f4, 0.0f, 0, 0, null, 30), null, 52);
/* 817 */                               float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (iIolilIo2.I0000oI00() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (iIolilIo2.I0000oI00() >> 32));
/* 823 */                               I0lIooIo1 i0lIooIo12 = i0lIooIo1I00000oIO;
/* 844 */                               float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (iIolilIo2.I0000oI00() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (iIolilIo2.I0000oI00() & 4294967295L));
/* 845 */                               long jI00lli11 = iIolilIo2.I00lli11();
/* 851 */                               jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 859 */                               iOO000ilo.I0010o().I000II();
/* 868 */                               ((IIOOoll) iOO000ilo.I00iiI).I00i01iIIliI(fIntBitsToFloat2, fIntBitsToFloat3, jI00lli11);
/* 883 */                               IilloIOOO0i.I00OIo(iIolilIo2, i0ol0lI, olI00IIlOO, 0.0f, null, null, 28);
/* 902 */                               ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(-f, -f2);
/* 905 */                               i0lIooIo12.I00100l0();
/* 908 */                               iIolil1.I00000oIO = iiIooOOOI;
/* 910 */                               iIolil1.I00000oOI = o0iOOoiioO;
/* 912 */                               iIolil1.I0000Il00O = iIolOo;
/* 916 */                               iIolil1.I0000O = j2;
/* 920 */                               i0oO00oI00000oIO.I00000oIO.prepareToDraw();
/* 925 */                               oOo0ooi.I00iOIl = i0oO00oI00000oIO;
/* 930 */                               II1I00o001 iI1I00o001 = new II1I00o001(0);
/* 935 */                               iI1I00o001.I00iiO = oOo0IOI0000O;
/* 937 */                               iI1I00o001.I00iio = oOo0ooi;
/* 941 */                               iI1I00o001.I00iiI = jCeil;
/* 945 */                               iI1I00o001.I00ilI0I1 = iI0oIl2;
/* 947 */                               VarHandle.storeStoreFence();
/* 950 */                               return iIi11Illi1I.I00000oOI(iI1I00o001);
                                    }
/* 660 */                           i0ol0lI = i0ol0lII00000oIO3;
/* 868 */                           ((IIOOoll) iOO000ilo.I00iiI).I00i01iIIliI(fIntBitsToFloat2, fIntBitsToFloat3, jI00lli11);
/* 883 */                           IilloIOOO0i.I00OIo(iIolilIo2, i0ol0lI, olI00IIlOO, 0.0f, null, null, 28);
/* 902 */                           ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(-f, -f2);
/* 905 */                           i0lIooIo12.I00100l0();
/* 908 */                           iIolil1.I00000oIO = iiIooOOOI;
/* 910 */                           iIolil1.I00000oOI = o0iOOoiioO;
/* 912 */                           iIolil1.I0000Il00O = iIolOo;
/* 916 */                           iIolil1.I0000O = j2;
/* 920 */                           i0oO00oI00000oIO.I00000oIO.prepareToDraw();
/* 925 */                           oOo0ooi.I00iOIl = i0oO00oI00000oIO;
/* 930 */                           II1I00o001 iI1I00o0012 = new II1I00o001(0);
/* 935 */                           iI1I00o0012.I00iiO = oOo0IOI0000O;
/* 937 */                           iI1I00o0012.I00iio = oOo0ooi;
/* 941 */                           iI1I00o0012.I00iiI = jCeil;
/* 945 */                           iI1I00o0012.I00ilI0I1 = iI0oIl2;
/* 947 */                           VarHandle.storeStoreFence();
/* 950 */                           return iIi11Illi1I.I00000oOI(iI1I00o0012);
                                } finally {
/* 963 */                           iOO000ilo.I0010o().I00100l0();
/* 966 */                           iOO000ilo.I00Io1lO(jI001iOo1i0O);
                                }
/* 789 */                       IilloIOOO0i.I00OIo(iIolilIo2, oIio1O0ll0I.I00000oIO, olI00IIlOO, 0.0f, new OlOooI0l0011(f4, 0.0f, 0, 0, null, 30), null, 52);
/* 817 */                       float fIntBitsToFloat22 = (Float.intBitsToFloat((int) (iIolilIo2.I0000oI00() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (iIolilIo2.I0000oI00() >> 32));
/* 823 */                       I0lIooIo1 i0lIooIo122 = i0lIooIo1I00000oIO;
/* 844 */                       float fIntBitsToFloat32 = (Float.intBitsToFloat((int) (iIolilIo2.I0000oI00() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (iIolilIo2.I0000oI00() & 4294967295L));
/* 845 */                       long jI00lli112 = iIolilIo2.I00lli11();
/* 851 */                       jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 859 */                       iOO000ilo.I0010o().I000II();
                            } catch (Throwable th2) {
/* 976 */                       ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(-f, -f2);
/* 979 */                       throw th2;
                            }
/* 668 */                   i0oO00oI00000oIO = ioIIOlOIO0.I00000oIO((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
/* 672 */                   iI11ii3.I00000oIO = i0oO00oI00000oIO;
/* 674 */                   i0lIooIo1I00000oIO = I0lO01i00oi.I00000oIO(i0oO00oI00000oIO);
/* 678 */                   iI11ii3.I00000oOI = i0lIooIo1I00000oIO;
/* 680 */                   iIolilIo = iI11ii3.I0000Il00O;
/* 682 */                   if (iIolilIo == null) {
                            }
/* 691 */                   iOO000ilo = iIolilIo.I00iiI;
/* 693 */                   IIolil1 iIolil12 = iIolilIo.I00iOIl;
/* 697 */                   long jI00000oOI2 = l000O1l.I00000oOI(jCeil);
/* 703 */                   O0iOOoiioO layoutDirection2 = iIi11Illi1I.I00iOIl.getLayoutDirection();
/* 707 */                   IiIooOOOI iiIooOOOI2 = iIolil12.I00000oIO;
/* 709 */                   IIolilIo iIolilIo22 = iIolilIo;
/* 711 */                   O0iOOoiioO o0iOOoiioO2 = iIolil12.I00000oOI;
/* 713 */                   II0oIl iI0oIl22 = iI0oIl;
/* 715 */                   IIolOo iIolOo2 = iIolil12.I0000Il00O;
/* 721 */                   long j22 = iIolil12.I0000O;
/* 723 */                   iIolil12.I00000oIO = iIi11Illi1I;
/* 725 */                   iIolil12.I00000oOI = layoutDirection2;
/* 727 */                   iIolil12.I0000Il00O = i0lIooIo1I00000oIO;
/* 729 */                   iIolil12.I0000O = jI00000oOI2;
/* 731 */                   i0lIooIo1I00000oIO.I000II();
/* 748 */                   IilloIOOO0i.I00ilI0I1(iIolilIo22, IOOiio0i.I00000oOI, 0L, jI00000oOI2, 0.0f, null, 0, 58);
/* 751 */                   f = -f6;
/* 752 */                   f2 = -f5;
/* 757 */                   ((IIOOoll) iOO000ilo.I00iiI).I00i0oil(f, f2);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 181 */                   III010oO1l iII010oO1l = (III010oO1l) this.I00iiI;
/* 183 */                   OOo0IO oOo0IO = (OOo0IO) obj;
/* 187 */                   if (iII010oO1l.I00lll10) {
/* 201 */                       iOi1II01i0.I0000O(iII010oO1l.I00ooiO1I(), null, null, new I00oI0i(iII010oO1l, oOo0IO, iOoil1iiIilo, 12), 3);
                            }
/* 204 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 167 */                   IIIoloiiI1 iIIoloiiI1 = (IIIoloiiI1) this.I00iiI;
/* 169 */                   Throwable th3 = (Throwable) obj;
/* 171 */                   if (th3 != null) {
/* 173 */                       iIIoloiiI1.I0000O(th3);
                            }
/* 176 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 160 */                   return Boolean.valueOf(O0000Ioio00.I0000O(((IIo01Oii0) obj).I00000oIO, (IOiOol0) this.I00iiI));
                        case PoseLandmark.RIGHT_HIP:
/* 136 */                   CancellationSignal cancellationSignal = (CancellationSignal) this.I00iiI;
/* 140 */                   if (((Throwable) obj) != null) {
/* 142 */                       cancellationSignal.cancel();
                            }
/* 145 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 111 */                   IOl10lI1 iOl10lI1 = (IOl10lI1) this.I00iiI;
/* 115 */                   I1001Iilo i1001Iilo = iOl10lI1.I001i1lo1io;
/* 117 */                   if (i1001Iilo != null) {
/* 133 */                       return i1001Iilo;
                            }
/* 121 */                   View view = iOl10lI1.I00000oIO;
/* 123 */                   I1001Iilo i1001Iilo2 = new I1001Iilo();
/* 126 */                   i1001Iilo2.I00000oIO = view;
/* 128 */                   VarHandle.storeStoreFence();
/* 131 */                   iOl10lI1.I001i1lo1io = i1001Iilo2;
/* 133 */                   return i1001Iilo2;
                        case PoseLandmark.RIGHT_KNEE:
/* 85 */                    IIiOOI iIiOOI = (IIiOOI) this.I00iiI;
/* 87 */                    Throwable th4 = (Throwable) obj;
/* 89 */                    if (th4 == null) {
/* 103 */                       iIiOOI.I00000oOI(null);
                            } else if (th4 instanceof CancellationException) {
/* 95 */                        iIiOOI.I0000Il00O();
                            } else {
/* 99 */                        iIiOOI.I0000O(th4);
                            }
/* 106 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 42 */                    Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) this.I00iiI;
/* 44 */                    OllO00oiil ollO00oiil = ii1OIIlOi.I000OiO;
/* 46 */                    Throwable th5 = (Throwable) obj;
/* 48 */                    if (th5 != null) {
/* 50 */                        Ii1OIo10 ii1OIo10 = ii1OIIlOi.I000O01llI0;
/* 54 */                        IlIo0ol0 ilIo0ol0 = new IlIo0ol0(Integer.MAX_VALUE);
/* 57 */                        ilIo0ol0.I00000oOI = th5;
/* 59 */                        VarHandle.storeStoreFence();
/* 62 */                        ii1OIo10.I0000Il00O(ilIo0ol0);
                            }
/* 69 */                    if (ollO00oiil.I00000oOI()) {
/* 77 */                        ((IlIi1o0I110) ollO00oiil.getValue()).close();
                            }
/* 80 */                    return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 34 */                    ((Ii1l01l) this.I00iiI).I00000oOI();
/* 37 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 22 */                    ((O010loOOi0Oo) this.I00iiI).I00iIO();
/* 25 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
