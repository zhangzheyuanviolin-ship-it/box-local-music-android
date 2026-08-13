            package p000;

            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.prompt.Candidate;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerateContentResponse;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            
            public final class o10IO0i extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final GenerateContentRequest I00iiO;
                public final o11i11l1oll I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o10IO0i(GenerateContentRequest generateContentRequest, o11i11l1oll o11i11l1ollVar, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = generateContentRequest;
/* 3 */             this.I00iio = o11i11l1ollVar;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             o10IO0i o10io0i = new o10IO0i(this.I00iiO, this.I00iio, iOoil1iiIilo);
/* 10 */            o10io0i.I00iiI = obj;
/* 37 */            return o10io0i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((o10IO0i) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:5:0x000b, B:15:0x003b, B:17:0x004e, B:19:0x0054, B:20:0x0058, B:22:0x0071, B:23:0x0078, B:24:0x0085), top: B:33:0x000b }] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:5:0x000b, B:15:0x003b, B:17:0x004e, B:19:0x0054, B:20:0x0058, B:22:0x0071, B:23:0x0078, B:24:0x0085), top: B:33:0x000b }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Exception e;
                    OOIoOo0O oOIoOo0O;
                    Candidate candidate;
                    int iIntValue;
                    Object objI00000oIO;
                    Integer zzb;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 6 */             if (this.I00iOIl != 0) {
/* 10 */                oOIoOo0O = (OOIoOo0O) this.I00iiI;
                        try {
/* 12 */                    lIoii1l01l0i.I00000oOI(obj);
/* 73 */                    candidate = (Candidate) IOOi0Ool1i.I00II0oii1o(0, ((GenerateContentResponse) obj).getCandidates());
/* 75 */                    iIntValue = -100;
/* 77 */                    if (candidate != null && (zzb = candidate.getZzb()) != null) {
/* 85 */                        iIntValue = zzb.intValue();
                            }
/* 106 */                   objI00000oIO = iOlI0o0II.I00000oIO(oOIoOo0O, GenerateContentResponse.Companion.zza(Collections.singletonList(Candidate.Companion.zza("", new Integer(iIntValue)))));
/* 112 */                   if (!(objI00000oIO instanceof IO10l0l0)) {
/* 134 */                       throw new GenAiException("Failed to send the final result to Flow", IO10lIoiO.I00000oOI((IO10l0l0) objI00000oIO), 0);
                            }
/* 117 */                   ((OOIoO0IIOO0) oOIoOo0O).I0001Ioi1lo(null);
                        } catch (Exception e2) {
/* 16 */                    e = e2;
/* 142 */                   ((OOIoO0IIOO0) oOIoOo0O).I0001Ioi1lo(e);
/* 145 */                   return OoiIlOl1iI.I00000oIO;
                        }
                    } else {
/* 19 */                lIoii1l01l0i.I00000oOI(obj);
/* 24 */                OOIoOo0O oOIoOo0O2 = (OOIoOo0O) this.I00iiI;
/* 26 */                GenerateContentRequest generateContentRequest = this.I00iiO;
/* 33 */                if (generateContentRequest.getZzd() > 1) {
/* 150 */                   I000II.I000iOII("generateContentStream currently only supports candidateCount of 1. For streaming with multiple candidates, please use the generateContent method with StreamingCallback.");
/* 5 */                     return null;
                        }
/* 37 */                o10I0lO1 o10i0lo1 = new o10I0lO1();
/* 40 */                o10i0lo1.I00000oIO = oOIoOo0O2;
/* 42 */                VarHandle.storeStoreFence();
                        try {
/* 45 */                    o11i11l1oll o11i11l1ollVar = this.I00iio;
/* 47 */                    this.I00iiI = oOIoOo0O2;
/* 49 */                    this.I00iOIl = 1;
/* 51 */                    Object objInvoke = o11i11l1ollVar.invoke(generateContentRequest, o10i0lo1, this);
/* 55 */                    if (objInvoke == ii0111o) {
/* 135 */                       return ii0111o;
                            }
/* 58 */                    obj = objInvoke;
/* 59 */                    oOIoOo0O = oOIoOo0O2;
/* 73 */                    candidate = (Candidate) IOOi0Ool1i.I00II0oii1o(0, ((GenerateContentResponse) obj).getCandidates());
/* 75 */                    iIntValue = -100;
/* 77 */                    if (candidate != null) {
/* 85 */                        iIntValue = zzb.intValue();
                            }
/* 106 */                   objI00000oIO = iOlI0o0II.I00000oIO(oOIoOo0O, GenerateContentResponse.Companion.zza(Collections.singletonList(Candidate.Companion.zza("", new Integer(iIntValue)))));
/* 112 */                   if (!(objI00000oIO instanceof IO10l0l0)) {
                            }
                        } catch (Exception e3) {
/* 138 */                   e = e3;
/* 139 */                   oOIoOo0O = oOIoOo0O2;
/* 142 */                   ((OOIoO0IIOO0) oOIoOo0O).I0001Ioi1lo(e);
/* 145 */                   return OoiIlOl1iI.I00000oIO;
                        }
                    }
/* 145 */           return OoiIlOl1iI.I00000oIO;
                }
            }
