            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            
/* 27 */    public final class Iloo00O1 implements DownloadCallback {
                public IIoOoIol0Io0 I00000oIO;

                @Override
                public final void onDownloadCompleted() {
/* 1 */             IIoOoIol0Io0 iIoOoIol0Io0 = this.I00000oIO;
/* 9 */             if (iIoOoIol0Io0.I0010o() instanceof OIIoiiOIil00) {
/* 13 */                iIoOoIol0Io0.resumeWith(OoiIlOl1iI.I00000oIO);
                    }
                }

                @Override
                public final void onDownloadFailed(GenAiException genAiException) {
/* 1 */             IIoOoIol0Io0 iIoOoIol0Io0 = this.I00000oIO;
/* 9 */             if (iIoOoIol0Io0.I0010o() instanceof OIIoiiOIil00) {
/* 15 */                iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(genAiException));
                    }
                }

                @Override
/* 28 */        public final void onDownloadProgress(long j) {
                }

                @Override
/* 28 */        public final void onDownloadStarted(long j) {
                }
            }
