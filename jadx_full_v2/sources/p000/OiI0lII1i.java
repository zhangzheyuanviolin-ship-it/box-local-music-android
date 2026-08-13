            package p000;

            import android.view.KeyEvent;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class OiI0lII1i implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;

                public OiI0lII1i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    OoOi1Ol ooOi1OlI000l1;
/* 3 */             int i = this.I00iOIl;
/* 5 */             boolean z = false;
/* 6 */             int i2 = 1;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 394 */                   O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 396 */                   o0iiliOio.I00000oOI();
/* 414 */                   IilloIOOO0i.I00oII(o0iiliOio, (O0oo1oi0oil) this.I00iiI, 0L, 0L, 0.0f, null, null, 5, 62);
                            break;
                        case 1:
/* 367 */                   KeyEvent keyEvent = ((O0O1l0ilO) obj).I00000oIO;
/* 371 */                   Oiill0lI1il1 oiill0lI1il1 = (Oiill0lI1il1) this.I00iiI;
/* 381 */                   if (O0OI00ll.I00000oIO.I0010I0i(keyEvent) == O0O1Ool.I00oII) {
/* 383 */                       oiill0lI1il1.I0000Il00O();
/* 386 */                       z = true;
                            }
                            break;
                        case 2:
                            break;
                        case 3:
/* 322 */                   Throwable th = (Throwable) obj;
/* 326 */                   Oll11lOlo oll11lOlo = (Oll11lOlo) this.I00iiI;
/* 328 */                   IIoOoIol0Io0 iIoOoIol0Io0 = oll11lOlo.I00iiO;
/* 330 */                   if (iIoOoIol0Io0 != null) {
/* 332 */                       iIoOoIol0Io0.I0000O(th);
                            }
/* 335 */                   oll11lOlo.I00iiO = null;
                            break;
                        case 4:
/* 300 */                   float[] fArr = ((O1i010l1l) obj).I00000oIO;
/* 304 */                   O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) this.I00iiI;
/* 310 */                   if (o0iOOo0Ii.I0010o()) {
/* 316 */                       l0o0IlOil1.I0000Il00O(o0iOOo0Ii).I000OiO(o0iOOo0Ii, fArr);
                                break;
                            }
                            break;
                        case 5:
/* 107 */                   OoIOol ooIOol = (OoIOol) this.I00iiI;
/* 111 */                   OoOi0IIool ooOi0IIool = (OoOi0IIool) obj;
/* 113 */                   OoOOiO ooOOiO = ooOi0IIool.I00000oIO;
/* 115 */                   O00oiI0oo0ol o00oiI0oo0ol = ooOi0IIool.I00000oOI;
/* 117 */                   Set set = o00oiI0oo0ol.I0000oI00;
/* 119 */                   if (set == null || !set.contains(ooOOiO.I010i10l())) {
/* 137 */                       Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = ooOOiO.I00Ol10();
/* 143 */                       LinkedHashSet<OoOOiO> linkedHashSet = new LinkedHashSet();
/* 146 */                       lOoliOIOlIO0.I0000Il00O(ol0O0iI0l0OI00Ol10, ol0O0iI0l0OI00Ol10, linkedHashSet, set);
/* 155 */                       int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(linkedHashSet, 10));
/* 161 */                       if (iI00000oIO < 16) {
/* 163 */                           iI00000oIO = 16;
                                }
/* 166 */                       LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 177 */                       for (OoOOiO ooOOiO2 : linkedHashSet) {
/* 186 */                           if (set == null || !set.contains(ooOOiO2)) {
/* 200 */                               Set set2 = o00oiI0oo0ol.I0000oI00;
/* 228 */                               ooOi1OlI000l1 = iolOOiI.I000l1(ooOOiO2, o00oiI0oo0ol, ooIOol.I0000oI00(ooOOiO2, O00oiI0oo0ol.I00000oIO(o00oiI0oo0ol, null, false, set2 != null ? Oio0lI.I0001Ioi1lo(set2, ooOOiO) : Collections.singleton(ooOOiO), null, 47)));
                                    } else {
/* 195 */                               ooOi1OlI000l1 = OoOilo0Oliii.I000l1(ooOOiO2, o00oiI0oo0ol);
                                    }
/* 236 */                           linkedHashMap.put(ooOOiO2.I000OOo1O(), ooOi1OlI000l1);
                                }
/* 242 */                       OlIo1o0I0iIo olIo1o0I0iIo = new OlIo1o0I0iIo(i2);
/* 245 */                       olIo1o0I0iIo.I0000O = linkedHashMap;
/* 247 */                       VarHandle.storeStoreFence();
/* 259 */                       Oilolol11I oilolol11II000O01llI0 = ooIOol.I000O01llI0(new OoOilII0(olIo1o0I0iIo), ooOOiO.getUpperBounds(), o00oiI0oo0ol);
/* 269 */                       if (oilolol11II000O01llI0.I00iOIl.isEmpty()) {
                                    break;
                                } else if (oilolol11II000O01llI0.I00iOIl.I00l0I0l0lO1 == 1) {
                                    break;
                                } else {
/* 287 */                           I000II.I000iOII("Should only be one computed upper bound if no need to intersect all bounds");
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 6:
                            break;
                        case 7:
/* 92 */                    ((IiiOlIiio) this.I00iiI).I00000oOI();
                            break;
                        case 8:
/* 53 */                    Throwable th2 = (Throwable) obj;
/* 55 */                    if (th2 != null) {
/* 63 */                        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
/* 65 */                        if (cancellationException == null) {
/* 73 */                            cancellationException = new CancellationException(th2.getMessage());
                                }
/* 80 */                        ((O010loOOi0Oo) this.I00iiI).I001IIilI0O(cancellationException);
                                break;
                            }
                            break;
                        case 9:
/* 29 */                    int iIntValue = ((Integer) obj).intValue();
/* 35 */                    iliOO0l ilioo0l = new iliOO0l();
/* 38 */                    ilioo0l.I00000oIO = iIntValue;
/* 40 */                    VarHandle.storeStoreFence();
/* 47 */                    ((Ol1o0O0O0) this.I00iiI).add(ilioo0l);
                            break;
                        default:
/* 21 */                    ((lio0IOO101oI) this.I00iiI).cancel(false);
                            break;
                    }
/* 24 */            return ooiIlOl1iI;
                }
            }
