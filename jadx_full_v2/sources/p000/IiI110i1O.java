            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.net.ConnectivityManager;
            import android.net.NetworkCapabilities;
            import android.net.NetworkRequest;
            import android.net.Uri;
            import android.util.Log;
            import android.view.InputEvent;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.ConversationDao;
            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.stablediffusion.StableDiffusion;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.CancellationException;
            
/* 14 */    public final class IiI110i1O extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IiI110i1O(IiIi1o iiIi1o, IOoil1iiIilo iOoil1iiIilo, Map map, IOlOo0 iOlOo0) {
/* 12 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 2;
/* 4 */             Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 6 */             this.I00iiO = iiIi1o;
/* 8 */             this.I00iio = map;
/* 10 */            this.I00ilI0I1 = iOlOo0;
                }

                private final Object I00000oIO(Object obj) throws Throwable {
/* 3 */             OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 10 */            if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 38 */                if (((List) oI10i0Il.getValue()).size() > 1) {
/* 62 */                    OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) ((List) oI10i0Il.getValue()).get(((List) oI10i0Il.getValue()).size() - 2);
/* 66 */                    Oii110oOoO oii110oOoO = (Oii110oOoO) this.I00iiO;
/* 72 */                    float fI000II = ((OIooO1iiliI) this.I00ilI0I1).I000II();
/* 76 */                    this.I00iiI = 1;
/* 82 */                    if (oii110oOoO.I010l1ol111(fI000II, oI1OloOIO1O, this) == ii0111o) {
/* 84 */                        return ii0111o;
                            }
                        }
                    } else {
/* 12 */                if (i != 1) {
/* 20 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 23 */                    return null;
                        }
/* 14 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 85 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 594 */                   return new IiI110i1O((IiI11iIOlOo1) this.I00iiO, (OI110lo) this.I00iio, (IlliIl1l11O) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 571 */                   IiI110i1O iiI110i1O = new IiI110i1O(this.I00iio, (Ii1olII1lO1) obj2, iOoil1iiIilo, 1);
/* 574 */                   iiI110i1O.I00iiO = obj;
/* 576 */                   return iiI110i1O;
                        case 2:
/* 549 */                   IiIi1o iiIi1o = (IiIi1o) this.I00iiO;
/* 553 */                   Map map = (Map) this.I00iio;
/* 555 */                   Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 559 */                   return new IiI110i1O(iiIi1o, iOoil1iiIilo, map, (IOlOo0) obj2);
                        case 3:
/* 540 */                   return new IiI110i1O((IiIi1o) this.I00iiO, iOoil1iiIilo, (IIl0oI) this.I00iio, (Map) obj2);
                        case 4:
/* 523 */                   return new IiI110i1O((IlI1loI1lO1) this.I00iiO, (Context) this.I00iio, (String) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 500 */                   IiI110i1O iiI110i1O2 = new IiI110i1O((OI0lOIiOIOOo) this.I00iio, (IlOi1ilII) obj2, iOoil1iiIilo, 5);
/* 503 */                   iiI110i1O2.I00iiO = obj;
/* 505 */                   return iiI110i1O2;
                        case 6:
/* 486 */                   return new IiI110i1O((OI0lOIiOIOOo) this.I00iiO, (Ili10looIi0) this.I00iio, (IiiOlIiio) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 465 */                   return new IiI110i1O((BoxChatDatabase) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 451 */                   return new IiI110i1O((BoxChatDatabase) this.I00iiO, (Conversation) this.I00iio, (String) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 429 */                   return new IiI110i1O((Ol1o0O0O0) this.I00iiO, (O0o0I1i0O) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 407 */                   return new IiI110i1O((SpeechRecognizer) this.I00iiO, (OI10i0Il) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 385 */                   return new IiI110i1O((IlooOlI) this.I00iiO, (GenerateContentRequest) this.I00iio, (IlOil1iooOO0) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 363 */                   return new IiI110i1O((IIIII1OI1) obj2, iOoil1iiIilo);
                        case 13:
/* 354 */                   return new IiI110i1O((OI10i0Il) this.I00iiO, (OlO01l1oOil) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 332 */                   return new IiI110i1O((Long) this.I00iiO, (IoO10oI0o) this.I00iio, (Oliiii0) obj2, iOoil1iiIilo, 14);
                        case 15:
/* 310 */                   return new IiI110i1O((Ol1OlloIO) this.I00iiO, (IoiIII) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 15);
                        case 16:
/* 288 */                   return new IiI110i1O((StableDiffusion) this.I00iiO, (OlIiOOo1O1ll) this.I00iio, (IoiIII) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 266 */                   return new IiI110i1O((O00lOo) this.I00iiO, (OOI0IO111Ii) this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 245 */                   return new IiI110i1O((O0lOll0I0o00) this.I00iiO, (IlIoO1ilo1) this.I00iio, (Io10IOI) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 221 */                   IiI110i1O iiI110i1O3 = new IiI110i1O((IlliIl1l11O) obj2, (IIiOOI) this.I00iio, iOoil1iiIilo);
/* 224 */                   iiI110i1O3.I00iiO = obj;
/* 226 */                   return iiI110i1O3;
                        case PoseLandmark.RIGHT_INDEX:
/* 208 */                   return new IiI110i1O((IlliIl1l11O) obj2, (OOo0ooi) this.I00iiO, (O11Il0) this.I00iio, iOoil1iiIilo);
                        case PoseLandmark.LEFT_THUMB:
/* 191 */                   return new IiI110i1O((O11iO00I1o) this.I00iiO, (String) this.I00iio, (String) obj2, iOoil1iiIilo, 21);
                        case PoseLandmark.RIGHT_THUMB:
/* 169 */                   return new IiI110i1O((O1iOlOIiO) this.I00iiO, (Uri) this.I00iio, (InputEvent) obj2, iOoil1iiIilo, 22);
                        case PoseLandmark.LEFT_HIP:
/* 147 */                   return new IiI110i1O((Context) this.I00iiO, (Uri) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 125 */                   return new IiI110i1O((O1loIO) this.I00iiO, (Context) this.I00iio, (Uri) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 103 */                   return new IiI110i1O((O1o1io0oi0ol) this.I00iiO, (Context) this.I00iio, (Uri) obj2, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 79 */                    IiI110i1O iiI110i1O4 = new IiI110i1O((IIOIIi10OOl) this.I00iio, (Ii01oI01) obj2, iOoil1iiIilo, 26);
/* 82 */                    iiI110i1O4.I00iiO = obj;
/* 84 */                    return iiI110i1O4;
                        case 27:
/* 64 */                    return new IiI110i1O((OoI1Oi0l1I0o) this.I00iiO, (Ol1o1llOII) this.I00iio, (OI0o0olO1) obj2, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 42 */                    return new IiI110i1O((Oii110oOoO) this.I00iiO, (OI10i0Il) this.I00iio, (OIooO1iiliI) obj2, iOoil1iiIilo, 28);
                        default:
/* 18 */                    IiI110i1O iiI110i1O5 = new IiI110i1O((IOo0o10i1IO) this.I00iio, (OIIOiO00i1i) obj2, iOoil1iiIilo, 29);
/* 21 */                    iiI110i1O5.I00iiO = obj;
/* 23 */                    return iiI110i1O5;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 453 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 438 */                   return ((IiI110i1O) create((i01lO11OIl0o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 423 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 408 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 393 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 378 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 6:
/* 363 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 7:
/* 348 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 8:
/* 333 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 9:
/* 318 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 10:
/* 303 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 11:
/* 288 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 12:
/* 273 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 13:
/* 258 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 14:
/* 243 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 15:
/* 228 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 16:
/* 213 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 17:
/* 198 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_PINKY:
/* 183 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_INDEX:
/* 168 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_INDEX:
/* 153 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_THUMB:
/* 138 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_THUMB:
/* 123 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_HIP:
/* 108 */                   return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_HIP:
/* 93 */                    return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_KNEE:
/* 78 */                    return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_KNEE:
/* 63 */                    return ((IiI110i1O) create((i01lO11OIl0o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 27:
/* 48 */                    return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_ANKLE:
/* 33 */                    return ((IiI110i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((IiI110i1O) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:161:0x03c6, code lost:
                
                    if (r0 == r2) goto L162;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:346:0x0761, code lost:
                
                    if (r3.I00000oIO(r4, r25) == r2) goto L350;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:349:0x077e, code lost:
                
                    if (p000.Iloo0ilo.I00IlilI0i0i(r0, r6, r25) == r2) goto L350;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:532:?, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x01dc, code lost:
                
                    if (((p000.IIIloOl0I1I) r0).I0000Il00O(r25) == r10) goto L84;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:298:0x06ac  */
                /* JADX WARN: Removed duplicated region for block: B:301:0x06b6 A[Catch: all -> 0x068b, TryCatch #4 {all -> 0x068b, blocks: (B:289:0x0685, B:299:0x06ae, B:301:0x06b6, B:302:0x06c3, B:309:0x06d3, B:296:0x06a0, B:311:0x06d6, B:313:0x06db, B:314:0x06dc, B:295:0x069c, B:303:0x06c4, B:305:0x06ca), top: B:478:0x0679, inners: #3 }] */
                /* JADX WARN: Removed duplicated region for block: B:315:0x06dd  */
                /* JADX WARN: Type inference failed for: r2v0 */
                /* JADX WARN: Type inference failed for: r2v114 */
                /* JADX WARN: Type inference failed for: r2v115 */
                /* JADX WARN: Type inference failed for: r2v36, types: [OOlloO] */
                /* JADX WARN: Type inference failed for: r2v38, types: [IIIII1OI1] */
                /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v40, types: [OOlloO] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:297:0x06aa -> B:299:0x06ae). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Conversation conversation;
                    IIII0iI10 it;
                    Object objI00000oOI;
                    boolean z;
                    Object objI0000Il00O;
                    Object objI0000Il00O2;
                    Object objInvoke;
                    Object objInvoke2;
                    Object conversationById;
                    OIoi0IIoi oIoi0IIoiI0001Ioi1lo;
                    Object objI0000oI00;
                    Object objI0000oI002;
                    NetworkRequest networkRequestBuild;
/* 5 */             int i = 7;
/* 6 */             ?? r2 = 12;
/* 6 */             char c = '\f';
/* 8 */             int i2 = 4;
/* 9 */             int i3 = 3;
/* 10 */            int i4 = 0;
/* 12 */            int i5 = 1;
/* 13 */            boolean z2 = false;
/* 13 */            boolean z3 = false;
/* 13 */            boolean z4 = false;
/* 13 */            boolean z5 = false;
/* 13 */            boolean z6 = false;
/* 13 */            boolean z7 = false;
                    switch (this.I00iOIl) {
                        case 0:
/* 2527 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 2529 */                  int i6 = this.I00iiI;
/* 2531 */                  if (i6 == 0) {
/* 2545 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2550 */                      IiI11iIOlOo1 iiI11iIOlOo1 = (IiI11iIOlOo1) this.I00iiO;
/* 2552 */                      OI11IlOoi oI11IlOoi = iiI11iIOlOo1.I0000Il00O;
/* 2554 */                      IiI11O11oO iiI11O11oO = iiI11iIOlOo1.I00000oOI;
/* 2559 */                      OI110lo oI110lo = (OI110lo) this.I00iio;
/* 2569 */                      I00oIiI10 i00oIiI10 = new I00oIiI10(iiI11iIOlOo1, (IlliIl1l11O) this.I00ilI0I1, z2 ? 1 : 0, 29);
/* 2572 */                      this.I00iiI = 1;
/* 2574 */                      oI11IlOoi.getClass();
/* 2587 */                      if (il001oo1.I0000Il00O(new OI11IO0001(oI110lo, oI11IlOoi, i00oIiI10, iiI11O11oO, null), this) == ii0111o) {
/* 2589 */                          return ii0111o;
                                }
                            } else {
/* 2533 */                      if (i6 != 1) {
/* 2541 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2535 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2591 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 2446 */                  Ii1olII1lO1 ii1olII1lO1 = (Ii1olII1lO1) this.I00ilI0I1;
/* 2448 */                  Object obj2 = this.I00iio;
/* 2452 */                  i01lO11OIl0o i01lo11oil0o = (i01lO11OIl0o) this.I00iiO;
/* 2454 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 2456 */                  int i7 = this.I00iiI;
                            try {
/* 2458 */                      if (i7 == 0) {
/* 2476 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2482 */                          IIOIlI01 iIOIlI01 = i01lo11oil0o.I00iOIl;
/* 2484 */                          this.I00iiO = null;
/* 2486 */                          this.I00iiI = 1;
/* 2497 */                          if (iOiOOIlI1o01.I00000oIO((IIIoloiiI1) obj2, iIOIlI01, Long.MAX_VALUE, this) == ii0111o2) {
/* 2499 */                              return ii0111o2;
                                    }
                                } else {
/* 2460 */                          if (i7 != 1) {
/* 2472 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 2462 */                          lIoii1l01l0i.I00000oOI(obj);
                                }
/* 2503 */                      Throwable thI0000oI00 = ((IIIoloiiI1) obj2).I0000oI00();
/* 2507 */                      if (thI0000oI00 == null) {
/* 2509 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 2512 */                      throw thI0000oI00;
                            } catch (CancellationException e) {
/* 2523 */                      il001oo1.I00000oOI(ii1olII1lO1, e);
/* 2526 */                      throw e;
                            } catch (Throwable th) {
/* 2519 */                      il001oo1.I00000oOI(ii1olII1lO1, ilIiOIi0I.I00000oIO("Receive failed", th));
/* 2522 */                      throw th;
                            }
                        case 2:
/* 2384 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2386 */                  int i8 = this.I00iiI;
/* 2388 */                  if (i8 != 0) {
/* 2390 */                      if (i8 == 1) {
/* 2392 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2395 */                          return obj;
                                }
/* 2400 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 2405 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2412 */                  OolI1lo oolI1loI000o00OoI0I = ((IiIi1o) this.I00iiO).I000o00OoI0I();
/* 2418 */                  Map map = (Map) this.I00iio;
/* 2420 */                  Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 2426 */                  IiIOI1ol0o iiIOI1ol0oI000l1 = oolI1loI000o00OoI0I.I000l1(map, (IOlOo0) this.I00ilI0I1);
/* 2430 */                  this.I00iiI = 1;
/* 2434 */                  Object objI0010o = ((IOi10loi) iiIOI1ol0oI000l1).I0010o(this);
                            return objI0010o == ii0111o3 ? ii0111o3 : objI0010o;
                        case 3:
/* 2327 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 2329 */                  int i9 = this.I00iiI;
/* 2331 */                  if (i9 != 0) {
/* 2333 */                      if (i9 == 1) {
/* 2335 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2338 */                          return obj;
                                }
/* 2343 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 2348 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2367 */                  IiIOI1ol0o iiIOI1ol0oI000II = ((IiIi1o) this.I00iiO).I000o00OoI0I().I000II((IIl0oI) this.I00iio, (Map) this.I00ilI0I1);
/* 2371 */                  this.I00iiI = 1;
/* 2375 */                  Object objI0010o2 = ((IOi10loi) iiIOI1ol0oI000II).I0010o(this);
                            return objI0010o2 == ii0111o4 ? ii0111o4 : objI0010o2;
                        case 4:
/* 2270 */                  Context context = (Context) this.I00iio;
/* 2274 */                  IlI1loI1lO1 ilI1loI1lO1 = (IlI1loI1lO1) this.I00iiO;
/* 2276 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 2278 */                  int i10 = this.I00iiI;
/* 2280 */                  if (i10 == 0) {
/* 2294 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2303 */                      FaceDao faceDaoI001IO000 = BoxChatDatabase.I000l1.I000OiO(context).I001IO000();
/* 2309 */                      String str = (String) this.I00ilI0I1;
/* 2311 */                      this.I00iiI = 1;
/* 2317 */                      if (faceDaoI001IO000.deleteByName(str, this) == ii0111o5) {
/* 2319 */                          return ii0111o5;
                                }
                            } else {
/* 2282 */                      if (i10 != 1) {
/* 2290 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2284 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2321 */                  ilI1loI1lO1.I000OiO(context);
/* 2324 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 2202 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 2204 */                  int i11 = this.I00iiI;
/* 2206 */                  if (i11 != 0) {
/* 2208 */                      if (i11 == 1) {
/* 2210 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2213 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 2218 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 2222 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2227 */                  Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 2231 */                  ArrayList arrayList = new ArrayList();
/* 2238 */                  Oiolio oiolio = ((OI0lOIiOIOOo) this.I00iio).I00000oIO;
/* 2244 */                  IlOi1ilII ilOi1ilII = (IlOi1ilII) this.I00ilI0I1;
/* 2246 */                  I0l0lIoI i0l0lIoI = new I0l0lIoI(i3);
/* 2249 */                  i0l0lIoI.I00iiI = arrayList;
/* 2251 */                  i0l0lIoI.I00iiO = ii0110;
/* 2253 */                  i0l0lIoI.I00iio = ilOi1ilII;
/* 2255 */                  VarHandle.storeStoreFence();
/* 2258 */                  this.I00iiI = 1;
/* 2260 */                  oiolio.getClass();
/* 2263 */                  Oiolio.I000lI(oiolio, i0l0lIoI, this);
/* 2266 */                  return ii0111o6;
                        case 6:
/* 2151 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 2153 */                  int i12 = this.I00iiI;
/* 2155 */                  if (i12 == 0) {
/* 2169 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2174 */                      OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) this.I00iiO;
/* 2178 */                      Ili10looIi0 ili10looIi0 = (Ili10looIi0) this.I00iio;
/* 2180 */                      this.I00iiI = 1;
/* 2186 */                      if (oI0lOIiOIOOo.I00000oIO(ili10looIi0, this) == ii0111o7) {
/* 2188 */                          return ii0111o7;
                                }
                            } else {
/* 2157 */                      if (i12 != 1) {
/* 2165 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2159 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2192 */                  IiiOlIiio iiiOlIiio = (IiiOlIiio) this.I00ilI0I1;
/* 2194 */                  if (iiiOlIiio != null) {
/* 2196 */                      iiiOlIiio.I00000oOI();
                            }
/* 2199 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 2070 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 2072 */                  int i13 = this.I00iiI;
/* 2074 */                  if (i13 == 0) {
/* 2092 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2115 */                      Conversation conversation2 = new Conversation(null, "New Chat", "nano_chat", null, 0L, 0L, 0, null, 249, null);
/* 2122 */                      ConversationDao conversationDaoI001IIilI0O = ((BoxChatDatabase) this.I00iio).I001IIilI0O();
/* 2126 */                      this.I00iiO = conversation2;
/* 2128 */                      this.I00iiI = 1;
/* 2134 */                      if (conversationDaoI001IIilI0O.insert(conversation2, this) == ii0111o8) {
/* 2136 */                          return ii0111o8;
                                }
/* 2138 */                      conversation = conversation2;
                            } else {
/* 2076 */                      if (i13 != 1) {
/* 2088 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2080 */                      conversation = (Conversation) this.I00iiO;
/* 2082 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2141 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 2143 */                  List list = Iloo0ilo.I00000oIO;
/* 2145 */                  oI10i0Il.setValue(conversation);
/* 2148 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 1999 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 2001 */                  int i14 = this.I00iiI;
/* 2003 */                  if (i14 == 0) {
/* 2017 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2024 */                      ConversationDao conversationDaoI001IIilI0O2 = ((BoxChatDatabase) this.I00iiO).I001IIilI0O();
/* 2053 */                      Conversation conversationCopy$default = Conversation.copy$default((Conversation) this.I00iio, null, (String) this.I00ilI0I1, null, null, 0L, 0L, 0, null, 253, null);
/* 2057 */                      this.I00iiI = 1;
/* 2063 */                      if (conversationDaoI001IIilI0O2.update(conversationCopy$default, this) == ii0111o9) {
/* 2065 */                          return ii0111o9;
                                }
                            } else {
/* 2005 */                      if (i14 != 1) {
/* 2013 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2007 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2067 */                  return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 1926 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1928 */                  int i15 = this.I00iiI;
/* 1930 */                  if (i15 == 0) {
/* 1944 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1951 */                      int size = ((Ol1o0O0O0) this.I00iiO).size();
/* 1957 */                      OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 1959 */                      List list2 = Iloo0ilo.I00000oIO;
/* 1976 */                      int i16 = size + (((String) oI10i0Il2.getValue()).length() > 0 ? 1 : 0);
/* 1977 */                      if (i16 > 0) {
/* 1984 */                          this.I00iiI = 1;
/* 1986 */                          IoloOio0I ioloOio0I = O0o0I1i0O.I001iOo1i0O;
/* 1992 */                          if (((O0o0I1i0O) this.I00iio).I0001Ioi1lo(i16 - 1, 0, this) == ii0111o10) {
/* 1994 */                              return ii0111o10;
                                    }
                                }
                            } else {
/* 1932 */                      if (i15 != 1) {
/* 1940 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1934 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1996 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 1849 */                  SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.I00iiO;
/* 1851 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1853 */                  int i17 = this.I00iiI;
/* 1855 */                  if (i17 == 0) {
/* 1875 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1878 */                      IlOil1ii ilOil1iiDownload = speechRecognizer.download();
/* 1882 */                      IlolOO0l0IO0 ilolOO0l0IO0 = IlolOO0l0IO0.I00iiI;
/* 1884 */                      this.I00iiI = 1;
                                break;
                            } else {
/* 1857 */                      if (i17 != 1) {
/* 1859 */                          if (i17 == 2) {
/* 1861 */                              lIoii1l01l0i.I00000oOI(obj);
/* 1923 */                              return OoiIlOl1iI.I00000oIO;
                                    }
/* 1867 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1871 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1895 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iio;
/* 1899 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00ilI0I1;
/* 1903 */                  I0IoiIiOoi i0IoiIiOoi = new I0IoiIiOoi(i);
/* 1906 */                  i0IoiIiOoi.I00iiI = oI10i0Il3;
/* 1908 */                  i0IoiIiOoi.I00iiO = oI10i0Il4;
/* 1910 */                  VarHandle.storeStoreFence();
/* 1913 */                  this.I00iiI = 2;
                            break;
                        case 11:
/* 1785 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1787 */                  int i18 = this.I00iiI;
/* 1789 */                  if (i18 == 0) {
/* 1803 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1816 */                      IlOil1ii ilOil1iiGenerateContentStream = ((IlooOlI) this.I00iiO).I00000oIO.generateContentStream((GenerateContentRequest) this.I00iio);
/* 1824 */                      IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00ilI0I1;
/* 1826 */                      I10OIli10o1 i10OIli10o1 = new I10OIli10o1(i3);
/* 1829 */                      i10OIli10o1.I00iiI = ilOil1iooOO0;
/* 1831 */                      VarHandle.storeStoreFence();
/* 1834 */                      this.I00iiI = 1;
/* 1840 */                      if (ilOil1iiGenerateContentStream.I00000oIO(i10OIli10o1, this) == ii0111o12) {
/* 1842 */                          return ii0111o12;
                                }
                            } else {
/* 1791 */                      if (i18 != 1) {
/* 1799 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1793 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1844 */                  return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 1654 */                  Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 1656 */                  int i19 = this.I00iiI;
                            try {
/* 1658 */                      if (i19 == 0) {
/* 1685 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1691 */                          r2 = (IIIII1OI1) this.I00ilI0I1;
/* 1693 */                          it = r2.iterator();
/* 1697 */                          this.I00iiO = r2;
/* 1699 */                          this.I00iio = it;
/* 1701 */                          this.I00iiI = 1;
/* 1703 */                          objI00000oOI = it.I00000oOI(this);
                                    r2 = r2;
/* 1707 */                          if (objI00000oOI == ii0111o13) {
                                    }
/* 1717 */                          if (((Boolean) objI00000oOI).booleanValue()) {
                                    }
                                } else {
/* 1660 */                          if (i19 != 1) {
/* 1681 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 1664 */                          it = (IIII0iI10) this.I00iio;
/* 1668 */                          OOlloO oOlloO = (OOlloO) this.I00iiO;
/* 1670 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1673 */                          objI00000oOI = obj;
                                    r2 = oOlloO;
/* 1717 */                          if (((Boolean) objI00000oOI).booleanValue()) {
/* 1727 */                              Io0O0Ol.I00000oOI.set(false);
                                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 1735 */                                  OI10IIO oi10iio = Ol1l1lI1Ili.I000OiO.I000O01llI0;
/* 1747 */                                  z = oi10iio != null && oi10iio.I000O01llI0();
                                        }
/* 1749 */                              if (z) {
/* 1751 */                                  Ol1l1lI1Ili.I0000Il00O();
                                        }
/* 1697 */                              this.I00iiO = r2;
/* 1699 */                              this.I00iio = it;
/* 1701 */                              this.I00iiI = 1;
/* 1703 */                              objI00000oOI = it.I00000oOI(this);
                                        r2 = r2;
/* 1707 */                              if (objI00000oOI == ii0111o13) {
/* 1709 */                                  return ii0111o13;
                                        }
/* 1717 */                              if (((Boolean) objI00000oOI).booleanValue()) {
/* 1758 */                                  r2.I000II(null);
/* 1761 */                                  return OoiIlOl1iI.I00000oIO;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
/* 1764 */                          throw th2;
                                } catch (Throwable th3) {
/* 1768 */                          CancellationException cancellationExceptionI00000oIO = th2 instanceof CancellationException ? th2 : null;
/* 1773 */                          if (cancellationExceptionI00000oIO == null) {
/* 1777 */                              cancellationExceptionI00000oIO = ilIiOIi0I.I00000oIO("Channel was consumed, consumer had failed", th2);
                                    }
/* 1781 */                          r2.I000II(cancellationExceptionI00000oIO);
/* 1784 */                          throw th3;
                                }
                            }
                            break;
                        case 13:
/* 1563 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00ilI0I1;
/* 1567 */                  OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iio;
/* 1571 */                  OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiO;
/* 1573 */                  Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 1575 */                  int i20 = this.I00iiI;
/* 1577 */                  if (i20 == 0) {
/* 1591 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1594 */                      List list3 = IoI0lol0i1i.I00000oIO;
/* 1606 */                      if (((String) oI10i0Il6.getValue()).length() == 0) {
/* 1614 */                          oI10i0Il6.setValue((String) olO01l1oOil.getValue());
/* 1651 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 1620 */                      oI10i0Il5.setValue(Boolean.FALSE);
/* 1623 */                      this.I00iiI = 1;
/* 1631 */                      if (il0l1o1l.I00000oOI(250L, this) == ii0111o14) {
/* 1633 */                          return ii0111o14;
                                }
                            } else {
/* 1579 */                      if (i20 != 1) {
/* 1587 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1581 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1635 */                  List list4 = IoI0lol0i1i.I00000oIO;
/* 1643 */                  oI10i0Il6.setValue((String) olO01l1oOil.getValue());
/* 1648 */                  oI10i0Il5.setValue(Boolean.TRUE);
/* 1651 */                  return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 1418 */                  IoO10oI0o ioO10oI0o = (IoO10oI0o) this.I00iio;
/* 1420 */                  OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1422 */                  Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 1424 */                  int i21 = this.I00iiI;
/* 1426 */                  if (i21 == 0) {
/* 1441 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1444 */                      IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 1456 */                      long jI0000O = ilI0IilIOi.I0000O(((Long) this.I00iiO).longValue(), Iio1llolooo.I00iiO);
/* 1460 */                      this.I00iiI = 1;
/* 1466 */                      Object objI00000oOI2 = il0l1o1l.I00000oOI(il0l1o1l.I0000O(jI0000O), this);
/* 1470 */                      if (objI00000oOI2 != ii0111o15) {
/* 1473 */                          objI00000oOI2 = ooiIlOl1iI;
                                }
/* 1474 */                      if (objI00000oOI2 == ii0111o15) {
/* 1476 */                          return ii0111o15;
                                }
                            } else {
/* 1428 */                      if (i21 != 1) {
/* 1436 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1430 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1482 */                  String strI0000Il00O = ioO10oI0o.I00000oIO.I0000Il00O();
/* 1486 */                  IoOO1000I ioOO1000I = IoOO1000I.I00000oIO;
/* 1496 */                  Map map2 = (Map) ioO10oI0o.I0001Ioi1lo.I0000O(IoIloO1OOO.I00000oIO);
/* 1506 */                  IoOOIO ioOOIO = (IoOOIO) (map2 != null ? map2.get(ioOO1000I) : null);
/* 1514 */                  IoO1lOO0l1l ioO1lOO0l1l = new IoO1lOO0l1l(strI0000Il00O, ioOOIO != null ? ioOOIO.I00000oIO : null, null);
/* 1517 */                  O1I1OOiol o1I1OOiol = IoOOIiIl00.I00000oIO;
/* 1523 */                  if (o1I1OOiol.I000II()) {
/* 1541 */                      o1I1OOiol.I000o00OoI0I("Request timeout: " + ioO10oI0o.I00000oIO);
                            }
/* 1556 */                  ((Oliiii0) this.I00ilI0I1).I000II(ilIiOIi0I.I00000oIO(ioO1lOO0l1l.getMessage(), ioO1lOO0l1l));
/* 1559 */                  return ooiIlOl1iI;
                        case 15:
/* 1317 */                  Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 1319 */                  int i22 = this.I00iiI;
/* 1321 */                  if (i22 == 0) {
/* 1335 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1350 */                      if (((IoiII1lloI) ((OI10i0Il) this.I00ilI0I1).getValue()).I000lI) {
/* 1354 */                          Ol1OlloIO ol1OlloIO = (Ol1OlloIO) this.I00iiO;
/* 1358 */                          this.I00iiI = 1;
/* 1366 */                          if (Ol1OlloIO.I00000oOI(ol1OlloIO, "Saved to Pictures/LocalDiffusion", this, 14) == ii0111o16) {
/* 1368 */                              return ii0111o16;
                                    }
                                }
/* 1413 */                      return OoiIlOl1iI.I00000oIO;
                            }
/* 1323 */                  if (i22 != 1) {
/* 1331 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 1325 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1374 */                  OlO0OIIl1 olO0OIIl1 = ((IoiIII) this.I00iio).I00000oOI;
/* 1410 */                  olO0OIIl1.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl1.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, null, false, 0.0f, false, 4095));
/* 1413 */                  return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 1250 */                  IoiIII ioiIII = (IoiIII) this.I00ilI0I1;
/* 1252 */                  Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 1254 */                  int i23 = this.I00iiI;
/* 1256 */                  if (i23 == 0) {
/* 1270 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1290 */                      IlOioIoiI ilOioIoiII00000oIO = ilOo1lI1o10.I00000oIO(((StableDiffusion) this.I00iiO).generateImage((OlIiOOo1O1ll) this.I00iio), new Ii1iii100O1O(ioiIII, z3 ? 1 : 0, i5));
/* 1296 */                      I0oOII1l i0oOII1l = new I0oOII1l(i2);
/* 1299 */                      i0oOII1l.I00iiI = ioiIII;
/* 1301 */                      VarHandle.storeStoreFence();
/* 1304 */                      this.I00iiI = 1;
/* 1310 */                      if (ilOioIoiII00000oIO.I00000oIO(i0oOII1l, this) == ii0111o17) {
/* 1312 */                          return ii0111o17;
                                }
                            } else {
/* 1258 */                      if (i23 != 1) {
/* 1266 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1260 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1314 */                  return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 1188 */                  Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 1190 */                  int i24 = this.I00iiI;
/* 1192 */                  if (i24 == 0) {
/* 1208 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1217 */                      IlOil1ii data = ((O00lOo) this.I00iiO).I0000Il00O.getData();
/* 1221 */                      this.I00iiI = 1;
/* 1223 */                      objI0000Il00O = ilOoO00.I0000Il00O(data, this);
/* 1227 */                      if (objI0000Il00O == ii0111o18) {
/* 1229 */                          return ii0111o18;
                                }
                            } else {
/* 1194 */                      if (i24 != 1) {
/* 1204 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1196 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1199 */                      objI0000Il00O = obj;
                            }
/* 1231 */                  OI0ooi10l oI0ooi10l = (OI0ooi10l) objI0000Il00O;
                            return (oI0ooi10l == null || (objI0000Il00O2 = oI0ooi10l.I0000Il00O((OOI0IO111Ii) this.I00iio)) == null) ? this.I00ilI0I1 : objI0000Il00O2;
                        case PoseLandmark.RIGHT_PINKY:
/* 1100 */                  O0lOll0I0o00 o0lOll0I0o00 = (O0lOll0I0o00) this.I00iiO;
/* 1102 */                  OIooliIO0 oIooliIO0 = o0lOll0I0o00.I000OiO;
/* 1104 */                  Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 1106 */                  int i25 = this.I00iiI;
                            try {
/* 1108 */                      if (i25 == 0) {
/* 1124 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1127 */                          I10i01 i10i01 = o0lOll0I0o00.I00100o1O0lo;
/* 1132 */                          Float f = new Float(0.0f);
/* 1137 */                          IlIoO1ilo1 ilIoO1ilo1 = (IlIoO1ilo1) this.I00iio;
/* 1141 */                          Io10IOI io10IOI = (Io10IOI) this.I00ilI0I1;
/* 1145 */                          O0lOli0IIoo o0lOli0IIoo = new O0lOli0IIoo(i5);
/* 1148 */                          o0lOli0IIoo.I00iiI = io10IOI;
/* 1150 */                          o0lOli0IIoo.I00iiO = o0lOll0I0o00;
/* 1152 */                          VarHandle.storeStoreFence();
/* 1155 */                          this.I00iiI = 1;
/* 1163 */                          if (I10i01.I00000oIO(i10i01, f, ilIoO1ilo1, null, o0lOli0IIoo, this, 4) == ii0111o19) {
/* 1165 */                              return ii0111o19;
                                    }
                                } else {
/* 1110 */                          if (i25 != 1) {
/* 1120 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 1112 */                          lIoii1l01l0i.I00000oOI(obj);
                                }
/* 1171 */                      o0lOll0I0o00.I000iOII.setValue(Boolean.TRUE);
/* 1176 */                      oIooliIO0.setValue(Boolean.FALSE);
/* 1179 */                      return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th4) {
/* 1184 */                      oIooliIO0.setValue(Boolean.FALSE);
/* 1187 */                      throw th4;
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 1038 */                  IIiOOI iIiOOI = (IIiOOI) this.I00iio;
/* 1040 */                  Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 1042 */                  int i26 = this.I00iiI;
                            try {
/* 1044 */                      if (i26 == 0) {
/* 1062 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1067 */                          Ii0110 ii01102 = (Ii0110) this.I00iiO;
/* 1071 */                          IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00ilI0I1;
/* 1073 */                          this.I00iiI = 1;
/* 1075 */                          objInvoke = illiIl1l11O.invoke(ii01102, this);
/* 1079 */                          if (objInvoke == ii0111o20) {
/* 1081 */                              return ii0111o20;
                                    }
                                } else {
/* 1046 */                          if (i26 != 1) {
/* 1058 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 1048 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1051 */                          objInvoke = obj;
                                }
/* 1083 */                      iIiOOI.I00000oOI(objInvoke);
                            } catch (CancellationException unused) {
/* 1091 */                      iIiOOI.I0000Il00O();
                            } catch (Throwable th5) {
/* 1087 */                      iIiOOI.I0000O(th5);
                            }
/* 1094 */                  return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 980 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 982 */                   int i27 = this.I00iiI;
/* 984 */                   if (i27 == 0) {
/* 1000 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1005 */                      IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00ilI0I1;
/* 1011 */                      Object obj3 = ((OOo0ooi) this.I00iiO).I00iOIl;
/* 1013 */                      this.I00iiI = 1;
/* 1015 */                      objInvoke2 = illiIl1l11O2.invoke(obj3, this);
/* 1019 */                      if (objInvoke2 == ii0111o21) {
/* 1021 */                          return ii0111o21;
                                }
                            } else {
/* 986 */                       if (i27 != 1) {
/* 996 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 988 */                       lIoii1l01l0i.I00000oOI(obj);
/* 991 */                       objInvoke2 = obj;
                            }
/* 1029 */                  ((O11Il0) this.I00iio).invoke((String) objInvoke2);
/* 1032 */                  return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 864 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 868 */                   O11iO00I1o o11iO00I1o = (O11iO00I1o) this.I00iiO;
/* 870 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 872 */                   int i28 = this.I00iiI;
                            try {
                            } catch (Exception e2) {
/* 975 */                       Log.e("AGLlmChatViewModel", "Failed to persist system prompt", e2);
                            }
/* 874 */                   if (i28 == 0) {
/* 899 */                       lIoii1l01l0i.I00000oOI(obj);
/* 902 */                       IO1loOo1o iO1loOo1oI00100l0 = o11iO00I1o.I00100l0();
/* 908 */                       String str2 = (String) this.I00iio;
/* 910 */                       this.I00iiI = 1;
/* 914 */                       conversationById = iO1loOo1oI00100l0.I00000oIO.getConversationById(str2, this);
/* 918 */                       if (conversationById == ii0111o22) {
                                }
/* 969 */                       return ii0111o22;
                            }
/* 876 */                   if (i28 != 1) {
/* 878 */                       if (i28 == 2) {
/* 880 */                           lIoii1l01l0i.I00000oOI(obj);
/* 883 */                           return ooiIlOl1iI2;
                                }
/* 889 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 893 */                   lIoii1l01l0i.I00000oOI(obj);
/* 896 */                   conversationById = obj;
/* 922 */                   Conversation conversation3 = (Conversation) conversationById;
/* 924 */                   if (conversation3 != null) {
/* 927 */                       IO1loOo1o iO1loOo1oI00100l02 = o11iO00I1o.I00100l0();
/* 951 */                       Conversation conversationCopy$default2 = Conversation.copy$default(conversation3, null, null, null, null, 0L, 0L, 0, (String) this.I00ilI0I1, 127, null);
/* 955 */                       this.I00iiI = 2;
/* 959 */                       Object objUpdate = iO1loOo1oI00100l02.I00000oIO.update(conversationCopy$default2, this);
/* 963 */                       if (objUpdate != ii0111o22) {
/* 966 */                           objUpdate = ooiIlOl1iI2;
                                    break;
                                }
                            }
/* 883 */                   return ooiIlOl1iI2;
                        case PoseLandmark.RIGHT_THUMB:
/* 816 */                   Ii0111o ii0111o23 = Ii0111o.I00iOIl;
/* 818 */                   int i29 = this.I00iiI;
/* 820 */                   if (i29 == 0) {
/* 834 */                       lIoii1l01l0i.I00000oOI(obj);
/* 841 */                       O1iOiio1OI o1iOiio1OI = ((O1iOlOIiO) this.I00iiO).I00000oIO;
/* 845 */                       Uri uri = (Uri) this.I00iio;
/* 849 */                       InputEvent inputEvent = (InputEvent) this.I00ilI0I1;
/* 851 */                       this.I00iiI = 1;
/* 857 */                       if (o1iOiio1OI.I0001Ioi1lo(uri, inputEvent, this) == ii0111o23) {
/* 859 */                           return ii0111o23;
                                }
                            } else {
/* 822 */                       if (i29 != 1) {
/* 830 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 824 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 861 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 755 */                   Ii0111o ii0111o24 = Ii0111o.I00iOIl;
/* 757 */                   int i30 = this.I00iiI;
/* 759 */                   if (i30 == 0) {
/* 773 */                       lIoii1l01l0i.I00000oOI(obj);
                                try {
/* 784 */                           oIoi0IIoiI0001Ioi1lo = l1O0o1.I0001Ioi1lo((Context) this.I00iiO, (Uri) this.I00iio);
                                } catch (Exception unused2) {
/* 789 */                           oIoi0IIoiI0001Ioi1lo = null;
                                }
/* 790 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 792 */                       Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 800 */                       O00lOIIO o00lOIIO = new O00lOIIO(oIoi0IIoiI0001Ioi1lo, (OI10i0Il) this.I00ilI0I1, z4 ? 1 : 0, c);
/* 803 */                       this.I00iiI = 1;
/* 809 */                       if (iOi1II01i0.I0000oI00(io11l1li, o00lOIIO, this) == ii0111o24) {
/* 811 */                           return ii0111o24;
                                }
                            } else {
/* 761 */                       if (i30 != 1) {
/* 769 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 763 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 813 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 592 */                   OoiIlOl1iI ooiIlOl1iI3 = OoiIlOl1iI.I00000oIO;
/* 598 */                   OlO0OIIl1 olO0OIIl12 = ((O1loIO) this.I00iiO).I00000oOI;
/* 600 */                   Ii0111o ii0111o25 = Ii0111o.I00iOIl;
/* 602 */                   int i31 = this.I00iiI;
/* 604 */                   if (i31 == 0) {
/* 621 */                       lIoii1l01l0i.I00000oOI(obj);
/* 626 */                       Context context2 = (Context) this.I00iio;
/* 630 */                       Uri uri2 = (Uri) this.I00ilI0I1;
/* 632 */                       this.I00iiI = 1;
/* 634 */                       IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 643 */                       objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0lo01(context2, uri2, z5 ? 1 : 0, i3), this);
/* 647 */                       if (objI0000oI00 == ii0111o25) {
/* 649 */                           return ii0111o25;
                                }
                            } else {
/* 606 */                       if (i31 != 1) {
/* 616 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 608 */                       lIoii1l01l0i.I00000oOI(obj);
/* 611 */                       objI0000oI00 = obj;
                            }
/* 651 */                   Bitmap bitmap = (Bitmap) objI0000oI00;
/* 653 */                   if (bitmap == null) {
/* 679 */                       olO0OIIl12.I000lI(null, O1loIIIOiO.I00000oIO((O1loIIIOiO) olO0OIIl12.getValue(), null, null, 0, null, 0.0f, false, "Couldn't read that image", false, 191));
                            } else {
/* 692 */                       int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
/* 714 */                       Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin), Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A, true);
/* 723 */                       O1loIIIOiO o1loIIIOiO = (O1loIIIOiO) olO0OIIl12.getValue();
/* 727 */                       Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A, Bitmap.Config.ARGB_8888);
/* 732 */                       bitmapCreateBitmap.eraseColor(-1);
/* 750 */                       olO0OIIl12.I000lI(null, O1loIIIOiO.I00000oIO(o1loIIIOiO, bitmapCreateScaledBitmap, bitmapCreateBitmap, 0, null, 0.0f, false, null, false, 48));
                            }
/* 682 */                   return ooiIlOl1iI3;
                        case PoseLandmark.LEFT_KNEE:
/* 486 */                   O1o1io0oi0ol o1o1io0oi0ol = (O1o1io0oi0ol) this.I00iiO;
/* 488 */                   Ii0111o ii0111o26 = Ii0111o.I00iOIl;
/* 490 */                   int i32 = this.I00iiI;
/* 492 */                   if (i32 == 0) {
/* 508 */                       lIoii1l01l0i.I00000oOI(obj);
/* 513 */                       Context context3 = (Context) this.I00iio;
/* 517 */                       Uri uri3 = (Uri) this.I00ilI0I1;
/* 519 */                       this.I00iiI = 1;
/* 521 */                       IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 530 */                       objI0000oI002 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0lo01(context3, uri3, z6 ? 1 : 0, i2), this);
/* 534 */                       if (objI0000oI002 == ii0111o26) {
/* 536 */                           return ii0111o26;
                                }
                            } else {
/* 494 */                       if (i32 != 1) {
/* 504 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 496 */                       lIoii1l01l0i.I00000oOI(obj);
/* 499 */                       objI0000oI002 = obj;
                            }
/* 539 */                   Bitmap bitmap2 = (Bitmap) objI0000oI002;
/* 541 */                   OlO0OIIl1 olO0OIIl13 = o1o1io0oi0ol.I00000oOI;
/* 579 */                   O1o1iOlI1 o1o1iOlI1I00000oIO = bitmap2 != null ? O1o1iOlI1.I00000oIO((O1o1iOlI1) olO0OIIl13.getValue(), bitmap2, Il01100l.I00iOIl, null, false, null, 12) : O1o1iOlI1.I00000oIO((O1o1iOlI1) olO0OIIl13.getValue(), null, null, null, false, "Couldn't read that image", 15);
/* 583 */                   olO0OIIl13.getClass();
/* 586 */                   olO0OIIl13.I000lI(null, o1o1iOlI1I00000oIO);
/* 589 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 410 */                   i01lO11OIl0o i01lo11oil0o2 = (i01lO11OIl0o) this.I00iiO;
/* 412 */                   Ii0111o ii0111o27 = Ii0111o.I00iOIl;
/* 414 */                   int i33 = this.I00iiI;
/* 416 */                   if (i33 == 0) {
/* 436 */                       lIoii1l01l0i.I00000oOI(obj);
/* 442 */                       IIOIIi10OOl iIOIIi10OOl = (IIOIIi10OOl) this.I00iio;
/* 446 */                       Ii01oI01 ii01oI01 = (Ii01oI01) this.I00ilI0I1;
/* 448 */                       IIOIlI01 iIOIlI012 = i01lo11oil0o2.I00iOIl;
/* 450 */                       this.I00iiO = i01lo11oil0o2;
/* 452 */                       this.I00iiI = 1;
/* 454 */                       IIOIIi10OOl iIOIIi10OOl2 = OI0iiO1i1.I00000oIO;
/* 462 */                       if (iOiOOIlI1o01.I000oI1ioi(ii01oI01, iIOIIi10OOl, iIOIlI012, 8193L, this) != ii0111o27) {
                                }
/* 479 */                       return ii0111o27;
                            }
/* 418 */                   if (i33 != 1) {
/* 420 */                       if (i33 == 2) {
/* 422 */                           lIoii1l01l0i.I00000oOI(obj);
/* 481 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 428 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 432 */                   lIoii1l01l0i.I00000oOI(obj);
/* 465 */                   IIOIlI01 iIOIlI013 = i01lo11oil0o2.I00iOIl;
/* 467 */                   this.I00iiO = null;
/* 469 */                   this.I00iiI = 2;
                            break;
                        case 27:
/* 318 */                   OoiIlOl1iI ooiIlOl1iI4 = OoiIlOl1iI.I00000oIO;
/* 322 */                   OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) this.I00iiO;
/* 324 */                   Ii0111o ii0111o28 = Ii0111o.I00iOIl;
/* 326 */                   int i34 = this.I00iiI;
/* 328 */                   if (i34 == 0) {
/* 343 */                       lIoii1l01l0i.I00000oOI(obj);
/* 348 */                       OI1lIoiiOIo1 oI1lIoiiOIo1 = new OI1lIoiiOIo1(i4);
/* 351 */                       oI1lIoiiOIo1.I00iiI = ooI1Oi0l1I0o;
/* 353 */                       VarHandle.storeStoreFence();
/* 356 */                       Ii1Io1loiI ii1Io1loiII0000Il00O = lOIoiooI1i01.I0000Il00O(oI1lIoiiOIo1);
/* 364 */                       Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iio;
/* 368 */                       OI0o0olO1 oI0o0olO1 = (OI0o0olO1) this.I00ilI0I1;
/* 371 */                       I0l0lIoI i0l0lIoI2 = new I0l0lIoI(5);
/* 374 */                       i0l0lIoI2.I00iiI = ooI1Oi0l1I0o;
/* 376 */                       i0l0lIoI2.I00iiO = ol1o1llOII;
/* 378 */                       i0l0lIoI2.I00iio = oI0o0olO1;
/* 380 */                       VarHandle.storeStoreFence();
/* 383 */                       this.I00iiI = 1;
/* 387 */                       I10OIli10o1 i10OIli10o12 = new I10OIli10o1(i2);
/* 390 */                       i10OIli10o12.I00iiI = i0l0lIoI2;
/* 392 */                       VarHandle.storeStoreFence();
/* 395 */                       Object objI00000oIO = ii1Io1loiII0000Il00O.I00000oIO(i10OIli10o12, this);
/* 399 */                       if (objI00000oIO != ii0111o28) {
/* 402 */                           objI00000oIO = ooiIlOl1iI4;
                                }
/* 403 */                       if (objI00000oIO == ii0111o28) {
/* 405 */                           return ii0111o28;
                                }
                            } else {
/* 330 */                       if (i34 != 1) {
/* 339 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 332 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 335 */                   return ooiIlOl1iI4;
                        case PoseLandmark.RIGHT_ANKLE:
/* 313 */                   return I00000oIO(obj);
                        default:
/* 17 */                    Ii0111o ii0111o29 = Ii0111o.I00iOIl;
/* 19 */                    int i35 = this.I00iiI;
/* 21 */                    if (i35 == 0) {
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 42 */                        OOIoOo0O oOIoOo0O = (OOIoOo0O) this.I00iiO;
/* 48 */                        NetworkRequest networkRequestI00000oIO = ((IOo0o10i1IO) this.I00iio).I00000oIO();
/* 52 */                        int i36 = 11;
/* 54 */                        if (networkRequestI00000oIO == null) {
/* 60 */                            OIIOlI oIIOlI = ((IOo0o10i1IO) this.I00iio).I00000oIO;
/* 64 */                            if (oIIOlI == OIIOlI.I00iOIl) {
/* 66 */                                networkRequestI00000oIO = null;
                                    } else {
/* 91 */                                NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
/* 97 */                                if (oIIOlI == OIIOlI.I00ilO0) {
/* 105 */                                   networkRequestBuild = builderRemoveCapability.addCapability(25).build();
                                        } else {
/* 111 */                                   int iOrdinal = oIIOlI.ordinal();
/* 115 */                                   if (iOrdinal == 2) {
/* 134 */                                       builderRemoveCapability = builderRemoveCapability.addCapability(11);
                                            } else if (iOrdinal == 3) {
/* 129 */                                       builderRemoveCapability = builderRemoveCapability.addCapability(18);
                                            } else if (iOrdinal == 4) {
/* 122 */                                       builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                                            }
/* 138 */                                   networkRequestBuild = builderRemoveCapability.build();
                                        }
/* 109 */                               networkRequestI00000oIO = networkRequestBuild;
                                    }
                                }
/* 143 */                       if (networkRequestI00000oIO == null) {
/* 145 */                           OOIoO0IIOO0 oOIoO0IIOO0 = (OOIoO0IIOO0) oOIoOo0O;
/* 147 */                           oOIoO0IIOO0.getClass();
/* 150 */                           oOIoO0IIOO0.I0001Ioi1lo(null);
/* 153 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 167 */                       OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(oOIoOo0O, null, null, new O1iIlllIoo((OIIOiO00i1i) this.I00ilI0I1, oOIoOo0O, z7 ? 1 : 0, 6), 3);
/* 173 */                       O1lIIi o1lIIi = new O1lIIi(i36);
/* 176 */                       o1lIIi.I00iiI = olIl0iI0000O;
/* 178 */                       o1lIIi.I00iiO = oOIoOo0O;
/* 180 */                       VarHandle.storeStoreFence();
/* 183 */                       Oiolol0ii1 oiolol0ii1 = Oiolol0ii1.I00000oIO;
/* 189 */                       ConnectivityManager connectivityManager = ((OIIOiO00i1i) this.I00ilI0I1).I00000oIO;
/* 191 */                       oiolol0ii1.getClass();
                                synchronized (Oiolol0ii1.I00000oOI) {
                                    try {
/* 197 */                               LinkedHashMap linkedHashMap = Oiolol0ii1.I0000Il00O;
/* 199 */                               boolean zIsEmpty = linkedHashMap.isEmpty();
/* 203 */                               linkedHashMap.put(o1lIIi, networkRequestI00000oIO);
/* 206 */                               if (zIsEmpty) {
/* 208 */                                   IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 212 */                                   int i37 = i01I01lIOo.I00000oIO;
/* 214 */                                   iIi0oIlI000II.getClass();
/* 217 */                                   connectivityManager.registerDefaultNetworkCallback(oiolol0ii1);
                                        } else if (Oiolol0ii1.I0000oI00 && Oiolol0ii1.I0001Ioi1lo != null) {
/* 231 */                                   IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 235 */                                   int i38 = i01I01lIOo.I00000oIO;
/* 237 */                                   iIi0oIlI000II2.getClass();
/* 240 */                                   NetworkCapabilities networkCapabilities = Oiolol0ii1.I0000O;
/* 248 */                                   if (!Oiolol0ii1.I0001Ioi1lo.booleanValue() && networkRequestI00000oIO.canBeSatisfiedBy(networkCapabilities)) {
/* 256 */                                       i4 = 1;
                                            }
/* 268 */                                   o1lIIi.invoke(i4 != 0 ? IOo0oo1oo1OI.I00000oIO : new IOo0oooliOI0(7));
                                        }
                                    } catch (Throwable th6) {
/* 312 */                               throw th6;
                                    }
                                }
/* 276 */                       O1l110o o1l110o = new O1l110o(22);
/* 279 */                       o1l110o.I00iiI = o1lIIi;
/* 281 */                       o1l110o.I00iiO = connectivityManager;
/* 283 */                       VarHandle.storeStoreFence();
/* 290 */                       IlIi0Il ilIi0Il = new IlIi0Il(27);
/* 293 */                       ilIi0Il.I00iiI = o1l110o;
/* 295 */                       VarHandle.storeStoreFence();
/* 298 */                       this.I00iiI = 1;
/* 304 */                       if (lIIl0IOilo0.I00000oIO(oOIoOo0O, ilIi0Il, this) == ii0111o29) {
/* 306 */                           return ii0111o29;
                                }
                            } else {
/* 23 */                        if (i35 != 1) {
/* 32 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 25 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 308 */                   return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public IiI110i1O(IiIi1o iiIi1o, IOoil1iiIilo iOoil1iiIilo, IIl0oI iIl0oI, Map map) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 3;
/* 16 */            this.I00iiO = iiIi1o;
                    this.I00iio = iIl0oI;
                    this.I00ilI0I1 = map;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public IiI110i1O(IIIII1OI1 iiiii1oi1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 12;
/* 17 */            this.I00ilI0I1 = iiiii1oi1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public IiI110i1O(IlliIl1l11O illiIl1l11O, IIiOOI iIiOOI, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 19;
/* 18 */            this.I00ilI0I1 = illiIl1l11O;
                    this.I00iio = iIiOOI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public IiI110i1O(IlliIl1l11O illiIl1l11O, OOo0ooi oOo0ooi, O11Il0 o11Il0, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 20;
/* 19 */            this.I00ilI0I1 = illiIl1l11O;
                    this.I00iiO = oOo0ooi;
                    this.I00iio = o11Il0;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public IiI110i1O(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 20 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public IiI110i1O(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                    this.I00ilI0I1 = obj3;
                }
            }
