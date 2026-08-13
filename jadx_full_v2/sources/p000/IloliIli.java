            package p000;

            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizerRequestKt;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IloliIli extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final SpeechRecognizer I00iiI;
                public final OI10i0Il I00iiO;
                public final OI10i0Il I00iio;
                public final OI10i0Il I00ilI0I1;
                public final OI10i0Il I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IloliIli(SpeechRecognizer speechRecognizer, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, OI10i0Il oI10i0Il4, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = speechRecognizer;
/* 3 */             this.I00iiO = oI10i0Il;
/* 5 */             this.I00iio = oI10i0Il2;
/* 7 */             this.I00ilI0I1 = oI10i0Il3;
/* 9 */             this.I00ilO0 = oI10i0Il4;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            return new IloliIli(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IloliIli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OI10i0Il oI10i0Il = this.I00ilO0;
/* 7 */             OI10i0Il oI10i0Il2 = this.I00ilI0I1;
                    try {
/* 10 */                if (i == 0) {
/* 27 */                    lIoii1l01l0i.I00000oOI(obj);
/* 43 */                    IlOil1ii ilOil1iiStartRecognition = this.I00iiI.startRecognition(SpeechRecognizerRequestKt.speechRecognizerRequest(new Ilo10O1IlOl(25)));
/* 49 */                    OI10i0Il oI10i0Il3 = this.I00iiO;
/* 51 */                    OI10i0Il oI10i0Il4 = this.I00iio;
/* 53 */                    Iloli0oI1iIO iloli0oI1iIO = new Iloli0oI1iIO();
/* 56 */                    iloli0oI1iIO.I00iOIl = oI10i0Il3;
/* 58 */                    iloli0oI1iIO.I00iiI = oI10i0Il4;
/* 60 */                    iloli0oI1iIO.I00iiO = oI10i0Il2;
/* 62 */                    iloli0oI1iIO.I00iio = oI10i0Il;
/* 64 */                    VarHandle.storeStoreFence();
/* 67 */                    this.I00iOIl = 1;
/* 73 */                    if (ilOil1iiStartRecognition.I00000oIO(iloli0oI1iIO, this) == ii0111o) {
/* 75 */                        return ii0111o;
                            }
                        } else {
/* 12 */                    if (i != 1) {
/* 22 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 25 */                        return null;
                            }
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
                    } catch (Exception e) {
/* 82 */                String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("Error: ", e.getMessage());
/* 86 */                List list = Iloo0ilo.I00000oIO;
/* 88 */                oI10i0Il.setValue(strI000o00OoI0I);
/* 99 */                IIlIOloOOO.I001iOo1i0O("speech recognition error: ", e.getMessage(), "GeminiNanoHub");
/* 104 */               oI10i0Il2.setValue(Boolean.FALSE);
                    }
/* 107 */           return OoiIlOl1iI.I00000oIO;
                }
            }
