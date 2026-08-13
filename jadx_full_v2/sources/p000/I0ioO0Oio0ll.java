            package p000;

            import android.graphics.Typeface;
            import android.text.Html;
            import android.text.Layout;
            import android.text.Spanned;
            import android.text.style.AbsoluteSizeSpan;
            import android.text.style.AlignmentSpan;
            import android.text.style.BackgroundColorSpan;
            import android.text.style.ForegroundColorSpan;
            import android.text.style.RelativeSizeSpan;
            import android.text.style.StrikethroughSpan;
            import android.text.style.StyleSpan;
            import android.text.style.SubscriptSpan;
            import android.text.style.SuperscriptSpan;
            import android.text.style.TypefaceSpan;
            import android.text.style.URLSpan;
            import android.text.style.UnderlineSpan;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import com.google.ai.edge.gallery.data.local.entities.RagDocumentEntity;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class I0ioO0Oio0ll implements Function1 {
                public final int I00iOIl;
                public String I00iiI;

                public I0ioO0Oio0ll(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:182:0x058a  */
                /* JADX WARN: Removed duplicated region for block: B:231:0x06ab  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x06da  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws Exception {
                    boolean z;
                    String url;
                    IliO1o11o iliO1o11o;
/* 3 */             int i = this.I00iOIl;
/* 47 */            int i2 = 1;
/* 48 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 2226 */                  Oil0Io.I000O01llI0((Oil0O0I) obj, this.I00iiI);
/* 2229 */                  return ooiIlOl1iI;
                        case 1:
/* 2206 */                  String str = this.I00iiI;
/* 2210 */                  Oil0O0I oil0O0I = (Oil0O0I) obj;
/* 2213 */                  Oil0Io.I000II(oil0O0I, 1);
/* 2216 */                  Oil0Io.I000O01llI0(oil0O0I, str);
/* 2219 */                  return ooiIlOl1iI;
                        case 2:
/* 2202 */                  Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 2205 */                  return ooiIlOl1iI;
                        case 3:
/* 2171 */                  Oil0O0I oil0O0I2 = (Oil0O0I) obj;
/* 2173 */                  Oil0Io.I000O01llI0(oil0O0I2, this.I00iiI);
/* 2176 */                  Oil0IoooOio oil0IoooOio = Oil0I1O.I001IIilI0O;
/* 2182 */                  O0O00I1Ili o0O00I1Ili = Oil0Io.I00000oIO[11];
/* 2185 */                  Float fValueOf = Float.valueOf(0.0f);
/* 2189 */                  oil0IoooOio.getClass();
/* 2192 */                  oil0O0I2.I00000oOI(oil0IoooOio, fValueOf);
/* 2195 */                  return ooiIlOl1iI;
                        case 4:
/* 2163 */                  Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 2166 */                  return ooiIlOl1iI;
                        case 5:
/* 2044 */                  String str2 = this.I00iiI;
/* 2052 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM conversations WHERE taskType = ? ORDER BY updatedAt DESC");
                            try {
/* 2057 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str2);
/* 2060 */                      int iI00000oIO = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 2064 */                      int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "title");
/* 2068 */                      int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "taskType");
/* 2072 */                      int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "modelName");
/* 2076 */                      int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "createdAt");
/* 2080 */                      int iI00000oIO6 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "updatedAt");
/* 2084 */                      int iI00000oIO7 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "messageCount");
/* 2088 */                      int iI00000oIO8 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "systemPrompt");
/* 2094 */                      ArrayList arrayList = new ArrayList();
/* 2101 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 2143 */                          arrayList.add(new Conversation(oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO2), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO3), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4), oiIIl0O1l0lI00000oIO.getLong(iI00000oIO5), oiIIl0O1l0lI00000oIO.getLong(iI00000oIO6), (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO7), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO8)));
                                }
/* 2152 */                      return arrayList;
                            } finally {
                            }
                        case 6:
/* 1931 */                  String str3 = this.I00iiI;
/* 1939 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO2 = ((Olil0III) obj).I00000oIO("SELECT * FROM conversations WHERE id = ?");
                            try {
/* 1944 */                      oiIIl0O1l0lI00000oIO2.I00Io1o110i(1, str3);
/* 2029 */                      return oiIIl0O1l0lI00000oIO2.I00ol1() ? new Conversation(oiIIl0O1l0lI00000oIO2.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "id")), oiIIl0O1l0lI00000oIO2.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "title")), oiIIl0O1l0lI00000oIO2.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "taskType")), oiIIl0O1l0lI00000oIO2.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "modelName")), oiIIl0O1l0lI00000oIO2.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "createdAt")), oiIIl0O1l0lI00000oIO2.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "updatedAt")), (int) oiIIl0O1l0lI00000oIO2.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "messageCount")), oiIIl0O1l0lI00000oIO2.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "systemPrompt"))) : null;
                            } finally {
                            }
                        case 7:
/* 1811 */                  String str4 = this.I00iiI;
/* 1819 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO3 = ((Olil0III) obj).I00000oIO("SELECT * FROM conversations WHERE modelName = ? ORDER BY updatedAt DESC LIMIT 1");
                            try {
/* 1824 */                      oiIIl0O1l0lI00000oIO3.I00Io1o110i(1, str4);
/* 1915 */                      return oiIIl0O1l0lI00000oIO3.I00ol1() ? new Conversation(oiIIl0O1l0lI00000oIO3.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO3, "id")), oiIIl0O1l0lI00000oIO3.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO3, "title")), oiIIl0O1l0lI00000oIO3.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO3, "taskType")), oiIIl0O1l0lI00000oIO3.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO3, "modelName")), oiIIl0O1l0lI00000oIO3.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO3, "createdAt")), oiIIl0O1l0lI00000oIO3.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO3, "updatedAt")), (int) oiIIl0O1l0lI00000oIO3.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO3, "messageCount")), oiIIl0O1l0lI00000oIO3.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO3, "systemPrompt"))) : null;
                            } finally {
                            }
                        case 8:
/* 1764 */                  String str5 = this.I00iiI;
/* 1772 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO4 = ((Olil0III) obj).I00000oIO("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                            try {
/* 1777 */                      oiIIl0O1l0lI00000oIO4.I00Io1o110i(1, str5);
/* 1782 */                      ArrayList arrayList2 = new ArrayList();
/* 1789 */                      while (oiIIl0O1l0lI00000oIO4.I00ol1()) {
/* 1796 */                          arrayList2.add(oiIIl0O1l0lI00000oIO4.I00i0O(0));
                                }
/* 1805 */                      return arrayList2;
                            } finally {
                            }
                        case 9:
/* 1721 */                  String str6 = this.I00iiI;
/* 1729 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO5 = ((Olil0III) obj).I00000oIO("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                            try {
/* 1734 */                      oiIIl0O1l0lI00000oIO5.I00Io1o110i(1, str6);
/* 1741 */                      if (oiIIl0O1l0lI00000oIO5.I00ol1()) {
/* 1755 */                          z = ((int) oiIIl0O1l0lI00000oIO5.getLong(0)) != 0;
/* 1756 */                          oiIIl0O1l0lI00000oIO5.close();
                                    break;
                                }
                            } finally {
                            }
                        case 10:
/* 1674 */                  String str7 = this.I00iiI;
/* 1682 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO6 = ((Olil0III) obj).I00000oIO("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                            try {
/* 1687 */                      oiIIl0O1l0lI00000oIO6.I00Io1o110i(1, str7);
/* 1694 */                      if (oiIIl0O1l0lI00000oIO6.I00ol1()) {
/* 1708 */                          z = ((int) oiIIl0O1l0lI00000oIO6.getLong(0)) != 0;
                                    break;
                                }
                            } finally {
                            }
                        case 11:
/* 1628 */                  String str8 = this.I00iiI;
/* 1636 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO7 = ((Olil0III) obj).I00000oIO("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?");
                            try {
/* 1641 */                      oiIIl0O1l0lI00000oIO7.I00Io1o110i(1, str8);
/* 1646 */                      ArrayList arrayList3 = new ArrayList();
/* 1653 */                      while (oiIIl0O1l0lI00000oIO7.I00ol1()) {
/* 1660 */                          arrayList3.add(oiIIl0O1l0lI00000oIO7.I00i0O(0));
                                }
/* 1669 */                      return arrayList3;
                            } finally {
                            }
                        case 12:
/* 1624 */                  Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 1627 */                  return ooiIlOl1iI;
                        case 13:
/* 1590 */                  String str9 = this.I00iiI;
/* 1598 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO8 = ((Olil0III) obj).I00000oIO("DELETE FROM faces WHERE name = ?");
                            try {
/* 1603 */                      oiIIl0O1l0lI00000oIO8.I00Io1o110i(1, str9);
/* 1606 */                      oiIIl0O1l0lI00000oIO8.I00ol1();
/* 1612 */                      return ooiIlOl1iI;
                            } finally {
                            }
                        case 14:
/* 1586 */                  Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 1589 */                  return ooiIlOl1iI;
                        case 15:
/* 1566 */                  String str10 = this.I00iiI;
/* 1570 */                  Oil0O0I oil0O0I3 = (Oil0O0I) obj;
/* 1573 */                  Oil0Io.I000OiO(oil0O0I3, 0);
/* 1576 */                  Oil0Io.I0000O(oil0O0I3, str10);
/* 1579 */                  return ooiIlOl1iI;
                        case 16:
/* 1562 */                  Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 1565 */                  return ooiIlOl1iI;
                        case 17:
/* 571 */                   String str11 = this.I00iiI;
/* 575 */                   I11110OIl i11110OIl = (I11110OIl) obj;
/* 577 */                   IoloOio0I ioloOio0I = I1111OO10i.I00ilI0I1;
/* 590 */                   Spanned spannedFromHtml = Html.fromHtml(IIl001iO0Io.I000o00OoI0I("<ContentHandlerReplacementTag />", str11), 63, null, iIo0o11I.I00000oIO);
/* 600 */                   I11110OIl i11110OIl2 = new I11110OIl(spannedFromHtml.length());
/* 603 */                   boolean z2 = spannedFromHtml instanceof I1111OO10i;
/* 605 */                   StringBuilder sb = i11110OIl2.I00iOIl;
/* 607 */                   if (z2) {
/* 612 */                       i11110OIl2.I00000oOI((I1111OO10i) spannedFromHtml);
                            } else {
/* 616 */                       sb.append((CharSequence) spannedFromHtml);
                            }
/* 626 */                   Object[] spans = spannedFromHtml.getSpans(0, sb.length(), Object.class);
/* 630 */                   int length = spans.length;
/* 631 */                   int i3 = 0;
/* 632 */                   while (i3 < length) {
/* 634 */                       Object obj2 = spans[i3];
/* 644 */                       long jI00000oIO = lOliOi0Oi.I00000oIO(spannedFromHtml.getSpanStart(obj2), spannedFromHtml.getSpanEnd(obj2));
/* 648 */                       int i4 = Oo0lI00l.I0000Il00O;
/* 654 */                       int i5 = (int) (jI00000oIO >> 32);
/* 661 */                       int i6 = (int) (jI00000oIO & 4294967295L);
/* 664 */                       if (!(obj2 instanceof AbsoluteSizeSpan)) {
/* 666 */                           boolean z3 = obj2 instanceof AlignmentSpan;
/* 669 */                           ArrayList arrayList4 = i11110OIl2.I00iiO;
/* 672 */                           if (z3) {
/* 676 */                               Layout.Alignment alignment = ((AlignmentSpan) obj2).getAlignment();
/* 690 */                               int i7 = alignment == null ? -1 : IoIIloI0oI1.I00000oIO[alignment.ordinal()];
/* 726 */                               arrayList4.add(new I111101Olo00(i5, i6, 8, new OIoioI0OIiI(i7 != i2 ? i7 != 2 ? i7 != 3 ? 0 : 6 : 3 : 5, null, 510), null));
                                    } else if (obj2 instanceof I11I1il) {
/* 736 */                               I11I1il i11I1il = (I11I1il) obj2;
/* 738 */                               String str12 = i11I1il.I00000oIO;
/* 740 */                               String str13 = i11I1il.I00000oOI;
/* 746 */                               OlOli0o olOli0o = new OlOli0o();
/* 749 */                               olOli0o.I00000oIO = str13;
/* 751 */                               VarHandle.storeStoreFence();
/* 757 */                               arrayList4.add(new I111101Olo00(olOli0o, i5, i6, str12));
                                    } else if (obj2 instanceof BackgroundColorSpan) {
/* 811 */                               i11110OIl2.I00000oIO(new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, 0L, null, null, null, iiO01ll11o1l.I00000oOI(((BackgroundColorSpan) obj2).getBackgroundColor()), null, null, 63487), i5, i6);
                                    } else if (obj2 instanceof IIIi0IlOOO) {
/* 819 */                               long j = IIIi00o.I0000oI00;
/* 821 */                               IIIi0IlOOO iIIi0IlOOO = (IIIi0IlOOO) obj2;
/* 823 */                               int i8 = iIIi0IlOOO.I00000oOI;
/* 825 */                               lOlilO1lOIO.I00000oIO(j);
/* 841 */                               long jI0000oI00 = lOlilO1lOIO.I0000oI00(Oo0o1OiIo.I0000O(j) * i8, j & 1095216660480L);
/* 845 */                               IIIi00o iIIi00o = iIIi0IlOOO.I00000oIO;
/* 862 */                               String str14 = null;
/* 864 */                               int i9 = 8;
/* 873 */                               arrayList4.add(new I111101Olo00(i5, i6, i9, new OIoioI0OIiI(0, new Oo0OOliO01o(jI0000oI00, jI0000oI00), 503), str14));
/* 883 */                               arrayList4.add(new I111101Olo00(i5, i6, i9, iIIi00o, str14));
                                    } else if (obj2 instanceof ForegroundColorSpan) {
/* 938 */                               i11110OIl2.I00000oIO(new OlIIi1oIIOlo(iiO01ll11o1l.I00000oOI(((ForegroundColorSpan) obj2).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), i5, i6);
                                    } else if (obj2 instanceof RelativeSizeSpan) {
/* 998 */                               i11110OIl2.I00000oIO(new OlIIi1oIIOlo(0L, lOlilO1lOIO.I0000oI00(((RelativeSizeSpan) obj2).getSizeChange(), 8589934592L), null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65533), i5, i6);
                                    } else if (obj2 instanceof StrikethroughSpan) {
/* 1045 */                              i11110OIl2.I00000oIO(new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, OlooIOI0O.I0000O, null, 61439), i5, i6);
                                    } else if (obj2 instanceof StyleSpan) {
/* 1056 */                              int style = ((StyleSpan) obj2).getStyle();
/* 1187 */                              OlIIi1oIIOlo olIIi1oIIOlo = style != 1 ? style != 2 ? style != 3 ? null : new OlIIi1oIIOlo(0L, 0L, IlilIIiIiO.I00li1OI, Ilil10i.I00000oIO(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523) : new OlIIi1oIIOlo(0L, 0L, null, Ilil10i.I00000oIO(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527) : new OlIIi1oIIOlo(0L, 0L, IlilIIiIiO.I00li1OI, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
/* 1192 */                              if (olIIi1oIIOlo != null) {
/* 1194 */                                  i11110OIl2.I00000oIO(olIIi1oIIOlo, i5, i6);
                                        }
                                    } else if (obj2 instanceof SubscriptSpan) {
/* 1245 */                              i11110OIl2.I00000oIO(new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, 0L, I1oi0illolii.I00000oIO(-0.5f), null, null, 0L, null, null, 65279), i5, i6);
                                    } else if (obj2 instanceof SuperscriptSpan) {
/* 1296 */                              i11110OIl2.I00000oIO(new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, 0L, I1oi0illolii.I00000oIO(0.5f), null, null, 0L, null, null, 65279), i5, i6);
                                    } else if (obj2 instanceof TypefaceSpan) {
/* 1305 */                              TypefaceSpan typefaceSpan = (TypefaceSpan) obj2;
/* 1307 */                              String family = typefaceSpan.getFamily();
/* 1317 */                              if (O0000Ioio00.I0000O(family, "cursive")) {
/* 1319 */                                  iliO1o11o = IliO1o11o.I00ilI0I1;
                                        } else if (O0000Ioio00.I0000O(family, "monospace")) {
/* 1332 */                                  iliO1o11o = IliO1o11o.I00iio;
                                        } else if (O0000Ioio00.I0000O(family, "sans-serif")) {
/* 1343 */                                  iliO1o11o = IliO1o11o.I00iiI;
                                        } else if (O0000Ioio00.I0000O(family, "serif")) {
/* 1354 */                                  iliO1o11o = IliO1o11o.I00iiO;
                                        } else {
/* 1357 */                                  String family2 = typefaceSpan.getFamily();
/* 1361 */                                  if (family2 == null || family2.length() == 0) {
/* 1419 */                                      iliO1o11o = null;
                                            } else {
/* 1371 */                                      Typeface typefaceCreate = Typeface.create(family2, 0);
/* 1375 */                                      Typeface typeface = Typeface.DEFAULT;
/* 1381 */                                      if (O0000Ioio00.I0000O(typefaceCreate, typeface) || O0000Ioio00.I0000O(typefaceCreate, Typeface.create(typeface, 0))) {
/* 1394 */                                          typefaceCreate = null;
                                                }
/* 1395 */                                      if (typefaceCreate != null) {
/* 1400 */                                          O1OIll00i o1OIll00i = new O1OIll00i(2);
/* 1403 */                                          o1OIll00i.I00iiI = typefaceCreate;
/* 1405 */                                          VarHandle.storeStoreFence();
/* 1410 */                                          O11lI0Oll0 o11lI0Oll0 = new O11lI0Oll0();
/* 1413 */                                          o11lI0Oll0.I00ilO0 = o1OIll00i;
/* 1415 */                                          VarHandle.storeStoreFence();
                                                    iliO1o11o = o11lI0Oll0;
                                                }
                                            }
                                        }
/* 1457 */                              i11110OIl2.I00000oIO(new OlIIi1oIIOlo(0L, 0L, null, null, null, iliO1o11o, null, 0L, null, null, null, 0L, null, null, 65503), i5, i6);
                                    } else if (obj2 instanceof UnderlineSpan) {
/* 1504 */                              i11110OIl2.I00000oIO(new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, OlooIOI0O.I0000Il00O, null, 61439), i5, i6);
                                    } else if ((obj2 instanceof URLSpan) && (url = ((URLSpan) obj2).getURL()) != null) {
/* 1540 */                              arrayList4.add(new I111101Olo00(i5, i6, 8, new O0ooi0ll(url, null, null), null));
                                    }
                                }
/* 1543 */                      i3++;
/* 1545 */                      i2 = 1;
                            }
/* 1552 */                  i11110OIl.I00000oOI(i11110OIl2.I000OiO());
/* 1555 */                  return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 561 */                   Oil0O0I oil0O0I4 = (Oil0O0I) obj;
/* 563 */                   Oil0Io.I0000O(oil0O0I4, this.I00iiI);
/* 566 */                   Oil0Io.I000OiO(oil0O0I4, 5);
/* 569 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 546 */                   Oil0O0I oil0O0I5 = (Oil0O0I) obj;
/* 548 */                   Oil0Io.I0000O(oil0O0I5, this.I00iiI);
/* 552 */                   Oil0Io.I000OiO(oil0O0I5, 5);
/* 555 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 421 */                   String str15 = this.I00iiI;
/* 427 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO9 = ((Olil0III) obj).I00000oIO("SELECT * FROM messages WHERE conversationId = ? ORDER BY timestamp ASC");
                            try {
/* 431 */                       oiIIl0O1l0lI00000oIO9.I00Io1o110i(1, str15);
/* 434 */                       int iI00000oIO9 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO9, "id");
/* 438 */                       int iI00000oIO10 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO9, "conversationId");
/* 442 */                       int iI00000oIO11 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO9, "role");
/* 446 */                       int iI00000oIO12 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO9, "content");
/* 450 */                       int iI00000oIO13 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO9, "timestamp");
/* 454 */                       int iI00000oIO14 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO9, "tokenCount");
/* 458 */                       int iI00000oIO15 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO9, "latencyMs");
/* 462 */                       int iI00000oIO16 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO9, "imagePaths");
/* 468 */                       ArrayList arrayList5 = new ArrayList();
/* 475 */                       while (oiIIl0O1l0lI00000oIO9.I00ol1()) {
/* 528 */                           arrayList5.add(new Message(oiIIl0O1l0lI00000oIO9.I00i0O(iI00000oIO9), oiIIl0O1l0lI00000oIO9.I00i0O(iI00000oIO10), oiIIl0O1l0lI00000oIO9.I00i0O(iI00000oIO11), oiIIl0O1l0lI00000oIO9.I00i0O(iI00000oIO12), oiIIl0O1l0lI00000oIO9.getLong(iI00000oIO13), (int) oiIIl0O1l0lI00000oIO9.getLong(iI00000oIO14), oiIIl0O1l0lI00000oIO9.getLong(iI00000oIO15), oiIIl0O1l0lI00000oIO9.isNull(iI00000oIO16) ? null : oiIIl0O1l0lI00000oIO9.I00i0O(iI00000oIO16)));
                                }
/* 537 */                       return arrayList5;
                            } finally {
                            }
                        case PoseLandmark.LEFT_THUMB:
/* 394 */                   String str16 = this.I00iiI;
/* 402 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO10 = ((Olil0III) obj).I00000oIO("DELETE FROM messages WHERE conversationId = ?");
                            try {
/* 406 */                       oiIIl0O1l0lI00000oIO10.I00Io1o110i(1, str16);
/* 409 */                       oiIIl0O1l0lI00000oIO10.I00ol1();
/* 415 */                       return ooiIlOl1iI;
                            } finally {
                            }
                        case PoseLandmark.RIGHT_THUMB:
/* 273 */                   String str17 = this.I00iiI;
/* 279 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO11 = ((Olil0III) obj).I00000oIO("SELECT * FROM messages WHERE conversationId = ? ORDER BY timestamp ASC");
                            try {
/* 283 */                       oiIIl0O1l0lI00000oIO11.I00Io1o110i(1, str17);
/* 286 */                       int iI00000oIO17 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO11, "id");
/* 290 */                       int iI00000oIO18 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO11, "conversationId");
/* 294 */                       int iI00000oIO19 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO11, "role");
/* 298 */                       int iI00000oIO20 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO11, "content");
/* 302 */                       int iI00000oIO21 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO11, "timestamp");
/* 306 */                       int iI00000oIO22 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO11, "tokenCount");
/* 310 */                       int iI00000oIO23 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO11, "latencyMs");
/* 314 */                       int iI00000oIO24 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO11, "imagePaths");
/* 320 */                       ArrayList arrayList6 = new ArrayList();
/* 327 */                       while (oiIIl0O1l0lI00000oIO11.I00ol1()) {
/* 380 */                           arrayList6.add(new Message(oiIIl0O1l0lI00000oIO11.I00i0O(iI00000oIO17), oiIIl0O1l0lI00000oIO11.I00i0O(iI00000oIO18), oiIIl0O1l0lI00000oIO11.I00i0O(iI00000oIO19), oiIIl0O1l0lI00000oIO11.I00i0O(iI00000oIO20), oiIIl0O1l0lI00000oIO11.getLong(iI00000oIO21), (int) oiIIl0O1l0lI00000oIO11.getLong(iI00000oIO22), oiIIl0O1l0lI00000oIO11.getLong(iI00000oIO23), oiIIl0O1l0lI00000oIO11.isNull(iI00000oIO24) ? null : oiIIl0O1l0lI00000oIO11.I00i0O(iI00000oIO24)));
                                }
/* 389 */                       return arrayList6;
                            } finally {
                            }
                        case PoseLandmark.LEFT_HIP:
/* 269 */                   Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 272 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 259 */                   Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 262 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 206 */                   String str18 = this.I00iiI;
/* 212 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO12 = ((Olil0III) obj).I00000oIO("SELECT long_value FROM Preference where `key`=?");
                            try {
/* 216 */                       oiIIl0O1l0lI00000oIO12.I00Io1o110i(1, str18);
/* 238 */                       return (!oiIIl0O1l0lI00000oIO12.I00ol1() || oiIIl0O1l0lI00000oIO12.isNull(0)) ? null : Long.valueOf(oiIIl0O1l0lI00000oIO12.getLong(0));
                            } finally {
                            }
                        case PoseLandmark.RIGHT_KNEE:
/* 159 */                   String str19 = this.I00iiI;
/* 165 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO13 = ((Olil0III) obj).I00000oIO("SELECT long_value FROM Preference where `key`=?");
                            try {
/* 169 */                       oiIIl0O1l0lI00000oIO13.I00Io1o110i(1, str19);
/* 191 */                       return (!oiIIl0O1l0lI00000oIO13.I00ol1() || oiIIl0O1l0lI00000oIO13.isNull(0)) ? null : Long.valueOf(oiIIl0O1l0lI00000oIO13.getLong(0));
                            } finally {
                            }
                        case 27:
/* 155 */                   Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 158 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 63 */                    String str20 = this.I00iiI;
/* 71 */                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO14 = ((Olil0III) obj).I00000oIO("SELECT * FROM rag_documents WHERE id = ? LIMIT 1");
                            try {
/* 75 */                        oiIIl0O1l0lI00000oIO14.I00Io1o110i(1, str20);
/* 140 */                       return oiIIl0O1l0lI00000oIO14.I00ol1() ? new RagDocumentEntity(oiIIl0O1l0lI00000oIO14.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO14, "id")), oiIIl0O1l0lI00000oIO14.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO14, "title")), oiIIl0O1l0lI00000oIO14.I00i0O(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO14, "uri")), oiIIl0O1l0lI00000oIO14.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO14, "created_at")), (int) oiIIl0O1l0lI00000oIO14.getLong(lO01io.I00000oIO(oiIIl0O1l0lI00000oIO14, "chunk_count"))) : null;
                            } finally {
                            }
                        default:
/* 59 */                    Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 62 */                    return ooiIlOl1iI;
                    }
/* 1712 */          return Boolean.valueOf(z);
                }
            }
