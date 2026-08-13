            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.ConversationDao;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.imagedescription.ImageDescriber;
            import com.google.mlkit.genai.proofreading.Proofreader;
            import com.google.mlkit.genai.rewriting.Rewriter;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.genai.summarization.Summarizer;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import kotlin.jvm.functions.Function1;
            
/* 14 */    public final class Ii1O001loIoO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1O001loIoO(IiIi1o iiIi1o, IOoil1iiIilo iOoil1iiIilo, List list) {
/* 12 */            super(2, iOoil1iiIilo);
/* 3 */             this.I00iOIl = 8;
/* 5 */             Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 7 */             this.I00iiO = iiIi1o;
/* 9 */             this.I00iio = list;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 468 */                   return new Ii1O001loIoO((Ii1OIIlOi) this.I00iiO, (O1l0oolOoioi) this.I00iio, iOoil1iiIilo, 0);
                        case 1:
/* 453 */                   return new Ii1O001loIoO((IlliIl1l11O) this.I00iiO, (Ii11I1iOiIo) this.I00iio, iOoil1iiIilo, 1);
                        case 2:
/* 436 */                   Ii1O001loIoO ii1O001loIoO = new Ii1O001loIoO((Ii1OIIlOi) this.I00iiO, iOoil1iiIilo);
/* 439 */                   ii1O001loIoO.I00iio = obj;
/* 441 */                   return ii1O001loIoO;
                        case 3:
/* 424 */                   Ii1O001loIoO ii1O001loIoO2 = new Ii1O001loIoO((Ii1l01l) this.I00iio, iOoil1iiIilo);
/* 427 */                   ii1O001loIoO2.I00iiO = obj;
/* 429 */                   return ii1O001loIoO2;
                        case 4:
/* 414 */                   return new Ii1O001loIoO((Ii1liIllli0) this.I00iiO, (II00OOlli) this.I00iio, iOoil1iiIilo, 4);
                        case 5:
/* 399 */                   return new Ii1O001loIoO((Ii1liIllli0) this.I00iiO, (Ol0ioI1iI) this.I00iio, iOoil1iiIilo, 5);
                        case 6:
/* 384 */                   return new Ii1O001loIoO((Ii1liIllli0) this.I00iiO, (List) this.I00iio, iOoil1iiIilo, 6);
                        case 7:
/* 369 */                   return new Ii1O001loIoO((Ii1liIllli0) this.I00iiO, (Oo0oOoIo0ol) this.I00iio, iOoil1iiIilo, 7);
                        case 8:
/* 346 */                   IiIi1o iiIi1o = (IiIi1o) this.I00iiO;
/* 350 */                   List list = (List) this.I00iio;
/* 352 */                   Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 354 */                   return new Ii1O001loIoO(iiIi1o, iOoil1iiIilo, list);
                        case 9:
/* 338 */                   return new Ii1O001loIoO((I10i01) this.I00iiO, (OOo0lO) this.I00iio, iOoil1iiIilo, 9);
                        case 10:
/* 322 */                   return new Ii1O001loIoO((IlI00iOi1) this.I00iiO, (O1oiilO) this.I00iio, iOoil1iiIilo, 10);
                        case 11:
/* 306 */                   return new Ii1O001loIoO((IOO000ilo) this.I00iiO, (IIlioOI) this.I00iio, iOoil1iiIilo, 11);
                        case 12:
/* 290 */                   return new Ii1O001loIoO((IlOi1ilII) this.I00iiO, (IlOOolOo) this.I00iio, iOoil1iiIilo, 12);
                        case 13:
/* 274 */                   return new Ii1O001loIoO((IlOi1ilII) this.I00iiO, (IooiIloo0i) this.I00iio, iOoil1iiIilo, 13);
                        case 14:
/* 258 */                   return new Ii1O001loIoO((BoxChatDatabase) this.I00iiO, (Conversation) this.I00iio, iOoil1iiIilo, 14);
                        case 15:
/* 242 */                   return new Ii1O001loIoO((ImageDescriber) this.I00iiO, (OI10i0Il) this.I00iio, iOoil1iiIilo, 15);
                        case 16:
/* 226 */                   return new Ii1O001loIoO((Proofreader) this.I00iiO, (OI10i0Il) this.I00iio, iOoil1iiIilo, 16);
                        case 17:
/* 210 */                   return new Ii1O001loIoO((Rewriter) this.I00iiO, (OI10i0Il) this.I00iio, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 194 */                   return new Ii1O001loIoO((SpeechRecognizer) this.I00iiO, (OI10i0Il) this.I00iio, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 178 */                   return new Ii1O001loIoO((Summarizer) this.I00iiO, (OI10i0Il) this.I00iio, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 162 */                   return new Ii1O001loIoO((iOI1I00I10) this.I00iiO, (OI10i0Il) this.I00iio, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 146 */                   return new Ii1O001loIoO((OI10i0Il) this.I00iiO, (OI10i0Il) this.I00iio, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 130 */                   return new Ii1O001loIoO((Context) this.I00iiO, (O1OIi1) this.I00iio, iOoil1iiIilo, 22);
                        case PoseLandmark.LEFT_HIP:
/* 114 */                   return new Ii1O001loIoO((IoIll0l) this.I00iiO, (IOiOol0) this.I00iio, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 98 */                    return new Ii1O001loIoO((O00lOo) this.I00iiO, (Function1) this.I00iio, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 82 */                    return new Ii1O001loIoO((O00lOo) this.I00iiO, (Long) this.I00iio, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 66 */                    return new Ii1O001loIoO((OO1io0l0) this.I00iiO, (OIoIoIO0oI1O) this.I00iio, iOoil1iiIilo, 26);
                        case 27:
/* 50 */                    return new Ii1O001loIoO((O0oIIIiiO1) this.I00iiO, (I0iOI0o1i) this.I00iio, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 34 */                    return new Ii1O001loIoO((O1i1O1I) this.I00iiO, (ArrayList) this.I00iio, iOoil1iiIilo, 28);
                        default:
/* 18 */                    return new Ii1O001loIoO((O1i1O1I) this.I00iiO, (String) this.I00iio, iOoil1iiIilo, 29);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 27:
/* 48 */                    ((Ii1O001loIoO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 18 */            return ((Ii1O001loIoO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:164:0x0333, code lost:
                
                    if (r0 != r3) goto L166;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:192:0x03aa, code lost:
                
                    if (p000.Iloo0ilo.I00IlilI0i0i(r2, r0, r18) == r3) goto L193;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:225:0x0431, code lost:
                
                    if (r0 != r3) goto L227;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:262:0x04c6, code lost:
                
                    if (r0 != r3) goto L264;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:299:0x055b, code lost:
                
                    if (r0 != r3) goto L301;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:463:0x08a7, code lost:
                
                    if (p000.l01oO1iOo.I000II(r2) != false) goto L464;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:490:0x08f9, code lost:
                
                    if (r3.emit(r7, r18) == r6) goto L499;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:498:0x0913, code lost:
                
                    if (r0 != r6) goto L500;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:535:0x09bd, code lost:
                
                    if (r0 == r2) goto L558;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:557:0x0a02, code lost:
                
                    if (r0 == r2) goto L558;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:583:0x0917, code lost:
                
                    if (r7 != r6) goto L500;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:663:?, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:163:0x0329 A[Catch: Exception -> 0x033a, TRY_ENTER, TryCatch #5 {Exception -> 0x033a, blocks: (B:140:0x02c9, B:166:0x0337, B:163:0x0329), top: B:571:0x02c9 }] */
                /* JADX WARN: Removed duplicated region for block: B:224:0x0427 A[Catch: Exception -> 0x0438, TRY_ENTER, TryCatch #7 {Exception -> 0x0438, blocks: (B:201:0x03c7, B:227:0x0435, B:224:0x0427), top: B:575:0x03c7 }] */
                /* JADX WARN: Removed duplicated region for block: B:261:0x04bc A[Catch: Exception -> 0x04cd, TRY_ENTER, TryCatch #2 {Exception -> 0x04cd, blocks: (B:238:0x045c, B:264:0x04ca, B:261:0x04bc), top: B:566:0x045c }] */
                /* JADX WARN: Removed duplicated region for block: B:298:0x0551 A[Catch: Exception -> 0x0562, TRY_ENTER, TryCatch #9 {Exception -> 0x0562, blocks: (B:275:0x04f1, B:301:0x055f, B:298:0x0551), top: B:579:0x04f1 }] */
                /* JADX WARN: Removed duplicated region for block: B:466:0x08af  */
                /* JADX WARN: Removed duplicated region for block: B:472:0x08c1  */
                /* JADX WARN: Removed duplicated region for block: B:492:0x08fc  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x0333 -> B:166:0x0337). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x0431 -> B:227:0x0435). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:262:0x04c6 -> B:264:0x04ca). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:299:0x055b -> B:301:0x055f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:488:0x08ea -> B:464:0x08a9). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object objI00000oOI;
                    Object objI0001Ioi1lo;
                    OillO0lO1O oillO0lO1O;
                    IIil1o0olooo iIil1o0olooo;
                    Object objI00000oIO;
                    Integer num;
                    Object objI00000oIO2;
                    Object objI00000oIO3;
                    Integer num2;
                    Object objI00000oIO4;
                    Object objI00000oIO5;
                    Integer num3;
                    Object objI00000oIO6;
                    Object objI00000oIO7;
                    Object objCheckStatus;
                    Integer num4;
                    Object objI00000oIO8;
                    Object objI00000oIO9;
                    Object objI00000oIO10;
                    Object value;
                    O1i1IIoO1IIl o1i1IIoO1IIl;
                    ArrayList arrayList;
/* 11 */            int i = 2;
/* 12 */            int iIntValue = 0;
/* 13 */            int i2 = 1;
/* 14 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 2424 */                  O1l0oolOoioi o1l0oolOoioi = (O1l0oolOoioi) this.I00iio;
/* 2428 */                  Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) this.I00iiO;
/* 2430 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 2432 */                  int i3 = this.I00iiI;
/* 2434 */                  if (i3 != 0) {
/* 2437 */                      if (i3 != 1) {
/* 2439 */                          if (i3 == 2) {
/* 2457 */                              lIoii1l01l0i.I00000oOI(obj);
                                    } else if (i3 != 3) {
/* 2452 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
                                }
/* 2443 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2446 */                      return obj;
                            }
/* 2461 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2466 */                  OlO00iO01io olO00iO01ioI00000oOI = ii1OIIlOi.I000O01llI0.I00000oOI();
/* 2472 */                  if (olO00iO01ioI00000oOI instanceof Ii11I1iOiIo) {
/* 2474 */                      IlliIl1l11O illiIl1l11O = o1l0oolOoioi.I00000oIO;
/* 2476 */                      Ii00l101O ii00l101O = o1l0oolOoioi.I0000O;
/* 2479 */                      this.I00iiI = 1;
/* 2490 */                      objI00000oOI = ii1OIIlOi.I0000Il00O().I00000oOI(new Ii1O1I(ii1OIIlOi, ii00l101O, illiIl1l11O, (IOoil1iiIilo) null), this);
                                break;
                            } else {
/* 2501 */                      if (!(olO00iO01ioI00000oOI instanceof OOlIilOIlOi1) && !(olO00iO01ioI00000oOI instanceof Ooi1ol)) {
/* 2510 */                          if (olO00iO01ioI00000oOI instanceof IlIo0ol0) {
/* 2530 */                              throw ((IlIo0ol0) olO00iO01ioI00000oOI).I00000oOI;
                                    }
/* 2514 */                          if (olO00iO01ioI00000oOI instanceof OIIl11) {
/* 2518 */                              I000II.I001IO000("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
/* 14 */                                return null;
                                    }
/* 2522 */                          I000II.I00000oIO();
/* 14 */                            return null;
                                }
/* 2533 */                      if (olO00iO01ioI00000oOI != o1l0oolOoioi.I0000Il00O) {
/* 2571 */                          throw ((OOlIilOIlOi1) olO00iO01ioI00000oOI).I00000oOI;
                                }
/* 2535 */                      this.I00iiI = 2;
/* 2541 */                      if (ii1OIIlOi.I0001Ioi1lo(this) != ii0111o) {
                                }
                            }
/* 2565 */                  return ii0111o;
/* 2544 */                  IlliIl1l11O illiIl1l11O2 = o1l0oolOoioi.I00000oIO;
/* 2546 */                  Ii00l101O ii00l101O2 = o1l0oolOoioi.I0000O;
/* 2548 */                  this.I00iiI = 3;
/* 2559 */                  objI00000oOI = ii1OIIlOi.I0000Il00O().I00000oOI(new Ii1O1I(ii1OIIlOi, ii00l101O2, illiIl1l11O2, (IOoil1iiIilo) null), this);
                            break;
                        case 1:
/* 2376 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 2378 */                  int i4 = this.I00iiI;
/* 2380 */                  if (i4 != 0) {
/* 2382 */                      if (i4 == 1) {
/* 2384 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2387 */                          return obj;
                                }
/* 2392 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 2397 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2402 */                  IlliIl1l11O illiIl1l11O3 = (IlliIl1l11O) this.I00iiO;
/* 2408 */                  Object obj2 = ((Ii11I1iOiIo) this.I00iio).I00000oOI;
/* 2411 */                  this.I00iiI = 1;
/* 2413 */                  Object objInvoke = illiIl1l11O3.invoke(obj2, this);
                            return objInvoke == ii0111o2 ? ii0111o2 : objInvoke;
                        case 2:
/* 2332 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2334 */                  int i5 = this.I00iiI;
/* 2337 */                  if (i5 == 0) {
/* 2351 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2356 */                      O1l0oolOoioi o1l0oolOoioi2 = (O1l0oolOoioi) this.I00iio;
/* 2360 */                      Ii1OIIlOi ii1OIIlOi2 = (Ii1OIIlOi) this.I00iiO;
/* 2362 */                      this.I00iiI = 1;
/* 2368 */                      if (ii1OIIlOi2.I0000O(o1l0oolOoioi2, this) == ii0111o3) {
/* 2370 */                          return ii0111o3;
                                }
                            } else {
/* 2339 */                      if (i5 != 1) {
/* 2347 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 2341 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2372 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 2163 */                  Object obj3 = OoiIlOl1iI.I00000oIO;
/* 2167 */                  Ii1l01l ii1l01l = (Ii1l01l) this.I00iio;
/* 2169 */                  Ii00l101O ii00l101O3 = ii1l01l.I00iiI;
/* 2173 */                  IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iiO;
/* 2175 */                  Object obj4 = Ii0111o.I00iOIl;
/* 2177 */                  int i6 = this.I00iiI;
/* 2179 */                  if (i6 != 0) {
/* 2181 */                      if (i6 == 1) {
/* 2203 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2206 */                          objI0001Ioi1lo = obj;
/* 2237 */                          oillO0lO1O = (OillO0lO1O) objI0001Ioi1lo;
/* 2239 */                          if (oillO0lO1O != null) {
                                    }
/* 2326 */                          return obj4;
                                }
/* 2183 */                      if (i6 == 2) {
/* 2199 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2283 */                          i2 = 1;
/* 2222 */                          if (!l01oO1iOo.I000II(ii00l101O3)) {
/* 2224 */                              IIIoloiiI1 iIIoloiiI1 = ii1l01l.I00iOIl;
/* 2226 */                              this.I00iiO = ilOil1iooOO0;
/* 2228 */                              this.I00iiI = i2;
/* 2230 */                              objI0001Ioi1lo = ii1l01l.I0001Ioi1lo(iIIoloiiI1, this);
/* 2234 */                              if (objI0001Ioi1lo != obj4) {
/* 2237 */                                  oillO0lO1O = (OillO0lO1O) objI0001Ioi1lo;
/* 2239 */                                  if (oillO0lO1O != null) {
/* 2303 */                                      if (ii1l01l.I00io1l) {
/* 2305 */                                          this.I00iiO = ilOil1iooOO0;
/* 2307 */                                          this.I00iiI = 3;
/* 2314 */                                          Object objI0000oI00 = iOi1II01i0.I0000oI00(ii00l101O3, new I0iOI0o1i(ii1l01l, null), this);
/* 2320 */                                          if (objI0000oI00 != Ii0111o.I00iOIl) {
                                                        break;
                                                    }
                                                }
/* 2330 */                                      return obj3;
                                            }
/* 2242 */                                  String str = oillO0lO1O.I0000oI00;
/* 2244 */                                  Long l = oillO0lO1O.I0000O;
/* 2246 */                                  String str2 = oillO0lO1O.I0000Il00O;
/* 2248 */                                  String str3 = oillO0lO1O.I00000oOI;
/* 2250 */                                  String str4 = oillO0lO1O.I00000oIO;
/* 2252 */                                  int i7 = Ii1l01l.I00lll10;
/* 2254 */                                  if ((str4 != null || str3 != null || str2 != null || l != null || str == null || ii1l01l.I00ilI0I1) && (str4 != null || str3 != null || str2 != null || str != null || l == null || ii1l01l.I00ilO0)) {
/* 2287 */                                      ii1l01l.I00ioIO.getClass();
/* 2290 */                                      this.I00iiO = ilOil1iooOO0;
/* 2292 */                                      this.I00iiI = 2;
                                                break;
                                            }
/* 2283 */                                  i2 = 1;
/* 2222 */                                  if (!l01oO1iOo.I000II(ii00l101O3)) {
                                            }
                                        }
                                    }
/* 2326 */                          return obj4;
                                }
/* 2185 */                      if (i6 != 3) {
/* 2194 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 2187 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2328 */                      i2 = 1;
                                break;
                            } else {
/* 2209 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
                            break;
                        case 4:
/* 2111 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 2113 */                  int i8 = this.I00iiI;
/* 2115 */                  if (i8 != 0) {
/* 2117 */                      if (i8 == 1) {
/* 2119 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2122 */                          return obj;
                                }
/* 2127 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 2132 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2139 */                  Ii1I1ooo10O0 ii1I1ooo10O0 = ((Ii1liIllli0) this.I00iiO).I0000Il00O;
/* 2149 */                  I1iIil1I i1iIil1I = new I1iIil1I((II00OOlli) this.I00iio, iOoil1iiIilo, 13);
/* 2152 */                  this.I00iiI = 1;
/* 2154 */                  Object objI00000oIO11 = ii1I1ooo10O0.I00000oIO(i1iIil1I, this);
                            return objI00000oIO11 == ii0111o4 ? ii0111o4 : objI00000oIO11;
                        case 5:
/* 2059 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 2061 */                  int i9 = this.I00iiI;
/* 2063 */                  if (i9 != 0) {
/* 2065 */                      if (i9 == 1) {
/* 2067 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2070 */                          return obj;
                                }
/* 2075 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 2080 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2087 */                  Ii1I1ooo10O0 ii1I1ooo10O02 = ((Ii1liIllli0) this.I00iiO).I0000O;
/* 2097 */                  I1iIil1I i1iIil1I2 = new I1iIil1I((Ol0ioI1iI) this.I00iio, iOoil1iiIilo, 14);
/* 2100 */                  this.I00iiI = 1;
/* 2102 */                  Object objI00000oIO12 = ii1I1ooo10O02.I00000oIO(i1iIil1I2, this);
                            return objI00000oIO12 == ii0111o5 ? ii0111o5 : objI00000oIO12;
                        case 6:
/* 2007 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 2009 */                  int i10 = this.I00iiI;
/* 2011 */                  if (i10 != 0) {
/* 2013 */                      if (i10 == 1) {
/* 2015 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2018 */                          return obj;
                                }
/* 2023 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 2028 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2035 */                  Ii1I1ooo10O0 ii1I1ooo10O03 = ((Ii1liIllli0) this.I00iiO).I00000oIO;
/* 2045 */                  I1iIil1I i1iIil1I3 = new I1iIil1I((List) this.I00iio, iOoil1iiIilo, 15);
/* 2048 */                  this.I00iiI = 1;
/* 2050 */                  Object objI00000oIO13 = ii1I1ooo10O03.I00000oIO(i1iIil1I3, this);
                            return objI00000oIO13 == ii0111o6 ? ii0111o6 : objI00000oIO13;
                        case 7:
/* 1955 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1957 */                  int i11 = this.I00iiI;
/* 1959 */                  if (i11 != 0) {
/* 1961 */                      if (i11 == 1) {
/* 1963 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1966 */                          return obj;
                                }
/* 1971 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 1976 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1983 */                  Ii1I1ooo10O0 ii1I1ooo10O04 = ((Ii1liIllli0) this.I00iiO).I00000oIO;
/* 1993 */                  I1iIil1I i1iIil1I4 = new I1iIil1I((Oo0oOoIo0ol) this.I00iio, iOoil1iiIilo, 16);
/* 1996 */                  this.I00iiI = 1;
/* 1998 */                  Object objI00000oIO14 = ii1I1ooo10O04.I00000oIO(i1iIil1I4, this);
                            return objI00000oIO14 == ii0111o7 ? ii0111o7 : objI00000oIO14;
                        case 8:
/* 1900 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1902 */                  int i12 = this.I00iiI;
/* 1904 */                  if (i12 != 0) {
/* 1906 */                      if (i12 == 1) {
/* 1908 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1911 */                          return obj;
                                }
/* 1916 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 1921 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1928 */                  OolI1lo oolI1loI000o00OoI0I = ((IiIi1o) this.I00iiO).I000o00OoI0I();
/* 1934 */                  List list = (List) this.I00iio;
/* 1936 */                  Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 1938 */                  IiIOI1ol0o iiIOI1ol0oI000OOo1O = oolI1loI000o00OoI0I.I000OOo1O(list);
/* 1942 */                  this.I00iiI = 1;
/* 1946 */                  Object objI0010o = ((IOi10loi) iiIOI1ol0oI000OOo1O).I0010o(this);
                            return objI0010o == ii0111o8 ? ii0111o8 : objI0010o;
                        case 9:
/* 1836 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1838 */                  int i13 = this.I00iiI;
/* 1840 */                  if (i13 == 0) {
/* 1854 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1859 */                      I10i01 i10i01 = (I10i01) this.I00iiO;
/* 1869 */                      Float f = new Float(((OOo0lO) this.I00iio).I00iOIl);
/* 1874 */                      OoIoO0I0oOI ooIoO0I0oOII0000O = iOO01lio0.I0000O(150, 6, null);
/* 1878 */                      this.I00iiI = 1;
/* 1893 */                      if (I10i01.I00000oIO(i10i01, f, ooIoO0I0oOII0000O, null, null, this, 12) == ii0111o9) {
/* 1895 */                          return ii0111o9;
                                }
                            } else {
/* 1842 */                      if (i13 != 1) {
/* 1850 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 1844 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1897 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 1778 */                  OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1780 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1782 */                  int i14 = this.I00iiI;
/* 1784 */                  if (i14 == 0) {
/* 1798 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1803 */                      IlI00iOi1 ilI00iOi1 = (IlI00iOi1) this.I00iiO;
/* 1805 */                      this.I00iiI = 1;
/* 1815 */                      Object objI0000oI002 = iOi1II01i0.I0000oI00(IlI00iOi1.I00000oOI, new I1iOI0oo(ilI00iOi1, iOoil1iiIilo, 7), this);
/* 1819 */                      if (objI0000oI002 != ii0111o10) {
/* 1822 */                          objI0000oI002 = ooiIlOl1iI;
                                }
/* 1823 */                      if (objI0000oI002 == ii0111o10) {
/* 1825 */                          return ii0111o10;
                                }
                            } else {
/* 1786 */                      if (i14 != 1) {
/* 1794 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 1788 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1831 */                  ((O1oiilO) this.I00iio).invoke();
/* 1834 */                  return ooiIlOl1iI;
                        case 11:
/* 1543 */                  Object obj5 = Ii0111o.I00iOIl;
/* 1545 */                  int i15 = this.I00iiI;
/* 1547 */                  if (i15 == 0) {
/* 1564 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1573 */                      IIloOiil iIloOiil = (IIloOiil) ((IOO000ilo) this.I00iiO).I00iiO;
/* 1579 */                      IIliIi1O0OiO iIliIi1O0OiO = ((IIlioOI) this.I00iio).I00000oIO;
/* 1581 */                      this.I00iiI = 1;
                                synchronized (iIloOiil.I0000Il00O) {
/* 1588 */                          if (iIloOiil.I0000O) {
/* 1775 */                              throw new IllegalStateException("Check failed.");
                                    }
/* 1600 */                          iIil1o0olooo = ((IIl10ilil1) iIloOiil.I00000oIO.I001i1O0Ol.get()).I0000O;
                                }
/* 1603 */                      if (iIil1o0olooo == null) {
/* 1762 */                          I000II.I001IO000("Required value was null.");
/* 14 */                            return null;
                                }
/* 1605 */                      objI00000oIO = iIil1o0olooo.I00000oIO(iIliIi1O0OiO, this);
/* 1609 */                      if (objI00000oIO == obj5) {
/* 1611 */                          return obj5;
                                }
                            } else {
/* 1549 */                      if (i15 != 1) {
/* 1559 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 1551 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1554 */                      objI00000oIO = obj;
                            }
/* 1616 */                  IIlioOI iIlioOI = (IIlioOI) this.I00iio;
/* 1618 */                  IOllOl1i1i iOllOl1i1i = (IOllOl1i1i) objI00000oIO;
/* 1620 */                  int i16 = iOllOl1i1i.I00000oIO;
/* 1628 */                  if (l11I11lO.I0000O(3, "CXCP")) {
/* 1632 */                      List list2 = iIlioOI.I00000oIO.I00000oOI;
/* 1644 */                      ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 1647 */                      Iterator it = list2.iterator();
/* 1655 */                      while (it.hasNext()) {
/* 1663 */                          List<OIlI1io> list3 = ((IIo1lioOolol) it.next()).I00000oIO;
/* 1673 */                          ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 1684 */                          for (OIlI1io oIlI1io : list3) {
/* 1732 */                              arrayList3.add("size=" + oIlI1io.I00000oIO + ", format=" + ((Object) OlOIOoII1i.I0000Il00O(oIlI1io.I00000oOI)) + ", dynamicRangeProfile" + oIlI1io.I0000oI00);
                                    }
/* 1736 */                          arrayList2.add(arrayList3);
                                }
/* 1744 */                      Objects.toString(iIlioOI.I00000oIO.I000II);
/* 1747 */                      arrayList2.toString();
                            }
/* 1755 */                  return Boolean.valueOf(iOllOl1i1i.I00000oIO == 1);
                        case 12:
/* 1481 */                  OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 1483 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1485 */                  int i17 = this.I00iiI;
/* 1487 */                  if (i17 == 0) {
/* 1502 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1507 */                      IlOi1ilII ilOi1ilII = (IlOi1ilII) this.I00iiO;
/* 1511 */                      IlOOolOo ilOOolOo = (IlOOolOo) this.I00iio;
/* 1513 */                      float f2 = ilOOolOo.I00000oIO;
/* 1515 */                      float f3 = ilOOolOo.I00000oOI;
/* 1517 */                      float f4 = ilOOolOo.I0000O;
/* 1519 */                      float f5 = ilOOolOo.I0000Il00O;
/* 1521 */                      this.I00iiI = 1;
/* 1523 */                      ilOi1ilII.I00000oIO = f2;
/* 1525 */                      ilOi1ilII.I00000oOI = f3;
/* 1527 */                      ilOi1ilII.I0000Il00O = f4;
/* 1529 */                      ilOi1ilII.I0000O = f5;
/* 1531 */                      Object objI00000oOI2 = ilOi1ilII.I00000oOI(this);
/* 1535 */                      if (objI00000oOI2 != ii0111o11) {
/* 1538 */                          objI00000oOI2 = ooiIlOl1iI2;
                                }
/* 1539 */                      if (objI00000oOI2 == ii0111o11) {
/* 1541 */                          return ii0111o11;
                                }
                            } else {
/* 1489 */                      if (i17 != 1) {
/* 1498 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 1491 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1494 */                  return ooiIlOl1iI2;
                        case 13:
/* 1439 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1441 */                  int i18 = this.I00iiI;
/* 1443 */                  if (i18 == 0) {
/* 1457 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1462 */                      IlOi1ilII ilOi1ilII2 = (IlOi1ilII) this.I00iiO;
/* 1466 */                      IooiIloo0i iooiIloo0i = (IooiIloo0i) this.I00iio;
/* 1468 */                      this.I00iiI = 1;
/* 1474 */                      if (ilOi1ilII2.I00000oIO(iooiIloo0i, this) == ii0111o12) {
/* 1476 */                          return ii0111o12;
                                }
                            } else {
/* 1445 */                      if (i18 != 1) {
/* 1453 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 1447 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1478 */                  return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 1393 */                  Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 1395 */                  int i19 = this.I00iiI;
/* 1397 */                  if (i19 == 0) {
/* 1411 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1418 */                      ConversationDao conversationDaoI001IIilI0O = ((BoxChatDatabase) this.I00iiO).I001IIilI0O();
/* 1424 */                      Conversation conversation = (Conversation) this.I00iio;
/* 1426 */                      this.I00iiI = 1;
/* 1432 */                      if (conversationDaoI001IIilI0O.delete(conversation, this) == ii0111o13) {
/* 1434 */                          return ii0111o13;
                                }
                            } else {
/* 1399 */                      if (i19 != 1) {
/* 1407 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 1401 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1436 */                  return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 1247 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 1252 */                  ImageDescriber imageDescriber = (ImageDescriber) this.I00iiO;
/* 1254 */                  Object obj6 = Ii0111o.I00iOIl;
/* 1256 */                  int i20 = this.I00iiI;
                            try {
                            } catch (Exception e) {
/* 1331 */                      Log.e("GeminiNanoHub", "describe checkFeatureStatus: " + e.getMessage());
/* 1336 */                      num = new Integer(0);
                            }
/* 1258 */                  if (i20 == 0) {
/* 1292 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1295 */                      ListenableFuture listenableFutureCheckFeatureStatus = imageDescriber.checkFeatureStatus();
/* 1299 */                      this.I00iiI = 1;
/* 1301 */                      objI00000oIO3 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus, this);
/* 1305 */                      if (objI00000oIO3 == obj6) {
/* 1374 */                          return obj6;
                                }
                            } else if (i20 == 1) {
/* 1284 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1287 */                      objI00000oIO3 = obj;
                            } else {
/* 1262 */                      if (i20 != 2) {
/* 1264 */                          if (i20 != 3) {
/* 1275 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
                                    try {
/* 1266 */                              lIoii1l01l0i.I00000oOI(obj);
/* 1269 */                              objI00000oIO2 = obj;
                                    } catch (Exception unused) {
/* 1381 */                              num = new Integer(0);
                                    }
/* 1376 */                          num = (Integer) objI00000oIO2;
/* 1384 */                          List list4 = Iloo0ilo.I00000oIO;
/* 1386 */                          oI10i0Il.setValue(num);
/* 1344 */                          if (num == null || num.intValue() != 2) {
/* 1390 */                              return OoiIlOl1iI.I00000oIO;
                                    }
/* 1353 */                          this.I00iiI = 2;
/* 1359 */                          if (il0l1o1l.I00000oOI(5000L, this) != obj6) {
/* 1362 */                              ListenableFuture listenableFutureCheckFeatureStatus2 = imageDescriber.checkFeatureStatus();
/* 1366 */                              this.I00iiI = 3;
/* 1368 */                              objI00000oIO2 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus2, this);
                                        break;
                                    }
/* 1374 */                          return obj6;
                                }
/* 1280 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1362 */                      ListenableFuture listenableFutureCheckFeatureStatus22 = imageDescriber.checkFeatureStatus();
/* 1366 */                      this.I00iiI = 3;
/* 1368 */                      objI00000oIO2 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus22, this);
                            }
/* 1308 */                  num = (Integer) objI00000oIO3;
/* 1339 */                  List list5 = Iloo0ilo.I00000oIO;
/* 1341 */                  oI10i0Il.setValue(num);
/* 1344 */                  if (num == null) {
/* 1353 */                      this.I00iiI = 2;
/* 1359 */                      if (il0l1o1l.I00000oOI(5000L, this) != obj6) {
                                }
/* 1374 */                      return obj6;
                            }
/* 1390 */                  return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 1098 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 1103 */                  Proofreader proofreader = (Proofreader) this.I00iiO;
/* 1105 */                  Object obj7 = Ii0111o.I00iOIl;
/* 1107 */                  int i21 = this.I00iiI;
                            try {
                            } catch (Exception e2) {
/* 1182 */                      Log.e("GeminiNanoHub", "proofread checkFeatureStatus: " + e2.getMessage());
/* 1187 */                      num2 = new Integer(0);
                            }
/* 1109 */                  if (i21 == 0) {
/* 1143 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1146 */                      ListenableFuture listenableFutureCheckFeatureStatus3 = proofreader.checkFeatureStatus();
/* 1150 */                      this.I00iiI = 1;
/* 1152 */                      objI00000oIO5 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus3, this);
/* 1156 */                      if (objI00000oIO5 == obj7) {
/* 1225 */                          return obj7;
                                }
                            } else if (i21 == 1) {
/* 1135 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1138 */                      objI00000oIO5 = obj;
                            } else {
/* 1113 */                      if (i21 != 2) {
/* 1115 */                          if (i21 != 3) {
/* 1126 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
                                    try {
/* 1117 */                              lIoii1l01l0i.I00000oOI(obj);
/* 1120 */                              objI00000oIO4 = obj;
                                    } catch (Exception unused2) {
/* 1232 */                              num2 = new Integer(0);
                                    }
/* 1227 */                          num2 = (Integer) objI00000oIO4;
/* 1235 */                          List list6 = Iloo0ilo.I00000oIO;
/* 1237 */                          oI10i0Il2.setValue(num2);
/* 1195 */                          if (num2 == null || num2.intValue() != 2) {
/* 1241 */                              return OoiIlOl1iI.I00000oIO;
                                    }
/* 1204 */                          this.I00iiI = 2;
/* 1210 */                          if (il0l1o1l.I00000oOI(5000L, this) != obj7) {
/* 1213 */                              ListenableFuture listenableFutureCheckFeatureStatus4 = proofreader.checkFeatureStatus();
/* 1217 */                              this.I00iiI = 3;
/* 1219 */                              objI00000oIO4 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus4, this);
                                        break;
                                    }
/* 1225 */                          return obj7;
                                }
/* 1131 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1213 */                      ListenableFuture listenableFutureCheckFeatureStatus42 = proofreader.checkFeatureStatus();
/* 1217 */                      this.I00iiI = 3;
/* 1219 */                      objI00000oIO4 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus42, this);
                            }
/* 1159 */                  num2 = (Integer) objI00000oIO5;
/* 1190 */                  List list7 = Iloo0ilo.I00000oIO;
/* 1192 */                  oI10i0Il2.setValue(num2);
/* 1195 */                  if (num2 == null) {
/* 1204 */                      this.I00iiI = 2;
/* 1210 */                      if (il0l1o1l.I00000oOI(5000L, this) != obj7) {
                                }
/* 1225 */                      return obj7;
                            }
/* 1241 */                  return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 949 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iio;
/* 954 */                   Rewriter rewriter = (Rewriter) this.I00iiO;
/* 956 */                   Object obj8 = Ii0111o.I00iOIl;
/* 958 */                   int i22 = this.I00iiI;
                            try {
                            } catch (Exception e3) {
/* 1033 */                      Log.e("GeminiNanoHub", "rewrite checkFeatureStatus: " + e3.getMessage());
/* 1038 */                      num3 = new Integer(0);
                            }
/* 960 */                   if (i22 == 0) {
/* 994 */                       lIoii1l01l0i.I00000oOI(obj);
/* 997 */                       ListenableFuture listenableFutureCheckFeatureStatus5 = rewriter.checkFeatureStatus();
/* 1001 */                      this.I00iiI = 1;
/* 1003 */                      objI00000oIO7 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus5, this);
/* 1007 */                      if (objI00000oIO7 == obj8) {
/* 1076 */                          return obj8;
                                }
                            } else if (i22 == 1) {
/* 986 */                       lIoii1l01l0i.I00000oOI(obj);
/* 989 */                       objI00000oIO7 = obj;
                            } else {
/* 964 */                       if (i22 != 2) {
/* 966 */                           if (i22 != 3) {
/* 977 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
                                    try {
/* 968 */                               lIoii1l01l0i.I00000oOI(obj);
/* 971 */                               objI00000oIO6 = obj;
                                    } catch (Exception unused3) {
/* 1083 */                              num3 = new Integer(0);
                                    }
/* 1078 */                          num3 = (Integer) objI00000oIO6;
/* 1086 */                          List list8 = Iloo0ilo.I00000oIO;
/* 1088 */                          oI10i0Il3.setValue(num3);
/* 1046 */                          if (num3 == null || num3.intValue() != 2) {
/* 1092 */                              return OoiIlOl1iI.I00000oIO;
                                    }
/* 1055 */                          this.I00iiI = 2;
/* 1061 */                          if (il0l1o1l.I00000oOI(5000L, this) != obj8) {
/* 1064 */                              ListenableFuture listenableFutureCheckFeatureStatus6 = rewriter.checkFeatureStatus();
/* 1068 */                              this.I00iiI = 3;
/* 1070 */                              objI00000oIO6 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus6, this);
                                        break;
                                    }
/* 1076 */                          return obj8;
                                }
/* 982 */                       lIoii1l01l0i.I00000oOI(obj);
/* 1064 */                      ListenableFuture listenableFutureCheckFeatureStatus62 = rewriter.checkFeatureStatus();
/* 1068 */                      this.I00iiI = 3;
/* 1070 */                      objI00000oIO6 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus62, this);
                            }
/* 1010 */                  num3 = (Integer) objI00000oIO7;
/* 1041 */                  List list9 = Iloo0ilo.I00000oIO;
/* 1043 */                  oI10i0Il3.setValue(num3);
/* 1046 */                  if (num3 == null) {
/* 1055 */                      this.I00iiI = 2;
/* 1061 */                      if (il0l1o1l.I00000oOI(5000L, this) != obj8) {
                                }
/* 1076 */                      return obj8;
                            }
/* 1092 */                  return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 844 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iio;
/* 849 */                   SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.I00iiO;
/* 851 */                   Object obj9 = Ii0111o.I00iOIl;
/* 853 */                   int i23 = this.I00iiI;
                            try {
                            } catch (Exception e4) {
/* 906 */                       IIlIOloOOO.I001iOo1i0O("speech checkStatus: ", e4.getMessage(), "GeminiNanoHub");
                            }
/* 855 */                   if (i23 == 0) {
/* 879 */                       lIoii1l01l0i.I00000oOI(obj);
/* 882 */                       this.I00iiI = 1;
/* 884 */                       objCheckStatus = speechRecognizer.checkStatus(this);
/* 888 */                       if (objCheckStatus == obj9) {
/* 941 */                           return obj9;
                                }
                            } else {
/* 857 */                       if (i23 != 1) {
/* 859 */                           if (i23 == 2) {
/* 861 */                               lIoii1l01l0i.I00000oOI(obj);
/* 943 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 867 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 871 */                       lIoii1l01l0i.I00000oOI(obj);
/* 874 */                       objCheckStatus = obj;
                            }
/* 893 */                   iIntValue = ((Number) objCheckStatus).intValue();
/* 911 */                   Integer num5 = new Integer(iIntValue);
/* 914 */                   List list10 = Iloo0ilo.I00000oIO;
/* 916 */                   oI10i0Il4.setValue(num5);
/* 919 */                   if (iIntValue == 2) {
/* 925 */                       IlI0iIl011 ilI0iIl011 = new IlI0iIl011(25);
/* 928 */                       ilI0iIl011.I00iiI = oI10i0Il4;
/* 930 */                       VarHandle.storeStoreFence();
/* 933 */                       this.I00iiI = 2;
                                break;
                            }
/* 943 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 695 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iio;
/* 700 */                   Summarizer summarizer = (Summarizer) this.I00iiO;
/* 702 */                   Object obj10 = Ii0111o.I00iOIl;
/* 704 */                   int i24 = this.I00iiI;
                            try {
                            } catch (Exception e5) {
/* 779 */                       Log.e("GeminiNanoHub", "summarize checkFeatureStatus: " + e5.getMessage());
/* 784 */                       num4 = new Integer(0);
                            }
/* 706 */                   if (i24 == 0) {
/* 740 */                       lIoii1l01l0i.I00000oOI(obj);
/* 743 */                       ListenableFuture listenableFutureCheckFeatureStatus7 = summarizer.checkFeatureStatus();
/* 747 */                       this.I00iiI = 1;
/* 749 */                       objI00000oIO9 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus7, this);
/* 753 */                       if (objI00000oIO9 == obj10) {
/* 822 */                           return obj10;
                                }
                            } else if (i24 == 1) {
/* 732 */                       lIoii1l01l0i.I00000oOI(obj);
/* 735 */                       objI00000oIO9 = obj;
                            } else {
/* 710 */                       if (i24 != 2) {
/* 712 */                           if (i24 != 3) {
/* 723 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
                                    try {
/* 714 */                               lIoii1l01l0i.I00000oOI(obj);
/* 717 */                               objI00000oIO8 = obj;
                                    } catch (Exception unused4) {
/* 829 */                               num4 = new Integer(0);
                                    }
/* 824 */                           num4 = (Integer) objI00000oIO8;
/* 832 */                           List list11 = Iloo0ilo.I00000oIO;
/* 834 */                           oI10i0Il5.setValue(num4);
/* 792 */                           if (num4 == null || num4.intValue() != 2) {
/* 838 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 801 */                           this.I00iiI = 2;
/* 807 */                           if (il0l1o1l.I00000oOI(5000L, this) != obj10) {
/* 810 */                               ListenableFuture listenableFutureCheckFeatureStatus8 = summarizer.checkFeatureStatus();
/* 814 */                               this.I00iiI = 3;
/* 816 */                               objI00000oIO8 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus8, this);
                                        break;
                                    }
/* 822 */                           return obj10;
                                }
/* 728 */                       lIoii1l01l0i.I00000oOI(obj);
/* 810 */                       ListenableFuture listenableFutureCheckFeatureStatus82 = summarizer.checkFeatureStatus();
/* 814 */                       this.I00iiI = 3;
/* 816 */                       objI00000oIO8 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus82, this);
                            }
/* 756 */                   num4 = (Integer) objI00000oIO9;
/* 787 */                   List list12 = Iloo0ilo.I00000oIO;
/* 789 */                   oI10i0Il5.setValue(num4);
/* 792 */                   if (num4 == null) {
/* 801 */                       this.I00iiI = 2;
/* 807 */                       if (il0l1o1l.I00000oOI(5000L, this) != obj10) {
                                }
/* 822 */                       return obj10;
                            }
/* 838 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 618 */                   Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 620 */                   int i25 = this.I00iiI;
/* 622 */                   if (i25 == 0) {
/* 636 */                       lIoii1l01l0i.I00000oOI(obj);
/* 639 */                       this.I00iiI = 1;
/* 645 */                       if (il0l1o1l.I00000oOI(200L, this) == ii0111o14) {
/* 647 */                           return ii0111o14;
                                }
                            } else {
/* 624 */                       if (i25 != 1) {
/* 632 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 626 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 651 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iio;
/* 653 */                   List list13 = Io0IlOI0l.I00000oIO;
/* 657 */                   oI10i0Il6.setValue(Boolean.FALSE);
/* 664 */                   Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
/* 669 */                   intent.addCategory("android.intent.category.OPENABLE");
/* 674 */                   intent.setType("*/*");
/* 679 */                   intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
/* 686 */                   ((iOI1I00I10) this.I00iiO).I00000oIO(intent);
/* 689 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 543 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iio;
/* 547 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00iiO;
/* 549 */                   Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 551 */                   int i26 = this.I00iiI;
/* 553 */                   if (i26 == 0) {
/* 567 */                       lIoii1l01l0i.I00000oOI(obj);
/* 570 */                       List list14 = IoI0lol0i1i.I00000oIO;
/* 580 */                       if (!((O1oiOloOo) oI10i0Il8.getValue()).I0000oI00) {
/* 612 */                           oI10i0Il7.setValue(Boolean.FALSE);
/* 615 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 582 */                       this.I00iiI = 1;
/* 588 */                       if (il0l1o1l.I00000oOI(200L, this) == ii0111o15) {
/* 590 */                           return ii0111o15;
                                }
                            } else {
/* 555 */                       if (i26 != 1) {
/* 563 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 557 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 592 */                   List list15 = IoI0lol0i1i.I00000oIO;
/* 602 */                   if (((O1oiOloOo) oI10i0Il8.getValue()).I0000oI00) {
/* 606 */                       oI10i0Il7.setValue(Boolean.TRUE);
                            }
/* 615 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 488 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 490 */                   int i27 = this.I00iiI;
/* 492 */                   if (i27 == 0) {
/* 506 */                       lIoii1l01l0i.I00000oOI(obj);
/* 509 */                       this.I00iiI = 1;
/* 517 */                       if (il0l1o1l.I00000oOI(2000L, this) == ii0111o16) {
/* 519 */                           return ii0111o16;
                                }
                            } else {
/* 494 */                       if (i27 != 1) {
/* 502 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 496 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 529 */                   if (iOI10i0I11.I00000oIO((Context) this.I00iiO, "android.permission.POST_NOTIFICATIONS") != 0) {
/* 535 */                       ((O1OIi1) this.I00iio).I00000oIO("android.permission.POST_NOTIFICATIONS");
                            }
/* 538 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 413 */                   IoIll0l ioIll0l = (IoIll0l) this.I00iiO;
/* 415 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 417 */                   int i28 = this.I00iiI;
/* 419 */                   if (i28 != 0) {
/* 421 */                       if (i28 == 1) {
/* 423 */                           lIoii1l01l0i.I00000oOI(obj);
/* 426 */                           return obj;
                                }
/* 431 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 436 */                   lIoii1l01l0i.I00000oOI(obj);
/* 449 */                   O010OIi o010OIi = (O010OIi) ioIll0l.I00000oIO().I00lli11(Iioi0lilII.I00iio);
/* 459 */                   if (!(o010OIi != null ? o010OIi.I0000Il00O() : false)) {
/* 479 */                       IOIoIlIlO iOIoIlIlO = new IOIoIlIlO("Client already closed", 0);
/* 482 */                       VarHandle.storeStoreFence();
/* 485 */                       throw iOIoIlIlO;
                            }
/* 463 */                   IOiOol0 iOiOol0 = (IOiOol0) this.I00iio;
/* 465 */                   this.I00iiI = 1;
/* 467 */                   Object objI0000Il00O = ioIll0l.I0000Il00O(iOiOol0, this);
                            return objI0000Il00O == ii0111o17 ? ii0111o17 : objI0000Il00O;
                        case PoseLandmark.RIGHT_HIP:
/* 320 */                   O00lOo o00lOo = (O00lOo) this.I00iiO;
/* 322 */                   ThreadLocal threadLocal = o00lOo.I00000oOI;
/* 324 */                   Object obj11 = Ii0111o.I00iOIl;
/* 326 */                   int i29 = this.I00iiI;
                            try {
/* 328 */                       if (i29 == 0) {
/* 346 */                           lIoii1l01l0i.I00000oOI(obj);
/* 349 */                           Object obj12 = threadLocal.get();
/* 353 */                           Boolean bool = Boolean.TRUE;
/* 359 */                           if (O0000Ioio00.I0000O(obj12, bool)) {
/* 407 */                               I000II.I001IO000("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
/* 14 */                                return null;
                                    }
/* 361 */                           threadLocal.set(bool);
/* 364 */                           Ii1I1ooo10O0 ii1I1ooo10O05 = o00lOo.I0000Il00O;
/* 372 */                           Ii0llooiiIii ii0llooiiIii = new Ii0llooiiIii(null, (Function1) this.I00iio);
/* 375 */                           this.I00iiI = 1;
/* 382 */                           objI00000oIO10 = ii1I1ooo10O05.I00000oIO(new OOI01iOI00o1(ii0llooiiIii, null, 1), this);
/* 386 */                           if (objI00000oIO10 == obj11) {
/* 388 */                               return obj11;
                                    }
                                } else {
/* 330 */                           if (i29 != 1) {
/* 342 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
/* 332 */                           lIoii1l01l0i.I00000oOI(obj);
/* 335 */                           objI00000oIO10 = obj;
                                }
/* 391 */                       return (OI0ooi10l) objI00000oIO10;
                            } finally {
/* 401 */                       threadLocal.set(Boolean.FALSE);
                            }
                        case PoseLandmark.LEFT_KNEE:
/* 263 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 265 */                   int i30 = this.I00iiI;
/* 267 */                   if (i30 != 0) {
/* 269 */                       if (i30 == 1) {
/* 271 */                           lIoii1l01l0i.I00000oOI(obj);
/* 274 */                           return obj;
                                }
/* 279 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 284 */                   lIoii1l01l0i.I00000oOI(obj);
/* 291 */                   Ii1I1ooo10O0 ii1I1ooo10O06 = ((O00lOo) this.I00iiO).I0000Il00O;
/* 299 */                   O00lOIIO o00lOIIO = new O00lOIIO((Long) this.I00iio, iOoil1iiIilo, z ? 1 : 0);
/* 302 */                   this.I00iiI = 1;
/* 309 */                   Object objI00000oIO15 = ii1I1ooo10O06.I00000oIO(new OOI01iOI00o1(o00lOIIO, null, 1), this);
                            return objI00000oIO15 == ii0111o18 ? ii0111o18 : objI00000oIO15;
                        case PoseLandmark.RIGHT_KNEE:
/* 216 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 218 */                   int i31 = this.I00iiI;
/* 220 */                   if (i31 == 0) {
/* 234 */                       lIoii1l01l0i.I00000oOI(obj);
/* 239 */                       OO1io0l0 oO1io0l0 = (OO1io0l0) this.I00iiO;
/* 247 */                       I1ooIlOiO0iI i1ooIlOiO0iI = new I1ooIlOiO0iI((OIoIoIO0oI1O) this.I00iio, iOoil1iiIilo, i2);
/* 250 */                       this.I00iiI = 1;
/* 256 */                       if (ililI0.I0000Il00O(oO1io0l0, i1ooIlOiO0iI, this) == ii0111o19) {
/* 258 */                           return ii0111o19;
                                }
                            } else {
/* 222 */                       if (i31 != 1) {
/* 230 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 224 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 260 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 177 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 179 */                   int i32 = this.I00iiI;
/* 181 */                   if (i32 != 0) {
/* 183 */                       if (i32 != 1) {
/* 187 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 191 */                       lIoii1l01l0i.I00000oOI(obj);
/* 194 */                       IOOlIIilOl0.I0000Il00O();
/* 14 */                        return null;
                            }
/* 198 */                   lIoii1l01l0i.I00000oOI(obj);
/* 203 */                   O0oIIIiiO1 o0oIIIiiO1 = (O0oIIIiiO1) this.I00iiO;
/* 207 */                   I0iOI0o1i i0iOI0o1i = (I0iOI0o1i) this.I00iio;
/* 209 */                   this.I00iiI = 1;
/* 211 */                   OO1OOOO1l.I00000oIO(o0oIIIiiO1, i0iOI0o1i, this);
/* 214 */                   return ii0111o20;
                        case PoseLandmark.RIGHT_ANKLE:
/* 128 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 130 */                   int i33 = this.I00iiI;
/* 132 */                   if (i33 == 0) {
/* 146 */                       lIoii1l01l0i.I00000oOI(obj);
/* 153 */                       Ii1I1ooo10O0 ii1I1ooo10O07 = ((O1i1O1I) this.I00iiO).I00000oOI;
/* 161 */                       Ii1lO0 ii1lO0 = new Ii1lO0((ArrayList) this.I00iio, iOoil1iiIilo, i);
/* 164 */                       this.I00iiI = 1;
/* 170 */                       if (ii1I1ooo10O07.I00000oIO(ii1lO0, this) == ii0111o21) {
/* 172 */                           return ii0111o21;
                                }
                            } else {
/* 134 */                       if (i33 != 1) {
/* 142 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 136 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 174 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 20 */                    String str5 = (String) this.I00iio;
/* 24 */                    O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiO;
/* 26 */                    Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 28 */                    int i34 = this.I00iiI;
/* 30 */                    if (i34 == 0) {
/* 44 */                        lIoii1l01l0i.I00000oOI(obj);
/* 47 */                        Ii1I1ooo10O0 ii1I1ooo10O08 = o1i1O1I.I00000oOI;
/* 51 */                        Ii1l1iio0lO0 ii1l1iio0lO0 = new Ii1l1iio0lO0(str5, i2, iOoil1iiIilo);
/* 54 */                        this.I00iiI = 1;
/* 60 */                        if (ii1I1ooo10O08.I00000oIO(ii1l1iio0lO0, this) == ii0111o22) {
/* 62 */                            return ii0111o22;
                                }
                            } else {
/* 32 */                        if (i34 != 1) {
/* 40 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 34 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 64 */                    OlO0OIIl1 olO0OIIl1 = o1i1O1I.I0000O;
/* 123 */                   do {
/* 66 */                        value = olO0OIIl1.getValue();
/* 71 */                        o1i1IIoO1IIl = (O1i1IIoO1IIl) value;
/* 73 */                        List list16 = o1i1IIoO1IIl.I00000oIO;
/* 79 */                        arrayList = new ArrayList();
/* 90 */                        for (Object obj13 : list16) {
/* 109 */                           if (!O0000Ioio00.I0000O(((O1i1Ooo0ll) obj13).I00000oIO.I001i1O0Ol(), str5)) {
/* 111 */                               arrayList.add(obj13);
                                    }
                                }
/* 123 */                   } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl, arrayList, false, null, 6)));
/* 125 */                   return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public Ii1O001loIoO(Ii1l01l ii1l01l, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 3;
/* 16 */            this.I00iio = ii1l01l;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public Ii1O001loIoO(Ii1OIIlOi ii1OIIlOi, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 2;
/* 17 */            this.I00iiO = ii1OIIlOi;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public Ii1O001loIoO(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 18 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                }
            }
