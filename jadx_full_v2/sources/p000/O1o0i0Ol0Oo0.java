            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import com.google.ai.edge.gallery.data.NamedDeviceGroup;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.util.Locale;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O1o0i0Ol0Oo0 implements Function1 {
                public final int I00iOIl;

                public O1o0i0Ol0Oo0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    String strValueOf;
/* 1 */             int i = this.I00iOIl;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 440 */                   ((Integer) obj).getClass();
/* 443 */                   return -40;
                        case 1:
/* 430 */                   ((Integer) obj).getClass();
/* 433 */                   return -40;
                        case 2:
/* 418 */                   ((Integer) obj).getClass();
/* 423 */                   return 40;
                        case 3:
/* 382 */                   OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) obj;
/* 411 */                   return "- " + oIoi0IIoi.I00iOIl + ": \"" + oIoi0IIoi.I00iiI + "\"";
                        case 4:
/* 379 */                   return Boolean.TRUE;
                        case 5:
/* 373 */                   Oil0Io.I000lI((Oil0O0I) obj);
/* 376 */                   return ooiIlOl1iI;
                        case 6:
/* 363 */                   O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 367 */                   ((Oil0O0I) obj).I00000oOI(Oil0I1O.I001iOo1i0O, ooiIlOl1iI);
/* 370 */                   return ooiIlOl1iI;
                        case 7:
/* 357 */                   ((Boolean) obj).getClass();
/* 360 */                   return ooiIlOl1iI;
                        case 8:
/* 351 */                   Oil0Io.I000lI((Oil0O0I) obj);
/* 354 */                   return ooiIlOl1iI;
                        case 9:
/* 346 */                   return ((O1oIOiI11o0) obj).I00000oIO;
                        case 10:
/* 339 */                   return Boolean.valueOf(((File) obj).isFile());
                        case 11:
/* 326 */                   return ((NamedDeviceGroup) obj).getDeviceModels();
                        case 12:
/* 319 */                   return ((String) obj).toLowerCase(Locale.ROOT);
                        case 13:
/* 310 */                   return Boolean.valueOf(O0000Ioio00.I0000O(((IOlOo10O0l0) obj).I00000oOI(), iIIiO0.I001IO000));
                        case 14:
/* 293 */                   return Boolean.valueOf(O0000Ioio00.I0000O(((IOlOo10O0l0) obj).I00000oOI(), iIIiO0.I000lI));
                        case 15:
/* 268 */                   OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) obj;
/* 276 */                   return Oi010OO0.I0010o("[", oIoiIo0o1O.I00000oOI, ", ", oIoiIo0o1O.I0000Il00O, ")");
                        case 16:
/* 263 */                   return Long.valueOf(((OiiO01I11iI) obj).I00000oIO);
                        case 17:
/* 175 */                   Map.Entry entry = (Map.Entry) obj;
/* 177 */                   Object value = entry.getValue();
/* 183 */                   if (value instanceof byte[]) {
/* 189 */                       StringBuilder sb = new StringBuilder();
/* 192 */                       sb.append((CharSequence) "[");
/* 197 */                       int i2 = 0;
/* 198 */                       for (byte b : (byte[]) value) {
/* 203 */                           i2++;
/* 204 */                           if (i2 > 1) {
/* 206 */                               sb.append((CharSequence) ", ");
                                    }
/* 213 */                           sb.append((CharSequence) String.valueOf((int) b));
                                }
/* 221 */                       sb.append((CharSequence) "]");
/* 224 */                       strValueOf = sb.toString();
                            } else {
/* 233 */                       strValueOf = String.valueOf(entry.getValue());
                            }
/* 254 */                   return IIlIOloOOO.I0010I0i(new StringBuilder("  "), ((OOI0IO111Ii) entry.getKey()).I00000oIO, " = ", strValueOf);
                        case PoseLandmark.RIGHT_PINKY:
/* 171 */                   return new OI1Oo0Oo1Olo(OiIoII10il0.I00000oIO((Ii0OO1I1iOo) obj));
                        case PoseLandmark.LEFT_INDEX:
/* 159 */                   return new I1loi0lOloO1(OiIoII10il0.I00000oIO((Ii0OO1I1iOo) obj));
                        case PoseLandmark.RIGHT_INDEX:
/* 138 */                   Context context = (Context) obj;
/* 142 */                   if (context instanceof ContextWrapper) {
/* 146 */                       return ((ContextWrapper) context).getBaseContext();
                            }
/* 11 */                    return null;
                        case PoseLandmark.LEFT_THUMB:
/* 120 */                   OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) obj;
/* 122 */                   OI1lo1liOO oI1lo1liOO = oI1ilOI1ioo0.I00iiO;
/* 124 */                   if (oI1lo1liOO == null || oI1lo1liOO.I00ilO0.I00iiI != oI1ilOI1ioo0.I00iiI.I00000oOI) {
/* 11 */                        return null;
                            }
/* 136 */                   return oI1lo1liOO;
                        case PoseLandmark.RIGHT_THUMB:
/* 102 */                   OI1ilOI1ioo0 oI1ilOI1ioo02 = (OI1ilOI1ioo0) obj;
/* 104 */                   OI1lo1liOO oI1lo1liOO2 = oI1ilOI1ioo02.I00iiO;
/* 106 */                   if (oI1lo1liOO2 == null || oI1lo1liOO2.I00ilO0.I00iiI != oI1ilOI1ioo02.I00iiI.I00000oOI) {
/* 11 */                        return null;
                            }
/* 118 */                   return oI1lo1liOO2;
                        case PoseLandmark.LEFT_HIP:
/* 97 */                    return Integer.valueOf(((OI1ilOI1ioo0) obj).I00iiI.I00000oOI);
                        case PoseLandmark.RIGHT_HIP:
/* 87 */                    return new OI1i0o1Ilo();
                        case PoseLandmark.LEFT_KNEE:
/* 66 */                    Context context2 = (Context) obj;
/* 75 */                    ContextWrapper contextWrapper = context2 instanceof ContextWrapper ? (ContextWrapper) context2 : null;
/* 76 */                    if (contextWrapper != null) {
/* 78 */                        return contextWrapper.getBaseContext();
                            }
/* 11 */                    return null;
                        case PoseLandmark.RIGHT_KNEE:
/* 56 */                    Context context3 = (Context) obj;
/* 60 */                    if (context3 instanceof Activity) {
/* 63 */                        return (Activity) context3;
                            }
/* 11 */                    return null;
                        case 27:
/* 53 */                    return ((OI1ilOI1ioo0) obj).I00iiO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 47 */                    return new I10lool01((OiO1O1lil10) obj);
                        default:
/* 39 */                    return new IOoOi11Io0o(Il0iiiII11.I0000oI00(iOO01lio0.I0000O(700, 6, null), 2), Il0iiiII11.I0001Ioi1lo(iOO01lio0.I0000O(700, 6, null), 2));
                    }
                }
            }
