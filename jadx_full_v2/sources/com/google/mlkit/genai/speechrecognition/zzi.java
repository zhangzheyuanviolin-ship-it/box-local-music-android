            package com.google.mlkit.genai.speechrecognition;

            import android.os.SystemClock;
            import com.google.android.gms.internal.mlkit_genai_speech.zzabg;
            import com.google.android.gms.internal.mlkit_genai_speech.zzeq;
            import com.google.android.gms.internal.mlkit_genai_speech.zzxp;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizerResponse;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            import p000.I000II;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1iooOO0;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            public final class zzi implements IlOil1iooOO0 {
                final IlOil1iooOO0 zza;
                final SpeechRecognizer zzb;
                final AtomicBoolean zzc;
                final zzabg zzd;
                final long zze;
                final AtomicInteger zzf;
                final AtomicInteger zzg;
                final AtomicInteger zzh;
                final AtomicReference zzi;

                public zzi(IlOil1iooOO0 ilOil1iooOO0, SpeechRecognizer speechRecognizer, AtomicBoolean atomicBoolean, zzabg zzabgVar, long j, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, AtomicReference atomicReference) {
/* 1 */             this.zzb = speechRecognizer;
/* 3 */             this.zzc = atomicBoolean;
/* 5 */             this.zzd = zzabgVar;
/* 7 */             this.zze = j;
/* 9 */             this.zzf = atomicInteger;
/* 11 */            this.zzg = atomicInteger2;
/* 13 */            this.zzh = atomicInteger3;
/* 15 */            this.zzi = atomicReference;
/* 17 */            this.zza = ilOil1iooOO0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
                
                    if (r0.invoke(r2) == r3) goto L79;
                 */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    zzh zzhVar;
                    SpeechRecognizerResponse errorResponse;
                    String str;
                    SpeechRecognizerResponse finalTextResponse;
/* 7 */             if (iOoil1iiIilo instanceof zzh) {
/* 10 */                zzhVar = (zzh) iOoil1iiIilo;
/* 12 */                int i = zzhVar.zzb;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    zzhVar.zzb = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    zzhVar = new zzh(this, iOoil1iiIilo);
                        }
                    }
/* 29 */            Object obj2 = zzhVar.zza;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = zzhVar.zzb;
/* 45 */            if (i2 != 0) {
/* 47 */                if (i2 != 1) {
/* 49 */                    if (i2 == 2) {
/* 51 */                        lIoii1l01l0i.I00000oOI(obj2);
/* 382 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 58 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 41 */                    return null;
                        }
/* 64 */                errorResponse = (SpeechRecognizerResponse) zzhVar.zzd;
/* 66 */                lIoii1l01l0i.I00000oOI(obj2);
/* 325 */               if (errorResponse instanceof SpeechRecognizerResponse.ErrorResponse) {
/* 327 */                   AtomicReference atomicReference = this.zzi;
/* 335 */                   int errorCode = ((SpeechRecognizerResponse.ErrorResponse) errorResponse).getE().getErrorCode();
/* 361 */                   atomicReference.set(errorCode != 7 ? errorCode != 8 ? errorCode != 9 ? errorCode != 27 ? zzxp.UNKNOWN_ERROR : zzxp.SAPI_PER_APP_BATTERY_USE_QUOTA_EXCEEDED : zzxp.SAPI_BUSY : zzxp.SAPI_NOT_AVAILABLE : zzxp.SAPI_CANCELLED);
/* 1 */                     Function1 function1 = this.zzb.zzk;
/* 370 */                   zzhVar.zzd = null;
/* 373 */                   zzhVar.zzb = 2;
                        }
/* 382 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 71 */            lIoii1l01l0i.I00000oOI(obj2);
/* 74 */            IlOil1iooOO0 ilOil1iooOO0 = this.zza;
/* 78 */            zzeq zzeqVar = (zzeq) obj;
/* 85 */            if (zzeqVar.zzi()) {
/* 97 */                finalTextResponse = new SpeechRecognizerResponse.PartialTextResponse(zzeqVar.zzc().zzd());
                    } else {
/* 107 */               if (!zzeqVar.zzh()) {
/* 132 */                   if (zzeqVar.zzd().zze() == 6) {
                                int iZzd = zzeqVar.zzd().zzd() - 1;
/* 158 */                       int i3 = iZzd != 8 ? iZzd != 9 ? iZzd != 11 ? 0 : 27 : 7 : 9;
                                switch (zzeqVar.zzd().zzd()) {
                                    case 1:
/* 207 */                               str = "ERROR_TYPE_UNKNOWN";
                                        break;
                                    case 2:
/* 204 */                               str = "ERROR_TYPE_INVALID_REQUEST";
                                        break;
                                    case 3:
/* 201 */                               str = "ERROR_TYPE_NO_SPEECH_DETECTED";
                                        break;
                                    case 4:
/* 198 */                               str = "ERROR_TYPE_NETWORK";
                                        break;
                                    case 5:
/* 195 */                               str = "ERROR_TYPE_INSUFFICIENT_PERMISSION";
                                        break;
                                    case 6:
/* 192 */                               str = "ERROR_TYPE_MIC_BUSY";
                                        break;
                                    case 7:
/* 189 */                               str = "ERROR_TYPE_AUDIO_BUFFER_OVERFLOW";
                                        break;
                                    case 8:
/* 186 */                               str = "ERROR_TYPE_SODA";
                                        break;
                                    case 9:
/* 183 */                               str = "ERROR_TYPE_RECOGNIZER_BUSY";
                                        break;
                                    case 10:
/* 180 */                               str = "ERROR_TYPE_CANCELLED";
                                        break;
                                    case 11:
/* 177 */                               str = "ERROR_TYPE_AICORE_NOT_ENABLED_RUNTIME_LIMITS";
                                        break;
                                    default:
/* 174 */                               str = "ERROR_TYPE_AICORE_APP_QUOTA";
                                        break;
                                }
/* 218 */                       errorResponse = new SpeechRecognizerResponse.ErrorResponse(new GenAiException("Speech recognition engine is closed due to internal error: ".concat(str), (Throwable) null, i3));
                            } else {
/* 250 */                       errorResponse = zzeqVar.zzg().zzc().zzf() ? new SpeechRecognizerResponse.ErrorResponse(new GenAiException("Speech recognition engine is busy, please retry later", (Throwable) null, 9)) : null;
                            }
/* 251 */                   if (errorResponse != null) {
/* 255 */                       if (errorResponse instanceof SpeechRecognizerResponse.PartialTextResponse) {
/* 263 */                           if (this.zzc.compareAndSet(true, false)) {
/* 279 */                               this.zzd.zzc(new Long(SystemClock.elapsedRealtime() - this.zze));
                                    }
/* 284 */                           this.zzf.getAndAdd(1);
                                } else if (errorResponse instanceof SpeechRecognizerResponse.FinalTextResponse) {
/* 294 */                           this.zzg.getAndAdd(1);
/* 310 */                           this.zzh.getAndAdd(((SpeechRecognizerResponse.FinalTextResponse) errorResponse).getText().length());
                                }
/* 313 */                       zzhVar.zzd = errorResponse;
/* 315 */                       zzhVar.zzb = 1;
/* 321 */                       if (ilOil1iooOO0.emit(errorResponse, zzhVar) != ii0111o) {
/* 325 */                           if (errorResponse instanceof SpeechRecognizerResponse.ErrorResponse) {
                                    }
                                }
/* 381 */                       return ii0111o;
                            }
/* 382 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 119 */               finalTextResponse = new SpeechRecognizerResponse.FinalTextResponse(zzeqVar.zza().zzd(0));
                    }
/* 100 */           errorResponse = finalTextResponse;
/* 251 */           if (errorResponse != null) {
                    }
/* 382 */           return OoiIlOl1iI.I00000oIO;
                }
            }
