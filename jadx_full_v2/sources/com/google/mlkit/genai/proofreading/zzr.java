            package com.google.mlkit.genai.proofreading;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import p000.iOiI1oOo1l;
            import p000.iOioIII1i;
            import p000.ii0IiOii;
            
            final class zzr implements ii0IiOii {
                final DownloadCallback zza;

                public zzr(Proofreader proofreader, DownloadCallback downloadCallback) {
/* 1 */             this.zza = downloadCallback;
                }

                @Override
                public final void zza(iOioIII1i ioioiii1i) {
/* 3 */             this.zza.onDownloadCompleted();
                }

                @Override
                public final void zzb(iOioIII1i ioioiii1i, int i, iOiI1oOo1l ioii1ooo1l) {
/* 10 */            this.zza.onDownloadFailed(new GenAiException(ioii1ooo1l, ioii1ooo1l.I00iOIl));
                }

                @Override
                public final void zzc(iOioIII1i ioioiii1i, long j) {
/* 3 */             this.zza.onDownloadProgress(j);
                }

                @Override
                public final void zzd(iOioIII1i ioioiii1i, long j) {
/* 3 */             this.zza.onDownloadStarted(j);
                }
            }
