            package com.google.mlkit.genai.imagedescription;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import p000.iOIIOoOoii;
            import p000.iOIoil;
            import p000.iOlloil01Ilo;
            
            final class zzq implements iOlloil01Ilo {
                final DownloadCallback zza;

                public zzq(ImageDescriber imageDescriber, DownloadCallback downloadCallback) {
/* 1 */             this.zza = downloadCallback;
                }

                @Override
                public final void zza(iOIoil ioioil) {
/* 3 */             this.zza.onDownloadCompleted();
                }

                @Override
                public final void zzb(iOIoil ioioil, int i, iOIIOoOoii ioiiooooii) {
/* 10 */            this.zza.onDownloadFailed(new GenAiException(ioiiooooii, ioiiooooii.I00iOIl));
                }

                @Override
                public final void zzc(iOIoil ioioil, long j) {
/* 3 */             this.zza.onDownloadProgress(j);
                }

                @Override
                public final void zzd(iOIoil ioioil, long j) {
/* 3 */             this.zza.onDownloadStarted(j);
                }
            }
