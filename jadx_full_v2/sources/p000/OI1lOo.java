            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.ResolveInfo;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OI1lOo implements Function1 {
                public final int I00iOIl;

                public OI1lOo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    String str;
/* 1 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 520 */                   return new IOoOi11Io0o(Il0iiiII11.I0000oI00(iOO01lio0.I0000O(700, 6, null), 2), Il0iiiII11.I0001Ioi1lo(iOO01lio0.I0000O(700, 6, null), 2));
                        case 1:
/* 495 */                   return ooiIlOl1iI;
                        case 2:
/* 478 */                   OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) obj;
/* 482 */                   if (!(oI1ilOI1ioo0 instanceof OI1lo1liOO)) {
/* 5 */                         return null;
                            }
/* 486 */                   I0oiil10Ili i0oiil10Ili = ((OI1lo1liOO) oI1ilOI1ioo0).I00ilO0;
/* 490 */                   return i0oiil10Ili.I000II(i0oiil10Ili.I00iiI);
                        case 3:
/* 452 */                   IOiooil iOiooil = (IOiooil) ((OI1OloOIO1O) ((I10l1l11) obj).I0000oI00()).I00iiI;
/* 454 */                   int i2 = OI1ilOI1ioo0.I00ilI0I1;
/* 468 */                   for (OI1ilOI1ioo0 oI1ilOI1ioo02 : l1iO11O10.I00000oOI(iOiooil)) {
                            }
/* 5 */                     return null;
                        case 4:
/* 439 */                   return ((OI1OloOIO1O) obj).I00ilO0;
                        case 5:
/* 434 */                   return Boolean.TRUE;
                        case 6:
/* 424 */                   IlIi0Il ilIi0Il = ((OIIilO10ooi) obj).I00000oIO;
/* 426 */                   if (ilIi0Il != null) {
/* 428 */                       ilIi0Il.invoke();
                            }
/* 431 */                   return ooiIlOl1iI;
                        case 7:
/* 401 */                   OIIlIII0Ili oIIlIII0Ili = (OIIlIII0Ili) obj;
/* 403 */                   O0iiOioolIi o0iiOioolIi = oIIlIII0Ili.I00oO101o;
                            try {
/* 409 */                       if (oIIlIII0Ili.I001IIilI0O()) {
/* 411 */                           oIIlIII0Ili.I01Ilo0i(true);
                                }
/* 417 */                       return ooiIlOl1iI;
                            } catch (Throwable th) {
/* 418 */                       o0iiOioolIi.I00OloOo(th);
/* 421 */                       throw null;
                            }
                        case 8:
/* 391 */                   OIlIooO oIlIooO = ((OIIlIII0Ili) obj).I01101olii;
/* 393 */                   if (oIlIooO != null) {
/* 397 */                       ((Io10OIiiOll) oIlIooO).I0000Il00O();
                            }
/* 400 */                   return ooiIlOl1iI;
                        case 9:
/* 385 */                   ((Long) obj).getClass();
/* 388 */                   return ooiIlOl1iI;
                        case 10:
/* 380 */                   ((IOIi0iI010o) obj).I00000oOI = Il01100l.I00iOIl;
/* 382 */                   return ooiIlOl1iI;
                        case 11:
/* 362 */                   OIOili0 oIOili0 = (OIOili0) obj;
/* 368 */                   if (oIOili0.I001IIilI0O()) {
/* 372 */                       oIOili0.I00iOIl.I00ilO0();
                            }
/* 375 */                   return ooiIlOl1iI;
                        case 12:
/* 310 */                   IOlIOlli0I iOlIOlli0I = (IOlIOlli0I) obj;
/* 312 */                   int i3 = I0oiIoiIO.I00000oIO;
/* 320 */                   Context context = (Context) iOlIOlli0I.I00iIO(I0lloOI0oio.I00000oOI);
/* 328 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) iOlIOlli0I.I00iIO(IOlO0o100i1i.I000O01llI0);
/* 336 */                   OIlIliIOo oIlIliIOo = (OIlIliIOo) iOlIOlli0I.I00iIO(OIlIloII.I00000oIO);
/* 338 */                   if (oIlIliIOo == null) {
/* 5 */                         return null;
                            }
/* 343 */                   long j = oIlIliIOo.I00000oIO;
/* 345 */                   OIo1i1 oIo1i1 = oIlIliIOo.I00000oOI;
/* 347 */                   I0o1iOo1i i0o1iOo1i = new I0o1iOo1i();
/* 350 */                   i0o1iOo1i.I00000oIO = context;
/* 352 */                   i0o1iOo1i.I00000oOI = iiIooOOOI;
/* 354 */                   i0o1iOo1i.I0000Il00O = j;
/* 356 */                   i0o1iOo1i.I0000O = oIo1i1;
/* 358 */                   VarHandle.storeStoreFence();
/* 361 */                   return i0o1iOo1i;
                        case 13:
/* 298 */                   O0iiOioolIi o0iiOioolIi2 = (O0iiOioolIi) obj;
/* 304 */                   if (o0iiOioolIi2.I00Io1lO()) {
/* 306 */                       O0iiOioolIi.I00OilO00Il(o0iiOioolIi2, false, 7);
                            }
/* 309 */                   return ooiIlOl1iI;
                        case 14:
/* 286 */                   O0iiOioolIi o0iiOioolIi3 = (O0iiOioolIi) obj;
/* 292 */                   if (o0iiOioolIi3.I00Io1lO()) {
/* 294 */                       O0iiOioolIi.I00Ol00(o0iiOioolIi3, false, 7);
                            }
/* 297 */                   return ooiIlOl1iI;
                        case 15:
/* 274 */                   O0iiOioolIi o0iiOioolIi4 = (O0iiOioolIi) obj;
/* 280 */                   if (o0iiOioolIi4.I00Io1lO()) {
/* 282 */                       o0iiOioolIi4.I00IioO0OiOi();
                            }
/* 285 */                   return ooiIlOl1iI;
                        case 16:
/* 262 */                   O0iiOioolIi o0iiOioolIi5 = (O0iiOioolIi) obj;
/* 268 */                   if (o0iiOioolIi5.I00Io1lO()) {
/* 270 */                       o0iiOioolIi5.I00Oio(false);
                            }
/* 273 */                   return ooiIlOl1iI;
                        case 17:
/* 250 */                   O0iiOioolIi o0iiOioolIi6 = (O0iiOioolIi) obj;
/* 256 */                   if (o0iiOioolIi6.I00Io1lO()) {
/* 258 */                       o0iiOioolIi6.I00Oio(false);
                            }
/* 261 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 238 */                   O0iiOioolIi o0iiOioolIi7 = (O0iiOioolIi) obj;
/* 244 */                   if (o0iiOioolIi7.I00Io1lO()) {
/* 246 */                       o0iiOioolIi7.I00OOll1(false);
                            }
/* 249 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 226 */                   O0iiOioolIi o0iiOioolIi8 = (O0iiOioolIi) obj;
/* 232 */                   if (o0iiOioolIi8.I00Io1lO()) {
/* 234 */                       o0iiOioolIi8.I00OOll1(false);
                            }
/* 237 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 221 */                   return Boolean.valueOf(!((OIlO0l10o01) obj).I001IIilI0O());
                        case PoseLandmark.LEFT_THUMB:
/* 213 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 210 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 207 */                   throw IIlIOloOOO.I000l1(obj);
                        case PoseLandmark.RIGHT_HIP:
/* 191 */                   OO1lio oO1lio = (OO1lio) obj;
/* 197 */                   if (oO1lio.isAttachedToWindow()) {
/* 199 */                       oO1lio.I0010o();
                            }
/* 202 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 188 */                   return OOIl1Io0.I00000oOI;
                        case PoseLandmark.RIGHT_KNEE:
/* 97 */                    Context context2 = (Context) obj;
/* 120 */                   List<ResolveInfo> listQueryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
/* 130 */                   ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
/* 136 */                   int size = listQueryIntentActivities.size();
/* 140 */                   for (int i4 = 0; i4 < size; i4++) {
/* 142 */                       ResolveInfo resolveInfo = listQueryIntentActivities.get(i4);
/* 147 */                       ResolveInfo resolveInfo2 = resolveInfo;
/* 161 */                       if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
/* 163 */                           ActivityInfo activityInfo = resolveInfo2.activityInfo;
/* 167 */                           if (activityInfo.exported && ((str = activityInfo.permission) == null || context2.checkSelfPermission(str) == 0)) {
/* 179 */                               arrayList.add(resolveInfo);
                                    }
                                }
                            }
/* 185 */                   return arrayList;
                        case 27:
/* 23 */                    O0OO1iIo o0OO1iIo = (O0OO1iIo) obj;
/* 27 */                    o0OO1iIo.I00000oIO = 6000;
/* 31 */                    Float fValueOf = Float.valueOf(90.0f);
/* 43 */                    o0OO1iIo.I00000oIO(fValueOf, 300).I00000oOI = OI0I100IO.I00000oOI;
/* 47 */                    o0OO1iIo.I00000oIO(fValueOf, 1500);
/* 52 */                    Float fValueOf2 = Float.valueOf(180.0f);
/* 58 */                    o0OO1iIo.I00000oIO(fValueOf2, 1800);
/* 63 */                    o0OO1iIo.I00000oIO(fValueOf2, 3000);
/* 68 */                    Float fValueOf3 = Float.valueOf(270.0f);
/* 74 */                    o0OO1iIo.I00000oIO(fValueOf3, 3300);
/* 79 */                    o0OO1iIo.I00000oIO(fValueOf3, 4500);
/* 84 */                    Float fValueOf4 = Float.valueOf(360.0f);
/* 90 */                    o0OO1iIo.I00000oIO(fValueOf4, 4800);
/* 93 */                    o0OO1iIo.I00000oIO(fValueOf4, 6000);
/* 96 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 19 */                    Oil0Io.I000OOo1O((Oil0O0I) obj, OOO01oo.I0000O);
/* 22 */                    return ooiIlOl1iI;
                        default:
/* 14 */                    return ooiIlOl1iI;
                    }
                }
            }
