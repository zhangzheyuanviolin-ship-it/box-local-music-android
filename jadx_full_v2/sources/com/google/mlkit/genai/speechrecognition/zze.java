            package com.google.mlkit.genai.speechrecognition;

            import com.google.android.gms.internal.mlkit_genai_speech.zzco;
            import com.google.android.gms.internal.mlkit_genai_speech.zzct;
            import com.google.mlkit.genai.common.DownloadStatus;
            import com.google.mlkit.genai.common.GenAiException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.I000II;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IlOil1iooOO0;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            public final class zze implements IlOil1iooOO0 {
                final IlOil1iooOO0 zza;
                final AtomicBoolean zzb;

                public zze(IlOil1iooOO0 ilOil1iooOO0, AtomicBoolean atomicBoolean) {
/* 1 */             this.zzb = atomicBoolean;
/* 3 */             this.zza = ilOil1iooOO0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
                
                    if (r11.emit(r9, r0) != r1) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
                
                    if (r9.emit(r11, r0) != r1) goto L42;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
                
                    if (r11.emit(r10, r0) == r1) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
                
                    if (r11.emit(r9, r0) == r1) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
                
                    if (r11.emit(r9, r0) == r1) goto L41;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    zzd zzdVar;
                    zzct zzctVar;
                    IlOil1iooOO0 ilOil1iooOO0;
/* 3 */             if (iOoil1iiIilo instanceof zzd) {
/* 6 */                 zzdVar = (zzd) iOoil1iiIilo;
/* 8 */                 int i = zzdVar.zzb;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzdVar.zzb = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzdVar = new zzd(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj2 = zzdVar.zza;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = zzdVar.zzb;
/* 37 */            if (i2 == 0) {
/* 70 */                lIoii1l01l0i.I00000oOI(obj2);
/* 73 */                IlOil1iooOO0 ilOil1iooOO02 = this.zza;
/* 75 */                zzctVar = (zzct) obj;
/* 81 */                if (zzctVar.zzf()) {
/* 90 */                    if (this.zzb.compareAndSet(false, true)) {
/* 102 */                       DownloadStatus.DownloadStarted downloadStarted = new DownloadStatus.DownloadStarted(zzctVar.zzc().zza());
/* 105 */                       zzdVar.zze = zzctVar;
/* 107 */                       zzdVar.zzd = ilOil1iooOO02;
/* 109 */                       zzdVar.zzb = 1;
                            }
/* 117 */                   ilOil1iooOO0 = ilOil1iooOO02;
/* 128 */                   DownloadStatus.DownloadProgress downloadProgress = new DownloadStatus.DownloadProgress(zzctVar.zzc().zzc());
/* 131 */                   zzdVar.zze = null;
/* 133 */                   zzdVar.zzd = null;
/* 135 */                   zzdVar.zzb = 2;
                        } else {
/* 148 */                   zzco zzcoVarZza = zzctVar.zza().zza();
/* 152 */                   int iOrdinal = zzcoVarZza.ordinal();
/* 156 */                   if (iOrdinal == 1) {
/* 216 */                       DownloadStatus.DownloadCompleted downloadCompleted = DownloadStatus.DownloadCompleted.INSTANCE;
/* 218 */                       zzdVar.zzb = 3;
                            } else if (iOrdinal != 2) {
/* 183 */                       DownloadStatus.DownloadFailed downloadFailed = new DownloadStatus.DownloadFailed(new GenAiException("Model download failed with reason: ".concat(String.valueOf(zzcoVarZza.name())), (Throwable) null, 8));
/* 186 */                       zzdVar.zzb = 5;
                            } else {
/* 204 */                       DownloadStatus.DownloadFailed downloadFailed2 = new DownloadStatus.DownloadFailed(new GenAiException("Model download is not completed yet and will be retried automatically", (Throwable) null, 8));
/* 207 */                       zzdVar.zzb = 4;
                            }
                        }
/* 226 */               return ii0111o;
                    }
/* 39 */            if (i2 != 1) {
/* 41 */                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
/* 49 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 227 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 56 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                return null;
                    }
/* 62 */            ilOil1iooOO0 = (IlOil1iooOO0) zzdVar.zzd;
/* 64 */            zzctVar = zzdVar.zze;
/* 66 */            lIoii1l01l0i.I00000oOI(obj2);
/* 128 */           DownloadStatus.DownloadProgress downloadProgress2 = new DownloadStatus.DownloadProgress(zzctVar.zzc().zzc());
/* 131 */           zzdVar.zze = null;
/* 133 */           zzdVar.zzd = null;
/* 135 */           zzdVar.zzb = 2;
                }
            }
