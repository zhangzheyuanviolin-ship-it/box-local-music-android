            package com.google.mlkit.genai.summarization;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import p000.iOlI0O0iIiO;
            import p000.iOli1OIoI0o;
            import p000.ii01iI1oI1l;
            
            final class zzp implements ii01iI1oI1l {
                final DownloadCallback zza;

                public zzp(Summarizer summarizer, DownloadCallback downloadCallback) {
/* 1 */             this.zza = downloadCallback;
                }

                @Override
                public final void zza(iOli1OIoI0o ioli1oioi0o) {
/* 3 */             this.zza.onDownloadCompleted();
                }

                @Override
                public final void zzb(iOli1OIoI0o ioli1oioi0o, int i, iOlI0O0iIiO ioli0o0iiio) {
/* 10 */            this.zza.onDownloadFailed(new GenAiException(ioli0o0iiio, ioli0o0iiio.I00iOIl));
                }

                @Override
                public final void zzc(iOli1OIoI0o ioli1oioi0o, long j) {
/* 3 */             this.zza.onDownloadProgress(j);
                }

                @Override
                public final void zzd(iOli1OIoI0o ioli1oioi0o, long j) {
/* 3 */             this.zza.onDownloadStarted(j);
                }
            }
