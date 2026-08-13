            package com.google.mlkit.genai.speechrecognition;

            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizerResponse;
            import kotlin.jvm.functions.Function3;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1iooOO0;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzl extends Oll0io implements Function3 {
                int zza;
                Object zzb;
                private Object zzc;

                public zzl(IOoil1iiIilo iOoil1iiIilo) {
/* 2 */             super(3, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 9 */             zzl zzlVar = new zzl((IOoil1iiIilo) obj3);
/* 12 */            zzlVar.zzc = (IlOil1iooOO0) obj;
/* 14 */            zzlVar.zzb = (Throwable) obj2;
/* 18 */            return zzlVar.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             if (i == 0) {
/* 13 */                IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.zzc;
/* 27 */                SpeechRecognizerResponse.ErrorResponse errorResponse = new SpeechRecognizerResponse.ErrorResponse(new GenAiException((Throwable) this.zzb, 0));
/* 31 */                this.zzc = null;
/* 34 */                this.zza = 1;
/* 40 */                if (ilOil1iooOO0.emit(errorResponse, this) == ii0111o) {
/* 42 */                    return ii0111o;
                        }
                    }
/* 43 */            return OoiIlOl1iI.I00000oIO;
                }
            }
