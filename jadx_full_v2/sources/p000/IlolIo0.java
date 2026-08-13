            package p000;

            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.rewriting.Rewriter;
            import com.google.mlkit.genai.rewriting.RewritingRequest;
            import com.google.mlkit.genai.rewriting.RewritingResult;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IlolIo0 extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final Rewriter I00iiI;
                public final Ii0110 I00iiO;
                public final OI10i0Il I00iio;
                public final OI10i0Il I00ilI0I1;
                public final OI10i0Il I00ilO0;
                public final Ol1OlloIO I00io1l;
                public final OI10i0Il I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlolIo0(Rewriter rewriter, Ii0110 ii0110, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, Ol1OlloIO ol1OlloIO, OI10i0Il oI10i0Il4, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = rewriter;
/* 3 */             this.I00iiO = ii0110;
/* 5 */             this.I00iio = oI10i0Il;
/* 7 */             this.I00ilI0I1 = oI10i0Il2;
/* 9 */             this.I00ilO0 = oI10i0Il3;
/* 11 */            this.I00io1l = ol1OlloIO;
/* 13 */            this.I00ioIO = oI10i0Il4;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            return new IlolIo0(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IlolIo0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
                
                    if (r4 == r0) goto L27;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    String message;
                    Object objI00IoIO0lI;
                    Object objI00000oIO;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00iOIl;
/* 12 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 14 */            OI10i0Il oI10i0Il = this.I00iio;
/* 16 */            OI10i0Il oI10i0Il2 = this.I00ilI0I1;
/* 18 */            Rewriter rewriter = this.I00iiI;
/* 20 */            OI10i0Il oI10i0Il3 = this.I00ioIO;
                    try {
                        try {
                        } catch (Exception e) {
/* 188 */                   String message2 = e.getMessage();
/* 193 */                   if ((message2 == null || !OlOoOIi0o.I000oI1ioi(message2, "DOWNLOAD_ERROR", false)) && ((message = e.getMessage()) == null || !OlOoOIi0o.I000oI1ioi(message, "Task was cancelled", false))) {
/* 246 */                       String str = "Error: " + e.getMessage();
/* 250 */                       List list = Iloo0ilo.I00000oIO;
/* 252 */                       oI10i0Il2.setValue(str);
                            } else {
/* 230 */                       iOi1II01i0.I0000O(this.I00iiO, null, null, new IO1lI1l0Oi(this.I00io1l, null, 8), 3);
                            }
/* 273 */                   Log.e("GeminiNanoHub", "rewrite error: " + e.getMessage());
/* 276 */                   List list2 = Iloo0ilo.I00000oIO;
                        }
/* 25 */                if (i == 0) {
/* 55 */                    lIoii1l01l0i.I00000oOI(obj);
/* 61 */                    IIl00I iIl00I = new IIl00I(rewriter, null, 6);
/* 66 */                    IloiI0Io iloiI0Io = new IloiI0Io(1);
/* 69 */                    iloiI0Io.I00iiI = rewriter;
/* 71 */                    VarHandle.storeStoreFence();
/* 78 */                    IlI0iIl011 ilI0iIl011 = new IlI0iIl011(24);
/* 81 */                    ilI0iIl011.I00iiI = oI10i0Il;
/* 83 */                    VarHandle.storeStoreFence();
/* 86 */                    this.I00iOIl = 1;
/* 88 */                    objI00IoIO0lI = Iloo0ilo.I00IoIO0lI(iIl00I, iloiI0Io, ilI0iIl011, this);
/* 92 */                    if (objI00IoIO0lI == ii0111o) {
                            }
/* 146 */                   return ii0111o;
                        }
/* 27 */                if (i != 1) {
/* 29 */                    if (i != 2) {
/* 45 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 22 */                        return null;
                            }
/* 31 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    objI00000oIO = obj;
/* 151 */                   Integer num = new Integer(3);
/* 154 */                   List list3 = Iloo0ilo.I00000oIO;
/* 156 */                   oI10i0Il.setValue(num);
/* 184 */                   oI10i0Il2.setValue(IOOi0Ool1i.I00IlilI0i0i(((RewritingResult) objI00000oIO).getResults(), "\n\n", null, null, new Ilo10O1IlOl(23), 30));
/* 112 */                   oI10i0Il3.setValue(Boolean.FALSE);
/* 115 */                   return ooiIlOl1iI;
                        }
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 52 */                objI00IoIO0lI = obj;
/* 101 */               if (!((Boolean) objI00IoIO0lI).booleanValue()) {
/* 105 */                   List list4 = Iloo0ilo.I00000oIO;
/* 107 */                   oI10i0Il2.setValue("Feature unavailable on this device.");
/* 112 */                   oI10i0Il3.setValue(Boolean.FALSE);
/* 115 */                   return ooiIlOl1iI;
                        }
/* 116 */               OI10i0Il oI10i0Il4 = this.I00ilO0;
/* 118 */               List list5 = Iloo0ilo.I00000oIO;
/* 134 */               ListenableFuture listenableFutureRunInference = rewriter.runInference(RewritingRequest.builder((String) oI10i0Il4.getValue()).build());
/* 138 */               this.I00iOIl = 2;
/* 140 */               objI00000oIO = l10o1ollO.I00000oIO(listenableFutureRunInference, this);
                    } catch (Throwable th) {
/* 280 */               List list6 = Iloo0ilo.I00000oIO;
/* 284 */               oI10i0Il3.setValue(Boolean.FALSE);
/* 437 */               throw th;
                    }
                }
            }
