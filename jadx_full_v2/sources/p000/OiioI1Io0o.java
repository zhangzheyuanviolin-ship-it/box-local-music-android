            package p000;

            import android.content.res.Resources;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OiioI1Io0o implements Function1 {
                public final int I00iOIl;

                public OiioI1Io0o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws Exception {
                    int iOffsetByCodePoints;
/* 1 */             int i = this.I00iOIl;
/* 13 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 412 */                   List list = (List) obj;
/* 416 */                   OiioIllIl oiioIllIl = new OiioIllIl();
/* 423 */                   List list2 = (List) list.get(0);
/* 425 */                   IoloOio0I ioloOio0I = I1111OO10i.I00ilI0I1;
/* 433 */                   ArrayList arrayList = new ArrayList(list2.size());
/* 439 */                   int size = list2.size();
/* 443 */                   for (int i2 = 0; i2 < size; i2++) {
/* 457 */                       I1111OO10i i1111OO10i = (I1111OO10i) ((Function1) ioloOio0I.I00iiO).invoke(list2.get(i2));
/* 459 */                       if (i1111OO10i != null) {
/* 461 */                           arrayList.add(i1111OO10i);
                                }
                            }
/* 469 */                   oiioIllIl.I0000Il00O.setValue(arrayList);
/* 472 */                   Object obj2 = list.get(1);
/* 481 */                   Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
/* 483 */                   if (num != null) {
/* 571 */                       oiioIllIl.I00000oIO.setValue(new OiiOlI0I(new OiiOOli(Oi0il01O01IO.valueOf((String) list.get(3)), num.intValue(), ((Long) list.get(2)).longValue()), new OiiOOli(Oi0il01O01IO.valueOf((String) list.get(6)), ((Integer) list.get(4)).intValue(), ((Long) list.get(5)).longValue()), ((Boolean) list.get(7)).booleanValue()));
                            }
/* 574 */                   return oiioIllIl;
                        case 1:
/* 409 */                   return ((Oil1oo000i) obj).I00000oIO;
                        case 2:
/* 402 */                   return ((OilO0iOl) obj).iterator();
                        case 3:
/* 399 */                   return obj;
                        case 4:
/* 394 */                   return Boolean.valueOf(obj == null);
                        case 5:
/* 389 */                   return ooiIlOl1iI;
                        case 6:
/* 384 */                   List list3 = OioIlii1iOO.I00000oIO;
/* 386 */                   return ooiIlOl1iI;
                        case 7:
/* 377 */                   return ((Ol0oI1llIloI) obj).I00000oIO.I001i1O0Ol();
                        case 8:
/* 368 */                   return ((Ol0oI1llIloI) obj).I00000oIO.I001i1O0Ol();
                        case 9:
/* 345 */                   Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) obj;
/* 359 */                   return IIl001iO0Io.I000oI1ioi("- ", ol0ioI1iI.I001i1O0Ol(), ": ", ol0ioI1iI.I0010o());
                        case 10:
/* 340 */                   return ((Ol0ioI1iI) obj).I001i1O0Ol();
                        case 11:
/* 333 */                   return ((Ol0ioI1iI) obj).I001i1O0Ol();
                        case 12:
/* 295 */                   Ol0ioI1iI ol0ioI1iI2 = (Ol0ioI1iI) obj;
/* 326 */                   return ol0ioI1iI2.I001i1O0Ol() + "(" + ol0ioI1iI2.I001l0I00() + ")";
                        case 13:
/* 294 */                   return ooiIlOl1iI;
                        case 14:
/* 291 */                   return ooiIlOl1iI;
                        case 15:
/* 288 */                   return ooiIlOl1iI;
                        case 16:
/* 269 */                   O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 271 */                   Oil0IoooOio oil0IoooOio = Oil0I1O.I000lI;
/* 275 */                   O0O00I1Ili o0O00I1Ili = Oil0Io.I00000oIO[5];
/* 277 */                   Boolean bool = Boolean.TRUE;
/* 279 */                   oil0IoooOio.getClass();
/* 282 */                   ((Oil0O0I) obj).I00000oOI(oil0IoooOio, bool);
/* 285 */                   return ooiIlOl1iI;
                        case 17:
/* 266 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 263 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 256 */                   return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
                        case PoseLandmark.RIGHT_INDEX:
/* 207 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                            try {
/* 213 */                       ArrayList arrayList2 = new ArrayList();
/* 220 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 226 */                           arrayList2.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 235 */                       return arrayList2;
                            } finally {
/* 236 */                       oiIIl0O1l0lI00000oIO.close();
                            }
                        case PoseLandmark.LEFT_THUMB:
/* 202 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 196 */                   ((Float) obj).getClass();
/* 199 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 188 */                   ((Integer) obj).intValue();
/* 191 */                   return Oo001ol1Olli.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 185 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 122 */                   Oo0I01o oo0I01o = (Oo0I01o) obj;
/* 126 */                   String str = oo0I01o.I000II.I00iiI;
/* 128 */                   long j = oo0I01o.I0001Ioi1lo;
/* 130 */                   int i3 = Oo0lI00l.I0000Il00O;
/* 133 */                   int i4 = (int) (j & 4294967295L);
/* 134 */                   if (i4 > 0) {
/* 138 */                       IiollO1llli iiollO1llliI0000Il00O = lOOoIo11O.I0000Il00O();
/* 142 */                       if (iiollO1llliI0000Il00O == null) {
/* 147 */                           iOffsetByCodePoints = i4 <= 0 ? -1 : Character.offsetByCodePoints(str, i4, -1);
                                } else {
/* 154 */                           int iI00000oOI = iiollO1llliI0000Il00O.I00000oOI(i4 - 1, str);
/* 158 */                           if (iI00000oOI >= 0) {
/* 168 */                               iOffsetByCodePoints = iI00000oOI;
                                    } else if (i4 > 0) {
/* 163 */                               iOffsetByCodePoints = Character.offsetByCodePoints(str, i4, -1);
                                    }
                                }
                            }
/* 169 */                   if (iOffsetByCodePoints == -1) {
/* 11 */                        return null;
                            }
/* 179 */                   return new IiIo10oo1il(((int) (oo0I01o.I0001Ioi1lo & 4294967295L)) - iOffsetByCodePoints, 0);
                        case PoseLandmark.RIGHT_KNEE:
/* 93 */                    Oo0I01o oo0I01o2 = (Oo0I01o) obj;
/* 97 */                    String str2 = oo0I01o2.I000II.I00iiI;
/* 99 */                    long j2 = oo0I01o2.I0001Ioi1lo;
/* 101 */                   int i5 = Oo0lI00l.I0000Il00O;
/* 105 */                   int iI00000oIO = lOOoIo11O.I00000oIO((int) (j2 & 4294967295L), str2);
/* 109 */                   if (iI00000oIO != -1) {
/* 118 */                       return new IiIo10oo1il(0, iI00000oIO - ((int) (oo0I01o2.I0001Ioi1lo & 4294967295L)));
                            }
/* 11 */                    return null;
                        case 27:
/* 68 */                    Oo0I01o oo0I01o3 = (Oo0I01o) obj;
/* 70 */                    Integer numI0000oI00 = oo0I01o3.I0000oI00();
/* 74 */                    if (numI0000oI00 == null) {
/* 11 */                        return null;
                            }
/* 76 */                    int iIntValue = numI0000oI00.intValue();
/* 82 */                    long j3 = oo0I01o3.I0001Ioi1lo;
/* 84 */                    int i6 = Oo0lI00l.I0000Il00O;
/* 89 */                    return new IiIo10oo1il(((int) (j3 & 4294967295L)) - iIntValue, 0);
                        case PoseLandmark.RIGHT_ANKLE:
/* 43 */                    Oo0I01o oo0I01o4 = (Oo0I01o) obj;
/* 45 */                    Integer numI0000O = oo0I01o4.I0000O();
/* 49 */                    if (numI0000O == null) {
/* 11 */                        return null;
                            }
/* 51 */                    int iIntValue2 = numI0000O.intValue();
/* 57 */                    long j4 = oo0I01o4.I0001Ioi1lo;
/* 59 */                    int i7 = Oo0lI00l.I0000Il00O;
/* 64 */                    return new IiIo10oo1il(0, iIntValue2 - ((int) (j4 & 4294967295L)));
                        default:
/* 18 */                    Oo0I01o oo0I01o5 = (Oo0I01o) obj;
/* 20 */                    Integer numI0000Il00O = oo0I01o5.I0000Il00O();
/* 24 */                    if (numI0000Il00O == null) {
/* 11 */                        return null;
                            }
/* 26 */                    int iIntValue3 = numI0000Il00O.intValue();
/* 32 */                    long j5 = oo0I01o5.I0001Ioi1lo;
/* 34 */                    int i8 = Oo0lI00l.I0000Il00O;
/* 39 */                    return new IiIo10oo1il(((int) (j5 & 4294967295L)) - iIntValue3, 0);
                    }
                }
            }
