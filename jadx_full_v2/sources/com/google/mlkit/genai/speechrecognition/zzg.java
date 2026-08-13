            package com.google.mlkit.genai.speechrecognition;

            import com.google.mlkit.genai.common.DownloadStatus;
            import com.google.mlkit.genai.common.GenAiException;
            import kotlin.jvm.functions.Function3;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1iooOO0;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzg extends Oll0io implements Function3 {
                int zza;
                Object zzb;
                private Object zzc;

                public zzg(IOoil1iiIilo iOoil1iiIilo) {
/* 2 */             super(3, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 9 */             zzg zzgVar = new zzg((IOoil1iiIilo) obj3);
/* 12 */            zzgVar.zzc = (IlOil1iooOO0) obj;
/* 14 */            zzgVar.zzb = (Throwable) obj2;
/* 18 */            return zzgVar.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             if (i == 0) {
/* 13 */                IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.zzc;
/* 28 */                DownloadStatus.DownloadFailed downloadFailed = new DownloadStatus.DownloadFailed(new GenAiException((Throwable) this.zzb, 8));
/* 32 */                this.zzc = null;
/* 35 */                this.zza = 1;
/* 41 */                if (ilOil1iooOO0.emit(downloadFailed, this) == ii0111o) {
/* 43 */                    return ii0111o;
                        }
                    }
/* 44 */            return OoiIlOl1iI.I00000oIO;
                }
            }
