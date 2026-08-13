            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.DownloadStatus;
            import com.google.mlkit.genai.common.GenAiException;
            
            public final class o100I0Oo0il implements DownloadCallback {
                public OOIoOo0O I00000oIO;

                @Override
                public final void onDownloadCompleted() {
/* 5 */             OOIoO0IIOO0 oOIoO0IIOO0 = (OOIoO0IIOO0) this.I00000oIO;
/* 7 */             oOIoO0IIOO0.I000lI(DownloadStatus.DownloadCompleted.INSTANCE);
/* 11 */            oOIoO0IIOO0.I0001Ioi1lo(null);
                }

                @Override
                public final void onDownloadFailed(GenAiException genAiException) {
/* 3 */             DownloadStatus.DownloadFailed downloadFailed = new DownloadStatus.DownloadFailed(genAiException);
/* 8 */             OOIoO0IIOO0 oOIoO0IIOO0 = (OOIoO0IIOO0) this.I00000oIO;
/* 10 */            oOIoO0IIOO0.I000lI(downloadFailed);
/* 13 */            oOIoO0IIOO0.I0001Ioi1lo(genAiException);
                }

                @Override
                public final void onDownloadProgress(long j) {
/* 10 */            ((OOIoO0IIOO0) this.I00000oIO).I000lI(new DownloadStatus.DownloadProgress(j));
                }

                @Override
                public final void onDownloadStarted(long j) {
/* 10 */            ((OOIoO0IIOO0) this.I00000oIO).I000lI(new DownloadStatus.DownloadStarted(j));
                }
            }
