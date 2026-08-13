            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            
            public final class o0oOOOIlO implements DownloadCallback {
                public boolean I00000oIO;
                public DownloadCallback I00000oOI;
                public IOi10loi I0000Il00O;
                public o0oi0ioiO I0000O;
                public iOil1lO10l I0000oI00;
                public IllOOo00lI I0001Ioi1lo;

                @Override
                public final void onDownloadCompleted() {
/* 3 */             this.I0001Ioi1lo.invoke();
                }

                @Override
                public final void onDownloadFailed(GenAiException genAiException) {
/* 1 */             IOi10loi iOi10loi = this.I0000Il00O;
/* 3 */             if (iOi10loi != null) {
/* 5 */                 iOi10loi.I00iIO(genAiException);
                    }
/* 14 */            this.I0000O.I0000Il00O(this.I0000oI00, genAiException, this.I00000oOI);
/* 19 */            this.I0001Ioi1lo.invoke();
                }

                @Override
                public final void onDownloadProgress(long j) {
/* 3 */             if (this.I00000oIO) {
/* 7 */                 this.I00000oOI.onDownloadProgress(j);
                    }
                }

                @Override
                public final void onDownloadStarted(long j) {
/* 3 */             if (this.I00000oIO) {
/* 7 */                 this.I00000oOI.onDownloadStarted(j);
                    }
/* 10 */            IOi10loi iOi10loi = this.I0000Il00O;
/* 12 */            if (iOi10loi != null) {
/* 16 */                iOi10loi.I00O10llo(OoiIlOl1iI.I00000oIO);
                    }
                }
            }
