            package p000;

            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.RawWorkInfoDao;
            import androidx.work.impl.model.WorkSpec;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.UUID;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol1OiIli00Ii implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;

                public Ol1OiIli00Ii(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    IIll0oO iIll0oOI0000Il00O;
/* 5 */             int i = this.I00iOIl;
/* 7 */             int i2 = 25;
/* 12 */            Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 1084 */                  return Boolean.valueOf(O0000Ioio00.I0000O(((IlI1oo0ioO) obj).I00000oIO, (Ol1OiolO0) obj2));
                        case 1:
/* 1037 */                  Ol1olI0o1I01 ol1olI0o1I01 = (Ol1olI0o1I01) obj2;
                            synchronized (ol1olI0o1I01.I000II) {
/* 1042 */                      Ol1oi0lO0I ol1oi0lO0I = ol1olI0o1I01.I000OOo1O;
/* 1044 */                      Object obj3 = ol1oi0lO0I.I00000oOI;
/* 1046 */                      int i3 = ol1oi0lO0I.I0000O;
/* 1048 */                      OI0o11I1 oI0o11I1 = ol1oi0lO0I.I0000Il00O;
/* 1050 */                      if (oI0o11I1 == null) {
/* 1054 */                          oI0o11I1 = new OI0o11I1();
/* 1057 */                          ol1oi0lO0I.I0000Il00O = oI0o11I1;
/* 1061 */                          ol1oi0lO0I.I0001Ioi1lo.I000lI(obj3, oI0o11I1);
                                }
/* 1064 */                      ol1oi0lO0I.I00000oOI(obj, i3, obj3, oI0o11I1);
                            }
/* 1068 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 777 */                   O0i0I0 o0i0I0 = (O0i0I0) obj2;
/* 781 */                   Illill0o illill0o = WorkSpec.WORK_INFO_MAPPER;
/* 783 */                   RawWorkInfoDao rawWorkInfoDaoI001i1O0Ol = ((WorkDatabase) obj).I001i1O0Ol();
/* 791 */                   String str = " AND";
/* 793 */                   ArrayList arrayList = o0i0I0.I00000oOI;
/* 795 */                   ArrayList arrayList2 = o0i0I0.I0000Il00O;
/* 797 */                   ArrayList arrayList3 = o0i0I0.I00000oIO;
/* 801 */                   ArrayList arrayList4 = new ArrayList();
/* 808 */                   StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
/* 811 */                   String str2 = " WHERE";
/* 813 */                   ArrayList arrayList5 = o0i0I0.I0000O;
/* 821 */                   if (!arrayList5.isEmpty()) {
/* 829 */                       ArrayList arrayList6 = new ArrayList(IOOi1I.I0000O(arrayList5, 10));
/* 832 */                       Iterator it = arrayList5.iterator();
/* 840 */                       while (it.hasNext()) {
/* 856 */                           arrayList6.add(Integer.valueOf(liIOOIo0.I000iOII((i01IOiO1lO) it.next())));
                                }
/* 862 */                       sb.append(" WHERE state IN (");
/* 869 */                       lIil00ooill.I00000oIO(arrayList6.size(), sb);
/* 872 */                       sb.append(")");
/* 875 */                       arrayList4.addAll(arrayList6);
/* 791 */                       str2 = " AND";
                            }
/* 883 */                   if (!arrayList3.isEmpty()) {
/* 891 */                       ArrayList arrayList7 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 894 */                       Iterator it2 = arrayList3.iterator();
/* 902 */                       while (it2.hasNext()) {
/* 914 */                           arrayList7.add(((UUID) it2.next()).toString());
                                }
/* 924 */                       sb.append(str2.concat(" id IN ("));
/* 931 */                       lIil00ooill.I00000oIO(arrayList3.size(), sb);
/* 934 */                       sb.append(")");
/* 937 */                       arrayList4.addAll(arrayList7);
/* 791 */                       str2 = " AND";
                            }
/* 945 */                   if (arrayList2.isEmpty()) {
/* 970 */                       str = str2;
                            } else {
/* 953 */                       sb.append(str2.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
/* 960 */                       lIil00ooill.I00000oIO(arrayList2.size(), sb);
/* 963 */                       sb.append("))");
/* 966 */                       arrayList4.addAll(arrayList2);
                            }
/* 975 */                   if (!arrayList.isEmpty()) {
/* 983 */                       sb.append(str.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
/* 990 */                       lIil00ooill.I00000oIO(arrayList.size(), sb);
/* 993 */                       sb.append("))");
/* 996 */                       arrayList4.addAll(arrayList);
                            }
/* 1001 */                  sb.append(";");
/* 1006 */                  String string = sb.toString();
/* 1012 */                  Object[] array = arrayList4.toArray(new Object[0]);
/* 1016 */                  IIlio101Io iIlio101Io = new IIlio101Io(i2);
/* 1019 */                  iIlio101Io.I00iiI = string;
/* 1021 */                  iIlio101Io.I00iiO = array;
/* 1023 */                  VarHandle.storeStoreFence();
/* 1034 */                  return (List) illill0o.apply(rawWorkInfoDaoI001i1O0Ol.getWorkInfoPojos(iIlio101Io));
                        case 3:
/* 561 */                   Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 564 */                   Oli100iIoOOO oli100iIoOOOI01101IOlO = Oli0oiO.I01101IOlO((Oli0oiO) obj2, 4);
/* 582 */                   oi11lOiIoi.I0000Il00O(oli100iIoOOOI01101IOlO.I001IO000((byte) 21) ? oli100iIoOOOI01101IOlO.I00IOO : 1.0f);
/* 597 */                   oi11lOiIoi.I000iOII(oli100iIoOOOI01101IOlO.I001IO000((byte) 22) ? oli100iIoOOOI01101IOlO.I00IioO0OiOi : 1.0f);
/* 610 */                   oi11lOiIoi.I000l1(oli100iIoOOOI01101IOlO.I001IO000((byte) 23) ? oli100iIoOOOI01101IOlO.I00IlilI0i0i : 1.0f);
/* 625 */                   oi11lOiIoi.I001l0I00(oli100iIoOOOI01101IOlO.I001IO000((byte) 24) ? oli100iIoOOOI01101IOlO.I00Io1lO : 0.0f);
/* 638 */                   oi11lOiIoi.I001lllioOl(oli100iIoOOOI01101IOlO.I001IO000((byte) 25) ? oli100iIoOOOI01101IOlO.I00Io1o110i : 0.0f);
/* 653 */                   oi11lOiIoi.I000O01llI0(oli100iIoOOOI01101IOlO.I001IO000((byte) 26) ? oli100iIoOOOI01101IOlO.I00IoIO0lI : 0.0f);
/* 668 */                   oi11lOiIoi.I000OOo1O(oli100iIoOOOI01101IOlO.I001IO000((byte) 27) ? oli100iIoOOOI01101IOlO.I00IoO0 : 0.0f);
/* 681 */                   oi11lOiIoi.I000OiO(oli100iIoOOOI01101IOlO.I001IO000((byte) 28) ? oli100iIoOOOI01101IOlO.I00IoiI : 0.0f);
/* 694 */                   oi11lOiIoi.I000II(oli100iIoOOOI01101IOlO.I001i1O0Ol(54) ? oli100iIoOOOI01101IOlO.I00O10llo : null);
/* 697 */                   long jI00000oIO = OoI0l01O.I00000oOI;
/* 707 */                   if (oli100iIoOOOI01101IOlO.I001IO000((byte) 29) || oli100iIoOOOI01101IOlO.I001IO000((byte) 30)) {
/* 715 */                       float fI0000Il00O = OoI0l01O.I0000Il00O(jI00000oIO);
/* 723 */                       if (oli100iIoOOOI01101IOlO.I001IO000((byte) 29)) {
/* 725 */                           fI0000Il00O = oli100iIoOOOI01101IOlO.I00Iooi00oi;
                                }
/* 727 */                       float fI0000O = OoI0l01O.I0000O(jI00000oIO);
/* 735 */                       if (oli100iIoOOOI01101IOlO.I001IO000((byte) 30)) {
/* 737 */                           fI0000O = oli100iIoOOOI01101IOlO.I00O0i0ii;
                                }
/* 739 */                       jI00000oIO = lOo0o0.I00000oIO(fI0000Il00O, fI0000O);
                            }
/* 743 */                   oi11lOiIoi.I001iOo1i0O(jI00000oIO);
/* 756 */                   oi11lOiIoi.I0001Ioi1lo(oli100iIoOOOI01101IOlO.I001IO000((byte) 31) ? oli100iIoOOOI01101IOlO.I00II0Ol1O0l : false);
/* 759 */                   OioOIi1o0I oioOIi1o0I = iO0ioilo.I00000oIO;
/* 767 */                   if (oli100iIoOOOI01101IOlO.I001i1O0Ol(53)) {
/* 769 */                       oioOIi1o0I = oli100iIoOOOI01101IOlO.I00II0oii1o;
                            }
/* 771 */                   oi11lOiIoi.I0010o(oioOIi1o0I);
/* 774 */                   return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 545 */                   ((Float) obj).getClass();
/* 554 */                   return Float.valueOf(((IiIooOOOI) obj2).I00i0ilIl0i(56.0f));
                        case 5:
/* 485 */                   Drawable drawable = (Drawable) obj2;
/* 487 */                   IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 493 */                   IIolOo iIolOoI0010o = iilloIOOO0i.I00iiI().I0010o();
/* 526 */                   drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)), (int) Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)));
/* 529 */                   Canvas canvas = I0lO01i00oi.I00000oIO;
/* 535 */                   drawable.draw(((I0lIooIo1) iIolOoI0010o).I00000oIO);
/* 538 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 479 */                   ((Function1) obj).invoke((OloilI0Ol) obj2);
/* 482 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 451 */                   Ol1OiIli00Ii ol1OiIli00Ii = (Ol1OiIli00Ii) obj2;
/* 453 */                   OoIOloiIii ooIOloiIii = (OoIOloiIii) obj;
/* 457 */                   if (ooIOloiIii instanceof I0O1lI0oi) {
/* 463 */                       ol1OiIli00Ii.invoke(((I0O1lI0oi) ooIOloiIii).I00o0iI0io1);
/* 466 */                       return Boolean.TRUE;
                            }
/* 471 */                   I000II.I001IO000("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
/* 11 */                    return null;
                        case 8:
/* 415 */                   CharSequence charSequence = (CharSequence) obj2;
/* 417 */                   Oil0O0I oil0O0I = (Oil0O0I) obj;
/* 424 */                   I1111OO10i i1111OO10i = charSequence instanceof I1111OO10i ? (I1111OO10i) charSequence : null;
/* 426 */                   if (i1111OO10i == null) {
/* 434 */                       i1111OO10i = new I1111OO10i(charSequence.toString());
                            }
/* 437 */                   O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 445 */                   oil0O0I.I00000oOI(Oil0I1O.I001lloI, Collections.singletonList(i1111OO10i));
/* 448 */                   return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 357 */                   Oo0I110i oo0I110i = (Oo0I110i) obj2;
/* 361 */                   float fFloatValue = ((Float) obj).floatValue();
/* 365 */                   OIooO1iiliI oIooO1iiliI = oo0I110i.I00000oIO;
/* 371 */                   float fI000II = oIooO1iiliI.I000II() + fFloatValue;
/* 372 */                   OIooO1iiliI oIooO1iiliI2 = oo0I110i.I00000oOI;
/* 380 */                   if (fI000II > oIooO1iiliI2.I000II()) {
/* 390 */                       fFloatValue = oIooO1iiliI2.I000II() - oIooO1iiliI.I000II();
                            } else if (fI000II < 0.0f) {
/* 401 */                       fFloatValue = -oIooO1iiliI.I000II();
                            }
/* 407 */                   oIooO1iiliI.I000O01llI0(oIooO1iiliI.I000II() + fFloatValue);
/* 410 */                   return Float.valueOf(fFloatValue);
                        case 10:
/* 298 */                   Oo0io0OO1 oo0io0OO1 = (Oo0io0OO1) obj2;
/* 300 */                   I11110l0o i11110l0o = (I11110l0o) obj;
/* 304 */                   I1110oO i1110oO = (I1110oO) i11110l0o.I00000oIO;
/* 310 */                   if (i1110oO instanceof O0ooi0ll) {
/* 313 */                       O0ooi0ll o0ooi0ll = (O0ooi0ll) i1110oO;
/* 317 */                       if (o0ooi0ll.I00000oOI == null) {
/* 328 */                           return I11110l0o.I00000oIO(i11110l0o, new O0ooi0ll(o0ooi0ll.I00000oIO, oo0io0OO1, o0ooi0ll.I0000Il00O), 0, 14);
                                }
                            }
/* 335 */                   if (!(i1110oO instanceof O0ooi0iOlIOI)) {
/* 356 */                       return i11110l0o;
                            }
/* 337 */                   O0ooi0iOlIOI o0ooi0iOlIOI = (O0ooi0iOlIOI) i1110oO;
                            return o0ooi0iOlIOI.I00000oOI == null ? I11110l0o.I00000oIO(i11110l0o, new O0ooi0iOlIOI(o0ooi0iOlIOI.I00000oIO, oo0io0OO1, o0ooi0iOlIOI.I0000Il00O), 0, 14) : i11110l0o;
                        case 11:
/* 293 */                   ((OoI00O0l) obj2).I000OiO = null;
/* 295 */                   return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 280 */                   OoI1lO ooI1lO = new OoI1lO(2);
/* 283 */                   ooI1lO.I00000oOI = (OoI1iOl0IoI) obj2;
/* 285 */                   VarHandle.storeStoreFence();
/* 288 */                   return ooI1lO;
                        case 13:
/* 264 */                   OoI1lO ooI1lO2 = new OoI1lO(1);
/* 267 */                   ooI1lO2.I00000oOI = (OoI1Oi0l1I0o) obj2;
/* 269 */                   VarHandle.storeStoreFence();
/* 272 */                   return ooI1lO2;
                        case 14:
/* 252 */                   return OoIIliIIII0.I00000oIO((OoIIliIIII0) obj, null, ((Throwable) obj2).getMessage(), 63);
                        case 15:
/* 237 */                   return OoIIliIIII0.I00000oIO((OoIIliIIII0) obj, OlOoOIi0o.I00OIo(((StringBuilder) obj2).toString()).toString(), null, 223);
                        case 16:
/* 183 */                   int iFloatValue = (int) ((Float) obj).floatValue();
/* 184 */                   OlO0OIIl1 olO0OIIl1 = ((OoIoI0iii0) obj2).I00000oOI;
/* 213 */                   olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, iFloatValue < 0 ? 0 : iFloatValue, 0.0f, 0, null, false, 0.0f, null, 507));
/* 216 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 144 */                   float fFloatValue2 = ((Float) obj).floatValue();
/* 148 */                   OlO0OIIl1 olO0OIIl12 = ((Ool0lIIlll) obj2).I00000oOI;
/* 169 */                   olO0OIIl12.I000lI(null, Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl12.getValue(), null, null, false, fFloatValue2, false, false, null, 119));
/* 172 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 76 */                    IIliIi1O0OiO iIliIi1O0OiO = (IIliIi1O0OiO) obj;
/* 78 */                    IIloOiil iIloOiil = ((OolOO1oOoo) obj2).I00000oIO;
                            synchronized (iIloOiil.I0000Il00O) {
/* 85 */                        if (iIloOiil.I0000O) {
/* 137 */                           throw new IllegalStateException("Check failed.");
                                }
/* 93 */                        StringBuilder sb2 = new StringBuilder("CameraGraph-");
/* 96 */                        I1OollilIo i1OollilIo = IIll0Oilo.I00000oOI;
/* 98 */                        i1OollilIo.getClass();
/* 107 */                       sb2.append(I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo));
/* 110 */                       String string2 = sb2.toString();
/* 114 */                       IIll0Oilo iIll0Oilo = new IIll0Oilo();
/* 117 */                       iIll0Oilo.I00000oIO = string2;
/* 119 */                       VarHandle.storeStoreFence();
/* 122 */                       iIll0oOI0000Il00O = iIloOiil.I0000Il00O(iIliIi1O0OiO, iIll0Oilo);
                            }
/* 127 */                   return iIll0oOI0000Il00O;
                        case PoseLandmark.LEFT_INDEX:
/* 52 */                    O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 54 */                    o0iiliOio.I00000oOI();
/* 68 */                    IilloIOOO0i.I00oII(o0iiliOio, (O0oo1oi0oil) obj2, 0L, 0L, 0.0f, null, null, 8, 62);
/* 71 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 22 */                    OlO0OIIl1 olO0OIIl13 = ((i0I01lo) obj2).I00000oOI;
/* 43 */                    olO0OIIl13.I000lI(null, i0I01ii.I00000oIO((i0I01ii) olO0OIIl13.getValue(), (String) obj, false, null, 0.0f, null, null, false, 126));
/* 46 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
