            package com.google.mlkit.genai.rewriting;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import p000.iOiIOO1ll;
            import p000.iOioO0lIOo;
            import p000.ii0IiiI;
            
            final class zzr implements ii0IiiI {
                final DownloadCallback zza;

                public zzr(Rewriter rewriter, DownloadCallback downloadCallback) {
/* 1 */             this.zza = downloadCallback;
                }

                @Override
                public final void zza(iOioO0lIOo ioioo0lioo) {
/* 3 */             this.zza.onDownloadCompleted();
                }

                @Override
                public final void zzb(iOioO0lIOo ioioo0lioo, int i, iOiIOO1ll ioiioo1ll) {
/* 10 */            this.zza.onDownloadFailed(new GenAiException(ioiioo1ll, ioiioo1ll.I00iOIl));
                }

                @Override
                public final void zzc(iOioO0lIOo ioioo0lioo, long j) {
/* 3 */             this.zza.onDownloadProgress(j);
                }

                @Override
                public final void zzd(iOioO0lIOo ioioo0lioo, long j) {
/* 3 */             this.zza.onDownloadStarted(j);
                }
            }
