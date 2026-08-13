            package com.google.mlkit.genai.speechrecognition;

            import com.google.android.gms.internal.mlkit_genai_speech.zzabg;
            import com.google.android.gms.internal.mlkit_genai_speech.zzach;
            import com.google.android.gms.internal.mlkit_genai_speech.zzxp;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizerResponse;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function3;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1iooOO0;
            import p000.OIoi0IIoi;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzk extends Oll0io implements Function3 {
                int zza;
                Object zzb;
                final zzabg zzc;
                final zzach zzd;
                final AtomicReference zze;
                final SpeechRecognizer zzf;
                final long zzg;
                final AtomicInteger zzh;
                final AtomicInteger zzi;
                final AtomicInteger zzj;
                private Object zzk;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzk(zzabg zzabgVar, zzach zzachVar, AtomicReference atomicReference, SpeechRecognizer speechRecognizer, long j, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            super(3, iOoil1iiIilo);
/* 1 */             this.zzc = zzabgVar;
/* 3 */             this.zzd = zzachVar;
/* 5 */             this.zze = atomicReference;
/* 7 */             this.zzf = speechRecognizer;
/* 9 */             this.zzg = j;
/* 11 */            this.zzh = atomicInteger;
/* 13 */            this.zzi = atomicInteger2;
/* 15 */            this.zzj = atomicInteger3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 26 */            zzk zzkVar = new zzk(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, (IOoil1iiIilo) obj3);
/* 29 */            zzkVar.zzk = (IlOil1iooOO0) obj;
/* 31 */            zzkVar.zzb = (Throwable) obj2;
/* 35 */            return zzkVar.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    zzxp zzxpVar;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             if (i == 0) {
/* 13 */                IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.zzk;
/* 17 */                Throwable th = (Throwable) this.zzb;
/* 25 */                OIoi0IIoi oIoi0IIoi = new OIoi0IIoi(this.zzc, this.zzd);
/* 28 */                if ((th == null || (zzxpVar = zzxp.SAPI_RESPONSE_GENERATION_ERROR) == null) && (zzxpVar = (zzxp) this.zze.get()) == null) {
/* 47 */                    zzxpVar = zzxp.NO_ERROR;
                        }
/* 73 */                SpeechRecognizer.zzd(this.zzf, oIoi0IIoi, this.zzg, this.zzh.get(), this.zzi.get(), this.zzj.get(), zzxpVar);
/* 76 */                if (th == null) {
/* 78 */                    SpeechRecognizerResponse.CompletedResponse completedResponse = SpeechRecognizerResponse.CompletedResponse.INSTANCE;
/* 81 */                    this.zzk = null;
/* 84 */                    this.zza = 1;
/* 90 */                    if (ilOil1iooOO0.emit(completedResponse, this) == ii0111o) {
/* 92 */                        return ii0111o;
                            }
                        }
                    }
/* 93 */            return OoiIlOl1iI.I00000oIO;
                }
            }
