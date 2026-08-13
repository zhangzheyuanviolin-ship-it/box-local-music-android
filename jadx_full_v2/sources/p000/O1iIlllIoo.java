            package p000;

            import android.content.ClipData;
            import android.content.Context;
            import android.net.Uri;
            import android.os.IInterface;
            import android.util.Log;
            import android.view.textclassifier.TextClassifier;
            import com.google.ai.edge.gallery.customtasks.agentchat.McpToolSet;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.BufferedReader;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.jvm.functions.Function1;
            
/* 10 */    public final class O1iIlllIoo extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1iIlllIoo(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = obj;
/* 5 */             this.I00iio = obj2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 398 */                   return new O1iIlllIoo((McpToolSet) this.I00iiO, (I0i1Io) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 385 */                   return new O1iIlllIoo((O1iOlOIiO) this.I00iiO, (Uri) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 372 */                   return new O1iIlllIoo((Ol1OlloIO) this.I00iiO, (ArrayList) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 359 */                   return new O1iIlllIoo((I10i01) this.I00iiO, (OIooO1iiliI) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 346 */                   return new O1iIlllIoo((OlO0I1lIii1) this.I00iiO, (OI01Ilio) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 331 */                   O1iIlllIoo o1iIlllIoo = new O1iIlllIoo((OI0Iio01O) obj2, iOoil1iiIilo, 5);
/* 334 */                   o1iIlllIoo.I00iiO = obj;
/* 336 */                   return o1iIlllIoo;
                        case 6:
/* 322 */                   return new O1iIlllIoo((OIIOiO00i1i) this.I00iiO, (OOIoOo0O) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 309 */                   return new O1iIlllIoo((OIIoI1l0) this.I00iiO, (IlliIl1l11O) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 294 */                   O1iIlllIoo o1iIlllIoo2 = new O1iIlllIoo((IO1010) obj2, iOoil1iiIilo, 8);
/* 297 */                   o1iIlllIoo2.I00iiO = obj;
/* 299 */                   return o1iIlllIoo2;
                        case 9:
/* 284 */                   return new O1iIlllIoo((IlliIl1l11O) this.I00iiO, (OO01Ol) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 270 */                   return new O1iIlllIoo((TextClassifier) this.I00iiO, (IlliIl1l11O) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 256 */                   return new O1iIlllIoo((IOO0IOIll) this.I00iiO, (OlO01l1oOil) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 240 */                   O1iIlllIoo o1iIlllIoo3 = new O1iIlllIoo((OOiIOI10OOIi) obj2, iOoil1iiIilo, 12);
/* 243 */                   o1iIlllIoo3.I00iiO = obj;
/* 245 */                   return o1iIlllIoo3;
                        case 13:
/* 228 */                   O1iIlllIoo o1iIlllIoo4 = new O1iIlllIoo((OOiOlo1l0I0o) obj2, iOoil1iiIilo, 13);
/* 231 */                   o1iIlllIoo4.I00iiO = obj;
/* 233 */                   return o1iIlllIoo4;
                        case 14:
/* 218 */                   return new O1iIlllIoo((iOliil) this.I00iiO, obj2, iOoil1iiIilo, 14);
                        case 15:
/* 206 */                   return new O1iIlllIoo((OOl0lll0li0) this.I00iiO, (Uri) obj2, iOoil1iiIilo, 15);
                        case 16:
/* 192 */                   return new O1iIlllIoo((OOl1OlI0) this.I00iiO, (String) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 178 */                   return new O1iIlllIoo((OOllOII) this.I00iiO, (IoiOl011o) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 164 */                   return new O1iIlllIoo((ListenableFuture) this.I00iiO, (OOooio11i00) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 150 */                   return new O1iIlllIoo((String) this.I00iiO, (IOO0IOIll) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 136 */                   return new O1iIlllIoo((I0oo10O) this.I00iiO, (I110IiI0o1Il) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 120 */                   O1iIlllIoo o1iIlllIoo5 = new O1iIlllIoo((I0oo10O) obj2, iOoil1iiIilo, 21);
/* 123 */                   o1iIlllIoo5.I00iiO = obj;
/* 125 */                   return o1iIlllIoo5;
                        case PoseLandmark.RIGHT_THUMB:
/* 108 */                   O1iIlllIoo o1iIlllIoo6 = new O1iIlllIoo((Function1) obj2, iOoil1iiIilo, 22);
/* 111 */                   o1iIlllIoo6.I00iiO = obj;
/* 113 */                   return o1iIlllIoo6;
                        case PoseLandmark.LEFT_HIP:
/* 98 */                    return new O1iIlllIoo((IilIoiI1Oo01) this.I00iiO, (OiOoIO1) obj2, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 84 */                    return new O1iIlllIoo((OI0lOIiOIOOo) this.I00iiO, (OIooi1iOiOol) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 70 */                    return new O1iIlllIoo((IOO0IOIll) this.I00iiO, (I1111OO10i) obj2, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 56 */                    return new O1iIlllIoo((III0Ii) this.I00iiO, (OOo0ooi) obj2, iOoil1iiIilo, 26);
                        case 27:
/* 42 */                    return new O1iIlllIoo((OiolI10I1oOO) this.I00iiO, (OlIOiI1iI1) obj2, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 28 */                    return new O1iIlllIoo((iOliil) obj2, iOoil1iiIilo, 28);
                        default:
/* 18 */                    return new O1iIlllIoo((Ol0o1OiOIIIl) this.I00iiO, (I0IoOl) obj2, iOoil1iiIilo, 29);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 4:
/* 393 */                   ((O1iIlllIoo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 18 */            return ((O1iIlllIoo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:144:0x03c7, code lost:
                
                    if (r1.invoke(r2, r5) != r0) goto L146;
                 */
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:104:0x02ad  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x0306 A[LOOP:7: B:116:0x0300->B:118:0x0306, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:127:0x036b A[LOOP:8: B:121:0x032e->B:127:0x036b, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:137:0x038d A[PHI: r1 r2
                  0x038d: PHI (r1v131 Ii1O001loIoO) = (r1v137 Ii1O001loIoO), (r1v144 Ii1O001loIoO) binds: [B:141:0x03bc, B:136:0x0384] A[DONT_GENERATE, DONT_INLINE]
                  0x038d: PHI (r2v82 java.lang.Object) = (r2v85 java.lang.Object), (r2v87 java.lang.Object) binds: [B:141:0x03bc, B:136:0x0384] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:316:0x06fb  */
                /* JADX WARN: Removed duplicated region for block: B:457:0x0937  */
                /* JADX WARN: Removed duplicated region for block: B:577:0x0352 A[SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r1v154 */
                /* JADX WARN: Type inference failed for: r1v155 */
                /* JADX WARN: Type inference failed for: r1v28, types: [int] */
                /* JADX WARN: Type inference failed for: r1v29, types: [O010OIi] */
                /* JADX WARN: Type inference failed for: r1v33, types: [O010OIi] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x03c7 -> B:146:0x03cb). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:457:0x0937 -> B:448:0x08fa). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Ii0110 ii0110;
                    Object objI000iOII;
                    float fI00i0ilIl0i;
                    float fI00i0ilIl0i2;
                    Oii00o1ll oii00o1ll;
                    O1iIlllIoo o1iIlllIoo;
                    Object objI000iOII2;
                    Object objI0001Ioi1lo;
                    Object objI00000oIO;
                    Object objI000iOII3;
                    Ii1O001loIoO ii1O001loIoO;
                    ArrayList arrayList;
                    Ii0111o ii0111o;
                    boolean z;
                    ArrayList arrayList2;
                    Iterator it;
                    Object value;
                    Ol0loOOoo ol0loOOoo;
                    ArrayList arrayList3;
                    Iterator it2;
                    Object value2;
                    boolean z2;
                    String str;
                    StringBuilder sb;
                    Context context;
                    String[] strArr;
                    int i;
                    String str2;
                    LinkedHashMap linkedHashMap;
                    int i2;
                    InputStream inputStreamOpen;
                    Throwable th;
                    String strI00000oOI;
                    LinkedHashMap linkedHashMap2;
/* 1 */             O1iIlllIoo o1iIlllIoo2 = this;
/* 3 */             int i3 = o1iIlllIoo2.I00iOIl;
/* 5 */             int i4 = 7;
/* 8 */             int i5 = 3;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 12 */            Object obj2 = o1iIlllIoo2.I00iio;
/* 17 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i3) {
                        case 0:
/* 2583 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 2585 */                  int i6 = o1iIlllIoo2.I00iiI;
/* 2587 */                  if (i6 == 0) {
/* 2600 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2613 */                      o1iIlllIoo2.I00iiI = 1;
                                return ((McpToolSet) o1iIlllIoo2.I00iiO)._actionChannel.I00000oOI(o1iIlllIoo2, (I0i1Io) obj2) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 2589 */                  if (i6 == 1) {
/* 2591 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2622 */                      return ooiIlOl1iI;
                            }
/* 2595 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                    return null;
                        case 1:
/* 2543 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2545 */                  int i7 = o1iIlllIoo2.I00iiI;
/* 2547 */                  if (i7 == 0) {
/* 2560 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2571 */                      o1iIlllIoo2.I00iiI = 1;
                                return ((O1iOlOIiO) o1iIlllIoo2.I00iiO).I00000oIO.I000OOo1O((Uri) obj2, o1iIlllIoo2) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                            }
/* 2549 */                  if (i7 == 1) {
/* 2551 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2580 */                      return ooiIlOl1iI;
                            }
/* 2555 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                    return null;
                        case 2:
/* 2489 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 2491 */                  int i8 = o1iIlllIoo2.I00iiI;
/* 2493 */                  if (i8 != 0) {
/* 2496 */                      if (i8 == 1) {
/* 2498 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2540 */                          return ooiIlOl1iI;
                                }
/* 2502 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 2507 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2512 */                  Ol1OlloIO ol1OlloIO = (Ol1OlloIO) o1iIlllIoo2.I00iiO;
/* 2524 */                  String strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i((ArrayList) obj2, "; ", null, null, null, 62);
/* 2528 */                  Ol1OIo0O0O0l ol1OIo0O0O0l = Ol1OIo0O0O0l.I00iOIl;
/* 2531 */                  o1iIlllIoo2.I00iiI = 1;
                            return Ol1OlloIO.I00000oOI(ol1OlloIO, strI00IlilI0i0i, o1iIlllIoo2, 2) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                        case 3:
/* 2423 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 2425 */                  int i9 = o1iIlllIoo2.I00iiI;
/* 2427 */                  if (i9 != 0) {
/* 2429 */                      if (i9 == 1) {
/* 2431 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2487 */                          return ooiIlOl1iI;
                                }
/* 2435 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2438 */                      return null;
                            }
/* 2440 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2445 */                  I10i01 i10i01 = (I10i01) o1iIlllIoo2.I00iiO;
/* 2449 */                  List list = O1oOO0O1l0.I00000oIO;
/* 2457 */                  Float f = new Float(((OIooO1iiliI) obj2).I000II());
/* 2464 */                  OoIoO0I0oOI ooIoO0I0oOII0000O = iOO01lio0.I0000O(150, 6, null);
/* 2469 */                  o1iIlllIoo2.I00iiI = 1;
                            return I10i01.I00000oIO(i10i01, f, ooIoO0I0oOII0000O, null, null, o1iIlllIoo2, 12) == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                        case 4:
/* 2369 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 2371 */                  int i10 = o1iIlllIoo2.I00iiI;
/* 2373 */                  if (i10 == 0) {
/* 2387 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2392 */                      OlO0I1lIii1 olO0I1lIii1 = (OlO0I1lIii1) o1iIlllIoo2.I00iiO;
/* 2398 */                      I0oOII1l i0oOII1l = new I0oOII1l(i4);
/* 2401 */                      i0oOII1l.I00iiI = (OI01Ilio) obj2;
/* 2403 */                      VarHandle.storeStoreFence();
/* 2407 */                      o1iIlllIoo2.I00iiI = 1;
/* 2413 */                      if (olO0I1lIii1.I00000oIO(i0oOII1l, o1iIlllIoo2) == ii0111o6) {
/* 2415 */                          return ii0111o6;
                                }
                            } else {
/* 2376 */                      if (i10 != 1) {
/* 2378 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2381 */                          return null;
                                }
/* 2383 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2417 */                  IOOlIIilOl0.I0000Il00O();
/* 2381 */                  return null;
                        case 5:
/* 2252 */                  OI0Iio01O oI0Iio01O = (OI0Iio01O) obj2;
/* 2254 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 2256 */                  int i11 = o1iIlllIoo2.I00iiI;
                            try {
/* 2258 */                      if (i11 == 0) {
/* 2292 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2297 */                          ii0110 = (Ii0110) o1iIlllIoo2.I00iiO;
                                } else {
/* 2261 */                          if (i11 == 1) {
/* 2283 */                              ii0110 = (Ii0110) o1iIlllIoo2.I00iiO;
/* 2285 */                              lIoii1l01l0i.I00000oOI(obj);
/* 2288 */                              objI000iOII = obj;
/* 2290 */                              Ii0110 ii01102 = ii0110;
/* 2329 */                              fI00i0ilIl0i = oI0Iio01O.I0000Il00O.I00i0ilIl0i(6.0f);
/* 2335 */                              fI00i0ilIl0i2 = oI0Iio01O.I0000Il00O.I00i0ilIl0i(1.0f);
/* 2340 */                              oii00o1ll = oI0Iio01O.I00000oIO;
/* 2342 */                              o1iIlllIoo2.I00iiO = ii01102;
/* 2344 */                              o1iIlllIoo2.I00iiI = 2;
/* 2348 */                              o1iIlllIoo = o1iIlllIoo2;
/* 2355 */                              o1iIlllIoo2 = o1iIlllIoo;
/* 2356 */                              if (oI0Iio01O.I0000O(oii00o1ll, (OI0IOO0iO0Oo) objI000iOII, fI00i0ilIl0i, fI00i0ilIl0i2, o1iIlllIoo) != ii0111o7) {
/* 2360 */                                  ii0110 = ii01102;
                                        }
/* 2358 */                              return ii0111o7;
                                    }
/* 2263 */                          if (i11 != 2) {
/* 2276 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2279 */                              return null;
                                    }
/* 2267 */                          ii0110 = (Ii0110) o1iIlllIoo2.I00iiO;
/* 2269 */                          lIoii1l01l0i.I00000oOI(obj);
                                }
/* 2307 */                      if (!l01oO1iOo.I000II(ii0110.I00000oIO())) {
/* 2363 */                          oI0Iio01O.I000O01llI0 = null;
/* 2365 */                          return ooiIlOl1iI;
                                }
/* 2309 */                      IIIII1OI1 iiiii1oi1 = oI0Iio01O.I000II;
/* 2311 */                      o1iIlllIoo2.I00iiO = ii0110;
/* 2314 */                      o1iIlllIoo2.I00iiI = 1;
/* 2316 */                      objI000iOII = iiiii1oi1.I000iOII(o1iIlllIoo2);
/* 2320 */                      if (objI000iOII != ii0111o7) {
/* 2290 */                          Ii0110 ii011022 = ii0110;
/* 2329 */                          fI00i0ilIl0i = oI0Iio01O.I0000Il00O.I00i0ilIl0i(6.0f);
/* 2335 */                          fI00i0ilIl0i2 = oI0Iio01O.I0000Il00O.I00i0ilIl0i(1.0f);
/* 2340 */                          oii00o1ll = oI0Iio01O.I00000oIO;
/* 2342 */                          o1iIlllIoo2.I00iiO = ii011022;
/* 2344 */                          o1iIlllIoo2.I00iiI = 2;
/* 2348 */                          o1iIlllIoo = o1iIlllIoo2;
/* 2355 */                          o1iIlllIoo2 = o1iIlllIoo;
/* 2356 */                          if (oI0Iio01O.I0000O(oii00o1ll, (OI0IOO0iO0Oo) objI000iOII, fI00i0ilIl0i, fI00i0ilIl0i2, o1iIlllIoo) != ii0111o7) {
                                    }
                                }
/* 2358 */                      return ii0111o7;
                            } catch (Throwable th2) {
/* 2366 */                      oI0Iio01O.I000O01llI0 = null;
/* 2368 */                      throw th2;
                            }
                        case 6:
/* 2197 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 2199 */                  int i12 = o1iIlllIoo2.I00iiI;
/* 2201 */                  if (i12 == 0) {
/* 2214 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2217 */                      o1iIlllIoo2.I00iiI = 1;
/* 2225 */                      if (il0l1o1l.I00000oOI(1000L, o1iIlllIoo2) == ii0111o8) {
/* 2227 */                          return ii0111o8;
                                }
                            } else {
/* 2203 */                      if (i12 != 1) {
/* 2209 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2212 */                          return null;
                                }
/* 2205 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2229 */                  IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 2233 */                  int i13 = i01I01lIOo.I00000oIO;
/* 2235 */                  iIi0oIlI000II.getClass();
/* 2247 */                  ((OOIoO0IIOO0) ((OOIoOo0O) obj2)).I000lI(new IOo0oooliOI0(7));
/* 2250 */                  return ooiIlOl1iI;
                        case 7:
/* 2155 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 2157 */                  int i14 = o1iIlllIoo2.I00iiI;
/* 2160 */                  if (i14 == 0) {
/* 2173 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2186 */                      o1iIlllIoo2.I00iiI = 1;
                                return ((OIIoI1l0) o1iIlllIoo2.I00iiO).I00000oIO.I000II(OI110lo.I00iiI, (IlliIl1l11O) obj2, o1iIlllIoo2) == ii0111o9 ? ii0111o9 : ooiIlOl1iI;
                            }
/* 2162 */                  if (i14 == 1) {
/* 2164 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2195 */                      return ooiIlOl1iI;
                            }
/* 2168 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2171 */                  return null;
                        case 8:
/* 2086 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 2088 */                  ?? r1 = o1iIlllIoo2.I00iiI;
                            try {
/* 2090 */                      if (r1 == 0) {
/* 2114 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2128 */                          OlIl0i olIl0iI0000O = iOi1II01i0.I0000O((Ii0110) o1iIlllIoo2.I00iiO, null, null, new Ii1l1I1l1ii1(2, null, 1), 3);
/* 2134 */                          o1iIlllIoo2.I00iiO = olIl0iI0000O;
/* 2136 */                          o1iIlllIoo2.I00iiI = 1;
/* 2138 */                          objI000iOII2 = ((IO1010) obj2).I000iOII(o1iIlllIoo2);
                                    r1 = olIl0iI0000O;
/* 2142 */                          if (objI000iOII2 == ii0111o10) {
/* 2144 */                              return ii0111o10;
                                    }
                                } else {
/* 2092 */                          if (r1 != 1) {
/* 2109 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2112 */                              return null;
                                    }
/* 2097 */                          O010OIi o010OIi = (O010OIi) o1iIlllIoo2.I00iiO;
/* 2099 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2102 */                          objI000iOII2 = obj;
                                    r1 = o010OIi;
                                }
/* 2146 */                      r1.I000II(null);
/* 2149 */                      return objI000iOII2;
                            } catch (Throwable th3) {
/* 2151 */                      r1.I000II(null);
/* 2154 */                      throw th3;
                            }
                        case 9:
/* 2046 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 2048 */                  int i15 = o1iIlllIoo2.I00iiI;
/* 2050 */                  if (i15 == 0) {
/* 2065 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2074 */                      o1iIlllIoo2.I00iiI = 1;
/* 2076 */                      Object objInvoke = ((IlliIl1l11O) o1iIlllIoo2.I00iiO).invoke((OO01Ol) obj2, o1iIlllIoo2);
                                return objInvoke == ii0111o11 ? ii0111o11 : objInvoke;
                            }
/* 2052 */                  if (i15 == 1) {
/* 2054 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2057 */                      return obj;
                            }
/* 2060 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 2063 */                  return null;
                        case 10:
/* 1999 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 2001 */                  int i16 = o1iIlllIoo2.I00iiI;
/* 2004 */                  if (i16 == 0) {
/* 2020 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2025 */                      TextClassifier textClassifier = (TextClassifier) o1iIlllIoo2.I00iiO;
/* 2027 */                      if (textClassifier != null) {
/* 2031 */                          o1iIlllIoo2.I00iiI = 1;
/* 2033 */                          Object objInvoke2 = ((IlliIl1l11O) obj2).invoke(textClassifier, o1iIlllIoo2);
                                    return objInvoke2 == ii0111o12 ? ii0111o12 : objInvoke2;
                                }
                            } else {
/* 2006 */                      if (i16 == 1) {
/* 2008 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2011 */                          return obj;
                                }
/* 2014 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                            }
/* 2017 */                  return null;
                        case 11:
/* 1940 */                  Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 1942 */                  int i17 = o1iIlllIoo2.I00iiI;
/* 1944 */                  if (i17 != 0) {
/* 1947 */                      if (i17 == 1) {
/* 1949 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1998 */                          return ooiIlOl1iI;
                                }
/* 1953 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1956 */                      return null;
                            }
/* 1958 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1963 */                  Il0li01oOil il0li01oOil = OOOIo1O1I0I.I00000oIO;
/* 1973 */                  ClipData clipDataNewPlainText = ClipData.newPlainText("prompt", (I1111OO10i) ((OlO01l1oOil) obj2).getValue());
/* 1979 */                  IOO0IOIll iOO0IOIll = (IOO0IOIll) o1iIlllIoo2.I00iiO;
/* 1982 */                  o1iIlllIoo2.I00iiI = 1;
/* 1992 */                  ((I0lOi1li1Ii) iOO0IOIll).I00000oIO.I00000oIO().setPrimaryClip(clipDataNewPlainText);
                            return ooiIlOl1iI == ii0111o13 ? ii0111o13 : ooiIlOl1iI;
                        case 12:
/* 1837 */                  OOiIOI10OOIi oOiIOI10OOIi = (OOiIOI10OOIi) obj2;
/* 1841 */                  O00OoO o00OoO = (O00OoO) o1iIlllIoo2.I00iiO;
/* 1843 */                  Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 1845 */                  int i18 = o1iIlllIoo2.I00iiI;
/* 1847 */                  if (i18 == 0) {
/* 1864 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1869 */                      if (o00OoO instanceof O00illI0o000) {
/* 1873 */                          AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OOiIOI10OOIi.I000II;
/* 1876 */                          oOiIOI10OOIi.I0001Ioi1lo((O00illI0o000) o00OoO, null);
/* 1939 */                          return ooiIlOl1iI;
                                }
/* 1882 */                      if (o00OoO instanceof O00iOil) {
/* 1885 */                          O00iOil o00iOil = (O00iOil) o00OoO;
/* 1887 */                          o1iIlllIoo2.I00iiO = o00OoO;
/* 1890 */                          o1iIlllIoo2.I00iiI = 1;
/* 1892 */                          AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = OOiIOI10OOIi.I000II;
/* 1898 */                          if (oOiIOI10OOIi.I0000oI00(o00iOil, o1iIlllIoo2) != ii0111o14) {
/* 1939 */                              return ooiIlOl1iI;
                                    }
                                } else if (o00OoO instanceof O00i1OoOll1I) {
/* 1906 */                          O00i1OoOll1I o00i1OoOll1I = (O00i1OoOll1I) o00OoO;
/* 1908 */                          o1iIlllIoo2.I00iiO = o00OoO;
/* 1910 */                          o1iIlllIoo2.I00iiI = 2;
/* 1912 */                          AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = OOiIOI10OOIi.I000II;
/* 1918 */                          if (oOiIOI10OOIi.I0000O(o00i1OoOll1I, o1iIlllIoo2) != ii0111o14) {
/* 1939 */                              return ooiIlOl1iI;
                                    }
                                } else {
/* 1924 */                          if (o00OoO instanceof O00Ol10IiOoi) {
/* 1928 */                              AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = OOiIOI10OOIi.I000II;
/* 1931 */                              oOiIOI10OOIi.I0001Ioi1lo(null, (O00Ol10IiOoi) o00OoO);
/* 1939 */                              return ooiIlOl1iI;
                                    }
/* 1935 */                          I000II.I00000oIO();
                                }
/* 1920 */                      return ii0111o14;
                            }
/* 1850 */                  if (i18 == 1 || i18 == 2) {
/* 1860 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1939 */                      return ooiIlOl1iI;
                            }
/* 1855 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1858 */                  return null;
                        case 13:
/* 1747 */                  Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 1749 */                  int i19 = o1iIlllIoo2.I00iiI;
/* 1751 */                  if (i19 == 0) {
/* 1764 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1769 */                      IIo0illOoI iIo0illOoI = (IIo0illOoI) o1iIlllIoo2.I00iiO;
/* 1771 */                      OOiOlo1l0I0o oOiOlo1l0I0o = (OOiOlo1l0I0o) obj2;
/* 1773 */                      o1iIlllIoo2.I00iiI = 1;
/* 1777 */                      if (iIo0illOoI instanceof Oi0O01) {
/* 1781 */                          objI0001Ioi1lo = oOiOlo1l0I0o.I000O01llI0((Oi0O01) iIo0illOoI, o1iIlllIoo2);
/* 1785 */                          if (objI0001Ioi1lo != ii0111o15) {
/* 1788 */                              objI0001Ioi1lo = ooiIlOl1iI;
                                    }
                                } else if (iIo0illOoI instanceof Oi01loi1ioi) {
/* 1796 */                          objI0001Ioi1lo = oOiOlo1l0I0o.I0000oI00((Oi01loi1ioi) iIo0illOoI, o1iIlllIoo2);
/* 1800 */                          if (objI0001Ioi1lo != ii0111o15) {
                                    }
                                } else if (iIo0illOoI instanceof Oi01oOIIlo) {
/* 1809 */                          objI0001Ioi1lo = oOiOlo1l0I0o.I000II((Oi01oOIIlo) iIo0illOoI, o1iIlllIoo2);
/* 1813 */                          if (objI0001Ioi1lo != ii0111o15) {
                                    }
                                } else if (iIo0illOoI instanceof Oi01o1o10O01) {
/* 1822 */                          objI0001Ioi1lo = oOiOlo1l0I0o.I0001Ioi1lo((Oi01o1o10O01) iIo0illOoI, o1iIlllIoo2);
/* 1826 */                          if (objI0001Ioi1lo != ii0111o15) {
                                    }
                                } else {
/* 1832 */                          I000II.I00000oIO();
                                }
                                return objI0001Ioi1lo == ii0111o15 ? ii0111o15 : ooiIlOl1iI;
                            }
/* 1753 */                  if (i19 == 1) {
/* 1755 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1836 */                      return ooiIlOl1iI;
                            }
/* 1759 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1762 */                  return null;
                        case 14:
/* 1704 */                  Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 1706 */                  int i20 = o1iIlllIoo2.I00iiI;
/* 1709 */                  if (i20 != 0) {
/* 1711 */                      if (i20 == 1) {
/* 1713 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1745 */                          return ooiIlOl1iI;
                                }
/* 1717 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1720 */                      return null;
                            }
/* 1722 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1725 */                  Objects.toString(obj2);
/* 1734 */                  O1iIlllIoo o1iIlllIoo3 = (O1iIlllIoo) ((iOliil) o1iIlllIoo2.I00iiO).I00iiO;
/* 1736 */                  o1iIlllIoo2.I00iiI = 1;
                            return o1iIlllIoo3.invoke(obj2, o1iIlllIoo2) == ii0111o16 ? ii0111o16 : ooiIlOl1iI;
                        case 15:
/* 1629 */                  Uri uri = (Uri) obj2;
/* 1633 */                  OOl0lll0li0 oOl0lll0li0 = (OOl0lll0li0) o1iIlllIoo2.I00iiO;
/* 1635 */                  Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 1637 */                  int i21 = o1iIlllIoo2.I00iiI;
/* 1639 */                  if (i21 == 0) {
/* 1656 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1665 */                      InputStream inputStreamOpenInputStream = oOl0lll0li0.I00000oIO.getContentResolver().openInputStream(uri);
/* 1669 */                      if (inputStreamOpenInputStream != null) {
/* 1676 */                          O00lOIIO o00lOIIO = new O00lOIIO(oOl0lll0li0, inputStreamOpenInputStream, null, 24);
/* 1680 */                          o1iIlllIoo2.I00iiI = 1;
/* 1685 */                          Object objI00000oOI = lOlo0o.I00000oOI(120000L, o00lOIIO, o1iIlllIoo2);
                                    return objI00000oOI == ii0111o17 ? ii0111o17 : objI00000oOI;
                                }
/* 1699 */                      IoOOl0iOl1io.I000OOo1O("Cannot open stream for URI: ", uri);
                            } else {
/* 1642 */                      if (i21 == 1) {
/* 1644 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1647 */                          return obj;
                                }
/* 1650 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                            }
/* 1653 */                  return null;
                        case 16:
/* 1591 */                  Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 1593 */                  int i22 = o1iIlllIoo2.I00iiI;
/* 1595 */                  if (i22 == 0) {
/* 1608 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1619 */                      o1iIlllIoo2.I00iiI = 1;
                                return ((OOl1OlI0) o1iIlllIoo2.I00iiO).I0000Il00O.I00000oIO((String) obj2, o1iIlllIoo2) == ii0111o18 ? ii0111o18 : ooiIlOl1iI;
                            }
/* 1597 */                  if (i22 == 1) {
/* 1599 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1628 */                      return ooiIlOl1iI;
                            }
/* 1603 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1606 */                  return null;
                        case 17:
/* 1550 */                  Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 1552 */                  int i23 = o1iIlllIoo2.I00iiI;
/* 1555 */                  if (i23 == 0) {
/* 1570 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1579 */                      o1iIlllIoo2.I00iiI = 1;
/* 1581 */                      Object objI00000oIO2 = ((OOllOII) o1iIlllIoo2.I00iiO).I00000oIO((IoiOl011o) obj2, 1, o1iIlllIoo2);
                                return objI00000oIO2 == ii0111o19 ? ii0111o19 : objI00000oIO2;
                            }
/* 1557 */                  if (i23 == 1) {
/* 1559 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1562 */                      return obj;
                            }
/* 1565 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1568 */                  return null;
                        case PoseLandmark.RIGHT_PINKY:
/* 1473 */                  Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 1475 */                  int i24 = o1iIlllIoo2.I00iiI;
                            try {
/* 1477 */                      if (i24 == 0) {
/* 1501 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1506 */                          ListenableFuture listenableFuture = (ListenableFuture) o1iIlllIoo2.I00iiO;
/* 1509 */                          o1iIlllIoo2.I00iiI = 1;
/* 1511 */                          objI00000oIO = l10oIiO1Il.I00000oIO(listenableFuture, o1iIlllIoo2);
/* 1515 */                          if (objI00000oIO == ii0111o20) {
/* 1532 */                              return ii0111o20;
                                    }
                                } else {
/* 1480 */                          if (i24 != 1) {
/* 1482 */                              if (i24 == 2) {
/* 1484 */                                  lIoii1l01l0i.I00000oOI(obj);
/* 1487 */                                  return obj;
                                        }
/* 1490 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1493 */                              return null;
                                    }
/* 1495 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1498 */                          objI00000oIO = obj;
                                }
/* 1518 */                      IInterface iInterface = (IInterface) objI00000oIO;
/* 1522 */                      o1iIlllIoo2.I00iiI = 2;
/* 1524 */                      Serializable serializableI00000oIO = lIo1li.I00000oIO(iInterface, (OOooio11i00) obj2, o1iIlllIoo2);
                                return serializableI00000oIO == ii0111o20 ? ii0111o20 : serializableI00000oIO;
                            } catch (Throwable th4) {
/* 1536 */                      if (!(th4 instanceof CancellationException)) {
/* 1546 */                          IIi0oIl.I000II().I0001Ioi1lo(O10oOoo101iO.I0000oI00, "Unable to bind to service", th4);
                                }
/* 1549 */                      throw th4;
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 1423 */                  Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 1425 */                  int i25 = o1iIlllIoo2.I00iiI;
/* 1428 */                  if (i25 != 0) {
/* 1430 */                      if (i25 == 1) {
/* 1432 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1472 */                          return ooiIlOl1iI;
                                }
/* 1436 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1439 */                      return null;
                            }
/* 1441 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1450 */                  ClipData clipDataNewPlainText2 = ClipData.newPlainText("response", (String) o1iIlllIoo2.I00iiO);
/* 1456 */                  o1iIlllIoo2.I00iiI = 1;
/* 1466 */                  ((I0lOi1li1Ii) ((IOO0IOIll) obj2)).I00000oIO.I00000oIO().setPrimaryClip(clipDataNewPlainText2);
                            return ooiIlOl1iI == ii0111o21 ? ii0111o21 : ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 1373 */                  Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 1375 */                  int i26 = o1iIlllIoo2.I00iiI;
/* 1377 */                  if (i26 == 0) {
/* 1390 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1409 */                      o1iIlllIoo2.I00iiI = 1;
                                return I10i01.I00000oIO(((I0oo10O) o1iIlllIoo2.I00iiO).I00oO101o, new Float(0.0f), (I110IiI0o1Il) obj2, null, null, o1iIlllIoo2, 12) == ii0111o22 ? ii0111o22 : ooiIlOl1iI;
                            }
/* 1379 */                  if (i26 == 1) {
/* 1381 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1422 */                      return ooiIlOl1iI;
                            }
/* 1385 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1388 */                  return null;
                        case PoseLandmark.LEFT_THUMB:
/* 1297 */                  Ii0111o ii0111o23 = Ii0111o.I00iOIl;
/* 1299 */                  int i27 = o1iIlllIoo2.I00iiI;
/* 1301 */                  if (i27 != 0) {
/* 1304 */                      if (i27 == 1) {
/* 1306 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1371 */                          return ooiIlOl1iI;
                                }
/* 1310 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1313 */                      return null;
                            }
/* 1315 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1320 */                  Ii0110 ii01103 = (Ii0110) o1iIlllIoo2.I00iiO;
/* 1324 */                  ArrayList arrayList4 = new ArrayList();
/* 1329 */                  OOo0ooi oOo0ooi = new OOo0ooi();
/* 1334 */                  OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 1337 */                  I0oo10O i0oo10O = (I0oo10O) obj2;
/* 1341 */                  Oiolio oiolio = i0oo10O.I00o0iI0io1.I00000oIO;
/* 1345 */                  Oi1iloI oi1iloI = new Oi1iloI();
/* 1348 */                  oi1iloI.I00iOIl = oOo0l0ii10l;
/* 1350 */                  oi1iloI.I00iiI = i0oo10O;
/* 1352 */                  oi1iloI.I00iiO = arrayList4;
/* 1354 */                  oi1iloI.I00iio = oOo0ooi;
/* 1356 */                  oi1iloI.I00ilI0I1 = ii01103;
/* 1358 */                  VarHandle.storeStoreFence();
/* 1362 */                  o1iIlllIoo2.I00iiI = 1;
/* 1364 */                  oiolio.getClass();
/* 1367 */                  Oiolio.I000lI(oiolio, oi1iloI, o1iIlllIoo2);
/* 1370 */                  return ii0111o23;
                        case PoseLandmark.RIGHT_THUMB:
/* 1234 */                  Ii0111o ii0111o24 = Ii0111o.I00iOIl;
/* 1236 */                  int i28 = o1iIlllIoo2.I00iiI;
/* 1238 */                  if (i28 == 0) {
/* 1254 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1271 */                      if (((Ii0110) o1iIlllIoo2.I00iiO).I00000oIO().I00lli11(OoI0O1.I00iiI) != null) {
/* 1276 */                          o1iIlllIoo2.I00iiI = 1;
/* 1278 */                          Object objInvoke3 = ((Function1) obj2).invoke(o1iIlllIoo2);
                                    return objInvoke3 == ii0111o24 ? ii0111o24 : objInvoke3;
                                }
/* 1292 */                      I000II.I001IO000("Expected a TransactionElement in the CoroutineContext but none was found.");
                            } else {
/* 1240 */                      if (i28 == 1) {
/* 1242 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1245 */                          return obj;
                                }
/* 1248 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                            }
/* 1251 */                  return null;
                        case PoseLandmark.LEFT_HIP:
/* 1181 */                  Ii0111o ii0111o25 = Ii0111o.I00iOIl;
/* 1183 */                  int i29 = o1iIlllIoo2.I00iiI;
/* 1185 */                  if (i29 != 0) {
/* 1187 */                      if (i29 == 1) {
/* 1189 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1232 */                          return ooiIlOl1iI;
                                }
/* 1193 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1196 */                      return null;
                            }
/* 1198 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1203 */                  IilIoiI1Oo01 iilIoiI1Oo01 = (IilIoiI1Oo01) o1iIlllIoo2.I00iiO;
/* 1207 */                  float f2 = iilIoiI1Oo01.I00000oOI ? -1.0f : 1.0f;
/* 1213 */                  Oii00o1ll oii00o1ll2 = ((OiOoIO1) obj2).I010o0o0oO;
/* 1217 */                  long jI000II = OooIOilolOo.I000II(f2, iilIoiI1Oo01.I00000oIO);
/* 1222 */                  o1iIlllIoo2.I00iiI = 1;
                            return oii00o1ll2.I0000Il00O(jI000II, false, o1iIlllIoo2) == ii0111o25 ? ii0111o25 : ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 1129 */                  Ii0111o ii0111o26 = Ii0111o.I00iOIl;
/* 1131 */                  int i30 = o1iIlllIoo2.I00iiI;
/* 1133 */                  if (i30 != 0) {
/* 1135 */                      if (i30 == 1) {
/* 1137 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1179 */                          return ooiIlOl1iI;
                                }
/* 1141 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1144 */                      return null;
                            }
/* 1146 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1153 */                  Oiolio oiolio2 = ((OI0lOIiOIOOo) o1iIlllIoo2.I00iiO).I00000oIO;
/* 1161 */                  I0oOII1l i0oOII1l2 = new I0oOII1l(8);
/* 1164 */                  i0oOII1l2.I00iiI = (OIooi1iOiOol) obj2;
/* 1166 */                  VarHandle.storeStoreFence();
/* 1170 */                  o1iIlllIoo2.I00iiI = 1;
/* 1172 */                  oiolio2.getClass();
/* 1175 */                  Oiolio.I000lI(oiolio2, i0oOII1l2, o1iIlllIoo2);
/* 1178 */                  return ii0111o26;
                        case PoseLandmark.LEFT_KNEE:
/* 1087 */                  Ii0111o ii0111o27 = Ii0111o.I00iOIl;
/* 1089 */                  int i31 = o1iIlllIoo2.I00iiI;
/* 1091 */                  if (i31 != 0) {
/* 1093 */                      if (i31 == 1) {
/* 1095 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1127 */                          return ooiIlOl1iI;
                                }
/* 1099 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1102 */                      return null;
                            }
/* 1104 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1109 */                  IOO0IOIll iOO0IOIll2 = (IOO0IOIll) o1iIlllIoo2.I00iiO;
/* 1113 */                  IOO01ol iOO01olI00000oIO = ii0ioiio.I00000oIO((I1111OO10i) obj2);
/* 1117 */                  o1iIlllIoo2.I00iiI = 1;
/* 1121 */                  ((I0lOi1li1Ii) iOO0IOIll2).I00000oIO(iOO01olI00000oIO);
                            return ooiIlOl1iI == ii0111o27 ? ii0111o27 : ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 1045 */                  Ii0111o ii0111o28 = Ii0111o.I00iOIl;
/* 1047 */                  int i32 = o1iIlllIoo2.I00iiI;
/* 1050 */                  if (i32 != 0) {
/* 1052 */                      if (i32 == 1) {
/* 1054 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1085 */                          return ooiIlOl1iI;
                                }
/* 1058 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1061 */                      return null;
                            }
/* 1063 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1068 */                  III0Ii iII0Ii = (III0Ii) o1iIlllIoo2.I00iiO;
/* 1074 */                  OOo0IO oOo0IO = (OOo0IO) ((OOo0ooi) obj2).I00iOIl;
/* 1076 */                  o1iIlllIoo2.I00iiI = 1;
                            return iII0Ii.I00000oIO(oOo0IO, o1iIlllIoo2) == ii0111o28 ? ii0111o28 : ooiIlOl1iI;
                        case 27:
/* 994 */                   Ii0111o ii0111o29 = Ii0111o.I00iOIl;
/* 996 */                   int i33 = o1iIlllIoo2.I00iiI;
/* 998 */                   if (i33 == 0) {
/* 1012 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1031 */                      o1iIlllIoo2.I00iiI = 1;
                                return I10i01.I00000oIO(((OiolI10I1oOO) o1iIlllIoo2.I00iiO).I0001Ioi1lo, OIOlIiiioi.I00000oIO(0L), (OlIOiI1iI1) obj2, null, null, o1iIlllIoo2, 12) == ii0111o29 ? ii0111o29 : ooiIlOl1iI;
                            }
/* 1001 */                  if (i33 == 1) {
/* 1003 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1044 */                      return ooiIlOl1iI;
                            }
/* 1007 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1010 */                  return null;
                        case PoseLandmark.RIGHT_ANKLE:
/* 879 */                   iOliil ioliil = (iOliil) obj2;
/* 881 */                   Ii0111o ii0111o30 = Ii0111o.I00iOIl;
/* 883 */                   int i34 = o1iIlllIoo2.I00iiI;
/* 885 */                   if (i34 == 0) {
/* 912 */                       lIoii1l01l0i.I00000oOI(obj);
/* 927 */                       if (((AtomicInteger) ((Oi1ol0llI) ioliil.I00ilI0I1).I00iiI).get() <= 0) {
/* 989 */                           I000II.I001IO000("Check failed.");
                                }
/* 937 */                       l01oO1iOo.I0000O(((Ii0110) ioliil.I00iiI).I00000oIO());
/* 942 */                       ii1O001loIoO = (Ii1O001loIoO) ioliil.I00iiO;
/* 946 */                       IIIII1OI1 iiiii1oi12 = (IIIII1OI1) ioliil.I00iio;
/* 948 */                       o1iIlllIoo2.I00iiO = ii1O001loIoO;
/* 951 */                       o1iIlllIoo2.I00iiI = 1;
/* 953 */                       objI000iOII3 = iiiii1oi12.I000iOII(o1iIlllIoo2);
/* 957 */                       if (objI000iOII3 != ii0111o30) {
                                }
/* 970 */                       return ii0111o30;
                            }
/* 888 */                   if (i34 == 1) {
/* 903 */                       ii1O001loIoO = (Ii1O001loIoO) o1iIlllIoo2.I00iiO;
/* 905 */                       lIoii1l01l0i.I00000oOI(obj);
/* 908 */                       objI000iOII3 = obj;
/* 960 */                       o1iIlllIoo2.I00iiO = null;
/* 962 */                       o1iIlllIoo2.I00iiI = 2;
                            } else {
/* 890 */                       if (i34 == 2) {
/* 892 */                           lIoii1l01l0i.I00000oOI(obj);
/* 984 */                           if (((AtomicInteger) ((Oi1ol0llI) ioliil.I00ilI0I1).I00iiI).decrementAndGet() == 0) {
/* 993 */                               return ooiIlOl1iI;
                                    }
/* 937 */                           l01oO1iOo.I0000O(((Ii0110) ioliil.I00iiI).I00000oIO());
/* 942 */                           ii1O001loIoO = (Ii1O001loIoO) ioliil.I00iiO;
/* 946 */                           IIIII1OI1 iiiii1oi122 = (IIIII1OI1) ioliil.I00iio;
/* 948 */                           o1iIlllIoo2.I00iiO = ii1O001loIoO;
/* 951 */                           o1iIlllIoo2.I00iiI = 1;
/* 953 */                           objI000iOII3 = iiiii1oi122.I000iOII(o1iIlllIoo2);
/* 957 */                           if (objI000iOII3 != ii0111o30) {
/* 960 */                               o1iIlllIoo2.I00iiO = null;
/* 962 */                               o1iIlllIoo2.I00iiI = 2;
                                        break;
                                    }
/* 970 */                           return ii0111o30;
                                }
/* 896 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                            }
/* 899 */                   return null;
                        default:
/* 26 */                    Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) o1iIlllIoo2.I00iiO;
/* 28 */                    OlO0OIIl1 olO0OIIl1 = ol0o1OiOIIIl.I0000O;
/* 30 */                    Context context2 = ol0o1OiOIIIl.I0000Il00O;
/* 32 */                    Ii1liIllli0 ii1liIllli0 = ol0o1OiOIIIl.I00000oOI;
/* 34 */                    Ii0111o ii0111o31 = Ii0111o.I00iOIl;
/* 36 */                    int i35 = o1iIlllIoo2.I00iiI;
/* 38 */                    if (i35 != 0) {
/* 40 */                        if (i35 == 1) {
/* 42 */                            lIoii1l01l0i.I00000oOI(obj);
/* 875 */                           return ooiIlOl1iI;
                                }
/* 47 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 17 */                        return null;
                            }
/* 53 */                    lIoii1l01l0i.I00000oOI(obj);
/* 56 */                    ii1liIllli0.getClass();
/* 70 */                    List list2 = (List) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, iOoil1iiIilo, i5));
/* 76 */                    ArrayList arrayList5 = new ArrayList();
/* 87 */                    for (Object obj3 : list2) {
/* 100 */                       if (((Ol0ioI1iI) obj3).I0010I0i()) {
/* 102 */                           arrayList5.add(obj3);
                                }
                            }
/* 108 */                   ArrayList arrayList6 = new ArrayList();
/* 119 */                   for (Object obj4 : list2) {
/* 132 */                       if (!((Ol0ioI1iI) obj4).I0010I0i()) {
/* 134 */                           arrayList6.add(obj4);
                                }
                            }
/* 155 */                   IOOi0Ool1i.I00IlilI0i0i(arrayList5, "\n", null, null, new OiioI1Io0o(10), 30);
/* 177 */                   IOOi0Ool1i.I00IlilI0i0i(arrayList6, "\n", null, null, new OiioI1Io0o(11), 30);
/* 184 */                   int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(arrayList5, 10));
/* 190 */                   if (iI00000oIO < 16) {
/* 192 */                       iI00000oIO = 16;
                            }
/* 195 */                   LinkedHashMap linkedHashMap3 = new LinkedHashMap(iI00000oIO);
/* 198 */                   Iterator it3 = arrayList5.iterator();
/* 206 */                   while (it3.hasNext()) {
/* 212 */                       Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) it3.next();
/* 226 */                       linkedHashMap3.put(ol0ioI1iI.I001i1O0Ol(), Boolean.valueOf(ol0ioI1iI.I001l0I00()));
                            }
/* 232 */                   linkedHashMap3.toString();
/* 237 */                   ArrayList arrayList7 = new ArrayList();
/* 240 */                   int i36 = 0;
                            try {
/* 247 */                       String[] list3 = context2.getAssets().list("skills");
/* 251 */                       if (list3 == null) {
/* 253 */                           list3 = new String[0];
                                }
/* 255 */                       String[] strArr2 = list3;
/* 265 */                       int length = strArr2.length;
/* 266 */                       while (i36 < length) {
/* 268 */                           int i37 = i36;
                                    try {
/* 270 */                               str = strArr2[i37];
/* 274 */                               sb = new StringBuilder();
/* 277 */                               arrayList = arrayList6;
                                    } catch (Exception e) {
/* 632 */                               e = e;
/* 633 */                               arrayList = arrayList6;
                                    }
                                    try {
/* 281 */                               sb.append("skills/");
/* 284 */                               sb.append(str);
/* 289 */                               sb.append("/SKILL.md");
                                        try {
/* 300 */                                   inputStreamOpen = context2.getAssets().open(sb.toString());
                                            try {
/* 306 */                                       context = context2;
                                                try {
/* 313 */                                           strArr = strArr2;
                                                    try {
/* 319 */                                               BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, IO1IOI.I00000oIO), 8192);
/* 322 */                                               ii0111o = ii0111o31;
                                                        try {
/* 323 */                                                   strI00000oOI = lOliOoIi.I00000oOI(bufferedReader);
                                                            try {
/* 327 */                                                       bufferedReader.close();
/* 356 */                                                       z = false;
/* 358 */                                                       linkedHashMap2 = linkedHashMap3;
/* 360 */                                                       i = length;
/* 362 */                                                       str2 = str;
/* 364 */                                                       i2 = i37;
                                                            } catch (Throwable th5) {
/* 518 */                                                       th = th5;
/* 519 */                                                       i = length;
/* 521 */                                                       str2 = str;
/* 522 */                                                       linkedHashMap2 = linkedHashMap3;
/* 523 */                                                       i2 = i37;
/* 525 */                                                       z = false;
                                                            }
                                                        } catch (Throwable th6) {
/* 529 */                                                   i = length;
/* 531 */                                                   str2 = str;
/* 532 */                                                   linkedHashMap = linkedHashMap3;
/* 533 */                                                   i2 = i37;
/* 535 */                                                   z = false;
                                                            try {
/* 538 */                                                       throw th6;
                                                                break;
                                                            } catch (Throwable th7) {
                                                                try {
/* 540 */                                                           ii1OOii.I00000oIO(bufferedReader, th6);
/* 543 */                                                           throw th7;
                                                                    break;
                                                                } catch (Throwable th8) {
/* 544 */                                                           th = th8;
/* 442 */                                                           th = th;
                                                                    try {
/* 565 */                                                               throw th;
                                                                        break;
                                                                    } catch (Throwable th9) {
                                                                        try {
/* 567 */                                                                   ii1OOii.I00000oIO(inputStreamOpen, th);
/* 570 */                                                                   throw th9;
                                                                            break;
                                                                        } catch (Exception e2) {
/* 571 */                                                                   e = e2;
                                                                            try {
/* 608 */                                                                       iOi100.I00000oIO(Log.w("AGSkillManagerVM", "SKILL.md not found or error reading for asset skill " + str2, e));
/* 611 */                                                                       i36 = i2 + 1;
/* 613 */                                                                       linkedHashMap3 = linkedHashMap;
/* 614 */                                                                       strArr2 = strArr;
/* 616 */                                                                       length = i;
/* 618 */                                                                       arrayList6 = arrayList;
/* 620 */                                                                       ii0111o31 = ii0111o;
/* 621 */                                                                       context2 = context;
                                                                            } catch (Exception e3) {
/* 625 */                                                                       e = e3;
/* 644 */                                                                       Log.e("AGSkillManagerVM", "Error listing assets/skills", e);
/* 666 */                                                                       IOOi0Ool1i.I00IlilI0i0i(arrayList7, "\n", null, null, new OiioI1Io0o(12), 30);
/* 673 */                                                                       arrayList2 = new ArrayList(arrayList7);
/* 676 */                                                                       it = arrayList.iterator();
/* 684 */                                                                       while (it.hasNext()) {
                                                                                }
/* 734 */                                                                       ii1liIllli0.getClass();
/* 744 */                                                                       iOi1IOoIO0l.I00000oOI(new Ii1lOii(ii1liIllli0, arrayList2, null, 1));
/* 813 */                                                                       do {
/* 747 */                                                                           value = olO0OIIl1.getValue();
/* 752 */                                                                           ol0loOOoo = (Ol0loOOoo) value;
/* 762 */                                                                           arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 765 */                                                                           it2 = arrayList2.iterator();
/* 773 */                                                                           while (it2.hasNext()) {
                                                                                    }
/* 813 */                                                                       } while (!olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO(ol0loOOoo, false, arrayList3, false, null, null, false, null, null, 253)));
                                                                                while (true) {
/* 815 */                                                                           value2 = olO0OIIl1.getValue();
/* 837 */                                                                           z2 = z;
/* 849 */                                                                           if (olO0OIIl1.I000iOII(value2, Ol0loOOoo.I00000oIO((Ol0loOOoo) value2, z2, null, false, null, null, false, null, null, 254))) {
                                                                                    }
/* 876 */                                                                           z = z2;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th10) {
/* 546 */                                               th = th10;
/* 547 */                                               i = length;
/* 549 */                                               ii0111o = ii0111o31;
/* 550 */                                               str2 = str;
/* 551 */                                               linkedHashMap = linkedHashMap3;
/* 552 */                                               i2 = i37;
/* 554 */                                               z = false;
/* 442 */                                               th = th;
/* 565 */                                               throw th;
                                                    }
                                                } catch (Throwable th11) {
/* 557 */                                           th = th11;
/* 558 */                                           strArr = strArr2;
/* 547 */                                           i = length;
/* 549 */                                           ii0111o = ii0111o31;
/* 550 */                                           str2 = str;
/* 551 */                                           linkedHashMap = linkedHashMap3;
/* 552 */                                           i2 = i37;
/* 554 */                                           z = false;
/* 442 */                                           th = th;
/* 565 */                                           throw th;
                                                }
                                            } catch (Throwable th12) {
/* 561 */                                       th = th12;
/* 562 */                                       context = context2;
                                            }
                                        } catch (Exception e4) {
/* 573 */                                   e = e4;
/* 574 */                                   context = context2;
/* 576 */                                   strArr = strArr2;
/* 578 */                                   i = length;
/* 580 */                                   ii0111o = ii0111o31;
/* 581 */                                   str2 = str;
/* 582 */                                   linkedHashMap = linkedHashMap3;
/* 583 */                                   i2 = i37;
/* 585 */                                   z = false;
                                        }
                                        try {
/* 368 */                                   OIoi0IIoi oIoi0IIoiI0001Ioi1lo = Ol0o1OiOIIIl.I0001Ioi1lo(ol0o1OiOIIIl, strI00000oOI, true, null, "assets/skills/" + str, 8);
/* 374 */                                   Ol0ioI1iI ol0ioI1iI2 = (Ol0ioI1iI) oIoi0IIoiI0001Ioi1lo.I00iOIl;
/* 378 */                                   List list4 = (List) oIoi0IIoiI0001Ioi1lo.I00iiI;
/* 387 */                                   if (!list4.isEmpty()) {
/* 436 */                                       iOi100.I00000oIO(Log.w("AGSkillManagerVM", "Error parsing asset skill " + str2 + ": " + IOOi0Ool1i.I00IlilI0i0i(list4, ", ", null, null, null, 62)));
                                            } else if (ol0ioI1iI2 != null) {
/* 455 */                                       Boolean bool = (Boolean) linkedHashMap2.get(ol0ioI1iI2.I001i1O0Ol());
/* 464 */                                       boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
/* 469 */                                       Ol0ilO ol0ilO = (Ol0ilO) ol0ioI1iI2.I00100o1O0lo();
/* 471 */                                       ol0ilO.I000II(zBooleanValue);
/* 478 */                                       arrayList7.add(ol0ilO.I00000oOI());
/* 506 */                                       iOi100.I00000oIO(Log.d("AGSkillManagerVM", "Added built-in skill: " + ol0ioI1iI2.I001i1O0Ol()));
                                            }
                                            try {
/* 509 */                                       inputStreamOpen.close();
/* 512 */                                       linkedHashMap = linkedHashMap2;
                                            } catch (Exception e5) {
/* 515 */                                       e = e5;
/* 516 */                                       linkedHashMap = linkedHashMap2;
/* 608 */                                       iOi100.I00000oIO(Log.w("AGSkillManagerVM", "SKILL.md not found or error reading for asset skill " + str2, e));
/* 611 */                                       i36 = i2 + 1;
/* 613 */                                       linkedHashMap3 = linkedHashMap;
/* 614 */                                       strArr2 = strArr;
/* 616 */                                       length = i;
/* 618 */                                       arrayList6 = arrayList;
/* 620 */                                       ii0111o31 = ii0111o;
/* 621 */                                       context2 = context;
                                            }
/* 611 */                                   i36 = i2 + 1;
/* 613 */                                   linkedHashMap3 = linkedHashMap;
/* 614 */                                   strArr2 = strArr;
/* 616 */                                   length = i;
/* 618 */                                   arrayList6 = arrayList;
/* 620 */                                   ii0111o31 = ii0111o;
/* 621 */                                   context2 = context;
                                        } catch (Throwable th13) {
/* 440 */                                   th = th13;
/* 441 */                                   linkedHashMap = linkedHashMap2;
/* 442 */                                   th = th;
/* 565 */                                   throw th;
                                        }
                                    } catch (Exception e6) {
/* 627 */                               e = e6;
/* 628 */                               ii0111o = ii0111o31;
/* 629 */                               z = false;
/* 644 */                               Log.e("AGSkillManagerVM", "Error listing assets/skills", e);
/* 666 */                               IOOi0Ool1i.I00IlilI0i0i(arrayList7, "\n", null, null, new OiioI1Io0o(12), 30);
/* 673 */                               arrayList2 = new ArrayList(arrayList7);
/* 676 */                               it = arrayList.iterator();
/* 684 */                               while (it.hasNext()) {
                                        }
/* 734 */                               ii1liIllli0.getClass();
/* 744 */                               iOi1IOoIO0l.I00000oOI(new Ii1lOii(ii1liIllli0, arrayList2, null, 1));
/* 813 */                               do {
/* 747 */                                   value = olO0OIIl1.getValue();
/* 752 */                                   ol0loOOoo = (Ol0loOOoo) value;
/* 762 */                                   arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 765 */                                   it2 = arrayList2.iterator();
/* 773 */                                   while (it2.hasNext()) {
                                            }
/* 813 */                               } while (!olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO(ol0loOOoo, false, arrayList3, false, null, null, false, null, null, 253)));
                                        while (true) {
/* 815 */                                   value2 = olO0OIIl1.getValue();
/* 837 */                                   z2 = z;
/* 849 */                                   if (olO0OIIl1.I000iOII(value2, Ol0loOOoo.I00000oIO((Ol0loOOoo) value2, z2, null, false, null, null, false, null, null, 254))) {
                                            }
/* 876 */                                   z = z2;
                                        }
                                    }
                                }
/* 636 */                       arrayList = arrayList6;
/* 638 */                       ii0111o = ii0111o31;
/* 639 */                       z = false;
                            } catch (Exception e7) {
/* 257 */                       e = e7;
/* 258 */                       arrayList = arrayList6;
/* 260 */                       ii0111o = ii0111o31;
/* 261 */                       z = false;
                            }
/* 666 */                   IOOi0Ool1i.I00IlilI0i0i(arrayList7, "\n", null, null, new OiioI1Io0o(12), 30);
/* 673 */                   arrayList2 = new ArrayList(arrayList7);
/* 676 */                   it = arrayList.iterator();
/* 684 */                   while (it.hasNext()) {
/* 690 */                       Ol0ioI1iI ol0ioI1iI3 = (Ol0ioI1iI) it.next();
/* 696 */                       if (!arrayList2.isEmpty()) {
/* 699 */                           Iterator it4 = arrayList2.iterator();
/* 707 */                           while (it4.hasNext()) {
/* 727 */                               if (O0000Ioio00.I0000O(((Ol0ioI1iI) it4.next()).I001i1O0Ol(), ol0ioI1iI3.I001i1O0Ol())) {
                                            break;
                                        }
                                    }
                                }
/* 730 */                       arrayList2.add(ol0ioI1iI3);
                            }
/* 734 */                   ii1liIllli0.getClass();
/* 744 */                   iOi1IOoIO0l.I00000oOI(new Ii1lOii(ii1liIllli0, arrayList2, null, 1));
/* 813 */                   do {
/* 747 */                       value = olO0OIIl1.getValue();
/* 752 */                       ol0loOOoo = (Ol0loOOoo) value;
/* 762 */                       arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 765 */                       it2 = arrayList2.iterator();
/* 773 */                       while (it2.hasNext()) {
/* 786 */                           arrayList3.add(new Ol0oI1llIloI((Ol0ioI1iI) it2.next()));
                                }
/* 813 */                   } while (!olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO(ol0loOOoo, false, arrayList3, false, null, null, false, null, null, 253)));
                            while (true) {
/* 815 */                       value2 = olO0OIIl1.getValue();
/* 837 */                       z2 = z;
/* 849 */                       if (olO0OIIl1.I000iOII(value2, Ol0loOOoo.I00000oIO((Ol0loOOoo) value2, z2, null, false, null, null, false, null, null, 254))) {
/* 852 */                           ol0o1OiOIIIl.I0001Ioi1lo = true;
/* 854 */                           IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 863 */                           I1iOI0oo i1iOI0oo = new I1iOI0oo((I0IoOl) obj2, (IOoil1iiIilo) null, 20);
/* 866 */                           o1iIlllIoo2.I00iiI = 1;
                                    return iOi1II01i0.I0000oI00(iiI0oillOO10, i1iOI0oo, o1iIlllIoo2) == ii0111o ? ii0111o : ooiIlOl1iI;
                                }
/* 876 */                       z = z2;
                            }
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public O1iIlllIoo(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 12 */            this.I00iOIl = i;
                    this.I00iio = obj;
                }
            }
