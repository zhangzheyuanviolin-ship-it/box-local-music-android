            package com.google.mlkit.genai.speechrecognition;

            import com.google.android.gms.internal.mlkit_genai_speech.zzabg;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1ii;
            import p000.IlOil1iooOO0;
            import p000.IlliIl1l11O;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            public final class zzj extends Oll0io implements IlliIl1l11O {
                int zza;
                final IlOil1ii zzb;
                final SpeechRecognizer zzc;
                final AtomicBoolean zzd;
                final zzabg zze;
                final long zzf;
                final AtomicInteger zzg;
                final AtomicInteger zzh;
                final AtomicInteger zzi;
                final AtomicReference zzj;
                private Object zzk;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzj(IlOil1ii ilOil1ii, IOoil1iiIilo iOoil1iiIilo, SpeechRecognizer speechRecognizer, AtomicBoolean atomicBoolean, zzabg zzabgVar, long j, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, AtomicReference atomicReference) {
/* 20 */            super(2, iOoil1iiIilo);
/* 1 */             this.zzb = ilOil1ii;
/* 3 */             this.zzc = speechRecognizer;
/* 5 */             this.zzd = atomicBoolean;
/* 7 */             this.zze = zzabgVar;
/* 9 */             this.zzf = j;
/* 11 */            this.zzg = atomicInteger;
/* 13 */            this.zzh = atomicInteger2;
/* 15 */            this.zzi = atomicInteger3;
/* 17 */            this.zzj = atomicReference;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 22 */            zzj zzjVar = new zzj(this.zzb, iOoil1iiIilo, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
/* 25 */            zzjVar.zzk = obj;
/* 89 */            return zzjVar;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzj) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             if (i == 0) {
/* 14 */                IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.zzk;
/* 16 */                IlOil1ii ilOil1ii = this.zzb;
/* 36 */                zzi zziVar = new zzi(ilOil1iooOO0, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
/* 40 */                this.zza = 1;
/* 46 */                if (ilOil1ii.I00000oIO(zziVar, this) == ii0111o) {
/* 48 */                    return ii0111o;
                        }
                    }
/* 49 */            return OoiIlOl1iI.I00000oIO;
                }
            }
